package aul;

import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b FIAT;
    public static final b SECURITY;

    static {
        b bVar = new b("FIAT", 0);
        FIAT = bVar;
        b bVar2 = new b("SECURITY", 1);
        SECURITY = bVar2;
        b[] bVarArr = {bVar, bVar2};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final b a() {
        int i = a.f9860a[ordinal()];
        if (i == 1) {
            return FIAT;
        }
        if (i == 2) {
            return SECURITY;
        }
        throw new NoWhenBranchMatchedException();
    }
}
