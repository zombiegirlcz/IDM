package kl7;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c CABRIOLET;
    public static final c COUPE;
    public static final c ESTATE;
    public static final c HATCHBACK;
    public static final c SALOON;

    static {
        c cVar = new c("CABRIOLET", 0);
        CABRIOLET = cVar;
        c cVar2 = new c("COUPE", 1);
        COUPE = cVar2;
        c cVar3 = new c("ESTATE", 2);
        ESTATE = cVar3;
        c cVar4 = new c("HATCHBACK", 3);
        HATCHBACK = cVar4;
        c cVar5 = new c("SALOON", 4);
        SALOON = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        $VALUES = cVarArr;
        $ENTRIES = vc.s.n(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
