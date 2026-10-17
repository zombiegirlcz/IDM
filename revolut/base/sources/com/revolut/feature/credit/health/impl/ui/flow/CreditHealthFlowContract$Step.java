package com.revolut.feature.credit.health.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.health.api.models.CreditScore;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreDetails;
import com.revolut.feature.credit.health.impl.domain.model.CreditScoreInsight;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"com/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Dashboard", "Insights", "LearnMore", "ModalStep", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$Dashboard;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$Insights;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$LearnMore;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$ModalStep;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreditHealthFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$Dashboard;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step;", "<init>", "()V", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dashboard extends CreditHealthFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dashboard f69995a = new Dashboard();

        @NotNull
        public static final Parcelable.Creator<Dashboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dashboard.f69995a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dashboard[i];
            }
        }

        private Dashboard() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$Insights;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Insights extends CreditHealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Insights> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditScoreDetails f69996a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Insights(CreditScoreDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Insights[i];
            }
        }

        public Insights(CreditScoreDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f69996a = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Insights) && Intrinsics.f(this.f69996a, ((Insights) obj2).f69996a);
        }

        public final int hashCode() {
            return this.f69996a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f69996a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$LearnMore;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LearnMore extends CreditHealthFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LearnMore> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CreditScore f69997a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LearnMore((CreditScore) parcel.readParcelable(LearnMore.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LearnMore[i];
            }
        }

        public LearnMore(CreditScore creditScore) {
            Intrinsics.checkNotNullParameter(creditScore, "creditScore");
            this.f69997a = creditScore;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LearnMore) && Intrinsics.f(this.f69997a, ((LearnMore) obj2).f69997a);
        }

        public final int hashCode() {
            return this.f69997a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f69997a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step;", "<init>", "()V", "InsightDetailed", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$ModalStep$InsightDetailed;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends CreditHealthFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$ModalStep$InsightDetailed;", "Lcom/revolut/feature/credit/health/impl/ui/flow/CreditHealthFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_health_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InsightDetailed extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<InsightDetailed> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CreditScoreInsight f69998a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InsightDetailed(CreditScoreInsight.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InsightDetailed[i];
                }
            }

            public InsightDetailed(CreditScoreInsight insight) {
                Intrinsics.checkNotNullParameter(insight, "insight");
                this.f69998a = insight;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InsightDetailed) && Intrinsics.f(this.f69998a, ((InsightDetailed) obj2).f69998a);
            }

            public final int hashCode() {
                return this.f69998a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f69998a.writeToParcel(dest, i);
            }
        }

        private ModalStep() {
        }
    }

    private CreditHealthFlowContract$Step() {
    }
}
