package com.revolut.feature.external_accounts.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u000b\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "DirectLinkPayload", "LinkedAccountPayload", "MandateCreationPayload", "OneOffPayload", "IndiaNetBankingPayload", "IndiaUpiPayload", "PayToStoredMethodPayload", "PsePayload", "BrazilPixMandatePayload", "a", "OpenAccountTypeChooserPayload", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$BrazilPixMandatePayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$DirectLinkPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$IndiaNetBankingPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$IndiaUpiPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$LinkedAccountPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$MandateCreationPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$OneOffPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$OpenAccountTypeChooserPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$PayToStoredMethodPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$PsePayload;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExternalAccountTopupPayload implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$BrazilPixMandatePayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BrazilPixMandatePayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<BrazilPixMandatePayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73098a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BrazilPixMandatePayload(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BrazilPixMandatePayload[i];
            }
        }

        public BrazilPixMandatePayload(String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f73098a = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BrazilPixMandatePayload) && Intrinsics.f(this.f73098a, ((BrazilPixMandatePayload) obj2).f73098a);
        }

        public final int hashCode() {
            return this.f73098a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73098a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$DirectLinkPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DirectLinkPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<DirectLinkPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73100b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DirectLinkPayload(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DirectLinkPayload[i];
            }
        }

        public DirectLinkPayload(String str, String str2) {
            this.f73099a = str;
            this.f73100b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DirectLinkPayload)) {
                return false;
            }
            DirectLinkPayload directLinkPayload = (DirectLinkPayload) obj2;
            return Intrinsics.f(this.f73099a, directLinkPayload.f73099a) && Intrinsics.f(this.f73100b, directLinkPayload.f73100b);
        }

        public final int hashCode() {
            String str = this.f73099a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73100b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73099a);
            dest.writeString(this.f73100b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$IndiaNetBankingPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaNetBankingPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<IndiaNetBankingPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f73101a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaNetBankingPayload(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaNetBankingPayload[i];
            }
        }

        public IndiaNetBankingPayload(boolean z) {
            this.f73101a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IndiaNetBankingPayload) && this.f73101a == ((IndiaNetBankingPayload) obj2).f73101a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73101a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f73101a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$IndiaUpiPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IndiaUpiPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<IndiaUpiPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73103b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new IndiaUpiPayload(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IndiaUpiPayload[i];
            }
        }

        public IndiaUpiPayload(String link, String androidPackage) {
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(androidPackage, "androidPackage");
            this.f73102a = link;
            this.f73103b = androidPackage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof IndiaUpiPayload)) {
                return false;
            }
            IndiaUpiPayload indiaUpiPayload = (IndiaUpiPayload) obj2;
            return Intrinsics.f(this.f73102a, indiaUpiPayload.f73102a) && Intrinsics.f(this.f73103b, indiaUpiPayload.f73103b);
        }

        public final int hashCode() {
            return this.f73103b.hashCode() + (this.f73102a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73102a);
            dest.writeString(this.f73103b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$LinkedAccountPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LinkedAccountPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<LinkedAccountPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f73104a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73105b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LinkedAccountPayload(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LinkedAccountPayload[i];
            }
        }

        public LinkedAccountPayload(boolean z, String str) {
            this.f73104a = z;
            this.f73105b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof LinkedAccountPayload)) {
                return false;
            }
            LinkedAccountPayload linkedAccountPayload = (LinkedAccountPayload) obj2;
            return this.f73104a == linkedAccountPayload.f73104a && Intrinsics.f(this.f73105b, linkedAccountPayload.f73105b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f73104a) * 31;
            String str = this.f73105b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f73104a ? 1 : 0);
            dest.writeString(this.f73105b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$MandateCreationPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "<init>", "()V", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MandateCreationPayload extends ExternalAccountTopupPayload {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MandateCreationPayload f73106a = new MandateCreationPayload();

        @NotNull
        public static final Parcelable.Creator<MandateCreationPayload> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MandateCreationPayload.f73106a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MandateCreationPayload[i];
            }
        }

        private MandateCreationPayload() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$OneOffPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/external_accounts/models/a", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OneOffPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<OneOffPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.revolut.feature.external_accounts.models.a f73109c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OneOffPayload(parcel.readString(), parcel.readString(), com.revolut.feature.external_accounts.models.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneOffPayload[i];
            }
        }

        public OneOffPayload(String str, String str2, com.revolut.feature.external_accounts.models.a authorizationStatus) {
            Intrinsics.checkNotNullParameter(authorizationStatus, "authorizationStatus");
            this.f73107a = str;
            this.f73108b = str2;
            this.f73109c = authorizationStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OneOffPayload)) {
                return false;
            }
            OneOffPayload oneOffPayload = (OneOffPayload) obj2;
            return Intrinsics.f(this.f73107a, oneOffPayload.f73107a) && Intrinsics.f(this.f73108b, oneOffPayload.f73108b) && this.f73109c == oneOffPayload.f73109c;
        }

        public final int hashCode() {
            String str = this.f73107a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73108b;
            return this.f73109c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73107a);
            dest.writeString(this.f73108b);
            dest.writeString(this.f73109c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$OpenAccountTypeChooserPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenAccountTypeChooserPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<OpenAccountTypeChooserPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73110a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenAccountTypeChooserPayload(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenAccountTypeChooserPayload[i];
            }
        }

        public OpenAccountTypeChooserPayload(String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f73110a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenAccountTypeChooserPayload) && Intrinsics.f(this.f73110a, ((OpenAccountTypeChooserPayload) obj2).f73110a);
        }

        public final int hashCode() {
            return this.f73110a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73110a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$PayToStoredMethodPayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PayToStoredMethodPayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<PayToStoredMethodPayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f73111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f73113c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PayToStoredMethodPayload((d) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PayToStoredMethodPayload[i];
            }
        }

        public PayToStoredMethodPayload(d topUpAmount, String storedMethodId, boolean z) {
            Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
            Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
            this.f73111a = topUpAmount;
            this.f73112b = storedMethodId;
            this.f73113c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PayToStoredMethodPayload)) {
                return false;
            }
            PayToStoredMethodPayload payToStoredMethodPayload = (PayToStoredMethodPayload) obj2;
            return Intrinsics.f(this.f73111a, payToStoredMethodPayload.f73111a) && Intrinsics.f(this.f73112b, payToStoredMethodPayload.f73112b) && this.f73113c == payToStoredMethodPayload.f73113c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f73113c) + p.a.c(this.f73111a.hashCode() * 31, 31, this.f73112b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f73111a);
            dest.writeString(this.f73112b);
            dest.writeInt(this.f73113c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload$PsePayload;", "Lcom/revolut/feature/external_accounts/models/ExternalAccountTopupPayload;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PsePayload extends ExternalAccountTopupPayload {

        @NotNull
        public static final Parcelable.Creator<PsePayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73114a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PsePayload(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PsePayload[i];
            }
        }

        public PsePayload(String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.f73114a = link;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PsePayload) && Intrinsics.f(this.f73114a, ((PsePayload) obj2).f73114a);
        }

        public final int hashCode() {
            return this.f73114a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73114a);
        }
    }

    private ExternalAccountTopupPayload() {
    }
}
