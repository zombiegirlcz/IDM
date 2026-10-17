package ew1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$plurals;
import com.revolut.feature.apm.breb.api.R$string;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasAttributes;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import ip0.y10;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f129999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sv1.a f130000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate.Model f130001c;
    public final RowDelegate.Model d;
    public final RowDelegate.Model e;
    public final RowDelegate.Model f;

    public o(l80.e dateProvider, sv1.a aliasUiMapper) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(aliasUiMapper, "aliasUiMapper");
        this.f129999a = dateProvider;
        this.f130000b = aliasUiMapper;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        this.f130001c = new RowDelegate.Model("REPLACE_KEY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_arrow_exchange, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bre_b_area_more_replace_key_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        this.d = new RowDelegate.Model("BLOCK_KEY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_reverted, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bre_b_area_more_block_key_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        this.e = new RowDelegate.Model("REACTIVATE_KEY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_lock_opened, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bre_b_area_more_reactivate_key_cta_button_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
        this.f = new RowDelegate.Model("REMOVE_KEY_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_delete, R$attr.uikit_colorStatusDanger, R$attr.uikit_colorStatusDanger_10), null, null, false, null, false, 62), new TextLocalisedClause(R$string.bre_b_area_more_remove_title, null, new Custom(new Custom.Color.Solid(R$attr.uikit_colorStatusDanger), false, false, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listE0;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(this.f130000b.a(domainState.f129987a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int i = R$string.bre_b_area_key_title_placeholder;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.bre_b_area_key_empty_title, null, null, 14);
        Alias alias = domainState.f129987a;
        lw0.a aVar = new lw0.a(textClause, new TextLocalisedClause(i, v.k(textLocalisedClause, new TextLocalisedClause(sv1.b.b(alias), null, null, 14)), null, 12), null, null, false, 28);
        AliasStatus aliasStatus = alias.f61880c;
        boolean zF = Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b);
        RowDelegate.Model model = this.f;
        if (zF) {
            listE0 = v.k(this.f130001c, this.d, model);
            yp0.b.k(listE0, 0, 0, 0, 0, 31);
        } else if (Intrinsics.f(aliasStatus, AliasStatus.DISABLED.f61888b)) {
            AliasAttributes aliasAttributes = alias.d;
            LocalDate localDateE = ((l80.f) this.f129999a).e();
            LocalDate localDatePlusDays = aliasAttributes.f61883c;
            Boolean bool = aliasAttributes.f61882b;
            if (localDatePlusDays == null) {
                localDatePlusDays = localDateE.plusDays(1L);
            }
            Intrinsics.h(localDatePlusDays);
            long jG = ebm.a.g(localDateE, localDatePlusDays);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.bre_b_area_more_reactivate_key_title, null, null, 14);
            Boolean bool2 = Boolean.TRUE;
            List listC = u.c(new sa("BLOCKED_WARNING_KEY_ID", (Clause) textLocalisedClause2, (Clause) new TextLocalisedQuantityClause(Intrinsics.f(bool, bool2) ? R$plurals.bre_b_area_more_reactivate_key_subtitle_extensible_with_number : R$plurals.bre_b_area_more_reactivate_key_subtitle_with_days, Long.valueOf(jG), u.c(Long.valueOf(jG)), (Style) null, 24), v.l(Intrinsics.f(bool, bool2) ? new ActionsView.Item("EXTEND_BLOCKING_PERIOD_ID", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(R$string.bre_b_area_more_reactivate_key_actions_extend_title, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_repeat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668) : null), false, (Image) new ResourceImage(R$drawable.uikit_icn_24_reverted, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), (y10) null, (Object) null, 4048));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            List listK = v.k(this.e, model);
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            listE0 = d0.E0(listK, listC);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("unsupported actions for alias status " + aliasStatus);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            listE0 = f0.f322471a;
        }
        return new k(listE0, aVar);
    }
}
