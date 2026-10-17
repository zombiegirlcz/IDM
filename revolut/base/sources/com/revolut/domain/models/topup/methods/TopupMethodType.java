package com.revolut.domain.models.topup.methods;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 "}, d2 = {"Lcom/revolut/domain/models/topup/methods/TopupMethodType;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_SWITCH", "BANK_TRANSFER", "CARD", "CASH", "CHECK", "EASY_BANK_TRANSFER", "GOOGLE_PAY", "MOVE_MONEY", "SALARY", "REVOLUT_ACCOUNT", "CHECKOUT_PREORDER", "IDEAL", "PIX", "PIX_SMART_TRANSFER", "DIRECT_DEPOSIT", "CONNECT_NEW_BANK_DIRECT_LINK", "CONNECT_NEW_BANK_OAUTH_ONCE", "PAY_TO", "UPI_APP", "MCY_UPI_APP", "NET_BANKING", "MCY_NET_BANKING", "MCY_BANK_TRANSFER", "PAYNOW", "PSE", "BREB", "AKAHU", "GMO_PG_BANK_DIRECT", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopupMethodType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopupMethodType[] $VALUES;
    public static final TopupMethodType ACCOUNT_SWITCH = new TopupMethodType("ACCOUNT_SWITCH", 0);
    public static final TopupMethodType BANK_TRANSFER = new TopupMethodType("BANK_TRANSFER", 1);
    public static final TopupMethodType CARD = new TopupMethodType("CARD", 2);
    public static final TopupMethodType CASH = new TopupMethodType("CASH", 3);
    public static final TopupMethodType CHECK = new TopupMethodType("CHECK", 4);
    public static final TopupMethodType EASY_BANK_TRANSFER = new TopupMethodType("EASY_BANK_TRANSFER", 5);
    public static final TopupMethodType GOOGLE_PAY = new TopupMethodType("GOOGLE_PAY", 6);
    public static final TopupMethodType MOVE_MONEY = new TopupMethodType("MOVE_MONEY", 7);
    public static final TopupMethodType SALARY = new TopupMethodType("SALARY", 8);
    public static final TopupMethodType REVOLUT_ACCOUNT = new TopupMethodType("REVOLUT_ACCOUNT", 9);
    public static final TopupMethodType CHECKOUT_PREORDER = new TopupMethodType("CHECKOUT_PREORDER", 10);
    public static final TopupMethodType IDEAL = new TopupMethodType("IDEAL", 11);
    public static final TopupMethodType PIX = new TopupMethodType("PIX", 12);
    public static final TopupMethodType PIX_SMART_TRANSFER = new TopupMethodType("PIX_SMART_TRANSFER", 13);
    public static final TopupMethodType DIRECT_DEPOSIT = new TopupMethodType("DIRECT_DEPOSIT", 14);
    public static final TopupMethodType CONNECT_NEW_BANK_DIRECT_LINK = new TopupMethodType("CONNECT_NEW_BANK_DIRECT_LINK", 15);
    public static final TopupMethodType CONNECT_NEW_BANK_OAUTH_ONCE = new TopupMethodType("CONNECT_NEW_BANK_OAUTH_ONCE", 16);
    public static final TopupMethodType PAY_TO = new TopupMethodType("PAY_TO", 17);
    public static final TopupMethodType UPI_APP = new TopupMethodType("UPI_APP", 18);
    public static final TopupMethodType MCY_UPI_APP = new TopupMethodType("MCY_UPI_APP", 19);
    public static final TopupMethodType NET_BANKING = new TopupMethodType("NET_BANKING", 20);
    public static final TopupMethodType MCY_NET_BANKING = new TopupMethodType("MCY_NET_BANKING", 21);
    public static final TopupMethodType MCY_BANK_TRANSFER = new TopupMethodType("MCY_BANK_TRANSFER", 22);
    public static final TopupMethodType PAYNOW = new TopupMethodType("PAYNOW", 23);
    public static final TopupMethodType PSE = new TopupMethodType("PSE", 24);
    public static final TopupMethodType BREB = new TopupMethodType("BREB", 25);
    public static final TopupMethodType AKAHU = new TopupMethodType("AKAHU", 26);
    public static final TopupMethodType GMO_PG_BANK_DIRECT = new TopupMethodType("GMO_PG_BANK_DIRECT", 27);

    private static final /* synthetic */ TopupMethodType[] $values() {
        return new TopupMethodType[]{ACCOUNT_SWITCH, BANK_TRANSFER, CARD, CASH, CHECK, EASY_BANK_TRANSFER, GOOGLE_PAY, MOVE_MONEY, SALARY, REVOLUT_ACCOUNT, CHECKOUT_PREORDER, IDEAL, PIX, PIX_SMART_TRANSFER, DIRECT_DEPOSIT, CONNECT_NEW_BANK_DIRECT_LINK, CONNECT_NEW_BANK_OAUTH_ONCE, PAY_TO, UPI_APP, MCY_UPI_APP, NET_BANKING, MCY_NET_BANKING, MCY_BANK_TRANSFER, PAYNOW, PSE, BREB, AKAHU, GMO_PG_BANK_DIRECT};
    }

    static {
        TopupMethodType[] topupMethodTypeArr$values = $values();
        $VALUES = topupMethodTypeArr$values;
        $ENTRIES = s.n(topupMethodTypeArr$values);
    }

    private TopupMethodType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TopupMethodType valueOf(String str) {
        return (TopupMethodType) Enum.valueOf(TopupMethodType.class, str);
    }

    public static TopupMethodType[] values() {
        return (TopupMethodType[]) $VALUES.clone();
    }
}
