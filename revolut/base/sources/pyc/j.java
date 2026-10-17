package pyc;

import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class j {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j ADD_NOTE;
    public static final j DOCUMENT_TYPE;
    public static final j EVIDENCE_DESCRIPTION;
    public static final j EVIDENCE_LIST;
    public static final j EVIDENCE_TYPES;
    public static final j HOME;
    public static final j OTHER_DOCUMENT;
    public static final j STATUS;
    public static final j STORIES;
    public static final j SUMMARY;

    static {
        j jVar = new j("STORIES", 0);
        STORIES = jVar;
        j jVar2 = new j("HOME", 1);
        HOME = jVar2;
        j jVar3 = new j("STATUS", 2);
        STATUS = jVar3;
        j jVar4 = new j("EVIDENCE_TYPES", 3);
        EVIDENCE_TYPES = jVar4;
        j jVar5 = new j("EVIDENCE_DESCRIPTION", 4);
        EVIDENCE_DESCRIPTION = jVar5;
        j jVar6 = new j("EVIDENCE_LIST", 5);
        EVIDENCE_LIST = jVar6;
        j jVar7 = new j("SUMMARY", 6);
        SUMMARY = jVar7;
        j jVar8 = new j("ADD_NOTE", 7);
        ADD_NOTE = jVar8;
        j jVar9 = new j("DOCUMENT_TYPE", 8);
        DOCUMENT_TYPE = jVar9;
        j jVar10 = new j("OTHER_DOCUMENT", 9);
        OTHER_DOCUMENT = jVar10;
        j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10};
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
