package com.revolut.feature_move_money.impl.automation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$CreationState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyAutomationScreenContract$CreationState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyAutomationScreenContract$CreationState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletAutomation f97325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountWrapper f97326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f97327c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyAutomationScreenContract$CreationState((WalletAutomation) parcel.readParcelable(MoveMoneyAutomationScreenContract$CreationState.class.getClassLoader()), (AccountWrapper) parcel.readParcelable(MoveMoneyAutomationScreenContract$CreationState.class.getClassLoader()), (AccountWrapper) parcel.readParcelable(MoveMoneyAutomationScreenContract$CreationState.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyAutomationScreenContract$CreationState[i];
        }
    }

    public MoveMoneyAutomationScreenContract$CreationState(WalletAutomation walletAutomation, AccountWrapper sourceAccount, AccountWrapper targetAccount, boolean z) {
        Intrinsics.checkNotNullParameter(walletAutomation, "walletAutomation");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        this.f97325a = walletAutomation;
        this.f97326b = sourceAccount;
        this.f97327c = targetAccount;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyAutomationScreenContract$CreationState)) {
            return false;
        }
        MoveMoneyAutomationScreenContract$CreationState moveMoneyAutomationScreenContract$CreationState = (MoveMoneyAutomationScreenContract$CreationState) obj2;
        return Intrinsics.f(this.f97325a, moveMoneyAutomationScreenContract$CreationState.f97325a) && Intrinsics.f(this.f97326b, moveMoneyAutomationScreenContract$CreationState.f97326b) && Intrinsics.f(this.f97327c, moveMoneyAutomationScreenContract$CreationState.f97327c) && this.d == moveMoneyAutomationScreenContract$CreationState.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f97327c.hashCode() + ((this.f97326b.hashCode() + (this.f97325a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97325a, i);
        dest.writeParcelable(this.f97326b, i);
        dest.writeParcelable(this.f97327c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
