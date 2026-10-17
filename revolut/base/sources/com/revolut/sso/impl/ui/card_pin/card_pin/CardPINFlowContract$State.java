package com.revolut.sso.impl.ui.card_pin.card_pin;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/sso/impl/ui/card_pin/card_pin/CardPINFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardPINFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CardPINFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f106392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106393b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardPINFlowContract$State(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardPINFlowContract$State[i];
        }
    }

    public CardPINFlowContract$State(String str, String str2) {
        this.f106392a = str;
        this.f106393b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardPINFlowContract$State)) {
            return false;
        }
        CardPINFlowContract$State cardPINFlowContract$State = (CardPINFlowContract$State) obj2;
        return Intrinsics.f(this.f106392a, cardPINFlowContract$State.f106392a) && Intrinsics.f(this.f106393b, cardPINFlowContract$State.f106393b);
    }

    public final int hashCode() {
        String str = this.f106392a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f106393b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f106392a);
        dest.writeString(this.f106393b);
    }

    public CardPINFlowContract$State() {
        this(null, null);
    }
}
