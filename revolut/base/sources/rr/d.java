package rr;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d COMPACT_SELFIE;
    public static final d DYNAMIC_INSTRUCTIONS;
    public static final d FACE_EMBEDDING;
    public static final d UNKNOWN;

    static {
        d dVar = new d("FACE_EMBEDDING", 0);
        FACE_EMBEDDING = dVar;
        d dVar2 = new d("COMPACT_SELFIE", 1);
        COMPACT_SELFIE = dVar2;
        d dVar3 = new d("DYNAMIC_INSTRUCTIONS", 2);
        DYNAMIC_INSTRUCTIONS = dVar3;
        d dVar4 = new d("UNKNOWN", 3);
        UNKNOWN = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
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
