package cb2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.payid.api.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(String str, LayeredImage layeredImage, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        return new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(layeredImage, null, null, false, null, false, 60), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        RowDelegate.Model modelA;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Alias alias = domainState.f22703a;
        Float fValueOf = Float.valueOf(24.0f);
        TextClause textClause = new TextClause(alias.f61879b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i2 = R$string.pay_id_details_subtitle;
        AliasType aliasType = alias.f61878a;
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
            i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_email;
        } else if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_mobile;
        } else {
            if (!Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
                if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) && !Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) && !Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException(aliasType + " unsupported");
            }
            i = com.revolut.feature.apm.core.api.R$string.alias_alias_type_revolut_address;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        AliasStatus aliasStatus = alias.f61880c;
        AliasStatus.ACTIVE active = AliasStatus.ACTIVE.f61885b;
        boolean zF = Intrinsics.f(aliasStatus, active);
        AliasStatus.DISABLED disabled = AliasStatus.DISABLED.f61888b;
        if (zF) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 10);
        } else {
            if (!Intrinsics.f(aliasStatus, disabled)) {
                throw new IllegalStateException("Unsupported alias status!");
            }
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_alias_status_disabled, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        }
        lw0.a aVar = new lw0.a(textClause, new TextLocalisedClause(i2, v.k(textLocalisedClause2, textLocalisedClause), null, 12), null, new lw0.k(new ImageClause(R$drawable.uikit_icn_16_copy, (Integer) null, fValueOf, fValueOf, 18), "MENU_ID_COPY_ACTION"), true, 4);
        Alias alias2 = domainState.f22703a;
        aim.e eVarB = u.b();
        AliasStatus aliasStatus2 = alias2.f61880c;
        if (Intrinsics.f(aliasStatus2, active)) {
            modelA = a("LIST_ID_FREEZE_ACTION", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_snowflake, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, null, null, 48), new TextLocalisedClause(R$string.pay_id_details_action_freeze_title, null, null, 14), new TextLocalisedClause(R$string.pay_id_details_action_freeze_subtitle, null, null, 14));
        } else {
            if (!Intrinsics.f(aliasStatus2, disabled)) {
                throw new IllegalStateException("Unsupported alias status!");
            }
            modelA = a("LIST_ID_UNFREEZE_ACTION", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_snowflake, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorForeground_10, 12.0f, null, null, 48), new TextLocalisedClause(R$string.pay_id_details_action_unfreeze_title, null, null, 14), new TextLocalisedClause(R$string.pay_id_details_action_unfreeze_subtitle, null, null, 14));
        }
        eVarB.add(modelA);
        eVarB.add(a("LIST_ID_DELETE_ACTION", LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_delete, Integer.valueOf(R$attr.uikit_colorRed), R$attr.uikit_colorRed_10, 12.0f, null, null, 48), new TextLocalisedClause(R$string.delete_pay_id_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10), new TextLocalisedClause(R$string.pay_id_details_action_delete_subtitle, null, null, 14)));
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return new cii.b(null, eVarA, aVar);
    }
}
