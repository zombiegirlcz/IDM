package com.revolut.feature.wealth.ui.api.currencychanger.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.SelectedCurrencyInfo;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kih.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/currencychanger/kompot/WealthCurrencyChangerDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lkih/d;", "", "toString", "()Ljava/lang/String;", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthCurrencyChangerDescriptor implements ParcelableControllerDescriptor<d> {

    @NotNull
    public static final Parcelable.Creator<WealthCurrencyChangerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectedCurrencyInfo f95900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95901b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthCurrencyChangerDescriptor((SelectedCurrencyInfo) parcel.readParcelable(WealthCurrencyChangerDescriptor.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthCurrencyChangerDescriptor[i];
        }
    }

    public WealthCurrencyChangerDescriptor(SelectedCurrencyInfo selectedCurrencyInfo, boolean z) {
        this.f95900a = selectedCurrencyInfo;
        this.f95901b = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SelectedCurrencyInfo getF95900a() {
        return this.f95900a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthCurrencyChangerDescriptor)) {
            return false;
        }
        WealthCurrencyChangerDescriptor wealthCurrencyChangerDescriptor = (WealthCurrencyChangerDescriptor) obj2;
        return Intrinsics.f(this.f95900a, wealthCurrencyChangerDescriptor.f95900a) && this.f95901b == wealthCurrencyChangerDescriptor.f95901b;
    }

    public final int hashCode() {
        SelectedCurrencyInfo selectedCurrencyInfo = this.f95900a;
        return Boolean.hashCode(this.f95901b) + ((selectedCurrencyInfo == null ? 0 : selectedCurrencyInfo.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f95900a, i);
        dest.writeInt(this.f95901b ? 1 : 0);
    }
}
