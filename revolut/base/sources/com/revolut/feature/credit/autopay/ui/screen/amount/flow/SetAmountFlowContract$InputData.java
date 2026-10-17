package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit_card.autopay.api.models.CreditScheduledAmountType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetAmountFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SetAmountFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f68586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreditScheduledAmountType f68587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f68588c;
    public final SetAmountFlowContract$RepaymentInfo d;
    public final SetAmountFlowContract$UiConfig e;
    public final AnalyticsContext f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetAmountFlowContract$InputData((b) parcel.readSerializable(), (CreditScheduledAmountType) parcel.readParcelable(SetAmountFlowContract$InputData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : SetAmountFlowContract$RepaymentInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SetAmountFlowContract$UiConfig.CREATOR.createFromParcel(parcel) : null, (AnalyticsContext) parcel.readParcelable(SetAmountFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetAmountFlowContract$InputData[i];
        }
    }

    public SetAmountFlowContract$InputData(b currency, CreditScheduledAmountType creditScheduledAmountType, boolean z, SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo, SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f68586a = currency;
        this.f68587b = creditScheduledAmountType;
        this.f68588c = z;
        this.d = setAmountFlowContract$RepaymentInfo;
        this.e = setAmountFlowContract$UiConfig;
        this.f = analyticsContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetAmountFlowContract$InputData)) {
            return false;
        }
        SetAmountFlowContract$InputData setAmountFlowContract$InputData = (SetAmountFlowContract$InputData) obj2;
        return Intrinsics.f(this.f68586a, setAmountFlowContract$InputData.f68586a) && Intrinsics.f(this.f68587b, setAmountFlowContract$InputData.f68587b) && this.f68588c == setAmountFlowContract$InputData.f68588c && Intrinsics.f(this.d, setAmountFlowContract$InputData.d) && Intrinsics.f(this.e, setAmountFlowContract$InputData.e) && Intrinsics.f(this.f, setAmountFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = this.f68586a.hashCode() * 31;
        CreditScheduledAmountType creditScheduledAmountType = this.f68587b;
        int iC = j6.a.c((iHashCode + (creditScheduledAmountType == null ? 0 : creditScheduledAmountType.hashCode())) * 31, 31, this.f68588c);
        SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = this.d;
        int iHashCode2 = (iC + (setAmountFlowContract$RepaymentInfo == null ? 0 : setAmountFlowContract$RepaymentInfo.hashCode())) * 31;
        SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig = this.e;
        int iHashCode3 = (iHashCode2 + (setAmountFlowContract$UiConfig == null ? 0 : setAmountFlowContract$UiConfig.hashCode())) * 31;
        AnalyticsContext analyticsContext = this.f;
        return iHashCode3 + (analyticsContext != null ? AnalyticsContext.a(analyticsContext.f50296a) : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68586a);
        dest.writeParcelable(this.f68587b, i);
        dest.writeInt(this.f68588c ? 1 : 0);
        SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo = this.d;
        if (setAmountFlowContract$RepaymentInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            setAmountFlowContract$RepaymentInfo.writeToParcel(dest, i);
        }
        SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig = this.e;
        if (setAmountFlowContract$UiConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            setAmountFlowContract$UiConfig.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ SetAmountFlowContract$InputData(b bVar, CreditScheduledAmountType creditScheduledAmountType, boolean z, SetAmountFlowContract$RepaymentInfo setAmountFlowContract$RepaymentInfo, SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig, AnalyticsContext analyticsContext, int i) {
        this(bVar, creditScheduledAmountType, z, (i & 8) != 0 ? null : setAmountFlowContract$RepaymentInfo, (i & 16) != 0 ? null : setAmountFlowContract$UiConfig, (i & 32) != 0 ? null : analyticsContext);
    }
}
