package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/select_autopay_method_v3/SelectAutopayMethodV3ScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAutopayMethodV3ScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectAutopayMethodV3ScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAutopayMethodV3ScreenContract$SelectAutopayConfig f68655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f68656b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAutopayMethodV3ScreenContract$InputData(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig.CREATOR.createFromParcel(parcel), (AnalyticsContext) parcel.readParcelable(SelectAutopayMethodV3ScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAutopayMethodV3ScreenContract$InputData[i];
        }
    }

    public SelectAutopayMethodV3ScreenContract$InputData(SelectAutopayMethodV3ScreenContract$SelectAutopayConfig config, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f68655a = config;
        this.f68656b = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAutopayMethodV3ScreenContract$InputData)) {
            return false;
        }
        SelectAutopayMethodV3ScreenContract$InputData selectAutopayMethodV3ScreenContract$InputData = (SelectAutopayMethodV3ScreenContract$InputData) obj2;
        return Intrinsics.f(this.f68655a, selectAutopayMethodV3ScreenContract$InputData.f68655a) && Intrinsics.f(this.f68656b, selectAutopayMethodV3ScreenContract$InputData.f68656b);
    }

    public final int hashCode() {
        int iHashCode = this.f68655a.hashCode() * 31;
        AnalyticsContext analyticsContext = this.f68656b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f68655a.writeToParcel(dest, i);
        dest.writeParcelable(this.f68656b, i);
    }
}
