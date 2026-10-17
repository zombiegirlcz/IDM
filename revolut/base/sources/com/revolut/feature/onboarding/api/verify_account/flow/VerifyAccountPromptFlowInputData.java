package com.revolut.feature.onboarding.api.verify_account.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/verify_account/flow/VerifyAccountPromptFlowInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerifyAccountPromptFlowInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VerifyAccountPromptFlowInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnalyticsProduct f78236a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VerifyAccountPromptFlowInputData((AnalyticsProduct) parcel.readParcelable(VerifyAccountPromptFlowInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VerifyAccountPromptFlowInputData[i];
        }
    }

    public VerifyAccountPromptFlowInputData(AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f78236a = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof VerifyAccountPromptFlowInputData) && Intrinsics.f(this.f78236a, ((VerifyAccountPromptFlowInputData) obj2).f78236a);
    }

    public final int hashCode() {
        return this.f78236a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78236a, i);
    }
}
