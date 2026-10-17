package com.revolut.retail.feature.balance.picker.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import ehe.n;
import h30.l;
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
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyChooserFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CurrencyChooserFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f99472b;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f99473a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f99473a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f99473a, ((InputData) obj2).f99473a);
        }

        public final int hashCode() {
            return this.f99473a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f99473a, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyChooserFlowDestination((StartType) parcel.readParcelable(CurrencyChooserFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyChooserFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyChooserFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f99472b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CurrencyChooserFlowDestination) && Intrinsics.f(this.f99472b, ((CurrencyChooserFlowDestination) obj2).f99472b);
    }

    public final int hashCode() {
        return this.f99472b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99472b, i);
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType;", "Landroid/os/Parcelable;", "BalancePicker", "CurrencyChooser", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType$BalancePicker;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType$CurrencyChooser;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType$CurrencyChooser;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CurrencyChooser extends StartType {

            @NotNull
            public static final Parcelable.Creator<CurrencyChooser> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f99480a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AccountId f99481b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final b f99482c;
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

            public CurrencyChooser() {
                this(null, null, null, null, null, null, 63);
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
                return this.f99480a == currencyChooser.f99480a && Intrinsics.f(this.f99481b, currencyChooser.f99481b) && Intrinsics.f(this.f99482c, currencyChooser.f99482c) && Intrinsics.f(this.d, currencyChooser.d) && Intrinsics.f(this.e, currencyChooser.e) && Intrinsics.f(this.f, currencyChooser.f);
            }

            public final int hashCode() {
                int iB = l.b(this.f99481b, this.f99480a.hashCode() * 31, 31);
                b bVar = this.f99482c;
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
                dest.writeString(this.f99480a.name());
                dest.writeParcelable(this.f99481b, i);
                dest.writeSerializable(this.f99482c);
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

            public CurrencyChooser(d walletScope, AccountId accountId, b bVar, List list, Clause clause, Integer num) {
                Intrinsics.checkNotNullParameter(walletScope, "walletScope");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f99480a = walletScope;
                this.f99481b = accountId;
                this.f99482c = bVar;
                this.d = list;
                this.e = clause;
                this.f = num;
            }

            public /* synthetic */ CurrencyChooser(d dVar, AccountId accountId, b bVar, List list, Clause clause, Integer num, int i) {
                this((i & 1) != 0 ? d.RETAIL : dVar, (i & 2) != 0 ? AccountId.Personal.f51414a : accountId, (i & 4) != 0 ? null : bVar, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : clause, (i & 32) != 0 ? null : num);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType$BalancePicker;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class BalancePicker extends StartType {

            @NotNull
            public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99474a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final b f99475b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final io3.l f99476c;
            public final d d;
            public final Set e;
            public final Set f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final Set f99477g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final Clause f99478h;
            public final boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final Integer f99479j;
            public final Set k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    LinkedHashSet linkedHashSet;
                    LinkedHashSet linkedHashSet2;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string = parcel.readString();
                    b bVar = (b) parcel.readSerializable();
                    io3.l lVarValueOf = parcel.readInt() == 0 ? null : io3.l.valueOf(parcel.readString());
                    d dVarValueOf = d.valueOf(parcel.readString());
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
                    Clause clause = (Clause) parcel.readParcelable(BalancePicker.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                    int i6 = parcel.readInt();
                    LinkedHashSet linkedHashSet4 = new LinkedHashSet(i6);
                    while (iE != i6) {
                        iE = com.revolut.data.database.models.openbanking.d.e(BalancePicker.class, parcel, linkedHashSet4, iE, 1);
                    }
                    return new BalancePicker(clause, lVarValueOf, numValueOf, string, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, dVarValueOf, bVar, z);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new BalancePicker[i];
                }
            }

            public BalancePicker(Clause clause, io3.l lVar, Integer num, String str, Set set, Set set2, Set allowedGroups, Set extraConfigurations, d walletScope, b selectedCurrency, boolean z) {
                Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
                Intrinsics.checkNotNullParameter(walletScope, "walletScope");
                Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
                Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
                this.f99474a = str;
                this.f99475b = selectedCurrency;
                this.f99476c = lVar;
                this.d = walletScope;
                this.e = set;
                this.f = set2;
                this.f99477g = allowedGroups;
                this.f99478h = clause;
                this.i = z;
                this.f99479j = num;
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
                if (!(obj2 instanceof BalancePicker)) {
                    return false;
                }
                BalancePicker balancePicker = (BalancePicker) obj2;
                return Intrinsics.f(this.f99474a, balancePicker.f99474a) && Intrinsics.f(this.f99475b, balancePicker.f99475b) && this.f99476c == balancePicker.f99476c && this.d == balancePicker.d && Intrinsics.f(this.e, balancePicker.e) && Intrinsics.f(this.f, balancePicker.f) && Intrinsics.f(this.f99477g, balancePicker.f99477g) && Intrinsics.f(this.f99478h, balancePicker.f99478h) && this.i == balancePicker.i && Intrinsics.f(this.f99479j, balancePicker.f99479j) && Intrinsics.f(this.k, balancePicker.k);
            }

            public final int hashCode() {
                String str = this.f99474a;
                int iJ = l.j(this.f99475b, (str == null ? 0 : str.hashCode()) * 31, 31);
                io3.l lVar = this.f99476c;
                int iHashCode = (this.d.hashCode() + ((iJ + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
                Set set = this.e;
                int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
                Set set2 = this.f;
                int iF = p.a.f((iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31, 31, this.f99477g);
                Clause clause = this.f99478h;
                int iC = j6.a.c((iF + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.i);
                Integer num = this.f99479j;
                return this.k.hashCode() + ((iC + (num != null ? num.hashCode() : 0)) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99474a);
                dest.writeSerializable(this.f99475b);
                io3.l lVar = this.f99476c;
                if (lVar == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(lVar.name());
                }
                dest.writeString(this.d.name());
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
                Iterator itV = n.v(this.f99477g, dest);
                while (itV.hasNext()) {
                    dest.writeString(((k1j.a) itV.next()).name());
                }
                dest.writeParcelable(this.f99478h, i);
                dest.writeInt(this.i ? 1 : 0);
                Integer num = this.f99479j;
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

            /* JADX WARN: Illegal instructions before constructor call */
            public BalancePicker(String str, b bVar, io3.l lVar, Set set, Set set2, Set set3, TextLocalisedClause textLocalisedClause, boolean z, Integer num, Set set4, int i) {
                String str2 = (i & 1) != 0 ? null : str;
                d dVar = d.RETAIL;
                Set set5 = (i & 16) != 0 ? null : set;
                Set set6 = (i & 32) != 0 ? null : set2;
                this((i & 128) != 0 ? null : textLocalisedClause, lVar, (i & 512) != 0 ? null : num, str2, set5, set6, set3, (i & 1024) != 0 ? h0.f322473a : set4, dVar, bVar, (i & 256) != 0 ? false : z);
            }
        }
    }
}
