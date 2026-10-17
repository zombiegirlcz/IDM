package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import pjm.f;
import pjm.m;
import zhm.a0;
import zhm.d0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    public static final /* synthetic */ int o = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final JavaClass f187010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JavaClassDescriptor f187011n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(@NotNull LazyJavaResolverContext c2, @NotNull JavaClass jClass, @NotNull JavaClassDescriptor ownerDescriptor) {
        super(c2);
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        this.f187010m = jClass;
        this.f187011n = ownerDescriptor;
    }

    public static PropertyDescriptor l(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(w.t(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            Intrinsics.h(propertyDescriptor2);
            arrayList.add(l(propertyDescriptor2));
        }
        return (PropertyDescriptor) d0.K0(d0.U(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set a(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return h0.f322473a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void b(Name name, ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateStaticFunctions(this.f187011n, name, result, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeFunctionNames(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set setH1 = d0.h1(((DeclaredMemberIndex) this.d.invoke()).getMethodNames());
        JavaClassDescriptor javaClassDescriptor = this.f187011n;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = h0.f322473a;
        }
        setH1.addAll(functionNames);
        if (this.f187010m.isEnum()) {
            setH1.addAll(v.k(StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES));
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        setH1.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getStaticFunctionNames(javaClassDescriptor, lazyJavaResolverContext));
        return setH1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f187010m, f.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void d(LinkedHashSet result, Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        JavaClassDescriptor javaClassDescriptor = this.f187011n;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Collection collectionI1 = parentJavaStaticClassScope == null ? h0.f322473a : d0.i1(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, collectionI1, result, this.f187011n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
        result.addAll(collectionResolveOverridesForStaticMembers);
        if (this.f187010m.isEnum()) {
            if (Intrinsics.f(name, StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(javaClassDescriptor);
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (Intrinsics.f(name, StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(javaClassDescriptor);
                Intrinsics.checkNotNullExpressionValue(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(...)");
                result.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void e(Name name, ArrayList result) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        cjm.f fVar = new cjm.f(name, 1);
        JavaClassDescriptor javaClassDescriptor = this.f187011n;
        DFS.dfs(u.c(javaClassDescriptor), m.f236903a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, linkedHashSet, fVar));
        boolean zIsEmpty = result.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : linkedHashSet) {
                PropertyDescriptor propertyDescriptorL = l((PropertyDescriptor) obj2);
                Object arrayList = linkedHashMap.get(propertyDescriptorL);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(propertyDescriptorL, arrayList);
                }
                ((List) arrayList).add(obj2);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it8 = linkedHashMap.entrySet().iterator();
            while (it8.hasNext()) {
                Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) ((Map.Entry) it8.next()).getValue(), result, this.f187011n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
                Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
                a0.x(collectionResolveOverridesForStaticMembers, arrayList2);
            }
            result.addAll(arrayList2);
        } else {
            Collection collectionResolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, linkedHashSet, result, this.f187011n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
            Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForStaticMembers2, "resolveOverridesForStaticMembers(...)");
            result.addAll(collectionResolveOverridesForStaticMembers2);
        }
        if (this.f187010m.isEnum() && Intrinsics.f(name, StandardNames.ENUM_ENTRIES)) {
            CollectionsKt.addIfNotNull(result, DescriptorFactory.createEnumEntriesProperty(javaClassDescriptor));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set f(DescriptorKindFilter kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Set setH1 = d0.h1(((DeclaredMemberIndex) this.d.invoke()).getFieldNames());
        f fVar = f.e;
        JavaClassDescriptor javaClassDescriptor = this.f187011n;
        DFS.dfs(u.c(javaClassDescriptor), m.f236903a, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, setH1, fVar));
        if (this.f187010m.isEnum()) {
            setH1.add(StandardNames.ENUM_ENTRIES);
        }
        return setH1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo3796getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.f187011n;
    }
}
