package o7g;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BAGGAGE;

    @NotNull
    public static final a Companion;
    public static final b SEAT;
    public static final b UNKNOWN;

    static {
        b bVar = new b("UNKNOWN", 0);
        UNKNOWN = bVar;
        b bVar2 = new b("BAGGAGE", 1);
        BAGGAGE = bVar2;
        b bVar3 = new b("SEAT", 2);
        SEAT = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
        Companion = new a();
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
