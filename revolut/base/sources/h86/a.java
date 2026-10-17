package h86;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ANDROID;
    public static final a APPLE;
    public static final a BROWSER;
    public static final a UNKNOWN;

    @NotNull
    private final String capitalizedName;

    static {
        a aVar = new a("APPLE", 0, "Apple");
        APPLE = aVar;
        a aVar2 = new a("ANDROID", 1, "Android");
        ANDROID = aVar2;
        a aVar3 = new a("BROWSER", 2, "Browser");
        BROWSER = aVar3;
        a aVar4 = new a("UNKNOWN", 3, "Unknown");
        UNKNOWN = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.capitalizedName = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.capitalizedName;
    }
}
