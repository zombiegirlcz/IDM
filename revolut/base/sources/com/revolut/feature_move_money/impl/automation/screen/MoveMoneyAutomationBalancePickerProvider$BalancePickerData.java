package com.revolut.feature_move_money.impl.automation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import c7i.q;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x5i.d;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationBalancePickerProvider$BalancePickerData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyAutomationBalancePickerProvider$BalancePickerData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyAutomationBalancePickerProvider$BalancePickerData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BalanceSelector$InputData f97322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f97323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f97324c;
    public final q d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyAutomationBalancePickerProvider$BalancePickerData((BalanceSelector$InputData) parcel.readParcelable(MoveMoneyAutomationBalancePickerProvider$BalancePickerData.class.getClassLoader()), d.valueOf(parcel.readString()), (AccountWrapper) parcel.readParcelable(MoveMoneyAutomationBalancePickerProvider$BalancePickerData.class.getClassLoader()), q.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyAutomationBalancePickerProvider$BalancePickerData[i];
        }
    }

    public MoveMoneyAutomationBalancePickerProvider$BalancePickerData(BalanceSelector$InputData inputData, d destinationType, AccountWrapper accountWrapper, q position) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(destinationType, "destinationType");
        Intrinsics.checkNotNullParameter(position, "position");
        this.f97322a = inputData;
        this.f97323b = destinationType;
        this.f97324c = accountWrapper;
        this.d = position;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyAutomationBalancePickerProvider$BalancePickerData)) {
            return false;
        }
        MoveMoneyAutomationBalancePickerProvider$BalancePickerData moveMoneyAutomationBalancePickerProvider$BalancePickerData = (MoveMoneyAutomationBalancePickerProvider$BalancePickerData) obj2;
        return Intrinsics.f(this.f97322a, moveMoneyAutomationBalancePickerProvider$BalancePickerData.f97322a) && this.f97323b == moveMoneyAutomationBalancePickerProvider$BalancePickerData.f97323b && Intrinsics.f(this.f97324c, moveMoneyAutomationBalancePickerProvider$BalancePickerData.f97324c) && this.d == moveMoneyAutomationBalancePickerProvider$BalancePickerData.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f97323b.hashCode() + (this.f97322a.hashCode() * 31)) * 31;
        AccountWrapper accountWrapper = this.f97324c;
        return this.d.hashCode() + ((iHashCode + (accountWrapper == null ? 0 : accountWrapper.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97322a, i);
        dest.writeString(this.f97323b.name());
        dest.writeParcelable(this.f97324c, i);
        dest.writeString(this.d.name());
    }
}
