package com.revolut.feature.apm.upi.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Amount", "Review", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step$Review;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpiTransferFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step$Amount;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step;", "<init>", "()V", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Amount extends UpiTransferFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Amount f62969a = new Amount();

        @NotNull
        public static final Parcelable.Creator<Amount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Amount.f62969a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Amount[i];
            }
        }

        private Amount() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step$Review;", "Lcom/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends UpiTransferFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f62970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TransferScheduleData f62971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62972c;
        public final io3.d d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVar = (d) parcel.readSerializable();
                return new Review((TransferScheduleData) parcel.readParcelable(Review.class.getClassLoader()), dVar, (io3.d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(TransferScheduleData scheduleData, d amount, io3.d dVar, String reference, String str) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
            Intrinsics.checkNotNullParameter(reference, "reference");
            this.f62970a = amount;
            this.f62971b = scheduleData;
            this.f62972c = reference;
            this.d = dVar;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Review)) {
                return false;
            }
            Review review = (Review) obj2;
            return Intrinsics.f(this.f62970a, review.f62970a) && Intrinsics.f(this.f62971b, review.f62971b) && Intrinsics.f(this.f62972c, review.f62972c) && Intrinsics.f(this.d, review.d) && Intrinsics.f(this.e, review.e);
        }

        public final int hashCode() {
            int iC = p.a.c(l.f(this.f62971b, this.f62970a.hashCode() * 31, 31), 31, this.f62972c);
            io3.d dVar = this.d;
            int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62970a);
            dest.writeParcelable(this.f62971b, i);
            dest.writeString(this.f62972c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e);
        }
    }

    private UpiTransferFlowContract$Step() {
    }
}
