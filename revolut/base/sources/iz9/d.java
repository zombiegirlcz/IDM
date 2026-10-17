package iz9;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d LOCAL;
    public static final d REMOTE_POLLING;
    public static final d REMOTE_SINGLE_FETCH;

    static {
        d dVar = new d("LOCAL", 0);
        LOCAL = dVar;
        d dVar2 = new d("REMOTE_SINGLE_FETCH", 1);
        REMOTE_SINGLE_FETCH = dVar2;
        d dVar3 = new d("REMOTE_POLLING", 2);
        REMOTE_POLLING = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
