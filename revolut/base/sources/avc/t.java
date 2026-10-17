package avc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImageTint;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.security_hub.api.R$string;
import h93.f0;
import h93.h0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xtc.c f10007a;

    public t(xtc.c securityHubCardItemMapper) {
        Intrinsics.checkNotNullParameter(securityHubCardItemMapper, "securityHubCardItemMapper");
        this.f10007a = securityHubCardItemMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f0 f0Var = domainState.f9995a;
        List listC = u.c(this.f10007a.a(f0Var, false, h0.e(f0Var) ? new TextLocalisedClause(R$string.security_hub_lost_card_screen_card_cell_frozen_subtitle, null, null, 14) : null));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List list = listC;
        f0 f0Var2 = domainState.f9995a;
        return new n(d0.E0(yp0.b.g(v.k(new RowDelegate.Model("FREEZE_CARD_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_snowflake, null, null, 6), null, null, false, null, false, 62), h0.e(f0Var2) ? new TextLocalisedClause(R$string.security_hub_lost_card_screen_unfreeze_title, null, null, 14) : new TextLocalisedClause(R$string.security_hub_lost_card_screen_freeze_title, null, null, 14), null, 0, h0.e(f0Var2) ? new TextLocalisedClause(R$string.security_hub_lost_card_screen_unfreeze_subtitle, null, null, 14) : new TextLocalisedClause(R$string.security_hub_lost_card_screen_freeze_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, h0.e(f0Var2) ? l.f10000a : j.f9998a, null, 0, 0, 0, 0, 532676568), new RowDelegate.Model("TERMINATE_CARD_BUTTON_ID", new RowDelegate.Model.MainImage.Image40(new GlyphImage(R$drawable.uikit_icn_24_trash, GlyphImageTint.DANGER.f59929a, null, 4), null, null, false, null, false, 62), new TextLocalisedClause(R$string.security_hub_lost_card_screen_terminate_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), null, 0, new TextLocalisedClause(R$string.security_hub_lost_card_screen_terminate_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, k.f9999a, null, 0, 0, 0, 0, 532676568)), new ListSubheaderDelegate.Model("CARD_ACTIONS_BLOCK_LIST_ID", (Image) null, (Clause) new TextLocalisedClause(R$string.security_hub_lost_card_screen_options_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), list));
    }
}
