package h00;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c DRIVING_LICENCE;
    public static final c NATIONAL_IDENTITY_CARD;
    public static final c PASSPORT;
    public static final c PASSPORT_CARD;
    public static final c RESIDENCE_PERMIT;

    static {
        c cVar = new c("PASSPORT", 0);
        PASSPORT = cVar;
        c cVar2 = new c("NATIONAL_IDENTITY_CARD", 1);
        NATIONAL_IDENTITY_CARD = cVar2;
        c cVar3 = new c("DRIVING_LICENCE", 2);
        DRIVING_LICENCE = cVar3;
        c cVar4 = new c("RESIDENCE_PERMIT", 3);
        RESIDENCE_PERMIT = cVar4;
        c cVar5 = new c("PASSPORT_CARD", 4);
        PASSPORT_CARD = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
