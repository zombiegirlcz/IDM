package com.revolut.feature.credit.card.impl.ui.instalment.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import dj0.d;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import ql4.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstalmentFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<InstalmentFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f69330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f69331c;
    public final l d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            while (iA != i) {
                iA = o.a(parcel, linkedHashSet, iA, 1);
            }
            return new InstalmentFlowContract$State(string, linkedHashSet, (s) parcel.readSerializable(), l.valueOf(parcel.readString()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstalmentFlowContract$State[i];
        }
    }

    public InstalmentFlowContract$State(String facilityId, Set transactionIds, s sVar, l pocketType, d dVar) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f69329a = facilityId;
        this.f69330b = transactionIds;
        this.f69331c = sVar;
        this.d = pocketType;
        this.e = dVar;
    }

    public static InstalmentFlowContract$State a(InstalmentFlowContract$State instalmentFlowContract$State, Set set, s sVar, l lVar, int i) {
        String facilityId = instalmentFlowContract$State.f69329a;
        if ((i & 2) != 0) {
            set = instalmentFlowContract$State.f69330b;
        }
        Set transactionIds = set;
        if ((i & 4) != 0) {
            sVar = instalmentFlowContract$State.f69331c;
        }
        s sVar2 = sVar;
        if ((i & 8) != 0) {
            lVar = instalmentFlowContract$State.d;
        }
        l pocketType = lVar;
        d dVar = instalmentFlowContract$State.e;
        instalmentFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        return new InstalmentFlowContract$State(facilityId, transactionIds, sVar2, pocketType, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstalmentFlowContract$State)) {
            return false;
        }
        InstalmentFlowContract$State instalmentFlowContract$State = (InstalmentFlowContract$State) obj2;
        return Intrinsics.f(this.f69329a, instalmentFlowContract$State.f69329a) && Intrinsics.f(this.f69330b, instalmentFlowContract$State.f69330b) && Intrinsics.f(this.f69331c, instalmentFlowContract$State.f69331c) && this.d == instalmentFlowContract$State.d && Intrinsics.f(this.e, instalmentFlowContract$State.e);
    }

    public final int hashCode() {
        int iF = p.a.f(this.f69329a.hashCode() * 31, 31, this.f69330b);
        s sVar = this.f69331c;
        int iC = t61.a.c(this.d, (iF + (sVar == null ? 0 : sVar.hashCode())) * 31, 31);
        d dVar = this.e;
        return iC + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69329a);
        Iterator itV = n.v(this.f69330b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        dest.writeSerializable(this.f69331c);
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
    }
}
