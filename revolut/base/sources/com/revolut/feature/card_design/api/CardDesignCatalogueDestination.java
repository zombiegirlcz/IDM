package com.revolut.feature.card_design.api;

import android.os.Parcel;
import android.os.Parcelable;
import c93.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import h30.l;
import h93.j0;
import h93.l0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import xfa.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/api/CardDesignCatalogueDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignCatalogueDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardDesignCatalogueDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f64555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f64556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f64557c;
    public final l0 d;
    public final AccountId e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64558g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e93.l0 f64559h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f64560j;
    public final NaviCommand k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final SkipConfig f64561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsProduct f64562m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f64563n;
    public final j0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f64564p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f64565q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f64566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Set f64567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f64568t;
    public final boolean u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f64569w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f64570x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            LinkedHashSet linkedHashSet;
            j0 j0Var;
            l0 l0Var;
            b bVar;
            boolean z4;
            LinkedHashSet linkedHashSet2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h hVar = (h) parcel.readSerializable();
            e eVarValueOf = e.valueOf(parcel.readString());
            j0 j0VarValueOf = j0.valueOf(parcel.readString());
            l0 l0VarValueOf = l0.valueOf(parcel.readString());
            AccountId accountId = (AccountId) parcel.readParcelable(CardDesignCatalogueDestination.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            e93.l0 l0VarValueOf2 = e93.l0.valueOf(parcel.readString());
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(CardDesignCatalogueDestination.class.getClassLoader());
            SkipConfig skipConfigCreateFromParcel = parcel.readInt() == 0 ? null : SkipConfig.CREATOR.createFromParcel(parcel);
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CardDesignCatalogueDestination.class.getClassLoader());
            String string3 = parcel.readString();
            j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
            l0 l0VarValueOf3 = parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString());
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                linkedHashSet = null;
                j0Var = j0VarValueOf2;
                l0Var = l0VarValueOf3;
                bVar = bVarValueOf;
                z4 = z3;
            } else {
                linkedHashSet = null;
                j0Var = j0VarValueOf2;
                l0Var = l0VarValueOf3;
                bVar = bVarValueOf;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet2 = linkedHashSet;
            } else {
                int i = parcel.readInt();
                linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(e.valueOf(parcel.readString()));
                }
            }
            return new CardDesignCatalogueDestination(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf, accountId, string, string2, l0VarValueOf2, z6, z11, naviCommand, skipConfigCreateFromParcel, analyticsProduct, string3, j0Var, l0Var, bVar, z4, linkedHashSet2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignCatalogueDestination[i];
        }
    }

    public CardDesignCatalogueDestination(h hVar, e cardType, j0 productType, l0 subProductType, AccountId accountId, String str, String str2, e93.l0 virtualCardLabelType, boolean z, boolean z3, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct automaticEventProduct, String str3, j0 j0Var, l0 l0Var, b bVar, boolean z4, Set set, boolean z6, boolean z11, boolean z12, String str4, String str5) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64555a = hVar;
        this.f64556b = cardType;
        this.f64557c = productType;
        this.d = subProductType;
        this.e = accountId;
        this.f = str;
        this.f64558g = str2;
        this.f64559h = virtualCardLabelType;
        this.i = z;
        this.f64560j = z3;
        this.k = naviCommand;
        this.f64561l = skipConfig;
        this.f64562m = automaticEventProduct;
        this.f64563n = str3;
        this.o = j0Var;
        this.f64564p = l0Var;
        this.f64565q = bVar;
        this.f64566r = z4;
        this.f64567s = set;
        this.f64568t = z6;
        this.u = z11;
        this.v = z12;
        this.f64569w = str4;
        this.f64570x = str5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignCatalogueDestination)) {
            return false;
        }
        CardDesignCatalogueDestination cardDesignCatalogueDestination = (CardDesignCatalogueDestination) obj2;
        return Intrinsics.f(this.f64555a, cardDesignCatalogueDestination.f64555a) && this.f64556b == cardDesignCatalogueDestination.f64556b && this.f64557c == cardDesignCatalogueDestination.f64557c && this.d == cardDesignCatalogueDestination.d && Intrinsics.f(this.e, cardDesignCatalogueDestination.e) && Intrinsics.f(this.f, cardDesignCatalogueDestination.f) && Intrinsics.f(this.f64558g, cardDesignCatalogueDestination.f64558g) && this.f64559h == cardDesignCatalogueDestination.f64559h && this.i == cardDesignCatalogueDestination.i && this.f64560j == cardDesignCatalogueDestination.f64560j && Intrinsics.f(this.k, cardDesignCatalogueDestination.k) && Intrinsics.f(this.f64561l, cardDesignCatalogueDestination.f64561l) && Intrinsics.f(this.f64562m, cardDesignCatalogueDestination.f64562m) && Intrinsics.f(this.f64563n, cardDesignCatalogueDestination.f64563n) && this.o == cardDesignCatalogueDestination.o && this.f64564p == cardDesignCatalogueDestination.f64564p && this.f64565q == cardDesignCatalogueDestination.f64565q && this.f64566r == cardDesignCatalogueDestination.f64566r && Intrinsics.f(this.f64567s, cardDesignCatalogueDestination.f64567s) && this.f64568t == cardDesignCatalogueDestination.f64568t && this.u == cardDesignCatalogueDestination.u && this.v == cardDesignCatalogueDestination.v && Intrinsics.f(this.f64569w, cardDesignCatalogueDestination.f64569w) && Intrinsics.f(this.f64570x, cardDesignCatalogueDestination.f64570x);
    }

    public final int hashCode() {
        h hVar = this.f64555a;
        int iB = l.b(this.e, (this.d.hashCode() + ((this.f64557c.hashCode() + ((this.f64556b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31, 31);
        String str = this.f;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f64558g;
        int iC = j6.a.c(j6.a.c((this.f64559h.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.i), 31, this.f64560j);
        NaviCommand naviCommand = this.k;
        int iHashCode2 = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        SkipConfig skipConfig = this.f64561l;
        int iA = l.a((iHashCode2 + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.f64562m);
        String str3 = this.f64563n;
        int iHashCode3 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        j0 j0Var = this.o;
        int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f64564p;
        int iHashCode5 = (iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        b bVar = this.f64565q;
        int iC2 = j6.a.c((iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f64566r);
        Set set = this.f64567s;
        int iC3 = j6.a.c(j6.a.c(j6.a.c((iC2 + (set == null ? 0 : set.hashCode())) * 31, 31, this.f64568t), 31, this.u), 31, this.v);
        String str4 = this.f64569w;
        int iHashCode6 = (iC3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64570x;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64555a);
        dest.writeString(this.f64556b.name());
        dest.writeString(this.f64557c.name());
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f64558g);
        dest.writeString(this.f64559h.name());
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f64560j ? 1 : 0);
        dest.writeParcelable(this.k, i);
        SkipConfig skipConfig = this.f64561l;
        if (skipConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            skipConfig.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f64562m, i);
        dest.writeString(this.f64563n);
        j0 j0Var = this.o;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f64564p;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        b bVar = this.f64565q;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeInt(this.f64566r ? 1 : 0);
        Set set = this.f64567s;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((e) itQ.next()).name());
            }
        }
        dest.writeInt(this.f64568t ? 1 : 0);
        dest.writeInt(this.u ? 1 : 0);
        dest.writeInt(this.v ? 1 : 0);
        dest.writeString(this.f64569w);
        dest.writeString(this.f64570x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardDesignCatalogueDestination(h hVar, e eVar, j0 j0Var, l0 l0Var, AccountId accountId, String str, String str2, e93.l0 l0Var2, boolean z, boolean z3, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct analyticsProduct, String str3, j0 j0Var2, l0 l0Var3, b bVar, Set set, boolean z4, String str4, String str5, int i) {
        AnalyticsProduct analyticsProductH;
        AccountId accountId2 = (i & 16) != 0 ? AccountId.Personal.f51414a : accountId;
        String str6 = (i & 32) != 0 ? null : str;
        String str7 = (i & 64) != 0 ? null : str2;
        e93.l0 l0Var4 = (i & 128) != 0 ? e93.l0.DEFAULT : l0Var2;
        boolean z6 = (i & 256) != 0 ? false : z;
        boolean z11 = (i & 512) != 0 ? true : z3;
        NaviCommand naviCommand2 = (i & 1024) != 0 ? null : naviCommand;
        SkipConfig skipConfig2 = (i & 2048) != 0 ? null : skipConfig;
        if ((i & 4096) != 0) {
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProductH = analyticsProduct;
        }
        this(hVar, eVar, j0Var, l0Var, accountId2, str6, str7, l0Var4, z6, z11, naviCommand2, skipConfig2, analyticsProductH, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : j0Var2, (32768 & i) != 0 ? null : l0Var3, (65536 & i) != 0 ? null : bVar, false, (262144 & i) != 0 ? null : set, (524288 & i) == 0, (1048576 & i) == 0, (2097152 & i) != 0 ? false : z4, (4194304 & i) != 0 ? null : str4, (i & 8388608) != 0 ? null : str5);
    }
}
