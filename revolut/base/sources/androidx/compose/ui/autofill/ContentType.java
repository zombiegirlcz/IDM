package androidx.compose.ui.autofill;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/ContentType;", "", "Companion", "Landroidx/compose/ui/autofill/AndroidContentType;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ContentType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bK\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u0017\u0010'\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u0017\u0010/\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u0017\u00105\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u0017\u00107\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u0017\u00109\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u0017\u0010;\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u0017\u0010=\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u0017\u0010?\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u0006\u001a\u0004\bB\u0010\bR\u0017\u0010C\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u0006\u001a\u0004\bD\u0010\bR\u0017\u0010E\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u0006\u001a\u0004\bF\u0010\bR\u0017\u0010G\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\bN\u0010\b¨\u0006O"}, d2 = {"Landroidx/compose/ui/autofill/ContentType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/autofill/ContentType;", "Username", "Landroidx/compose/ui/autofill/ContentType;", "getUsername", "()Landroidx/compose/ui/autofill/ContentType;", "Password", "getPassword", "EmailAddress", "getEmailAddress", "NewUsername", "getNewUsername", "NewPassword", "getNewPassword", "PostalAddress", "getPostalAddress", "PostalCode", "getPostalCode", "CreditCardNumber", "getCreditCardNumber", "CreditCardSecurityCode", "getCreditCardSecurityCode", "CreditCardExpirationDate", "getCreditCardExpirationDate", "CreditCardExpirationMonth", "getCreditCardExpirationMonth", "CreditCardExpirationYear", "getCreditCardExpirationYear", "CreditCardExpirationDay", "getCreditCardExpirationDay", "AddressCountry", "getAddressCountry", "AddressRegion", "getAddressRegion", "AddressLocality", "getAddressLocality", "AddressStreet", "getAddressStreet", "AddressAuxiliaryDetails", "getAddressAuxiliaryDetails", "PostalCodeExtended", "getPostalCodeExtended", "PersonFullName", "getPersonFullName", "PersonFirstName", "getPersonFirstName", "PersonLastName", "getPersonLastName", "PersonMiddleName", "getPersonMiddleName", "PersonMiddleInitial", "getPersonMiddleInitial", "PersonNamePrefix", "getPersonNamePrefix", "PersonNameSuffix", "getPersonNameSuffix", "PhoneNumber", "getPhoneNumber", "PhoneNumberDevice", "getPhoneNumberDevice", "PhoneCountryCode", "getPhoneCountryCode", "PhoneNumberNational", "getPhoneNumberNational", "Gender", "getGender", "BirthDateFull", "getBirthDateFull", "BirthDateDay", "getBirthDateDay", "BirthDateMonth", "getBirthDateMonth", "BirthDateYear", "getBirthDateYear", "SmsOtpCode", "getSmsOtpCode", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContentType Username = ContentType_androidKt.ContentType("username");

        @NotNull
        private static final ContentType Password = ContentType_androidKt.ContentType("password");

        @NotNull
        private static final ContentType EmailAddress = ContentType_androidKt.ContentType("emailAddress");

        @NotNull
        private static final ContentType NewUsername = ContentType_androidKt.ContentType("newUsername");

        @NotNull
        private static final ContentType NewPassword = ContentType_androidKt.ContentType("newPassword");

        @NotNull
        private static final ContentType PostalAddress = ContentType_androidKt.ContentType("postalAddress");

        @NotNull
        private static final ContentType PostalCode = ContentType_androidKt.ContentType("postalCode");

        @NotNull
        private static final ContentType CreditCardNumber = ContentType_androidKt.ContentType("creditCardNumber");

        @NotNull
        private static final ContentType CreditCardSecurityCode = ContentType_androidKt.ContentType("creditCardSecurityCode");

        @NotNull
        private static final ContentType CreditCardExpirationDate = ContentType_androidKt.ContentType("creditCardExpirationDate");

        @NotNull
        private static final ContentType CreditCardExpirationMonth = ContentType_androidKt.ContentType("creditCardExpirationMonth");

        @NotNull
        private static final ContentType CreditCardExpirationYear = ContentType_androidKt.ContentType("creditCardExpirationYear");

        @NotNull
        private static final ContentType CreditCardExpirationDay = ContentType_androidKt.ContentType("creditCardExpirationDay");

        @NotNull
        private static final ContentType AddressCountry = ContentType_androidKt.ContentType("addressCountry");

        @NotNull
        private static final ContentType AddressRegion = ContentType_androidKt.ContentType("addressRegion");

        @NotNull
        private static final ContentType AddressLocality = ContentType_androidKt.ContentType("addressLocality");

        @NotNull
        private static final ContentType AddressStreet = ContentType_androidKt.ContentType("streetAddress");

        @NotNull
        private static final ContentType AddressAuxiliaryDetails = ContentType_androidKt.ContentType("extendedAddress");

        @NotNull
        private static final ContentType PostalCodeExtended = ContentType_androidKt.ContentType("extendedPostalCode");

        @NotNull
        private static final ContentType PersonFullName = ContentType_androidKt.ContentType("personName");

        @NotNull
        private static final ContentType PersonFirstName = ContentType_androidKt.ContentType("personGivenName");

        @NotNull
        private static final ContentType PersonLastName = ContentType_androidKt.ContentType("personFamilyName");

        @NotNull
        private static final ContentType PersonMiddleName = ContentType_androidKt.ContentType("personMiddleName");

        @NotNull
        private static final ContentType PersonMiddleInitial = ContentType_androidKt.ContentType("personMiddleInitial");

        @NotNull
        private static final ContentType PersonNamePrefix = ContentType_androidKt.ContentType("personNamePrefix");

        @NotNull
        private static final ContentType PersonNameSuffix = ContentType_androidKt.ContentType("personNameSuffix");

        @NotNull
        private static final ContentType PhoneNumber = ContentType_androidKt.ContentType("phoneNumber");

        @NotNull
        private static final ContentType PhoneNumberDevice = ContentType_androidKt.ContentType("phoneNumberDevice");

        @NotNull
        private static final ContentType PhoneCountryCode = ContentType_androidKt.ContentType("phoneCountryCode");

        @NotNull
        private static final ContentType PhoneNumberNational = ContentType_androidKt.ContentType("phoneNational");

        @NotNull
        private static final ContentType Gender = ContentType_androidKt.ContentType("gender");

        @NotNull
        private static final ContentType BirthDateFull = ContentType_androidKt.ContentType("birthDateFull");

        @NotNull
        private static final ContentType BirthDateDay = ContentType_androidKt.ContentType("birthDateDay");

        @NotNull
        private static final ContentType BirthDateMonth = ContentType_androidKt.ContentType("birthDateMonth");

        @NotNull
        private static final ContentType BirthDateYear = ContentType_androidKt.ContentType("birthDateYear");

        @NotNull
        private static final ContentType SmsOtpCode = ContentType_androidKt.ContentType("smsOTPCode");

        private Companion() {
        }

        @NotNull
        public final ContentType getEmailAddress() {
            return EmailAddress;
        }

        @NotNull
        public final ContentType getPassword() {
            return Password;
        }

        @NotNull
        public final ContentType getPhoneNumber() {
            return PhoneNumber;
        }
    }
}
