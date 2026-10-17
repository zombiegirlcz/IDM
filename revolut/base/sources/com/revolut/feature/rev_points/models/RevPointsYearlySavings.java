package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsYearlySavings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsYearlySavings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsYearlySavings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f84076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84078c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevPointsYearlySaving.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RevPointsYearlySavings(dVar, i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsYearlySavings[i];
        }
    }

    public RevPointsYearlySavings(d monthlySpent, int i, ArrayList savings) {
        Intrinsics.checkNotNullParameter(monthlySpent, "monthlySpent");
        Intrinsics.checkNotNullParameter(savings, "savings");
        this.f84076a = monthlySpent;
        this.f84077b = i;
        this.f84078c = savings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsYearlySavings)) {
            return false;
        }
        RevPointsYearlySavings revPointsYearlySavings = (RevPointsYearlySavings) obj2;
        return Intrinsics.f(this.f84076a, revPointsYearlySavings.f84076a) && this.f84077b == revPointsYearlySavings.f84077b && this.f84078c.equals(revPointsYearlySavings.f84078c);
    }

    public final int hashCode() {
        return this.f84078c.hashCode() + j6.a.b(this.f84077b, this.f84076a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84076a);
        dest.writeInt(this.f84077b);
        Iterator itY = j6.a.y(this.f84078c, dest);
        while (itY.hasNext()) {
            ((RevPointsYearlySaving) itY.next()).writeToParcel(dest, i);
        }
    }
}
