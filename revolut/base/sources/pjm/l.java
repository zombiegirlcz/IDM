package pjm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaScope f236902b;

    public /* synthetic */ l(LazyJavaScope lazyJavaScope, int i) {
        this.f236901a = i;
        this.f236902b = lazyJavaScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f236901a;
        int i2 = 0;
        LazyJavaScope lazyJavaScope = this.f236902b;
        Name name = (Name) obj2;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = LazyJavaScope.f186998l;
                Intrinsics.checkNotNullParameter(name, "name");
                LazyJavaScope lazyJavaScope2 = lazyJavaScope.f187000b;
                if (lazyJavaScope2 != null) {
                    return (Collection) lazyJavaScope2.e.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                for (JavaMethod javaMethod : ((DeclaredMemberIndex) lazyJavaScope.d.invoke()).findMethodsByName(name)) {
                    JavaMethodDescriptor javaMethodDescriptorJ = lazyJavaScope.j(javaMethod);
                    if (lazyJavaScope.h(javaMethodDescriptorJ)) {
                        lazyJavaScope.f186999a.getComponents().getJavaResolverCache().recordMethod(javaMethod, javaMethodDescriptorJ);
                        arrayList.add(javaMethodDescriptorJ);
                    }
                }
                lazyJavaScope.b(name, arrayList);
                return arrayList;
            case 1:
                KProperty[] kPropertyArr2 = LazyJavaScope.f186998l;
                Intrinsics.checkNotNullParameter(name, "name");
                LazyJavaScope lazyJavaScope3 = lazyJavaScope.f187000b;
                if (lazyJavaScope3 != null) {
                    return (PropertyDescriptor) lazyJavaScope3.f.invoke(name);
                }
                JavaField javaFieldFindFieldByName = ((DeclaredMemberIndex) lazyJavaScope.d.invoke()).findFieldByName(name);
                if (javaFieldFindFieldByName == null || javaFieldFindFieldByName.isEnumEntry()) {
                    return null;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                boolean z = !javaFieldFindFieldByName.isFinal();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaScope.f186999a;
                JavaPropertyDescriptor javaPropertyDescriptorCreate = JavaPropertyDescriptor.create(lazyJavaScope.getOwnerDescriptor(), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaFieldFindFieldByName), Modality.FINAL, UtilsKt.toDescriptorVisibility(javaFieldFindFieldByName.getVisibility()), z, javaFieldFindFieldByName.getName(), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaFieldFindFieldByName), javaFieldFindFieldByName.isFinal() && javaFieldFindFieldByName.isStatic());
                Intrinsics.checkNotNullExpressionValue(javaPropertyDescriptorCreate, "create(...)");
                ref$ObjectRef.f186409a = javaPropertyDescriptorCreate;
                javaPropertyDescriptorCreate.initialize(null, null, null, null);
                KotlinType kotlinTypeTransformJavaType = lazyJavaResolverContext.getTypeResolver().transformJavaType(javaFieldFindFieldByName.getType(), JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null));
                if ((KotlinBuiltIns.isPrimitiveType(kotlinTypeTransformJavaType) || KotlinBuiltIns.isString(kotlinTypeTransformJavaType)) && javaFieldFindFieldByName.isFinal() && javaFieldFindFieldByName.isStatic() && javaFieldFindFieldByName.getHasConstantNotNullInitializer()) {
                    kotlinTypeTransformJavaType = TypeUtils.makeNotNullable(kotlinTypeTransformJavaType);
                    Intrinsics.checkNotNullExpressionValue(kotlinTypeTransformJavaType, "makeNotNullable(...)");
                }
                PropertyDescriptorImpl propertyDescriptorImpl = (PropertyDescriptorImpl) ref$ObjectRef.f186409a;
                f0 f0Var = f0.f322471a;
                propertyDescriptorImpl.setType(kotlinTypeTransformJavaType, f0Var, lazyJavaScope.g(), null, f0Var);
                DeclarationDescriptor ownerDescriptor = lazyJavaScope.getOwnerDescriptor();
                ClassDescriptor classDescriptor = ownerDescriptor instanceof ClassDescriptor ? (ClassDescriptor) ownerDescriptor : null;
                if (classDescriptor != null) {
                    ref$ObjectRef.f186409a = lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().modifyField(classDescriptor, (PropertyDescriptorImpl) ref$ObjectRef.f186409a, lazyJavaResolverContext);
                }
                Object obj3 = ref$ObjectRef.f186409a;
                if (DescriptorUtils.shouldRecordInitializerForProperty((VariableDescriptor) obj3, ((PropertyDescriptorImpl) obj3).getType())) {
                    ((PropertyDescriptorImpl) ref$ObjectRef.f186409a).setCompileTimeInitializerFactory(new k(lazyJavaScope, javaFieldFindFieldByName, ref$ObjectRef, i2));
                }
                lazyJavaResolverContext.getComponents().getJavaResolverCache().recordField(javaFieldFindFieldByName, (PropertyDescriptor) ref$ObjectRef.f186409a);
                return (PropertyDescriptor) ref$ObjectRef.f186409a;
            case 2:
                KProperty[] kPropertyArr3 = LazyJavaScope.f186998l;
                Intrinsics.checkNotNullParameter(name, "name");
                MemoizedFunctionToNotNull memoizedFunctionToNotNull = lazyJavaScope.e;
                LazyJavaResolverContext lazyJavaResolverContext2 = lazyJavaScope.f186999a;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) memoizedFunctionToNotNull.invoke(name));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : linkedHashSet) {
                    String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) obj4, false, false, 2, null);
                    Object objO = linkedHashMap.get(strComputeJvmDescriptor$default);
                    if (objO == null) {
                        objO = v0.a.o(linkedHashMap, strComputeJvmDescriptor$default);
                    }
                    ((List) objO).add(obj4);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionSelectMostSpecificInEachOverridableGroup = OverridingUtilsKt.selectMostSpecificInEachOverridableGroup(list2, f.f236888c);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionSelectMostSpecificInEachOverridableGroup);
                    }
                }
                lazyJavaScope.d(linkedHashSet, name);
                return d0.d1(lazyJavaResolverContext2.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext2, linkedHashSet));
            default:
                KProperty[] kPropertyArr4 = LazyJavaScope.f186998l;
                Intrinsics.checkNotNullParameter(name, "name");
                ArrayList arrayList2 = new ArrayList();
                MemoizedFunctionToNullable memoizedFunctionToNullable = lazyJavaScope.f;
                LazyJavaResolverContext lazyJavaResolverContext3 = lazyJavaScope.f186999a;
                CollectionsKt.addIfNotNull(arrayList2, memoizedFunctionToNullable.invoke(name));
                lazyJavaScope.e(name, arrayList2);
                return DescriptorUtils.isAnnotationClass(lazyJavaScope.getOwnerDescriptor()) ? d0.d1(arrayList2) : d0.d1(lazyJavaResolverContext3.getComponents().getSignatureEnhancement().enhanceSignatures(lazyJavaResolverContext3, arrayList2));
        }
    }
}
