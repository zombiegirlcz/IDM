package com.revolut.retail.feature.balance.picker.api.balance_picker_v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k1j.d;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/balance/picker/api/balance_picker_v2/BalanceSelector$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BalanceSelector$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BalanceSelector$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f99379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f99380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f99381c;
    public final Clause d;
    public final Set e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f99382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f99383h;
    public final Set i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet3.add(k1j.a.valueOf(parcel.readString()));
            }
            d dVarValueOf = d.valueOf(parcel.readString());
            l lVarValueOf = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
            Clause clause = (Clause) parcel.readParcelable(BalanceSelector$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i3 = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i3);
                int iA = 0;
                while (iA != i3) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashSet2 = null;
            } else {
                int i5 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i5);
                int iA2 = 0;
                while (iA2 != i5) {
                    iA2 = o.a(parcel, linkedHashSet2, iA2, 1);
                }
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i6);
            int iA3 = 0;
            while (iA3 != i6) {
                iA3 = o.a(parcel, linkedHashSet4, iA3, 1);
            }
            String string = parcel.readString();
            int i21 = parcel.readInt();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet(i21);
            while (iE != i21) {
                iE = com.revolut.data.database.models.openbanking.d.e(BalanceSelector$InputData.class, parcel, linkedHashSet5, iE, 1);
            }
            return new BalanceSelector$InputData(linkedHashSet3, dVarValueOf, lVarValueOf, clause, linkedHashSet, linkedHashSet2, linkedHashSet4, string, linkedHashSet5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalanceSelector$InputData[i];
        }
    }

    public BalanceSelector$InputData(Set allowedGroups, d walletScope, l lVar, Clause clause, Set set, Set set2, Set excludedPockets, String str, Set extraConfigurations) {
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(excludedPockets, "excludedPockets");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        this.f99379a = allowedGroups;
        this.f99380b = walletScope;
        this.f99381c = lVar;
        this.d = clause;
        this.e = set;
        this.f = set2;
        this.f99382g = excludedPockets;
        this.f99383h = str;
        this.i = extraConfigurations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalanceSelector$InputData)) {
            return false;
        }
        BalanceSelector$InputData balanceSelector$InputData = (BalanceSelector$InputData) obj2;
        return Intrinsics.f(this.f99379a, balanceSelector$InputData.f99379a) && this.f99380b == balanceSelector$InputData.f99380b && this.f99381c == balanceSelector$InputData.f99381c && Intrinsics.f(this.d, balanceSelector$InputData.d) && Intrinsics.f(this.e, balanceSelector$InputData.e) && Intrinsics.f(this.f, balanceSelector$InputData.f) && Intrinsics.f(this.f99382g, balanceSelector$InputData.f99382g) && Intrinsics.f(this.f99383h, balanceSelector$InputData.f99383h) && Intrinsics.f(this.i, balanceSelector$InputData.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f99380b.hashCode() + (this.f99379a.hashCode() * 31)) * 31;
        l lVar = this.f99381c;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Clause clause = this.d;
        int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
        Set set = this.e;
        int iHashCode4 = (iHashCode3 + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.f;
        int iF = p.a.f((iHashCode4 + (set2 == null ? 0 : set2.hashCode())) * 31, 31, this.f99382g);
        String str = this.f99383h;
        return this.i.hashCode() + ((iF + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f99379a, dest);
        while (itV.hasNext()) {
            dest.writeString(((k1j.a) itV.next()).name());
        }
        dest.writeString(this.f99380b.name());
        l lVar = this.f99381c;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        dest.writeParcelable(this.d, i);
        Set set = this.e;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString((String) itQ.next());
            }
        }
        Set set2 = this.f;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = e.q(dest, 1, set2);
            while (itQ2.hasNext()) {
                dest.writeString((String) itQ2.next());
            }
        }
        Iterator itV2 = n.v(this.f99382g, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        dest.writeString(this.f99383h);
        Iterator itV3 = n.v(this.i, dest);
        while (itV3.hasNext()) {
            dest.writeParcelable((Parcelable) itV3.next(), i);
        }
    }

    public BalanceSelector$InputData(Set set, d dVar, l lVar, TextLocalisedClause textLocalisedClause, Set set2, Set set3, Set set4, String str, Set set5, int i) {
        this(set, dVar, lVar, (i & 8) != 0 ? null : textLocalisedClause, (i & 16) != 0 ? null : set2, (i & 32) != 0 ? null : set3, (i & 64) != 0 ? h0.f322473a : set4, (i & 128) != 0 ? null : str, (i & 256) != 0 ? h0.f322473a : set5);
    }
}
