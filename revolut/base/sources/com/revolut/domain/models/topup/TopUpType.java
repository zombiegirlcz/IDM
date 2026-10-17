package com.revolut.domain.models.topup;

import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0010"}, d2 = {"Lcom/revolut/domain/models/topup/TopUpType;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE_PAY", "CARD", "CARD_ONE_OFF_TOPUP", "EXTERNAL_POCKET_ONE_OFF_TOPUP", "DEPOSIT_CHECK", "MULTI_CURRENCY", "PREORDER_AND_PAY_LATER", "PIX", "NONE", "isCard", "", "()Z", "domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopUpType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TopUpType[] $VALUES;
    public static final TopUpType GOOGLE_PAY = new TopUpType("GOOGLE_PAY", 0);
    public static final TopUpType CARD = new TopUpType("CARD", 1);
    public static final TopUpType CARD_ONE_OFF_TOPUP = new TopUpType("CARD_ONE_OFF_TOPUP", 2);
    public static final TopUpType EXTERNAL_POCKET_ONE_OFF_TOPUP = new TopUpType("EXTERNAL_POCKET_ONE_OFF_TOPUP", 3);
    public static final TopUpType DEPOSIT_CHECK = new TopUpType("DEPOSIT_CHECK", 4);
    public static final TopUpType MULTI_CURRENCY = new TopUpType("MULTI_CURRENCY", 5);
    public static final TopUpType PREORDER_AND_PAY_LATER = new TopUpType("PREORDER_AND_PAY_LATER", 6);
    public static final TopUpType PIX = new TopUpType("PIX", 7);
    public static final TopUpType NONE = new TopUpType("NONE", 8);

    private static final /* synthetic */ TopUpType[] $values() {
        return new TopUpType[]{GOOGLE_PAY, CARD, CARD_ONE_OFF_TOPUP, EXTERNAL_POCKET_ONE_OFF_TOPUP, DEPOSIT_CHECK, MULTI_CURRENCY, PREORDER_AND_PAY_LATER, PIX, NONE};
    }

    static {
        TopUpType[] topUpTypeArr$values = $values();
        $VALUES = topUpTypeArr$values;
        $ENTRIES = s.n(topUpTypeArr$values);
    }

    private TopUpType(String str, int i) {
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static TopUpType valueOf(String str) {
        return (TopUpType) Enum.valueOf(TopUpType.class, str);
    }

    public static TopUpType[] values() {
        return (TopUpType[]) $VALUES.clone();
    }

    public final boolean isCard() {
        TopUpType[] elements = {CARD, CARD_ONE_OFF_TOPUP};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d.y0(elements).contains(this);
    }
}
