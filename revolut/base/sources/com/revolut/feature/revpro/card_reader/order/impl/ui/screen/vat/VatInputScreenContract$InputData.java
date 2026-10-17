package com.revolut.feature.revpro.card_reader.order.impl.ui.screen.vat;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revpro/card_reader/order/impl/ui/screen/vat/VatInputScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revpro_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VatInputScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<VatInputScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f84761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84762b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VatInputScreenContract$InputData((b) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VatInputScreenContract$InputData[i];
        }
    }

    public VatInputScreenContract$InputData(b country, String countryName) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(countryName, "countryName");
        this.f84761a = country;
        this.f84762b = countryName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VatInputScreenContract$InputData)) {
            return false;
        }
        VatInputScreenContract$InputData vatInputScreenContract$InputData = (VatInputScreenContract$InputData) obj2;
        return Intrinsics.f(this.f84761a, vatInputScreenContract$InputData.f84761a) && Intrinsics.f(this.f84762b, vatInputScreenContract$InputData.f84762b);
    }

    public final int hashCode() {
        return this.f84762b.hashCode() + (this.f84761a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f84761a);
        dest.writeString(this.f84762b);
    }
}
