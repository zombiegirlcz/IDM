package com.revolut.feature.apm.upi.api.product_article;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/api/product_article/UpiIntroArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "<init>", "()V", "feature_apm_upi_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpiIntroArticleKey implements ProductArticleKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UpiIntroArticleKey f62955a = new UpiIntroArticleKey();

    @NotNull
    public static final Parcelable.Creator<UpiIntroArticleKey> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return UpiIntroArticleKey.f62955a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpiIntroArticleKey[i];
        }
    }

    private UpiIntroArticleKey() {
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5 */
    public final String getArticleName() {
        return "intro";
    }

    public final ProductArticleParams a() {
        return new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(this));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "upi";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1 */
    public final /* bridge */ /* synthetic */ String getArticleVariant() {
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
