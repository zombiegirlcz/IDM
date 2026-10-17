package l7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ACCESS_WEBSITE;
    public static final b CHECK_IN;

    @NotNull
    public static final a Companion;
    public static final b ENTER_DETAILS;
    public static final b RECEIVE_BOARDING_PASS;
    public static final b UNKNOWN;

    static {
        b bVar = new b("ACCESS_WEBSITE", 0);
        ACCESS_WEBSITE = bVar;
        b bVar2 = new b("ENTER_DETAILS", 1);
        ENTER_DETAILS = bVar2;
        b bVar3 = new b("CHECK_IN", 2);
        CHECK_IN = bVar3;
        b bVar4 = new b("RECEIVE_BOARDING_PASS", 3);
        RECEIVE_BOARDING_PASS = bVar4;
        b bVar5 = new b("UNKNOWN", 4);
        UNKNOWN = bVar5;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        $VALUES = bVarArr;
        $ENTRIES = vc.s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
