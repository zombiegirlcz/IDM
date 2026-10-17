package com.revolut.feature.crypto.exchange.fees.impl.declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/exchange/fees/impl/declaration/CryptoExchangeFeesArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "<init>", "()V", "feature_crypto_exchange_fees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CryptoExchangeFeesArticleKey implements ProductArticleKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CryptoExchangeFeesArticleKey f70823a = new CryptoExchangeFeesArticleKey();

    @NotNull
    public static final Parcelable.Creator<CryptoExchangeFeesArticleKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoExchangeFeesArticleKey.f70823a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoExchangeFeesArticleKey[i];
        }
    }

    private CryptoExchangeFeesArticleKey() {
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String U5() {
        return "fees";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "crypto-exchange";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final /* bridge */ /* synthetic */ String h1() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
