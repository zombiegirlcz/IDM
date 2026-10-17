package pjm;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaScope f236897b;

    public /* synthetic */ j(LazyJavaScope lazyJavaScope, int i) {
        this.f236896a = i;
        this.f236897b = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f236896a;
        LazyJavaScope lazyJavaScope = this.f236897b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = LazyJavaScope.f186998l;
                DescriptorKindFilter kindFilter = DescriptorKindFilter.ALL;
                Function1<Name, Boolean> nameFilter = MemberScope.Companion.getALL_NAME_FILTER();
                Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
                Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                    for (Name name : lazyJavaScope.a(kindFilter, nameFilter)) {
                        if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                            CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope.mo3796getContributedClassifier(name, noLookupLocation));
                        }
                    }
                }
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                    for (Name name2 : lazyJavaScope.computeFunctionNames(kindFilter, nameFilter)) {
                        if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope.getContributedFunctions(name2, noLookupLocation));
                        }
                    }
                }
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                    for (Name name3 : lazyJavaScope.f(kindFilter)) {
                        if (((Boolean) nameFilter.invoke(name3)).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope.getContributedVariables(name3, noLookupLocation));
                        }
                    }
                }
                return d0.d1(linkedHashSet);
            case 1:
                KProperty[] kPropertyArr2 = LazyJavaScope.f186998l;
                return lazyJavaScope.computeMemberIndex();
            case 2:
                KProperty[] kPropertyArr3 = LazyJavaScope.f186998l;
                return lazyJavaScope.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
            case 3:
                KProperty[] kPropertyArr4 = LazyJavaScope.f186998l;
                return lazyJavaScope.f(DescriptorKindFilter.VARIABLES);
            default:
                KProperty[] kPropertyArr5 = LazyJavaScope.f186998l;
                return lazyJavaScope.a(DescriptorKindFilter.CLASSIFIERS, null);
        }
    }
}
