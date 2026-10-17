package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.intro;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.domain.template.model.TemplateIntroScreenContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/intro/PortfolioRevealIntroScreenContract$TemplateIntroPage", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PortfolioRevealIntroScreenContract$TemplateIntroPage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PortfolioRevealIntroScreenContract$TemplateIntroPage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TemplateIntroScreenContent f91469c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PortfolioRevealIntroScreenContract$TemplateIntroPage(parcel.readString(), parcel.readString(), (TemplateIntroScreenContent) parcel.readParcelable(PortfolioRevealIntroScreenContract$TemplateIntroPage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PortfolioRevealIntroScreenContract$TemplateIntroPage[i];
        }
    }

    public PortfolioRevealIntroScreenContract$TemplateIntroPage(String title, String str, TemplateIntroScreenContent content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f91467a = title;
        this.f91468b = str;
        this.f91469c = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PortfolioRevealIntroScreenContract$TemplateIntroPage)) {
            return false;
        }
        PortfolioRevealIntroScreenContract$TemplateIntroPage portfolioRevealIntroScreenContract$TemplateIntroPage = (PortfolioRevealIntroScreenContract$TemplateIntroPage) obj2;
        return Intrinsics.f(this.f91467a, portfolioRevealIntroScreenContract$TemplateIntroPage.f91467a) && Intrinsics.f(this.f91468b, portfolioRevealIntroScreenContract$TemplateIntroPage.f91468b) && Intrinsics.f(this.f91469c, portfolioRevealIntroScreenContract$TemplateIntroPage.f91469c);
    }

    public final int hashCode() {
        int iHashCode = this.f91467a.hashCode() * 31;
        String str = this.f91468b;
        return this.f91469c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91467a);
        dest.writeString(this.f91468b);
        dest.writeParcelable(this.f91469c, i);
    }
}
