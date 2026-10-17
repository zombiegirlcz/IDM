package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public interface KotlinJvmBinaryClass {

    public interface AnnotationArgumentVisitor {
        void visit(Name name, Object obj2);

        AnnotationArgumentVisitor visitAnnotation(Name name, @NotNull ClassId classId);

        AnnotationArrayArgumentVisitor visitArray(Name name);

        void visitClassLiteral(Name name, @NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(Name name, @NotNull ClassId classId, @NotNull Name name2);
    }

    public interface AnnotationArrayArgumentVisitor {
        void visit(Object obj2);

        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId);

        void visitClassLiteral(@NotNull ClassLiteralValue classLiteralValue);

        void visitEnd();

        void visitEnum(@NotNull ClassId classId, @NotNull Name name);
    }

    public interface AnnotationVisitor {
        AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement);

        void visitEnd();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface MemberVisitor {
        AnnotationVisitor visitField(@NotNull Name name, @NotNull String str, Object obj2);

        MethodAnnotationVisitor visitMethod(@NotNull Name name, @NotNull String str);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface MethodAnnotationVisitor extends AnnotationVisitor {
        AnnotationArgumentVisitor visitParameterAnnotation(int i, @NotNull ClassId classId, @NotNull SourceElement sourceElement);
    }

    @NotNull
    KotlinClassHeader getClassHeader();

    @NotNull
    ClassId getClassId();

    @NotNull
    String getLocation();

    void loadClassAnnotations(@NotNull AnnotationVisitor annotationVisitor, byte[] bArr);

    void visitMembers(@NotNull MemberVisitor memberVisitor, byte[] bArr);
}
