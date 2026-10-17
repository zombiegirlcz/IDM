package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.PropertiesConventionUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaForKotlinOverridePropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import nyb.q;
import om4.m1;
import org.jetbrains.annotations.NotNull;
import pjm.d;
import pjm.e;
import pjm.f;
import pjm.g;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {
    public static final /* synthetic */ int u = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ClassDescriptor f186980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final JavaClass f186981n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NotNullLazyValue f186982p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NotNullLazyValue f186983q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final NotNullLazyValue f186984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final NotNullLazyValue f186985s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MemoizedFunctionToNullable f186986t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(@NotNull LazyJavaResolverContext c2, @NotNull ClassDescriptor ownerDescriptor, @NotNull JavaClass jClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c2, lazyJavaClassMemberScope);
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(ownerDescriptor, "ownerDescriptor");
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f186980m = ownerDescriptor;
        this.f186981n = jClass;
        this.o = z;
        this.f186982p = c2.getStorageManager().createLazyValue(new d(this, c2));
        this.f186983q = c2.getStorageManager().createLazyValue(new e(this, 0));
        this.f186984r = c2.getStorageManager().createLazyValue(new d(c2, this));
        this.f186985s = c2.getStorageManager().createLazyValue(new e(this, 1));
        this.f186986t = c2.getStorageManager().createMemoizedFunctionWithNullableValues(new q(this, c2, 10));
    }

    public static SimpleFunctionDescriptor q(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return simpleFunctionDescriptor;
        }
        Iterator it8 = abstractCollection.iterator();
        while (it8.hasNext()) {
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it8.next();
            if (!simpleFunctionDescriptor.equals(simpleFunctionDescriptor2) && simpleFunctionDescriptor2.getInitialSignatureDescriptor() == null && t(simpleFunctionDescriptor2, functionDescriptor)) {
                FunctionDescriptor functionDescriptorBuild = simpleFunctionDescriptor.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                Intrinsics.h(functionDescriptorBuild);
                return (SimpleFunctionDescriptor) functionDescriptorBuild;
            }
        }
        return simpleFunctionDescriptor;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r5) {
        /*
            java.util.List r0 = r5.getValueParameters()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = zhm.d0.o0(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            r2 = 0
            if (r0 == 0) goto L7d
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r0.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.mo3795getDeclarationDescriptor()
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe r3 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe(r3)
            if (r3 == 0) goto L35
            boolean r4 = r3.isSafe()
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L35
            kotlin.reflect.jvm.internal.impl.name.FqName r3 = r3.toSafe()
            goto L36
        L35:
            r3 = r2
        L36:
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.CONTINUATION_INTERFACE_FQ_NAME
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r4)
            if (r3 == 0) goto L3f
            goto L40
        L3f:
            r0 = r2
        L40:
            if (r0 != 0) goto L43
            goto L7d
        L43:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r5.newCopyBuilder()
            java.util.List r5 = r5.getValueParameters()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            r1 = 1
            java.util.List r5 = zhm.d0.W(r1, r5)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r5 = r2.setValueParameters(r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.util.List r0 = r0.getArguments()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r5 = r5.setReturnType(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r5 = r5.build()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r5
            r0 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl) r0
            if (r0 == 0) goto L7c
            r0.setSuspend(r1)
        L7c:
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.r(kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    public static boolean t(FunctionDescriptor functionDescriptor, FunctionDescriptor functionDescriptor2) {
        OverridingUtil.OverrideCompatibilityInfo.Result result = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(functionDescriptor2, functionDescriptor, true).getResult();
        Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
        return result == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(functionDescriptor2, functionDescriptor);
    }

    public static SimpleFunctionDescriptor u(PropertyDescriptor propertyDescriptor, String str, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Iterator it8 = ((Iterable) function1.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it8.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it8.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 0) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                KotlinType returnType = simpleFunctionDescriptor2.getReturnType();
                if (returnType == null ? false : kotlinTypeChecker.isSubtypeOf(returnType, propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static SimpleFunctionDescriptor w(PropertyDescriptor propertyDescriptor, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        KotlinType returnType;
        String strAsString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        Name nameIdentifier = Name.identifier(JvmAbi.setterName(strAsString));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        Iterator it8 = ((Iterable) function1.invoke(nameIdentifier)).iterator();
        do {
            simpleFunctionDescriptor = null;
            if (!it8.hasNext()) {
                break;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) it8.next();
            if (simpleFunctionDescriptor2.getValueParameters().size() == 1 && (returnType = simpleFunctionDescriptor2.getReturnType()) != null && KotlinBuiltIns.isUnit(returnType)) {
                KotlinTypeChecker kotlinTypeChecker = KotlinTypeChecker.DEFAULT;
                List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptor2.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                if (kotlinTypeChecker.equalTypes(((ValueParameterDescriptor) d0.K0(valueParameters)).getType(), propertyDescriptor.getType())) {
                    simpleFunctionDescriptor = simpleFunctionDescriptor2;
                }
            }
        } while (simpleFunctionDescriptor == null);
        return simpleFunctionDescriptor;
    }

    public static boolean z(SimpleFunctionDescriptor simpleFunctionDescriptor, FunctionDescriptor functionDescriptor) {
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 2, null);
        FunctionDescriptor original = functionDescriptor.getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        return Intrinsics.f(strComputeJvmDescriptor$default, MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null)) && !t(simpleFunctionDescriptor, functionDescriptor);
    }

    public final boolean A(SimpleFunctionDescriptor simpleFunctionDescriptor) {
        Name name = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        List<Name> propertyNamesCandidatesByAccessorName = PropertiesConventionUtilKt.getPropertyNamesCandidatesByAccessorName(name);
        if (!(propertyNamesCandidatesByAccessorName instanceof Collection) || !propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it8 = propertyNamesCandidatesByAccessorName.iterator();
            while (it8.hasNext()) {
                Set<PropertyDescriptor> setY = y((Name) it8.next());
                if (!(setY instanceof Collection) || !setY.isEmpty()) {
                    for (PropertyDescriptor propertyDescriptor : setY) {
                        if (s(propertyDescriptor, new q(simpleFunctionDescriptor, this, 11))) {
                            if (propertyDescriptor.isVar()) {
                                return false;
                            }
                            String strAsString = simpleFunctionDescriptor.getName().asString();
                            Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                            if (!JvmAbi.isSetterName(strAsString)) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        Name name2 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        Name builtinFunctionNamesByJvmName = companion.getBuiltinFunctionNamesByJvmName(name2);
        if (builtinFunctionNamesByJvmName != null) {
            LinkedHashSet linkedHashSetX = x(builtinFunctionNamesByJvmName);
            ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList();
            for (Object obj2 : linkedHashSetX) {
                if (SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName((SimpleFunctionDescriptor) obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
                copyBuilderNewCopyBuilder.setName(builtinFunctionNamesByJvmName);
                copyBuilderNewCopyBuilder.setSignatureChange();
                copyBuilderNewCopyBuilder.setPreserveSourceElement();
                FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
                Intrinsics.h(functionDescriptorBuild);
                SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) functionDescriptorBuild;
                if (!arrayList.isEmpty()) {
                    for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : arrayList) {
                        FunctionDescriptor original = BuiltinMethodsWithDifferentJvmName.INSTANCE.isRemoveAtByIndex(simpleFunctionDescriptor3) ? simpleFunctionDescriptor2.getOriginal() : simpleFunctionDescriptor2;
                        Intrinsics.h(original);
                        if (t(original, simpleFunctionDescriptor3)) {
                            return false;
                        }
                    }
                }
            }
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name3 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name3)) {
            Name name4 = simpleFunctionDescriptor.getName();
            Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
            LinkedHashSet linkedHashSetX2 = x(name4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = linkedHashSetX2.iterator();
            while (it9.hasNext()) {
                FunctionDescriptor overriddenBuiltinFunctionWithErasedValueParametersInJava = BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((SimpleFunctionDescriptor) it9.next());
                if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                    arrayList2.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it10 = arrayList2.iterator();
                while (it10.hasNext()) {
                    if (z(simpleFunctionDescriptor, (FunctionDescriptor) it10.next())) {
                        return false;
                    }
                }
            }
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorR = r(simpleFunctionDescriptor);
        if (simpleFunctionDescriptorR == null) {
            return true;
        }
        Name name5 = simpleFunctionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name5, "getName(...)");
        LinkedHashSet<SimpleFunctionDescriptor> linkedHashSetX3 = x(name5);
        if (linkedHashSetX3.isEmpty()) {
            return true;
        }
        for (SimpleFunctionDescriptor simpleFunctionDescriptor4 : linkedHashSetX3) {
            if (simpleFunctionDescriptor4.isSuspend() && t(simpleFunctionDescriptorR, simpleFunctionDescriptor4)) {
                return false;
            }
        }
        return true;
    }

    public final ArrayList B(Name name) {
        Collection<JavaMethod> collectionFindMethodsByName = ((DeclaredMemberIndex) this.d.invoke()).findMethodsByName(name);
        ArrayList arrayList = new ArrayList(w.t(collectionFindMethodsByName, 10));
        Iterator<T> it8 = collectionFindMethodsByName.iterator();
        while (it8.hasNext()) {
            arrayList.add(j((JavaMethod) it8.next()));
        }
        return arrayList;
    }

    public final ArrayList C(Name name) {
        LinkedHashSet linkedHashSetX = x(name);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : linkedHashSetX) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj2;
            if (!SpecialBuiltinMembers.doesOverrideBuiltinWithDifferentJvmName(simpleFunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(simpleFunctionDescriptor) == null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set a(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        return a1.l((Set) this.f186983q.invoke(), ((Map) this.f186985s.invoke()).keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void b(Name name, ArrayList result) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        boolean zIsRecord = this.f186981n.isRecord();
        ClassDescriptor classDescriptor = this.f186980m;
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        if (zIsRecord) {
            NotNullLazyValue notNullLazyValue = this.d;
            if (((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name) != null) {
                if (result.isEmpty()) {
                    JavaRecordComponent javaRecordComponentFindRecordComponentByName = ((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name);
                    Intrinsics.h(javaRecordComponentFindRecordComponentByName);
                    JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod = JavaMethodDescriptor.createJavaMethod(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaRecordComponentFindRecordComponentByName), javaRecordComponentFindRecordComponentByName.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName), true);
                    Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod, "createJavaMethod(...)");
                    KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null));
                    ReceiverParameterDescriptor dispatchReceiverParameterIfNeeded = DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor);
                    f0 f0Var = f0.f322471a;
                    javaMethodDescriptorCreateJavaMethod.initialize(null, dispatchReceiverParameterIfNeeded, f0Var, f0Var, f0Var, kotlinTypeTransformJavaType, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                    javaMethodDescriptorCreateJavaMethod.setParameterNamesStatus(false, false);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName, javaMethodDescriptorCreateJavaMethod);
                    result.add(javaMethodDescriptorCreateJavaMethod);
                } else {
                    Iterator it8 = result.iterator();
                    while (it8.hasNext()) {
                        if (((SimpleFunctionDescriptor) it8.next()).getValueParameters().isEmpty()) {
                            break;
                        }
                    }
                    JavaRecordComponent javaRecordComponentFindRecordComponentByName2 = ((DeclaredMemberIndex) notNullLazyValue.invoke()).findRecordComponentByName(name);
                    Intrinsics.h(javaRecordComponentFindRecordComponentByName2);
                    JavaMethodDescriptor javaMethodDescriptorCreateJavaMethod2 = JavaMethodDescriptor.createJavaMethod(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaRecordComponentFindRecordComponentByName2), javaRecordComponentFindRecordComponentByName2.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaRecordComponentFindRecordComponentByName2), true);
                    Intrinsics.checkNotNullExpressionValue(javaMethodDescriptorCreateJavaMethod2, "createJavaMethod(...)");
                    KotlinType kotlinTypeTransformJavaType2 = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaRecordComponentFindRecordComponentByName2.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null));
                    ReceiverParameterDescriptor dispatchReceiverParameterIfNeeded2 = DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor);
                    f0 f0Var2 = f0.f322471a;
                    javaMethodDescriptorCreateJavaMethod2.initialize(null, dispatchReceiverParameterIfNeeded2, f0Var2, f0Var2, f0Var2, kotlinTypeTransformJavaType2, Modality.Companion.convertFromFlags(false, false, true), DescriptorVisibilities.PUBLIC, null);
                    javaMethodDescriptorCreateJavaMethod2.setParameterNamesStatus(false, false);
                    lazyJavaResolverContext.getComponents().getJavaResolverCache().recordMethod(javaRecordComponentFindRecordComponentByName2, javaMethodDescriptorCreateJavaMethod2);
                    result.add(javaMethodDescriptorCreateJavaMethod2);
                }
            }
        }
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateMethods(classDescriptor, name, result, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public Set computeFunctionNames(DescriptorKindFilter kindFilter, Function1 function1) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        ClassDescriptor classDescriptor = this.f186980m;
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            a0.x(((KotlinType) it8.next()).getMemberScope().getFunctionNames(), linkedHashSet);
        }
        NotNullLazyValue notNullLazyValue = this.d;
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getMethodNames());
        linkedHashSet.addAll(((DeclaredMemberIndex) notNullLazyValue.invoke()).getRecordComponentNames());
        linkedHashSet.addAll(a(kindFilter, function1));
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        linkedHashSet.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getMethodNames(classDescriptor, lazyJavaResolverContext));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f186981n, f.f236887b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void d(LinkedHashSet result, Name name) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(name, "name");
        LinkedHashSet linkedHashSetX = x(name);
        if (!SpecialGenericSignatures.Companion.getSameAsRenamedInJvmBuiltin(name) && !BuiltinMethodsWithSpecialGenericSignature.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            if (!linkedHashSetX.isEmpty()) {
                Iterator it8 = linkedHashSetX.iterator();
                while (it8.hasNext()) {
                    if (((FunctionDescriptor) it8.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : linkedHashSetX) {
                if (A((SimpleFunctionDescriptor) obj2)) {
                    arrayList.add(obj2);
                }
            }
            m(result, name, arrayList, false);
            return;
        }
        SmartSet smartSetCreate = SmartSet.Companion.create();
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, linkedHashSetX, f0.f322471a, this.f186980m, ErrorReporter.DO_NOTHING, this.f186999a.getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        int i = 0;
        n(name, result, collectionResolveOverridesForNonStaticMembers, result, new m1(1, this, LazyJavaClassMemberScope.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i, 28));
        n(name, result, collectionResolveOverridesForNonStaticMembers, smartSetCreate, new m1(1, this, LazyJavaClassMemberScope.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", i, 29));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : linkedHashSetX) {
            if (A((SimpleFunctionDescriptor) obj3)) {
                arrayList2.add(obj3);
            }
        }
        m(result, name, d0.E0(smartSetCreate, arrayList2), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final void e(Name name, ArrayList result) {
        JavaMethod javaMethod;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zIsAnnotationType = this.f186981n.isAnnotationType();
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        if (zIsAnnotationType && (javaMethod = (JavaMethod) d0.L0(((DeclaredMemberIndex) this.d.invoke()).findMethodsByName(name))) != null) {
            JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(this.f186980m, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaMethod), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaMethod.getVisibility()), false, javaMethod.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaMethod), false);
            Intrinsics.checkNotNullExpressionValue(javaPropertyDescriptorCreate, "create(...)");
            PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateDefaultGetter = DescriptorFactory.createDefaultGetter(javaPropertyDescriptorCreate, Annotations.Companion.getEMPTY());
            Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImplCreateDefaultGetter, "createDefaultGetter(...)");
            javaPropertyDescriptorCreate.initialize(propertyGetterDescriptorImplCreateDefaultGetter, null);
            KotlinType kotlinTypeC = LazyJavaScope.c(javaMethod, ContextKt.childForMethod$default(this.f186999a, javaPropertyDescriptorCreate, javaMethod, 0, 4, null));
            f0 f0Var = f0.f322471a;
            javaPropertyDescriptorCreate.setType(kotlinTypeC, f0Var, DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.f186980m), null, f0Var);
            propertyGetterDescriptorImplCreateDefaultGetter.initialize(kotlinTypeC);
            result.add(javaPropertyDescriptorCreate);
        }
        Set setY = y(name);
        if (setY.isEmpty()) {
            return;
        }
        SmartSet.Companion companion = SmartSet.Companion;
        SmartSet smartSetCreate = companion.create();
        SmartSet smartSetCreate2 = companion.create();
        o(setY, result, smartSetCreate, new g(this, 0));
        o(a1.k(setY, smartSetCreate), smartSetCreate2, null, new g(this, 1));
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, a1.l(setY, smartSetCreate2), result, this.f186980m, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        result.addAll(collectionResolveOverridesForNonStaticMembers);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set f(DescriptorKindFilter kindFilter) {
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        if (this.f186981n.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((DeclaredMemberIndex) this.d.invoke()).getFieldNames());
        Collection<KotlinType> supertypes = this.f186980m.getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        Iterator<T> it8 = supertypes.iterator();
        while (it8.hasNext()) {
            a0.x(((KotlinType) it8.next()).getMemberScope().getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final ReceiverParameterDescriptor g() {
        return DescriptorUtils.getDispatchReceiverParameterIfNeeded(this.f186980m);
    }

    @NotNull
    public final NotNullLazyValue<List<ClassConstructorDescriptor>> getConstructors$descriptors_jvm() {
        return this.f186982p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo3796getContributedClassifier(@NotNull Name name, @NotNull LookupLocation location) {
        MemoizedFunctionToNullable memoizedFunctionToNullable;
        ClassDescriptor classDescriptor;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) this.f187000b;
        return (lazyJavaClassMemberScope == null || (memoizedFunctionToNullable = lazyJavaClassMemberScope.f186986t) == null || (classDescriptor = (ClassDescriptor) memoizedFunctionToNullable.invoke(name)) == null) ? (ClassifierDescriptor) this.f186986t.invoke(name) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    @NotNull
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @NotNull
    public Collection<PropertyDescriptor> getContributedVariables(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        mo3799recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.f186980m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final boolean h(JavaMethodDescriptor javaMethodDescriptor) {
        Intrinsics.checkNotNullParameter(javaMethodDescriptor, "<this>");
        if (this.f186981n.isAnnotationType()) {
            return false;
        }
        return A(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final LazyJavaScope.MethodSignatureData i(JavaMethod method, ArrayList methodTypeParameters, KotlinType returnType, List valueParameters) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(methodTypeParameters, "methodTypeParameters");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        Intrinsics.checkNotNullParameter(valueParameters, "valueParameters");
        SignaturePropagator.PropagatedSignature propagatedSignatureResolvePropagatedSignature = this.f186999a.getComponents().getSignaturePropagator().resolvePropagatedSignature(method, this.f186980m, returnType, null, valueParameters, methodTypeParameters);
        Intrinsics.checkNotNullExpressionValue(propagatedSignatureResolvePropagatedSignature, "resolvePropagatedSignature(...)");
        KotlinType returnType2 = propagatedSignatureResolvePropagatedSignature.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
        KotlinType receiverType = propagatedSignatureResolvePropagatedSignature.getReceiverType();
        List<ValueParameterDescriptor> valueParameters2 = propagatedSignatureResolvePropagatedSignature.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
        List<TypeParameterDescriptor> typeParameters = propagatedSignatureResolvePropagatedSignature.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        boolean zHasStableParameterNames = propagatedSignatureResolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = propagatedSignatureResolvePropagatedSignature.getErrors();
        Intrinsics.checkNotNullExpressionValue(errors, "getErrors(...)");
        return new LazyJavaScope.MethodSignatureData(returnType2, receiverType, valueParameters2, typeParameters, zHasStableParameterNames, errors);
    }

    public final void l(ArrayList arrayList, JavaClassConstructorDescriptor javaClassConstructorDescriptor, int i, JavaMethod javaMethod, KotlinType kotlinType, KotlinType kotlinType2) {
        Annotations empty = Annotations.Companion.getEMPTY();
        Name name = javaMethod.getName();
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        arrayList.add(new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i, empty, name, kotlinTypeMakeNotNullable, javaMethod.getHasAnnotationParameterDefaultValue(), false, false, kotlinType2 != null ? TypeUtils.makeNotNullable(kotlinType2) : null, this.f186999a.getComponents().getSourceElementFactory().source(javaMethod)));
    }

    public final void m(LinkedHashSet linkedHashSet, Name name, ArrayList arrayList, boolean z) {
        LazyJavaResolverContext lazyJavaResolverContext = this.f186999a;
        Collection collectionResolveOverridesForNonStaticMembers = DescriptorResolverUtils.resolveOverridesForNonStaticMembers(name, arrayList, linkedHashSet, this.f186980m, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        Intrinsics.checkNotNullExpressionValue(collectionResolveOverridesForNonStaticMembers, "resolveOverridesForNonStaticMembers(...)");
        if (!z) {
            linkedHashSet.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        Collection<SimpleFunctionDescriptor> collection = collectionResolveOverridesForNonStaticMembers;
        ArrayList arrayListE0 = d0.E0(collection, linkedHashSet);
        ArrayList arrayList2 = new ArrayList(w.t(collection, 10));
        for (SimpleFunctionDescriptor simpleFunctionDescriptorQ : collection) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) SpecialBuiltinMembers.getOverriddenSpecialBuiltin(simpleFunctionDescriptorQ);
            if (simpleFunctionDescriptor == null) {
                Intrinsics.h(simpleFunctionDescriptorQ);
            } else {
                Intrinsics.h(simpleFunctionDescriptorQ);
                simpleFunctionDescriptorQ = q(simpleFunctionDescriptorQ, simpleFunctionDescriptor, arrayListE0);
            }
            arrayList2.add(simpleFunctionDescriptorQ);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(kotlin.reflect.jvm.internal.impl.name.Name r11, java.util.LinkedHashSet r12, java.util.Collection r13, java.util.AbstractSet r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope.n(kotlin.reflect.jvm.internal.impl.name.Name, java.util.LinkedHashSet, java.util.Collection, java.util.AbstractSet, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o(Set set, AbstractCollection abstractCollection, SmartSet smartSet, Function1 function1) {
        SimpleFunctionDescriptor simpleFunctionDescriptorW;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) it8.next();
            JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor = null;
            PropertySetterDescriptorImpl propertySetterDescriptorImplCreateSetter = null;
            if (s(propertyDescriptor, function1)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorV = v(propertyDescriptor, function1);
                Intrinsics.h(simpleFunctionDescriptorV);
                if (propertyDescriptor.isVar()) {
                    simpleFunctionDescriptorW = w(propertyDescriptor, function1);
                    Intrinsics.h(simpleFunctionDescriptorW);
                } else {
                    simpleFunctionDescriptorW = null;
                }
                if (simpleFunctionDescriptorW != null) {
                    simpleFunctionDescriptorW.getModality();
                    simpleFunctionDescriptorV.getModality();
                }
                ClassDescriptor classDescriptor = this.f186980m;
                JavaForKotlinOverridePropertyDescriptor javaForKotlinOverridePropertyDescriptor2 = new JavaForKotlinOverridePropertyDescriptor(classDescriptor, simpleFunctionDescriptorV, simpleFunctionDescriptorW, propertyDescriptor);
                KotlinType returnType = simpleFunctionDescriptorV.getReturnType();
                Intrinsics.h(returnType);
                List<? extends TypeParameterDescriptor> list = f0.f322471a;
                javaForKotlinOverridePropertyDescriptor2.setType(returnType, list, DescriptorUtils.getDispatchReceiverParameterIfNeeded(classDescriptor), null, list);
                PropertyGetterDescriptorImpl propertyGetterDescriptorImplCreateGetter = DescriptorFactory.createGetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorV.getAnnotations(), false, false, false, simpleFunctionDescriptorV.getSource());
                propertyGetterDescriptorImplCreateGetter.setInitialSignatureDescriptor(simpleFunctionDescriptorV);
                propertyGetterDescriptorImplCreateGetter.initialize(javaForKotlinOverridePropertyDescriptor2.getType());
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImplCreateGetter, "apply(...)");
                if (simpleFunctionDescriptorW != null) {
                    List<ValueParameterDescriptor> valueParameters = simpleFunctionDescriptorW.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) d0.d0(valueParameters);
                    if (valueParameterDescriptor == null) {
                        throw new AssertionError("No parameter found for " + simpleFunctionDescriptorW);
                    }
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                    propertySetterDescriptorImplCreateSetter = DescriptorFactory.createSetter(javaForKotlinOverridePropertyDescriptor2, simpleFunctionDescriptorW.getAnnotations(), valueParameterDescriptor.getAnnotations(), false, false, false, simpleFunctionDescriptorW.getVisibility(), simpleFunctionDescriptorW.getSource());
                    propertySetterDescriptorImplCreateSetter.setInitialSignatureDescriptor(simpleFunctionDescriptorW);
                } else {
                    propertyGetterDescriptorImpl = propertyGetterDescriptorImplCreateGetter;
                }
                javaForKotlinOverridePropertyDescriptor2.initialize(propertyGetterDescriptorImpl, propertySetterDescriptorImplCreateSetter);
                javaForKotlinOverridePropertyDescriptor = javaForKotlinOverridePropertyDescriptor2;
            }
            if (javaForKotlinOverridePropertyDescriptor != null) {
                abstractCollection.add(javaForKotlinOverridePropertyDescriptor);
                if (smartSet != null) {
                    smartSet.add(propertyDescriptor);
                    return;
                }
                return;
            }
        }
    }

    public final Collection p() {
        boolean z = this.o;
        ClassDescriptor classDescriptor = this.f186980m;
        if (!z) {
            return this.f186999a.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(classDescriptor);
        }
        Collection<KotlinType> supertypes = classDescriptor.getTypeConstructor().getSupertypes();
        Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
        return supertypes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo3799recordLookup(@NotNull Name name, @NotNull LookupLocation location) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(location, "location");
        kotlin.reflect.jvm.internal.impl.incremental.UtilsKt.record(this.f186999a.getComponents().getLookupTracker(), location, this.f186980m, name);
    }

    public final boolean s(PropertyDescriptor propertyDescriptor, Function1 function1) {
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor)) {
            return false;
        }
        SimpleFunctionDescriptor simpleFunctionDescriptorV = v(propertyDescriptor, function1);
        SimpleFunctionDescriptor simpleFunctionDescriptorW = w(propertyDescriptor, function1);
        if (simpleFunctionDescriptorV == null) {
            return false;
        }
        if (propertyDescriptor.isVar()) {
            return simpleFunctionDescriptorW != null && simpleFunctionDescriptorW.getModality() == simpleFunctionDescriptorV.getModality();
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @NotNull
    public String toString() {
        return "Lazy Java member scope for " + this.f186981n.getFqName();
    }

    public final SimpleFunctionDescriptor v(PropertyDescriptor propertyDescriptor, Function1 function1) {
        PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
        PropertyGetterDescriptor propertyGetterDescriptor = getter != null ? (PropertyGetterDescriptor) SpecialBuiltinMembers.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = propertyGetterDescriptor != null ? ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyGetterDescriptor) : null;
        if (builtinSpecialPropertyGetterName != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(this.f186980m, propertyGetterDescriptor)) {
            return u(propertyDescriptor, builtinSpecialPropertyGetterName, function1);
        }
        String strAsString = propertyDescriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return u(propertyDescriptor, JvmAbi.getterName(strAsString), function1);
    }

    public final LinkedHashSet x(Name name) {
        Collection collectionP = p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = collectionP.iterator();
        while (it8.hasNext()) {
            a0.x(((KotlinType) it8.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS), linkedHashSet);
        }
        return linkedHashSet;
    }

    public final Set y(Name name) {
        Collection collectionP = p();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = collectionP.iterator();
        while (it8.hasNext()) {
            Collection<? extends PropertyDescriptor> contributedVariables = ((KotlinType) it8.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(w.t(contributedVariables, 10));
            Iterator<T> it9 = contributedVariables.iterator();
            while (it9.hasNext()) {
                arrayList2.add((PropertyDescriptor) it9.next());
            }
            a0.x(arrayList2, arrayList);
        }
        return d0.i1(arrayList);
    }

    public /* synthetic */ LazyJavaClassMemberScope(LazyJavaResolverContext lazyJavaResolverContext, ClassDescriptor classDescriptor, JavaClass javaClass, boolean z, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyJavaResolverContext, classDescriptor, javaClass, z, (i & 16) != 0 ? null : lazyJavaClassMemberScope);
    }
}
