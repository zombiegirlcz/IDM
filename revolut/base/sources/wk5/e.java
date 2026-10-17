package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class e {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e ADDITIONAL_DETAILS;
    public static final e MESH;
    public static final e MESH_TRANSFER;
    public static final e SELF_ATTESTATION;

    static {
        e eVar = new e("SELF_ATTESTATION", 0);
        SELF_ATTESTATION = eVar;
        e eVar2 = new e("MESH", 1);
        MESH = eVar2;
        e eVar3 = new e("MESH_TRANSFER", 2);
        MESH_TRANSFER = eVar3;
        e eVar4 = new e("ADDITIONAL_DETAILS", 3);
        ADDITIONAL_DETAILS = eVar4;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4};
        $VALUES = eVarArr;
        $ENTRIES = s.n(eVarArr);
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
