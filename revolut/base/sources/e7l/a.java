package e7l;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DIRECT_LINK;
    public static final a OAUTH;
    public static final a OAUTH_ONCE;

    @NotNull
    private final String type;

    static {
        a aVar = new a("OAUTH", 0, "OAUTH");
        OAUTH = aVar;
        a aVar2 = new a("DIRECT_LINK", 1, "DIRECT_LINK");
        DIRECT_LINK = aVar2;
        a aVar3 = new a("OAUTH_ONCE", 2, "OAUTH_ONCE");
        OAUTH_ONCE = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = vc.s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.type = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String a() {
        return this.type;
    }
}
