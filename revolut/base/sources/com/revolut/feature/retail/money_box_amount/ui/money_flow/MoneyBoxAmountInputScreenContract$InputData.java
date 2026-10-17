package com.revolut.feature.retail.money_box_amount.ui.money_flow;

import android.os.Parcel;
import android.os.Parcelable;
import ccb.k;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/retail/money_box_amount/ui/money_flow/MoneyBoxAmountInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_money_box_amount_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyBoxAmountInputScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyBoxAmountInputScreenContract$UiData f82768c;
    public final k d;
    public final TransferScheduleData e;
    public final Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AnalyticsProduct f82769g;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<MoneyBoxAmountInputScreenContract$InputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.retail.money_box_amount.ui.money_flow.MoneyBoxAmountInputScreenContract$InputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static MoneyBoxAmountInputScreenContract$InputData a(Companion companion, String id10, String currencyCode, TransferScheduleData scheduledData, long j2, AnalyticsProduct.Retail analyticsProduct) {
            companion.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(scheduledData, "scheduledData");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            return new MoneyBoxAmountInputScreenContract$InputData(id10, currencyCode, new MoneyBoxAmountInputScreenContract$UiData(new TextLocalisedClause(R$string.common_action_done, null, null, 14), new TextLocalisedClause(com.revolut.feature.vaults.R$string.moneyboxes_recurring_savings_title, null, null, 14), false, true, false), k.INTO, scheduledData, Long.valueOf(j2), analyticsProduct);
        }

        public static MoneyBoxAmountInputScreenContract$InputData b(String id10, String currencyCode, AnalyticsProduct.Retail analyticsProduct) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
            return new MoneyBoxAmountInputScreenContract$InputData(id10, currencyCode, new MoneyBoxAmountInputScreenContract$UiData(new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_core_common_action_withdraw, null, null, 14), new TextLocalisedClause(com.revolut.feature.retail.savings.api.R$string.savings_core_common_action_withdraw, null, null, 14), false, false, true), k.OUT, null, null, analyticsProduct);
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyBoxAmountInputScreenContract$InputData(parcel.readString(), parcel.readString(), MoneyBoxAmountInputScreenContract$UiData.CREATOR.createFromParcel(parcel), k.valueOf(parcel.readString()), (TransferScheduleData) parcel.readParcelable(MoneyBoxAmountInputScreenContract$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (AnalyticsProduct) parcel.readParcelable(MoneyBoxAmountInputScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyBoxAmountInputScreenContract$InputData[i];
        }
    }

    public MoneyBoxAmountInputScreenContract$InputData(String id10, String currencyCode, MoneyBoxAmountInputScreenContract$UiData uiData, k moneyFlowType, TransferScheduleData transferScheduleData, Long l2, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        Intrinsics.checkNotNullParameter(moneyFlowType, "moneyFlowType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f82766a = id10;
        this.f82767b = currencyCode;
        this.f82768c = uiData;
        this.d = moneyFlowType;
        this.e = transferScheduleData;
        this.f = l2;
        this.f82769g = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyBoxAmountInputScreenContract$InputData)) {
            return false;
        }
        MoneyBoxAmountInputScreenContract$InputData moneyBoxAmountInputScreenContract$InputData = (MoneyBoxAmountInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f82766a, moneyBoxAmountInputScreenContract$InputData.f82766a) && Intrinsics.f(this.f82767b, moneyBoxAmountInputScreenContract$InputData.f82767b) && Intrinsics.f(this.f82768c, moneyBoxAmountInputScreenContract$InputData.f82768c) && this.d == moneyBoxAmountInputScreenContract$InputData.d && Intrinsics.f(this.e, moneyBoxAmountInputScreenContract$InputData.e) && Intrinsics.f(this.f, moneyBoxAmountInputScreenContract$InputData.f) && Intrinsics.f(this.f82769g, moneyBoxAmountInputScreenContract$InputData.f82769g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f82768c.hashCode() + a.c(this.f82766a.hashCode() * 31, 31, this.f82767b)) * 31)) * 31;
        TransferScheduleData transferScheduleData = this.e;
        int iHashCode2 = (iHashCode + (transferScheduleData == null ? 0 : transferScheduleData.hashCode())) * 31;
        Long l2 = this.f;
        return this.f82769g.hashCode() + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82766a);
        dest.writeString(this.f82767b);
        this.f82768c.writeToParcel(dest, i);
        dest.writeString(this.d.name());
        dest.writeParcelable(this.e, i);
        Long l2 = this.f;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeParcelable(this.f82769g, i);
    }
}
