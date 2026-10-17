package com.revolut.feature.trading.transfer.investments.impl.comms;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/transfer/investments/impl/comms/IsaIncomingTransfersArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IsaIncomingTransfersArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<IsaIncomingTransfersArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91547c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IsaIncomingTransfersArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IsaIncomingTransfersArticleKey[i];
        }
    }

    public IsaIncomingTransfersArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF91549b() {
        return this.f91546b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IsaIncomingTransfersArticleKey)) {
            return false;
        }
        IsaIncomingTransfersArticleKey isaIncomingTransfersArticleKey = (IsaIncomingTransfersArticleKey) obj2;
        return Intrinsics.f(this.f91545a, isaIncomingTransfersArticleKey.f91545a) && Intrinsics.f(this.f91546b, isaIncomingTransfersArticleKey.f91546b) && Intrinsics.f(this.f91547c, isaIncomingTransfersArticleKey.f91547c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF91548a() {
        return this.f91545a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF91550c() {
        return this.f91547c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f91545a.hashCode() * 31, 31, this.f91546b);
        String str = this.f91547c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91545a);
        dest.writeString(this.f91546b);
        dest.writeString(this.f91547c);
    }

    public IsaIncomingTransfersArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f91545a = productName;
        this.f91546b = articleName;
        this.f91547c = str;
    }

    public /* synthetic */ IsaIncomingTransfersArticleKey(int i) {
        this("invest", "isa-incoming-transfers", null);
    }
}
