package com.revolut.feature.junior_tasks.impl.ui.challenges_kompot.overview.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_tasks.api.models.JuniorTasksTransferTaxes;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import ip0.v7;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "List", "Details", "PayForTasks", "ReviewTransfer", "TaxesBreakdown", "GmfBreakdown", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$Details;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$GmfBreakdown;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$List;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$PayForTasks;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$ReviewTransfer;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$TaxesBreakdown;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ChallengesOverviewContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$Details;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements ChallengesOverviewContract$Step {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77386a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String taskId) {
            Intrinsics.checkNotNullParameter(taskId, "taskId");
            this.f77386a = taskId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Details) && Intrinsics.f(this.f77386a, ((Details) obj2).f77386a);
        }

        public final int hashCode() {
            return this.f77386a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77386a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$GmfBreakdown;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GmfBreakdown implements ChallengesOverviewContract$Step {

        @NotNull
        public static final Parcelable.Creator<GmfBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorTasksTransferTaxes f77387a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GmfBreakdown((JuniorTasksTransferTaxes) parcel.readParcelable(GmfBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GmfBreakdown[i];
            }
        }

        public GmfBreakdown(JuniorTasksTransferTaxes taxes) {
            Intrinsics.checkNotNullParameter(taxes, "taxes");
            this.f77387a = taxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GmfBreakdown) && Intrinsics.f(this.f77387a, ((GmfBreakdown) obj2).f77387a);
        }

        public final int hashCode() {
            return this.f77387a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77387a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$List;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "<init>", "()V", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class List implements ChallengesOverviewContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final List f77388a = new List();

        @NotNull
        public static final Parcelable.Creator<List> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return List.f77388a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new List[i];
            }
        }

        private List() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$PayForTasks;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayForTasks implements ChallengesOverviewContract$Step {

        @NotNull
        public static final Parcelable.Creator<PayForTasks> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.List f77389a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new PayForTasks(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayForTasks[i];
            }
        }

        public PayForTasks(java.util.List tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            this.f77389a = tasks;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PayForTasks) && Intrinsics.f(this.f77389a, ((PayForTasks) obj2).f77389a);
        }

        public final int hashCode() {
            return this.f77389a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f77389a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$ReviewTransfer;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReviewTransfer implements ChallengesOverviewContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReviewTransfer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final java.util.List f77390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f77391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final JuniorTasksTransferTaxes f77392c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new ReviewTransfer(arrayList, (d) parcel.readSerializable(), (JuniorTasksTransferTaxes) parcel.readParcelable(ReviewTransfer.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReviewTransfer[i];
            }
        }

        public ReviewTransfer(java.util.List tasks, d reward, JuniorTasksTransferTaxes taxes) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            Intrinsics.checkNotNullParameter(reward, "reward");
            Intrinsics.checkNotNullParameter(taxes, "taxes");
            this.f77390a = tasks;
            this.f77391b = reward;
            this.f77392c = taxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReviewTransfer)) {
                return false;
            }
            ReviewTransfer reviewTransfer = (ReviewTransfer) obj2;
            return Intrinsics.f(this.f77390a, reviewTransfer.f77390a) && Intrinsics.f(this.f77391b, reviewTransfer.f77391b) && Intrinsics.f(this.f77392c, reviewTransfer.f77392c);
        }

        public final int hashCode() {
            return this.f77392c.hashCode() + v7.c(this.f77390a.hashCode() * 31, 31, this.f77391b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f77390a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeSerializable(this.f77391b);
            dest.writeParcelable(this.f77392c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step$TaxesBreakdown;", "Lcom/revolut/feature/junior_tasks/impl/ui/challenges_kompot/overview/flow/ChallengesOverviewContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_tasks_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxesBreakdown implements ChallengesOverviewContract$Step {

        @NotNull
        public static final Parcelable.Creator<TaxesBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorTasksTransferTaxes f77393a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxesBreakdown((JuniorTasksTransferTaxes) parcel.readParcelable(TaxesBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxesBreakdown[i];
            }
        }

        public TaxesBreakdown(JuniorTasksTransferTaxes taxes) {
            Intrinsics.checkNotNullParameter(taxes, "taxes");
            this.f77393a = taxes;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxesBreakdown) && Intrinsics.f(this.f77393a, ((TaxesBreakdown) obj2).f77393a);
        }

        public final int hashCode() {
            return this.f77393a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77393a, i);
        }
    }
}
