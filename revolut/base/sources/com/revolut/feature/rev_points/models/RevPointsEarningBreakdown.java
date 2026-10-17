package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsEarningBreakdown;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsEarningBreakdown implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsEarningBreakdown> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsEarningRate f83973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f83974c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            RevPointsEarningRate revPointsEarningRateCreateFromParcel = RevPointsEarningRate.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevPointsEarningRate.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RevPointsEarningBreakdown(z, revPointsEarningRateCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsEarningBreakdown[i];
        }
    }

    public RevPointsEarningBreakdown(boolean z, RevPointsEarningRate currentRate, List rates) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f83972a = z;
        this.f83973b = currentRate;
        this.f83974c = rates;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsEarningBreakdown)) {
            return false;
        }
        RevPointsEarningBreakdown revPointsEarningBreakdown = (RevPointsEarningBreakdown) obj2;
        return this.f83972a == revPointsEarningBreakdown.f83972a && Intrinsics.f(this.f83973b, revPointsEarningBreakdown.f83973b) && Intrinsics.f(this.f83974c, revPointsEarningBreakdown.f83974c);
    }

    public final int hashCode() {
        return this.f83974c.hashCode() + ((this.f83973b.hashCode() + (Boolean.hashCode(this.f83972a) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f83972a ? 1 : 0);
        this.f83973b.writeToParcel(dest, i);
        Iterator itV = p.a.v(this.f83974c, dest);
        while (itV.hasNext()) {
            ((RevPointsEarningRate) itV.next()).writeToParcel(dest, i);
        }
    }
}
