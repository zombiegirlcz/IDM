package com.revolut.feature.apm.multibanco.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoExternalEnrollmentFlowInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoExternalEnrollmentFlowInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultibancoExternalEnrollmentFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62544b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoExternalEnrollmentFlowInputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoExternalEnrollmentFlowInputData[i];
        }
    }

    public MultibancoExternalEnrollmentFlowInputData(String token, String callbackUrl) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
        this.f62543a = token;
        this.f62544b = callbackUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoExternalEnrollmentFlowInputData)) {
            return false;
        }
        MultibancoExternalEnrollmentFlowInputData multibancoExternalEnrollmentFlowInputData = (MultibancoExternalEnrollmentFlowInputData) obj2;
        return Intrinsics.f(this.f62543a, multibancoExternalEnrollmentFlowInputData.f62543a) && Intrinsics.f(this.f62544b, multibancoExternalEnrollmentFlowInputData.f62544b);
    }

    public final int hashCode() {
        return this.f62544b.hashCode() + (this.f62543a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62543a);
        dest.writeString(this.f62544b);
    }
}
