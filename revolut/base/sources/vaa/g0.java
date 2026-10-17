package vaa;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.pix.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g0 implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ty9.b f287193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tnb.g0 f287194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xaa.h f287195c;
    public final xaa.b d;
    public final xaa.f e;
    public final usc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xaa.g f287196g;

    public g0(ty9.b sendFromClipboardItemProvider, tnb.g0 actionsSectionMapper, xaa.h transactionsSectionMapper, xaa.b beneficiariesSectionMapper, xaa.f keysSectionMapper, usc.a bottomSectionMapper, xaa.g moreSectionMapper) {
        Intrinsics.checkNotNullParameter(sendFromClipboardItemProvider, "sendFromClipboardItemProvider");
        Intrinsics.checkNotNullParameter(actionsSectionMapper, "actionsSectionMapper");
        Intrinsics.checkNotNullParameter(transactionsSectionMapper, "transactionsSectionMapper");
        Intrinsics.checkNotNullParameter(beneficiariesSectionMapper, "beneficiariesSectionMapper");
        Intrinsics.checkNotNullParameter(keysSectionMapper, "keysSectionMapper");
        Intrinsics.checkNotNullParameter(bottomSectionMapper, "bottomSectionMapper");
        Intrinsics.checkNotNullParameter(moreSectionMapper, "moreSectionMapper");
        this.f287193a = sendFromClipboardItemProvider;
        this.f287194b = actionsSectionMapper;
        this.f287195c = transactionsSectionMapper;
        this.d = beneficiariesSectionMapper;
        this.e = keysSectionMapper;
        this.f = bottomSectionMapper;
        this.f287196g = moreSectionMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.pix_title, null, null, 14);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        z zVar = new z(textLocalisedClause, companion.i(R$drawable.uikit_icn_24_logo_pix_filled, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10));
        aim.e eVarB = zhm.u.b();
        eVarB.add(a12.j.a((a12.j) this.f287194b.f272384b, zhm.v.k(a.Send, a.Request, a.ScanQr, a.CopyPaste)));
        RowDelegate.Model modelA = ty9.b.a(this.f287193a);
        if (modelA != null) {
            eVarB.add(modelA);
        }
        Data data = domainState.f287199a;
        Intrinsics.checkNotNullParameter(data, "data");
        eVarB.addAll((List) iii.c.f(data, new x8i.h(13), new x48.a(25), new wp4.j0(this.e, 22)));
        Data beneficiariesData = domainState.f287200b;
        Intrinsics.checkNotNullParameter(beneficiariesData, "beneficiariesData");
        eVarB.addAll((List) iii.c.f(beneficiariesData, new x8i.h(12), new x48.a(24), new wp4.j0(this.d, 21)));
        Data data2 = domainState.f287201c;
        Intrinsics.checkNotNullParameter(data2, "data");
        eVarB.addAll((List) iii.c.f(data2, new x8i.h(14), new x48.a(26), new wp4.j0(this.f287195c, 23)));
        RowsWidgetDelegate.Model.Companion companion2 = RowsWidgetDelegate.Model.INSTANCE;
        BaseDynamicWidgetDelegate.BigHeaderModel bigHeaderModel = new BaseDynamicWidgetDelegate.BigHeaderModel("PIX_AREA_MORE_FROM_PIX_WIDGET_HEADER_ID", new TextLocalisedClause(R$string.pix_area_more_from_pix, null, null, 14), null, false, null, 48);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.pix_area_automatico_title, null, null, 14);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.pix_area_automatico_subtitle, null, null, 14);
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_calendar_recurring, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60);
        xaa.g gVar = this.f287196g;
        RowDelegate.Model[] elements = {new RowDelegate.Model("PIX_AUTOMATICO_ID", image40, textLocalisedClause2, null, 0, textLocalisedClause3, null, null, 0, gVar.f303799a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("TRANSACTION_LIMITS_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_limit, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.pix_limits_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pix_limits_subtitle, null, null, 14), null, null, 0, gVar.f303799a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("TRUSTED_PEOPLE_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_heart, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.pix_trusted_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pix_trusted_subtitle, null, null, 14), null, null, 0, gVar.f303799a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848), new RowDelegate.Model("PIX_AREA_DISPUTES_ID", new RowDelegate.Model.MainImage.Image40(companion.i(R$drawable.uikit_icn_24_document_search, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 60), new TextLocalisedClause(R$string.pix_area_disputes_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.pix_area_disputes_subtitle, null, null, 14), null, null, 0, gVar.f303799a, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        eVarB.add(RowsWidgetDelegate.Model.Companion.d(companion2, "PIX_AREA_MORE_FROM_PIX_WIDGET_ID", bigHeaderModel, kotlin.collections.d.L(elements), null, null, null, null, SyslogConstants.LOG_CLOCK));
        eVarB.addAll(((s12.f) ((a12.j) this.f.f282889b)).b(zhm.v.k(a.About, a.Help)));
        return new b0(zVar, zhm.u.a(eVarB));
    }
}
