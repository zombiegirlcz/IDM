package com.revolut.feature.apm.core.models.recipients;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0006\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "Lcom/revolut/feature/apm/core/models/recipients/ApmIdentifier;", "Landroid/os/Parcelable;", "Companion", "Phone", "Email", "TaxNumber", "BankAccount", "ExternalId", "a", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$Email;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$ExternalId;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$Phone;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$TaxNumber;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ApmDescriptor implements ApmIdentifier, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62102a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "Default", "IBAN", "AccountNumber", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$AccountNumber;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$Default;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$IBAN;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class BankAccount extends ApmDescriptor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62103b;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$AccountNumber;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AccountNumber extends BankAccount {

            @NotNull
            public static final Parcelable.Creator<AccountNumber> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f62104c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AccountNumber(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AccountNumber[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountNumber(String value) {
                super("ACCOUNT_NUMBER");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f62104c = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AccountNumber) && Intrinsics.f(this.f62104c, ((AccountNumber) obj2).f62104c);
            }

            @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final String getF62111b() {
                return this.f62104c;
            }

            public final int hashCode() {
                return this.f62104c.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62104c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$Default;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends BankAccount {

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f62105c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Default(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(String value) {
                super("BANK_ACCOUNT");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f62105c = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Default) && Intrinsics.f(this.f62105c, ((Default) obj2).f62105c);
            }

            @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final String getF62111b() {
                return this.f62105c;
            }

            public final int hashCode() {
                return this.f62105c.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62105c);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount$IBAN;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$BankAccount;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class IBAN extends BankAccount {

            @NotNull
            public static final Parcelable.Creator<IBAN> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f62106c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new IBAN(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new IBAN[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public IBAN(String value) {
                super("IBAN");
                Intrinsics.checkNotNullParameter(value, "value");
                this.f62106c = value;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof IBAN) && Intrinsics.f(this.f62106c, ((IBAN) obj2).f62106c);
            }

            @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
            /* JADX INFO: renamed from: getValue, reason: from getter */
            public final String getF62111b() {
                return this.f62106c;
            }

            public final int hashCode() {
                return this.f62106c.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f62106c);
            }
        }

        public BankAccount(String str) {
            super(str);
            this.f62103b = str;
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmDescriptor
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF62102a() {
            return this.f62103b;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$Email;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email extends ApmDescriptor {

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62107b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Email(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Email[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Email(String value) {
            super("EMAIL");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f62107b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Email) && Intrinsics.f(this.f62107b, ((Email) obj2).f62107b);
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF62111b() {
            return this.f62107b;
        }

        public final int hashCode() {
            return this.f62107b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62107b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$ExternalId;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExternalId extends ApmDescriptor {

        @NotNull
        public static final Parcelable.Creator<ExternalId> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f62109c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExternalId(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExternalId[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExternalId(String value, String type) {
            super(value);
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f62108b = value;
            this.f62109c = type;
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmDescriptor
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF62102a() {
            return this.f62109c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExternalId)) {
                return false;
            }
            ExternalId externalId = (ExternalId) obj2;
            return Intrinsics.f(this.f62108b, externalId.f62108b) && Intrinsics.f(this.f62109c, externalId.f62109c);
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF62111b() {
            return this.f62108b;
        }

        public final int hashCode() {
            return this.f62109c.hashCode() + (this.f62108b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62108b);
            dest.writeString(this.f62109c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$Phone;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends ApmDescriptor {

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62110b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Phone(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Phone[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Phone(String value) {
            super("PHONE");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f62110b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Phone) && Intrinsics.f(this.f62110b, ((Phone) obj2).f62110b);
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF62111b() {
            return this.f62110b;
        }

        public final int hashCode() {
            return this.f62110b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62110b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor$TaxNumber;", "Lcom/revolut/feature/apm/core/models/recipients/ApmDescriptor;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TaxNumber extends ApmDescriptor {

        @NotNull
        public static final Parcelable.Creator<TaxNumber> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62111b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TaxNumber(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TaxNumber[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaxNumber(String value) {
            super("TAX_NUMBER");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f62111b = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TaxNumber) && Intrinsics.f(this.f62111b, ((TaxNumber) obj2).f62111b);
        }

        @Override // com.revolut.feature.apm.core.models.recipients.ApmIdentifier
        /* JADX INFO: renamed from: getValue, reason: from getter */
        public final String getF62111b() {
            return this.f62111b;
        }

        public final int hashCode() {
            return this.f62111b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62111b);
        }
    }

    public ApmDescriptor(String str) {
        this.f62102a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF62102a() {
        return this.f62102a;
    }
}
