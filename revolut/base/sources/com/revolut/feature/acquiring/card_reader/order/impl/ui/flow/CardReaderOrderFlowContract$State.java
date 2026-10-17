package com.revolut.feature.acquiring.card_reader.order.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.card_reader.order.api.model.VatSelection;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/flow/CardReaderOrderFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardReaderOrderFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CardReaderOrderFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VatSelection f60590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f60591b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardReaderOrderFlowContract$State((VatSelection) parcel.readParcelable(CardReaderOrderFlowContract$State.class.getClassLoader()), (Address) parcel.readParcelable(CardReaderOrderFlowContract$State.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardReaderOrderFlowContract$State[i];
        }
    }

    public CardReaderOrderFlowContract$State(VatSelection vatSelection, Address address) {
        this.f60590a = vatSelection;
        this.f60591b = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardReaderOrderFlowContract$State)) {
            return false;
        }
        CardReaderOrderFlowContract$State cardReaderOrderFlowContract$State = (CardReaderOrderFlowContract$State) obj2;
        return Intrinsics.f(this.f60590a, cardReaderOrderFlowContract$State.f60590a) && Intrinsics.f(this.f60591b, cardReaderOrderFlowContract$State.f60591b);
    }

    public final int hashCode() {
        VatSelection vatSelection = this.f60590a;
        int iHashCode = (vatSelection == null ? 0 : vatSelection.hashCode()) * 31;
        Address address = this.f60591b;
        return iHashCode + (address != null ? address.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60590a, i);
        dest.writeParcelable(this.f60591b, i);
    }
}
