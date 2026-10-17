package com.revolut.feature.three_ds_verification.impl.ui.sceen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/three_ds_verification/impl/ui/sceen/ThreeDsVerificationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ThreeDsVerificationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ThreeDsVerificationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f90407b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ThreeDsVerificationScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ThreeDsVerificationScreenContract$InputData[i];
        }
    }

    public ThreeDsVerificationScreenContract$InputData(String str, boolean z) {
        this.f90406a = str;
        this.f90407b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ThreeDsVerificationScreenContract$InputData)) {
            return false;
        }
        ThreeDsVerificationScreenContract$InputData threeDsVerificationScreenContract$InputData = (ThreeDsVerificationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90406a, threeDsVerificationScreenContract$InputData.f90406a) && this.f90407b == threeDsVerificationScreenContract$InputData.f90407b;
    }

    public final int hashCode() {
        String str = this.f90406a;
        return Boolean.hashCode(this.f90407b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90406a);
        dest.writeInt(this.f90407b ? 1 : 0);
    }

    public ThreeDsVerificationScreenContract$InputData() {
        this(null, false);
    }
}
