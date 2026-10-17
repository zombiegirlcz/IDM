package av;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BACK;
    public static final a FRONT;
    public static final a FRONT_VIDEO;
    public static final a SELFIE;
    public static final a SELFIE_VIDEO;

    @NotNull
    private final String value;

    static {
        a aVar = new a("FRONT", 0, "FRONT");
        FRONT = aVar;
        a aVar2 = new a("BACK", 1, "BACK");
        BACK = aVar2;
        a aVar3 = new a("SELFIE", 2, "SELFIE");
        SELFIE = aVar3;
        a aVar4 = new a("SELFIE_VIDEO", 3, "SELFIE_VIDEO");
        SELFIE_VIDEO = aVar4;
        a aVar5 = new a("FRONT_VIDEO", 4, "FRONT_VIDEO");
        FRONT_VIDEO = aVar5;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.value = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
