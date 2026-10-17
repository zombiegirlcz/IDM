package com.revolut.feature.payments_migration.impl.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments_migration/impl/models/PaymentsMigrationProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsMigrationProductArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<PaymentsMigrationProductArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80207c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentsMigrationProductArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsMigrationProductArticleKey[i];
        }
    }

    public PaymentsMigrationProductArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF80206b() {
        return this.f80206b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsMigrationProductArticleKey)) {
            return false;
        }
        PaymentsMigrationProductArticleKey paymentsMigrationProductArticleKey = (PaymentsMigrationProductArticleKey) obj2;
        return Intrinsics.f(this.f80205a, paymentsMigrationProductArticleKey.f80205a) && Intrinsics.f(this.f80206b, paymentsMigrationProductArticleKey.f80206b) && Intrinsics.f(this.f80207c, paymentsMigrationProductArticleKey.f80207c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF80205a() {
        return this.f80205a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF82165c() {
        return this.f80207c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f80205a.hashCode() * 31, 31, this.f80206b);
        String str = this.f80207c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80205a);
        dest.writeString(this.f80206b);
        dest.writeString(this.f80207c);
    }

    public PaymentsMigrationProductArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f80205a = productName;
        this.f80206b = articleName;
        this.f80207c = str;
    }

    public /* synthetic */ PaymentsMigrationProductArticleKey(int i) {
        this("payments", "migration", null);
    }
}
