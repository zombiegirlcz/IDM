package j12;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasAttributes;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements v02.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f170111a;

    public a(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f170111a = phoneToolsProvider;
    }

    public final int a(AliasType aliasType) {
        Intrinsics.checkNotNullParameter(aliasType, "aliasType");
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return R$drawable.uikit_icn_24_smartphone;
        }
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
            return R$drawable.uikit_icn_24_envelope;
        }
        if (Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            return R$drawable.uikit_icn_24_revolut;
        }
        if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b)) {
            if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                return R$drawable.uikit_icn_24_passkey;
            }
            throw new NoWhenBranchMatchedException();
        }
        return R$drawable.uikit_icn_24_national_id;
    }

    public final TextLocalisedClause b(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        AliasAttributes aliasAttributes = alias.d;
        if (aliasAttributes.d != null) {
            return new TextLocalisedClause(R$string.apm_alias_status_claimed, null, null, 14);
        }
        AliasStatus aliasStatus = alias.f61880c;
        if (aliasStatus instanceof AliasStatus.ACTIVE) {
            return aliasAttributes.e == zz1.b.SEND_ONLY ? new TextLocalisedClause(R$string.apm_settings_alias_send_only, null, null, 14) : new TextLocalisedClause(R$string.apm_alias_status_active, null, null, 14);
        }
        if (aliasStatus instanceof AliasStatus.AVAILABLE) {
            return new TextLocalisedClause(R$string.apm_alias_status_available, null, null, 14);
        }
        if (aliasStatus instanceof AliasStatus.PENDING) {
            return new TextLocalisedClause(R$string.apm_alias_status_pending, null, null, 14);
        }
        if (aliasStatus instanceof AliasStatus.DISABLED) {
            return new TextLocalisedClause(R$string.apm_alias_status_disabled, null, null, 14);
        }
        if (aliasStatus instanceof AliasStatus.BLOCKED) {
            return new TextLocalisedClause(R$string.apm_alias_status_blocked, null, null, 14);
        }
        if (!(aliasStatus instanceof AliasStatus.OCCUPIED)) {
            throw new NoWhenBranchMatchedException();
        }
        String str = ((AliasStatus.OCCUPIED) aliasStatus).f61889b;
        return str != null ? new TextLocalisedClause(R$string.apm_alias_status_occupied_with_bank, u.c(str), null, 12) : new TextLocalisedClause(R$string.apm_alias_status_occupied, null, null, 14);
    }

    public final TextLocalisedClause c(AliasType aliasType) {
        Intrinsics.checkNotNullParameter(aliasType, "aliasType");
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return new TextLocalisedClause(R$string.apm_alias_kind_phone, null, null, 14);
        }
        if (!Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) && !Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            if (Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b)) {
                return new TextLocalisedClause(R$string.apm_alias_kind_tax_number, null, null, 14);
            }
            if (Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b)) {
                return new TextLocalisedClause(R$string.apm_alias_kind_document, null, null, 14);
            }
            if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                return new TextLocalisedClause(R$string.apm_alias_kind_generic, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(R$string.apm_alias_kind_email, null, null, 14);
    }

    public final TextClause d(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        if (!Intrinsics.f(alias.f61878a, AliasType.PHONE.f61895b)) {
            return new TextClause(alias.f61879b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextClause(z80.b.b(this.f170111a, alias.f61879b, null, null, 6), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
