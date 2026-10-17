package uca;

import com.revolut.apm.pix.validation.api.PixIdentifiedType;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pix.api.ui.PixAliasResolveErrorDialogProvider$ActionableErrorDialogType;
import com.revolut.feature.pix.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.m0;
import nii.w;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import sf0.h;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements i8a.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f279015a;

    public c(h serverErrorParser) {
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f279015a = serverErrorParser;
    }

    public static w a(Integer num, PixIdentifiedType.Valid valid) {
        b bVar;
        b bVar2;
        int i;
        if (num != null && num.intValue() == 50100) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_new_recipient_error_not_found_title, null, null, 14);
            int i2 = R$string.pix_new_recipient_error_not_found_description;
            if (valid instanceof PixIdentifiedType.Valid.Cnpj) {
                i = R$string.pix_key_cnpj;
            } else if (valid instanceof PixIdentifiedType.Valid.Cpf) {
                i = R$string.pix_key_document;
            } else if (valid instanceof PixIdentifiedType.Valid.Email) {
                i = R$string.pix_key_email_lowercase;
            } else if (valid instanceof PixIdentifiedType.Valid.Phone) {
                i = R$string.pix_key_phone_lowercase;
            } else {
                if (!(valid instanceof PixIdentifiedType.Valid.Random)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.pix_key_random_lowercase;
            }
            bVar = new b(textLocalisedClause, new TextLocalisedClause(i2, u.c(new TextLocalisedClause(i, null, null, 14)), null, 12), Integer.valueOf(R$string.pix_new_recipient_error_button_check_pix_key), Integer.valueOf(R$string.pix_new_recipient_error_button_bank_details), PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS);
        } else {
            if (num != null && num.intValue() == 50101) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_rate_limit_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_rate_limit_description, null, null, 14), Integer.valueOf(R$string.pix_new_recipient_error_button_got_it), (PixAliasResolveErrorDialogProvider$ActionableErrorDialogType) null, 24);
            } else if (num != null && num.intValue() == 50102) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_own_account_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_own_account_description, null, null, 14), Integer.valueOf(R$string.pix_new_recipient_error_button_check_pix_key), Integer.valueOf(R$string.pix_new_recipient_error_button_bank_details), PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS);
            } else if (num != null && num.intValue() == 50103) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_invalid_alias_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_invalid_alias_description, null, null, 14), Integer.valueOf(R$string.pix_new_recipient_error_button_check_pix_key), Integer.valueOf(R$string.pix_new_recipient_error_button_bank_details), PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.DOUBLE_BUTTON_DISMISS_AND_BANK_DETAILS);
            } else if (num != null && num.intValue() == 50104) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_communication_failed_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_communication_failed_description, null, null, 14), Integer.valueOf(R$string.pix_new_recipient_error_button_try_again), PixAliasResolveErrorDialogProvider$ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN, 8);
            } else if (num != null && num.intValue() == 50108) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_fraud_risk_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_fraud_risk_description, null, null, 14), Integer.valueOf(R$string.pix_new_recipient_error_button_got_it), (PixAliasResolveErrorDialogProvider$ActionableErrorDialogType) null, 24);
            } else if (num != null && num.intValue() == 50109) {
                bVar2 = new b(new TextLocalisedClause(R$string.pix_new_recipient_error_restricted_key_title, null, null, 14), new TextLocalisedClause(R$string.pix_new_recipient_error_restricted_key_description, null, null, 14), (Integer) null, (PixAliasResolveErrorDialogProvider$ActionableErrorDialogType) null, 28);
            } else {
                bVar = null;
            }
            bVar = bVar2;
        }
        if (bVar == null) {
            return b();
        }
        TextLocalisedClause textLocalisedClause2 = bVar.f279012a;
        TextLocalisedClause textLocalisedClause3 = bVar.f279013b;
        Integer num2 = bVar.f279014c;
        TextLocalisedClause textLocalisedClause4 = num2 != null ? new TextLocalisedClause(num2.intValue(), null, null, 14) : null;
        Integer num3 = bVar.d;
        return new l0(textLocalisedClause2, textLocalisedClause3, null, textLocalisedClause4, num3 != null ? new TextLocalisedClause(num3.intValue(), null, null, 14) : null, bVar.e, false, null, 964);
    }

    public static z b() {
        return new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764);
    }

    public final y0 c(Throwable throwable, PixIdentifiedType.Valid valid) {
        m0 m0VarB;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (valid != null) {
            ServerError serverErrorA = this.f279015a.a(throwable);
            m0VarB = a(serverErrorA != null ? Integer.valueOf(serverErrorA.f51362a) : null, valid);
        } else {
            m0VarB = b();
        }
        return new y0("ERROR_DIALOG_ID", m0VarB, false, 4);
    }

    public final y0 d() {
        return new y0("ERROR_DIALOG_ID", new l0(new TextLocalisedClause(R$string.pix_new_recipient_error_not_found_title, null, null, 14), null, null, new TextLocalisedClause(R.string.common_action_update, null, null, 14), new TextLocalisedClause(R$string.pix_new_contact_key_not_found_send_via_revolut, null, null, 14), null, false, null, 998), false, 4);
    }

    public final y0 e() {
        return new y0("ERROR_DIALOG_ID", new l0(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_new_contact_dialog_not_found_title, u.c(new TextLocalisedClause(R$string.pix_title, null, null, 14)), null, 12), null, null, null, null, null, false, null, 1022), false, 4);
    }
}
