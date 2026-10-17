package com.revolut.apm.pix.validation.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType;", "Landroid/os/Parcelable;", "Companion", "Valid", "CpfOrBrazilianLocalPhoneAmbiguous", "a", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$CpfOrBrazilianLocalPhoneAmbiguous;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PixIdentifiedType extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f50359a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$CpfOrBrazilianLocalPhoneAmbiguous;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CpfOrBrazilianLocalPhoneAmbiguous implements PixIdentifiedType {

        @NotNull
        public static final Parcelable.Creator<CpfOrBrazilianLocalPhoneAmbiguous> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f50351b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CpfOrBrazilianLocalPhoneAmbiguous(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CpfOrBrazilianLocalPhoneAmbiguous[i];
            }
        }

        public CpfOrBrazilianLocalPhoneAmbiguous(String backendFormattedPhone, String backendFormattedCpf) {
            Intrinsics.checkNotNullParameter(backendFormattedPhone, "backendFormattedPhone");
            Intrinsics.checkNotNullParameter(backendFormattedCpf, "backendFormattedCpf");
            this.f50350a = backendFormattedPhone;
            this.f50351b = backendFormattedCpf;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CpfOrBrazilianLocalPhoneAmbiguous)) {
                return false;
            }
            CpfOrBrazilianLocalPhoneAmbiguous cpfOrBrazilianLocalPhoneAmbiguous = (CpfOrBrazilianLocalPhoneAmbiguous) obj2;
            return Intrinsics.f(this.f50350a, cpfOrBrazilianLocalPhoneAmbiguous.f50350a) && Intrinsics.f(this.f50351b, cpfOrBrazilianLocalPhoneAmbiguous.f50351b);
        }

        public final int hashCode() {
            return this.f50351b.hashCode() + (this.f50350a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50350a);
            dest.writeString(this.f50351b);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType;", "Cpf", "Cnpj", "Phone", "Email", "Random", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Cnpj;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Cpf;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Email;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Phone;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Random;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Valid implements PixIdentifiedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50352a;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Cnpj;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cnpj extends Valid {

            @NotNull
            public static final Parcelable.Creator<Cnpj> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50353b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cnpj(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cnpj[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cnpj(String backendFormattedValue) {
                super("CNPJ");
                Intrinsics.checkNotNullParameter(backendFormattedValue, "backendFormattedValue");
                this.f50353b = backendFormattedValue;
            }

            @Override // com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF50358b() {
                return this.f50353b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cnpj) && Intrinsics.f(this.f50353b, ((Cnpj) obj2).f50353b);
            }

            public final int hashCode() {
                return this.f50353b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f50353b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Cpf;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cpf extends Valid {

            @NotNull
            public static final Parcelable.Creator<Cpf> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50354b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cpf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cpf[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Cpf(String backendFormattedValue) {
                super("CPF");
                Intrinsics.checkNotNullParameter(backendFormattedValue, "backendFormattedValue");
                this.f50354b = backendFormattedValue;
            }

            @Override // com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF50358b() {
                return this.f50354b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cpf) && Intrinsics.f(this.f50354b, ((Cpf) obj2).f50354b);
            }

            public final int hashCode() {
                return this.f50354b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f50354b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Email;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email extends Valid {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50355b;

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
            public Email(String backendFormattedValue) {
                super("EMAIL");
                Intrinsics.checkNotNullParameter(backendFormattedValue, "backendFormattedValue");
                this.f50355b = backendFormattedValue;
            }

            @Override // com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF50358b() {
                return this.f50355b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Email) && Intrinsics.f(this.f50355b, ((Email) obj2).f50355b);
            }

            public final int hashCode() {
                return this.f50355b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f50355b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Phone;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone extends Valid {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50356b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f50357c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Phone(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Phone[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Phone(String backendFormattedValue, boolean z) {
                super("PHONE");
                Intrinsics.checkNotNullParameter(backendFormattedValue, "backendFormattedValue");
                this.f50356b = backendFormattedValue;
                this.f50357c = z;
            }

            @Override // com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF50358b() {
                return this.f50356b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Phone)) {
                    return false;
                }
                Phone phone = (Phone) obj2;
                return Intrinsics.f(this.f50356b, phone.f50356b) && this.f50357c == phone.f50357c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f50357c) + (this.f50356b.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f50356b);
                dest.writeInt(this.f50357c ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid$Random;", "Lcom/revolut/apm/pix/validation/api/PixIdentifiedType$Valid;", "", "toString", "()Ljava/lang/String;", "apm_pix_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Random extends Valid {

            @NotNull
            public static final Parcelable.Creator<Random> CREATOR = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f50358b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Random(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Random[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Random(String backendFormattedValue) {
                super("EVP");
                Intrinsics.checkNotNullParameter(backendFormattedValue, "backendFormattedValue");
                this.f50358b = backendFormattedValue;
            }

            @Override // com.revolut.apm.pix.validation.api.PixIdentifiedType.Valid
            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getF50358b() {
                return this.f50358b;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Random) && Intrinsics.f(this.f50358b, ((Random) obj2).f50358b);
            }

            public final int hashCode() {
                return this.f50358b.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f50358b);
            }
        }

        public Valid(String str) {
            this.f50352a = str;
        }

        /* JADX INFO: renamed from: a */
        public abstract String getF50358b();
    }

    /* JADX INFO: renamed from: com.revolut.apm.pix.validation.api.PixIdentifiedType$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f50359a = new Companion();

        private Companion() {
        }
    }
}
