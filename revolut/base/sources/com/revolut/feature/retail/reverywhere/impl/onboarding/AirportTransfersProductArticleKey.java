package com.revolut.feature.retail.reverywhere.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/AirportTransfersProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "<init>", "()V", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AirportTransfersProductArticleKey implements ProductArticleKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AirportTransfersProductArticleKey f82897a = new AirportTransfersProductArticleKey();

    @NotNull
    public static final Parcelable.Creator<AirportTransfersProductArticleKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return AirportTransfersProductArticleKey.f82897a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportTransfersProductArticleKey[i];
        }
    }

    private AirportTransfersProductArticleKey() {
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String U5() {
        return "onboarding";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "airport-transfers";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String h1() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
