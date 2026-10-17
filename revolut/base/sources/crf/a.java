package crf;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a DOWNLOAD_CONFIRMATION;
    public static final a LOCATE_TRANSFER;
    public static final a RECALL_TRANSFER;
    public static final a VIEW_RECIPIENT_DETAILS;

    static {
        a aVar = new a("DOWNLOAD_CONFIRMATION", 0);
        DOWNLOAD_CONFIRMATION = aVar;
        a aVar2 = new a("VIEW_RECIPIENT_DETAILS", 1);
        VIEW_RECIPIENT_DETAILS = aVar2;
        a aVar3 = new a("LOCATE_TRANSFER", 2);
        LOCATE_TRANSFER = aVar3;
        a aVar4 = new a("RECALL_TRANSFER", 3);
        RECALL_TRANSFER = aVar4;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
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
