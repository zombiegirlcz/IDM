package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import ip0.v7;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m1c.s1;
import m1c.t1;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsTransaction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsTransaction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsTransaction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f84055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f84056c;
    public final long d;
    public final String e;
    public final f1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s1 f84057g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f84058h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RevPointsTransactionIconsUrl f84059j;
    public final RevPointsTransactionExchangeDetails k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RevPointsTransactionExchangeAmount f84060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f84061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f84062n;
    public final RevPointsTransactionExchangeDetails o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevPointsTransactionExchangeDetails f84063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f84064q;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsTransaction(parcel.readString(), t1.valueOf(parcel.readString()), RevPoints.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : f1.valueOf(parcel.readString()), s1.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RevPointsTransactionIconsUrl.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RevPointsTransactionExchangeDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RevPointsTransactionExchangeAmount.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RevPointsTransactionExchangeDetails.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RevPointsTransactionExchangeDetails.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsTransaction[i];
        }
    }

    public RevPointsTransaction(String pointsTransactionId, t1 type, RevPoints points, long j2, String str, f1 f1Var, s1 state, String description, String str2, RevPointsTransactionIconsUrl revPointsTransactionIconsUrl, RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails, RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount, String str3, String str4, RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2, RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails3) {
        Intrinsics.checkNotNullParameter(pointsTransactionId, "pointsTransactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f84054a = pointsTransactionId;
        this.f84055b = type;
        this.f84056c = points;
        this.d = j2;
        this.e = str;
        this.f = f1Var;
        this.f84057g = state;
        this.f84058h = description;
        this.i = str2;
        this.f84059j = revPointsTransactionIconsUrl;
        this.k = revPointsTransactionExchangeDetails;
        this.f84060l = revPointsTransactionExchangeAmount;
        this.f84061m = str3;
        this.f84062n = str4;
        this.o = revPointsTransactionExchangeDetails2;
        this.f84063p = revPointsTransactionExchangeDetails3;
        String[] elements = {str2, description, state.name(), type.name(), f1Var != null ? f1Var.name() : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String lowerCase = d0.k0(d.L(elements), " ", null, null, 0, null, 62).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f84064q = lowerCase;
    }

    public static RevPointsTransaction a(RevPointsTransaction revPointsTransaction, f1 f1Var) {
        String pointsTransactionId = revPointsTransaction.f84054a;
        t1 type = revPointsTransaction.f84055b;
        RevPoints points = revPointsTransaction.f84056c;
        long j2 = revPointsTransaction.d;
        String str = revPointsTransaction.e;
        s1 state = revPointsTransaction.f84057g;
        String description = revPointsTransaction.f84058h;
        String str2 = revPointsTransaction.i;
        RevPointsTransactionIconsUrl revPointsTransactionIconsUrl = revPointsTransaction.f84059j;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails = revPointsTransaction.k;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = revPointsTransaction.f84060l;
        String str3 = revPointsTransaction.f84061m;
        String str4 = revPointsTransaction.f84062n;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2 = revPointsTransaction.o;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails3 = revPointsTransaction.f84063p;
        revPointsTransaction.getClass();
        Intrinsics.checkNotNullParameter(pointsTransactionId, "pointsTransactionId");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(description, "description");
        return new RevPointsTransaction(pointsTransactionId, type, points, j2, str, f1Var, state, description, str2, revPointsTransactionIconsUrl, revPointsTransactionExchangeDetails, revPointsTransactionExchangeAmount, str3, str4, revPointsTransactionExchangeDetails2, revPointsTransactionExchangeDetails3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF84054a() {
        return this.f84054a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsTransaction)) {
            return false;
        }
        RevPointsTransaction revPointsTransaction = (RevPointsTransaction) obj2;
        return Intrinsics.f(this.f84054a, revPointsTransaction.f84054a) && this.f84055b == revPointsTransaction.f84055b && Intrinsics.f(this.f84056c, revPointsTransaction.f84056c) && this.d == revPointsTransaction.d && Intrinsics.f(this.e, revPointsTransaction.e) && this.f == revPointsTransaction.f && this.f84057g == revPointsTransaction.f84057g && Intrinsics.f(this.f84058h, revPointsTransaction.f84058h) && Intrinsics.f(this.i, revPointsTransaction.i) && Intrinsics.f(this.f84059j, revPointsTransaction.f84059j) && Intrinsics.f(this.k, revPointsTransaction.k) && Intrinsics.f(this.f84060l, revPointsTransaction.f84060l) && Intrinsics.f(this.f84061m, revPointsTransaction.f84061m) && Intrinsics.f(this.f84062n, revPointsTransaction.f84062n) && Intrinsics.f(this.o, revPointsTransaction.o) && Intrinsics.f(this.f84063p, revPointsTransaction.f84063p);
    }

    public final int hashCode() {
        int iC = a0.d.c(v7.c((this.f84055b.hashCode() + (this.f84054a.hashCode() * 31)) * 31, 31, this.f84056c.f83960a), 31, this.d);
        String str = this.e;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        f1 f1Var = this.f;
        int iC2 = p.a.c((this.f84057g.hashCode() + ((iHashCode + (f1Var == null ? 0 : f1Var.hashCode())) * 31)) * 31, 31, this.f84058h);
        String str2 = this.i;
        int iHashCode2 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        RevPointsTransactionIconsUrl revPointsTransactionIconsUrl = this.f84059j;
        int iHashCode3 = (iHashCode2 + (revPointsTransactionIconsUrl == null ? 0 : revPointsTransactionIconsUrl.hashCode())) * 31;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails = this.k;
        int iHashCode4 = (iHashCode3 + (revPointsTransactionExchangeDetails == null ? 0 : revPointsTransactionExchangeDetails.hashCode())) * 31;
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = this.f84060l;
        int iHashCode5 = (iHashCode4 + (revPointsTransactionExchangeAmount == null ? 0 : revPointsTransactionExchangeAmount.hashCode())) * 31;
        String str3 = this.f84061m;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f84062n;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2 = this.o;
        int iHashCode8 = (iHashCode7 + (revPointsTransactionExchangeDetails2 == null ? 0 : revPointsTransactionExchangeDetails2.hashCode())) * 31;
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails3 = this.f84063p;
        return iHashCode8 + (revPointsTransactionExchangeDetails3 != null ? revPointsTransactionExchangeDetails3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84054a);
        dest.writeString(this.f84055b.name());
        this.f84056c.writeToParcel(dest, i);
        dest.writeLong(this.d);
        dest.writeString(this.e);
        f1 f1Var = this.f;
        if (f1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(f1Var.name());
        }
        dest.writeString(this.f84057g.name());
        dest.writeString(this.f84058h);
        dest.writeString(this.i);
        RevPointsTransactionIconsUrl revPointsTransactionIconsUrl = this.f84059j;
        if (revPointsTransactionIconsUrl == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionIconsUrl.writeToParcel(dest, i);
        }
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails = this.k;
        if (revPointsTransactionExchangeDetails == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeDetails.writeToParcel(dest, i);
        }
        RevPointsTransactionExchangeAmount revPointsTransactionExchangeAmount = this.f84060l;
        if (revPointsTransactionExchangeAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeAmount.writeToParcel(dest, i);
        }
        dest.writeString(this.f84061m);
        dest.writeString(this.f84062n);
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails2 = this.o;
        if (revPointsTransactionExchangeDetails2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeDetails2.writeToParcel(dest, i);
        }
        RevPointsTransactionExchangeDetails revPointsTransactionExchangeDetails3 = this.f84063p;
        if (revPointsTransactionExchangeDetails3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsTransactionExchangeDetails3.writeToParcel(dest, i);
        }
    }
}
