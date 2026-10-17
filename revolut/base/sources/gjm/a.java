package gjm;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static ClassLiteralValue a(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(cls, "getComponentType(...)");
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new ClassLiteralValue(ClassId.Companion.topLevel(StandardNames.FqNames.unit.toSafe()), i);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            return i > 0 ? new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getArrayTypeFqName()), i - 1) : new ClassLiteralValue(ClassId.Companion.topLevel(primitiveType.getTypeFqName()), i);
        }
        ClassId classId = ReflectClassUtilKt.getClassId(cls);
        ClassId classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId.asSingleFqName());
        if (classIdMapJavaToKotlin != null) {
            classId = classIdMapJavaToKotlin;
        }
        return new ClassLiteralValue(classId, i);
    }

    public static void b(KotlinJvmBinaryClass.AnnotationVisitor annotationVisitor, Annotation annotation) throws InvocationTargetException {
        Class clsO = nim.a.o(nim.a.l(annotation));
        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationVisitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsO), new ReflectAnnotationSource(annotation));
        if (annotationArgumentVisitorVisitAnnotation != null) {
            c(annotationArgumentVisitorVisitAnnotation, annotation, clsO);
        }
    }

    public static void c(KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitor, Annotation annotation, Class cls) throws InvocationTargetException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                Intrinsics.h(objInvoke);
                Name nameIdentifier = Name.identifier(method.getName());
                Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    annotationArgumentVisitor.visitClassLiteral(nameIdentifier, a((Class) objInvoke));
                } else if (ReflectKotlinClassKt.f186687a.contains(enclosingClass)) {
                    annotationArgumentVisitor.visit(nameIdentifier, objInvoke);
                } else if (ReflectClassUtilKt.isEnumClassOrSpecializedEnumEntryClass(enclosingClass)) {
                    if (!enclosingClass.isEnum()) {
                        enclosingClass = enclosingClass.getEnclosingClass();
                    }
                    Intrinsics.h(enclosingClass);
                    ClassId classId = ReflectClassUtilKt.getClassId(enclosingClass);
                    Name nameIdentifier2 = Name.identifier(((Enum) objInvoke).name());
                    Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
                    annotationArgumentVisitor.visitEnum(nameIdentifier, classId, nameIdentifier2);
                } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                    Class<?>[] interfaces = enclosingClass.getInterfaces();
                    Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
                    Class cls2 = (Class) d.j0(interfaces);
                    Intrinsics.h(cls2);
                    KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = annotationArgumentVisitor.visitAnnotation(nameIdentifier, ReflectClassUtilKt.getClassId(cls2));
                    if (annotationArgumentVisitorVisitAnnotation != null) {
                        c(annotationArgumentVisitorVisitAnnotation, (Annotation) objInvoke, cls2);
                    }
                } else {
                    if (!enclosingClass.isArray()) {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                    }
                    KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor annotationArrayArgumentVisitorVisitArray = annotationArgumentVisitor.visitArray(nameIdentifier);
                    if (annotationArrayArgumentVisitorVisitArray != null) {
                        Class<?> componentType = enclosingClass.getComponentType();
                        if (componentType.isEnum()) {
                            ClassId classId2 = ReflectClassUtilKt.getClassId(componentType);
                            for (Object obj2 : (Object[]) objInvoke) {
                                Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.Enum<*>");
                                Name nameIdentifier3 = Name.identifier(((Enum) obj2).name());
                                Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
                                annotationArrayArgumentVisitorVisitArray.visitEnum(classId2, nameIdentifier3);
                            }
                        } else if (componentType.equals(Class.class)) {
                            for (Object obj3 : (Object[]) objInvoke) {
                                Intrinsics.i(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                annotationArrayArgumentVisitorVisitArray.visitClassLiteral(a((Class) obj3));
                            }
                        } else if (Annotation.class.isAssignableFrom(componentType)) {
                            for (Object obj4 : (Object[]) objInvoke) {
                                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation2 = annotationArrayArgumentVisitorVisitArray.visitAnnotation(ReflectClassUtilKt.getClassId(componentType));
                                if (annotationArgumentVisitorVisitAnnotation2 != null) {
                                    Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Annotation");
                                    c(annotationArgumentVisitorVisitAnnotation2, (Annotation) obj4, componentType);
                                }
                            }
                        } else {
                            for (Object obj5 : (Object[]) objInvoke) {
                                annotationArrayArgumentVisitorVisitArray.visit(obj5);
                            }
                        }
                        annotationArrayArgumentVisitorVisitArray.visitEnd();
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        annotationArgumentVisitor.visitEnd();
    }
}
