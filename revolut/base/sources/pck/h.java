package pck;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class h {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ALREADY_OFFERED;
    public static final h ALREADY_REFERRED;
    public static final h NOT_TRUSTED_CONTACT;
    public static final h RECIPIENT_NOT_ELIGIBLE;
    public static final h REFERRAL_OFFER_UNAVAILABLE;
    public static final h REVEAL_PRICING_PLAN_OFF;
    public static final h SAME_OR_HIGHER_PLAN;
    public static final h UNKNOWN;

    static {
        h hVar = new h("ALREADY_OFFERED", 0);
        ALREADY_OFFERED = hVar;
        h hVar2 = new h("ALREADY_REFERRED", 1);
        ALREADY_REFERRED = hVar2;
        h hVar3 = new h("REFERRAL_OFFER_UNAVAILABLE", 2);
        REFERRAL_OFFER_UNAVAILABLE = hVar3;
        h hVar4 = new h("SAME_OR_HIGHER_PLAN", 3);
        SAME_OR_HIGHER_PLAN = hVar4;
        h hVar5 = new h("NOT_TRUSTED_CONTACT", 4);
        NOT_TRUSTED_CONTACT = hVar5;
        h hVar6 = new h("REVEAL_PRICING_PLAN_OFF", 5);
        REVEAL_PRICING_PLAN_OFF = hVar6;
        h hVar7 = new h("RECIPIENT_NOT_ELIGIBLE", 6);
        RECIPIENT_NOT_ELIGIBLE = hVar7;
        h hVar8 = new h("UNKNOWN", 7);
        UNKNOWN = hVar8;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8};
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
