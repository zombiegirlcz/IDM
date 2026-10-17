package com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.flow;

import android.os.Parcel;
import android.os.Parcelable;
import do3.n;
import ip0.v7;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/transaction_export/flow/TaxHubTransactionExportFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubTransactionExportFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TaxHubTransactionExportFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f74386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f74387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f74388c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f74389g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iA = 0;
            int iD = 0;
            while (iD != i) {
                iD = v7.d(parcel, linkedHashSet, iD, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i2);
            int iD2 = 0;
            while (iD2 != i2) {
                iD2 = v7.d(parcel, linkedHashSet2, iD2, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet3, iA, 1);
            }
            return new TaxHubTransactionExportFlowContract$State(linkedHashSet, linkedHashSet2, linkedHashSet3, parcel.readInt(), parcel.readInt(), parcel.readInt(), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubTransactionExportFlowContract$State[i];
        }
    }

    public TaxHubTransactionExportFlowContract$State() {
        this(0);
    }

    public static TaxHubTransactionExportFlowContract$State a(TaxHubTransactionExportFlowContract$State taxHubTransactionExportFlowContract$State, Set set, Set set2, LinkedHashSet linkedHashSet, int i, int i2, int i3, n nVar, int i5) {
        if ((i5 & 1) != 0) {
            set = taxHubTransactionExportFlowContract$State.f74386a;
        }
        Set selectedCategories = set;
        if ((i5 & 2) != 0) {
            set2 = taxHubTransactionExportFlowContract$State.f74387b;
        }
        Set selectedCurrencies = set2;
        Set set3 = linkedHashSet;
        if ((i5 & 4) != 0) {
            set3 = taxHubTransactionExportFlowContract$State.f74388c;
        }
        Set excludedTransactionIds = set3;
        if ((i5 & 8) != 0) {
            i = taxHubTransactionExportFlowContract$State.d;
        }
        int i6 = i;
        if ((i5 & 16) != 0) {
            i2 = taxHubTransactionExportFlowContract$State.e;
        }
        int i21 = i2;
        if ((i5 & 32) != 0) {
            i3 = taxHubTransactionExportFlowContract$State.f;
        }
        int i22 = i3;
        if ((i5 & 64) != 0) {
            nVar = taxHubTransactionExportFlowContract$State.f74389g;
        }
        taxHubTransactionExportFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        return new TaxHubTransactionExportFlowContract$State(selectedCategories, selectedCurrencies, excludedTransactionIds, i6, i21, i22, nVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubTransactionExportFlowContract$State)) {
            return false;
        }
        TaxHubTransactionExportFlowContract$State taxHubTransactionExportFlowContract$State = (TaxHubTransactionExportFlowContract$State) obj2;
        return Intrinsics.f(this.f74386a, taxHubTransactionExportFlowContract$State.f74386a) && Intrinsics.f(this.f74387b, taxHubTransactionExportFlowContract$State.f74387b) && Intrinsics.f(this.f74388c, taxHubTransactionExportFlowContract$State.f74388c) && this.d == taxHubTransactionExportFlowContract$State.d && this.e == taxHubTransactionExportFlowContract$State.e && this.f == taxHubTransactionExportFlowContract$State.f && Intrinsics.f(this.f74389g, taxHubTransactionExportFlowContract$State.f74389g);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f, j6.a.b(this.e, j6.a.b(this.d, p.a.f(p.a.f(this.f74386a.hashCode() * 31, 31, this.f74387b), 31, this.f74388c), 31), 31), 31);
        n nVar = this.f74389g;
        return iB + (nVar == null ? 0 : nVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = ehe.n.v(this.f74386a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = ehe.n.v(this.f74387b, dest);
        while (itV2.hasNext()) {
            dest.writeSerializable((Serializable) itV2.next());
        }
        Iterator itV3 = ehe.n.v(this.f74388c, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeSerializable(this.f74389g);
    }

    public TaxHubTransactionExportFlowContract$State(Set selectedCategories, Set selectedCurrencies, Set excludedTransactionIds, int i, int i2, int i3, n nVar) {
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        Intrinsics.checkNotNullParameter(excludedTransactionIds, "excludedTransactionIds");
        this.f74386a = selectedCategories;
        this.f74387b = selectedCurrencies;
        this.f74388c = excludedTransactionIds;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.f74389g = nVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TaxHubTransactionExportFlowContract$State(int i) {
        h0 h0Var = h0.f322473a;
        this(h0Var, h0Var, h0Var, 0, 0, 0, null);
    }
}
