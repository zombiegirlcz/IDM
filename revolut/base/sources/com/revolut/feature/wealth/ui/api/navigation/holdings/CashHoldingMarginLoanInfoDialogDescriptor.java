package com.revolut.feature.wealth.ui.api.navigation.holdings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import dii.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/holdings/CashHoldingMarginLoanInfoDialogDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Ldii/g;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashHoldingMarginLoanInfoDialogDescriptor implements ParcelableControllerDescriptor<g> {

    @NotNull
    public static final Parcelable.Creator<CashHoldingMarginLoanInfoDialogDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f95931b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashHoldingMarginLoanInfoDialogDescriptor((b) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashHoldingMarginLoanInfoDialogDescriptor[i];
        }
    }

    public CashHoldingMarginLoanInfoDialogDescriptor(b currentCashHoldingCurrency, b alternativeCashHoldingCurrency) {
        Intrinsics.checkNotNullParameter(currentCashHoldingCurrency, "currentCashHoldingCurrency");
        Intrinsics.checkNotNullParameter(alternativeCashHoldingCurrency, "alternativeCashHoldingCurrency");
        this.f95930a = currentCashHoldingCurrency;
        this.f95931b = alternativeCashHoldingCurrency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getF95931b() {
        return this.f95931b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getF95930a() {
        return this.f95930a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CashHoldingMarginLoanInfoDialogDescriptor)) {
            return false;
        }
        CashHoldingMarginLoanInfoDialogDescriptor cashHoldingMarginLoanInfoDialogDescriptor = (CashHoldingMarginLoanInfoDialogDescriptor) obj2;
        return Intrinsics.f(this.f95930a, cashHoldingMarginLoanInfoDialogDescriptor.f95930a) && Intrinsics.f(this.f95931b, cashHoldingMarginLoanInfoDialogDescriptor.f95931b);
    }

    public final int hashCode() {
        return this.f95931b.hashCode() + (this.f95930a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95930a);
        dest.writeSerializable(this.f95931b);
    }
}
