package com.revolut.feature.statements.impl.tools.transactions;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.revolut.data.network.models.externalcards.ExternalCardDto;
import com.revolut.feature.statements.impl.tools.transactions.extras.InvestmentModel;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionCashbackBoxEmbeddedEntity;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionCounterpartDto;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionMerchantDtoKt;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionRecipientDto;
import com.revolut.feature.statements.impl.tools.transactions.extras.TransactionSenderDto;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import n8b.b;
import o8b.g;
import q61.a;

/* JADX INFO: loaded from: classes7.dex */
public final class TransactionExtraAttrsUtil {
    private static final String EXT_TRANSFER_LINK_EXPIRY = "ext_attr_transfer_link_expiry";
    public static final String EXT_ATTR_POS_TIME = "ext_attr_pos_time";
    private static final String EXT_ATTR_RECIPIENT_PHONE = "recipient.phone";
    public static final String EXT_ATTR_OFFLINE = "ext_attr_offline";
    public static final String EXT_ATTR_RATE = "transaction.rate";
    private static final String EXT_ATTR_DESCRIPTION = "description";

    private TransactionExtraAttrsUtil() {
    }

    private static String correctCityText(String str) {
        if (isValidName(str).booleanValue()) {
            return str;
        }
        return null;
    }

    private static String correctCountryText(String iso3CountryCode, b bVar) {
        String country;
        if (!isValidName(iso3CountryCode).booleanValue()) {
            return null;
        }
        if (!TextUtils.isEmpty(iso3CountryCode)) {
            if (iso3CountryCode.length() == 3) {
                g gVar = (g) bVar;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(iso3CountryCode, "iso3CountryCode");
                Locale locale = (Locale) ((Map) gVar.f222990b.getValue()).get(iso3CountryCode);
                if (locale != null && (country = locale.getCountry()) != null) {
                    iso3CountryCode = country;
                }
            }
            if (iso3CountryCode.length() <= 3 && iso3CountryCode.length() > 1) {
                String strA = ((g) bVar).a(iso3CountryCode.substring(0, 2));
                if (!TextUtils.isEmpty(strA)) {
                    return strA;
                }
            }
        }
        return iso3CountryCode;
    }

    public static String getAccountId(@NonNull TransactionDbModel transactionDbModel) {
        if (transactionDbModel.getExtras().account != null) {
            return transactionDbModel.getExtras().account.getId();
        }
        return null;
    }

    public static boolean getAutomatic(@NonNull TransactionDbModel transactionDbModel) {
        Boolean bool = transactionDbModel.automatic;
        return bool != null && bool.booleanValue();
    }

    public static ExternalCardDto getCard(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.extras.externalCard;
    }

    public static TransactionCashbackBoxEmbeddedEntity getCashbackBoxExtraModel(TransactionDbModel transactionDbModel) {
        return transactionDbModel.getExtras().cashbackBox;
    }

    public static TransactionCounterpartDto getCounterPart(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.extras.counterpart;
    }

    public static String getDescription(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.getExtraAttributes().get("description");
    }

    @NonNull
    private static String getExtraAttr(@NonNull TransactionDbModel transactionDbModel, String str) {
        Map<String, String> extraAttributes = transactionDbModel.getExtraAttributes();
        return extraAttributes.get(str) != null ? extraAttributes.get(str) : "";
    }

    public static InvestmentModel getInvestmentModel(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.extras.investment;
    }

    public static a getMerchant(@NonNull TransactionDbModel transactionDbModel) {
        return TransactionMerchantDtoKt.toDomain(transactionDbModel.extras.merchant);
    }

    public static String getMerchantCity(@NonNull TransactionDbModel transactionDbModel) {
        a merchant = getMerchant(transactionDbModel);
        if (merchant != null) {
            return correctCityText(merchant.d);
        }
        return null;
    }

    public static String getMerchantCountry(@NonNull TransactionDbModel transactionDbModel, b bVar) {
        a merchant = getMerchant(transactionDbModel);
        if (merchant != null) {
            return correctCountryText(merchant.e, bVar);
        }
        return null;
    }

    public static TransactionRecipientDto getRecipient(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.extras.recipient;
    }

    @NonNull
    public static String getRecipientPhone(@NonNull TransactionDbModel transactionDbModel) {
        return getExtraAttr(transactionDbModel, "recipient.phone");
    }

    public static TransactionSenderDto getSender(@NonNull TransactionDbModel transactionDbModel) {
        return transactionDbModel.extras.sender;
    }

    private static Boolean isValidName(String str) {
        return str == null ? Boolean.FALSE : Boolean.valueOf(Pattern.compile("^[a-zA-Z]+(?:[\\s-][a-zA-Z]+)*$").matcher(str).matches());
    }

    public static void setExpiryTimestamp(TransactionDbModel transactionDbModel, Long l2) {
        transactionDbModel.getExtraAttributes().put("ext_attr_transfer_link_expiry", String.valueOf(l2));
    }
}
