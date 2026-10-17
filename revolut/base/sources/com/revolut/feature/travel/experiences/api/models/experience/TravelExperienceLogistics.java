package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceLogistics;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceLogistics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceLogistics> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TravelExperiencePickup f92831c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceLogisticsLocation.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceLogisticsLocation.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new TravelExperienceLogistics(arrayList, arrayList2, parcel.readInt() == 0 ? null : TravelExperiencePickup.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceLogistics[i];
        }
    }

    public TravelExperienceLogistics(List start, List end2, TravelExperiencePickup travelExperiencePickup) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f92829a = start;
        this.f92830b = end2;
        this.f92831c = travelExperiencePickup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceLogistics)) {
            return false;
        }
        TravelExperienceLogistics travelExperienceLogistics = (TravelExperienceLogistics) obj2;
        return Intrinsics.f(this.f92829a, travelExperienceLogistics.f92829a) && Intrinsics.f(this.f92830b, travelExperienceLogistics.f92830b) && Intrinsics.f(this.f92831c, travelExperienceLogistics.f92831c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f92829a.hashCode() * 31, 31, this.f92830b);
        TravelExperiencePickup travelExperiencePickup = this.f92831c;
        return iD + (travelExperiencePickup == null ? 0 : travelExperiencePickup.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f92829a, dest);
        while (itV.hasNext()) {
            ((TravelExperienceLogisticsLocation) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f92830b, dest);
        while (itV2.hasNext()) {
            ((TravelExperienceLogisticsLocation) itV2.next()).writeToParcel(dest, i);
        }
        TravelExperiencePickup travelExperiencePickup = this.f92831c;
        if (travelExperiencePickup == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperiencePickup.writeToParcel(dest, i);
        }
    }
}
