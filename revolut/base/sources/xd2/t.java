package xd2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.spin.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class t implements cli.n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static RowDelegate.Model a(Alias alias, TextLocalisedClause textLocalisedClause, CompositeClause compositeClause, CircleIconBadge circleIconBadge, pf pfVar) {
        int i;
        String strQ = j6.a.q("ITEM_ALIAS_ID_", alias.f61879b);
        AliasType aliasType = alias.f61878a;
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            i = R$drawable.uikit_icn_24_smartphone;
        } else if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
            i = R$drawable.uikit_icn_24_envelope;
        } else {
            if (!Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b)) {
                throw new IllegalStateException(aliasType + " unsupported!");
            }
            i = R$drawable.uikit_icn_24_national_id;
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(new GlyphImage(i, null, null, 6), circleIconBadge, null, false, null, false, 60), textLocalisedClause, null, 0, compositeClause, null, null, 0, pfVar, false, null, false, null, null, null, null, null, null, alias, null, 0, 0, 0, 0, 532675544);
    }

    public static int b(AliasType aliasType) {
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return R$string.spin_settings_phone_number_title;
        }
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b)) {
            return com.revolut.feature.apm.core.api.R$string.apm_alias_kind_email;
        }
        if (Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b)) {
            return R$string.spin_settings_tax_number_title;
        }
        throw new IllegalStateException(aliasType + " unsupported!");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new m((List) iii.c.f(domainState.f304240a, new n(1), new xce.d(1), new x0b.h(this, 7)));
    }
}
