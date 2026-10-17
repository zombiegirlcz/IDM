package com.revolut.feature.bank_account_switching.impl.ui.switch_out;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Review", "Confirmation", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step$Confirmation;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step$Review;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BankAccountSwitchingSwitchOutFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step$Confirmation;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirmation extends BankAccountSwitchingSwitchOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mn2.a f64046b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f64047c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirmation(parcel.readString(), mn2.a.valueOf(parcel.readString()), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirmation[i];
            }
        }

        public Confirmation(String requestId, mn2.a serviceType, LocalDate switchDate) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            Intrinsics.checkNotNullParameter(serviceType, "serviceType");
            Intrinsics.checkNotNullParameter(switchDate, "switchDate");
            this.f64045a = requestId;
            this.f64046b = serviceType;
            this.f64047c = switchDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirmation)) {
                return false;
            }
            Confirmation confirmation = (Confirmation) obj2;
            return Intrinsics.f(this.f64045a, confirmation.f64045a) && this.f64046b == confirmation.f64046b && Intrinsics.f(this.f64047c, confirmation.f64047c);
        }

        public final int hashCode() {
            return this.f64047c.hashCode() + ((this.f64046b.hashCode() + (this.f64045a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64045a);
            dest.writeString(this.f64046b.name());
            dest.writeSerializable(this.f64047c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step$Review;", "Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/BankAccountSwitchingSwitchOutFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends BankAccountSwitchingSwitchOutFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64048a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(String requestId) {
            Intrinsics.checkNotNullParameter(requestId, "requestId");
            this.f64048a = requestId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f64048a, ((Review) obj2).f64048a);
        }

        public final int hashCode() {
            return this.f64048a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64048a);
        }
    }

    private BankAccountSwitchingSwitchOutFlowContract$Step() {
    }
}
