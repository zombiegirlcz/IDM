package com.revolut.feature.pay_later.impl.ui.comms;

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
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/feature/pay_later/impl/ui/comms/PayLaterArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "EntryPromotion", "FeeLimitPromotion", "feature_pay_later_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PayLaterArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PayLaterArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PayLaterArticleKey> CREATOR;
    public static final PayLaterArticleKey EntryPromotion;
    public static final PayLaterArticleKey FeeLimitPromotion;
    private final String articleVariant;

    @NotNull
    private final String productName = "pay-later";

    @NotNull
    private final String articleName = "promo";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PayLaterArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayLaterArticleKey[i];
        }
    }

    static {
        PayLaterArticleKey payLaterArticleKey = new PayLaterArticleKey("EntryPromotion", 0, "on-entry-promo");
        EntryPromotion = payLaterArticleKey;
        PayLaterArticleKey payLaterArticleKey2 = new PayLaterArticleKey("FeeLimitPromotion", 1, "on-limit-promo");
        FeeLimitPromotion = payLaterArticleKey2;
        PayLaterArticleKey[] payLaterArticleKeyArr = {payLaterArticleKey, payLaterArticleKey2};
        $VALUES = payLaterArticleKeyArr;
        $ENTRIES = s.n(payLaterArticleKeyArr);
        CREATOR = new a();
    }

    public PayLaterArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static PayLaterArticleKey valueOf(String str) {
        return (PayLaterArticleKey) Enum.valueOf(PayLaterArticleKey.class, str);
    }

    public static PayLaterArticleKey[] values() {
        return (PayLaterArticleKey[]) $VALUES.clone();
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
}
