package z1m;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b RESIDENCE_CARD;
    public static final b SPECIAL_PERMANENT_RESIDENT_CERTIFICATE;
    public static final b UNKNOWN;
    private final int code;

    static {
        b bVar = new b("UNKNOWN", 0, 0);
        UNKNOWN = bVar;
        b bVar2 = new b("RESIDENCE_CARD", 1, 1);
        RESIDENCE_CARD = bVar2;
        b bVar3 = new b("SPECIAL_PERMANENT_RESIDENT_CERTIFICATE", 2, 2);
        SPECIAL_PERMANENT_RESIDENT_CERTIFICATE = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, int i2) {
        this.code = i2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
