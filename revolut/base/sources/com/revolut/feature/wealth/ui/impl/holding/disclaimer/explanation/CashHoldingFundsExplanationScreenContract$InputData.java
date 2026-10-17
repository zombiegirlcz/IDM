package com.revolut.feature.wealth.ui.impl.holding.disclaimer.explanation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import com.revolut.kompot.common.IOData$Input;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth/ui/impl/holding/disclaimer/explanation/CashHoldingFundsExplanationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashHoldingFundsExplanationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CashHoldingFundsExplanationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f95998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthDisclaimersContract$Disclaimer$Investment f95999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f96000c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashHoldingFundsExplanationScreenContract$InputData((Clause) parcel.readParcelable(CashHoldingFundsExplanationScreenContract$InputData.class.getClassLoader()), (WealthDisclaimersContract$Disclaimer$Investment) parcel.readParcelable(CashHoldingFundsExplanationScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashHoldingFundsExplanationScreenContract$InputData[i];
        }
    }

    public CashHoldingFundsExplanationScreenContract$InputData(Clause title, WealthDisclaimersContract$Disclaimer$Investment disclaimersData, b cashHolding) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(disclaimersData, "disclaimersData");
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f95998a = title;
        this.f95999b = disclaimersData;
        this.f96000c = cashHolding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashHoldingFundsExplanationScreenContract$InputData)) {
            return false;
        }
        CashHoldingFundsExplanationScreenContract$InputData cashHoldingFundsExplanationScreenContract$InputData = (CashHoldingFundsExplanationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f95998a, cashHoldingFundsExplanationScreenContract$InputData.f95998a) && Intrinsics.f(this.f95999b, cashHoldingFundsExplanationScreenContract$InputData.f95999b) && Intrinsics.f(this.f96000c, cashHoldingFundsExplanationScreenContract$InputData.f96000c);
    }

    public final int hashCode() {
        return this.f96000c.hashCode() + ((this.f95999b.hashCode() + (this.f95998a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95998a, i);
        dest.writeParcelable(this.f95999b, i);
        dest.writeSerializable(this.f96000c);
    }
}
