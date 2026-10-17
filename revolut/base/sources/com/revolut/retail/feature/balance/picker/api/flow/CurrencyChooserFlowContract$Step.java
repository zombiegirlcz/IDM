package com.revolut.retail.feature.balance.picker.api.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import io3.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k1j.d;
import kii.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BalanceChooser", "CurrencyChooser", "Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step$BalanceChooser;", "Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step$CurrencyChooser;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CurrencyChooserFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step$BalanceChooser;", "Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceChooser extends CurrencyChooserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BalanceChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99384a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f99385b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f99386c;
        public final l d;
        public final Set e;
        public final Set f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f99387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Clause f99388h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f99389j;
        public final Set k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                LinkedHashSet linkedHashSet2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                b bVar = (b) parcel.readSerializable();
                d dVarValueOf = d.valueOf(parcel.readString());
                l lVarValueOf = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
                int iE = 0;
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
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i3);
                for (int i5 = 0; i5 != i3; i5++) {
                    linkedHashSet3.add(k1j.a.valueOf(parcel.readString()));
                }
                Clause clause = (Clause) parcel.readParcelable(BalanceChooser.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                int i6 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i6);
                while (iE != i6) {
                    iE = com.revolut.data.database.models.openbanking.d.e(BalanceChooser.class, parcel, linkedHashSet4, iE, 1);
                }
                return new BalanceChooser(clause, lVarValueOf, numValueOf, string, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, dVarValueOf, bVar, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalanceChooser[i];
            }
        }

        public BalanceChooser(Clause clause, l lVar, Integer num, String str, Set set, Set set2, Set allowedGroups, Set extraConfigurations, d walletScope, b selectedCurrency, boolean z) {
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            Intrinsics.checkNotNullParameter(walletScope, "walletScope");
            Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
            Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
            this.f99384a = str;
            this.f99385b = selectedCurrency;
            this.f99386c = walletScope;
            this.d = lVar;
            this.e = set;
            this.f = set2;
            this.f99387g = allowedGroups;
            this.f99388h = clause;
            this.i = z;
            this.f99389j = num;
            this.k = extraConfigurations;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceChooser)) {
                return false;
            }
            BalanceChooser balanceChooser = (BalanceChooser) obj2;
            return Intrinsics.f(this.f99384a, balanceChooser.f99384a) && Intrinsics.f(this.f99385b, balanceChooser.f99385b) && this.f99386c == balanceChooser.f99386c && this.d == balanceChooser.d && Intrinsics.f(this.e, balanceChooser.e) && Intrinsics.f(this.f, balanceChooser.f) && Intrinsics.f(this.f99387g, balanceChooser.f99387g) && Intrinsics.f(this.f99388h, balanceChooser.f99388h) && this.i == balanceChooser.i && Intrinsics.f(this.f99389j, balanceChooser.f99389j) && Intrinsics.f(this.k, balanceChooser.k);
        }

        public final int hashCode() {
            String str = this.f99384a;
            int iHashCode = (this.f99386c.hashCode() + h30.l.j(this.f99385b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
            l lVar = this.d;
            int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
            Set set = this.e;
            int iHashCode3 = (iHashCode2 + (set == null ? 0 : set.hashCode())) * 31;
            Set set2 = this.f;
            int iF = p.a.f((iHashCode3 + (set2 == null ? 0 : set2.hashCode())) * 31, 31, this.f99387g);
            Clause clause = this.f99388h;
            int iC = j6.a.c((iF + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.i);
            Integer num = this.f99389j;
            return this.k.hashCode() + ((iC + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99384a);
            dest.writeSerializable(this.f99385b);
            dest.writeString(this.f99386c.name());
            l lVar = this.d;
            if (lVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(lVar.name());
            }
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
            Iterator itV = n.v(this.f99387g, dest);
            while (itV.hasNext()) {
                dest.writeString(((k1j.a) itV.next()).name());
            }
            dest.writeParcelable(this.f99388h, i);
            dest.writeInt(this.i ? 1 : 0);
            Integer num = this.f99389j;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Iterator itV2 = n.v(this.k, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step$CurrencyChooser;", "Lcom/revolut/retail/feature/balance/picker/api/flow/CurrencyChooserFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyChooser extends CurrencyChooserFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CurrencyChooser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f99390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountId f99391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f99392c;
        public final List d;
        public final Clause e;
        public final Integer f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                d dVarValueOf = d.valueOf(parcel.readString());
                AccountId accountId = (AccountId) parcel.readParcelable(CurrencyChooser.class.getClassLoader());
                b bVar = (b) parcel.readSerializable();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    int iC = 0;
                    while (iC != i) {
                        iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                    }
                }
                return new CurrencyChooser(dVarValueOf, accountId, bVar, arrayList, (Clause) parcel.readParcelable(CurrencyChooser.class.getClassLoader()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyChooser[i];
            }
        }

        public CurrencyChooser(d walletScope, AccountId accountId, b bVar, List list, Clause clause, Integer num) {
            Intrinsics.checkNotNullParameter(walletScope, "walletScope");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f99390a = walletScope;
            this.f99391b = accountId;
            this.f99392c = bVar;
            this.d = list;
            this.e = clause;
            this.f = num;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyChooser)) {
                return false;
            }
            CurrencyChooser currencyChooser = (CurrencyChooser) obj2;
            return this.f99390a == currencyChooser.f99390a && Intrinsics.f(this.f99391b, currencyChooser.f99391b) && Intrinsics.f(this.f99392c, currencyChooser.f99392c) && Intrinsics.f(this.d, currencyChooser.d) && Intrinsics.f(this.e, currencyChooser.e) && Intrinsics.f(this.f, currencyChooser.f);
        }

        public final int hashCode() {
            int iB = h30.l.b(this.f99391b, this.f99390a.hashCode() * 31, 31);
            b bVar = this.f99392c;
            int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
            List list = this.d;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Clause clause = this.e;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Integer num = this.f;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99390a.name());
            dest.writeParcelable(this.f99391b, i);
            dest.writeSerializable(this.f99392c);
            List list = this.d;
            if (list == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = v0.a.q(dest, 1, list);
                while (itQ.hasNext()) {
                    dest.writeSerializable((Serializable) itQ.next());
                }
            }
            dest.writeParcelable(this.e, i);
            Integer num = this.f;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
        }
    }
}
