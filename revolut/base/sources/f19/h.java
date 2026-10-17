package f19;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h HOME_SCREEN_WIDGET;
    public static final h LOYALTY_EARN_HUB_TOP_BRANDS;
    public static final h LOYALTY_HOME_MEDIA_HEADER;
    public static final h LOYALTY_HOME_REWARDS_FOR_YOU;
    public static final h LOYALTY_HOME_SUGGESTED_FOR_YOU;
    public static final h REWARDS_FOR_YOU_CAROUSEL;

    static {
        h hVar = new h("LOYALTY_HOME_MEDIA_HEADER", 0);
        LOYALTY_HOME_MEDIA_HEADER = hVar;
        h hVar2 = new h("LOYALTY_HOME_SUGGESTED_FOR_YOU", 1);
        LOYALTY_HOME_SUGGESTED_FOR_YOU = hVar2;
        h hVar3 = new h("LOYALTY_HOME_REWARDS_FOR_YOU", 2);
        LOYALTY_HOME_REWARDS_FOR_YOU = hVar3;
        h hVar4 = new h("REWARDS_FOR_YOU_CAROUSEL", 3);
        REWARDS_FOR_YOU_CAROUSEL = hVar4;
        h hVar5 = new h("HOME_SCREEN_WIDGET", 4);
        HOME_SCREEN_WIDGET = hVar5;
        h hVar6 = new h("LOYALTY_EARN_HUB_TOP_BRANDS", 5);
        LOYALTY_EARN_HUB_TOP_BRANDS = hVar6;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6};
        $VALUES = hVarArr;
        $ENTRIES = s.n(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
