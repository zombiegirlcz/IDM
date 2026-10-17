package com.revolut.feature.trading.managed_portfolios.impl.ui.investor_update.history.pages;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trading.managed_portfolios.impl.domain.investor_update.model.InvestorUpdate;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Loading", "Error", "Content", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Content;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Error;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Loading;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InvestorUpdateHistoryPageScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Content;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Content implements InvestorUpdateHistoryPageScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Content> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f91364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f91365b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(InvestorUpdate.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Content(arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Content[i];
            }
        }

        public Content(List investorUpdates, String str) {
            Intrinsics.checkNotNullParameter(investorUpdates, "investorUpdates");
            this.f91364a = investorUpdates;
            this.f91365b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Content)) {
                return false;
            }
            Content content = (Content) obj2;
            return Intrinsics.f(this.f91364a, content.f91364a) && Intrinsics.f(this.f91365b, content.f91365b);
        }

        public final int hashCode() {
            int iHashCode = this.f91364a.hashCode() * 31;
            String str = this.f91365b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f91364a, dest);
            while (itV.hasNext()) {
                ((InvestorUpdate) itV.next()).writeToParcel(dest, i);
            }
            dest.writeString(this.f91365b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Loading;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData;", "<init>", "()V", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading implements InvestorUpdateHistoryPageScreenContract$InputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f91367a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f91367a;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData$Error;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/investor_update/history/pages/InvestorUpdateHistoryPageScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements InvestorUpdateHistoryPageScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91366a;

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
            this.f91366a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Error) && Intrinsics.f(this.f91366a, ((Error) obj2).f91366a);
        }

        public final int hashCode() {
            String str = this.f91366a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91366a);
        }

        public Error() {
            this(null);
        }
    }
}
