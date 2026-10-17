package pjm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236882a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaResolverContext f236883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LazyJavaClassMemberScope f236884c;

    public d(LazyJavaResolverContext lazyJavaResolverContext, LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        this.f236883b = lazyJavaResolverContext;
        this.f236884c = lazyJavaClassMemberScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
    /* JADX WARN: Type inference failed for: r3v16, types: [kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v6, types: [kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r4;
        ?? arrayList;
        ?? r3;
        Pair pair;
        int i = this.f236882a;
        LazyJavaResolverContext lazyJavaResolverContext = this.f236883b;
        switch (i) {
            case 0:
                LazyJavaClassMemberScope lazyJavaClassMemberScope = this.f236884c;
                JavaClass javaClass = lazyJavaClassMemberScope.f186981n;
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaClassMemberScope.f186999a;
                ClassDescriptor classDescriptor = lazyJavaClassMemberScope.f186980m;
                Collection<JavaConstructor> constructors = javaClass.getConstructors();
                ArrayList arrayList2 = new ArrayList(constructors.size());
                for (JavaConstructor javaConstructor : constructors) {
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext2, javaConstructor), false, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaConstructor));
                    Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptorCreateJavaConstructor, "createJavaConstructor(...)");
                    LazyJavaResolverContext lazyJavaResolverContextChildForMethod = ContextKt.childForMethod(lazyJavaResolverContext2, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor, classDescriptor.getDeclaredTypeParameters().size());
                    LazyJavaScope.ResolvedValueParameters resolvedValueParametersK = LazyJavaScope.k(lazyJavaResolverContextChildForMethod, javaClassConstructorDescriptorCreateJavaConstructor, javaConstructor.getValueParameters());
                    List<TypeParameterDescriptor> declaredTypeParameters = classDescriptor.getDeclaredTypeParameters();
                    Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
                    List<TypeParameterDescriptor> list = declaredTypeParameters;
                    List<JavaTypeParameter> typeParameters = javaConstructor.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(w.t(typeParameters, 10));
                    Iterator it8 = typeParameters.iterator();
                    while (it8.hasNext()) {
                        TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = lazyJavaResolverContextChildForMethod.getTypeParameterResolver().resolveTypeParameter((JavaTypeParameter) it8.next());
                        Intrinsics.h(typeParameterDescriptorResolveTypeParameter);
                        arrayList3.add(typeParameterDescriptorResolveTypeParameter);
                    }
                    javaClassConstructorDescriptorCreateJavaConstructor.initialize(resolvedValueParametersK.getDescriptors(), UtilsKt.toDescriptorVisibility(javaConstructor.getVisibility()), d0.E0(arrayList3, list));
                    javaClassConstructorDescriptorCreateJavaConstructor.setHasStableParameterNames(false);
                    javaClassConstructorDescriptorCreateJavaConstructor.setHasSynthesizedParameterNames(resolvedValueParametersK.getHasSynthesizedNames());
                    javaClassConstructorDescriptorCreateJavaConstructor.setReturnType(classDescriptor.getDefaultType());
                    lazyJavaResolverContextChildForMethod.getComponents().getJavaResolverCache().recordConstructor(javaConstructor, javaClassConstructorDescriptorCreateJavaConstructor);
                    arrayList2.add(javaClassConstructorDescriptorCreateJavaConstructor);
                }
                if (javaClass.isRecord()) {
                    JavaClassConstructorDescriptor javaClassConstructorDescriptorCreateJavaConstructor2 = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                    Intrinsics.checkNotNullExpressionValue(javaClassConstructorDescriptorCreateJavaConstructor2, "createJavaConstructor(...)");
                    Collection<JavaRecordComponent> recordComponents = javaClass.getRecordComponents();
                    ArrayList arrayList4 = new ArrayList(recordComponents.size());
                    JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 6, null);
                    int i2 = 0;
                    for (JavaRecordComponent javaRecordComponent : recordComponents) {
                        int i3 = i2 + 1;
                        JavaClassConstructorDescriptor javaClassConstructorDescriptor = javaClassConstructorDescriptorCreateJavaConstructor2;
                        KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaRecordComponent.getType(), attributes$default);
                        ValueParameterDescriptorImpl valueParameterDescriptorImpl = new ValueParameterDescriptorImpl(javaClassConstructorDescriptor, null, i2, Annotations.Companion.getEMPTY(), javaRecordComponent.getName(), kotlinTypeTransformJavaType, false, false, false, javaRecordComponent.isVararg() ? lazyJavaResolverContext2.getComponents().getModule().getBuiltIns().getArrayElementType(kotlinTypeTransformJavaType) : null, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaRecordComponent));
                        javaClassConstructorDescriptorCreateJavaConstructor2 = javaClassConstructorDescriptor;
                        arrayList4.add(valueParameterDescriptorImpl);
                        i2 = i3;
                    }
                    boolean z = false;
                    javaClassConstructorDescriptorCreateJavaConstructor2.setHasSynthesizedParameterNames(false);
                    DescriptorVisibility PROTECTED_AND_PACKAGE = classDescriptor.getVisibility();
                    Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (Intrinsics.f(PROTECTED_AND_PACKAGE, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                        PROTECTED_AND_PACKAGE = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    javaClassConstructorDescriptorCreateJavaConstructor2.initialize(arrayList4, PROTECTED_AND_PACKAGE);
                    javaClassConstructorDescriptorCreateJavaConstructor2.setHasStableParameterNames(false);
                    javaClassConstructorDescriptorCreateJavaConstructor2.setReturnType(classDescriptor.getDefaultType());
                    Object obj2 = null;
                    String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(javaClassConstructorDescriptorCreateJavaConstructor2, false, false, 2, null);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(javaClassConstructorDescriptorCreateJavaConstructor2);
                        lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(javaClass, javaClassConstructorDescriptorCreateJavaConstructor2);
                    } else {
                        Iterator it9 = arrayList2.iterator();
                        while (it9.hasNext()) {
                            if (!Intrinsics.f(MethodSignatureMappingKt.computeJvmDescriptor$default((ClassConstructorDescriptor) it9.next(), z, z, 2, obj2), strComputeJvmDescriptor$default)) {
                                z = false;
                                obj2 = null;
                            }
                        }
                        arrayList2.add(javaClassConstructorDescriptorCreateJavaConstructor2);
                        lazyJavaResolverContext.getComponents().getJavaResolverCache().recordConstructor(javaClass, javaClassConstructorDescriptorCreateJavaConstructor2);
                    }
                }
                lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateConstructors(classDescriptor, arrayList2, lazyJavaResolverContext);
                SignatureEnhancement signatureEnhancement = lazyJavaResolverContext.getComponents().getSignatureEnhancement();
                boolean zIsEmpty = arrayList2.isEmpty();
                List listL = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotationType = javaClass.isAnnotationType();
                    if ((javaClass.isInterface() || !javaClass.hasDefaultConstructor()) && !zIsAnnotationType) {
                        r4 = 0;
                    } else {
                        ?? CreateJavaConstructor = JavaClassConstructorDescriptor.createJavaConstructor(classDescriptor, Annotations.Companion.getEMPTY(), true, lazyJavaResolverContext2.getComponents().getSourceElementFactory().source(javaClass));
                        Intrinsics.checkNotNullExpressionValue(CreateJavaConstructor, "createJavaConstructor(...)");
                        if (zIsAnnotationType) {
                            Collection<JavaMethod> methods = javaClass.getMethods();
                            arrayList = new ArrayList(methods.size());
                            JavaTypeAttributes attributes$default2 = JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, true, false, null, 6, null);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<JavaMethod> arrayList6 = new ArrayList();
                            for (Object obj3 : methods) {
                                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = lazyJavaClassMemberScope;
                                if (Intrinsics.f(((JavaMethod) obj3).getName(), JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                                    arrayList5.add(obj3);
                                } else {
                                    arrayList6.add(obj3);
                                }
                                lazyJavaClassMemberScope = lazyJavaClassMemberScope2;
                            }
                            LazyJavaClassMemberScope lazyJavaClassMemberScope3 = lazyJavaClassMemberScope;
                            arrayList5.size();
                            JavaMethod javaMethod = (JavaMethod) d0.d0(arrayList5);
                            if (javaMethod != null) {
                                JavaType returnType = javaMethod.getReturnType();
                                if (returnType instanceof JavaArrayType) {
                                    JavaArrayType javaArrayType = (JavaArrayType) returnType;
                                    pair = new Pair(lazyJavaResolverContext2.getTypeResolver().transformArrayType(javaArrayType, attributes$default2, true), lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaArrayType.getComponentType(), attributes$default2));
                                } else {
                                    pair = new Pair(lazyJavaResolverContext2.getTypeResolver().transformJavaType(returnType, attributes$default2), null);
                                }
                                ?? r310 = lazyJavaClassMemberScope3;
                                r310.l(arrayList, CreateJavaConstructor, 0, javaMethod, (KotlinType) pair.f186385a, (KotlinType) pair.f186386b);
                                r3 = r310;
                            } else {
                                r3 = lazyJavaClassMemberScope3;
                            }
                            int i5 = javaMethod != null ? 1 : 0;
                            int i6 = 0;
                            for (JavaMethod javaMethod2 : arrayList6) {
                                r3.l(arrayList, CreateJavaConstructor, i6 + i5, javaMethod2, lazyJavaResolverContext2.getTypeResolver().transformJavaType(javaMethod2.getReturnType(), attributes$default2), null);
                                i6++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        CreateJavaConstructor.setHasSynthesizedParameterNames(false);
                        DescriptorVisibility PROTECTED_AND_PACKAGE2 = classDescriptor.getVisibility();
                        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                        if (Intrinsics.f(PROTECTED_AND_PACKAGE2, JavaDescriptorVisibilities.PROTECTED_STATIC_VISIBILITY)) {
                            PROTECTED_AND_PACKAGE2 = JavaDescriptorVisibilities.PROTECTED_AND_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        CreateJavaConstructor.initialize(arrayList, PROTECTED_AND_PACKAGE2);
                        CreateJavaConstructor.setHasStableParameterNames(true);
                        CreateJavaConstructor.setReturnType(classDescriptor.getDefaultType());
                        lazyJavaResolverContext2.getComponents().getJavaResolverCache().recordConstructor(javaClass, CreateJavaConstructor);
                        r4 = CreateJavaConstructor;
                    }
                    listL = v.l(r4);
                }
                return d0.d1(signatureEnhancement.enhanceSignatures(lazyJavaResolverContext, listL));
            default:
                int i21 = LazyJavaClassMemberScope.u;
                return d0.i1(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getNestedClassNames(this.f236884c.f186980m, lazyJavaResolverContext));
        }
    }

    public d(LazyJavaClassMemberScope lazyJavaClassMemberScope, LazyJavaResolverContext lazyJavaResolverContext) {
        this.f236884c = lazyJavaClassMemberScope;
        this.f236883b = lazyJavaResolverContext;
    }
}
