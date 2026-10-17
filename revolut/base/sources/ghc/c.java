package ghc;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c AVATAR_ICON;
    public static final c AVATAR_IMAGE;
    public static final c BOTTOM_SHEET;
    public static final c BOTTOM_SHEET_FOOTER_BUTTON;
    public static final c BOTTOM_SHEET_FOOTER_BUTTON_ACTION;
    public static final c DETAILS_ITEM;
    public static final c FOOTER_BOTTOM_SHEET_ACTION;
    public static final c FOOTER_CANCEL_ACTION;
    public static final c FOOTER_COPY_AND_OPEN_URL_ACTION;
    public static final c FOOTER_OPEN_URL_ACTION;
    public static final c FOOTER_SUBSCRIBE_ACTION;

    static {
        c cVar = new c("AVATAR_ICON", 0);
        AVATAR_ICON = cVar;
        c cVar2 = new c("AVATAR_IMAGE", 1);
        AVATAR_IMAGE = cVar2;
        c cVar3 = new c("FOOTER_OPEN_URL_ACTION", 2);
        FOOTER_OPEN_URL_ACTION = cVar3;
        c cVar4 = new c("FOOTER_COPY_AND_OPEN_URL_ACTION", 3);
        FOOTER_COPY_AND_OPEN_URL_ACTION = cVar4;
        c cVar5 = new c("FOOTER_SUBSCRIBE_ACTION", 4);
        FOOTER_SUBSCRIBE_ACTION = cVar5;
        c cVar6 = new c("FOOTER_CANCEL_ACTION", 5);
        FOOTER_CANCEL_ACTION = cVar6;
        c cVar7 = new c("FOOTER_BOTTOM_SHEET_ACTION", 6);
        FOOTER_BOTTOM_SHEET_ACTION = cVar7;
        c cVar8 = new c("BOTTOM_SHEET", 7);
        BOTTOM_SHEET = cVar8;
        c cVar9 = new c("BOTTOM_SHEET_FOOTER_BUTTON", 8);
        BOTTOM_SHEET_FOOTER_BUTTON = cVar9;
        c cVar10 = new c("BOTTOM_SHEET_FOOTER_BUTTON_ACTION", 9);
        BOTTOM_SHEET_FOOTER_BUTTON_ACTION = cVar10;
        c cVar11 = new c("DETAILS_ITEM", 10);
        DETAILS_ITEM = cVar11;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11};
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
