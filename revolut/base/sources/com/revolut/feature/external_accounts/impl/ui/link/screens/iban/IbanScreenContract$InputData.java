package com.revolut.feature.external_accounts.impl.ui.link.screens.iban;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.domain.models.beneficiary.BankFieldDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/link/screens/iban/IbanScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IbanScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IbanScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f73050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f73051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f73052c;
    public final BankFieldDefinition d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IbanScreenContract$InputData((Clause) parcel.readParcelable(IbanScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(IbanScreenContract$InputData.class.getClassLoader()), (b) parcel.readSerializable(), (BankFieldDefinition) parcel.readParcelable(IbanScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IbanScreenContract$InputData[i];
        }
    }

    public IbanScreenContract$InputData(Clause title, Clause subtitle, b countryCode, BankFieldDefinition beneficiaryDefinition, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(beneficiaryDefinition, "beneficiaryDefinition");
        this.f73050a = title;
        this.f73051b = subtitle;
        this.f73052c = countryCode;
        this.d = beneficiaryDefinition;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IbanScreenContract$InputData)) {
            return false;
        }
        IbanScreenContract$InputData ibanScreenContract$InputData = (IbanScreenContract$InputData) obj2;
        return Intrinsics.f(this.f73050a, ibanScreenContract$InputData.f73050a) && Intrinsics.f(this.f73051b, ibanScreenContract$InputData.f73051b) && Intrinsics.f(this.f73052c, ibanScreenContract$InputData.f73052c) && Intrinsics.f(this.d, ibanScreenContract$InputData.d) && Intrinsics.f(this.e, ibanScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.a(this.f73050a.hashCode() * 31, 31, this.f73051b), 31, this.f73052c.f297794a)) * 31;
        String str = this.e;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73050a, i);
        dest.writeParcelable(this.f73051b, i);
        dest.writeSerializable(this.f73052c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
    }
}
