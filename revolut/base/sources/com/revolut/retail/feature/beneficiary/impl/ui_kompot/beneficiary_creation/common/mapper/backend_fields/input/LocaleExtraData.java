package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.common.mapper.backend_fields.input;

import android.os.Parcel;
import android.os.Parcelable;
import do3.n;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/common/mapper/backend_fields/input/LocaleExtraData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LocaleExtraData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LocaleExtraData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f99701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f99702c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocaleExtraData((b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocaleExtraData[i];
        }
    }

    public LocaleExtraData(b selectedCountry, xi0.b selectedCurrency, n user) {
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f99700a = selectedCountry;
        this.f99701b = selectedCurrency;
        this.f99702c = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LocaleExtraData)) {
            return false;
        }
        LocaleExtraData localeExtraData = (LocaleExtraData) obj2;
        return Intrinsics.f(this.f99700a, localeExtraData.f99700a) && Intrinsics.f(this.f99701b, localeExtraData.f99701b) && Intrinsics.f(this.f99702c, localeExtraData.f99702c);
    }

    public final int hashCode() {
        return this.f99702c.hashCode() + l.j(this.f99701b, this.f99700a.f297794a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f99700a);
        dest.writeSerializable(this.f99701b);
        dest.writeSerializable(this.f99702c);
    }
}
