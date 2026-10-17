package com.revolut.feature.trading.managed_portfolios.impl.ui.select_template;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/select_template/ManagedPortfolioSelectTemplateScreenContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ManagedPortfolioSelectTemplateScreenContract$Page implements PagerItem {

    @NotNull
    public static final Parcelable.Creator<ManagedPortfolioSelectTemplateScreenContract$Page> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Template f91446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91448c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ManagedPortfolioSelectTemplateScreenContract$Page((Template) parcel.readParcelable(ManagedPortfolioSelectTemplateScreenContract$Page.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ManagedPortfolioSelectTemplateScreenContract$Page[i];
        }
    }

    public ManagedPortfolioSelectTemplateScreenContract$Page(Template template, String str, String recommendedTemplateId, boolean z) {
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(recommendedTemplateId, "recommendedTemplateId");
        this.f91446a = template;
        this.f91447b = str;
        this.f91448c = recommendedTemplateId;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ManagedPortfolioSelectTemplateScreenContract$Page)) {
            return false;
        }
        ManagedPortfolioSelectTemplateScreenContract$Page managedPortfolioSelectTemplateScreenContract$Page = (ManagedPortfolioSelectTemplateScreenContract$Page) obj2;
        return Intrinsics.f(this.f91446a, managedPortfolioSelectTemplateScreenContract$Page.f91446a) && Intrinsics.f(this.f91447b, managedPortfolioSelectTemplateScreenContract$Page.f91447b) && Intrinsics.f(this.f91448c, managedPortfolioSelectTemplateScreenContract$Page.f91448c) && this.d == managedPortfolioSelectTemplateScreenContract$Page.d;
    }

    @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
    /* JADX INFO: renamed from: getId */
    public final String getF89793a() {
        return this.f91446a.f95706a;
    }

    public final int hashCode() {
        int iHashCode = this.f91446a.hashCode() * 31;
        String str = this.f91447b;
        return Boolean.hashCode(this.d) + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f91448c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91446a, i);
        dest.writeString(this.f91447b);
        dest.writeString(this.f91448c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
