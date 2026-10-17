package com.revolut.feature.external_accounts.impl.domain.open_banking_brazil;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.external_accounts.models.open_banking_brazil.ThirdPartyBrazil;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilConsentsGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Consent", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OpenBankingBrazilConsentsGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OpenBankingBrazilConsentsGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThirdPartyBrazil f72386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f72387b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/domain/open_banking_brazil/OpenBankingBrazilConsentsGroup$Consent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72389b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consent(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(String id10, String paymentDescription) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(paymentDescription, "paymentDescription");
            this.f72388a = id10;
            this.f72389b = paymentDescription;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Consent)) {
                return false;
            }
            Consent consent = (Consent) obj2;
            return Intrinsics.f(this.f72388a, consent.f72388a) && Intrinsics.f(this.f72389b, consent.f72389b);
        }

        public final int hashCode() {
            return this.f72389b.hashCode() + (this.f72388a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72388a);
            dest.writeString(this.f72389b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ThirdPartyBrazil thirdPartyBrazil = (ThirdPartyBrazil) j6.a.f(parcel, "parcel", OpenBankingBrazilConsentsGroup.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Consent.CREATOR, parcel, arrayList, iA, 1);
            }
            return new OpenBankingBrazilConsentsGroup(thirdPartyBrazil, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OpenBankingBrazilConsentsGroup[i];
        }
    }

    public OpenBankingBrazilConsentsGroup(ThirdPartyBrazil thirdParty, ArrayList consents) {
        Intrinsics.checkNotNullParameter(thirdParty, "thirdParty");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f72386a = thirdParty;
        this.f72387b = consents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OpenBankingBrazilConsentsGroup)) {
            return false;
        }
        OpenBankingBrazilConsentsGroup openBankingBrazilConsentsGroup = (OpenBankingBrazilConsentsGroup) obj2;
        return Intrinsics.f(this.f72386a, openBankingBrazilConsentsGroup.f72386a) && this.f72387b.equals(openBankingBrazilConsentsGroup.f72387b);
    }

    public final int hashCode() {
        return this.f72387b.hashCode() + (this.f72386a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72386a, i);
        Iterator itY = j6.a.y(this.f72387b, dest);
        while (itY.hasNext()) {
            ((Consent) itY.next()).writeToParcel(dest, i);
        }
    }
}
