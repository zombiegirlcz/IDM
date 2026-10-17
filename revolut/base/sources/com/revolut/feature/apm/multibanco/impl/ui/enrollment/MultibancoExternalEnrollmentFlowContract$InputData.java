package com.revolut.feature.apm.multibanco.impl.ui.enrollment;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/enrollment/MultibancoExternalEnrollmentFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoExternalEnrollmentFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultibancoExternalEnrollmentFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62576b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoExternalEnrollmentFlowContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoExternalEnrollmentFlowContract$InputData[i];
        }
    }

    public MultibancoExternalEnrollmentFlowContract$InputData(String token, String callbackUrl) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
        this.f62575a = token;
        this.f62576b = callbackUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoExternalEnrollmentFlowContract$InputData)) {
            return false;
        }
        MultibancoExternalEnrollmentFlowContract$InputData multibancoExternalEnrollmentFlowContract$InputData = (MultibancoExternalEnrollmentFlowContract$InputData) obj2;
        return Intrinsics.f(this.f62575a, multibancoExternalEnrollmentFlowContract$InputData.f62575a) && Intrinsics.f(this.f62576b, multibancoExternalEnrollmentFlowContract$InputData.f62576b);
    }

    public final int hashCode() {
        return this.f62576b.hashCode() + (this.f62575a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62575a);
        dest.writeString(this.f62576b);
    }
}
