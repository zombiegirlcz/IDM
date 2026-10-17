package com.revolut.core.backend_flow.photo.selfserve.selfie.common.selfiewithcard.selfiecamera;

import android.os.Parcel;
import android.os.Parcelable;
import kc0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/core/backend_flow/photo/selfserve/selfie/common/selfiewithcard/selfiecamera/SelfieCameraContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_photo_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelfieCameraContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SelfieCameraContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f51301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51303c;
    public final d d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelfieCameraContract$Configuration(parcel.readString(), parcel.readString(), parcel.readInt() != 0, d.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelfieCameraContract$Configuration[i];
        }
    }

    public SelfieCameraContract$Configuration(String cardId, String alertId, boolean z, d photoType, String flowName) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(alertId, "alertId");
        Intrinsics.checkNotNullParameter(photoType, "photoType");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        this.f51301a = cardId;
        this.f51302b = alertId;
        this.f51303c = z;
        this.d = photoType;
        this.e = flowName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelfieCameraContract$Configuration)) {
            return false;
        }
        SelfieCameraContract$Configuration selfieCameraContract$Configuration = (SelfieCameraContract$Configuration) obj2;
        return Intrinsics.f(this.f51301a, selfieCameraContract$Configuration.f51301a) && Intrinsics.f(this.f51302b, selfieCameraContract$Configuration.f51302b) && this.f51303c == selfieCameraContract$Configuration.f51303c && this.d == selfieCameraContract$Configuration.d && Intrinsics.f(this.e, selfieCameraContract$Configuration.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + j6.a.c(p.a.c(this.f51301a.hashCode() * 31, 31, this.f51302b), 31, this.f51303c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f51301a);
        dest.writeString(this.f51302b);
        dest.writeInt(this.f51303c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeString(this.e);
    }
}
