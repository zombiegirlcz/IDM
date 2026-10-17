package com.revolut.feature.robo.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.robo.impl.ui.screen.transaction_details.RoboTransactionDetailsControllerContract$Input;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "TransactionDetailsDestination", "SetPortfolioSpareChangeDestination", "MigratePortfolioSpareChangeDestination", "ManageGoalDestination", "PortfolioDetailsDestination", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$ManageGoalDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$MigratePortfolioSpareChangeDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$PortfolioDetailsDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$SetPortfolioSpareChangeDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$TransactionDetailsDestination;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RoboInternalDestination extends KompotDestination {

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$ManageGoalDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManageGoalDestination implements RoboInternalDestination {

        @NotNull
        public static final Parcelable.Creator<ManageGoalDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85090a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManageGoalDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManageGoalDestination[i];
            }
        }

        public ManageGoalDestination(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85090a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ManageGoalDestination) && Intrinsics.f(this.f85090a, ((ManageGoalDestination) obj2).f85090a);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85090a() {
            return this.f85090a;
        }

        public final int hashCode() {
            return this.f85090a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85090a);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$MigratePortfolioSpareChangeDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MigratePortfolioSpareChangeDestination implements RoboInternalDestination {

        @NotNull
        public static final Parcelable.Creator<MigratePortfolioSpareChangeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final yvh.b f85092b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MigratePortfolioSpareChangeDestination(parcel.readString(), (yvh.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MigratePortfolioSpareChangeDestination[i];
            }
        }

        public MigratePortfolioSpareChangeDestination(String portfolioId, yvh.b activeAutoInvest) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(activeAutoInvest, "activeAutoInvest");
            this.f85091a = portfolioId;
            this.f85092b = activeAutoInvest;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final yvh.b getF85092b() {
            return this.f85092b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MigratePortfolioSpareChangeDestination)) {
                return false;
            }
            MigratePortfolioSpareChangeDestination migratePortfolioSpareChangeDestination = (MigratePortfolioSpareChangeDestination) obj2;
            return Intrinsics.f(this.f85091a, migratePortfolioSpareChangeDestination.f85091a) && Intrinsics.f(this.f85092b, migratePortfolioSpareChangeDestination.f85092b);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85091a() {
            return this.f85091a;
        }

        public final int hashCode() {
            return this.f85092b.hashCode() + (this.f85091a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85091a);
            dest.writeSerializable(this.f85092b);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$PortfolioDetailsDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @yhm.d
    public static final /* data */ class PortfolioDetailsDestination implements RoboInternalDestination {

        @NotNull
        public static final Parcelable.Creator<PortfolioDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85093a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortfolioDetailsDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortfolioDetailsDestination[i];
            }
        }

        public PortfolioDetailsDestination(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85093a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PortfolioDetailsDestination) && Intrinsics.f(this.f85093a, ((PortfolioDetailsDestination) obj2).f85093a);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getF85093a() {
            return this.f85093a;
        }

        public final int hashCode() {
            return this.f85093a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85093a);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$SetPortfolioSpareChangeDestination;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SetPortfolioSpareChangeDestination implements RoboInternalDestination {

        @NotNull
        public static final Parcelable.Creator<SetPortfolioSpareChangeDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85094a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SetPortfolioSpareChangeDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetPortfolioSpareChangeDestination[i];
            }
        }

        public SetPortfolioSpareChangeDestination(String portfolioId) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f85094a = portfolioId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SetPortfolioSpareChangeDestination) && Intrinsics.f(this.f85094a, ((SetPortfolioSpareChangeDestination) obj2).f85094a);
        }

        public final int hashCode() {
            return this.f85094a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85094a);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination$TransactionDetailsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/robo/impl/ui/screen/transaction_details/RoboTransactionDetailsControllerContract$Input;", "Lcom/revolut/feature/robo/impl/navigation/RoboInternalDestination;", "", "toString", "()Ljava/lang/String;", "feature_robo_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionDetailsDestination extends InternalDestination<RoboTransactionDetailsControllerContract$Input> implements RoboInternalDestination {

        @NotNull
        public static final Parcelable.Creator<TransactionDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RoboTransactionDetailsControllerContract$Input f85095b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionDetailsDestination(RoboTransactionDetailsControllerContract$Input.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionDetailsDestination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TransactionDetailsDestination(RoboTransactionDetailsControllerContract$Input inputData) {
            super(inputData);
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f85095b = inputData;
        }

        @Override // com.revolut.kompot.common.InternalDestination
        /* JADX INFO: renamed from: b */
        public final IOData$Input getF80510b() {
            return this.f85095b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final RoboTransactionDetailsControllerContract$Input getF85095b() {
            return this.f85095b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TransactionDetailsDestination) && Intrinsics.f(this.f85095b, ((TransactionDetailsDestination) obj2).f85095b);
        }

        public final int hashCode() {
            return this.f85095b.f85220a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f85095b.writeToParcel(dest, i);
        }
    }
}
