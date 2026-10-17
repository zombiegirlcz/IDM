package com.revolut.feature.acquiring.lite_pos.impl.ui.flow.lite_pos;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.lite_pos.api.model.ReceiptInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Receipt", "CurrencyPicker", "AmountExceedsLimit", "ChangeCurrency", "CatalogueBaseCurrencyWarning", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$AmountExceedsLimit;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$CatalogueBaseCurrencyWarning;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$ChangeCurrency;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$Receipt;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class LitePosFlowContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$AmountExceedsLimit;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AmountExceedsLimit extends LitePosFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<AmountExceedsLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dj0.d f60725a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AmountExceedsLimit((dj0.d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountExceedsLimit[i];
            }
        }

        public AmountExceedsLimit(dj0.d limit) {
            Intrinsics.checkNotNullParameter(limit, "limit");
            this.f60725a = limit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AmountExceedsLimit) && Intrinsics.f(this.f60725a, ((AmountExceedsLimit) obj2).f60725a);
        }

        public final int hashCode() {
            return this.f60725a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f60725a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$CatalogueBaseCurrencyWarning;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CatalogueBaseCurrencyWarning extends LitePosFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CatalogueBaseCurrencyWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f60726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final xi0.b f60727b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CatalogueBaseCurrencyWarning((xi0.b) parcel.readSerializable(), (xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CatalogueBaseCurrencyWarning[i];
            }
        }

        public CatalogueBaseCurrencyWarning(xi0.b current, xi0.b base) {
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(base, "base");
            this.f60726a = current;
            this.f60727b = base;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CatalogueBaseCurrencyWarning)) {
                return false;
            }
            CatalogueBaseCurrencyWarning catalogueBaseCurrencyWarning = (CatalogueBaseCurrencyWarning) obj2;
            return Intrinsics.f(this.f60726a, catalogueBaseCurrencyWarning.f60726a) && Intrinsics.f(this.f60727b, catalogueBaseCurrencyWarning.f60727b);
        }

        public final int hashCode() {
            return this.f60727b.hashCode() + (this.f60726a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f60726a);
            dest.writeSerializable(this.f60727b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$ChangeCurrency;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCurrency extends LitePosFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ChangeCurrency> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f60728a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCurrency((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCurrency[i];
            }
        }

        public ChangeCurrency(xi0.b currentCurrency) {
            Intrinsics.checkNotNullParameter(currentCurrency, "currentCurrency");
            this.f60728a = currentCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeCurrency) && Intrinsics.f(this.f60728a, ((ChangeCurrency) obj2).f60728a);
        }

        public final int hashCode() {
            return this.f60728a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f60728a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$CurrencyPicker;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyPicker extends LitePosFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CurrencyPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xi0.b f60729a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CurrencyPicker((xi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CurrencyPicker[i];
            }
        }

        public CurrencyPicker(xi0.b selectedCurrency) {
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            this.f60729a = selectedCurrency;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CurrencyPicker) && Intrinsics.f(this.f60729a, ((CurrencyPicker) obj2).f60729a);
        }

        public final int hashCode() {
            return this.f60729a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f60729a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep$Receipt;", "Lcom/revolut/feature/acquiring/lite_pos/impl/ui/flow/lite_pos/LitePosFlowContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_lite_pos_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Receipt extends LitePosFlowContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Receipt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReceiptInfo f60730a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Receipt((ReceiptInfo) parcel.readParcelable(Receipt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Receipt[i];
            }
        }

        public Receipt(ReceiptInfo receiptInfo) {
            Intrinsics.checkNotNullParameter(receiptInfo, "receiptInfo");
            this.f60730a = receiptInfo;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Receipt) && Intrinsics.f(this.f60730a, ((Receipt) obj2).f60730a);
        }

        public final int hashCode() {
            return this.f60730a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f60730a, i);
        }
    }

    private LitePosFlowContract$ModalStep() {
    }
}
