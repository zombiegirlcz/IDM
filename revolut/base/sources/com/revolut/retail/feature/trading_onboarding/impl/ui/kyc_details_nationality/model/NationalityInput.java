package com.revolut.retail.feature.trading_onboarding.impl.ui.kyc_details_nationality.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/kyc_details_nationality/model/NationalityInput;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NationalityInput implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<NationalityInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f104195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f104196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104197c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NationalityInput((b) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new NationalityInput[i];
        }
    }

    public NationalityInput(b countryCode, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f104195a = countryCode;
        this.f104196b = z;
        this.f104197c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NationalityInput)) {
            return false;
        }
        NationalityInput nationalityInput = (NationalityInput) obj2;
        return Intrinsics.f(this.f104195a, nationalityInput.f104195a) && this.f104196b == nationalityInput.f104196b && this.f104197c == nationalityInput.f104197c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104197c) + j6.a.c(this.f104195a.f297794a.hashCode() * 31, 31, this.f104196b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104195a);
        dest.writeInt(this.f104196b ? 1 : 0);
        dest.writeInt(this.f104197c ? 1 : 0);
    }
}
