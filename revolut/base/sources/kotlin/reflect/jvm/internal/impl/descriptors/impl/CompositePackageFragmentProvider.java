package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import yhm.d;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f186579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186580b;

    public CompositePackageFragmentProvider(@NotNull List<? extends PackageFragmentProvider> providers, @NotNull String debugName) {
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(debugName, "debugName");
        this.f186579a = providers;
        this.f186580b = debugName;
        providers.size();
        d0.i1(providers).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(@NotNull FqName fqName, @NotNull Collection<PackageFragmentDescriptor> packageFragments) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        Iterator it8 = this.f186579a.iterator();
        while (it8.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible((PackageFragmentProvider) it8.next(), fqName, packageFragments);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    @d
    public List<PackageFragmentDescriptor> getPackageFragments(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = this.f186579a.iterator();
        while (it8.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible((PackageFragmentProvider) it8.next(), fqName, arrayList);
        }
        return d0.d1(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @NotNull
    public Collection<FqName> getSubPackagesOf(@NotNull FqName fqName, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it8 = this.f186579a.iterator();
        while (it8.hasNext()) {
            hashSet.addAll(((PackageFragmentProvider) it8.next()).getSubPackagesOf(fqName, nameFilter));
        }
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        List list = this.f186579a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (!PackageFragmentProviderKt.isEmpty((PackageFragmentProvider) it8.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public String toString() {
        return this.f186580b;
    }
}
