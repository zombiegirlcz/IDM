package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public class SubpackagesScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptor f186665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f186666b;

    public SubpackagesScope(@NotNull ModuleDescriptor moduleDescriptor, @NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        this.f186665a = moduleDescriptor;
        this.f186666b = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return h0.f322473a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getPACKAGES_MASK())) {
            return f0.f322471a;
        }
        FqName fqName = this.f186666b;
        if (fqName.isRoot() && kindFilter.getExcludes().contains(DescriptorKindExclude.TopLevelPackages.INSTANCE)) {
            return f0.f322471a;
        }
        ModuleDescriptor moduleDescriptor = this.f186665a;
        Collection<FqName> subPackagesOf = moduleDescriptor.getSubPackagesOf(fqName, nameFilter);
        ArrayList arrayList = new ArrayList(subPackagesOf.size());
        Iterator<FqName> it8 = subPackagesOf.iterator();
        while (it8.hasNext()) {
            Name name = it8.next().shortName();
            if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                Intrinsics.checkNotNullParameter(name, "name");
                PackageViewDescriptor packageViewDescriptor = null;
                if (!name.isSpecial()) {
                    PackageViewDescriptor packageViewDescriptor2 = moduleDescriptor.getPackage(fqName.child(name));
                    if (!packageViewDescriptor2.isEmpty()) {
                        packageViewDescriptor = packageViewDescriptor2;
                    }
                }
                CollectionsKt.addIfNotNull(arrayList, packageViewDescriptor);
            }
        }
        return arrayList;
    }

    @NotNull
    public String toString() {
        return "subpackages of " + this.f186666b + " from " + this.f186665a;
    }
}
