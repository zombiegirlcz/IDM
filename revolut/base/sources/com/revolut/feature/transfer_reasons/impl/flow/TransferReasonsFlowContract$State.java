package com.revolut.feature.transfer_reasons.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
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
import ttf.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonCategory f92332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f92333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92334c;
    public final List d;
    public final boolean e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            TransferReasonCategory transferReasonCategory = (TransferReasonCategory) j6.a.f(parcel, "parcel", TransferReasonsFlowContract$State.class);
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(TransferReasonsFlowContract$State.class, parcel, linkedHashSet, iE, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = j6.a.e(TransferReasonsFlowContract$State.class, parcel, arrayList, iE2, 1);
            }
            int i3 = parcel.readInt();
            boolean z = true;
            ArrayList arrayList2 = new ArrayList(i3);
            int iE3 = 0;
            while (iE3 != i3) {
                iE3 = j6.a.e(TransferReasonsFlowContract$State.class, parcel, arrayList2, iE3, 1);
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new TransferReasonsFlowContract$State(transferReasonCategory, linkedHashSet, arrayList, arrayList2, z, parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsFlowContract$State[i];
        }
    }

    public TransferReasonsFlowContract$State(TransferReasonCategory transferReasonCategory, Set selectedReasons, List additionalInfo, List allocations, boolean z, d dVar) {
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        this.f92332a = transferReasonCategory;
        this.f92333b = selectedReasons;
        this.f92334c = additionalInfo;
        this.d = allocations;
        this.e = z;
        this.f = dVar;
    }

    public static TransferReasonsFlowContract$State a(TransferReasonsFlowContract$State transferReasonsFlowContract$State, TransferReasonCategory transferReasonCategory, Set set, List list, List list2, boolean z, d dVar, int i) {
        if ((i & 1) != 0) {
            transferReasonCategory = transferReasonsFlowContract$State.f92332a;
        }
        TransferReasonCategory transferReasonCategory2 = transferReasonCategory;
        if ((i & 2) != 0) {
            set = transferReasonsFlowContract$State.f92333b;
        }
        Set selectedReasons = set;
        if ((i & 4) != 0) {
            list = transferReasonsFlowContract$State.f92334c;
        }
        List additionalInfo = list;
        if ((i & 8) != 0) {
            list2 = transferReasonsFlowContract$State.d;
        }
        List allocations = list2;
        if ((i & 16) != 0) {
            z = transferReasonsFlowContract$State.e;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            dVar = transferReasonsFlowContract$State.f;
        }
        transferReasonsFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(allocations, "allocations");
        return new TransferReasonsFlowContract$State(transferReasonCategory2, selectedReasons, additionalInfo, allocations, z3, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsFlowContract$State)) {
            return false;
        }
        TransferReasonsFlowContract$State transferReasonsFlowContract$State = (TransferReasonsFlowContract$State) obj2;
        return Intrinsics.f(this.f92332a, transferReasonsFlowContract$State.f92332a) && Intrinsics.f(this.f92333b, transferReasonsFlowContract$State.f92333b) && Intrinsics.f(this.f92334c, transferReasonsFlowContract$State.f92334c) && Intrinsics.f(this.d, transferReasonsFlowContract$State.d) && this.e == transferReasonsFlowContract$State.e && this.f == transferReasonsFlowContract$State.f;
    }

    public final int hashCode() {
        TransferReasonCategory transferReasonCategory = this.f92332a;
        int iC = j6.a.c(p.a.d(p.a.d(p.a.f((transferReasonCategory == null ? 0 : transferReasonCategory.hashCode()) * 31, 31, this.f92333b), 31, this.f92334c), 31, this.d), 31, this.e);
        d dVar = this.f;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92332a, i);
        Iterator itV = n.v(this.f92333b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        Iterator itV2 = p.a.v(this.f92334c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
        Iterator itV3 = p.a.v(this.d, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
        dest.writeInt(this.e ? 1 : 0);
        d dVar = this.f;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
    }

    public /* synthetic */ TransferReasonsFlowContract$State(TransferReasonCategory transferReasonCategory, Set set, List list, List list2, int i) {
        this(transferReasonCategory, set, list, list2, (i & 16) != 0, null);
    }
}
