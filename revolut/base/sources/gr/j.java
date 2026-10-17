package gr;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j BIRTH_CERTIFICATE;
    public static final j DRIVING_LICENCE;
    public static final j IDENTITY_CARD;
    public static final j PASSPORT;
    public static final j RESIDENCE_PERMIT;
    public static final j VISA;

    static {
        j jVar = new j("PASSPORT", 0);
        PASSPORT = jVar;
        j jVar2 = new j("DRIVING_LICENCE", 1);
        DRIVING_LICENCE = jVar2;
        j jVar3 = new j("RESIDENCE_PERMIT", 2);
        RESIDENCE_PERMIT = jVar3;
        j jVar4 = new j("IDENTITY_CARD", 3);
        IDENTITY_CARD = jVar4;
        j jVar5 = new j("VISA", 4);
        VISA = jVar5;
        j jVar6 = new j("BIRTH_CERTIFICATE", 5);
        BIRTH_CERTIFICATE = jVar6;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6};
        $VALUES = jVarArr;
        $ENTRIES = vc.s.n(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
