package com.revolut.feature.card_design.api;

import android.os.Parcel;
import android.os.Parcelable;
import b93.b;
import b93.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import e93.l0;
import e93.v;
import grl.k9;
import h30.l;
import h93.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;
import yhm.d;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/api/CardDesignFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class CardDesignFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<CardDesignFeatureConfig> CREATOR = new a();
    public final boolean A;
    public final boolean B;
    public final String C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f64573c;
    public final String d;
    public final b e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f64574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f64575h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f64576j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f64577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final xfa.b f64578m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f64579n;
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NaviCommand f64580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f64581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v f64582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f64583s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AnalyticsProduct f64584t;
    public final l0 u;
    public final boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j0 f64585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h93.l0 f64586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f64587y;
    public final String z;

    /* JADX INFO: loaded from: classes21.dex */
    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            LinkedHashSet linkedHashSet;
            v vVarValueOf;
            h93.l0 l0VarValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            String string = parcel.readString();
            Class<CardDesignFeatureConfig> cls = CardDesignFeatureConfig.class;
            AccountId accountId = (AccountId) parcel.readParcelable(cls.getClassLoader());
            String string2 = parcel.readString();
            b bVar = (b) parcel.readSerializable();
            String string3 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z11 = true;
                z3 = true;
            } else {
                z = false;
                z3 = true;
            }
            String string4 = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z4;
            } else {
                z6 = z4;
                z4 = z;
            }
            if (parcel.readInt() == 0) {
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = null;
            } else {
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                int i2 = 0;
                while (i2 != i) {
                    linkedHashSet2.add(c93.e.valueOf(parcel.readString()));
                    i2++;
                    cls = cls;
                }
                linkedHashSet = linkedHashSet2;
            }
            Class<CardDesignFeatureConfig> cls2 = cls;
            xfa.b bVarValueOf = parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            h hVar = (h) parcel.readSerializable();
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(cls2.getClassLoader());
            boolean z29 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                vVarValueOf = null;
                l0VarValueOf = null;
            } else {
                vVarValueOf = v.valueOf(parcel.readString());
                l0VarValueOf = null;
            }
            String string5 = parcel.readString();
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(cls2.getClassLoader());
            l0 l0VarValueOf2 = l0.valueOf(parcel.readString());
            boolean z31 = parcel.readInt() != 0;
            Enum enumValueOf = parcel.readInt() == 0 ? l0VarValueOf : j0.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                l0VarValueOf = h93.l0.valueOf(parcel.readString());
            }
            return new CardDesignFeatureConfig(eVarValueOf, string, accountId, string2, bVar, string3, z11, string4, z3, z4, z6, linkedHashSet, bVarValueOf, z12, hVar, naviCommand, z29, vVarValueOf, string5, analyticsProduct, l0VarValueOf2, z31, enumValueOf, l0VarValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignFeatureConfig[i];
        }
    }

    public CardDesignFeatureConfig(e cardType, String str, AccountId accountId, String str2, b bVar, String str3, boolean z, String str4, boolean z3, boolean z4, boolean z6, Set set, xfa.b bVar2, boolean z11, h hVar, NaviCommand naviCommand, boolean z12, v vVar, String str5, AnalyticsProduct automaticEventProduct, l0 virtualCardLabelType, boolean z29, j0 j0Var, h93.l0 l0Var, String str6, String str7, boolean z31, boolean z41, String str8) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
        this.f64571a = cardType;
        this.f64572b = str;
        this.f64573c = accountId;
        this.d = str2;
        this.e = bVar;
        this.f = str3;
        this.f64574g = z;
        this.f64575h = str4;
        this.i = z3;
        this.f64576j = z4;
        this.k = z6;
        this.f64577l = set;
        this.f64578m = bVar2;
        this.f64579n = z11;
        this.o = hVar;
        this.f64580p = naviCommand;
        this.f64581q = z12;
        this.f64582r = vVar;
        this.f64583s = str5;
        this.f64584t = automaticEventProduct;
        this.u = virtualCardLabelType;
        this.v = z29;
        this.f64585w = j0Var;
        this.f64586x = l0Var;
        this.f64587y = str6;
        this.z = str7;
        this.A = z31;
        this.B = z41;
        this.C = str8;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignFeatureConfig)) {
            return false;
        }
        CardDesignFeatureConfig cardDesignFeatureConfig = (CardDesignFeatureConfig) obj2;
        return this.f64571a == cardDesignFeatureConfig.f64571a && Intrinsics.f(this.f64572b, cardDesignFeatureConfig.f64572b) && Intrinsics.f(this.f64573c, cardDesignFeatureConfig.f64573c) && Intrinsics.f(this.d, cardDesignFeatureConfig.d) && Intrinsics.f(this.e, cardDesignFeatureConfig.e) && Intrinsics.f(this.f, cardDesignFeatureConfig.f) && this.f64574g == cardDesignFeatureConfig.f64574g && Intrinsics.f(this.f64575h, cardDesignFeatureConfig.f64575h) && this.i == cardDesignFeatureConfig.i && this.f64576j == cardDesignFeatureConfig.f64576j && this.k == cardDesignFeatureConfig.k && Intrinsics.f(this.f64577l, cardDesignFeatureConfig.f64577l) && this.f64578m == cardDesignFeatureConfig.f64578m && this.f64579n == cardDesignFeatureConfig.f64579n && Intrinsics.f(this.o, cardDesignFeatureConfig.o) && Intrinsics.f(this.f64580p, cardDesignFeatureConfig.f64580p) && this.f64581q == cardDesignFeatureConfig.f64581q && this.f64582r == cardDesignFeatureConfig.f64582r && Intrinsics.f(this.f64583s, cardDesignFeatureConfig.f64583s) && Intrinsics.f(this.f64584t, cardDesignFeatureConfig.f64584t) && this.u == cardDesignFeatureConfig.u && this.v == cardDesignFeatureConfig.v && this.f64585w == cardDesignFeatureConfig.f64585w && this.f64586x == cardDesignFeatureConfig.f64586x && Intrinsics.f(this.f64587y, cardDesignFeatureConfig.f64587y) && Intrinsics.f(this.z, cardDesignFeatureConfig.z) && this.A == cardDesignFeatureConfig.A && this.B == cardDesignFeatureConfig.B && Intrinsics.f(this.C, cardDesignFeatureConfig.C);
    }

    public final int hashCode() {
        int iHashCode = this.f64571a.hashCode() * 31;
        String str = this.f64572b;
        int iB = l.b(this.f64573c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.d;
        int iHashCode2 = (iB + (str2 == null ? 0 : str2.hashCode())) * 31;
        b bVar = this.e;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str3 = this.f;
        int iC = j6.a.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f64574g);
        String str4 = this.f64575h;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iC + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.i), 31, this.f64576j), 31, this.k);
        Set set = this.f64577l;
        int iHashCode4 = (iC2 + (set == null ? 0 : set.hashCode())) * 31;
        xfa.b bVar2 = this.f64578m;
        int iC3 = j6.a.c((iHashCode4 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31, 31, this.f64579n);
        h hVar = this.o;
        int iHashCode5 = (iC3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        NaviCommand naviCommand = this.f64580p;
        int iC4 = j6.a.c((iHashCode5 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.f64581q);
        v vVar = this.f64582r;
        int iHashCode6 = (iC4 + (vVar == null ? 0 : vVar.hashCode())) * 31;
        String str5 = this.f64583s;
        int iC5 = j6.a.c((this.u.hashCode() + l.a((iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f64584t)) * 31, 31, this.v);
        j0 j0Var = this.f64585w;
        int iHashCode7 = (iC5 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        h93.l0 l0Var = this.f64586x;
        int iHashCode8 = (iHashCode7 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str6 = this.f64587y;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.z;
        int iC6 = j6.a.c(j6.a.c((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.A), 31, this.B);
        String str8 = this.C;
        return iC6 + (str8 != null ? str8.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64571a.name());
        dest.writeString(this.f64572b);
        dest.writeParcelable(this.f64573c, i);
        dest.writeString(this.d);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        dest.writeInt(this.f64574g ? 1 : 0);
        dest.writeString(this.f64575h);
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f64576j ? 1 : 0);
        dest.writeInt(this.k ? 1 : 0);
        Set set = this.f64577l;
        if (set == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = kii.e.q(dest, 1, set);
            while (itQ.hasNext()) {
                dest.writeString(((c93.e) itQ.next()).name());
            }
        }
        xfa.b bVar = this.f64578m;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeInt(this.f64579n ? 1 : 0);
        dest.writeSerializable(this.o);
        dest.writeParcelable(this.f64580p, i);
        dest.writeInt(this.f64581q ? 1 : 0);
        v vVar = this.f64582r;
        if (vVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(vVar.name());
        }
        dest.writeString(this.f64583s);
        dest.writeParcelable(this.f64584t, i);
        dest.writeString(this.u.name());
        dest.writeInt(this.v ? 1 : 0);
        j0 j0Var = this.f64585w;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        h93.l0 l0Var = this.f64586x;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeString(this.f64587y);
        dest.writeString(this.z);
        dest.writeInt(this.A ? 1 : 0);
        dest.writeInt(this.B ? 1 : 0);
        dest.writeString(this.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CardDesignFeatureConfig(e eVar, AccountId accountId, String str, b bVar, String str2, boolean z, String str3, boolean z3, boolean z4, h0 h0Var, xfa.b bVar2, h hVar, NaviCommand naviCommand, v vVar, String str4, AnalyticsProduct analyticsProduct, l0 l0Var, j0 j0Var, h93.l0 l0Var2, String str5, String str6, boolean z6, boolean z11, String str7, int i) {
        AnalyticsProduct analyticsProductG;
        AccountId accountId2 = (i & 4) != 0 ? AccountId.Personal.f51414a : accountId;
        String str8 = (i & 8) != 0 ? null : str;
        b bVar3 = (i & 16) != 0 ? null : bVar;
        String str9 = (i & 32) != 0 ? null : str2;
        boolean z12 = (i & 64) != 0 ? false : z;
        String str10 = (i & 128) != 0 ? null : str3;
        boolean z29 = (i & 256) == 0;
        boolean z31 = (i & 512) != 0 ? false : z3;
        boolean z41 = (i & 1024) != 0 ? true : z4;
        h0 h0Var2 = (i & 2048) != 0 ? null : h0Var;
        xfa.b bVar4 = (i & 4096) != 0 ? null : bVar2;
        boolean z49 = (i & 8192) != 0;
        h hVar2 = (i & 16384) != 0 ? null : hVar;
        NaviCommand naviCommand2 = (32768 & i) != 0 ? null : naviCommand;
        boolean z54 = (65536 & i) == 0;
        v vVar2 = (131072 & i) != 0 ? null : vVar;
        String str11 = (262144 & i) != 0 ? null : str4;
        if ((524288 & i) != 0) {
            AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
            k9 k9Var = frl.a.f137496c;
            analyticsProductG = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
        } else {
            analyticsProductG = analyticsProduct;
        }
        this(eVar, null, accountId2, str8, bVar3, str9, z12, str10, z29, z31, z41, h0Var2, bVar4, z49, hVar2, naviCommand2, z54, vVar2, str11, analyticsProductG, (1048576 & i) != 0 ? l0.DEFAULT : l0Var, (2097152 & i) == 0, (4194304 & i) != 0 ? null : j0Var, (8388608 & i) != 0 ? null : l0Var2, (16777216 & i) != 0 ? null : str5, (33554432 & i) != 0 ? null : str6, (67108864 & i) != 0 ? false : z6, (134217728 & i) != 0 ? false : z11, (i & 268435456) != 0 ? null : str7);
    }
}
