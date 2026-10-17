package com.revolut.feature.product_article.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ArticleReference", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductArticleParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArticleReference f81274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f81275b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference;", "Landroid/os/Parcelable;", "<init>", "()V", "Id", "Key", "Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference$Id;", "Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference$Key;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ArticleReference implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference$Id;", "Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Id extends ArticleReference {

            @NotNull
            public static final Parcelable.Creator<Id> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81276a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Id(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Id[i];
                }
            }

            public Id(String articleId) {
                Intrinsics.checkNotNullParameter(articleId, "articleId");
                this.f81276a = articleId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Id) && Intrinsics.f(this.f81276a, ((Id) obj2).f81276a);
            }

            public final int hashCode() {
                return this.f81276a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81276a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference$Key;", "Lcom/revolut/feature/product_article/api/models/ProductArticleParams$ArticleReference;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Key extends ArticleReference {

            @NotNull
            public static final Parcelable.Creator<Key> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ProductArticleKey f81277a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Key((ProductArticleKey) parcel.readParcelable(Key.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Key[i];
                }
            }

            public Key(ProductArticleKey articleKey) {
                Intrinsics.checkNotNullParameter(articleKey, "articleKey");
                this.f81277a = articleKey;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Key) && Intrinsics.f(this.f81277a, ((Key) obj2).f81277a);
            }

            public final int hashCode() {
                return this.f81277a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f81277a, i);
            }
        }

        private ArticleReference() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArticleReference articleReference = (ArticleReference) j6.a.f(parcel, "parcel", ProductArticleParams.class);
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new ProductArticleParams(articleReference, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleParams[i];
        }
    }

    public ProductArticleParams(ArticleReference articleReference, Map substitutionData) {
        Intrinsics.checkNotNullParameter(articleReference, "articleReference");
        Intrinsics.checkNotNullParameter(substitutionData, "substitutionData");
        this.f81274a = articleReference;
        this.f81275b = substitutionData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleParams)) {
            return false;
        }
        ProductArticleParams productArticleParams = (ProductArticleParams) obj2;
        return Intrinsics.f(this.f81274a, productArticleParams.f81274a) && Intrinsics.f(this.f81275b, productArticleParams.f81275b);
    }

    public final int hashCode() {
        return this.f81275b.hashCode() + (this.f81274a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81274a, i);
        Iterator itZ = j6.a.z(this.f81275b, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ ProductArticleParams(ArticleReference articleReference) {
        this(articleReference, r0.g());
    }
}
