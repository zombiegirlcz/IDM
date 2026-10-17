package com.revolut.feature.wealth.ui.api.navigation.holdings;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/holdings/CashHoldingsSelectorOutputData;", "Laii/r;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CashHoldingsSelectorOutputData implements r, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CashHoldingsSelectorOutputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95935a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CashHoldingsSelectorOutputData((b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashHoldingsSelectorOutputData[i];
        }
    }

    public CashHoldingsSelectorOutputData(b cashHolding) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        this.f95935a = cashHolding;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CashHoldingsSelectorOutputData) && Intrinsics.f(this.f95935a, ((CashHoldingsSelectorOutputData) obj2).f95935a);
    }

    public final int hashCode() {
        return this.f95935a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95935a);
    }
}
