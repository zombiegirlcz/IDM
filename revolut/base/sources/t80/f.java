package t80;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f BMP;
    public static final f DOC;
    public static final f DOCX;
    public static final f GIF;
    public static final f HEIC;
    public static final f JPEG;
    public static final f PDF;
    public static final f PNG;
    public static final f TIFF;
    public static final f WEBP;

    @NotNull
    private final String[] mimeTypes;

    static {
        f fVar = new f("PDF", new String[]{"application/pdf"}, 0);
        PDF = fVar;
        f fVar2 = new f("JPEG", new String[]{"image/jpeg"}, 1);
        JPEG = fVar2;
        f fVar3 = new f("PNG", new String[]{"image/png"}, 2);
        PNG = fVar3;
        f fVar4 = new f("HEIC", new String[]{"image/heic"}, 3);
        HEIC = fVar4;
        f fVar5 = new f("GIF", new String[]{"image/gif"}, 4);
        GIF = fVar5;
        f fVar6 = new f("TIFF", new String[]{"image/tiff"}, 5);
        TIFF = fVar6;
        f fVar7 = new f("BMP", new String[]{"image/bmp", "image/x-bmp", "image/x-ms-bmp"}, 6);
        BMP = fVar7;
        f fVar8 = new f("WEBP", new String[]{"image/webp"}, 7);
        WEBP = fVar8;
        f fVar9 = new f("DOC", new String[]{"application/msword"}, 8);
        DOC = fVar9;
        f fVar10 = new f("DOCX", new String[]{"application/vnd.openxmlformats-officedocument.wordprocessingml.document"}, 9);
        DOCX = fVar10;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public f(String str, String[] strArr, int i) {
        this.mimeTypes = strArr;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String[] a() {
        return this.mimeTypes;
    }
}
