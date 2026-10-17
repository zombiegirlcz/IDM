package com.revolut.feature.credit.autopay.ui.screen.amount.select_type;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/select_type/SelectAmountTypeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SelectAmountTypeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SelectAmountTypeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ak4.a f68616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f68617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SetAmountFlowContract$UiConfig.SelectAmount f68618c;
    public final AnalyticsContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SelectAmountTypeScreenContract$InputData(parcel.readInt() == 0 ? null : ak4.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? SetAmountFlowContract$UiConfig.SelectAmount.CREATOR.createFromParcel(parcel) : null, (AnalyticsContext) parcel.readParcelable(SelectAmountTypeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SelectAmountTypeScreenContract$InputData[i];
        }
    }

    public SelectAmountTypeScreenContract$InputData(ak4.a aVar, boolean z, SetAmountFlowContract$UiConfig.SelectAmount selectAmount, AnalyticsContext analyticsContext) {
        this.f68616a = aVar;
        this.f68617b = z;
        this.f68618c = selectAmount;
        this.d = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SelectAmountTypeScreenContract$InputData)) {
            return false;
        }
        SelectAmountTypeScreenContract$InputData selectAmountTypeScreenContract$InputData = (SelectAmountTypeScreenContract$InputData) obj2;
        return this.f68616a == selectAmountTypeScreenContract$InputData.f68616a && this.f68617b == selectAmountTypeScreenContract$InputData.f68617b && Intrinsics.f(this.f68618c, selectAmountTypeScreenContract$InputData.f68618c) && Intrinsics.f(this.d, selectAmountTypeScreenContract$InputData.d);
    }

    public final int hashCode() {
        ak4.a aVar = this.f68616a;
        int iC = j6.a.c((aVar == null ? 0 : aVar.hashCode()) * 31, 31, this.f68617b);
        SetAmountFlowContract$UiConfig.SelectAmount selectAmount = this.f68618c;
        int iHashCode = (iC + (selectAmount == null ? 0 : selectAmount.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.d;
        return iHashCode + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ak4.a aVar = this.f68616a;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeInt(this.f68617b ? 1 : 0);
        SetAmountFlowContract$UiConfig.SelectAmount selectAmount = this.f68618c;
        if (selectAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectAmount.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
    }
}
