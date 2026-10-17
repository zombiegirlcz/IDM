package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pjm.j;
import pjm.l;
import zhm.d0;
import zhm.f0;
import zhm.q;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class LazyJavaScope extends MemberScopeImpl {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f186998l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f186999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaScope f187000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f187001c;
    public final NotNullLazyValue d;
    public final MemoizedFunctionToNotNull e;
    public final MemoizedFunctionToNullable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f187002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final NotNullLazyValue f187003h;
    public final NotNullLazyValue i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final NotNullLazyValue f187004j;
    public final MemoizedFunctionToNotNull k;

    /* JADX INFO: loaded from: classes14.dex */
    public static final class MethodSignatureData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KotlinType f187005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KotlinType f187006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f187007c;
        public final List d;
        public final boolean e;
        public final List f;

        public MethodSignatureData(@NotNull KotlinType returnType, KotlinType kotlinType, @NotNull List<? extends ValueParameterDescriptor> valueParameters, @NotNull List<? extends TypeParameterDescriptor> typeParameters, boolean z, @NotNull List<String> errors) {
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
            Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f187005a = returnType;
            this.f187006b = kotlinType;
            this.f187007c = valueParameters;
            this.d = typeParameters;
            this.e = z;
            this.f = errors;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MethodSignatureData)) {
                return false;
            }
            MethodSignatureData methodSignatureData = (MethodSignatureData) obj2;
            return Intrinsics.f(this.f187005a, methodSignatureData.f187005a) && Intrinsics.f(this.f187006b, methodSignatureData.f187006b) && Intrinsics.f(this.f187007c, methodSignatureData.f187007c) && Intrinsics.f(this.d, methodSignatureData.d) && this.e == methodSignatureData.e && Intrinsics.f(this.f, methodSignatureData.f);
        }

        @NotNull
        public final List<String> getErrors() {
            return this.f;
        }

        public final boolean getHasStableParameterNames() {
            return this.e;
        }

        public final KotlinType getReceiverType() {
            return this.f187006b;
        }

        @NotNull
        public final KotlinType getReturnType() {
            return this.f187005a;
        }

        @NotNull
        public final List<TypeParameterDescriptor> getTypeParameters() {
            return this.d;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getValueParameters() {
            return this.f187007c;
        }

        public int hashCode() {
            int iHashCode = this.f187005a.hashCode() * 31;
            KotlinType kotlinType = this.f187006b;
            return this.f.hashCode() + a.c(p.a.d(p.a.d((iHashCode + (kotlinType == null ? 0 : kotlinType.hashCode())) * 31, 31, this.f187007c), 31, this.d), 31, this.e);
        }

        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("MethodSignatureData(returnType=");
            sb6.append(this.f187005a);
            sb6.append(", receiverType=");
            sb6.append(this.f187006b);
            sb6.append(", valueParameters=");
            sb6.append(this.f187007c);
            sb6.append(", typeParameters=");
            sb6.append(this.d);
            sb6.append(", hasStableParameterNames=");
            sb6.append(this.e);
            sb6.append(", errors=");
            return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f, sb6);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ResolvedValueParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f187008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f187009b;

        public ResolvedValueParameters(@NotNull List<? extends ValueParameterDescriptor> descriptors, boolean z) {
            Intrinsics.checkNotNullParameter(descriptors, "descriptors");
            this.f187008a = descriptors;
            this.f187009b = z;
        }

        @NotNull
        public final List<ValueParameterDescriptor> getDescriptors() {
            return this.f187008a;
        }

        public final boolean getHasSynthesizedNames() {
            return this.f187009b;
        }
    }

    static {
        h0 h0Var = new h0(LazyJavaScope.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0);
        p0 p0Var = o0.f186429a;
        f186998l = new KProperty[]{p0Var.j(h0Var), p.a.y(LazyJavaScope.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0, p0Var), p.a.y(LazyJavaScope.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0, p0Var)};
    }

    public LazyJavaScope(@NotNull LazyJavaResolverContext c2, LazyJavaScope lazyJavaScope) {
        Intrinsics.checkNotNullParameter(c2, "c");
        this.f186999a = c2;
        this.f187000b = lazyJavaScope;
        this.f187001c = c2.getStorageManager().createRecursionTolerantLazyValue(new j(this, 0), f0.f322471a);
        this.d = c2.getStorageManager().createLazyValue(new j(this, 1));
        this.e = c2.getStorageManager().createMemoizedFunction(new l(this, 0));
        this.f = c2.getStorageManager().createMemoizedFunctionWithNullableValues(new l(this, 1));
        int i = 2;
        this.f187002g = c2.getStorageManager().createMemoizedFunction(new l(this, i));
        this.f187003h = c2.getStorageManager().createLazyValue(new j(this, i));
        this.i = c2.getStorageManager().createLazyValue(new j(this, 3));
        this.f187004j = c2.getStorageManager().createLazyValue(new j(this, 4));
        this.k = c2.getStorageManager().createMemoizedFunction(new l(this, 3));
    }

    public static KotlinType c(JavaMethod method, LazyJavaResolverContext c2) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(c2, "c");
        return c2.getTypeResolver().transformJavaType(method.getReturnType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, method.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    public static ResolvedValueParameters k(LazyJavaResolverContext c2, FunctionDescriptorImpl functionDescriptorImpl, List jValueParameters) {
        Pair pair;
        Name name;
        Intrinsics.checkNotNullParameter(c2, "c");
        FunctionDescriptorImpl function = functionDescriptorImpl;
        Intrinsics.checkNotNullParameter(function, "function");
        Intrinsics.checkNotNullParameter(jValueParameters, "jValueParameters");
        q qVarK1 = d0.k1(jValueParameters);
        ArrayList arrayList = new ArrayList(w.t(qVarK1, 10));
        Iterator it8 = qVarK1.iterator();
        boolean z = false;
        while (true) {
            d dVar = (d) it8;
            if (!((Iterator) dVar.f186416c).hasNext()) {
                return new ResolvedValueParameters(d0.d1(arrayList), z);
            }
            IndexedValue indexedValue = (IndexedValue) dVar.next();
            int i = indexedValue.f186391a;
            JavaValueParameter javaValueParameter = (JavaValueParameter) indexedValue.f186392b;
            Annotations annotationsResolveAnnotations = LazyJavaAnnotationsKt.resolveAnnotations(c2, javaValueParameter);
            JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null);
            if (javaValueParameter.isVararg()) {
                JavaType type = javaValueParameter.getType();
                JavaArrayType javaArrayType = type instanceof JavaArrayType ? (JavaArrayType) type : null;
                if (javaArrayType == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + javaValueParameter);
                }
                KotlinType kotlinTypeTransformArrayType = c2.getTypeResolver().transformArrayType(javaArrayType, attributes$default, true);
                pair = new Pair(kotlinTypeTransformArrayType, c2.getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformArrayType));
            } else {
                pair = new Pair(c2.getTypeResolver().transformJavaType(javaValueParameter.getType(), attributes$default), null);
            }
            KotlinType kotlinType = (KotlinType) pair.f186385a;
            KotlinType kotlinType2 = (KotlinType) pair.f186386b;
            if (Intrinsics.f(function.getName().asString(), "equals") && jValueParameters.size() == 1 && Intrinsics.f(c2.getModule().getBuiltIns().getNullableAnyType(), kotlinType)) {
                name = Name.identifier("other");
            } else {
                name = javaValueParameter.getName();
                if (name == null) {
                    z = true;
                }
                if (name == null) {
                    name = Name.identifier("p" + i);
                    Intrinsics.checkNotNullExpressionValue(name, "identifier(...)");
                }
            }
            boolean z3 = z;
            Intrinsics.h(name);
            arrayList.add(new ValueParameterDescriptorImpl(function, null, i, annotationsResolveAnnotations, name, kotlinType, false, false, false, kotlinType2, c2.getComponents().getSourceElementFactory().source(javaValueParameter)));
            function = functionDescriptorImpl;
            z = z3;
        }
    }

    public abstract Set a(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public void b(Name name, ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
    }

    public abstract Set computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1 function1);

    public abstract DeclaredMemberIndex computeMemberIndex();

    public abstract void d(LinkedHashSet linkedHashSet, Name name);

    public abstract void e(Name name, ArrayList arrayList);

    public abstract Set f(DescriptorKindFilter descriptorKindFilter);

    public abstract ReceiverParameterDescriptor g();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getClassifierNames() {
        return (Set) StorageKt.getValue(this.f187004j, this, f186998l[2]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<DeclarationDescriptor> getContributedDescriptors(@NotNull DescriptorKindFilter kindFilter, @NotNull Function1<? super Name, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return (Collection) this.f187001c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getFunctionNames().contains(name) ? f0.f322471a : (Collection) this.f187002g.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        return !getVariableNames().contains(name) ? f0.f322471a : (Collection) this.k.invoke(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getFunctionNames() {
        return (Set) StorageKt.getValue(this.f187003h, this, f186998l[0]);
    }

    public abstract DeclarationDescriptor getOwnerDescriptor();

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Set<Name> getVariableNames() {
        return (Set) StorageKt.getValue(this.i, this, f186998l[1]);
    }

    public boolean h(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        return true;
    }

    public abstract MethodSignatureData i(JavaMethod javaMethod, ArrayList arrayList, KotlinType kotlinType, List list);

    public final JavaMethodDescriptor j(JavaMethod method) {
        Intrinsics.checkNotNullParameter(method, "method");
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, method), method.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(method), ((DeclaredMemberIndex) this.d.invoke()).findRecordComponentByName(method.getName()) != null && method.getValueParameters().isEmpty());
        Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
        LazyJavaResolverContext lazyJavaResolverContextChildForMethod$default = ContextKt.childForMethod$default(this.f186999a, javaMethodDescriptorCreateJavaMethod, method, 0, 4, null);
        List<JavaTypeParameter> typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(w.t(typeParameters, 10));
        Iterator<T> it8 = typeParameters.iterator();
        while (it8.hasNext()) {
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it8.next());
            Intrinsics.h(typeParameterDescriptorResolveTypeParameter);
            arrayList.add(typeParameterDescriptorResolveTypeParameter);
        }
        ResolvedValueParameters resolvedValueParametersK = k(lazyJavaResolverContextChildForMethod$default, javaMethodDescriptorCreateJavaMethod, method.getValueParameters());
        MethodSignatureData methodSignatureDataI = i(method, arrayList, c(method, lazyJavaResolverContextChildForMethod$default), resolvedValueParametersK.getDescriptors());
        KotlinType receiverType = methodSignatureDataI.getReceiverType();
        javaMethodDescriptorCreateJavaMethod.initialize(receiverType != null ? DescriptorFactory.createExtensionReceiverParameterForCallable(javaMethodDescriptorCreateJavaMethod, receiverType, Annotations.Companion.getEMPTY()) : null, g(), f0.f322471a, methodSignatureDataI.getTypeParameters(), methodSignatureDataI.getValueParameters(), methodSignatureDataI.getReturnType(), Modality.Companion.convertFromFlags(false, method.isAbstract(), !method.isFinal()), UtilsKt.toDescriptorVisibility(method.getVisibility()), methodSignatureDataI.getReceiverType() != null ? q0.c(new Pair(JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, d0.b0(resolvedValueParametersK.getDescriptors()))) : r0.g());
        javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(methodSignatureDataI.getHasStableParameterNames(), resolvedValueParametersK.getHasSynthesizedNames());
        if (!methodSignatureDataI.getErrors().isEmpty()) {
            lazyJavaResolverContextChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(javaMethodDescriptorCreateJavaMethod, methodSignatureDataI.getErrors());
        }
        return javaMethodDescriptorCreateJavaMethod;
    }

    @NotNull
    public String toString() {
        return "Lazy scope for " + getOwnerDescriptor();
    }

    public /* synthetic */ LazyJavaScope(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaScope lazyJavaScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, (i & 2) != 0 ? null : lazyJavaScope);
    }
}
