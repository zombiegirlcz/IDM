package com.revolut.feature.revolutpay.impl.ui.nativetopup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/impl/ui/nativetopup/RevolutPayTopUpScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayTopUpScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutPayTopUpScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84508b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayTopUpScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayTopUpScreenContract$InputData[i];
        }
    }

    public RevolutPayTopUpScreenContract$InputData(String str, String str2) {
        this.f84507a = str;
        this.f84508b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutPayTopUpScreenContract$InputData)) {
            return false;
        }
        RevolutPayTopUpScreenContract$InputData revolutPayTopUpScreenContract$InputData = (RevolutPayTopUpScreenContract$InputData) obj2;
        return Intrinsics.f(this.f84507a, revolutPayTopUpScreenContract$InputData.f84507a) && Intrinsics.f(this.f84508b, revolutPayTopUpScreenContract$InputData.f84508b);
    }

    public final int hashCode() {
        String str = this.f84507a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84508b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84507a);
        dest.writeString(this.f84508b);
    }
}
