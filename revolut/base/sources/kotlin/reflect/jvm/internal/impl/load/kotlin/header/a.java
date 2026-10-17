package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ClassLiteralValue;
import tjm.b;
import tjm.c;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements KotlinJvmBinaryClass.AnnotationArgumentVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ReadKotlinClassHeaderAnnotationVisitor f187116a;

    public a(ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor) {
        this.f187116a = readKotlinClassHeaderAnnotationVisitor;
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "enumClassId";
        } else if (i == 2) {
            objArr[0] = "enumEntryName";
        } else if (i != 3) {
            objArr[0] = "classLiteralValue";
        } else {
            objArr[0] = "classId";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
        if (i == 1 || i == 2) {
            objArr[2] = "visitEnum";
        } else if (i != 3) {
            objArr[2] = "visitClassLiteral";
        } else {
            objArr[2] = "visitAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visit(Name name, Object obj2) {
        if (name == null) {
            return;
        }
        String strAsString = name.asString();
        boolean zEquals = "k".equals(strAsString);
        ReadKotlinClassHeaderAnnotationVisitor readKotlinClassHeaderAnnotationVisitor = this.f187116a;
        if (zEquals) {
            if (obj2 instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor.f187115h = KotlinClassHeader.Kind.getById(((Integer) obj2).intValue());
                return;
            }
            return;
        }
        if ("mv".equals(strAsString)) {
            if (obj2 instanceof int[]) {
                readKotlinClassHeaderAnnotationVisitor.f187111a = (int[]) obj2;
                return;
            }
            return;
        }
        if ("xs".equals(strAsString)) {
            if (obj2 instanceof String) {
                String str = (String) obj2;
                if (str.isEmpty()) {
                    return;
                }
                readKotlinClassHeaderAnnotationVisitor.f187112b = str;
                return;
            }
            return;
        }
        if ("xi".equals(strAsString)) {
            if (obj2 instanceof Integer) {
                readKotlinClassHeaderAnnotationVisitor.f187113c = ((Integer) obj2).intValue();
            }
        } else if ("pn".equals(strAsString) && (obj2 instanceof String)) {
            String str2 = (String) obj2;
            if (str2.isEmpty()) {
                return;
            }
            readKotlinClassHeaderAnnotationVisitor.d = str2;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(Name name, ClassId classId) {
        if (classId != null) {
            return null;
        }
        a(3);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final KotlinJvmBinaryClass.AnnotationArrayArgumentVisitor visitArray(Name name) {
        String strAsString = name != null ? name.asString() : null;
        if ("d1".equals(strAsString)) {
            return new b(this);
        }
        if ("d2".equals(strAsString)) {
            return new c(this);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitClassLiteral(Name name, ClassLiteralValue classLiteralValue) {
        if (classLiteralValue != null) {
            return;
        }
        a(0);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnd() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor
    public final void visitEnum(Name name, ClassId classId, Name name2) {
        if (classId == null) {
            a(1);
            throw null;
        }
        if (name2 != null) {
            return;
        }
        a(2);
        throw null;
    }
}
