package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/SpareChangeCalculations;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpareChangeCalculations implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpareChangeCalculations> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SpareChangeRate f84084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpareChangeAmount f84085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f84086c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SpareChangeRate spareChangeRateCreateFromParcel = SpareChangeRate.CREATOR.createFromParcel(parcel);
            SpareChangeAmount spareChangeAmountCreateFromParcel = SpareChangeAmount.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SpareChangeCalculation.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SpareChangeCalculations(spareChangeRateCreateFromParcel, spareChangeAmountCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpareChangeCalculations[i];
        }
    }

    public SpareChangeCalculations(SpareChangeRate rate, SpareChangeAmount spent, ArrayList calculations) {
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(spent, "spent");
        Intrinsics.checkNotNullParameter(calculations, "calculations");
        this.f84084a = rate;
        this.f84085b = spent;
        this.f84086c = calculations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpareChangeCalculations)) {
            return false;
        }
        SpareChangeCalculations spareChangeCalculations = (SpareChangeCalculations) obj2;
        return Intrinsics.f(this.f84084a, spareChangeCalculations.f84084a) && Intrinsics.f(this.f84085b, spareChangeCalculations.f84085b) && this.f84086c.equals(spareChangeCalculations.f84086c);
    }

    public final int hashCode() {
        return this.f84086c.hashCode() + ((this.f84085b.hashCode() + (this.f84084a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f84084a.writeToParcel(dest, i);
        this.f84085b.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f84086c, dest);
        while (itY.hasNext()) {
            ((SpareChangeCalculation) itY.next()).writeToParcel(dest, i);
        }
    }
}
