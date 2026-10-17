package com.revolut.feature.credit.application.plugins.impl.ui.address.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/address/flow/CreditAddressFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditAddressFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CreditAddressFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gv3.b f66946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gv3.b f66947c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditAddressFlowContract$State(parcel.readString(), (gv3.b) parcel.readSerializable(), (gv3.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditAddressFlowContract$State[i];
        }
    }

    public CreditAddressFlowContract$State() {
        this(0);
    }

    public static CreditAddressFlowContract$State a(CreditAddressFlowContract$State creditAddressFlowContract$State, String predefinedPostcode, gv3.b bVar, gv3.b bVar2, int i) {
        if ((i & 1) != 0) {
            predefinedPostcode = creditAddressFlowContract$State.f66945a;
        }
        if ((i & 2) != 0) {
            bVar = creditAddressFlowContract$State.f66946b;
        }
        if ((i & 4) != 0) {
            bVar2 = creditAddressFlowContract$State.f66947c;
        }
        creditAddressFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(predefinedPostcode, "predefinedPostcode");
        return new CreditAddressFlowContract$State(predefinedPostcode, bVar, bVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditAddressFlowContract$State)) {
            return false;
        }
        CreditAddressFlowContract$State creditAddressFlowContract$State = (CreditAddressFlowContract$State) obj2;
        return Intrinsics.f(this.f66945a, creditAddressFlowContract$State.f66945a) && Intrinsics.f(this.f66946b, creditAddressFlowContract$State.f66946b) && Intrinsics.f(this.f66947c, creditAddressFlowContract$State.f66947c);
    }

    public final int hashCode() {
        int iHashCode = this.f66945a.hashCode() * 31;
        gv3.b bVar = this.f66946b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        gv3.b bVar2 = this.f66947c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66945a);
        dest.writeSerializable(this.f66946b);
        dest.writeSerializable(this.f66947c);
    }

    public CreditAddressFlowContract$State(String predefinedPostcode, gv3.b bVar, gv3.b bVar2) {
        Intrinsics.checkNotNullParameter(predefinedPostcode, "predefinedPostcode");
        this.f66945a = predefinedPostcode;
        this.f66946b = bVar;
        this.f66947c = bVar2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreditAddressFlowContract$State(int i) {
        this("", null, null);
        m70.a.c(t0.f186434a);
    }
}
