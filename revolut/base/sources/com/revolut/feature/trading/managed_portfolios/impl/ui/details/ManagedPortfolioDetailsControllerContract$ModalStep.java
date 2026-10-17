package com.revolut.feature.trading.managed_portfolios.impl.ui.details;

import alc.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BenchmarkChooser", "MoreActions", "RebalanceStatus", "TargetAllocations", "PerformanceDetails", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$BenchmarkChooser;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$MoreActions;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$PerformanceDetails;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$RebalanceStatus;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$TargetAllocations;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ManagedPortfolioDetailsControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$BenchmarkChooser;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BenchmarkChooser implements ManagedPortfolioDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BenchmarkChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91278a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BenchmarkChooser(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BenchmarkChooser[i];
            }
        }

        public BenchmarkChooser(String str) {
            this.f91278a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BenchmarkChooser) && Intrinsics.f(this.f91278a, ((BenchmarkChooser) obj2).f91278a);
        }

        public final int hashCode() {
            String str = this.f91278a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91278a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$MoreActions;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreActions implements ManagedPortfolioDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MoreActions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f91280b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(d.valueOf(parcel.readString()));
                }
                return new MoreActions(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoreActions[i];
            }
        }

        public MoreActions(String portfolioId, List actions) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(actions, "actions");
            this.f91279a = portfolioId;
            this.f91280b = actions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MoreActions)) {
                return false;
            }
            MoreActions moreActions = (MoreActions) obj2;
            return Intrinsics.f(this.f91279a, moreActions.f91279a) && Intrinsics.f(this.f91280b, moreActions.f91280b);
        }

        public final int hashCode() {
            return this.f91280b.hashCode() + (this.f91279a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91279a);
            Iterator itV = p.a.v(this.f91280b, dest);
            while (itV.hasNext()) {
                dest.writeString(((d) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$PerformanceDetails;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PerformanceDetails implements ManagedPortfolioDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PerformanceDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91281a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PerformanceDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PerformanceDetails[i];
            }
        }

        public PerformanceDetails(String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            this.f91281a = templateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PerformanceDetails) && Intrinsics.f(this.f91281a, ((PerformanceDetails) obj2).f91281a);
        }

        public final int hashCode() {
            return this.f91281a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91281a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$RebalanceStatus;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RebalanceStatus implements ManagedPortfolioDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RebalanceStatus> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xdh.b f91282a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RebalanceStatus(xdh.b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RebalanceStatus[i];
            }
        }

        public RebalanceStatus(xdh.b rebalanceStatus) {
            Intrinsics.checkNotNullParameter(rebalanceStatus, "rebalanceStatus");
            this.f91282a = rebalanceStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RebalanceStatus) && this.f91282a == ((RebalanceStatus) obj2).f91282a;
        }

        public final int hashCode() {
            return this.f91282a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91282a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep$TargetAllocations;", "Lcom/revolut/feature/trading/managed_portfolios/impl/ui/details/ManagedPortfolioDetailsControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_trading_managed_portfolios_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetAllocations implements ManagedPortfolioDetailsControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TargetAllocations> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91283a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetAllocations(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetAllocations[i];
            }
        }

        public TargetAllocations(String templateId) {
            Intrinsics.checkNotNullParameter(templateId, "templateId");
            this.f91283a = templateId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TargetAllocations) && Intrinsics.f(this.f91283a, ((TargetAllocations) obj2).f91283a);
        }

        public final int hashCode() {
            return this.f91283a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f91283a);
        }
    }
}
