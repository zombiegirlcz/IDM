package com.revolut.retail.feature.trading_onboarding.impl.comms;

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
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"com/revolut/retail/feature/trading_onboarding/impl/comms/PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "Lcom/revolut/retail/feature/trading_onboarding/impl/comms/PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey;", "", "productName", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "articleName", "U5", "articleVariant", "h1", "EEA", "GB", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey implements ProductArticleKey {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey> CREATOR;
    public static final PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey EEA;
    public static final PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey GB;
    private final String articleVariant;

    @NotNull
    private final String productName = "invest";

    @NotNull
    private final String articleName = "private-markets-product-welcome";

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey[i];
        }
    }

    static {
        PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey = new PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey("EEA", 0, "eea");
        EEA = privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey;
        PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey2 = new PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey("GB", 1, "gb");
        GB = privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey2;
        PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey[] privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKeyArr = {privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey, privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey2};
        $VALUES = privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKeyArr;
        $ENTRIES = s.n(privateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKeyArr);
        CREATOR = new a();
    }

    public PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey(String str, int i, String str2) {
        this.articleVariant = str2;
    }

    public static PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey valueOf(String str) {
        return (PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey) Enum.valueOf(PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey.class, str);
    }

    public static PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey[] values() {
        return (PrivateMarketsProductCommsCommandProviderImpl$PrivateMarketsProductWelcomeArticleKey[]) $VALUES.clone();
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
