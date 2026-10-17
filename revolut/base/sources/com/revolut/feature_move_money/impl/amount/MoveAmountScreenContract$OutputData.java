package com.revolut.feature_move_money.impl.amount;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "ExecuteMoveMoney", "OpenAutomationScreen", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData$ExecuteMoveMoney;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData$OpenAutomationScreen;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MoveAmountScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData$ExecuteMoveMoney;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExecuteMoveMoney extends MoveAmountScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<ExecuteMoveMoney> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoveMoneyOrderInfo f97278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f97279b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExecuteMoveMoney(MoveMoneyOrderInfo.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExecuteMoveMoney[i];
            }
        }

        public ExecuteMoveMoney(MoveMoneyOrderInfo moveMoneyOrderInfo, String buttonTag) {
            Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "moveMoneyOrderInfo");
            Intrinsics.checkNotNullParameter(buttonTag, "buttonTag");
            this.f97278a = moveMoneyOrderInfo;
            this.f97279b = buttonTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExecuteMoveMoney)) {
                return false;
            }
            ExecuteMoveMoney executeMoveMoney = (ExecuteMoveMoney) obj2;
            return Intrinsics.f(this.f97278a, executeMoveMoney.f97278a) && Intrinsics.f(this.f97279b, executeMoveMoney.f97279b);
        }

        public final int hashCode() {
            return this.f97279b.hashCode() + (this.f97278a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f97278a.writeToParcel(dest, i);
            dest.writeString(this.f97279b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData$OpenAutomationScreen;", "Lcom/revolut/feature_move_money/impl/amount/MoveAmountScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenAutomationScreen extends MoveAmountScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<OpenAutomationScreen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Long f97280a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountWrapper f97281b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AccountWrapper f97282c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenAutomationScreen((AccountWrapper) parcel.readParcelable(OpenAutomationScreen.class.getClassLoader()), (AccountWrapper) parcel.readParcelable(OpenAutomationScreen.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAutomationScreen[i];
            }
        }

        public OpenAutomationScreen(AccountWrapper source, AccountWrapper target, Long l2) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(target, "target");
            this.f97280a = l2;
            this.f97281b = source;
            this.f97282c = target;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OpenAutomationScreen)) {
                return false;
            }
            OpenAutomationScreen openAutomationScreen = (OpenAutomationScreen) obj2;
            return Intrinsics.f(this.f97280a, openAutomationScreen.f97280a) && Intrinsics.f(this.f97281b, openAutomationScreen.f97281b) && Intrinsics.f(this.f97282c, openAutomationScreen.f97282c);
        }

        public final int hashCode() {
            Long l2 = this.f97280a;
            return this.f97282c.hashCode() + ((this.f97281b.hashCode() + ((l2 == null ? 0 : l2.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l2 = this.f97280a;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
            dest.writeParcelable(this.f97281b, i);
            dest.writeParcelable(this.f97282c, i);
        }
    }

    private MoveAmountScreenContract$OutputData() {
    }
}
