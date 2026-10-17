package com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub;

import android.os.Parcelable;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.a;
import et6.l0;
import g37.a0;
import g37.s;
import g37.t;
import j37.h;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j37.e f74298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.e f74299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f74300c;

    public f(j37.a bannerItemMapper, j37.e calendarEventItemMapper, gr6.e freelancerAvailabilityInteractor, h transactionItemMapper) {
        Intrinsics.checkNotNullParameter(bannerItemMapper, "bannerItemMapper");
        Intrinsics.checkNotNullParameter(calendarEventItemMapper, "calendarEventItemMapper");
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f74298a = calendarEventItemMapper;
        this.f74299b = freelancerAvailabilityInteractor;
        this.f74300c = transactionItemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        List listC;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s sVar = new s(new TextLocalisedClause(R$string.freelancer_tax_hub_hub_title, null, null, 14), v.k(new ActionsView.Item("LIST_ID_ACTION_PAY_TAXES", null, false, null, null, new TextLocalisedClause(R$string.freelancer_tax_hub_hub_action_pay_tax, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_coins, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670), new ActionsView.Item("LIST_ID_ACTION_EXPORT_TNXS", null, false, null, null, new TextLocalisedClause(R$string.freelancer_tax_hub_hub_action_export_transactions, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_download, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670)), v.l(((l0) this.f74299b).k() ? IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "LIST_ID_MENU_SETTINGS", new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124) : null));
        aim.e eVarB = u.b();
        a.C0495a data = domainState.f74285a;
        i iVar = domainState.f74286b;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.f74288a || data.f74289b) {
            listC = f0.f322471a;
        } else {
            listC = u.c(new ActionWidgetDelegate.Model("LIST_ID_TAX_POCKET_BANNER", new TextLocalisedClause(R$string.freelancer_tax_hub_hub_banner_tax_pocket_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_tax_hub_hub_banner_tax_pocket_subtitle, null, null, 14), new m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins_earning, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (LayeredImage) null, (ProgressStyle) null, 6), new ActionWidgetDelegate.Model.b.a(null), new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(R$string.freelancer_tax_hub_hub_banner_tax_pocket_action_get_started, null, null, 14), null, false), null, null, null, false, 8128));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        }
        eVarB.addAll(listC);
        if (iVar.d()) {
            Data data2 = (Data) iVar.c();
            Intrinsics.checkNotNullParameter(data2, "data");
            j37.e eVar = this.f74298a;
            eVarB.addAll((List) iii.c.f(data2, new j1.e(eVar, 21), new j0g.b(eVar, 16), new igh.o(eVar, 27)));
        }
        Data data3 = domainState.f74287c;
        Intrinsics.checkNotNullParameter(data3, "data");
        aim.e eVarB2 = u.b();
        eVarB2.add(new ListSubheaderDelegate.Model("LIST_ID_TRANSACTIONS_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(R$string.freelancer_tax_hub_hub_section_payments_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
        h hVar = this.f74300c;
        zhm.a0.x((Iterable) iii.c.f(data3, new j1.e(hVar, 23), new j2c.n(hVar, 2), new igh.o(hVar, 28)), eVarB2);
        eVarB.addAll(u.a(eVarB2));
        return new t(sVar, u.a(eVarB));
    }
}
