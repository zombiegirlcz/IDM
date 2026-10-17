package com.revolut.feature.invest.smart_notifications.impl.ui.screen.insight_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/invest/smart_notifications/impl/ui/screen/insight_details/InsightDetailsBottomSheetContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InsightDetailsBottomSheetContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InsightDetailsBottomSheetContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstrumentTicker f76450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f76451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f76452c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InsightDetailsBottomSheetContract$InputData((InstrumentTicker) parcel.readParcelable(InsightDetailsBottomSheetContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(InsightDetailsBottomSheetContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(InsightDetailsBottomSheetContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InsightDetailsBottomSheetContract$InputData[i];
        }
    }

    public InsightDetailsBottomSheetContract$InputData(InstrumentTicker instrumentTicker, Clause title, Clause description) {
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f76450a = instrumentTicker;
        this.f76451b = title;
        this.f76452c = description;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InsightDetailsBottomSheetContract$InputData)) {
            return false;
        }
        InsightDetailsBottomSheetContract$InputData insightDetailsBottomSheetContract$InputData = (InsightDetailsBottomSheetContract$InputData) obj2;
        return Intrinsics.f(this.f76450a, insightDetailsBottomSheetContract$InputData.f76450a) && Intrinsics.f(this.f76451b, insightDetailsBottomSheetContract$InputData.f76451b) && Intrinsics.f(this.f76452c, insightDetailsBottomSheetContract$InputData.f76452c);
    }

    public final int hashCode() {
        return this.f76452c.hashCode() + p.a.a(this.f76450a.hashCode() * 31, 31, this.f76451b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f76450a, i);
        dest.writeParcelable(this.f76451b, i);
        dest.writeParcelable(this.f76452c, i);
    }
}
