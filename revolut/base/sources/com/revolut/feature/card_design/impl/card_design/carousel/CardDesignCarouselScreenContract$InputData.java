package com.revolut.feature.card_design.impl.card_design.carousel;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_design.api.model.SkipConfig;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.NaviCommand;
import h30.l;
import h93.j0;
import h93.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pi3.h;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_design/carousel/CardDesignCarouselScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDesignCarouselScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardDesignCarouselScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f64681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c93.e f64682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j0 f64683c;
    public final l0 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f64684g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountId f64685h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f64686j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final NaviCommand f64687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AnalyticsProduct f64688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e93.b f64689n;
    public final j0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l0 f64690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f64691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SkipConfig f64692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f64693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f64694t;
    public final boolean u;
    public final e93.b v;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            l0 l0VarValueOf;
            e93.b bVar;
            e93.b bVarValueOf;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h hVar = (h) parcel.readSerializable();
            c93.e eVarValueOf = c93.e.valueOf(parcel.readString());
            j0 j0VarValueOf = j0.valueOf(parcel.readString());
            l0 l0VarValueOf2 = l0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AccountId accountId = (AccountId) parcel.readParcelable(CardDesignCarouselScreenContract$InputData.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z3 = parcel.readInt() != 0;
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(CardDesignCarouselScreenContract$InputData.class.getClassLoader());
            AnalyticsProduct analyticsProduct = (AnalyticsProduct) parcel.readParcelable(CardDesignCarouselScreenContract$InputData.class.getClassLoader());
            e93.b bVarValueOf2 = parcel.readInt() == 0 ? null : e93.b.valueOf(parcel.readString());
            j0 j0VarValueOf2 = parcel.readInt() == 0 ? null : j0.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                l0VarValueOf = null;
                bVar = null;
            } else {
                l0VarValueOf = l0.valueOf(parcel.readString());
                bVar = null;
            }
            String string6 = parcel.readString();
            SkipConfig skipConfig = (SkipConfig) parcel.readParcelable(CardDesignCarouselScreenContract$InputData.class.getClassLoader());
            e93.b bVar2 = bVarValueOf2;
            l0 l0Var = l0VarValueOf;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                bVarValueOf = bVar;
                z = true;
            } else {
                bVarValueOf = bVar;
                z = false;
            }
            boolean z6 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                bVarValueOf = e93.b.valueOf(parcel.readString());
            }
            return new CardDesignCarouselScreenContract$InputData(hVar, eVarValueOf, j0VarValueOf, l0VarValueOf2, string, string2, string3, accountId, string4, string5, z3, naviCommand, analyticsProduct, bVar2, j0VarValueOf2, l0Var, string6, skipConfig, z4, z, z6, bVarValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDesignCarouselScreenContract$InputData[i];
        }
    }

    public CardDesignCarouselScreenContract$InputData(h hVar, c93.e cardType, j0 productType, l0 subProductType, String str, String str2, String str3, AccountId accountId, String str4, String str5, boolean z, NaviCommand naviCommand, AnalyticsProduct automaticEventProduct, e93.b bVar, j0 j0Var, l0 l0Var, String str6, SkipConfig skipConfig, boolean z3, boolean z4, boolean z6, e93.b bVar2) {
        Intrinsics.checkNotNullParameter(cardType, "cardType");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(subProductType, "subProductType");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(automaticEventProduct, "automaticEventProduct");
        this.f64681a = hVar;
        this.f64682b = cardType;
        this.f64683c = productType;
        this.d = subProductType;
        this.e = str;
        this.f = str2;
        this.f64684g = str3;
        this.f64685h = accountId;
        this.i = str4;
        this.f64686j = str5;
        this.k = z;
        this.f64687l = naviCommand;
        this.f64688m = automaticEventProduct;
        this.f64689n = bVar;
        this.o = j0Var;
        this.f64690p = l0Var;
        this.f64691q = str6;
        this.f64692r = skipConfig;
        this.f64693s = z3;
        this.f64694t = z4;
        this.u = z6;
        this.v = bVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDesignCarouselScreenContract$InputData)) {
            return false;
        }
        CardDesignCarouselScreenContract$InputData cardDesignCarouselScreenContract$InputData = (CardDesignCarouselScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64681a, cardDesignCarouselScreenContract$InputData.f64681a) && this.f64682b == cardDesignCarouselScreenContract$InputData.f64682b && this.f64683c == cardDesignCarouselScreenContract$InputData.f64683c && this.d == cardDesignCarouselScreenContract$InputData.d && Intrinsics.f(this.e, cardDesignCarouselScreenContract$InputData.e) && Intrinsics.f(this.f, cardDesignCarouselScreenContract$InputData.f) && Intrinsics.f(this.f64684g, cardDesignCarouselScreenContract$InputData.f64684g) && Intrinsics.f(this.f64685h, cardDesignCarouselScreenContract$InputData.f64685h) && Intrinsics.f(this.i, cardDesignCarouselScreenContract$InputData.i) && Intrinsics.f(this.f64686j, cardDesignCarouselScreenContract$InputData.f64686j) && this.k == cardDesignCarouselScreenContract$InputData.k && Intrinsics.f(this.f64687l, cardDesignCarouselScreenContract$InputData.f64687l) && Intrinsics.f(this.f64688m, cardDesignCarouselScreenContract$InputData.f64688m) && this.f64689n == cardDesignCarouselScreenContract$InputData.f64689n && this.o == cardDesignCarouselScreenContract$InputData.o && this.f64690p == cardDesignCarouselScreenContract$InputData.f64690p && Intrinsics.f(this.f64691q, cardDesignCarouselScreenContract$InputData.f64691q) && Intrinsics.f(this.f64692r, cardDesignCarouselScreenContract$InputData.f64692r) && this.f64693s == cardDesignCarouselScreenContract$InputData.f64693s && this.f64694t == cardDesignCarouselScreenContract$InputData.f64694t && this.u == cardDesignCarouselScreenContract$InputData.u && this.v == cardDesignCarouselScreenContract$InputData.v;
    }

    public final int hashCode() {
        h hVar = this.f64681a;
        int iHashCode = (this.d.hashCode() + ((this.f64683c.hashCode() + ((this.f64682b.hashCode() + ((hVar == null ? 0 : hVar.hashCode()) * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f64684g;
        int iB = l.b(this.f64685h, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        String str4 = this.i;
        int iHashCode4 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f64686j;
        int iC = j6.a.c((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.k);
        NaviCommand naviCommand = this.f64687l;
        int iA = l.a((iC + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31, 31, this.f64688m);
        e93.b bVar = this.f64689n;
        int iHashCode5 = (iA + (bVar == null ? 0 : bVar.hashCode())) * 31;
        j0 j0Var = this.o;
        int iHashCode6 = (iHashCode5 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        l0 l0Var = this.f64690p;
        int iHashCode7 = (iHashCode6 + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        String str6 = this.f64691q;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SkipConfig skipConfig = this.f64692r;
        int iC2 = j6.a.c(j6.a.c(j6.a.c((iHashCode8 + (skipConfig == null ? 0 : skipConfig.hashCode())) * 31, 31, this.f64693s), 31, this.f64694t), 31, this.u);
        e93.b bVar2 = this.v;
        return iC2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64681a);
        dest.writeString(this.f64682b.name());
        dest.writeString(this.f64683c.name());
        dest.writeString(this.d.name());
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f64684g);
        dest.writeParcelable(this.f64685h, i);
        dest.writeString(this.i);
        dest.writeString(this.f64686j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeParcelable(this.f64687l, i);
        dest.writeParcelable(this.f64688m, i);
        e93.b bVar = this.f64689n;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        j0 j0Var = this.o;
        if (j0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(j0Var.name());
        }
        l0 l0Var = this.f64690p;
        if (l0Var == null) {
            dest.writeInt(0);
        } else {
            l.B(dest, 1, l0Var);
        }
        dest.writeString(this.f64691q);
        dest.writeParcelable(this.f64692r, i);
        dest.writeInt(this.f64693s ? 1 : 0);
        dest.writeInt(this.f64694t ? 1 : 0);
        dest.writeInt(this.u ? 1 : 0);
        e93.b bVar2 = this.v;
        if (bVar2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar2.name());
        }
    }
}
