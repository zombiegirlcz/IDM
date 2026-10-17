package com.revolut.feature.tax_residency.impl.flows.collection;

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
import wi0.b;
import zhm.f0;
import zme.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/tax_residency/impl/flows/collection/CollectTaxResidencyFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollectTaxResidencyFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CollectTaxResidencyFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f90003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f90004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f90005c;
    public final List d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            f fVar = (f) parcel.readSerializable();
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            int iC2 = 0;
            while (iC2 != i) {
                iC2 = ch.qos.logback.core.util.a.c(parcel, arrayList, iC2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iC != i2) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            return new CollectTaxResidencyFlowContract$State(fVar, null, bVar, arrayList, arrayList2, 2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CollectTaxResidencyFlowContract$State[i];
        }
    }

    public CollectTaxResidencyFlowContract$State(f fVar, List taxResidencyRules, b bVar, List skippableTinCountries, List taxResidencies) {
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        this.f90003a = fVar;
        this.f90004b = taxResidencyRules;
        this.f90005c = bVar;
        this.d = skippableTinCountries;
        this.e = taxResidencies;
    }

    public static CollectTaxResidencyFlowContract$State a(CollectTaxResidencyFlowContract$State collectTaxResidencyFlowContract$State, f fVar, List list, b bVar, List list2, List list3, int i) {
        if ((i & 1) != 0) {
            fVar = collectTaxResidencyFlowContract$State.f90003a;
        }
        f fVar2 = fVar;
        if ((i & 2) != 0) {
            list = collectTaxResidencyFlowContract$State.f90004b;
        }
        List taxResidencyRules = list;
        if ((i & 4) != 0) {
            bVar = collectTaxResidencyFlowContract$State.f90005c;
        }
        b bVar2 = bVar;
        if ((i & 8) != 0) {
            list2 = collectTaxResidencyFlowContract$State.d;
        }
        List skippableTinCountries = list2;
        if ((i & 16) != 0) {
            list3 = collectTaxResidencyFlowContract$State.e;
        }
        List taxResidencies = list3;
        collectTaxResidencyFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(taxResidencyRules, "taxResidencyRules");
        Intrinsics.checkNotNullParameter(skippableTinCountries, "skippableTinCountries");
        Intrinsics.checkNotNullParameter(taxResidencies, "taxResidencies");
        return new CollectTaxResidencyFlowContract$State(fVar2, taxResidencyRules, bVar2, skippableTinCountries, taxResidencies);
    }

    public final b b() {
        b bVar = this.f90005c;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CollectTaxResidencyFlowContract$State)) {
            return false;
        }
        CollectTaxResidencyFlowContract$State collectTaxResidencyFlowContract$State = (CollectTaxResidencyFlowContract$State) obj2;
        return Intrinsics.f(this.f90003a, collectTaxResidencyFlowContract$State.f90003a) && Intrinsics.f(this.f90004b, collectTaxResidencyFlowContract$State.f90004b) && Intrinsics.f(this.f90005c, collectTaxResidencyFlowContract$State.f90005c) && Intrinsics.f(this.d, collectTaxResidencyFlowContract$State.d) && Intrinsics.f(this.e, collectTaxResidencyFlowContract$State.e);
    }

    public final int hashCode() {
        f fVar = this.f90003a;
        int iD = p.a.d((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f90004b);
        b bVar = this.f90005c;
        return this.e.hashCode() + p.a.d((iD + (bVar != null ? bVar.f297794a.hashCode() : 0)) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90003a);
        dest.writeSerializable(this.f90005c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
    }

    public CollectTaxResidencyFlowContract$State(f fVar, f0 f0Var, b bVar, List list, List list2, int i) {
        this((i & 1) != 0 ? null : fVar, (i & 2) != 0 ? f0.f322471a : f0Var, bVar, list, list2);
    }
}
