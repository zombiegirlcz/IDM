package com.revolut.feature.credit.application.plugins.impl.ui.credit_post_activation_waiting;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.delayed_credit_check.DelayedCreditCheckResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/credit_post_activation_waiting/CreditPostActivationWaitingFlowContract$DomainState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditPostActivationWaitingFlowContract$DomainState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditPostActivationWaitingFlowContract$DomainState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f67405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67407c;
    public final String d;
    public final DelayedCreditCheckResponse.TimeoutPrompt e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditPostActivationWaitingFlowContract$DomainState(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), (DelayedCreditCheckResponse.TimeoutPrompt) parcel.readParcelable(CreditPostActivationWaitingFlowContract$DomainState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditPostActivationWaitingFlowContract$DomainState[i];
        }
    }

    public CreditPostActivationWaitingFlowContract$DomainState() {
        this(0);
    }

    public static CreditPostActivationWaitingFlowContract$DomainState a(CreditPostActivationWaitingFlowContract$DomainState creditPostActivationWaitingFlowContract$DomainState, int i, int i2, int i3, String str, DelayedCreditCheckResponse.TimeoutPrompt timeoutPrompt, int i5) {
        if ((i5 & 1) != 0) {
            i = creditPostActivationWaitingFlowContract$DomainState.f67405a;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            i2 = creditPostActivationWaitingFlowContract$DomainState.f67406b;
        }
        int i21 = i2;
        if ((i5 & 4) != 0) {
            i3 = creditPostActivationWaitingFlowContract$DomainState.f67407c;
        }
        int i22 = i3;
        if ((i5 & 8) != 0) {
            str = creditPostActivationWaitingFlowContract$DomainState.d;
        }
        String str2 = str;
        if ((i5 & 16) != 0) {
            timeoutPrompt = creditPostActivationWaitingFlowContract$DomainState.e;
        }
        creditPostActivationWaitingFlowContract$DomainState.getClass();
        return new CreditPostActivationWaitingFlowContract$DomainState(i6, i21, i22, str2, timeoutPrompt);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditPostActivationWaitingFlowContract$DomainState)) {
            return false;
        }
        CreditPostActivationWaitingFlowContract$DomainState creditPostActivationWaitingFlowContract$DomainState = (CreditPostActivationWaitingFlowContract$DomainState) obj2;
        return this.f67405a == creditPostActivationWaitingFlowContract$DomainState.f67405a && this.f67406b == creditPostActivationWaitingFlowContract$DomainState.f67406b && this.f67407c == creditPostActivationWaitingFlowContract$DomainState.f67407c && Intrinsics.f(this.d, creditPostActivationWaitingFlowContract$DomainState.d) && Intrinsics.f(this.e, creditPostActivationWaitingFlowContract$DomainState.e);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f67407c, j6.a.b(this.f67406b, Integer.hashCode(this.f67405a) * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        DelayedCreditCheckResponse.TimeoutPrompt timeoutPrompt = this.e;
        return iHashCode + (timeoutPrompt != null ? timeoutPrompt.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f67405a);
        dest.writeInt(this.f67406b);
        dest.writeInt(this.f67407c);
        dest.writeString(this.d);
        dest.writeParcelable(this.e, i);
    }

    public CreditPostActivationWaitingFlowContract$DomainState(int i, int i2, int i3, String str, DelayedCreditCheckResponse.TimeoutPrompt timeoutPrompt) {
        this.f67405a = i;
        this.f67406b = i2;
        this.f67407c = i3;
        this.d = str;
        this.e = timeoutPrompt;
    }

    public /* synthetic */ CreditPostActivationWaitingFlowContract$DomainState(int i) {
        this(0, 0, 0, null, null);
    }
}
