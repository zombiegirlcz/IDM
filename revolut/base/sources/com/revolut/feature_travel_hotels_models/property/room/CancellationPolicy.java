package com.revolut.feature_travel_hotels_models.property.room;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_travel_hotels_models/property/room/CancellationPolicy;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CancellationPolicy implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CancellationPolicy> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f98092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f98093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f98094c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CancellationWindow.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CancellationPolicy(arrayList, z, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CancellationPolicy[i];
        }
    }

    public CancellationPolicy(ArrayList windows, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(windows, "windows");
        this.f98092a = z;
        this.f98093b = z3;
        this.f98094c = windows;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CancellationPolicy)) {
            return false;
        }
        CancellationPolicy cancellationPolicy = (CancellationPolicy) obj2;
        return this.f98092a == cancellationPolicy.f98092a && this.f98093b == cancellationPolicy.f98093b && this.f98094c.equals(cancellationPolicy.f98094c);
    }

    public final int hashCode() {
        return this.f98094c.hashCode() + j6.a.c(Boolean.hashCode(this.f98092a) * 31, 31, this.f98093b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98092a ? 1 : 0);
        dest.writeInt(this.f98093b ? 1 : 0);
        Iterator itY = j6.a.y(this.f98094c, dest);
        while (itY.hasNext()) {
            ((CancellationWindow) itY.next()).writeToParcel(dest, i);
        }
    }
}
