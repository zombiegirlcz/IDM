package com.revolut.feature.external_accounts.impl.ui.brazil.open_finance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og6.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/open_finance/BrazilConsentGroupParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BrazilConsentGroupParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<BrazilConsentGroupParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThirdPartyBrazil f72650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f72651b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BrazilConsentGroupParcel((ThirdPartyBrazil) parcel.readParcelable(BrazilConsentGroupParcel.class.getClassLoader()), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BrazilConsentGroupParcel[i];
        }
    }

    public BrazilConsentGroupParcel(ThirdPartyBrazil thirdParty, i consentType) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(consentType, "consentType");
        this.f72650a = thirdParty;
        this.f72651b = consentType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BrazilConsentGroupParcel)) {
            return false;
        }
        BrazilConsentGroupParcel brazilConsentGroupParcel = (BrazilConsentGroupParcel) obj2;
        return Intrinsics.f(this.f72650a, brazilConsentGroupParcel.f72650a) && this.f72651b == brazilConsentGroupParcel.f72651b;
    }

    public final int hashCode() {
        return this.f72651b.hashCode() + (this.f72650a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72650a, i);
        dest.writeString(this.f72651b.name());
    }
}
