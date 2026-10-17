package com.revolut.feature.bank_account_switching.impl.ui.form.phone_number_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/form/phone_number_input/PhoneNumberInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneNumberInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PhoneNumberInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f63946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63948c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhoneNumberInputScreenContract$InputData(parcel.readString(), parcel.readString(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PhoneNumberInputScreenContract$InputData[i];
        }
    }

    public PhoneNumberInputScreenContract$InputData(String title, String number, b country) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(number, "number");
        this.f63946a = country;
        this.f63947b = title;
        this.f63948c = number;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PhoneNumberInputScreenContract$InputData)) {
            return false;
        }
        PhoneNumberInputScreenContract$InputData phoneNumberInputScreenContract$InputData = (PhoneNumberInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63946a, phoneNumberInputScreenContract$InputData.f63946a) && Intrinsics.f(this.f63947b, phoneNumberInputScreenContract$InputData.f63947b) && Intrinsics.f(this.f63948c, phoneNumberInputScreenContract$InputData.f63948c);
    }

    public final int hashCode() {
        return this.f63948c.hashCode() + p.a.c(this.f63946a.f297794a.hashCode() * 31, 31, this.f63947b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f63946a);
        dest.writeString(this.f63947b);
        dest.writeString(this.f63948c);
    }
}
