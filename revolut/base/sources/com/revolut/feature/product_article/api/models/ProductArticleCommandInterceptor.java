package com.revolut.feature.product_article.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/product_article/api/models/ProductArticleCommandInterceptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_product_article_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductArticleCommandInterceptor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ProductArticleCommandInterceptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NaviCommand f81268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f81269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NaviCommand f81270c;
    public final NaviCommand d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductArticleCommandInterceptor((NaviCommand) parcel.readParcelable(ProductArticleCommandInterceptor.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProductArticleCommandInterceptor.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProductArticleCommandInterceptor.class.getClassLoader()), (NaviCommand) parcel.readParcelable(ProductArticleCommandInterceptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductArticleCommandInterceptor[i];
        }
    }

    public ProductArticleCommandInterceptor() {
        this(null, null, null, null, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductArticleCommandInterceptor)) {
            return false;
        }
        ProductArticleCommandInterceptor productArticleCommandInterceptor = (ProductArticleCommandInterceptor) obj2;
        return Intrinsics.f(this.f81268a, productArticleCommandInterceptor.f81268a) && Intrinsics.f(this.f81269b, productArticleCommandInterceptor.f81269b) && Intrinsics.f(this.f81270c, productArticleCommandInterceptor.f81270c) && Intrinsics.f(this.d, productArticleCommandInterceptor.d);
    }

    public final int hashCode() {
        NaviCommand naviCommand = this.f81268a;
        int iHashCode = (naviCommand == null ? 0 : naviCommand.hashCode()) * 31;
        NaviCommand naviCommand2 = this.f81269b;
        int iHashCode2 = (iHashCode + (naviCommand2 == null ? 0 : naviCommand2.hashCode())) * 31;
        NaviCommand naviCommand3 = this.f81270c;
        int iHashCode3 = (iHashCode2 + (naviCommand3 == null ? 0 : naviCommand3.hashCode())) * 31;
        NaviCommand naviCommand4 = this.d;
        return iHashCode3 + (naviCommand4 != null ? naviCommand4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f81268a, i);
        dest.writeParcelable(this.f81269b, i);
        dest.writeParcelable(this.f81270c, i);
        dest.writeParcelable(this.d, i);
    }

    public ProductArticleCommandInterceptor(NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, NaviCommand naviCommand4) {
        this.f81268a = naviCommand;
        this.f81269b = naviCommand2;
        this.f81270c = naviCommand3;
        this.d = naviCommand4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ProductArticleCommandInterceptor(NaviCommand naviCommand, NaviCommand naviCommand2, NaviCommand naviCommand3, NaviCommand naviCommand4, int i) {
        naviCommand = (i & 1) != 0 ? null : naviCommand;
        this(naviCommand, (i & 2) != 0 ? naviCommand : naviCommand2, (i & 4) != 0 ? null : naviCommand3, (i & 8) != 0 ? null : naviCommand4);
    }
}
