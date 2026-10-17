package com.revolut.feature.apm.multibanco.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoExternalEnrollmentFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/multibanco/api/navigation/MultibancoExternalEnrollmentFlowInputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoExternalEnrollmentFlowDestination extends InternalDestination<MultibancoExternalEnrollmentFlowInputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<MultibancoExternalEnrollmentFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62542c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoExternalEnrollmentFlowDestination(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoExternalEnrollmentFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultibancoExternalEnrollmentFlowDestination(String token, String callbackUrl) {
        super(new MultibancoExternalEnrollmentFlowInputData(token, callbackUrl));
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(callbackUrl, "callbackUrl");
        this.f62541b = token;
        this.f62542c = callbackUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoExternalEnrollmentFlowDestination)) {
            return false;
        }
        MultibancoExternalEnrollmentFlowDestination multibancoExternalEnrollmentFlowDestination = (MultibancoExternalEnrollmentFlowDestination) obj2;
        return Intrinsics.f(this.f62541b, multibancoExternalEnrollmentFlowDestination.f62541b) && Intrinsics.f(this.f62542c, multibancoExternalEnrollmentFlowDestination.f62542c);
    }

    public final int hashCode() {
        return this.f62542c.hashCode() + (this.f62541b.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62541b);
        dest.writeString(this.f62542c);
    }
}
