package com.revolut.feature.trading.transfer.investments.impl.comms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/comms/CustodianJisaIncomingTransfersArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustodianJisaIncomingTransfersArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<CustodianJisaIncomingTransfersArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91544c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustodianJisaIncomingTransfersArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustodianJisaIncomingTransfersArticleKey[i];
        }
    }

    public CustodianJisaIncomingTransfersArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF91549b() {
        return this.f91543b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustodianJisaIncomingTransfersArticleKey)) {
            return false;
        }
        CustodianJisaIncomingTransfersArticleKey custodianJisaIncomingTransfersArticleKey = (CustodianJisaIncomingTransfersArticleKey) obj2;
        return Intrinsics.f(this.f91542a, custodianJisaIncomingTransfersArticleKey.f91542a) && Intrinsics.f(this.f91543b, custodianJisaIncomingTransfersArticleKey.f91543b) && Intrinsics.f(this.f91544c, custodianJisaIncomingTransfersArticleKey.f91544c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF91548a() {
        return this.f91542a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF91550c() {
        return this.f91544c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91542a.hashCode() * 31, 31, this.f91543b);
        String str = this.f91544c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91542a);
        dest.writeString(this.f91543b);
        dest.writeString(this.f91544c);
    }

    public CustodianJisaIncomingTransfersArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f91542a = productName;
        this.f91543b = articleName;
        this.f91544c = str;
    }

    public /* synthetic */ CustodianJisaIncomingTransfersArticleKey(int i) {
        this("invest", "jisa-incoming-transfers", null);
    }
}
