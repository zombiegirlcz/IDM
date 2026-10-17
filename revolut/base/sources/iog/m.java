package iog;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class m {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m DOCUMENT_NUMBER_FIELD_ID;
    public static final m DOCUMENT_TYPE_FIELD_ID;
    public static final m FIRST_NAME_FIELD_ID;
    public static final m FIRST_SURNAME_FIELD_ID;
    public static final m RELATIONSHIP_FIELD_ID;
    public static final m SECOND_SURNAME_FIELD_ID;

    static {
        m mVar = new m("RELATIONSHIP_FIELD_ID", 0);
        RELATIONSHIP_FIELD_ID = mVar;
        m mVar2 = new m("FIRST_NAME_FIELD_ID", 1);
        FIRST_NAME_FIELD_ID = mVar2;
        m mVar3 = new m("FIRST_SURNAME_FIELD_ID", 2);
        FIRST_SURNAME_FIELD_ID = mVar3;
        m mVar4 = new m("SECOND_SURNAME_FIELD_ID", 3);
        SECOND_SURNAME_FIELD_ID = mVar4;
        m mVar5 = new m("DOCUMENT_TYPE_FIELD_ID", 4);
        DOCUMENT_TYPE_FIELD_ID = mVar5;
        m mVar6 = new m("DOCUMENT_NUMBER_FIELD_ID", 5);
        DOCUMENT_NUMBER_FIELD_ID = mVar6;
        m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6};
        $VALUES = mVarArr;
        $ENTRIES = s.n(mVarArr);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
