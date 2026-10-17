package com.revolut.feature.credit.application.plugins.impl.ui.application.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/application/extensions/CreditProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditProductArticleKey implements ProductArticleKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f67103c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CreditProductArticleKey> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.CreditProductArticleKey$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditProductArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditProductArticleKey[i];
        }
    }

    public CreditProductArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f67101a = productName;
        this.f67102b = articleName;
        this.f67103c = str;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF67102b() {
        return this.f67102b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditProductArticleKey)) {
            return false;
        }
        CreditProductArticleKey creditProductArticleKey = (CreditProductArticleKey) obj2;
        return Intrinsics.f(this.f67101a, creditProductArticleKey.f67101a) && Intrinsics.f(this.f67102b, creditProductArticleKey.f67102b) && Intrinsics.f(this.f67103c, creditProductArticleKey.f67103c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF67101a() {
        return this.f67101a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF67103c() {
        return this.f67103c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f67101a.hashCode() * 31, 31, this.f67102b);
        String str = this.f67103c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67101a);
        dest.writeString(this.f67102b);
        dest.writeString(this.f67103c);
    }
}
