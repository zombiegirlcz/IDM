package pjm;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f236877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyJavaAnnotationDescriptor f236878b;

    public /* synthetic */ a(LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor, int i) {
        this.f236877a = i;
        this.f236878b = lazyJavaAnnotationDescriptor;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f236877a;
        LazyJavaAnnotationDescriptor lazyJavaAnnotationDescriptor = this.f236878b;
        switch (i) {
            case 0:
                ClassId classId = lazyJavaAnnotationDescriptor.f186965b.getClassId();
                if (classId != null) {
                    return classId.asSingleFqName();
                }
                return null;
            case 1:
                KProperty[] kPropertyArr = LazyJavaAnnotationDescriptor.i;
                FqName fqName = lazyJavaAnnotationDescriptor.getFqName();
                JavaAnnotation javaAnnotation = lazyJavaAnnotationDescriptor.f186965b;
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaAnnotationDescriptor.f186964a;
                if (fqName == null) {
                    return ErrorUtils.createErrorType(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, javaAnnotation.toString());
                }
                ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(JavaToKotlinClassMapper.INSTANCE, fqName, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
                if (classDescriptorMapJavaToKotlin$default == null) {
                    JavaClass javaClassResolve = javaAnnotation.resolve();
                    ClassDescriptor classDescriptorResolveClass = javaClassResolve != null ? lazyJavaResolverContext.getComponents().getModuleClassResolver().resolveClass(javaClassResolve) : null;
                    classDescriptorMapJavaToKotlin$default = classDescriptorResolveClass == null ? FindClassInModuleKt.findNonGenericClassAcrossDependencies(lazyJavaResolverContext.getModule(), ClassId.Companion.topLevel(fqName), lazyJavaResolverContext.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses()) : classDescriptorResolveClass;
                }
                return classDescriptorMapJavaToKotlin$default.getDefaultType();
            default:
                Collection<JavaAnnotationArgument> arguments = lazyJavaAnnotationDescriptor.f186965b.getArguments();
                ArrayList arrayList = new ArrayList();
                for (JavaAnnotationArgument javaAnnotationArgument : arguments) {
                    Name name = javaAnnotationArgument.getName();
                    if (name == null) {
                        name = JvmAnnotationNames.DEFAULT_ANNOTATION_MEMBER_NAME;
                    }
                    ConstantValue constantValueA = lazyJavaAnnotationDescriptor.a(javaAnnotationArgument);
                    Pair pair = constantValueA != null ? new Pair(name, constantValueA) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return r0.t(arrayList);
        }
    }
}
