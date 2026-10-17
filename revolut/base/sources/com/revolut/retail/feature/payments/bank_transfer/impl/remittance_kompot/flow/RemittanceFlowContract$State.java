package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittancePaymentsCountryData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import h30.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/flow/RemittanceFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<RemittanceFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemittancePaymentsCountryData f102031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemittanceTransferData f102032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final krf.b f102033c;
    public final Map d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            RemittancePaymentsCountryData remittancePaymentsCountryData = (RemittancePaymentsCountryData) j6.a.f(parcel, "parcel", RemittanceFlowContract$State.class);
            LinkedHashMap linkedHashMap = null;
            RemittanceTransferData remittanceTransferDataCreateFromParcel = parcel.readInt() == 0 ? null : RemittanceTransferData.CREATOR.createFromParcel(parcel);
            krf.b bVar = (krf.b) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new RemittanceFlowContract$State(remittancePaymentsCountryData, remittanceTransferDataCreateFromParcel, bVar, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceFlowContract$State[i];
        }
    }

    public RemittanceFlowContract$State(RemittancePaymentsCountryData remittancePaymentsCountryData, RemittanceTransferData remittanceTransferData, krf.b bVar, Map map) {
        this.f102031a = remittancePaymentsCountryData;
        this.f102032b = remittanceTransferData;
        this.f102033c = bVar;
        this.d = map;
    }

    public static RemittanceFlowContract$State a(RemittanceFlowContract$State remittanceFlowContract$State, RemittancePaymentsCountryData remittancePaymentsCountryData, RemittanceTransferData remittanceTransferData, krf.b bVar, Map map, int i) {
        if ((i & 1) != 0) {
            remittancePaymentsCountryData = remittanceFlowContract$State.f102031a;
        }
        if ((i & 2) != 0) {
            remittanceTransferData = remittanceFlowContract$State.f102032b;
        }
        if ((i & 4) != 0) {
            bVar = remittanceFlowContract$State.f102033c;
        }
        if ((i & 8) != 0) {
            map = remittanceFlowContract$State.d;
        }
        remittanceFlowContract$State.getClass();
        return new RemittanceFlowContract$State(remittancePaymentsCountryData, remittanceTransferData, bVar, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceFlowContract$State)) {
            return false;
        }
        RemittanceFlowContract$State remittanceFlowContract$State = (RemittanceFlowContract$State) obj2;
        return Intrinsics.f(this.f102031a, remittanceFlowContract$State.f102031a) && Intrinsics.f(this.f102032b, remittanceFlowContract$State.f102032b) && Intrinsics.f(this.f102033c, remittanceFlowContract$State.f102033c) && Intrinsics.f(this.d, remittanceFlowContract$State.d);
    }

    public final int hashCode() {
        RemittancePaymentsCountryData remittancePaymentsCountryData = this.f102031a;
        int iHashCode = (remittancePaymentsCountryData == null ? 0 : remittancePaymentsCountryData.hashCode()) * 31;
        RemittanceTransferData remittanceTransferData = this.f102032b;
        int iHashCode2 = (iHashCode + (remittanceTransferData == null ? 0 : remittanceTransferData.hashCode())) * 31;
        krf.b bVar = this.f102033c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Map map = this.d;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f102031a, i);
        RemittanceTransferData remittanceTransferData = this.f102032b;
        if (remittanceTransferData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            remittanceTransferData.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f102033c);
        Map map = this.d;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itV = l.v(dest, 1, map);
        while (itV.hasNext()) {
            Map.Entry entry = (Map.Entry) itV.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
