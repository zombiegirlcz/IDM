package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import d9.t0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.ReadKotlinClassHeaderAnnotationVisitor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.text.a0;
import nim.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ReflectKotlinClass implements KotlinJvmBinaryClass {

    @NotNull
    public static final Factory Factory = new Factory(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f186683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinClassHeader f186684b;

    public static final class Factory {
        public Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ReflectKotlinClass create(@NotNull Class<?> klass) throws InvocationTargetException {
            Intrinsics.checkNotNullParameter(klass, "klass");
            ReadKotlinClassHeaderAnnotationVisitor visitor = new ReadKotlinClassHeaderAnnotationVisitor();
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter(visitor, "visitor");
            Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
            Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
            for (Annotation annotation : declaredAnnotations) {
                Intrinsics.h(annotation);
                Class clsO = a.o(a.l(annotation));
                KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = visitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsO), new ReflectAnnotationSource(annotation));
                if (annotationArgumentVisitorVisitAnnotation != null) {
                    gjm.a.c(annotationArgumentVisitorVisitAnnotation, annotation, clsO);
                }
            }
            visitor.visitEnd();
            KotlinClassHeader kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion = visitor.createHeaderWithDefaultMetadataVersion();
            if (kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion == null) {
                return null;
            }
            return new ReflectKotlinClass(klass, kotlinClassHeaderCreateHeaderWithDefaultMetadataVersion, null);
        }
    }

    public ReflectKotlinClass(Class cls, KotlinClassHeader kotlinClassHeader, DefaultConstructorMarker defaultConstructorMarker) {
        this.f186683a = cls;
        this.f186684b = kotlinClassHeader;
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof ReflectKotlinClass) {
            return Intrinsics.f(this.f186683a, ((ReflectKotlinClass) obj2).f186683a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public KotlinClassHeader getClassHeader() {
        return this.f186684b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public ClassId getClassId() {
        return ReflectClassUtilKt.getClassId(this.f186683a);
    }

    @NotNull
    public final Class<?> getKlass() {
        return this.f186683a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    @NotNull
    public String getLocation() {
        StringBuilder sb6 = new StringBuilder();
        String name = this.f186683a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb6.append(a0.E(name, CoreConstants.DOT, '/'));
        sb6.append(".class");
        return sb6.toString();
    }

    public int hashCode() {
        return this.f186683a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void loadClassAnnotations(@NotNull KotlinJvmBinaryClass.AnnotationVisitor visitor, byte[] bArr) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Class klass = this.f186683a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            Intrinsics.h(annotation);
            Class clsO = a.o(a.l(annotation));
            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitAnnotation = visitor.visitAnnotation(ReflectClassUtilKt.getClassId(clsO), new ReflectAnnotationSource(annotation));
            if (annotationArgumentVisitorVisitAnnotation != null) {
                gjm.a.c(annotationArgumentVisitorVisitAnnotation, annotation, clsO);
            }
        }
        visitor.visitEnd();
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        d.A(ReflectKotlinClass.class, sb6, ": ");
        sb6.append(this.f186683a);
        return sb6.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass
    public void visitMembers(@NotNull KotlinJvmBinaryClass.MemberVisitor memberVisitor, byte[] bArr) throws InvocationTargetException {
        Constructor<?>[] constructorArr;
        Class cls;
        int i;
        int i2;
        Method[] methodArr;
        Intrinsics.checkNotNullParameter(memberVisitor, "visitor");
        Class klass = this.f186683a;
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(memberVisitor, "memberVisitor");
        Method[] declaredMethods = klass.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        int length = declaredMethods.length;
        int i3 = 0;
        while (i3 < length) {
            Method method = declaredMethods[i3];
            Name nameIdentifier = Name.identifier(method.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod = memberVisitor.visitMethod(nameIdentifier, t0.n(method));
            if (methodAnnotationVisitorVisitMethod == null) {
                methodArr = declaredMethods;
            } else {
                Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations, "getDeclaredAnnotations(...)");
                for (Annotation annotation : declaredAnnotations) {
                    Intrinsics.h(annotation);
                    gjm.a.b(methodAnnotationVisitorVisitMethod, annotation);
                }
                Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "getParameterAnnotations(...)");
                Annotation[][] annotationArr = parameterAnnotations;
                int length2 = annotationArr.length;
                for (int i5 = 0; i5 < length2; i5++) {
                    Annotation[] annotationArr2 = annotationArr[i5];
                    Intrinsics.h(annotationArr2);
                    int length3 = annotationArr2.length;
                    int i6 = 0;
                    while (i6 < length3) {
                        Annotation annotation2 = annotationArr2[i6];
                        Class clsO = a.o(a.l(annotation2));
                        Method[] methodArr2 = declaredMethods;
                        KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation = methodAnnotationVisitorVisitMethod.visitParameterAnnotation(i5, ReflectClassUtilKt.getClassId(clsO), new ReflectAnnotationSource(annotation2));
                        if (annotationArgumentVisitorVisitParameterAnnotation != null) {
                            gjm.a.c(annotationArgumentVisitorVisitParameterAnnotation, annotation2, clsO);
                        }
                        i6++;
                        declaredMethods = methodArr2;
                    }
                }
                methodArr = declaredMethods;
                methodAnnotationVisitorVisitMethod.visitEnd();
            }
            i3++;
            declaredMethods = methodArr;
        }
        Constructor<?>[] declaredConstructors = klass.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
        int length4 = declaredConstructors.length;
        int i21 = 0;
        while (i21 < length4) {
            Constructor<?> constructor = declaredConstructors[i21];
            Name name = SpecialNames.INIT;
            Intrinsics.h(constructor);
            KotlinJvmBinaryClass.MethodAnnotationVisitor methodAnnotationVisitorVisitMethod2 = memberVisitor.visitMethod(name, t0.b(constructor));
            if (methodAnnotationVisitorVisitMethod2 == null) {
                constructorArr = declaredConstructors;
                cls = klass;
                i = length4;
                i2 = i21;
            } else {
                Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations2, "getDeclaredAnnotations(...)");
                for (Annotation annotation3 : declaredAnnotations2) {
                    Intrinsics.h(annotation3);
                    gjm.a.b(methodAnnotationVisitorVisitMethod2, annotation3);
                }
                Annotation[][] parameterAnnotations2 = constructor.getParameterAnnotations();
                Intrinsics.h(parameterAnnotations2);
                if (parameterAnnotations2.length != 0) {
                    int length5 = constructor.getParameterTypes().length - parameterAnnotations2.length;
                    int length6 = parameterAnnotations2.length;
                    for (int i22 = 0; i22 < length6; i22++) {
                        Annotation[] annotationArr3 = parameterAnnotations2[i22];
                        Intrinsics.h(annotationArr3);
                        int length7 = annotationArr3.length;
                        int i32 = 0;
                        while (i32 < length7) {
                            Constructor<?>[] constructorArr2 = declaredConstructors;
                            Annotation annotation4 = annotationArr3[i32];
                            Class clsO2 = a.o(a.l(annotation4));
                            Class cls2 = klass;
                            int i33 = length4;
                            int i43 = i21;
                            KotlinJvmBinaryClass.AnnotationArgumentVisitor annotationArgumentVisitorVisitParameterAnnotation2 = methodAnnotationVisitorVisitMethod2.visitParameterAnnotation(i22 + length5, ReflectClassUtilKt.getClassId(clsO2), new ReflectAnnotationSource(annotation4));
                            if (annotationArgumentVisitorVisitParameterAnnotation2 != null) {
                                gjm.a.c(annotationArgumentVisitorVisitParameterAnnotation2, annotation4, clsO2);
                            }
                            i32++;
                            declaredConstructors = constructorArr2;
                            klass = cls2;
                            length4 = i33;
                            i21 = i43;
                        }
                    }
                }
                constructorArr = declaredConstructors;
                cls = klass;
                i = length4;
                i2 = i21;
                methodAnnotationVisitorVisitMethod2.visitEnd();
            }
            i21 = i2 + 1;
            declaredConstructors = constructorArr;
            klass = cls;
            length4 = i;
        }
        Field[] declaredFields = klass.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
        for (Field field : declaredFields) {
            Name nameIdentifier2 = Name.identifier(field.getName());
            Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
            KotlinJvmBinaryClass.AnnotationVisitor annotationVisitorVisitField = memberVisitor.visitField(nameIdentifier2, t0.c(field), null);
            if (annotationVisitorVisitField != null) {
                Annotation[] declaredAnnotations3 = field.getDeclaredAnnotations();
                Intrinsics.checkNotNullExpressionValue(declaredAnnotations3, "getDeclaredAnnotations(...)");
                for (Annotation annotation5 : declaredAnnotations3) {
                    Intrinsics.h(annotation5);
                    gjm.a.b(annotationVisitorVisitField, annotation5);
                }
                annotationVisitorVisitField.visitEnd();
            }
        }
    }
}
