package com.revolut.feature.credit.autopay.ui.screen.select_autopay_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/select_autopay_method/SelectAutopayMethodContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAutopayMethodContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectAutopayMethodContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsContext f68648b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAutopayMethodContract$InputData(parcel.readInt() != 0, (AnalyticsContext) parcel.readParcelable(SelectAutopayMethodContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAutopayMethodContract$InputData[i];
        }
    }

    public SelectAutopayMethodContract$InputData(boolean z, AnalyticsContext analyticsContext) {
        this.f68647a = z;
        this.f68648b = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAutopayMethodContract$InputData)) {
            return false;
        }
        SelectAutopayMethodContract$InputData selectAutopayMethodContract$InputData = (SelectAutopayMethodContract$InputData) obj2;
        return this.f68647a == selectAutopayMethodContract$InputData.f68647a && Intrinsics.f(this.f68648b, selectAutopayMethodContract$InputData.f68648b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f68647a) * 31;
        AnalyticsContext analyticsContext = this.f68648b;
        return iHashCode + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68647a ? 1 : 0);
        dest.writeParcelable(this.f68648b, i);
    }
}
