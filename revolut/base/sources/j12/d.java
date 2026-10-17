package j12;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import nii.g0;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements v02.c {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v02.a f170113a;

    public d(v02.a aliasMapper) {
        Intrinsics.checkNotNullParameter(aliasMapper, "aliasMapper");
        this.f170113a = aliasMapper;
    }

    public final k a(AliasType type) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(type, "type");
        String strConcat = "ID_TOAST_DEREGISTER_".concat(type.f61891a);
        if (type.equals(AliasType.PHONE.f61895b)) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_deregister_dialog_success_phone, null, null, 14);
        } else if (type.equals(AliasType.EMAIL.f61894b) || type.equals(AliasType.REVTAG_EMAIL.f61896b)) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_deregister_dialog_success_email, null, null, 14);
        } else {
            if (!type.equals(AliasType.TAX_NUMBER.f61897b) && !type.equals(AliasType.DOCUMENT_ID.f61893b)) {
                if (!type.equals(AliasType.ALPHANUMERIC.f61892b)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException(type + " is not supported");
            }
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_deregister_dialog_success_tax_number, null, null, 14);
        }
        return new k(strConcat, textLocalisedClause, null, null, null, 28);
    }

    public final y0 b() {
        return new y0(null, new z(new TextLocalisedClause(R.string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5);
    }

    public final y0 c() {
        return new y0("ID_DIALOG_IN_USE", new z(new TextLocalisedClause(R$string.apm_alias_register_dialog_in_use_title, null, null, 14), new TextLocalisedClause(R$string.apm_alias_register_dialog_in_use_subtitle, null, null, 14), new TextLocalisedClause(R$string.apm_alias_register_dialog_in_use_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final y0 d(Clause clause) {
        return new y0("ID_DIALOG_PENDING_DEREG", new g0(clause != null ? new TextLocalisedClause(R$string.apm_alias_deregister_dialog_pending_title, u.c(clause), null, 12) : new TextLocalisedClause(R$string.apm_alias_deregister_dialog_pending_title_generic, null, null, 14), new TextLocalisedClause(R$string.apm_alias_deregister_dialog_pending_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.apm_alias_deregister_dialog_pending_action, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4);
    }

    public final y0 e(TextLocalisedClause textLocalisedClause) {
        return new y0("ID_DIALOG_PENDING_REG", new g0(new TextLocalisedClause(R$string.apm_alias_register_dialog_pending_title, u.c(textLocalisedClause), null, 12), new TextLocalisedClause(R$string.apm_alias_register_dialog_pending_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.apm_alias_register_dialog_pending_action, null, null, 14), null, null, null, null, false, null, false, null, 16372), false, 4);
    }

    public final y0 f(TextLocalisedClause apmName) {
        Intrinsics.checkNotNullParameter(apmName, "apmName");
        return new y0("ID_DIALOG_PHONE_IN_USE", new z(new TextLocalisedClause(R$string.apm_alias_ownership_claim_dialog_title, null, null, 14), new TextLocalisedClause(R$string.apm_alias_ownership_claim_dialog_description, u.c(apmName), null, 12), new TextLocalisedClause(R$string.apm_alias_ownership_claim_dialog_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4);
    }

    public final k g(AliasType type) {
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(type, "type");
        String strConcat = "ID_TOAST_REGISTER_".concat(type.f61891a);
        if (type.equals(AliasType.PHONE.f61895b)) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_register_dialog_success_phone, null, null, 14);
        } else if (type.equals(AliasType.EMAIL.f61894b) || type.equals(AliasType.REVTAG_EMAIL.f61896b)) {
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_register_dialog_success_email, null, null, 14);
        } else {
            if (!type.equals(AliasType.TAX_NUMBER.f61897b) && !type.equals(AliasType.DOCUMENT_ID.f61893b)) {
                if (!type.equals(AliasType.ALPHANUMERIC.f61892b)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException(type + " is not supported");
            }
            textLocalisedClause = new TextLocalisedClause(R$string.apm_alias_register_dialog_success_tax_number, null, null, 14);
        }
        return new k(strConcat, textLocalisedClause, null, null, null, 28);
    }
}
