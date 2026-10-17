package com.revolut.feature.salary_switch.impl.ui.promo;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/impl/ui/promo/SalarySwitchArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalarySwitchArticleKey implements ProductArticleKey {

    @NotNull
    public static final Parcelable.Creator<SalarySwitchArticleKey> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f85334c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalarySwitchArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalarySwitchArticleKey[i];
        }
    }

    public SalarySwitchArticleKey() {
        this(null, 7);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: U5, reason: from getter */
    public final String getF85333b() {
        return this.f85333b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SalarySwitchArticleKey)) {
            return false;
        }
        SalarySwitchArticleKey salarySwitchArticleKey = (SalarySwitchArticleKey) obj2;
        return Intrinsics.f(this.f85332a, salarySwitchArticleKey.f85332a) && Intrinsics.f(this.f85333b, salarySwitchArticleKey.f85333b) && Intrinsics.f(this.f85334c, salarySwitchArticleKey.f85334c);
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: getProductName, reason: from getter */
    public final String getF85332a() {
        return this.f85332a;
    }

    @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
    /* JADX INFO: renamed from: h1, reason: from getter */
    public final String getF85334c() {
        return this.f85334c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f85332a.hashCode() * 31, 31, this.f85333b);
        String str = this.f85334c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85332a);
        dest.writeString(this.f85333b);
        dest.writeString(this.f85334c);
    }

    public SalarySwitchArticleKey(String productName, String articleName, String str) {
        Intrinsics.checkNotNullParameter(productName, "productName");
        Intrinsics.checkNotNullParameter(articleName, "articleName");
        this.f85332a = productName;
        this.f85333b = articleName;
        this.f85334c = str;
    }

    public /* synthetic */ SalarySwitchArticleKey(String str, int i) {
        this("topups", "salary-switch", (i & 4) != 0 ? null : str);
    }
}
