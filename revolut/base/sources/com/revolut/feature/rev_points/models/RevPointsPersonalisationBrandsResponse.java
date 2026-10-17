package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationBrandsResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationBrandsResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationBrandsResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f84014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f84015b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevPointsPersonalisationBrandOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RevPointsPersonalisationBrandsResponse(i, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationBrandsResponse[i];
        }
    }

    public RevPointsPersonalisationBrandsResponse(int i, ArrayList brands) {
        Intrinsics.checkNotNullParameter(brands, "brands");
        this.f84014a = i;
        this.f84015b = brands;
    }

    public static RevPointsPersonalisationBrandsResponse a(RevPointsPersonalisationBrandsResponse revPointsPersonalisationBrandsResponse, ArrayList brands) {
        int i = revPointsPersonalisationBrandsResponse.f84014a;
        revPointsPersonalisationBrandsResponse.getClass();
        Intrinsics.checkNotNullParameter(brands, "brands");
        return new RevPointsPersonalisationBrandsResponse(i, brands);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationBrandsResponse)) {
            return false;
        }
        RevPointsPersonalisationBrandsResponse revPointsPersonalisationBrandsResponse = (RevPointsPersonalisationBrandsResponse) obj2;
        return this.f84014a == revPointsPersonalisationBrandsResponse.f84014a && this.f84015b.equals(revPointsPersonalisationBrandsResponse.f84015b);
    }

    public final int hashCode() {
        return this.f84015b.hashCode() + (Integer.hashCode(this.f84014a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84014a);
        Iterator itY = j6.a.y(this.f84015b, dest);
        while (itY.hasNext()) {
            ((RevPointsPersonalisationBrandOption) itY.next()).writeToParcel(dest, i);
        }
    }
}
