package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.security.AccessControlException;
import java.util.HashMap;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import tjm.e;
import tjm.h;

/* JADX INFO: loaded from: classes13.dex */
public class ReadKotlinClassHeaderAnnotationVisitor implements KotlinJvmBinaryClass.AnnotationVisitor {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f187110j;
    public static final HashMap k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f187111a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f187112b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f187113c = 0;
    public String d = null;
    public String[] e = null;
    public String[] f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f187114g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public KotlinClassHeader.Kind f187115h = null;
    public String[] i = null;

    static {
        try {
            f187110j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f187110j = false;
        }
        HashMap map = new HashMap();
        k = map;
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        map.put(ClassId.topLevel(new FqName("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public KotlinClassHeader createHeader(MetadataVersion metadataVersion) {
        if (this.f187115h == null || this.f187111a == null) {
            return null;
        }
        MetadataVersion metadataVersion2 = new MetadataVersion(this.f187111a, (this.f187113c & 8) != 0);
        if (metadataVersion2.isCompatible(metadataVersion)) {
            KotlinClassHeader.Kind kind = this.f187115h;
            if ((kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) && this.e == null) {
                return null;
            }
        } else {
            this.f187114g = this.e;
            this.e = null;
        }
        String[] strArr = this.i;
        return new KotlinClassHeader(this.f187115h, metadataVersion2, this.e, this.f187114g, this.f, this.f187112b, this.f187113c, this.d, strArr != null ? BitEncoding.decodeBytes(strArr) : null);
    }

    public KotlinClassHeader createHeaderWithDefaultMetadataVersion() {
        return createHeader(MetadataVersion.INSTANCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public KotlinJvmBinaryClass.AnnotationArgumentVisitor visitAnnotation(@NotNull ClassId classId, @NotNull SourceElement sourceElement) {
        KotlinClassHeader.Kind kind;
        if (classId == null) {
            a(0);
            throw null;
        }
        if (sourceElement == null) {
            a(1);
            throw null;
        }
        FqName fqNameAsSingleFqName = classId.asSingleFqName();
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.METADATA_FQ_NAME)) {
            return new a(this);
        }
        if (fqNameAsSingleFqName.equals(JvmAnnotationNames.SERIALIZED_IR_FQ_NAME)) {
            return new e(this);
        }
        if (f187110j || this.f187115h != null || (kind = (KotlinClassHeader.Kind) k.get(classId)) == null) {
            return null;
        }
        this.f187115h = kind;
        return new h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationVisitor
    public void visitEnd() {
    }
}
