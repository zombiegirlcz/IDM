package com.revolut.feature.card_design.impl.card_design;

import android.os.Parcel;
import android.os.Parcelable;
import c93.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.j0;
import h93.l0;
import hx2.m;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "Catalogue", "Carousel", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData$Carousel;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData$Catalogue;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardDesignFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData$Carousel;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Carousel extends CardDesignFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Carousel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f64598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f64599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f64600c;
        public final l0 d;
        public final String e;
        public final AccountId f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final e93.l0 f64601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f64602h;
        public final NaviCommand i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SkipConfig f64603j;
        public final AnalyticsProduct k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f64604l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final j0 f64605m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final l0 f64606n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final xfa.b f64607p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f64608q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final String f64609r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final String f64610s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final String f64611t;
        public final boolean u;
        public final boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f64612w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final boolean f64613x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final String f64614y;
        public final String z;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                l0 l0VarValueOf;
                xfa.b bVarValueOf;
                boolean z;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                h hVar = (h) parcel.readSerializable();
                e eVarValueOf = e.valueOf(parcel.readString());
                j0 j0VarValueOf = j0.valueOf(parcel.readString());
                l0 l0VarValueOf2 = l0.valueOf(parcel.readString());
                String string = parcel.readString();
                AccountId accountId = (AccountId) parcel.readParcelable(Carousel.class.getClassLoader());
                e93.l0 l0VarValueOf3 = e93.l0.valueOf(parcel.readString());
                boolean z6 = parcel.readInt() != 0;
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(Carousel.class.getClassLoader());
                SkipConfig skipConfig = (SkipConfig) parcel.readParcelable(Carousel.class.getClassLoader());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Carousel.class.getClassLoader());
                String string2 = parcel.readString();
                j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    l0VarValueOf = null;
                    bVarValueOf = null;
                } else {
                    l0VarValueOf = l0.valueOf(parcel.readString());
                    bVarValueOf = null;
                }
                String string3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    bVarValueOf = xfa.b.valueOf(parcel.readString());
                }
                String string4 = parcel.readString();
                j0 j0Var = j0VarValueOf2;
                l0 l0Var = l0VarValueOf;
                xfa.b bVar = bVarValueOf;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z11 = true;
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z11 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                } else {
                    z3 = z;
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                } else {
                    z4 = z3;
                    z3 = false;
                }
                if (parcel.readInt() == 0) {
                    z4 = false;
                }
                return new Carousel(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf2, string, accountId, l0VarValueOf3, z6, naviCommand, skipConfig, analyticsProduct, string2, j0Var, l0Var, string3, bVar, string4, string5, string6, string7, z11, z, z3, z4, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Carousel[i];
            }
        }

        public Carousel(h hVar, e cardType, j0 productType, l0 subProductType, String str, AccountId accountId, e93.l0 virtualCardLabelType, boolean z, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct automaticEventProduct, String str2, j0 j0Var, l0 l0Var, String str3, xfa.b bVar, String str4, String str5, String str6, String str7, boolean z3, boolean z4, boolean z6, boolean z11, String str8, String str9) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(subProductType, "subProductType");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f64598a = hVar;
            this.f64599b = cardType;
            this.f64600c = productType;
            this.d = subProductType;
            this.e = str;
            this.f = accountId;
            this.f64601g = virtualCardLabelType;
            this.f64602h = z;
            this.i = naviCommand;
            this.f64603j = skipConfig;
            this.k = automaticEventProduct;
            this.f64604l = str2;
            this.f64605m = j0Var;
            this.f64606n = l0Var;
            this.o = str3;
            this.f64607p = bVar;
            this.f64608q = str4;
            this.f64609r = str5;
            this.f64610s = str6;
            this.f64611t = str7;
            this.u = z3;
            this.v = z4;
            this.f64612w = z6;
            this.f64613x = z11;
            this.f64614y = str8;
            this.z = str9;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getO() {
            return this.o;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: J0, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: T, reason: from getter */
        public final j0 getF64617c() {
            return this.f64600c;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: W, reason: from getter */
        public final String getF64621l() {
            return this.f64604l;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF64618g() {
            return this.f64602h;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF64631y() {
            return this.z;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final h getF64615a() {
            return this.f64598a;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final SkipConfig getF64620j() {
            return this.f64603j;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: d, reason: from getter */
        public final NaviCommand getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: e, reason: from getter */
        public final j0 getF64622m() {
            return this.f64605m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Carousel)) {
                return false;
            }
            Carousel carousel = (Carousel) obj2;
            return Intrinsics.f(this.f64598a, carousel.f64598a) && this.f64599b == carousel.f64599b && this.f64600c == carousel.f64600c && this.d == carousel.d && Intrinsics.f(this.e, carousel.e) && Intrinsics.f(this.f, carousel.f) && this.f64601g == carousel.f64601g && this.f64602h == carousel.f64602h && Intrinsics.f(this.i, carousel.i) && Intrinsics.f(this.f64603j, carousel.f64603j) && Intrinsics.f(this.k, carousel.k) && Intrinsics.f(this.f64604l, carousel.f64604l) && this.f64605m == carousel.f64605m && this.f64606n == carousel.f64606n && Intrinsics.f(this.o, carousel.o) && this.f64607p == carousel.f64607p && Intrinsics.f(this.f64608q, carousel.f64608q) && Intrinsics.f(this.f64609r, carousel.f64609r) && Intrinsics.f(this.f64610s, carousel.f64610s) && Intrinsics.f(this.f64611t, carousel.f64611t) && this.u == carousel.u && this.v == carousel.v && this.f64612w == carousel.f64612w && this.f64613x == carousel.f64613x && Intrinsics.f(this.f64614y, carousel.f64614y) && Intrinsics.f(this.z, carousel.z);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final xfa.b getF64624p() {
            return this.f64607p;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF() {
            return this.f;
        }

        public final int hashCode() {
            h hVar = this.f64598a;
            int iHashCode = (this.d.hashCode() + ((this.f64600c.hashCode() + ((this.f64599b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
            String str = this.e;
            int iC = j6.a.c((this.f64601g.hashCode() + l.b(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f64602h);
            NaviCommand naviCommand = this.i;
            int iHashCode2 = (iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            SkipConfig skipConfig = this.f64603j;
            int iA = l.a((iHashCode2 + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.k);
            String str2 = this.f64604l;
            int iHashCode3 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            j0 j0Var = this.f64605m;
            int iHashCode4 = (iHashCode3 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.f64606n;
            int iHashCode5 = (iHashCode4 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
            String str3 = this.o;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            xfa.b bVar = this.f64607p;
            int iHashCode7 = (iHashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str4 = this.f64608q;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f64609r;
            int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f64610s;
            int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f64611t;
            int iC2 = j6.a.c(j6.a.c(j6.a.c(j6.a.c((iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.u), 31, this.v), 31, this.f64612w), 31, this.f64613x);
            String str8 = this.f64614y;
            int iHashCode11 = (iC2 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.z;
            return iHashCode11 + (str9 != null ? str9.hashCode() : 0);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getK() {
            return this.k;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: j, reason: from getter */
        public final l0 getF64623n() {
            return this.f64606n;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: k0, reason: from getter */
        public final l0 getD() {
            return this.d;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final e93.l0 getF64619h() {
            return this.f64601g;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64598a);
            dest.writeString(this.f64599b.name());
            dest.writeString(this.f64600c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeString(this.f64601g.name());
            dest.writeInt(this.f64602h ? 1 : 0);
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f64603j, i);
            dest.writeParcelable(this.k, i);
            dest.writeString(this.f64604l);
            j0 j0Var = this.f64605m;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.f64606n;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeString(this.o);
            xfa.b bVar = this.f64607p;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeString(this.f64608q);
            dest.writeString(this.f64609r);
            dest.writeString(this.f64610s);
            dest.writeString(this.f64611t);
            dest.writeInt(this.u ? 1 : 0);
            dest.writeInt(this.v ? 1 : 0);
            dest.writeInt(this.f64612w ? 1 : 0);
            dest.writeInt(this.f64613x ? 1 : 0);
            dest.writeString(this.f64614y);
            dest.writeString(this.z);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF64630x() {
            return this.f64614y;
        }
    }

    /* JADX INFO: renamed from: J */
    public abstract String getO();

    /* JADX INFO: renamed from: J0 */
    public abstract String getE();

    /* JADX INFO: renamed from: T */
    public abstract j0 getF64617c();

    /* JADX INFO: renamed from: W */
    public abstract String getF64621l();

    /* JADX INFO: renamed from: a */
    public abstract boolean getF64618g();

    /* JADX INFO: renamed from: b */
    public abstract String getF64631y();

    /* JADX INFO: renamed from: c */
    public abstract h getF64615a();

    /* JADX INFO: renamed from: c0 */
    public abstract SkipConfig getF64620j();

    /* JADX INFO: renamed from: d */
    public abstract NaviCommand getI();

    /* JADX INFO: renamed from: e */
    public abstract j0 getF64622m();

    /* JADX INFO: renamed from: f0 */
    public abstract xfa.b getF64624p();

    /* JADX INFO: renamed from: getAccountId */
    public abstract AccountId getF();

    /* JADX INFO: renamed from: i6 */
    public abstract AnalyticsProduct getK();

    /* JADX INFO: renamed from: j */
    public abstract l0 getF64623n();

    /* JADX INFO: renamed from: k0 */
    public abstract l0 getD();

    /* JADX INFO: renamed from: p0 */
    public abstract e93.l0 getF64619h();

    /* JADX INFO: renamed from: z */
    public abstract String getF64630x();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData$Catalogue;", "Lcom/revolut/feature/card_design/impl/card_design/CardDesignFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Catalogue extends CardDesignFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Catalogue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f64615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f64616b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j0 f64617c;
        public final l0 d;
        public final String e;
        public final AccountId f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f64618g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final e93.l0 f64619h;
        public final NaviCommand i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final SkipConfig f64620j;
        public final AnalyticsProduct k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final String f64621l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final j0 f64622m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final l0 f64623n;
        public final String o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final xfa.b f64624p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final boolean f64625q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f64626r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final m f64627s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Set f64628t;
        public final boolean u;
        public final boolean v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final boolean f64629w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final String f64630x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final String f64631y;

        public static final class a implements Parcelable.Creator {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r10v0, types: [java.util.AbstractCollection, java.util.LinkedHashSet] */
            /* JADX WARN: Type inference failed for: r10v1 */
            /* JADX WARN: Type inference failed for: r10v3 */
            /* JADX WARN: Type inference failed for: r22v4, types: [java.util.Set] */
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                m mVar;
                l0 l0Var;
                String str;
                xfa.b bVar;
                boolean z3;
                m mVar2;
                boolean z4;
                ?? linkedHashSet;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                h hVar = (h) parcel.readSerializable();
                e eVarValueOf = e.valueOf(parcel.readString());
                j0 j0VarValueOf = j0.valueOf(parcel.readString());
                l0 l0VarValueOf = l0.valueOf(parcel.readString());
                String string = parcel.readString();
                AccountId accountId = (AccountId) parcel.readParcelable(Catalogue.class.getClassLoader());
                boolean z6 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z6 = true;
                } else {
                    z = false;
                }
                e93.l0 l0VarValueOf2 = e93.l0.valueOf(parcel.readString());
                NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(Catalogue.class.getClassLoader());
                SkipConfig skipConfig = (SkipConfig) parcel.readParcelable(Catalogue.class.getClassLoader());
                AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(Catalogue.class.getClassLoader());
                String string2 = parcel.readString();
                j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
                l0 l0VarValueOf3 = parcel.readInt() == 0 ? null : l0.valueOf(parcel.readString());
                String string3 = parcel.readString();
                xfa.b bVarValueOf = parcel.readInt() == 0 ? null : xfa.b.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    mVar = null;
                    l0Var = l0VarValueOf3;
                    str = string3;
                    bVar = bVarValueOf;
                    z3 = true;
                } else {
                    mVar = null;
                    l0Var = l0VarValueOf3;
                    str = string3;
                    bVar = bVarValueOf;
                    z3 = z;
                }
                if (parcel.readInt() != 0) {
                    mVar2 = mVar;
                    z4 = true;
                } else {
                    mVar2 = mVar;
                    z4 = z;
                }
                m mVarValueOf = parcel.readInt() == 0 ? mVar2 : m.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    linkedHashSet = mVar2;
                } else {
                    int i = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(e.valueOf(parcel.readString()));
                    }
                }
                return new Catalogue(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf, string, accountId, z6, l0VarValueOf2, naviCommand, skipConfig, analyticsProduct, string2, j0VarValueOf2, l0Var, str, bVar, z3, z4, mVarValueOf, linkedHashSet, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Catalogue[i];
            }
        }

        public Catalogue(h hVar, e cardType, j0 productType, l0 subProductType, String str, AccountId accountId, boolean z, e93.l0 virtualCardLabelType, NaviCommand naviCommand, SkipConfig skipConfig, AnalyticsProduct automaticEventProduct, String str2, j0 j0Var, l0 l0Var, String str3, xfa.b bVar, boolean z3, boolean z4, m mVar, Set set, boolean z6, boolean z11, boolean z12, String str4, String str5) {
            Intrinsics.checkNotNullParameter(cardType, "cardType");
            Intrinsics.checkNotNullParameter(productType, "productType");
            Intrinsics.checkNotNullParameter(subProductType, "subProductType");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(virtualCardLabelType, "virtualCardLabelType");
            Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
            this.f64615a = hVar;
            this.f64616b = cardType;
            this.f64617c = productType;
            this.d = subProductType;
            this.e = str;
            this.f = accountId;
            this.f64618g = z;
            this.f64619h = virtualCardLabelType;
            this.i = naviCommand;
            this.f64620j = skipConfig;
            this.k = automaticEventProduct;
            this.f64621l = str2;
            this.f64622m = j0Var;
            this.f64623n = l0Var;
            this.o = str3;
            this.f64624p = bVar;
            this.f64625q = z3;
            this.f64626r = z4;
            this.f64627s = mVar;
            this.f64628t = set;
            this.u = z6;
            this.v = z11;
            this.f64629w = z12;
            this.f64630x = str4;
            this.f64631y = str5;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: J, reason: from getter */
        public final String getO() {
            return this.o;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: J0, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: T, reason: from getter */
        public final j0 getF64617c() {
            return this.f64617c;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: W, reason: from getter */
        public final String getF64621l() {
            return this.f64621l;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF64618g() {
            return this.f64618g;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF64631y() {
            return this.f64631y;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final h getF64615a() {
            return this.f64615a;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: c0, reason: from getter */
        public final SkipConfig getF64620j() {
            return this.f64620j;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: d, reason: from getter */
        public final NaviCommand getI() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: e, reason: from getter */
        public final j0 getF64622m() {
            return this.f64622m;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Catalogue)) {
                return false;
            }
            Catalogue catalogue = (Catalogue) obj2;
            return Intrinsics.f(this.f64615a, catalogue.f64615a) && this.f64616b == catalogue.f64616b && this.f64617c == catalogue.f64617c && this.d == catalogue.d && Intrinsics.f(this.e, catalogue.e) && Intrinsics.f(this.f, catalogue.f) && this.f64618g == catalogue.f64618g && this.f64619h == catalogue.f64619h && Intrinsics.f(this.i, catalogue.i) && Intrinsics.f(this.f64620j, catalogue.f64620j) && Intrinsics.f(this.k, catalogue.k) && Intrinsics.f(this.f64621l, catalogue.f64621l) && this.f64622m == catalogue.f64622m && this.f64623n == catalogue.f64623n && Intrinsics.f(this.o, catalogue.o) && this.f64624p == catalogue.f64624p && this.f64625q == catalogue.f64625q && this.f64626r == catalogue.f64626r && this.f64627s == catalogue.f64627s && Intrinsics.f(this.f64628t, catalogue.f64628t) && this.u == catalogue.u && this.v == catalogue.v && this.f64629w == catalogue.f64629w && Intrinsics.f(this.f64630x, catalogue.f64630x) && Intrinsics.f(this.f64631y, catalogue.f64631y);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final xfa.b getF64624p() {
            return this.f64624p;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: getAccountId, reason: from getter */
        public final AccountId getF() {
            return this.f;
        }

        public final int hashCode() {
            h hVar = this.f64615a;
            int iHashCode = (this.d.hashCode() + ((this.f64617c.hashCode() + ((this.f64616b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
            String str = this.e;
            int iHashCode2 = (this.f64619h.hashCode() + j6.a.c(l.b(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f64618g)) * 31;
            NaviCommand naviCommand = this.i;
            int iHashCode3 = (iHashCode2 + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31;
            SkipConfig skipConfig = this.f64620j;
            int iA = l.a((iHashCode3 + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.k);
            String str2 = this.f64621l;
            int iHashCode4 = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            j0 j0Var = this.f64622m;
            int iHashCode5 = (iHashCode4 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
            l0 l0Var = this.f64623n;
            int iHashCode6 = (iHashCode5 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
            String str3 = this.o;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            xfa.b bVar = this.f64624p;
            int iC = j6.a.c(j6.a.c((iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f64625q), 31, this.f64626r);
            m mVar = this.f64627s;
            int iHashCode8 = (iC + (mVar == null ? 0 : mVar.hashCode())) * 31;
            Set set = this.f64628t;
            int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode8 + (set == null ? 0 : set.hashCode())) * 31, 31, this.u), 31, this.v), 31, this.f64629w);
            String str4 = this.f64630x;
            int iHashCode9 = (iC2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f64631y;
            return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: i6, reason: from getter */
        public final AnalyticsProduct getK() {
            return this.k;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: j, reason: from getter */
        public final l0 getF64623n() {
            return this.f64623n;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: k0, reason: from getter */
        public final l0 getD() {
            return this.d;
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: p0, reason: from getter */
        public final e93.l0 getF64619h() {
            return this.f64619h;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f64615a);
            dest.writeString(this.f64616b.name());
            dest.writeString(this.f64617c.name());
            dest.writeString(this.d.name());
            dest.writeString(this.e);
            dest.writeParcelable(this.f, i);
            dest.writeInt(this.f64618g ? 1 : 0);
            dest.writeString(this.f64619h.name());
            dest.writeParcelable(this.i, i);
            dest.writeParcelable(this.f64620j, i);
            dest.writeParcelable(this.k, i);
            dest.writeString(this.f64621l);
            j0 j0Var = this.f64622m;
            if (j0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(j0Var.name());
            }
            l0 l0Var = this.f64623n;
            if (l0Var == null) {
                dest.writeInt(0);
            } else {
                l.B(dest, 1, l0Var);
            }
            dest.writeString(this.o);
            xfa.b bVar = this.f64624p;
            if (bVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(bVar.name());
            }
            dest.writeInt(this.f64625q ? 1 : 0);
            dest.writeInt(this.f64626r ? 1 : 0);
            m mVar = this.f64627s;
            if (mVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(mVar.name());
            }
            Set set = this.f64628t;
            if (set == null) {
                dest.writeInt(0);
            } else {
                Iterator itQ = kii.e.q(dest, 1, set);
                while (itQ.hasNext()) {
                    dest.writeString(((e) itQ.next()).name());
                }
            }
            dest.writeInt(this.u ? 1 : 0);
            dest.writeInt(this.v ? 1 : 0);
            dest.writeInt(this.f64629w ? 1 : 0);
            dest.writeString(this.f64630x);
            dest.writeString(this.f64631y);
        }

        @Override // com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData
        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getF64630x() {
            return this.f64630x;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public Catalogue(pi3.h r29, c93.e r30, h93.j0 r31, h93.l0 r32, java.lang.String r33, com.revolut.core.model.account.AccountId r34, boolean r35, e93.l0 r36, com.revolut.retail.core.navigation.NaviCommand r37, com.revolut.feature.card_design.api.model.SkipConfig r38, com.revolut.analytics.tracking.v3.AnalyticsProduct r39, java.lang.String r40, h93.j0 r41, h93.l0 r42, java.lang.String r43, xfa.b r44, boolean r45, boolean r46, hx2.m r47, java.util.Set r48, boolean r49, boolean r50, boolean r51, java.lang.String r52, java.lang.String r53, int r54) {
            /*
                r28 = this;
                r0 = 131072(0x20000, float:1.83671E-40)
                r0 = r54 & r0
                r1 = 0
                if (r0 == 0) goto La
                r20 = r1
                goto Lc
            La:
                r20 = r46
            Lc:
                r0 = 262144(0x40000, float:3.67342E-40)
                r0 = r54 & r0
                r2 = 0
                if (r0 == 0) goto L16
                r21 = r2
                goto L18
            L16:
                r21 = r47
            L18:
                r0 = 524288(0x80000, float:7.34684E-40)
                r0 = r54 & r0
                if (r0 == 0) goto L21
                r22 = r2
                goto L23
            L21:
                r22 = r48
            L23:
                r0 = 1048576(0x100000, float:1.469368E-39)
                r0 = r54 & r0
                if (r0 == 0) goto L2c
                r23 = r1
                goto L2e
            L2c:
                r23 = r49
            L2e:
                r0 = 2097152(0x200000, float:2.938736E-39)
                r0 = r54 & r0
                if (r0 == 0) goto L37
                r24 = r1
                goto L39
            L37:
                r24 = r50
            L39:
                r0 = 4194304(0x400000, float:5.877472E-39)
                r0 = r54 & r0
                if (r0 == 0) goto L42
                r25 = r1
                goto L44
            L42:
                r25 = r51
            L44:
                r0 = 16777216(0x1000000, float:2.3509887E-38)
                r0 = r54 & r0
                if (r0 == 0) goto L73
                r27 = r2
                r3 = r29
                r4 = r30
                r5 = r31
                r6 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                r10 = r36
                r11 = r37
                r12 = r38
                r13 = r39
                r14 = r40
                r15 = r41
                r16 = r42
                r17 = r43
                r18 = r44
                r19 = r45
                r26 = r52
                r2 = r28
                goto L9b
            L73:
                r27 = r53
                r2 = r28
                r3 = r29
                r4 = r30
                r5 = r31
                r6 = r32
                r7 = r33
                r8 = r34
                r9 = r35
                r10 = r36
                r11 = r37
                r12 = r38
                r13 = r39
                r14 = r40
                r15 = r41
                r16 = r42
                r17 = r43
                r18 = r44
                r19 = r45
                r26 = r52
            L9b:
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$InputData.Catalogue.<init>(pi3.h, c93.e, h93.j0, h93.l0, java.lang.String, com.revolut.core.model.account.AccountId, boolean, e93.l0, com.revolut.retail.core.navigation.NaviCommand, com.revolut.feature.card_design.api.model.SkipConfig, com.revolut.analytics.tracking.v3.AnalyticsProduct, java.lang.String, h93.j0, h93.l0, java.lang.String, xfa.b, boolean, boolean, hx2.m, java.util.Set, boolean, boolean, boolean, java.lang.String, java.lang.String, int):void");
        }
    }
}
