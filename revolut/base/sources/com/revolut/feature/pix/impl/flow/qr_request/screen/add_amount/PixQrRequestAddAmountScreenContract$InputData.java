package com.revolut.feature.pix.impl.flow.qr_request.screen.add_amount;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_request/screen/add_amount/PixQrRequestAddAmountScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrRequestAddAmountScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrRequestAddAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80724b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrRequestAddAmountScreenContract$InputData((d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrRequestAddAmountScreenContract$InputData[i];
        }
    }

    public PixQrRequestAddAmountScreenContract$InputData(d dVar, String str) {
        this.f80723a = dVar;
        this.f80724b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrRequestAddAmountScreenContract$InputData)) {
            return false;
        }
        PixQrRequestAddAmountScreenContract$InputData pixQrRequestAddAmountScreenContract$InputData = (PixQrRequestAddAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80723a, pixQrRequestAddAmountScreenContract$InputData.f80723a) && Intrinsics.f(this.f80724b, pixQrRequestAddAmountScreenContract$InputData.f80724b);
    }

    public final int hashCode() {
        d dVar = this.f80723a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        String str = this.f80724b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80723a);
        dest.writeString(this.f80724b);
    }

    public PixQrRequestAddAmountScreenContract$InputData() {
        this(null, null);
    }
}
