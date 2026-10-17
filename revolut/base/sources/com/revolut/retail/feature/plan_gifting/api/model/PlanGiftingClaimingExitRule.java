package com.revolut.retail.feature.plan_gifting.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule;", "Landroid/os/Parcelable;", "LeaveFlow", "OpenChatWithSender", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule$LeaveFlow;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule$OpenChatWithSender;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanGiftingClaimingExitRule extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule$LeaveFlow;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule;", "<init>", "()V", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LeaveFlow implements PlanGiftingClaimingExitRule {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LeaveFlow f102433a = new LeaveFlow();

        @NotNull
        public static final Parcelable.Creator<LeaveFlow> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LeaveFlow.f102433a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LeaveFlow[i];
            }
        }

        private LeaveFlow() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule$OpenChatWithSender;", "Lcom/revolut/retail/feature/plan_gifting/api/model/PlanGiftingClaimingExitRule;", "", "toString", "()Ljava/lang/String;", "feature_retail_plan_gifting_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenChatWithSender implements PlanGiftingClaimingExitRule {

        @NotNull
        public static final Parcelable.Creator<OpenChatWithSender> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102434a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenChatWithSender(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenChatWithSender[i];
            }
        }

        public OpenChatWithSender(String senderRevTag) {
            Intrinsics.checkNotNullParameter(senderRevTag, "senderRevTag");
            this.f102434a = senderRevTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenChatWithSender) && Intrinsics.f(this.f102434a, ((OpenChatWithSender) obj2).f102434a);
        }

        public final int hashCode() {
            return this.f102434a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102434a);
        }
    }
}
