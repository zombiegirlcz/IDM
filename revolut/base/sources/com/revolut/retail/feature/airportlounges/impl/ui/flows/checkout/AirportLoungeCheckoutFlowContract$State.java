package com.revolut.retail.feature.airportlounges.impl.ui.flows.checkout;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/airportlounges/impl/ui/flows/checkout/AirportLoungeCheckoutFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AirportLoungeCheckoutFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<AirportLoungeCheckoutFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f98958b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AirportLoungeCheckoutFlowContract$State(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AirportLoungeCheckoutFlowContract$State[i];
        }
    }

    public AirportLoungeCheckoutFlowContract$State(String idempotencyKey, int i) {
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        this.f98957a = idempotencyKey;
        this.f98958b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AirportLoungeCheckoutFlowContract$State)) {
            return false;
        }
        AirportLoungeCheckoutFlowContract$State airportLoungeCheckoutFlowContract$State = (AirportLoungeCheckoutFlowContract$State) obj2;
        return Intrinsics.f(this.f98957a, airportLoungeCheckoutFlowContract$State.f98957a) && this.f98958b == airportLoungeCheckoutFlowContract$State.f98958b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98958b) + (this.f98957a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98957a);
        dest.writeInt(this.f98958b);
    }
}
