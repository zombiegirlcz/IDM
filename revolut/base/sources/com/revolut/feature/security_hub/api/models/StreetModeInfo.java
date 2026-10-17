package com.revolut.feature.security_hub.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/api/models/StreetModeInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_security_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StreetModeInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StreetModeInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f85423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f85424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StreetModeMinimumAmount f85425c;
    public final ArrayList d;
    public final List e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            StreetModeMinimumAmount streetModeMinimumAmountCreateFromParcel = StreetModeMinimumAmount.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(StreetModeTrustedLocation.CREATOR, parcel, arrayList2, iA2, 1);
            }
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                int iA3 = 0;
                while (iA3 != i2) {
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(StreetModeTrustedWifi.CREATOR, parcel, arrayList, iA3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i3 = parcel.readInt();
                arrayList3 = new ArrayList(i3);
                while (iA != i3) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(StreetModeDelayDuration.CREATOR, parcel, arrayList3, iA, 1);
                }
            }
            return new StreetModeInfo(z, string, streetModeMinimumAmountCreateFromParcel, arrayList2, arrayList, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StreetModeInfo[i];
        }
    }

    public StreetModeInfo(boolean z, String description, StreetModeMinimumAmount minimumAmount, ArrayList trustedLocations, List list, List list2) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(minimumAmount, "minimumAmount");
        Intrinsics.checkNotNullParameter(trustedLocations, "trustedLocations");
        this.f85423a = z;
        this.f85424b = description;
        this.f85425c = minimumAmount;
        this.d = trustedLocations;
        this.e = list;
        this.f = list2;
    }

    public static StreetModeInfo a(StreetModeInfo streetModeInfo, boolean z, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = streetModeInfo.f85423a;
        }
        boolean z3 = z;
        String description = streetModeInfo.f85424b;
        StreetModeMinimumAmount minimumAmount = streetModeInfo.f85425c;
        ArrayList trustedLocations = streetModeInfo.d;
        List list = streetModeInfo.e;
        List list2 = arrayList;
        if ((i & 32) != 0) {
            list2 = streetModeInfo.f;
        }
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(minimumAmount, "minimumAmount");
        Intrinsics.checkNotNullParameter(trustedLocations, "trustedLocations");
        return new StreetModeInfo(z3, description, minimumAmount, trustedLocations, list, list2);
    }

    public final StreetModeDelayDuration b() {
        Object obj2 = null;
        List list = this.f;
        if (list == null) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (((StreetModeDelayDuration) next).f) {
                obj2 = next;
                break;
            }
        }
        return (StreetModeDelayDuration) obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StreetModeInfo)) {
            return false;
        }
        StreetModeInfo streetModeInfo = (StreetModeInfo) obj2;
        return this.f85423a == streetModeInfo.f85423a && Intrinsics.f(this.f85424b, streetModeInfo.f85424b) && Intrinsics.f(this.f85425c, streetModeInfo.f85425c) && this.d.equals(streetModeInfo.d) && Intrinsics.f(this.e, streetModeInfo.e) && Intrinsics.f(this.f, streetModeInfo.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (this.f85425c.hashCode() + p.a.c(Boolean.hashCode(this.f85423a) * 31, 31, this.f85424b)) * 31, 31);
        List list = this.e;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f85423a ? 1 : 0);
        dest.writeString(this.f85424b);
        this.f85425c.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((StreetModeTrustedLocation) itY.next()).writeToParcel(dest, i);
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((StreetModeTrustedWifi) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.f;
        if (list2 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ2 = v0.a.q(dest, 1, list2);
        while (itQ2.hasNext()) {
            ((StreetModeDelayDuration) itQ2.next()).writeToParcel(dest, i);
        }
    }
}
