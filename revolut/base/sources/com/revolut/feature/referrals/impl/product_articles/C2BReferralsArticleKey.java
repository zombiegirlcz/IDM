package com.revolut.feature.referrals.impl.product_articles;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/referrals/impl/product_articles/C2BReferralsArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "Companion", "Intro", "a", "Lcom/revolut/feature/referrals/impl/product_articles/C2BReferralsArticleKey$Intro;", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class C2BReferralsArticleKey implements ProductArticleKey {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/impl/product_articles/C2BReferralsArticleKey$Intro;", "Lcom/revolut/feature/referrals/impl/product_articles/C2BReferralsArticleKey;", "<init>", "()V", "feature_retail_referrals_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Intro extends C2BReferralsArticleKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Intro f81800a = new Intro();

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Intro.f81800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        private Intro() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String U5() {
        return "retail-to-business";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "referrals";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String h1() {
        return "intro";
    }
}
