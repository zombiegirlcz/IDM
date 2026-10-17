package com.revolut.feature.wealth.ui.api.navigation.cash_balance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kel.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pih.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/wealth/ui/api/navigation/cash_balance/UnsettledDialogInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "pih/j", "feature_wealth_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UnsettledDialogInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<UnsettledDialogInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f95927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f95928b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnsettledDialogInputData((b) parcel.readSerializable(), j.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnsettledDialogInputData[i];
        }
    }

    public UnsettledDialogInputData(b cashHolding, j configuration) {
        Intrinsics.checkNotNullParameter(cashHolding, "cashHolding");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f95927a = cashHolding;
        this.f95928b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UnsettledDialogInputData)) {
            return false;
        }
        UnsettledDialogInputData unsettledDialogInputData = (UnsettledDialogInputData) obj2;
        return Intrinsics.f(this.f95927a, unsettledDialogInputData.f95927a) && this.f95928b == unsettledDialogInputData.f95928b;
    }

    public final int hashCode() {
        return this.f95928b.hashCode() + (this.f95927a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f95927a);
        dest.writeString(this.f95928b.name());
    }
}
