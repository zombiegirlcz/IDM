package com.revolut.feature.masav.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/ui/MasavDirectDebitsProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MasavDirectDebitsProductArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<MasavDirectDebitsProductArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f78106c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MasavDirectDebitsProductArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MasavDirectDebitsProductArticleKey[i];
        }
    }

    public MasavDirectDebitsProductArticleKey() {
        this(0);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF78259b() {
        return this.f78105b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MasavDirectDebitsProductArticleKey)) {
            return false;
        }
        MasavDirectDebitsProductArticleKey masavDirectDebitsProductArticleKey = (MasavDirectDebitsProductArticleKey) obj2;
        return Intrinsics.f(this.f78104a, masavDirectDebitsProductArticleKey.f78104a) && Intrinsics.f(this.f78105b, masavDirectDebitsProductArticleKey.f78105b) && Intrinsics.f(this.f78106c, masavDirectDebitsProductArticleKey.f78106c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF80205a() {
        return this.f78104a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF80207c() {
        return this.f78106c;
    }

    public final int hashCode() {
        return this.f78106c.hashCode() + p.a.c(this.f78104a.hashCode() * 31, 31, this.f78105b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78104a);
        dest.writeString(this.f78105b);
        dest.writeString(this.f78106c);
    }

    public MasavDirectDebitsProductArticleKey(String productName, String articleName, String articleVariant) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        Intrinsics.checkNotNullParameter(articleVariant, "articleVariant");
        this.f78104a = productName;
        this.f78105b = articleName;
        this.f78106c = articleVariant;
    }

    public /* synthetic */ MasavDirectDebitsProductArticleKey(int i) {
        this("payments", "masav-direct-debit", "intro");
    }
}
