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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import xfa.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/api/CardDesignCarouselDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignCarouselDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardDesignCarouselDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f64539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f64540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f64541c;
    public final l0 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountId f64543h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f64544j;
    public final e93.l0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f64545l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NaviCommand f64546m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SkipConfig f64547n;
    public final AnalyticsProduct o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f64548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j0 f64549q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l0 f64550r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f64551s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b f64552t;
    public final boolean u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f64553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f64554x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Class cls;
            SkipConfig skipConfigCreateFromParcel;
            l0 l0VarValueOf;
            b bVarValueOf;
            boolean z;
            SkipConfig skipConfig;
            l0 l0Var;
            b bVar;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h hVar = (h) parcel.readSerializable();
            e eVarValueOf = e.valueOf(parcel.readString());
            j0 j0VarValueOf = j0.valueOf(parcel.readString());
            l0 l0VarValueOf2 = l0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AccountId accountId = (AccountId) parcel.readParcelable(CardDesignCarouselDestination.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            e93.l0 l0VarValueOf3 = e93.l0.valueOf(parcel.readString());
            boolean z4 = parcel.readInt() != 0;
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(CardDesignCarouselDestination.class.getClassLoader());
            if (parcel.readInt() == 0) {
                cls = CardDesignCarouselDestination.class;
                skipConfigCreateFromParcel = null;
            } else {
                cls = CardDesignCarouselDestination.class;
                skipConfigCreateFromParcel = SkipConfig.CREATOR.createFromParcel(parcel);
            }
            SkipConfig skipConfig2 = skipConfigCreateFromParcel;
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(cls.getClassLoader());
            String string6 = parcel.readString();
            j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                l0VarValueOf = null;
                bVarValueOf = null;
            } else {
                l0VarValueOf = l0.valueOf(parcel.readString());
                bVarValueOf = null;
            }
            j0 j0Var = j0VarValueOf2;
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                bVarValueOf = b.valueOf(parcel.readString());
            }
            if (parcel.readInt() != 0) {
                z = true;
                skipConfig = skipConfig2;
                l0Var = l0VarValueOf;
                bVar = bVarValueOf;
                z3 = true;
            } else {
                z = true;
                skipConfig = skipConfig2;
                l0Var = l0VarValueOf;
                bVar = bVarValueOf;
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new CardDesignCarouselDestination(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf2, string, string2, string3, accountId, string4, string5, l0VarValueOf3, z4, naviCommand, skipConfig, analyticsProduct, string6, j0Var, l0Var, string7, bVar, z3, z, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignCarouselDestination[i];
        }
    }

    public CardDesignCarouselDestination(h hVar, e cardType, j0 productType, l0 subProductType, String str, String str2, String str3, AccountId accountId, String str4, String str5, e93.l0 virtualCardLabelType, boolean z, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct automaticEventProduct, String str6, j0 j0Var, l0 l0Var, String str7, b bVar, boolean z3, boolean z4, String str8, String str9) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64539a = hVar;
        this.f64540b = cardType;
        this.f64541c = productType;
        this.d = subProductType;
        this.e = str;
        this.f = str2;
        this.f64542g = str3;
        this.f64543h = accountId;
        this.i = str4;
        this.f64544j = str5;
        this.k = virtualCardLabelType;
        this.f64545l = z;
        this.f64546m = naviCommand;
        this.f64547n = skipConfig;
        this.o = automaticEventProduct;
        this.f64548p = str6;
        this.f64549q = j0Var;
        this.f64550r = l0Var;
        this.f64551s = str7;
        this.f64552t = bVar;
        this.u = z3;
        this.v = z4;
        this.f64553w = str8;
        this.f64554x = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignCarouselDestination)) {
            return false;
        }
        CardDesignCarouselDestination cardDesignCarouselDestination = (CardDesignCarouselDestination) obj2;
        return Intrinsics.f(this.f64539a, cardDesignCarouselDestination.f64539a) && this.f64540b == cardDesignCarouselDestination.f64540b && this.f64541c == cardDesignCarouselDestination.f64541c && this.d == cardDesignCarouselDestination.d && Intrinsics.f(this.e, cardDesignCarouselDestination.e) && Intrinsics.f(this.f, cardDesignCarouselDestination.f) && Intrinsics.f(this.f64542g, cardDesignCarouselDestination.f64542g) && Intrinsics.f(this.f64543h, cardDesignCarouselDestination.f64543h) && Intrinsics.f(this.i, cardDesignCarouselDestination.i) && Intrinsics.f(this.f64544j, cardDesignCarouselDestination.f64544j) && this.k == cardDesignCarouselDestination.k && this.f64545l == cardDesignCarouselDestination.f64545l && Intrinsics.f(this.f64546m, cardDesignCarouselDestination.f64546m) && Intrinsics.f(this.f64547n, cardDesignCarouselDestination.f64547n) && Intrinsics.f(this.o, cardDesignCarouselDestination.o) && Intrinsics.f(this.f64548p, cardDesignCarouselDestination.f64548p) && this.f64549q == cardDesignCarouselDestination.f64549q && this.f64550r == cardDesignCarouselDestination.f64550r && Intrinsics.f(this.f64551s, cardDesignCarouselDestination.f64551s) && this.f64552t == cardDesignCarouselDestination.f64552t && this.u == cardDesignCarouselDestination.u && this.v == cardDesignCarouselDestination.v && Intrinsics.f(this.f64553w, cardDesignCarouselDestination.f64553w) && Intrinsics.f(this.f64554x, cardDesignCarouselDestination.f64554x);
    }

    public final int hashCode() {
        h hVar = this.f64539a;
        int iHashCode = (this.d.hashCode() + ((this.f64541c.hashCode() + ((this.f64540b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64542g;
        int iB = l.b(this.f64543h, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.i;
        int iHashCode4 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64544j;
        int iC = j6.a.c((this.k.hashCode() + ((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31, 31, this.f64545l);
        NaviCommand naviCommand = this.f64546m;
        int iHashCode5 = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
        SkipConfig skipConfig = this.f64547n;
        int iA = l.a((iHashCode5 + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.o);
        String str6 = this.f64548p;
        int iHashCode6 = (iA + (str6 == null ? 0 : str6.hashCode())) * 31;
        j0 j0Var = this.f64549q;
        int iHashCode7 = (iHashCode6 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f64550r;
        int iHashCode8 = (iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str7 = this.f64551s;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        b bVar = this.f64552t;
        int iC2 = j6.a.c(j6.a.c((iHashCode9 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.u), 31, this.v);
        String str8 = this.f64553w;
        int iHashCode10 = (iC2 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f64554x;
        return iHashCode10 + (str9 != null ? str9.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64539a);
        dest.writeString(this.f64540b.name());
        dest.writeString(this.f64541c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f64542g);
        dest.writeParcelable(this.f64543h, i);
        dest.writeString(this.i);
        dest.writeString(this.f64544j);
        dest.writeString(this.k.name());
        dest.writeInt(this.f64545l ? 1 : 0);
        dest.writeParcelable(this.f64546m, i);
        SkipConfig skipConfig = this.f64547n;
        if (skipConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            skipConfig.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.o, i);
        dest.writeString(this.f64548p);
        j0 j0Var = this.f64549q;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f64550r;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeString(this.f64551s);
        b bVar = this.f64552t;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeInt(this.u ? 1 : 0);
        dest.writeInt(this.v ? 1 : 0);
        dest.writeString(this.f64553w);
        dest.writeString(this.f64554x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardDesignCarouselDestination(h hVar, e eVar, j0 j0Var, l0 l0Var, String str, String str2, String str3, AccountId accountId, String str4, String str5, e93.l0 l0Var2, boolean z, NaviCommand naviCommand, AnalyticsProduct analyticsProduct, String str6, j0 j0Var2, l0 l0Var3, String str7, b bVar, boolean z3, boolean z4, String str8, int i) {
        AnalyticsProduct analyticsProductH;
        AccountId accountId2 = (i & 128) != 0 ? AccountId.Personal.f51414a : accountId;
        String str9 = (i & 256) != 0 ? null : str4;
        String str10 = (i & 512) != 0 ? null : str5;
        e93.l0 l0Var4 = (i & 1024) != 0 ? e93.l0.DEFAULT : l0Var2;
        boolean z6 = (i & 2048) != 0 ? false : z;
        NaviCommand naviCommand2 = (i & 4096) != 0 ? null : naviCommand;
        if ((i & 16384) != 0) {
            k9 k9Var = k9.Cards;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            analyticsProductH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        } else {
            analyticsProductH = analyticsProduct;
        }
        this(hVar, eVar, j0Var, l0Var, str, str2, str3, accountId2, str9, str10, l0Var4, z6, naviCommand2, null, analyticsProductH, (32768 & i) != 0 ? null : str6, (65536 & i) != 0 ? null : j0Var2, (131072 & i) != 0 ? null : l0Var3, (262144 & i) != 0 ? null : str7, (524288 & i) != 0 ? null : bVar, (1048576 & i) != 0 ? false : z3, (2097152 & i) != 0 ? false : z4, (i & 4194304) != 0 ? null : str8, null);
    }
}
