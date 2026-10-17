package com.revolut.feature.freelancer.impl.ui.sales.qr.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/qr/share/FreelancerQrShareScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerQrShareScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerQrShareScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f74199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74200b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerQrShareScreenContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerQrShareScreenContract$InputData[i];
        }
    }

    public FreelancerQrShareScreenContract$InputData(d dVar, String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        this.f74199a = dVar;
        this.f74200b = qrCodeUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerQrShareScreenContract$InputData)) {
            return false;
        }
        FreelancerQrShareScreenContract$InputData freelancerQrShareScreenContract$InputData = (FreelancerQrShareScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74199a, freelancerQrShareScreenContract$InputData.f74199a) && Intrinsics.f(this.f74200b, freelancerQrShareScreenContract$InputData.f74200b);
    }

    public final int hashCode() {
        d dVar = this.f74199a;
        return this.f74200b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74199a);
        dest.writeString(this.f74200b);
    }
}
