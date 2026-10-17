package ml;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DOCUMENT_NFC;
    public static final f DOCUMENT_PHOTO;
    public static final f DOCUMENT_VIDEO;

    static {
        f fVar = new f("DOCUMENT_PHOTO", 0);
        DOCUMENT_PHOTO = fVar;
        f fVar2 = new f("DOCUMENT_VIDEO", 1);
        DOCUMENT_VIDEO = fVar2;
        f fVar3 = new f("DOCUMENT_NFC", 2);
        DOCUMENT_NFC = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = vc.s.n(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
