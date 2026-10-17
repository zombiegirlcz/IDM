package com.revolut.feature.pix.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pix/api/model/PixBeneficiary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixBeneficiary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixBeneficiary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f5j.a f80397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80398b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixBeneficiary((f5j.a) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixBeneficiary[i];
        }
    }

    public PixBeneficiary(f5j.a beneficiary, String str) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f80397a = beneficiary;
        this.f80398b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixBeneficiary)) {
            return false;
        }
        PixBeneficiary pixBeneficiary = (PixBeneficiary) obj2;
        return Intrinsics.f(this.f80397a, pixBeneficiary.f80397a) && Intrinsics.f(this.f80398b, pixBeneficiary.f80398b);
    }

    public final int hashCode() {
        int iHashCode = this.f80397a.hashCode() * 31;
        String str = this.f80398b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80397a);
        dest.writeString(this.f80398b);
    }
}
