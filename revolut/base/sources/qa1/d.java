package qa1;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ATTACKED;

    @NotNull
    public static final c Companion;
    public static final d PERSONALIZED;
    public static final d READY;
    public static final d SECURED;
    public static final d UNKNOWN;

    @NotNull
    private final String key;

    static {
        d dVar = new d("PERSONALIZED", 0, "PERSONALIZED");
        PERSONALIZED = dVar;
        d dVar2 = new d("READY", 1, "READY");
        READY = dVar2;
        d dVar3 = new d("SECURED", 2, "SECURED");
        SECURED = dVar3;
        d dVar4 = new d("ATTACKED", 3, "ATTACKED");
        ATTACKED = dVar4;
        d dVar5 = new d("UNKNOWN", 4, "UNKNOWN");
        UNKNOWN = dVar5;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, String str2) {
        this.key = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.key;
    }
}
