package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsBenefits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsBenefits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsBenefits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f83961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83963c;
    public final d d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPointsBoosterSummary f83964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f83965h;
    public final RevPointsYearlySavings i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f83966j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f83967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f83968m;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsBenefits((d) parcel.readSerializable(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RevPointsBoosterSummary.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? RevPointsYearlySavings.CREATOR.createFromParcel(parcel) : null, (d) parcel.readSerializable(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsBenefits[i];
        }
    }

    public RevPointsBenefits(d cashForCardSpend, String pointsForCardSpend, String pointsToMilesRatio, d dVar, String str, String str2, RevPointsBoosterSummary revPointsBoosterSummary, String plan, RevPointsYearlySavings revPointsYearlySavings, d dVar2, String str3, d dVar3, d dVar4) {
        Intrinsics.checkNotNullParameter(cashForCardSpend, "cashForCardSpend");
        Intrinsics.checkNotNullParameter(pointsForCardSpend, "pointsForCardSpend");
        Intrinsics.checkNotNullParameter(pointsToMilesRatio, "pointsToMilesRatio");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f83961a = cashForCardSpend;
        this.f83962b = pointsForCardSpend;
        this.f83963c = pointsToMilesRatio;
        this.d = dVar;
        this.e = str;
        this.f = str2;
        this.f83964g = revPointsBoosterSummary;
        this.f83965h = plan;
        this.i = revPointsYearlySavings;
        this.f83966j = dVar2;
        this.k = str3;
        this.f83967l = dVar3;
        this.f83968m = dVar4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsBenefits)) {
            return false;
        }
        RevPointsBenefits revPointsBenefits = (RevPointsBenefits) obj2;
        return Intrinsics.f(this.f83961a, revPointsBenefits.f83961a) && Intrinsics.f(this.f83962b, revPointsBenefits.f83962b) && Intrinsics.f(this.f83963c, revPointsBenefits.f83963c) && Intrinsics.f(this.d, revPointsBenefits.d) && Intrinsics.f(this.e, revPointsBenefits.e) && Intrinsics.f(this.f, revPointsBenefits.f) && Intrinsics.f(this.f83964g, revPointsBenefits.f83964g) && Intrinsics.f(this.f83965h, revPointsBenefits.f83965h) && Intrinsics.f(this.i, revPointsBenefits.i) && Intrinsics.f(this.f83966j, revPointsBenefits.f83966j) && Intrinsics.f(this.k, revPointsBenefits.k) && Intrinsics.f(this.f83967l, revPointsBenefits.f83967l) && Intrinsics.f(this.f83968m, revPointsBenefits.f83968m);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f83961a.hashCode() * 31, 31, this.f83962b), 31, this.f83963c);
        d dVar = this.d;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RevPointsBoosterSummary revPointsBoosterSummary = this.f83964g;
        int iC2 = p.a.c((iHashCode3 + (revPointsBoosterSummary == null ? 0 : revPointsBoosterSummary.hashCode())) * 31, 31, this.f83965h);
        RevPointsYearlySavings revPointsYearlySavings = this.i;
        int iHashCode4 = (iC2 + (revPointsYearlySavings == null ? 0 : revPointsYearlySavings.hashCode())) * 31;
        d dVar2 = this.f83966j;
        int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        String str3 = this.k;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d dVar3 = this.f83967l;
        int iHashCode7 = (iHashCode6 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        d dVar4 = this.f83968m;
        return iHashCode7 + (dVar4 != null ? dVar4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f83961a);
        dest.writeString(this.f83962b);
        dest.writeString(this.f83963c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        RevPointsBoosterSummary revPointsBoosterSummary = this.f83964g;
        if (revPointsBoosterSummary == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsBoosterSummary.writeToParcel(dest, i);
        }
        dest.writeString(this.f83965h);
        RevPointsYearlySavings revPointsYearlySavings = this.i;
        if (revPointsYearlySavings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsYearlySavings.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f83966j);
        dest.writeString(this.k);
        dest.writeSerializable(this.f83967l);
        dest.writeSerializable(this.f83968m);
    }
}
