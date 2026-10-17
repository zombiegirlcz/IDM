package com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/exclusive_store/impl/ui/flow/root/RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_exclusive_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83590c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle[i];
        }
    }

    public RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle(String articleName, String productName, String str) {
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        Intrinsics.checkNotNullParameter(productName, "productName");
        this.f83588a = articleName;
        this.f83589b = productName;
        this.f83590c = str;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF83588a() {
        return this.f83588a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle)) {
            return false;
        }
        RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle revPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle = (RevPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle) obj2;
        return Intrinsics.f(this.f83588a, revPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle.f83588a) && Intrinsics.f(this.f83589b, revPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle.f83589b) && Intrinsics.f(this.f83590c, revPointsExclusiveStoreProductFlowModel$ExclusiveStoreArticle.f83590c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF85332a() {
        return this.f83589b;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF85334c() {
        return this.f83590c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f83588a.hashCode() * 31, 31, this.f83589b);
        String str = this.f83590c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83588a);
        dest.writeString(this.f83589b);
        dest.writeString(this.f83590c);
    }
}
