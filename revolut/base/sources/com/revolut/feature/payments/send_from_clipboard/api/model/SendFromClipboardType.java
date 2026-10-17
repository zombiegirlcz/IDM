package com.revolut.feature.payments.send_from_clipboard.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.models.banktransfer.AccountFieldType;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.payments.send_from_clipboard.api.R$string;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Landroid/os/Parcelable;", "PixType", "PayIdType", "UpiType", "ApmType", "BankTransferFields", "P2PType", "Phone", "Email", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$BankTransferFields;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$UpiType;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SendFromClipboardType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Phone", "Email", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Phone;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ApmType extends SendFromClipboardType {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email implements ApmType, Email {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ApmProduct f79692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ApmContact f79693b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Email((ApmProduct) parcel.readParcelable(Email.class.getClassLoader()), (ApmContact) parcel.readParcelable(Email.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Email[i];
                }
            }

            public Email(ApmProduct apm, ApmContact contact) {
                Intrinsics.checkNotNullParameter(apm, "apm");
                Intrinsics.checkNotNullParameter(contact, "contact");
                this.f79692a = apm;
                this.f79693b = contact;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType.ApmType
            /* JADX INFO: renamed from: S1, reason: from getter */
            public final ApmProduct getF79694a() {
                return this.f79692a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Email)) {
                    return false;
                }
                Email email = (Email) obj2;
                return Intrinsics.f(this.f79692a, email.f79692a) && Intrinsics.f(this.f79693b, email.f79693b);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType.ApmType
            /* JADX INFO: renamed from: g6, reason: from getter */
            public final ApmContact getF79695b() {
                return this.f79693b;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79693b.hashCode() + (this.f79692a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79692a, i);
                dest.writeParcelable(this.f79693b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements ApmType, Phone {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ApmProduct f79694a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ApmContact f79695b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Phone((ApmProduct) parcel.readParcelable(Phone.class.getClassLoader()), (ApmContact) parcel.readParcelable(Phone.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Phone[i];
                }
            }

            public Phone(ApmProduct apm, ApmContact contact) {
                Intrinsics.checkNotNullParameter(apm, "apm");
                Intrinsics.checkNotNullParameter(contact, "contact");
                this.f79694a = apm;
                this.f79695b = contact;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType.ApmType
            /* JADX INFO: renamed from: S1, reason: from getter */
            public final ApmProduct getF79694a() {
                return this.f79694a;
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
                return Intrinsics.f(this.f79694a, phone.f79694a) && Intrinsics.f(this.f79695b, phone.f79695b);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType.ApmType
            /* JADX INFO: renamed from: g6, reason: from getter */
            public final ApmContact getF79695b() {
                return this.f79695b;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79695b.hashCode() + (this.f79694a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f79694a, i);
                dest.writeParcelable(this.f79695b, i);
            }
        }

        /* JADX INFO: renamed from: S1 */
        ApmProduct getF79694a();

        /* JADX INFO: renamed from: g6 */
        ApmContact getF79695b();

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default String m() {
            return "apm-".concat(getF79694a().getId());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$BankTransferFields;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BankTransferFields implements SendFromClipboardType {

        @NotNull
        public static final Parcelable.Creator<BankTransferFields> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f79696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f79697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79698c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(AccountFieldType.valueOf(parcel.readString()), parcel.readString());
                }
                return new BankTransferFields(linkedHashMap, (b) parcel.readSerializable(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BankTransferFields[i];
            }
        }

        public BankTransferFields(Map accountFieldsValues, b countryCode, String str, String str2) {
            Intrinsics.checkNotNullParameter(accountFieldsValues, "accountFieldsValues");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f79696a = accountFieldsValues;
            this.f79697b = countryCode;
            this.f79698c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BankTransferFields)) {
                return false;
            }
            BankTransferFields bankTransferFields = (BankTransferFields) obj2;
            return Intrinsics.f(this.f79696a, bankTransferFields.f79696a) && Intrinsics.f(this.f79697b, bankTransferFields.f79697b) && Intrinsics.f(this.f79698c, bankTransferFields.f79698c) && Intrinsics.f(this.d, bankTransferFields.d);
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        public final int getIcon() {
            return R$drawable.uikit_icn_24_bank;
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        public final TextLocalisedClause getTitle() {
            return new TextLocalisedClause(R$string.payments_from_clipboard_bank_transfer, null, null, 14);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f79696a.hashCode() * 31, 31, this.f79697b.f297794a);
            String str = this.f79698c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        public final String m() {
            return "01";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itZ = j6.a.z(this.f79696a, dest);
            while (itZ.hasNext()) {
                Map.Entry entry = (Map.Entry) itZ.next();
                dest.writeString(((AccountFieldType) entry.getKey()).name());
                dest.writeString((String) entry.getValue());
            }
            dest.writeSerializable(this.f79697b);
            dest.writeString(this.f79698c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Email;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Email extends SendFromClipboardType {
        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default int getIcon() {
            return R$drawable.uikit_icn_24_envelope;
        }

        default TextLocalisedClause r() {
            return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_email_title, null, null, 14);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Phone", "Email", "Revtag", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Revtag;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface P2PType extends SendFromClipboardType {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email implements P2PType, Email {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79699a;

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

            public Email(String emailAddress) {
                Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
                this.f79699a = emailAddress;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Email) && Intrinsics.f(this.f79699a, ((Email) obj2).f79699a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79699a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79699a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements P2PType, Phone {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79700a;

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

            public Phone(String phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                this.f79700a = phoneNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Phone) && Intrinsics.f(this.f79700a, ((Phone) obj2).f79700a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79700a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79700a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Revtag;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Revtag implements P2PType {

            @NotNull
            public static final Parcelable.Creator<Revtag> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final zm3.a f79701a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Revtag((zm3.a) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Revtag[i];
                }
            }

            public Revtag(zm3.a contact) {
                Intrinsics.checkNotNullParameter(contact, "contact");
                this.f79701a = contact;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Revtag) && Intrinsics.f(this.f79701a, ((Revtag) obj2).f79701a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_logo_revolut;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_from_clipboard_revtag, null, null, 14);
            }

            public final int hashCode() {
                return this.f79701a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f79701a);
            }
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default String m() {
            return "00";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Phone", "Email", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Phone;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PayIdType extends SendFromClipboardType {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email implements PayIdType, Email {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79702a;

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

            public Email(String emailAddress) {
                Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
                this.f79702a = emailAddress;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Email) && Intrinsics.f(this.f79702a, ((Email) obj2).f79702a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79702a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79702a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements PayIdType, Phone {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79703a;

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

            public Phone(String phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                this.f79703a = phoneNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Phone) && Intrinsics.f(this.f79703a, ((Phone) obj2).f79703a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79703a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79703a);
            }
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default String m() {
            return "PAYID";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$ApmType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$P2PType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PayIdType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Phone;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Phone extends SendFromClipboardType {
        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default int getIcon() {
            return R$drawable.uikit_icn_24_smartphone;
        }

        default TextLocalisedClause r() {
            return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_phone_title, null, null, 14);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "Phone", "Email", "Cpf", "Cnpj", "PixRandomKey", "QrCode", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Cnpj;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Cpf;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$PixRandomKey;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$QrCode;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface PixType extends SendFromClipboardType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Cnpj;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cnpj implements PixType {

            @NotNull
            public static final Parcelable.Creator<Cnpj> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79704a;

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

            public Cnpj(String cnpjNumber) {
                Intrinsics.checkNotNullParameter(cnpjNumber, "cnpjNumber");
                this.f79704a = cnpjNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cnpj) && Intrinsics.f(this.f79704a, ((Cnpj) obj2).f79704a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_national_id;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_cnpj_title, null, null, 14);
            }

            public final int hashCode() {
                return this.f79704a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79704a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Cpf;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cpf implements PixType {

            @NotNull
            public static final Parcelable.Creator<Cpf> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79705a;

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

            public Cpf(String cpfNumber) {
                Intrinsics.checkNotNullParameter(cpfNumber, "cpfNumber");
                this.f79705a = cpfNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cpf) && Intrinsics.f(this.f79705a, ((Cpf) obj2).f79705a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_national_id;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_cpf_title, null, null, 14);
            }

            public final int hashCode() {
                return this.f79705a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79705a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Email;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Email;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Email implements PixType, Email {

            @NotNull
            public static final Parcelable.Creator<Email> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79706a;

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

            public Email(String emailAddress) {
                Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
                this.f79706a = emailAddress;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Email) && Intrinsics.f(this.f79706a, ((Email) obj2).f79706a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79706a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79706a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$Phone;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$Phone;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Phone implements PixType, Phone {

            @NotNull
            public static final Parcelable.Creator<Phone> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79707a;

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

            public Phone(String phoneNumber) {
                Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                this.f79707a = phoneNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Phone) && Intrinsics.f(this.f79707a, ((Phone) obj2).f79707a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final /* bridge */ /* synthetic */ TextLocalisedClause getTitle() {
                return r();
            }

            public final int hashCode() {
                return this.f79707a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79707a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$PixRandomKey;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class PixRandomKey implements PixType {

            @NotNull
            public static final Parcelable.Creator<PixRandomKey> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79708a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new PixRandomKey(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new PixRandomKey[i];
                }
            }

            public PixRandomKey(String key) {
                Intrinsics.checkNotNullParameter(key, "key");
                this.f79708a = key;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof PixRandomKey) && Intrinsics.f(this.f79708a, ((PixRandomKey) obj2).f79708a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_avatar_grid;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_random_key_title, null, null, 14);
            }

            public final int hashCode() {
                return this.f79708a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79708a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType$QrCode;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$PixType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class QrCode implements PixType {

            @NotNull
            public static final Parcelable.Creator<QrCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79709a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new QrCode(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new QrCode[i];
                }
            }

            public QrCode(String rawQrValue) {
                Intrinsics.checkNotNullParameter(rawQrValue, "rawQrValue");
                this.f79709a = rawQrValue;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof QrCode) && Intrinsics.f(this.f79709a, ((QrCode) obj2).f79709a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_qr_code;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_clipboard_bottom_sheet_ambiguous_qr_code_title, null, null, 14);
            }

            public final int hashCode() {
                return this.f79709a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79709a);
            }
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default String m() {
            return "PIX";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$UpiType;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType;", "UpiId", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$UpiType$UpiId;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface UpiType extends SendFromClipboardType {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$UpiType$UpiId;", "Lcom/revolut/feature/payments/send_from_clipboard/api/model/SendFromClipboardType$UpiType;", "", "toString", "()Ljava/lang/String;", "feature_payments_send_from_clipboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpiId implements UpiType {

            @NotNull
            public static final Parcelable.Creator<UpiId> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f79710a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UpiId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UpiId[i];
                }
            }

            public UpiId(String upiId) {
                Intrinsics.checkNotNullParameter(upiId, "upiId");
                this.f79710a = upiId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof UpiId) && Intrinsics.f(this.f79710a, ((UpiId) obj2).f79710a);
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final int getIcon() {
                return R$drawable.uikit_icn_24_upi;
            }

            @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
            public final TextLocalisedClause getTitle() {
                return new TextLocalisedClause(R$string.payments_from_clipboard_upi_send_via_upi, null, null, 14);
            }

            public final int hashCode() {
                return this.f79710a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f79710a);
            }
        }

        @Override // com.revolut.feature.payments.send_from_clipboard.api.model.SendFromClipboardType
        default String m() {
            return "UPI";
        }
    }

    int getIcon();

    TextLocalisedClause getTitle();

    String m();
}
