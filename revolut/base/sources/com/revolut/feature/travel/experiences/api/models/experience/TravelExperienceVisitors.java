package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceVisitors;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceVisitors implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceVisitors> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f92853c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i3);
            int iA = 0;
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperienceAgeBand.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TravelExperienceVisitors(arrayList, i, i2, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceVisitors[i];
        }
    }

    public TravelExperienceVisitors(ArrayList ageBands, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(ageBands, "ageBands");
        this.f92851a = i;
        this.f92852b = i2;
        this.f92853c = ageBands;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceVisitors)) {
            return false;
        }
        TravelExperienceVisitors travelExperienceVisitors = (TravelExperienceVisitors) obj2;
        return this.f92851a == travelExperienceVisitors.f92851a && this.f92852b == travelExperienceVisitors.f92852b && this.f92853c.equals(travelExperienceVisitors.f92853c) && this.d == travelExperienceVisitors.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92853c, j6.a.b(this.f92852b, Integer.hashCode(this.f92851a) * 31, 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f92851a);
        dest.writeInt(this.f92852b);
        Iterator itY = j6.a.y(this.f92853c, dest);
        while (itY.hasNext()) {
            ((TravelExperienceAgeBand) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
