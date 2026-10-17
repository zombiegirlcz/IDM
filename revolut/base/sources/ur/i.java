package ur;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i BIRTH_CERTIFICATE;
    public static final i DRIVING_LICENCE;
    public static final i IDENTITY_CARD;
    public static final i PASSPORT;
    public static final i RESIDENCE_PERMIT;
    public static final i VISA;

    static {
        i iVar = new i("PASSPORT", 0);
        PASSPORT = iVar;
        i iVar2 = new i("DRIVING_LICENCE", 1);
        DRIVING_LICENCE = iVar2;
        i iVar3 = new i("RESIDENCE_PERMIT", 2);
        RESIDENCE_PERMIT = iVar3;
        i iVar4 = new i("IDENTITY_CARD", 3);
        IDENTITY_CARD = iVar4;
        i iVar5 = new i("VISA", 4);
        VISA = iVar5;
        i iVar6 = new i("BIRTH_CERTIFICATE", 5);
        BIRTH_CERTIFICATE = iVar6;
        i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6};
        $VALUES = iVarArr;
        $ENTRIES = s.n(iVarArr);
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
