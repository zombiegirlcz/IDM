package com.revolut.feature.credit.card.impl.ui.repay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import gu4.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/repay/flow/CreditCardRepayFlowContract$FlowState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "gu4/c", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardRepayFlowContract$FlowState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardRepayFlowContract$FlowState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f69569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f69570c;
    public final boolean d;
    public final c e;
    public final CreditCardAutopayPayments f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            xi0.b bVar = (xi0.b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new CreditCardRepayFlowContract$FlowState(string, z3, bVar, z, parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), (CreditCardAutopayPayments) parcel.readParcelable(CreditCardRepayFlowContract$FlowState.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardRepayFlowContract$FlowState[i];
        }
    }

    public CreditCardRepayFlowContract$FlowState() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardRepayFlowContract$FlowState)) {
            return false;
        }
        CreditCardRepayFlowContract$FlowState creditCardRepayFlowContract$FlowState = (CreditCardRepayFlowContract$FlowState) obj2;
        return Intrinsics.f(this.f69568a, creditCardRepayFlowContract$FlowState.f69568a) && this.f69569b == creditCardRepayFlowContract$FlowState.f69569b && Intrinsics.f(this.f69570c, creditCardRepayFlowContract$FlowState.f69570c) && this.d == creditCardRepayFlowContract$FlowState.d && this.e == creditCardRepayFlowContract$FlowState.e && Intrinsics.f(this.f, creditCardRepayFlowContract$FlowState.f);
    }

    public final int hashCode() {
        String str = this.f69568a;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f69569b);
        xi0.b bVar = this.f69570c;
        int iC2 = j6.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.d);
        c cVar = this.e;
        int iHashCode = (iC2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        CreditCardAutopayPayments creditCardAutopayPayments = this.f;
        return iHashCode + (creditCardAutopayPayments != null ? creditCardAutopayPayments.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69568a);
        dest.writeInt(this.f69569b ? 1 : 0);
        dest.writeSerializable(this.f69570c);
        dest.writeInt(this.d ? 1 : 0);
        c cVar = this.e;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeParcelable(this.f, i);
    }

    public CreditCardRepayFlowContract$FlowState(String str, boolean z, xi0.b bVar, boolean z3, c cVar, CreditCardAutopayPayments creditCardAutopayPayments) {
        this.f69568a = str;
        this.f69569b = z;
        this.f69570c = bVar;
        this.d = z3;
        this.e = cVar;
        this.f = creditCardAutopayPayments;
    }

    public /* synthetic */ CreditCardRepayFlowContract$FlowState(int i) {
        this(null, false, null, false, null, null);
    }
}
