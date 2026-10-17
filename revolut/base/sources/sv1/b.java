package sv1;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class b {
    public static final int a(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "<this>");
        AliasType aliasType = alias.f61878a;
        if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
            return R$drawable.uikit_icn_24_passkey;
        }
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return R$drawable.uikit_icn_24_smartphone;
        }
        if (Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) || Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b)) {
            return R$drawable.uikit_icn_24_national_id;
        }
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            return R$drawable.uikit_icn_24_mail;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "<this>");
        AliasType aliasType = alias.f61878a;
        if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
            return R$string.bre_b_area_key_type_custom;
        }
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return R$string.bre_b_key_kind_phone_number;
        }
        if (Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) || Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b)) {
            return R$string.bre_b_key_kind_id_number;
        }
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            return R$string.bre_b_key_kind_email;
        }
        throw new NoWhenBranchMatchedException();
    }
}
