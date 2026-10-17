package com.revolut.feature.apm.swish.impl.ui.home.area;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TransactionLimit", "LinkedPhoneNumber", "Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep$LinkedPhoneNumber;", "Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep$TransactionLimit;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SwishHomeAreaScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep$LinkedPhoneNumber;", "Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep;", "<init>", "()V", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LinkedPhoneNumber implements SwishHomeAreaScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LinkedPhoneNumber f62922a = new LinkedPhoneNumber();

        @NotNull
        public static final Parcelable.Creator<LinkedPhoneNumber> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LinkedPhoneNumber.f62922a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedPhoneNumber[i];
            }
        }

        private LinkedPhoneNumber() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep$TransactionLimit;", "Lcom/revolut/feature/apm/swish/impl/ui/home/area/SwishHomeAreaScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_apm_swish_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TransactionLimit implements SwishHomeAreaScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TransactionLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f62923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f62924b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TransactionLimit((d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransactionLimit[i];
            }
        }

        public TransactionLimit(d limit, d maxLimit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            Intrinsics.checkNotNullParameter(maxLimit, "maxLimit");
            this.f62923a = limit;
            this.f62924b = maxLimit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TransactionLimit)) {
                return false;
            }
            TransactionLimit transactionLimit = (TransactionLimit) obj2;
            return Intrinsics.f(this.f62923a, transactionLimit.f62923a) && Intrinsics.f(this.f62924b, transactionLimit.f62924b);
        }

        public final int hashCode() {
            return this.f62924b.hashCode() + (this.f62923a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62923a);
            dest.writeSerializable(this.f62924b);
        }
    }
}
