package com.revolut.feature.transfer_reasons.impl.flow.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasons;
import com.revolut.kompot.navigable.flow.FlowState;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsRefundFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsRefundFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasons f92356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransferReasonCategory f92357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f92358c;
    public final List d;
    public final List e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferReasons transferReasons = (TransferReasons) j6.a.f(parcel, "parcel", TransferReasonsRefundFlowContract$State.class);
            TransferReasonCategory transferReasonCategory = (TransferReasonCategory) parcel.readParcelable(TransferReasonsRefundFlowContract$State.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(TransferReasonsRefundFlowContract$State.class, parcel, linkedHashSet, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(TransferReasonsRefundFlowContract$State.class, parcel, arrayList, iE2, 1);
            }
            int i3 = parcel.readInt();
            boolean z = true;
            ArrayList arrayList2 = new ArrayList(i3);
            int iE3 = 0;
            while (iE3 != i3) {
                iE3 = j6.a.e(TransferReasonsRefundFlowContract$State.class, parcel, arrayList2, iE3, 1);
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new TransferReasonsRefundFlowContract$State(transferReasons, transferReasonCategory, linkedHashSet, arrayList, arrayList2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsRefundFlowContract$State[i];
        }
    }

    public TransferReasonsRefundFlowContract$State() {
        this(null, null, null, null, 63);
    }

    public static TransferReasonsRefundFlowContract$State a(TransferReasonsRefundFlowContract$State transferReasonsRefundFlowContract$State, TransferReasonCategory transferReasonCategory, Set selectedReasons, List additionalInfo, List allocations, boolean z, int i) {
        TransferReasonCategory transferReasonCategory2 = transferReasonCategory;
        TransferReasons transferReasons = transferReasonsRefundFlowContract$State.f92356a;
        if ((i & 2) != 0) {
            transferReasonCategory2 = transferReasonsRefundFlowContract$State.f92357b;
        }
        if ((i & 4) != 0) {
            selectedReasons = transferReasonsRefundFlowContract$State.f92358c;
        }
        if ((i & 8) != 0) {
            additionalInfo = transferReasonsRefundFlowContract$State.d;
        }
        if ((i & 16) != 0) {
            allocations = transferReasonsRefundFlowContract$State.e;
        }
        if ((i & 32) != 0) {
            z = transferReasonsRefundFlowContract$State.f;
        }
        boolean z3 = z;
        transferReasonsRefundFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        List list = allocations;
        List list2 = additionalInfo;
        return new TransferReasonsRefundFlowContract$State(transferReasons, transferReasonCategory2, selectedReasons, list2, list, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsRefundFlowContract$State)) {
            return false;
        }
        TransferReasonsRefundFlowContract$State transferReasonsRefundFlowContract$State = (TransferReasonsRefundFlowContract$State) obj2;
        return Intrinsics.f(this.f92356a, transferReasonsRefundFlowContract$State.f92356a) && Intrinsics.f(this.f92357b, transferReasonsRefundFlowContract$State.f92357b) && Intrinsics.f(this.f92358c, transferReasonsRefundFlowContract$State.f92358c) && Intrinsics.f(this.d, transferReasonsRefundFlowContract$State.d) && Intrinsics.f(this.e, transferReasonsRefundFlowContract$State.e) && this.f == transferReasonsRefundFlowContract$State.f;
    }

    public final int hashCode() {
        TransferReasons transferReasons = this.f92356a;
        int iHashCode = (transferReasons == null ? 0 : transferReasons.hashCode()) * 31;
        TransferReasonCategory transferReasonCategory = this.f92357b;
        return Boolean.hashCode(this.f) + p.a.d(p.a.d(p.a.f((iHashCode + (transferReasonCategory != null ? transferReasonCategory.hashCode() : 0)) * 31, 31, this.f92358c), 31, this.d), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92356a, i);
        dest.writeParcelable(this.f92357b, i);
        Iterator itV = n.v(this.f92358c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        Iterator itV3 = p.a.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
        dest.writeInt(this.f ? 1 : 0);
    }

    public TransferReasonsRefundFlowContract$State(TransferReasons transferReasons, TransferReasonCategory transferReasonCategory, Set selectedReasons, List additionalInfo, List allocations, boolean z) {
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        this.f92356a = transferReasons;
        this.f92357b = transferReasonCategory;
        this.f92358c = selectedReasons;
        this.d = additionalInfo;
        this.e = allocations;
        this.f = z;
    }

    public TransferReasonsRefundFlowContract$State(TransferReasons transferReasons, TransferReasonCategory transferReasonCategory, Set set, List list, int i) {
        this((i & 1) != 0 ? null : transferReasons, (i & 2) != 0 ? null : transferReasonCategory, (i & 4) != 0 ? h0.f322473a : set, (i & 8) != 0 ? f0.f322471a : list, f0.f322471a, false);
    }
}
