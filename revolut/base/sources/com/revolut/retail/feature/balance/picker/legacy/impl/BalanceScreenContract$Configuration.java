package com.revolut.retail.feature.balance.picker.legacy.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.feature.balance.picker.api.models.BalanceRecipientInfo;
import com.revolut.retail.feature.balance.picker.legacy.api.navigation.BalancePickerFeatureConfig;
import io3.l;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/balance/picker/legacy/impl/BalanceScreenContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BalanceScreenContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BalanceScreenContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f99573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99574c;
    public final BalancePickerFeatureConfig.Currencies d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f99575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f99576h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f99577j;
    public final Set k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final BalancePickerFeatureConfig.ShowBalancesSetting f99578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f99579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f99580n;
    public final Integer o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final BalanceRecipientInfo f99581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dfa.a f99582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f99583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AccountId f99584s;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            BalancePickerFeatureConfig.Currencies currencies;
            boolean z;
            Class cls2;
            boolean z3;
            Class cls3;
            boolean z4;
            Class cls4;
            boolean z6;
            Class cls5;
            boolean z11;
            LinkedHashSet linkedHashSet;
            LinkedHashSet linkedHashSet2;
            Class cls6;
            LinkedHashSet linkedHashSet3;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            l lVarValueOf = l.valueOf(parcel.readString());
            boolean z29 = parcel.readInt() != 0;
            BalancePickerFeatureConfig.Currencies currencies2 = (BalancePickerFeatureConfig.Currencies) parcel.readParcelable(BalanceScreenContract$Configuration.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = BalanceScreenContract$Configuration.class;
                currencies = currencies2;
                z = true;
            } else {
                cls = BalanceScreenContract$Configuration.class;
                currencies = currencies2;
                z = false;
            }
            if (parcel.readInt() != 0) {
                cls2 = cls;
                z3 = true;
            } else {
                cls2 = cls;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                cls3 = cls2;
                z4 = true;
            } else {
                cls3 = cls2;
                z4 = false;
            }
            if (parcel.readInt() != 0) {
                cls4 = cls3;
                z6 = true;
            } else {
                cls4 = cls3;
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                cls5 = cls4;
                z11 = true;
            } else {
                cls5 = cls4;
                z11 = false;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                linkedHashSet = new LinkedHashSet(i);
                int iA = 0;
                while (iA != i) {
                    iA = o.a(parcel, linkedHashSet, iA, 1);
                }
            }
            if (parcel.readInt() == 0) {
                linkedHashSet2 = null;
            } else {
                int i2 = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i2);
                int iA2 = 0;
                while (iA2 != i2) {
                    iA2 = o.a(parcel, linkedHashSet2, iA2, 1);
                }
            }
            BalancePickerFeatureConfig.ShowBalancesSetting showBalancesSetting = (BalancePickerFeatureConfig.ShowBalancesSetting) parcel.readParcelable(cls5.getClassLoader());
            if (parcel.readInt() != 0) {
                cls6 = cls5;
                linkedHashSet3 = linkedHashSet;
                z12 = true;
            } else {
                cls6 = cls5;
                linkedHashSet3 = linkedHashSet;
                z12 = false;
            }
            return new BalanceScreenContract$Configuration(string, lVarValueOf, z29, currencies, z, z3, z4, z6, z11, linkedHashSet3, linkedHashSet2, showBalancesSetting, z12, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (BalanceRecipientInfo) parcel.readParcelable(cls6.getClassLoader()), parcel.readInt() == 0 ? null : dfa.a.valueOf(parcel.readString()), parcel.readInt() != 0, (AccountId) parcel.readParcelable(cls6.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalanceScreenContract$Configuration[i];
        }
    }

    public BalanceScreenContract$Configuration(String str, l pocketType, boolean z, BalancePickerFeatureConfig.Currencies currencies, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, Set set, Set set2, BalancePickerFeatureConfig.ShowBalancesSetting showBalances, boolean z29, Integer num, Integer num2, BalanceRecipientInfo balanceRecipientInfo, dfa.a aVar, boolean z31, AccountId accountId) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(showBalances, "showBalances");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f99572a = str;
        this.f99573b = pocketType;
        this.f99574c = z;
        this.d = currencies;
        this.e = z3;
        this.f = z4;
        this.f99575g = z6;
        this.f99576h = z11;
        this.i = z12;
        this.f99577j = set;
        this.k = set2;
        this.f99578l = showBalances;
        this.f99579m = z29;
        this.f99580n = num;
        this.o = num2;
        this.f99581p = balanceRecipientInfo;
        this.f99582q = aVar;
        this.f99583r = z31;
        this.f99584s = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalanceScreenContract$Configuration)) {
            return false;
        }
        BalanceScreenContract$Configuration balanceScreenContract$Configuration = (BalanceScreenContract$Configuration) obj2;
        return Intrinsics.f(this.f99572a, balanceScreenContract$Configuration.f99572a) && this.f99573b == balanceScreenContract$Configuration.f99573b && this.f99574c == balanceScreenContract$Configuration.f99574c && Intrinsics.f(this.d, balanceScreenContract$Configuration.d) && this.e == balanceScreenContract$Configuration.e && this.f == balanceScreenContract$Configuration.f && this.f99575g == balanceScreenContract$Configuration.f99575g && this.f99576h == balanceScreenContract$Configuration.f99576h && this.i == balanceScreenContract$Configuration.i && Intrinsics.f(this.f99577j, balanceScreenContract$Configuration.f99577j) && Intrinsics.f(this.k, balanceScreenContract$Configuration.k) && Intrinsics.f(this.f99578l, balanceScreenContract$Configuration.f99578l) && this.f99579m == balanceScreenContract$Configuration.f99579m && Intrinsics.f(this.f99580n, balanceScreenContract$Configuration.f99580n) && Intrinsics.f(this.o, balanceScreenContract$Configuration.o) && Intrinsics.f(this.f99581p, balanceScreenContract$Configuration.f99581p) && this.f99582q == balanceScreenContract$Configuration.f99582q && this.f99583r == balanceScreenContract$Configuration.f99583r && Intrinsics.f(this.f99584s, balanceScreenContract$Configuration.f99584s);
    }

    public final int hashCode() {
        String str = this.f99572a;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((this.d.hashCode() + j6.a.c(t61.a.c(this.f99573b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.f99574c)) * 31, 31, this.e), 31, this.f), 31, this.f99575g), 31, this.f99576h), 31, this.i);
        Set set = this.f99577j;
        int iHashCode = (iC + (set == null ? 0 : set.hashCode())) * 31;
        Set set2 = this.k;
        int iC2 = j6.a.c((this.f99578l.hashCode() + ((iHashCode + (set2 == null ? 0 : set2.hashCode())) * 31)) * 31, 31, this.f99579m);
        Integer num = this.f99580n;
        int iHashCode2 = (iC2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.o;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BalanceRecipientInfo balanceRecipientInfo = this.f99581p;
        int iHashCode4 = (iHashCode3 + (balanceRecipientInfo == null ? 0 : balanceRecipientInfo.hashCode())) * 31;
        dfa.a aVar = this.f99582q;
        return this.f99584s.hashCode() + j6.a.c((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.f99583r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99572a);
        dest.writeString(this.f99573b.name());
        dest.writeInt(this.f99574c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f99575g ? 1 : 0);
        dest.writeInt(this.f99576h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
        Set set = this.f99577j;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString((String) itQ.next());
            }
        }
        Set set2 = this.k;
        if (set2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = e.q(dest, 1, set2);
            while (itQ2.hasNext()) {
                dest.writeString((String) itQ2.next());
            }
        }
        dest.writeParcelable(this.f99578l, i);
        dest.writeInt(this.f99579m ? 1 : 0);
        Integer num = this.f99580n;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Integer num2 = this.o;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num2);
        }
        dest.writeParcelable(this.f99581p, i);
        dfa.a aVar = this.f99582q;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.f99583r ? 1 : 0);
        dest.writeParcelable(this.f99584s, i);
    }

    public BalanceScreenContract$Configuration() {
        this(null, l.CURRENT, false, BalancePickerFeatureConfig.Currencies.Holding.f99557a, true, true, true, true, true, null, null, BalancePickerFeatureConfig.ShowBalancesSetting.InItemCurrency.f99564a, false, null, null, null, null, false, AccountId.Personal.f51414a);
    }
}
