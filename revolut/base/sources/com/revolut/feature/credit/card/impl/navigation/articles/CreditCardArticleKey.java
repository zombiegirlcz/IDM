package com.revolut.feature.credit.card.impl.navigation.articles;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "Companion", "Autopay", "Instalment", "DebitInstalment", "a", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$Autopay;", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$DebitInstalment;", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$Instalment;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditCardArticleKey implements ProductArticleKey {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68997b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$Autopay;", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Autopay extends CreditCardArticleKey {

        @NotNull
        public static final Parcelable.Creator<Autopay> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f68998c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Autopay((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Autopay[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Autopay(b bVar) {
            String lowerCase;
            String str;
            if (bVar == null || (str = bVar.f297794a) == null) {
                lowerCase = null;
            } else {
                lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            super("autopay", lowerCase);
            this.f68998c = bVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Autopay) && Intrinsics.f(this.f68998c, ((Autopay) obj2).f68998c);
        }

        public final int hashCode() {
            b bVar = this.f68998c;
            if (bVar == null) {
                return 0;
            }
            return bVar.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68998c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$DebitInstalment;", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DebitInstalment extends CreditCardArticleKey {

        @NotNull
        public static final Parcelable.Creator<DebitInstalment> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f68999c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DebitInstalment((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DebitInstalment[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public DebitInstalment(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            String lowerCase = countryCode.f297794a.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super("debit-instalment", lowerCase);
            this.f68999c = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DebitInstalment) && Intrinsics.f(this.f68999c, ((DebitInstalment) obj2).f68999c);
        }

        public final int hashCode() {
            return this.f68999c.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68999c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey$Instalment;", "Lcom/revolut/feature/credit/card/impl/navigation/articles/CreditCardArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Instalment extends CreditCardArticleKey {

        @NotNull
        public static final Parcelable.Creator<Instalment> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f69000c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Instalment((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instalment[i];
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Instalment(b countryCode) {
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            String lowerCase = countryCode.f297794a.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            super("instalment", lowerCase);
            this.f69000c = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Instalment) && Intrinsics.f(this.f69000c, ((Instalment) obj2).f69000c);
        }

        public final int hashCode() {
            return this.f69000c.f297794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69000c);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public CreditCardArticleKey(String str, String str2) {
        this.f68996a = str;
        this.f68997b = str2;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF68996a() {
        return this.f68996a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    public final String getProductName() {
        return "credit-card";
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF68997b() {
        return this.f68997b;
    }
}
