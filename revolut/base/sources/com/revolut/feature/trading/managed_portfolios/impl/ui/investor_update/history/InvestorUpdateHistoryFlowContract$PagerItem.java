package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Landroid/os/Parcelable;", "Loading", "Year", "Error", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Error;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Loading;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Year;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestorUpdateHistoryFlowContract$PagerItem extends FixedIdPagerItem, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Error;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements InvestorUpdateHistoryFlowContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91356a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String str) {
            this.f91356a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f91356a, ((Error) obj2).f91356a);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF70838b() {
            return "ERROR_PAGE";
        }

        public final int hashCode() {
            String str = this.f91356a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91356a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Loading;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements InvestorUpdateHistoryFlowContract$PagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f91357a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f91357a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF70838b() {
            return "LOADING_PAGE";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem$Year;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/InvestorUpdateHistoryFlowContract$PagerItem;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Year implements InvestorUpdateHistoryFlowContract$PagerItem {

        @NotNull
        public static final Parcelable.Creator<Year> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f91358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f91359b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InvestorUpdate.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Year(i, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Year[i];
            }
        }

        public Year(int i, List updates) {
            Intrinsics.checkNotNullParameter(updates, "updates");
            this.f91358a = i;
            this.f91359b = updates;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Year)) {
                return false;
            }
            Year year = (Year) obj2;
            return this.f91358a == year.f91358a && Intrinsics.f(this.f91359b, year.f91359b);
        }

        @Override // com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem, com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF70838b() {
            return String.valueOf(this.f91358a);
        }

        public final int hashCode() {
            return this.f91359b.hashCode() + (Integer.hashCode(this.f91358a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f91358a);
            Iterator itV = p.a.v(this.f91359b, dest);
            while (itV.hasNext()) {
                ((InvestorUpdate) itV.next()).writeToParcel(dest, i);
            }
        }
    }
}
