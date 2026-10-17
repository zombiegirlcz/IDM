package rrd;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.z;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final Object a(CustomAssetFieldDefinition customAssetFieldDefinition, Object value) {
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (c.f256813b[customAssetFieldDefinition.f99229c.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                int i = c.f256812a[customAssetFieldDefinition.f99228b.ordinal()];
                if (i == 1) {
                    String str = value instanceof String ? (String) value : null;
                    if (str != null && !d0.W(str)) {
                        return str;
                    }
                } else if (i == 2) {
                    Integer num = value instanceof Integer ? (Integer) value : null;
                    if (num != null) {
                        return num;
                    }
                    String str2 = value instanceof String ? (String) value : null;
                    if (str2 != null) {
                        StringBuilder sb6 = new StringBuilder();
                        int length = str2.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char cCharAt = str2.charAt(i2);
                            if (Character.isDigit(cCharAt)) {
                                sb6.append(cCharAt);
                            }
                        }
                        String string = sb6.toString();
                        if (string != null) {
                            return z.m(string);
                        }
                    }
                } else if (i != 3) {
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (value instanceof dj0.d) {
                    return (dj0.d) value;
                }
                return null;
            case 6:
                LocalDate localDate = value instanceof LocalDate ? (LocalDate) value : null;
                if (localDate != null) {
                    return localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
                }
                return null;
            case 7:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final TextLocalisedClause b(CustomAssetFieldDefinition customAssetFieldDefinition) {
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        String str = customAssetFieldDefinition.f99227a;
        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                if (sb6.length() > 0) {
                    sb6.append('_');
                }
                String strValueOf = String.valueOf(cCharAt);
                Intrinsics.i(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                sb6.append(lowerCase);
            } else {
                sb6.append(cCharAt);
            }
        }
        String string = sb6.toString();
        return new TextLocalisedClause(t61.a.p(string, "toString(...)", "analytics.total_wealth.custom_assets.field.", string), (List) null, (Clause) new TextClause(customAssetFieldDefinition.f99227a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22);
    }

    public static final TextLocalisedClause c(CustomAssetFieldDefinition customAssetFieldDefinition, String str, Set mileCountries, Set squareFootCountries) {
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        String str2 = customAssetFieldDefinition.f99227a;
        if (Intrinsics.f(str2, "floorArea")) {
            Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
            Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
            Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
            return new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_field_floor_area, u.c((str == null || !squareFootCountries.contains(str)) ? new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_sq_m, null, null, 14) : new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_sq_ft, null, null, 14)), null, 12);
        }
        if (!Intrinsics.f(str2, "mileage")) {
            return b(customAssetFieldDefinition);
        }
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        return new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_field_mileage, u.c((str == null || !mileCountries.contains(str)) ? new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_km, null, null, 14) : new TextLocalisedClause(R$string.analytics_total_wealth_custom_assets_label_mi, null, null, 14)), null, 12);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r10 == null) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.core.ui_kit.models.Clause d(com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rrd.d.d(com.revolut.retail.feature.api.custom_assets.models.CustomAssetFieldDefinition, java.util.Map):com.revolut.core.ui_kit.models.Clause");
    }

    public static final TextLocalisedClause e(CustomAssetFieldDefinition customAssetFieldDefinition, String option) {
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        Intrinsics.checkNotNullParameter(option, "option");
        return new TextLocalisedClause("analytics.total_wealth.custom_assets.option." + option, (List) null, (Clause) new TextClause(option, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, 22);
    }

    public static final List f(CustomAssetFieldDefinition customAssetFieldDefinition) {
        List listC;
        Object lengthFilter;
        Intrinsics.checkNotNullParameter(customAssetFieldDefinition, "<this>");
        Integer num = customAssetFieldDefinition.f;
        if (num != null) {
            int iIntValue = num.intValue();
            int i = c.f256812a[customAssetFieldDefinition.f99228b.ordinal()];
            if (i == 1) {
                lengthFilter = new InputFilter.LengthFilter(iIntValue);
                listC = u.c(lengthFilter);
            } else if (i == 2 || i == 3) {
                lengthFilter = new mp0.d(iIntValue, mp0.b.DIGITS);
                listC = u.c(lengthFilter);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                lengthFilter = new InputFilter.LengthFilter(iIntValue);
                listC = u.c(lengthFilter);
            }
        } else {
            listC = null;
        }
        return listC == null ? f0.f322471a : listC;
    }
}
