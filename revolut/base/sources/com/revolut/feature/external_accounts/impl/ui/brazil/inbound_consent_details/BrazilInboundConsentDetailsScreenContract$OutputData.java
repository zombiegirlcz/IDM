package com.revolut.feature.external_accounts.impl.ui.brazil.inbound_consent_details;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "Revoke", "EditAlias", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData$EditAlias;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData$Revoke;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilInboundConsentDetailsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData$EditAlias;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditAlias extends BrazilInboundConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<EditAlias> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72565b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditAlias(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditAlias[i];
            }
        }

        public EditAlias(String consentId, String alias) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(alias, "alias");
            this.f72564a = consentId;
            this.f72565b = alias;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditAlias)) {
                return false;
            }
            EditAlias editAlias = (EditAlias) obj2;
            return Intrinsics.f(this.f72564a, editAlias.f72564a) && Intrinsics.f(this.f72565b, editAlias.f72565b);
        }

        public final int hashCode() {
            return this.f72565b.hashCode() + (this.f72564a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72564a);
            dest.writeString(this.f72565b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData$Revoke;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/inbound_consent_details/BrazilInboundConsentDetailsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Revoke extends BrazilInboundConsentDetailsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<Revoke> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72567b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Revoke(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Revoke[i];
            }
        }

        public Revoke(String consentId, String thirdPartyTitle) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72566a = consentId;
            this.f72567b = thirdPartyTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Revoke)) {
                return false;
            }
            Revoke revoke = (Revoke) obj2;
            return Intrinsics.f(this.f72566a, revoke.f72566a) && Intrinsics.f(this.f72567b, revoke.f72567b);
        }

        public final int hashCode() {
            return this.f72567b.hashCode() + (this.f72566a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72566a);
            dest.writeString(this.f72567b);
        }
    }

    private BrazilInboundConsentDetailsScreenContract$OutputData() {
    }
}
