package qu1;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.blik.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements cli.n {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f249190a;

    public r(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f249190a = phoneToolsProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        qv0.i model;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        String str = domainState.f249174a;
        z80.b bVar = this.f249190a;
        if (str != null) {
            model = new RowDelegate.Model("ID_ITEM_REGISTERED_PHONE", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_smartphone, null, null, 6), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 60), new TextLocalisedClause(R$string.blik_settings_phone_number_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.blik_settings_phone_number_registered_subtitle, u.c(z80.b.b(bVar, str, null, null, 6)), null, 12), null, null, 0, null, true, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        } else {
            model = new ActionWidgetDelegate.Model("ID_ITEM_REGISTER_PROMPT", new TextLocalisedClause(R$string.blik_settings_phone_number_title, null, null, 14), new TextLocalisedClause(R$string.blik_register_phone_prompt_description_with_placeholder, u.c(z80.b.b(bVar, domainState.f249175b, null, null, 6)), null, 12), new com.revolut.core.ui_kit.delegates.m(new GlyphImage(R$drawable.uikit_icn_24_smartphone, null, null, 6), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.blik_register_phone_prompt_button_title, null, null, 14), null, false), com.revolut.core.ui_kit.delegates.q.REGULAR, null, null, false, 8080);
        }
        eVarB.addAll(yp0.b.i(model, new ListSubheaderDelegate.Model("ID_HEADER_GET_PAID_VIA", (Image) null, (Clause) new TextLocalisedClause(R$string.blik_settings_get_paid_via_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        return new c(u.a(eVarB));
    }
}
