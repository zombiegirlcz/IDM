package com.revolut.feature.cash_topup.impl.ui.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "CreateBarcodeData", "EditBarcodeData", "Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData$CreateBarcodeData;", "Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData$EditBarcodeData;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CashTopUpAmountScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData$CreateBarcodeData;", "Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CreateBarcodeData extends CashTopUpAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<CreateBarcodeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65610a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CreateBarcodeData(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CreateBarcodeData[i];
            }
        }

        public CreateBarcodeData(String storeId) {
            Intrinsics.checkNotNullParameter(storeId, "storeId");
            this.f65610a = storeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CreateBarcodeData) && Intrinsics.f(this.f65610a, ((CreateBarcodeData) obj2).f65610a);
        }

        public final int hashCode() {
            return this.f65610a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65610a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData$EditBarcodeData;", "Lcom/revolut/feature/cash_topup/impl/ui/amount/CashTopUpAmountScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditBarcodeData extends CashTopUpAmountScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<EditBarcodeData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f65611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65613c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditBarcodeData((d) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditBarcodeData[i];
            }
        }

        public EditBarcodeData(d currentAmount, String barcodeId, String storeId) {
            Intrinsics.checkNotNullParameter(currentAmount, "currentAmount");
            Intrinsics.checkNotNullParameter(barcodeId, "barcodeId");
            Intrinsics.checkNotNullParameter(storeId, "storeId");
            this.f65611a = currentAmount;
            this.f65612b = barcodeId;
            this.f65613c = storeId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditBarcodeData)) {
                return false;
            }
            EditBarcodeData editBarcodeData = (EditBarcodeData) obj2;
            return Intrinsics.f(this.f65611a, editBarcodeData.f65611a) && Intrinsics.f(this.f65612b, editBarcodeData.f65612b) && Intrinsics.f(this.f65613c, editBarcodeData.f65613c);
        }

        public final int hashCode() {
            return this.f65613c.hashCode() + p.a.c(this.f65611a.hashCode() * 31, 31, this.f65612b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f65611a);
            dest.writeString(this.f65612b);
            dest.writeString(this.f65613c);
        }
    }

    private CashTopUpAmountScreenContract$InputData() {
    }
}
