package com.revolut.feature.apm.breb.impl.ui.qr_request.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.alias.Alias;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/breb/impl/ui/qr_request/request/BrebQrRequestScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_breb_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrebQrRequestScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BrebQrRequestScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Alias f61760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f61761b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrebQrRequestScreenContract$InputData((Alias) parcel.readParcelable(BrebQrRequestScreenContract$InputData.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrebQrRequestScreenContract$InputData[i];
        }
    }

    public BrebQrRequestScreenContract$InputData(Alias alias, d dVar) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f61760a = alias;
        this.f61761b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrebQrRequestScreenContract$InputData)) {
            return false;
        }
        BrebQrRequestScreenContract$InputData brebQrRequestScreenContract$InputData = (BrebQrRequestScreenContract$InputData) obj2;
        return Intrinsics.f(this.f61760a, brebQrRequestScreenContract$InputData.f61760a) && Intrinsics.f(this.f61761b, brebQrRequestScreenContract$InputData.f61761b);
    }

    public final int hashCode() {
        int iHashCode = this.f61760a.hashCode() * 31;
        d dVar = this.f61761b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61760a, i);
        dest.writeSerializable(this.f61761b);
    }
}
