package com.revolut.feature.wealth.private_equity.impl.ui.fund_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.ui.States$PersistentDomain;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wfh.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/private_equity/impl/ui/fund_details/FundDetailsScreenContract$RetainedState", "Lcom/revolut/kompot/navigable/vc/ui/States$PersistentDomain;", "", "toString", "()Ljava/lang/String;", "feature_wealth_private_equity_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FundDetailsScreenContract$RetainedState implements States$PersistentDomain {

    @NotNull
    public static final Parcelable.Creator<FundDetailsScreenContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f95774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f95775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f95776c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            j jVarValueOf = parcel.readInt() == 0 ? null : j.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = com.revolut.data.database.models.openbanking.d.e(FundDetailsScreenContract$RetainedState.class, parcel, linkedHashSet, iE, 1);
            }
            return new FundDetailsScreenContract$RetainedState(jVarValueOf, linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FundDetailsScreenContract$RetainedState[i];
        }
    }

    public FundDetailsScreenContract$RetainedState(j jVar, Set expandedAllocationItems, boolean z) {
        Intrinsics.checkNotNullParameter(expandedAllocationItems, "expandedAllocationItems");
        this.f95774a = jVar;
        this.f95775b = expandedAllocationItems;
        this.f95776c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FundDetailsScreenContract$RetainedState)) {
            return false;
        }
        FundDetailsScreenContract$RetainedState fundDetailsScreenContract$RetainedState = (FundDetailsScreenContract$RetainedState) obj2;
        return this.f95774a == fundDetailsScreenContract$RetainedState.f95774a && Intrinsics.f(this.f95775b, fundDetailsScreenContract$RetainedState.f95775b) && this.f95776c == fundDetailsScreenContract$RetainedState.f95776c;
    }

    public final int hashCode() {
        j jVar = this.f95774a;
        return Boolean.hashCode(this.f95776c) + p.a.f((jVar == null ? 0 : jVar.hashCode()) * 31, 31, this.f95775b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        j jVar = this.f95774a;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
        Iterator itV = n.v(this.f95775b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeInt(this.f95776c ? 1 : 0);
    }
}
