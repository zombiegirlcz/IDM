package up5;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d END_OF_FLOW_BACK;
    public static final d END_OF_FLOW_NEXT;
    public static final d REVIEW;
    public static final d SUMMARY;

    static {
        d dVar = new d("REVIEW", 0);
        REVIEW = dVar;
        d dVar2 = new d("SUMMARY", 1);
        SUMMARY = dVar2;
        d dVar3 = new d("END_OF_FLOW_NEXT", 2);
        END_OF_FLOW_NEXT = dVar3;
        d dVar4 = new d("END_OF_FLOW_BACK", 3);
        END_OF_FLOW_BACK = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = vc.s.n(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
