package com.revolut.feature.tax_residency.impl.flows.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/list/TaxResidenciesListFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxResidenciesListFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<TaxResidenciesListFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f90029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90031c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            wi0.b bVar = (wi0.b) parcel.readSerializable();
            int iC = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iC2 = 0;
                while (iC2 != i) {
                    iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iC != i2) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
            }
            return new TaxResidenciesListFlowContract$State(bVar, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxResidenciesListFlowContract$State[i];
        }
    }

    public TaxResidenciesListFlowContract$State(wi0.b bVar, List list, List list2) {
        this.f90029a = bVar;
        this.f90030b = list;
        this.f90031c = list2;
    }

    public static TaxResidenciesListFlowContract$State a(TaxResidenciesListFlowContract$State taxResidenciesListFlowContract$State, List list) {
        wi0.b bVar = taxResidenciesListFlowContract$State.f90029a;
        List list2 = taxResidenciesListFlowContract$State.f90031c;
        taxResidenciesListFlowContract$State.getClass();
        return new TaxResidenciesListFlowContract$State(bVar, list, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxResidenciesListFlowContract$State)) {
            return false;
        }
        TaxResidenciesListFlowContract$State taxResidenciesListFlowContract$State = (TaxResidenciesListFlowContract$State) obj2;
        return Intrinsics.f(this.f90029a, taxResidenciesListFlowContract$State.f90029a) && Intrinsics.f(this.f90030b, taxResidenciesListFlowContract$State.f90030b) && Intrinsics.f(this.f90031c, taxResidenciesListFlowContract$State.f90031c);
    }

    public final int hashCode() {
        wi0.b bVar = this.f90029a;
        int iHashCode = (bVar == null ? 0 : bVar.f297794a.hashCode()) * 31;
        List list = this.f90030b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f90031c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90029a);
        List list = this.f90030b;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeSerializable((Serializable) itQ.next());
            }
        }
        List list2 = this.f90031c;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            dest.writeSerializable((Serializable) itQ2.next());
        }
    }

    public TaxResidenciesListFlowContract$State() {
        this(null, null, null);
    }
}
