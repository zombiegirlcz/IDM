package com.revolut.feature.credit.autopay.ui.screen.amount.input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.autopay.ui.screen.amount.flow.SetAmountFlowContract$UiConfig;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/input/InputAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputAmountScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InputAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f68604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsContext f68605c;
    public final InputAmountScreenContract$RepaymentInfo d;
    public final SetAmountFlowContract$UiConfig.InputAmount e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputAmountScreenContract$InputData(parcel.readInt() != 0, (d) parcel.readSerializable(), (AnalyticsContext) parcel.readParcelable(InputAmountScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : InputAmountScreenContract$RepaymentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SetAmountFlowContract$UiConfig.InputAmount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputAmountScreenContract$InputData[i];
        }
    }

    public InputAmountScreenContract$InputData(boolean z, d amount, AnalyticsContext analyticsContext, InputAmountScreenContract$RepaymentInfo inputAmountScreenContract$RepaymentInfo, SetAmountFlowContract$UiConfig.InputAmount inputAmount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f68603a = z;
        this.f68604b = amount;
        this.f68605c = analyticsContext;
        this.d = inputAmountScreenContract$RepaymentInfo;
        this.e = inputAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputAmountScreenContract$InputData)) {
            return false;
        }
        InputAmountScreenContract$InputData inputAmountScreenContract$InputData = (InputAmountScreenContract$InputData) obj2;
        return this.f68603a == inputAmountScreenContract$InputData.f68603a && Intrinsics.f(this.f68604b, inputAmountScreenContract$InputData.f68604b) && Intrinsics.f(this.f68605c, inputAmountScreenContract$InputData.f68605c) && Intrinsics.f(this.d, inputAmountScreenContract$InputData.d) && Intrinsics.f(this.e, inputAmountScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = v7.c(Boolean.hashCode(this.f68603a) * 31, 31, this.f68604b);
        AnalyticsContext analyticsContext = this.f68605c;
        int iA = (iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31;
        InputAmountScreenContract$RepaymentInfo inputAmountScreenContract$RepaymentInfo = this.d;
        int iHashCode = (iA + (inputAmountScreenContract$RepaymentInfo == null ? 0 : inputAmountScreenContract$RepaymentInfo.hashCode())) * 31;
        SetAmountFlowContract$UiConfig.InputAmount inputAmount = this.e;
        return iHashCode + (inputAmount != null ? inputAmount.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f68603a ? 1 : 0);
        dest.writeSerializable(this.f68604b);
        dest.writeParcelable(this.f68605c, i);
        InputAmountScreenContract$RepaymentInfo inputAmountScreenContract$RepaymentInfo = this.d;
        if (inputAmountScreenContract$RepaymentInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputAmountScreenContract$RepaymentInfo.writeToParcel(dest, i);
        }
        SetAmountFlowContract$UiConfig.InputAmount inputAmount = this.e;
        if (inputAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputAmount.writeToParcel(dest, i);
        }
    }
}
