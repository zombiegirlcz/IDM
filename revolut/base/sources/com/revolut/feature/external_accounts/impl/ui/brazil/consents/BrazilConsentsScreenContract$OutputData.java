package com.revolut.feature.external_accounts.impl.ui.brazil.consents;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "<init>", "()V", "OutboundConsentClicked", "InboundConsentClicked", "RevokeClicked", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$InboundConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$OutboundConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$RevokeClicked;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BrazilConsentsScreenContract$OutputData implements r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$InboundConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InboundConsentClicked extends BrazilConsentsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<InboundConsentClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72555b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InboundConsentClicked(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InboundConsentClicked[i];
            }
        }

        public InboundConsentClicked(String consentId, boolean z) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72554a = consentId;
            this.f72555b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InboundConsentClicked)) {
                return false;
            }
            InboundConsentClicked inboundConsentClicked = (InboundConsentClicked) obj2;
            return Intrinsics.f(this.f72554a, inboundConsentClicked.f72554a) && this.f72555b == inboundConsentClicked.f72555b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72555b) + (this.f72554a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72554a);
            dest.writeInt(this.f72555b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$OutboundConsentClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OutboundConsentClicked extends BrazilConsentsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<OutboundConsentClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f72557b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OutboundConsentClicked(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OutboundConsentClicked[i];
            }
        }

        public OutboundConsentClicked(String consentId, boolean z) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            this.f72556a = consentId;
            this.f72557b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OutboundConsentClicked)) {
                return false;
            }
            OutboundConsentClicked outboundConsentClicked = (OutboundConsentClicked) obj2;
            return Intrinsics.f(this.f72556a, outboundConsentClicked.f72556a) && this.f72557b == outboundConsentClicked.f72557b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72557b) + (this.f72556a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72556a);
            dest.writeInt(this.f72557b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData$RevokeClicked;", "Lcom/revolut/feature/external_accounts/impl/ui/brazil/consents/BrazilConsentsScreenContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevokeClicked extends BrazilConsentsScreenContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<RevokeClicked> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f72559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f72560c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevokeClicked(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevokeClicked[i];
            }
        }

        public RevokeClicked(String consentId, String thirdPartyTitle, boolean z) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(thirdPartyTitle, "thirdPartyTitle");
            this.f72558a = consentId;
            this.f72559b = thirdPartyTitle;
            this.f72560c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RevokeClicked)) {
                return false;
            }
            RevokeClicked revokeClicked = (RevokeClicked) obj2;
            return Intrinsics.f(this.f72558a, revokeClicked.f72558a) && Intrinsics.f(this.f72559b, revokeClicked.f72559b) && this.f72560c == revokeClicked.f72560c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f72560c) + p.a.c(this.f72558a.hashCode() * 31, 31, this.f72559b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72558a);
            dest.writeString(this.f72559b);
            dest.writeInt(this.f72560c ? 1 : 0);
        }
    }

    private BrazilConsentsScreenContract$OutputData() {
    }
}
