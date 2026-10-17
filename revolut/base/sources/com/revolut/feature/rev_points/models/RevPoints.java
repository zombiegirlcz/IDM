package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import j6.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPoints;", "Landroid/os/Parcelable;", "", "Companion", "a", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPoints implements Parcelable, Comparable<RevPoints> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f83960a;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<RevPoints> CREATOR = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi0.b f83959b = new xi0.b(4, "PTS", 6);

    /* JADX INFO: renamed from: com.revolut.feature.rev_points.models.RevPoints$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static RevPoints a(long j2) {
            return new RevPoints(new d(j2, RevPoints.f83959b));
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPoints((d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPoints[i];
        }
    }

    public RevPoints(d money) {
        Intrinsics.checkNotNullParameter(money, "money");
        this.f83960a = money;
        if (!Intrinsics.f(money.f115083b.f306286a, "PTS")) {
            throw new IllegalArgumentException(a.q("RevPoints must wrap PTS currency, got: ", money.f115083b.f306286a).toString());
        }
    }

    public final double J() {
        return b().doubleValue();
    }

    public final int T() {
        return b().intValue();
    }

    public final String W() {
        if (this.f83960a.f115082a == 0) {
            return "0";
        }
        BigDecimal bigDecimalB = b();
        String plainString = (bigDecimalB.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalB.stripTrailingZeros()).toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(RevPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f83960a.compareTo(other.f83960a);
    }

    public final BigDecimal b() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.f83960a.f115082a, 6);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    public final boolean c(RevPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f83960a.e(other.f83960a);
    }

    public final boolean d(RevPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f83960a.h(other.f83960a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f83960a.f(d.e);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevPoints) && Intrinsics.f(this.f83960a, ((RevPoints) obj2).f83960a);
    }

    public final int hashCode() {
        return this.f83960a.hashCode();
    }

    public final RevPoints j(RevPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        d dVar = this.f83960a;
        return new RevPoints(new d(dVar.f115082a - other.f83960a.f115082a, dVar.f115083b));
    }

    public final String toString() {
        String plainString = b().toPlainString();
        Intrinsics.checkNotNullExpressionValue(plainString, "toPlainString(...)");
        return plainString;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f83960a);
    }

    public final RevPoints z(RevPoints other) {
        Intrinsics.checkNotNullParameter(other, "other");
        d dVar = this.f83960a;
        return new RevPoints(new d(dVar.f115082a + other.f83960a.f115082a, dVar.f115083b));
    }
}
