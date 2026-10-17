package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ReferenceStep", "ScheduleStep", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep$ReferenceStep;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep$ScheduleStep;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PeerToPeerReviewScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep$ReferenceStep;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReferenceStep implements PeerToPeerReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ReferenceStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102363a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReferenceStep(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferenceStep[i];
            }
        }

        public ReferenceStep(String reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f102363a = reference;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReferenceStep) && Intrinsics.f(this.f102363a, ((ReferenceStep) obj2).f102363a);
        }

        public final int hashCode() {
            return this.f102363a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102363a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep$ScheduleStep;", "Lcom/revolut/retail/feature/payments/peer_to_peer/impl/ui_kompot/review/PeerToPeerReviewScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_payments_peer_to_peer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScheduleStep implements PeerToPeerReviewScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ScheduleStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m1l.a f102364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferScheduleData f102365b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScheduleStep((TransferScheduleData) parcel.readParcelable(ScheduleStep.class.getClassLoader()), m1l.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScheduleStep[i];
            }
        }

        public ScheduleStep(TransferScheduleData scheduleData, m1l.a scheduleMode) {
            Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            this.f102364a = scheduleMode;
            this.f102365b = scheduleData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScheduleStep)) {
                return false;
            }
            ScheduleStep scheduleStep = (ScheduleStep) obj2;
            return this.f102364a == scheduleStep.f102364a && Intrinsics.f(this.f102365b, scheduleStep.f102365b);
        }

        public final int hashCode() {
            return this.f102365b.hashCode() + (this.f102364a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102364a.name());
            dest.writeParcelable(this.f102365b, i);
        }
    }
}
