package com.revolut.feature.revolutpay.shared.ui.add_payment_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.CardPaymentAvailability;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.t;
import u6c.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/add_payment_method/AddPaymentMethodControllerDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddPaymentMethodControllerDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddPaymentMethodControllerDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardPaymentAvailability f84705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f84706c;
    public final t d;
    public final xi0.b e;
    public final boolean f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddPaymentMethodControllerDescriptor$InputData(parcel.readString(), (CardPaymentAvailability) parcel.readParcelable(AddPaymentMethodControllerDescriptor$InputData.class.getClassLoader()), parcel.readInt() == 0 ? null : u.valueOf(parcel.readString()), t.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddPaymentMethodControllerDescriptor$InputData[i];
        }
    }

    public AddPaymentMethodControllerDescriptor$InputData(String str, CardPaymentAvailability cardPaymentAvailability, u uVar, t product, xi0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(cardPaymentAvailability, "cardPaymentAvailability");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f84704a = str;
        this.f84705b = cardPaymentAvailability;
        this.f84706c = uVar;
        this.d = product;
        this.e = bVar;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddPaymentMethodControllerDescriptor$InputData)) {
            return false;
        }
        AddPaymentMethodControllerDescriptor$InputData addPaymentMethodControllerDescriptor$InputData = (AddPaymentMethodControllerDescriptor$InputData) obj2;
        return Intrinsics.f(this.f84704a, addPaymentMethodControllerDescriptor$InputData.f84704a) && Intrinsics.f(this.f84705b, addPaymentMethodControllerDescriptor$InputData.f84705b) && this.f84706c == addPaymentMethodControllerDescriptor$InputData.f84706c && this.d == addPaymentMethodControllerDescriptor$InputData.d && Intrinsics.f(this.e, addPaymentMethodControllerDescriptor$InputData.e) && this.f == addPaymentMethodControllerDescriptor$InputData.f;
    }

    public final int hashCode() {
        String str = this.f84704a;
        int iHashCode = (this.f84705b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        u uVar = this.f84706c;
        int iHashCode2 = (this.d.hashCode() + ((iHashCode + (uVar == null ? 0 : uVar.hashCode())) * 31)) * 31;
        xi0.b bVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84704a);
        dest.writeParcelable(this.f84705b, i);
        u uVar = this.f84706c;
        if (uVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(uVar.name());
        }
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeInt(this.f ? 1 : 0);
    }
}
