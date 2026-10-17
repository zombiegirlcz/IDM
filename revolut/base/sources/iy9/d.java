package iy9;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d BENEFICIARY;
    public static final d CARD_OWNER;
    public static final d COMPANY;
    public static final d USER;

    @NotNull
    private final String value;

    static {
        d dVar = new d("USER", 0, "USER");
        USER = dVar;
        d dVar2 = new d("BENEFICIARY", 1, "BENEFICIARY");
        BENEFICIARY = dVar2;
        d dVar3 = new d("CARD_OWNER", 2, "CARD_OWNER");
        CARD_OWNER = dVar3;
        d dVar4 = new d("COMPANY", 3, "COMPANY");
        COMPANY = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.value = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.value;
    }
}
