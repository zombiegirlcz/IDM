package com.revolut.feature.credit.card.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zl4.f;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/api/navigation/descriptor/CreditCardDialog$Descriptor", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Lzl4/f;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardDialog$Descriptor implements ParcelableControllerDescriptor<f> {

    @NotNull
    public static final Parcelable.Creator<CreditCardDialog$Descriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditCardDialog$InputData f68989a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardDialog$Descriptor((CreditCardDialog$InputData) parcel.readParcelable(CreditCardDialog$Descriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardDialog$Descriptor[i];
        }
    }

    public CreditCardDialog$Descriptor(CreditCardDialog$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f68989a = inputData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditCardDialog$Descriptor) && Intrinsics.f(this.f68989a, ((CreditCardDialog$Descriptor) obj2).f68989a);
    }

    public final int hashCode() {
        return this.f68989a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f68989a, i);
    }
}
