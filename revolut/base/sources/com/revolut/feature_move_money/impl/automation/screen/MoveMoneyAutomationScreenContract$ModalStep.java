package com.revolut.feature_move_money.impl.automation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "BalancePicker", "LimitScreen", "WealthProtectionConfirmation", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$LimitScreen;", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$WealthProtectionConfirmation;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MoveMoneyAutomationScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$BalancePicker;", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalancePicker implements MoveMoneyAutomationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<BalancePicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyAutomationBalancePickerProvider$BalancePickerData f97329a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BalancePicker(MoveMoneyAutomationBalancePickerProvider$BalancePickerData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BalancePicker[i];
            }
        }

        public BalancePicker(MoveMoneyAutomationBalancePickerProvider$BalancePickerData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f97329a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BalancePicker) && Intrinsics.f(this.f97329a, ((BalancePicker) obj2).f97329a);
        }

        public final int hashCode() {
            return this.f97329a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97329a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$LimitScreen;", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LimitScreen implements MoveMoneyAutomationScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LimitScreen f97330a = new LimitScreen();

        @NotNull
        public static final Parcelable.Creator<LimitScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LimitScreen.f97330a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LimitScreen[i];
            }
        }

        private LimitScreen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof LimitScreen);
        }

        public final int hashCode() {
            return 2027393414;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep$WealthProtectionConfirmation;", "Lcom/revolut/feature_move_money/impl/automation/screen/MoveMoneyAutomationScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WealthProtectionConfirmation implements MoveMoneyAutomationScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<WealthProtectionConfirmation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyAutomationScreenContract$CreationState f97331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountWrapper f97332b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WealthProtectionConfirmation(MoveMoneyAutomationScreenContract$CreationState.CREATOR.createFromParcel(parcel), (AccountWrapper) parcel.readParcelable(WealthProtectionConfirmation.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WealthProtectionConfirmation[i];
            }
        }

        public WealthProtectionConfirmation(MoveMoneyAutomationScreenContract$CreationState creationState, AccountWrapper protectedAccount) {
            Intrinsics.checkNotNullParameter(creationState, "creationState");
            Intrinsics.checkNotNullParameter(protectedAccount, "protectedAccount");
            this.f97331a = creationState;
            this.f97332b = protectedAccount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WealthProtectionConfirmation)) {
                return false;
            }
            WealthProtectionConfirmation wealthProtectionConfirmation = (WealthProtectionConfirmation) obj2;
            return Intrinsics.f(this.f97331a, wealthProtectionConfirmation.f97331a) && Intrinsics.f(this.f97332b, wealthProtectionConfirmation.f97332b);
        }

        public final int hashCode() {
            return this.f97332b.hashCode() + (this.f97331a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97331a.writeToParcel(dest, i);
            dest.writeParcelable(this.f97332b, i);
        }
    }
}
