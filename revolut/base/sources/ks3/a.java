package ks3;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class a implements c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a BANNER;
    public static final a EXPIRED;
    public static final a FAILURE;
    public static final a IN_PROGRESS;
    public static final a NOT_AVAILABLE;
    public static final a PRODUCT_ARTICLES;
    public static final a REJECTED;
    public static final a STATUS_DIALOG;
    public static final a WORKFLOW;

    static {
        a aVar = new a("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = aVar;
        a aVar2 = new a("BANNER", 1);
        BANNER = aVar2;
        a aVar3 = new a("EXPIRED", 2);
        EXPIRED = aVar3;
        a aVar4 = new a("REJECTED", 3);
        REJECTED = aVar4;
        a aVar5 = new a("IN_PROGRESS", 4);
        IN_PROGRESS = aVar5;
        a aVar6 = new a("STATUS_DIALOG", 5);
        STATUS_DIALOG = aVar6;
        a aVar7 = new a("PRODUCT_ARTICLES", 6);
        PRODUCT_ARTICLES = aVar7;
        a aVar8 = new a("FAILURE", 7);
        FAILURE = aVar8;
        a aVar9 = new a("WORKFLOW", 8);
        WORKFLOW = aVar9;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9};
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
