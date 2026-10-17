package com.revolut.feature.security_hub.impl.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/security_hub/impl/utils/SecurityHubProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "SECURITY_HUB_INTRO", "SECURITY_HUB_INTRO_IN", "WEALTH_PROTECTION_INTRO", "WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS", "TRANSACTION_LIMIT_INTRO", "TRANSACTION_HU_LIMIT_INTRO", "TRANSACTION_SEPA_LIMIT_INTRO", "TRANSACTION_MX_LIMIT_INTRO", "TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO", "GAMBLING_BLOCK_INTRO", "MERCHANT_MANAGEMENT_INTRO", "STREET_MODE_INTRO", "STREET_MODE_INTRO_MX", "CLICK_TO_PAY_MASTER_CARD", "CLICK_TO_PAY_VISA", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SecurityHubProductArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityHubProductArticleKey[] $VALUES;
    public static final SecurityHubProductArticleKey CLICK_TO_PAY_MASTER_CARD;
    public static final SecurityHubProductArticleKey CLICK_TO_PAY_VISA;

    @NotNull
    public static final Parcelable.Creator<SecurityHubProductArticleKey> CREATOR;
    public static final SecurityHubProductArticleKey GAMBLING_BLOCK_INTRO;
    public static final SecurityHubProductArticleKey MERCHANT_MANAGEMENT_INTRO;
    public static final SecurityHubProductArticleKey SECURITY_HUB_INTRO;
    public static final SecurityHubProductArticleKey SECURITY_HUB_INTRO_IN;
    public static final SecurityHubProductArticleKey STREET_MODE_INTRO;
    public static final SecurityHubProductArticleKey STREET_MODE_INTRO_MX;
    public static final SecurityHubProductArticleKey TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO;
    public static final SecurityHubProductArticleKey TRANSACTION_HU_LIMIT_INTRO;
    public static final SecurityHubProductArticleKey TRANSACTION_LIMIT_INTRO;
    public static final SecurityHubProductArticleKey TRANSACTION_MX_LIMIT_INTRO;
    public static final SecurityHubProductArticleKey TRANSACTION_SEPA_LIMIT_INTRO;
    public static final SecurityHubProductArticleKey WEALTH_PROTECTION_INTRO;
    public static final SecurityHubProductArticleKey WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS;
    private final String articleName;
    private final String articleVariant;

    @NotNull
    private final String productName;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SecurityHubProductArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SecurityHubProductArticleKey[i];
        }
    }

    static {
        SecurityHubProductArticleKey securityHubProductArticleKey = new SecurityHubProductArticleKey("SECURITY_HUB_INTRO", 0, "intro", (String) null, 5);
        SECURITY_HUB_INTRO = securityHubProductArticleKey;
        SecurityHubProductArticleKey securityHubProductArticleKey2 = new SecurityHubProductArticleKey("SECURITY_HUB_INTRO_IN", 1, "intro", "in", 1);
        SECURITY_HUB_INTRO_IN = securityHubProductArticleKey2;
        SecurityHubProductArticleKey securityHubProductArticleKey3 = new SecurityHubProductArticleKey("WEALTH_PROTECTION_INTRO", 2, "wealth-protection", "intro", 1);
        WEALTH_PROTECTION_INTRO = securityHubProductArticleKey3;
        SecurityHubProductArticleKey securityHubProductArticleKey4 = new SecurityHubProductArticleKey("WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS", 3, "wealth-protection", "intro-with-card-payments", 1);
        WEALTH_PROTECTION_INTRO_WITH_CARD_PAYMENTS = securityHubProductArticleKey4;
        SecurityHubProductArticleKey securityHubProductArticleKey5 = new SecurityHubProductArticleKey("TRANSACTION_LIMIT_INTRO", 4, "transaction-limit", "intro", 1);
        TRANSACTION_LIMIT_INTRO = securityHubProductArticleKey5;
        SecurityHubProductArticleKey securityHubProductArticleKey6 = new SecurityHubProductArticleKey("TRANSACTION_HU_LIMIT_INTRO", 5, "hu-transaction-limits-pa", (String) null, 5);
        TRANSACTION_HU_LIMIT_INTRO = securityHubProductArticleKey6;
        SecurityHubProductArticleKey securityHubProductArticleKey7 = new SecurityHubProductArticleKey("TRANSACTION_SEPA_LIMIT_INTRO", 6, "sepa-instant-limits", "intro", 1);
        TRANSACTION_SEPA_LIMIT_INTRO = securityHubProductArticleKey7;
        SecurityHubProductArticleKey securityHubProductArticleKey8 = new SecurityHubProductArticleKey("TRANSACTION_MX_LIMIT_INTRO", 7, "transfer-limits", "intro.mx", 1);
        TRANSACTION_MX_LIMIT_INTRO = securityHubProductArticleKey8;
        SecurityHubProductArticleKey securityHubProductArticleKey9 = new SecurityHubProductArticleKey("TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO", 8, "pix-intro", (String) null, 5);
        TRANSACTIONS_DAY_NIGHT_LIMITS_INTRO = securityHubProductArticleKey9;
        SecurityHubProductArticleKey securityHubProductArticleKey10 = new SecurityHubProductArticleKey("GAMBLING_BLOCK_INTRO", 9, "gambling-block", (String) null, 5);
        GAMBLING_BLOCK_INTRO = securityHubProductArticleKey10;
        SecurityHubProductArticleKey securityHubProductArticleKey11 = new SecurityHubProductArticleKey("MERCHANT_MANAGEMENT_INTRO", 10, "merchant-management", (String) null, 5);
        MERCHANT_MANAGEMENT_INTRO = securityHubProductArticleKey11;
        SecurityHubProductArticleKey securityHubProductArticleKey12 = new SecurityHubProductArticleKey("STREET_MODE_INTRO", 11, "street-mode", (String) null, 5);
        STREET_MODE_INTRO = securityHubProductArticleKey12;
        SecurityHubProductArticleKey securityHubProductArticleKey13 = new SecurityHubProductArticleKey("STREET_MODE_INTRO_MX", 12, "street-mode", "mx", 1);
        STREET_MODE_INTRO_MX = securityHubProductArticleKey13;
        SecurityHubProductArticleKey securityHubProductArticleKey14 = new SecurityHubProductArticleKey("CLICK_TO_PAY_MASTER_CARD", 13, "c2p", (String) null, 4);
        CLICK_TO_PAY_MASTER_CARD = securityHubProductArticleKey14;
        SecurityHubProductArticleKey securityHubProductArticleKey15 = new SecurityHubProductArticleKey(14, "CLICK_TO_PAY_VISA", "cards", "c2p", "visa");
        CLICK_TO_PAY_VISA = securityHubProductArticleKey15;
        SecurityHubProductArticleKey[] securityHubProductArticleKeyArr = {securityHubProductArticleKey, securityHubProductArticleKey2, securityHubProductArticleKey3, securityHubProductArticleKey4, securityHubProductArticleKey5, securityHubProductArticleKey6, securityHubProductArticleKey7, securityHubProductArticleKey8, securityHubProductArticleKey9, securityHubProductArticleKey10, securityHubProductArticleKey11, securityHubProductArticleKey12, securityHubProductArticleKey13, securityHubProductArticleKey14, securityHubProductArticleKey15};
        $VALUES = securityHubProductArticleKeyArr;
        $ENTRIES = s.n(securityHubProductArticleKeyArr);
        CREATOR = new a();
    }

    public SecurityHubProductArticleKey(int i, String str, String str2, String str3, String str4) {
        this.productName = str2;
        this.articleName = str3;
        this.articleVariant = str4;
    }

    public static SecurityHubProductArticleKey valueOf(String str) {
        return (SecurityHubProductArticleKey) Enum.valueOf(SecurityHubProductArticleKey.class, str);
    }

    public static SecurityHubProductArticleKey[] values() {
        return (SecurityHubProductArticleKey[]) $VALUES.clone();
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getArticleName() {
        return this.articleName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return this.productName;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getArticleVariant() {
        return this.articleVariant;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SecurityHubProductArticleKey(String str, int i, String str2, String str3, int i2) {
        String str4;
        if ((i2 & 1) != 0) {
            str4 = "security-hub";
        } else {
            str4 = "cards";
        }
        this(i, str, str4, str2, (i2 & 4) != 0 ? null : str3);
    }
}
