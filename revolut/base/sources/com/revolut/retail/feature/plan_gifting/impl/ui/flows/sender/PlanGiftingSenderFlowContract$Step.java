package com.revolut.retail.feature.plan_gifting.impl.ui.flows.sender;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zm3.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "RequestBirthdaySharing", "RequestBirthdaySharingModal", "SelectContact", "UpcomingBirthdays", "SendGift", "SendGiftConfirmation", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$RequestBirthdaySharing;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$RequestBirthdaySharingModal;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SelectContact;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SendGift;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SendGiftConfirmation;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$UpcomingBirthdays;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanGiftingSenderFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$RequestBirthdaySharing;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "<init>", "()V", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestBirthdaySharing extends PlanGiftingSenderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestBirthdaySharing f102480a = new RequestBirthdaySharing();

        @NotNull
        public static final Parcelable.Creator<RequestBirthdaySharing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestBirthdaySharing.f102480a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestBirthdaySharing[i];
            }
        }

        private RequestBirthdaySharing() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$RequestBirthdaySharingModal;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "<init>", "()V", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestBirthdaySharingModal extends PlanGiftingSenderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestBirthdaySharingModal f102481a = new RequestBirthdaySharingModal();

        @NotNull
        public static final Parcelable.Creator<RequestBirthdaySharingModal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestBirthdaySharingModal.f102481a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestBirthdaySharingModal[i];
            }
        }

        private RequestBirthdaySharingModal() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SelectContact;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectContact extends PlanGiftingSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectContact> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102482a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectContact(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectContact[i];
            }
        }

        public SelectContact(boolean z) {
            this.f102482a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectContact) && this.f102482a == ((SelectContact) obj2).f102482a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102482a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102482a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SendGift;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendGift extends PlanGiftingSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SendGift> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f102483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f102484b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SendGift((l) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendGift[i];
            }
        }

        public SendGift(l receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            this.f102483a = receiver;
            this.f102484b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SendGift)) {
                return false;
            }
            SendGift sendGift = (SendGift) obj2;
            return Intrinsics.f(this.f102483a, sendGift.f102483a) && this.f102484b == sendGift.f102484b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102484b) + (this.f102483a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102483a);
            dest.writeInt(this.f102484b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$SendGiftConfirmation;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SendGiftConfirmation extends PlanGiftingSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SendGiftConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f102485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102487c;
        public final i d;
        public final d e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SendGiftConfirmation((l) parcel.readSerializable(), parcel.readString(), parcel.readString(), i.valueOf(parcel.readString()), (d) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SendGiftConfirmation[i];
            }
        }

        public SendGiftConfirmation(l receiver, String selectedPlanId, String selectedPlanName, i selectedBillingCode, d dVar, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
            Intrinsics.checkNotNullParameter(selectedPlanName, "selectedPlanName");
            Intrinsics.checkNotNullParameter(selectedBillingCode, "selectedBillingCode");
            this.f102485a = receiver;
            this.f102486b = selectedPlanId;
            this.f102487c = selectedPlanName;
            this.d = selectedBillingCode;
            this.e = dVar;
            this.f = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SendGiftConfirmation)) {
                return false;
            }
            SendGiftConfirmation sendGiftConfirmation = (SendGiftConfirmation) obj2;
            return Intrinsics.f(this.f102485a, sendGiftConfirmation.f102485a) && Intrinsics.f(this.f102486b, sendGiftConfirmation.f102486b) && Intrinsics.f(this.f102487c, sendGiftConfirmation.f102487c) && this.d == sendGiftConfirmation.d && Intrinsics.f(this.e, sendGiftConfirmation.e) && this.f == sendGiftConfirmation.f;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f102485a.hashCode() * 31, 31, this.f102486b), 31, this.f102487c)) * 31;
            d dVar = this.e;
            return Boolean.hashCode(this.f) + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102485a);
            dest.writeString(this.f102486b);
            dest.writeString(this.f102487c);
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step$UpcomingBirthdays;", "Lcom/revolut/retail/feature/plan_gifting/impl/ui/flows/sender/PlanGiftingSenderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpcomingBirthdays extends PlanGiftingSenderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<UpcomingBirthdays> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f102488a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpcomingBirthdays(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpcomingBirthdays[i];
            }
        }

        public UpcomingBirthdays(boolean z) {
            this.f102488a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpcomingBirthdays) && this.f102488a == ((UpcomingBirthdays) obj2).f102488a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f102488a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f102488a ? 1 : 0);
        }
    }

    private PlanGiftingSenderFlowContract$Step() {
    }
}
