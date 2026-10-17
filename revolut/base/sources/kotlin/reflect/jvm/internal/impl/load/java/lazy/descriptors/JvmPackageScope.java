package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ajm.d;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class JvmPackageScope implements MemberScope {
    public static final /* synthetic */ KProperty[] e = {o0.f186429a.j(new h0(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f186961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaPackageFragment f186962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyJavaPackageScope f186963c;
    public final NotNullLazyValue d;

    public JvmPackageScope(@NotNull LazyJavaResolverContext c2, @NotNull JavaPackage jPackage, @NotNull LazyJavaPackageFragment packageFragment) {
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(jPackage, "jPackage");
        Intrinsics.checkNotNullParameter(packageFragment, "packageFragment");
        this.f186961a = c2;
        this.f186962b = packageFragment;
        this.f186963c = new LazyJavaPackageScope(c2, jPackage, packageFragment);
        this.d = c2.getStorageManager().createLazyValue(new d(this, 27));
    }

    public final MemberScope[] a() {
        return (MemberScope[]) StorageKt.getValue(this.d, this, e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        Set<Name> setFlatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(kotlin.collections.d.D(a()));
        if (setFlatMapClassifierNamesOrNull == null) {
            return null;
        }
        setFlatMapClassifierNamesOrNull.addAll(this.f186963c.getClassifierNames());
        return setFlatMapClassifierNamesOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo3796getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        ClassDescriptor classDescriptorMo3796getContributedClassifier = this.f186963c.mo3796getContributedClassifier(name, location);
        if (classDescriptorMo3796getContributedClassifier != null) {
            return classDescriptorMo3796getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : a()) {
            ClassifierDescriptor classifierDescriptorMo3796getContributedClassifier = memberScope.mo3796getContributedClassifier(name, location);
            if (classifierDescriptorMo3796getContributedClassifier != null) {
                if (!(classifierDescriptorMo3796getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo3796getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo3796getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo3796getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        MemberScope[] memberScopeArrA = a();
        Collection<DeclarationDescriptor> contributedDescriptors = this.f186963c.getContributedDescriptors(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrA) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors == null ? zhm.h0.f322473a : contributedDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        MemberScope[] memberScopeArrA = a();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = this.f186963c.getContributedFunctions(name, location);
        int length = memberScopeArrA.length;
        int i = 0;
        Collection collection = contributedFunctions;
        while (i < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrA[i].getContributedFunctions(name, location));
            i++;
            collection = collectionConcat;
        }
        return collection == null ? zhm.h0.f322473a : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        MemberScope[] memberScopeArrA = a();
        Collection<? extends PropertyDescriptor> contributedVariables = this.f186963c.getContributedVariables(name, location);
        int length = memberScopeArrA.length;
        int i = 0;
        Collection collection = contributedVariables;
        while (i < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrA[i].getContributedVariables(name, location));
            i++;
            collection = collectionConcat;
        }
        return collection == null ? zhm.h0.f322473a : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArrA = a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrA) {
            a0.x(memberScope.getFunctionNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f186963c.getFunctionNames());
        return linkedHashSet;
    }

    @NotNull
    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.f186963c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArrA = a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrA) {
            a0.x(memberScope.getVariableNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f186963c.getVariableNames());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo3799recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        UtilsKt.record(this.f186961a.getComponents().getLookupTracker(), location, this.f186962b, name);
    }

    @NotNull
    public String toString() {
        return "scope for " + this.f186962b;
    }
}
