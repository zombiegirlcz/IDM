package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.b0;
import hha.g;
import hha.i;
import hha.i0;
import hha.m;
import hha.z;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.o;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanSubscription;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanSubscription implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanSubscription> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f81129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.e f81130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81131c;
    public final Period d;
    public final DateTime e;
    public final DateTime f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DateTime f81132g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f81133h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PricingPlanNextPlanInfo f81134j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f81135l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f81136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i0 f81137n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f81138p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f81139q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f81140r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f81141s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o f81142t;
    public final b0 u;
    public final PricingPlanSubscriptionBillingChange v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f81143w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f81144x;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            dj0.d dVar;
            i0 i0Var;
            z zVar;
            i0 i0Var2;
            boolean z3;
            boolean z4;
            boolean z6;
            m mVar;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            hha.d dVar2 = (hha.d) parcel.readSerializable();
            hha.e eVarValueOf = hha.e.valueOf(parcel.readString());
            String string = parcel.readString();
            Period period = (Period) parcel.readSerializable();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            DateTime dateTime3 = (DateTime) parcel.readSerializable();
            g gVar = (g) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            PricingPlanNextPlanInfo pricingPlanNextPlanInfoCreateFromParcel = parcel.readInt() == 0 ? null : PricingPlanNextPlanInfo.CREATOR.createFromParcel(parcel);
            dj0.d dVar3 = (dj0.d) parcel.readSerializable();
            i0 i0Var3 = (i0) parcel.readSerializable();
            z zVar2 = (z) parcel.readSerializable();
            i0 i0Var4 = (i0) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z = true;
                dVar = dVar3;
                i0Var = i0Var3;
                zVar = zVar2;
                i0Var2 = i0Var4;
                z3 = true;
            } else {
                z = true;
                dVar = dVar3;
                i0Var = i0Var3;
                zVar = zVar2;
                i0Var2 = i0Var4;
                z3 = false;
            }
            if (parcel.readInt() != 0) {
                z4 = z;
            } else {
                z4 = z;
                z = false;
            }
            m mVar2 = (m) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                z6 = z4;
                mVar = mVar2;
                z11 = z6;
            } else {
                z6 = z4;
                mVar = mVar2;
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = z6;
            } else {
                z12 = z6;
                z6 = false;
            }
            return new PricingPlanSubscription(dVar2, eVarValueOf, string, period, dateTime, dateTime2, dateTime3, gVar, arrayList, pricingPlanNextPlanInfoCreateFromParcel, dVar, i0Var, zVar, i0Var2, z3, z, mVar, z11, z6, parcel.readInt() == 0 ? null : o.valueOf(parcel.readString()), (b0) parcel.readSerializable(), parcel.readInt() != 0 ? PricingPlanSubscriptionBillingChange.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? z12 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanSubscription[i];
        }
    }

    public PricingPlanSubscription(hha.d plan, hha.e accountType, String str, Period period, DateTime startDate, DateTime dateTime, DateTime dateTime2, g gVar, List nextBilling, PricingPlanNextPlanInfo pricingPlanNextPlanInfo, dj0.d dVar, i0 i0Var, z zVar, i0 i0Var2, boolean z, boolean z3, m mVar, boolean z4, boolean z6, o oVar, b0 b0Var, PricingPlanSubscriptionBillingChange pricingPlanSubscriptionBillingChange, boolean z11) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextBilling, "nextBilling");
        this.f81129a = plan;
        this.f81130b = accountType;
        this.f81131c = str;
        this.d = period;
        this.e = startDate;
        this.f = dateTime;
        this.f81132g = dateTime2;
        this.f81133h = gVar;
        this.i = nextBilling;
        this.f81134j = pricingPlanNextPlanInfo;
        this.k = dVar;
        this.f81135l = i0Var;
        this.f81136m = zVar;
        this.f81137n = i0Var2;
        this.o = z;
        this.f81138p = z3;
        this.f81139q = mVar;
        this.f81140r = z4;
        this.f81141s = z6;
        this.f81142t = oVar;
        this.u = b0Var;
        this.v = pricingPlanSubscriptionBillingChange;
        this.f81143w = z11;
        this.f81144x = Intrinsics.f(period, jli.e.f175845h) ? i.MONTHLY : Intrinsics.f(period, jli.e.f175842b) ? i.ANNUAL : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanSubscription)) {
            return false;
        }
        PricingPlanSubscription pricingPlanSubscription = (PricingPlanSubscription) obj2;
        return Intrinsics.f(this.f81129a, pricingPlanSubscription.f81129a) && this.f81130b == pricingPlanSubscription.f81130b && Intrinsics.f(this.f81131c, pricingPlanSubscription.f81131c) && Intrinsics.f(this.d, pricingPlanSubscription.d) && Intrinsics.f(this.e, pricingPlanSubscription.e) && Intrinsics.f(this.f, pricingPlanSubscription.f) && Intrinsics.f(this.f81132g, pricingPlanSubscription.f81132g) && Intrinsics.f(this.f81133h, pricingPlanSubscription.f81133h) && Intrinsics.f(this.i, pricingPlanSubscription.i) && Intrinsics.f(this.f81134j, pricingPlanSubscription.f81134j) && Intrinsics.f(this.k, pricingPlanSubscription.k) && Intrinsics.f(this.f81135l, pricingPlanSubscription.f81135l) && Intrinsics.f(this.f81136m, pricingPlanSubscription.f81136m) && Intrinsics.f(this.f81137n, pricingPlanSubscription.f81137n) && this.o == pricingPlanSubscription.o && this.f81138p == pricingPlanSubscription.f81138p && Intrinsics.f(this.f81139q, pricingPlanSubscription.f81139q) && this.f81140r == pricingPlanSubscription.f81140r && this.f81141s == pricingPlanSubscription.f81141s && this.f81142t == pricingPlanSubscription.f81142t && Intrinsics.f(this.u, pricingPlanSubscription.u) && Intrinsics.f(this.v, pricingPlanSubscription.v) && this.f81143w == pricingPlanSubscription.f81143w;
    }

    public final int hashCode() {
        int iHashCode = (this.f81130b.hashCode() + (this.f81129a.hashCode() * 31)) * 31;
        String str = this.f81131c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Period period = this.d;
        int iF = m72.b.f(this.e, (iHashCode2 + (period == null ? 0 : period.hashCode())) * 31, 31);
        DateTime dateTime = this.f;
        int iHashCode3 = (iF + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        DateTime dateTime2 = this.f81132g;
        int iHashCode4 = (iHashCode3 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        g gVar = this.f81133h;
        int iD = p.a.d((iHashCode4 + (gVar == null ? 0 : gVar.hashCode())) * 31, 31, this.i);
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = this.f81134j;
        int iHashCode5 = (iD + (pricingPlanNextPlanInfo == null ? 0 : pricingPlanNextPlanInfo.hashCode())) * 31;
        dj0.d dVar = this.k;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i0 i0Var = this.f81135l;
        int iHashCode7 = (iHashCode6 + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        z zVar = this.f81136m;
        int iHashCode8 = (iHashCode7 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        i0 i0Var2 = this.f81137n;
        int iC = j6.a.c(j6.a.c((iHashCode8 + (i0Var2 == null ? 0 : i0Var2.hashCode())) * 31, 31, this.o), 31, this.f81138p);
        m mVar = this.f81139q;
        int iC2 = j6.a.c(j6.a.c((iC + (mVar == null ? 0 : mVar.hashCode())) * 31, 31, this.f81140r), 31, this.f81141s);
        o oVar = this.f81142t;
        int iHashCode9 = (iC2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        b0 b0Var = this.u;
        int iHashCode10 = (iHashCode9 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        PricingPlanSubscriptionBillingChange pricingPlanSubscriptionBillingChange = this.v;
        return Boolean.hashCode(this.f81143w) + ((iHashCode10 + (pricingPlanSubscriptionBillingChange != null ? pricingPlanSubscriptionBillingChange.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f81129a);
        dest.writeString(this.f81130b.name());
        dest.writeString(this.f81131c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f81132g);
        dest.writeSerializable(this.f81133h);
        Iterator itV = p.a.v(this.i, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        PricingPlanNextPlanInfo pricingPlanNextPlanInfo = this.f81134j;
        if (pricingPlanNextPlanInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanNextPlanInfo.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.k);
        dest.writeSerializable(this.f81135l);
        dest.writeSerializable(this.f81136m);
        dest.writeSerializable(this.f81137n);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f81138p ? 1 : 0);
        dest.writeSerializable(this.f81139q);
        dest.writeInt(this.f81140r ? 1 : 0);
        dest.writeInt(this.f81141s ? 1 : 0);
        o oVar = this.f81142t;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
        dest.writeSerializable(this.u);
        PricingPlanSubscriptionBillingChange pricingPlanSubscriptionBillingChange = this.v;
        if (pricingPlanSubscriptionBillingChange == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanSubscriptionBillingChange.writeToParcel(dest, i);
        }
        dest.writeInt(this.f81143w ? 1 : 0);
    }
}
