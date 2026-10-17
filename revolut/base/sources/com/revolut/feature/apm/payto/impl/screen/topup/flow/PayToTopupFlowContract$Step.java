package com.revolut.feature.apm.payto.impl.screen.topup.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "LinkedAccount", "CompleteAuthorization", "Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step$CompleteAuthorization;", "Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step$LinkedAccount;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayToTopupFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step$CompleteAuthorization;", "Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CompleteAuthorization extends PayToTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CompleteAuthorization> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62760a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CompleteAuthorization(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CompleteAuthorization[i];
            }
        }

        public CompleteAuthorization(String storedMethodId) {
            Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
            this.f62760a = storedMethodId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CompleteAuthorization) && Intrinsics.f(this.f62760a, ((CompleteAuthorization) obj2).f62760a);
        }

        public final int hashCode() {
            return this.f62760a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62760a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step$LinkedAccount;", "Lcom/revolut/feature/apm/payto/impl/screen/topup/flow/PayToTopupFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_apm_payto_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccount extends PayToTopupFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LinkedAccount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f62761a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccount((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccount[i];
            }
        }

        public LinkedAccount(d amount) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f62761a = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LinkedAccount) && Intrinsics.f(this.f62761a, ((LinkedAccount) obj2).f62761a);
        }

        public final int hashCode() {
            return this.f62761a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f62761a);
        }
    }

    private PayToTopupFlowContract$Step() {
    }
}
