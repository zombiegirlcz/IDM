package com.revolut.feature.credit.autopay.ui.screen.amount.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$UiConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "InputAmount", "SelectAmount", "SelectAmountItem", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetAmountFlowContract$UiConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SetAmountFlowContract$UiConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SelectAmount f68594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputAmount f68595b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$UiConfig$InputAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputAmount implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f68596a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputAmount((Clause) parcel.readParcelable(InputAmount.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputAmount[i];
            }
        }

        public InputAmount(Clause clause) {
            this.f68596a = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputAmount) && Intrinsics.f(this.f68596a, ((InputAmount) obj2).f68596a);
        }

        public final int hashCode() {
            Clause clause = this.f68596a;
            if (clause == null) {
                return 0;
            }
            return clause.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68596a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$UiConfig$SelectAmount;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAmount implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelectAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SelectAmountItem f68597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SelectAmountItem f68598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SelectAmountItem f68599c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectAmount(parcel.readInt() == 0 ? null : SelectAmountItem.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SelectAmountItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? SelectAmountItem.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAmount[i];
            }
        }

        public SelectAmount(SelectAmountItem selectAmountItem, SelectAmountItem selectAmountItem2, SelectAmountItem selectAmountItem3) {
            this.f68597a = selectAmountItem;
            this.f68598b = selectAmountItem2;
            this.f68599c = selectAmountItem3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectAmount)) {
                return false;
            }
            SelectAmount selectAmount = (SelectAmount) obj2;
            return Intrinsics.f(this.f68597a, selectAmount.f68597a) && Intrinsics.f(this.f68598b, selectAmount.f68598b) && Intrinsics.f(this.f68599c, selectAmount.f68599c);
        }

        public final int hashCode() {
            SelectAmountItem selectAmountItem = this.f68597a;
            int iHashCode = (selectAmountItem == null ? 0 : selectAmountItem.hashCode()) * 31;
            SelectAmountItem selectAmountItem2 = this.f68598b;
            int iHashCode2 = (iHashCode + (selectAmountItem2 == null ? 0 : selectAmountItem2.hashCode())) * 31;
            SelectAmountItem selectAmountItem3 = this.f68599c;
            return iHashCode2 + (selectAmountItem3 != null ? selectAmountItem3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            SelectAmountItem selectAmountItem = this.f68597a;
            if (selectAmountItem == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selectAmountItem.writeToParcel(dest, i);
            }
            SelectAmountItem selectAmountItem2 = this.f68598b;
            if (selectAmountItem2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selectAmountItem2.writeToParcel(dest, i);
            }
            SelectAmountItem selectAmountItem3 = this.f68599c;
            if (selectAmountItem3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                selectAmountItem3.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/autopay/ui/screen/amount/flow/SetAmountFlowContract$UiConfig$SelectAmountItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_autopay_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectAmountItem implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<SelectAmountItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f68600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f68601b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectAmountItem((Clause) parcel.readParcelable(SelectAmountItem.class.getClassLoader()), (Clause) parcel.readParcelable(SelectAmountItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectAmountItem[i];
            }
        }

        public SelectAmountItem(Clause clause, Clause clause2) {
            this.f68600a = clause;
            this.f68601b = clause2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelectAmountItem)) {
                return false;
            }
            SelectAmountItem selectAmountItem = (SelectAmountItem) obj2;
            return Intrinsics.f(this.f68600a, selectAmountItem.f68600a) && Intrinsics.f(this.f68601b, selectAmountItem.f68601b);
        }

        public final int hashCode() {
            Clause clause = this.f68600a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f68601b;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f68600a, i);
            dest.writeParcelable(this.f68601b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetAmountFlowContract$UiConfig(parcel.readInt() == 0 ? null : SelectAmount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InputAmount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SetAmountFlowContract$UiConfig[i];
        }
    }

    public SetAmountFlowContract$UiConfig(SelectAmount selectAmount, InputAmount inputAmount) {
        this.f68594a = selectAmount;
        this.f68595b = inputAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SetAmountFlowContract$UiConfig)) {
            return false;
        }
        SetAmountFlowContract$UiConfig setAmountFlowContract$UiConfig = (SetAmountFlowContract$UiConfig) obj2;
        return Intrinsics.f(this.f68594a, setAmountFlowContract$UiConfig.f68594a) && Intrinsics.f(this.f68595b, setAmountFlowContract$UiConfig.f68595b);
    }

    public final int hashCode() {
        SelectAmount selectAmount = this.f68594a;
        int iHashCode = (selectAmount == null ? 0 : selectAmount.hashCode()) * 31;
        InputAmount inputAmount = this.f68595b;
        return iHashCode + (inputAmount != null ? inputAmount.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        SelectAmount selectAmount = this.f68594a;
        if (selectAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            selectAmount.writeToParcel(dest, i);
        }
        InputAmount inputAmount = this.f68595b;
        if (inputAmount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            inputAmount.writeToParcel(dest, i);
        }
    }
}
