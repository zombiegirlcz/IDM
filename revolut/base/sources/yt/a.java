package yt;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a IDENTITY_CARD;
    public static final a PASSPORT;
    public static final a RESIDENCE_PERMIT;

    static {
        a aVar = new a("PASSPORT", 0);
        PASSPORT = aVar;
        a aVar2 = new a("IDENTITY_CARD", 1);
        IDENTITY_CARD = aVar2;
        a aVar3 = new a("RESIDENCE_PERMIT", 2);
        RESIDENCE_PERMIT = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
