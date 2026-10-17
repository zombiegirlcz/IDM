package com.revolut.retail.feature.balance.picker.api.interactor;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import io3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k1j.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "RegisteredIdentity", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BalancesInteractor$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BalancesInteractor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f99393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f99394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f99395c;
    public final Set d;
    public final Set e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RegisteredIdentity f99396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f99397h;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity;", "Landroid/os/Parcelable;", "Selected", "Custom", "Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity$Custom;", "Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity$Selected;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface RegisteredIdentity extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity$Custom;", "Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements RegisteredIdentity {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f99400a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(String id10) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f99400a = id10;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Custom) && Intrinsics.f(this.f99400a, ((Custom) obj2).f99400a);
            }

            public final int hashCode() {
                return this.f99400a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f99400a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity$Selected;", "Lcom/revolut/retail/feature/balance/picker/api/interactor/BalancesInteractor$InputData$RegisteredIdentity;", "<init>", "()V", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Selected implements RegisteredIdentity {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Selected f99401a = new Selected();

            @NotNull
            public static final Parcelable.Creator<Selected> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Selected.f99401a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Selected[i];
                }
            }

            private Selected() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVarValueOf = d.valueOf(parcel.readString());
            l lVarValueOf = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(k1j.a.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            int iA = 0;
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            int i5 = parcel.readInt();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet(i5);
            int iA2 = 0;
            while (iA2 != i5) {
                iA2 = o.a(parcel, linkedHashSet3, iA2, 1);
            }
            int i6 = parcel.readInt();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet(i6);
            int iA3 = 0;
            while (iA3 != i6) {
                iA3 = o.a(parcel, linkedHashSet4, iA3, 1);
            }
            RegisteredIdentity registeredIdentity = (RegisteredIdentity) parcel.readParcelable(BalancesInteractor$InputData.class.getClassLoader());
            int i21 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i21);
            while (iE != i21) {
                iE = j6.a.e(BalancesInteractor$InputData.class, parcel, arrayList, iE, 1);
            }
            return new BalancesInteractor$InputData(dVarValueOf, lVarValueOf, linkedHashSet, linkedHashSet2, linkedHashSet3, linkedHashSet4, registeredIdentity, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BalancesInteractor$InputData[i];
        }
    }

    public BalancesInteractor$InputData(d walletScope, l lVar, Set allowedGroups, Set supportedCurrencies, Set excludedCurrencies, Set excludedPockets, RegisteredIdentity registeredIdentity, List additionalConfigs) {
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        Intrinsics.checkNotNullParameter(excludedCurrencies, "excludedCurrencies");
        Intrinsics.checkNotNullParameter(excludedPockets, "excludedPockets");
        Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
        Intrinsics.checkNotNullParameter(additionalConfigs, "additionalConfigs");
        this.f99393a = walletScope;
        this.f99394b = lVar;
        this.f99395c = allowedGroups;
        this.d = supportedCurrencies;
        this.e = excludedCurrencies;
        this.f = excludedPockets;
        this.f99396g = registeredIdentity;
        this.f99397h = additionalConfigs;
    }

    public static BalancesInteractor$InputData a(BalancesInteractor$InputData balancesInteractor$InputData, Set allowedGroups) {
        d walletScope = balancesInteractor$InputData.f99393a;
        l lVar = balancesInteractor$InputData.f99394b;
        Set supportedCurrencies = balancesInteractor$InputData.d;
        Set excludedCurrencies = balancesInteractor$InputData.e;
        Set excludedPockets = balancesInteractor$InputData.f;
        RegisteredIdentity registeredIdentity = balancesInteractor$InputData.f99396g;
        List additionalConfigs = balancesInteractor$InputData.f99397h;
        Intrinsics.checkNotNullParameter(walletScope, "walletScope");
        Intrinsics.checkNotNullParameter(allowedGroups, "allowedGroups");
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        Intrinsics.checkNotNullParameter(excludedCurrencies, "excludedCurrencies");
        Intrinsics.checkNotNullParameter(excludedPockets, "excludedPockets");
        Intrinsics.checkNotNullParameter(registeredIdentity, "registeredIdentity");
        Intrinsics.checkNotNullParameter(additionalConfigs, "additionalConfigs");
        return new BalancesInteractor$InputData(walletScope, lVar, allowedGroups, supportedCurrencies, excludedCurrencies, excludedPockets, registeredIdentity, additionalConfigs);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BalancesInteractor$InputData)) {
            return false;
        }
        BalancesInteractor$InputData balancesInteractor$InputData = (BalancesInteractor$InputData) obj2;
        return this.f99393a == balancesInteractor$InputData.f99393a && this.f99394b == balancesInteractor$InputData.f99394b && Intrinsics.f(this.f99395c, balancesInteractor$InputData.f99395c) && Intrinsics.f(this.d, balancesInteractor$InputData.d) && Intrinsics.f(this.e, balancesInteractor$InputData.e) && Intrinsics.f(this.f, balancesInteractor$InputData.f) && Intrinsics.f(this.f99396g, balancesInteractor$InputData.f99396g) && Intrinsics.f(this.f99397h, balancesInteractor$InputData.f99397h);
    }

    public final int hashCode() {
        int iHashCode = this.f99393a.hashCode() * 31;
        l lVar = this.f99394b;
        return this.f99397h.hashCode() + ((this.f99396g.hashCode() + p.a.f(p.a.f(p.a.f(p.a.f((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31, this.f99395c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99393a.name());
        l lVar = this.f99394b;
        if (lVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(lVar.name());
        }
        Iterator itV = n.v(this.f99395c, dest);
        while (itV.hasNext()) {
            dest.writeString(((k1j.a) itV.next()).name());
        }
        Iterator itV2 = n.v(this.d, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
        Iterator itV3 = n.v(this.e, dest);
        while (itV3.hasNext()) {
            dest.writeString((String) itV3.next());
        }
        Iterator itV4 = n.v(this.f, dest);
        while (itV4.hasNext()) {
            dest.writeString((String) itV4.next());
        }
        dest.writeParcelable(this.f99396g, i);
        Iterator itV5 = p.a.v(this.f99397h, dest);
        while (itV5.hasNext()) {
            dest.writeParcelable((Parcelable) itV5.next(), i);
        }
    }

    public BalancesInteractor$InputData(d dVar, l lVar, Set set, Set set2, Set set3, Set set4, RegisteredIdentity registeredIdentity, List list, int i) {
        this(dVar, lVar, set, set2, (i & 16) != 0 ? h0.f322473a : set3, (i & 32) != 0 ? h0.f322473a : set4, (i & 64) != 0 ? RegisteredIdentity.Selected.f99401a : registeredIdentity, (i & 128) != 0 ? f0.f322471a : list);
    }
}
