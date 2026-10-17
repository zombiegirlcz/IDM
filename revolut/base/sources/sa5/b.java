package sa5;

import aim.e;
import android.os.Parcelable;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import ch.qos.logback.core.net.SyslogConstants;
import chh.j;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.a6;
import com.revolut.core.ui_kit.delegates.jf;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.sf;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.x4;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.acquiring.pro_merchant.toggles.api.model.FreelancerPluginType;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_driven_limits.api.model.RestrictedAmount;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b;
import com.revolut.feature.backend_driven_limits.impl.v2.ui.list.c;
import com.revolut.feature.credit.post_termination_plan.api.models.CreditPostTerminationPlanDetails;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiApplications;
import com.revolut.feature.external_accounts.impl.domain.india.upi.model.IndiaUpiProvider;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.impl.ui.ecommerce.manage.details.FreelancerPluginDetailsScreenContract$InputData;
import com.revolut.feature.revolutpay.shipping.api.domain.models.deliverymethod.DeliveryMethods;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.Template;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPointsOptions;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftPriceBreakdown;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.R$string;
import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import com.revolut.shared.feature.wealth.models.trading_accounts.Beneficiary;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import h30.l;
import il2.i;
import ip0.lr;
import ip0.qd0;
import ip0.tg;
import ip0.vd0;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import mx0.pc;
import ofm.q;
import om4.e4;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jmrtd.lds.LDSFile;
import qv0.i;
import snc.f;
import spc.h;
import sui.o;
import sv4.m;
import szb.k;
import t18.t;
import t44.n;
import whf.p;
import yoc.g;
import yp0.r;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f261294b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f261293a = i;
        this.f261294b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0267  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.NumberClause$Format$Compact, com.revolut.core.ui_kit.models.Style, java.lang.Integer, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj2, Object obj3, Object obj4) {
        snc.a aVar = (snc.a) this.f261294b;
        Template template = (Template) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(template, "currentTemplate");
        TextClause textClauseG = aVar.f264497a.g(template);
        Intrinsics.checkNotNullParameter(template, "template");
        return new f(v1.c.f(v.k(textClauseG, g.a(template.f95707b)), null));
    }

    private final Object c(Object obj2, Object obj3, Object obj4) {
        Integer numA;
        h hVar = (h) this.f261294b;
        xdh.b content = (xdh.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (content == xdh.b.NO_REBALANCE || (numA = hVar.f264948a.a(content)) == null) {
            return null;
        }
        return yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new ImageClause(R$drawable.uikit_icn_16_time, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), new TextLocalisedClause(numA.intValue(), null, null, 14)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 ss4.q, still in use, count: 2, list:
          (r3v5 ss4.q) from 0x0071: MOVE (r31v0 ss4.q) = (r3v5 ss4.q)
          (r3v5 ss4.q) from 0x0082: MOVE (r31v2 ss4.q) = (r3v5 ss4.q)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object d(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    private final Object g(Object obj2, Object obj3, Object obj4) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        nw0.a aVar;
        tg tgVar;
        int i;
        ?? r110 = ((o) this.f261294b).f265788a;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        AsftConfig config = (AsftConfig) pair.f186385a;
        List<AsftTerminal> list = (List) pair.f186386b;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (AsftTerminal terminal : list) {
            String str = terminal.f98744m;
            AsftPriceBreakdown asftPriceBreakdown = terminal.k;
            if (str == null) {
                str = asftPriceBreakdown.e;
            }
            if (str != null) {
                textLocalisedClause = new TextLocalisedClause(R$string.asft_terminals_card_price_for_you, null, null, 14);
                textLocalisedClause2 = new TextLocalisedClause(R$string.asft_terminals_card_price_with_plan, v.k(ivi.b.a(asftPriceBreakdown.f98734a), str), null, 12);
            } else {
                textLocalisedClause = new TextLocalisedClause(R$string.asft_terminals_card_price, null, null, 14);
                textLocalisedClause2 = new TextLocalisedClause(R$string.asft_terminals_card_traveller_price, u.c(ivi.b.a(asftPriceBreakdown.f98734a)), null, 12);
            }
            TextLocalisedClause textLocalisedClause4 = textLocalisedClause2;
            TextLocalisedClause textLocalisedClause5 = textLocalisedClause;
            AsftPointsOptions asftPointsOptions = asftPriceBreakdown.f98735b;
            if (asftPointsOptions != null) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.asft_terminals_card_points, null, null, 14);
                aVar = new nw0.a(new BigDecimal(String.valueOf(asftPointsOptions.f98732a)), new MoneyClause(asftPointsOptions.f98733b, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12));
            } else {
                textLocalisedClause3 = null;
                aVar = null;
            }
            String strQ = j6.a.q("TERMINAL_ITEM_", terminal.f98737a);
            TextClause textClause = new TextClause(terminal.f98738b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause2 = new TextClause(d0.F0(terminal.d).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            e eVarB = u.b();
            if (terminal.e == 0) {
                eVarB.add(o.a(R$string.asft_terminals_card_tap_your_card_to_enter, (ResourceImage) r110.getValue()));
                eVarB.add(o.a(R$string.asft_terminals_card_noGuestBooking, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
                i = i2;
            } else {
                Integer num = terminal.i;
                eVarB.add(new tg((num == null || num.intValue() == 0) ? new TextLocalisedClause(R$string.asft_terminals_card_booking_period_unrestricted, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), i2) : new TextLocalisedClause(R$string.asft_terminals_card_booking_period_hours, u.c(num), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8), (ResourceImage) r110.getValue()));
                Integer num2 = terminal.f98742j;
                if (num2 != null) {
                    tgVar = new tg(num2.intValue() > 0 ? new TextLocalisedClause(R$string.asft_terminals_card_cancellation_period_hours, u.c(num2), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8) : new TextLocalisedClause(R$string.asft_terminals_card_cancellation_period_until_slot, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), (ResourceImage) r110.getValue());
                    i = 10;
                } else {
                    i = 10;
                    tgVar = new tg(new TextLocalisedClause(R$string.asft_terminals_card_cancellation_period_unavailable, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
                }
                eVarB.add(tgVar);
                eVarB.add(o.a(R$string.asft_terminals_card_guestBookingAvailable, (ResourceImage) r110.getValue()));
            }
            e eVarA = u.a(eVarB);
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(terminal, "terminal");
            int i3 = (terminal.f98739c <= 0 && !config.f98711b) ? 0 : R$drawable.uikit_icn_16_info_outline;
            ExtraLargeListingCardDelegate.Model model = new ExtraLargeListingCardDelegate.Model(strQ, null, textClause, textClause2, eVarA, textLocalisedClause5, i3, textLocalisedClause4, a6.SMALL, null, null, null, textLocalisedClause3, aVar, null, null, null, new TextLocalisedClause(R$string.asft_terminals_card_select, null, null, 14), null, true, terminal, 22781442);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            arrayList.add(model);
            i2 = i;
        }
        return arrayList;
    }

    private final Object h(Object obj2, Object obj3, Object obj4) {
        m mVar = (m) this.f261294b;
        e4 content = (e4) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        b9e.c cVar = content.f226566a;
        List listO = mVar.f265847a.o("id_credit_card_statement_all_upcoming_payments", cVar.f13735b.a(), cVar.d, cVar.f13734a, cVar.f13736c, false, false, cVar.e, content.f226567b);
        return listO == null ? f0.f322471a : listO;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        kxk.o oVar = (kxk.o) this.f261294b;
        sw6.f pluginDetails = (sw6.f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pluginDetails, "pluginDetails");
        e eVarB = u.b();
        FreelancerPluginType pluginType = ((FreelancerPluginDetailsScreenContract$InputData) oVar.f190612c).f73791a;
        String str = pluginDetails.f266117b.d;
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        eVarB.addAll(yp0.b.i(new RowDelegate.Model("LIST_ID_PLUGIN_INFO", new RowDelegate.Model.MainImage.Image40(vw6.b.b(pluginType), new AccentCircleBadge(dw0.a.Checked), null, false, null, false, 60), vw6.b.c(pluginType), null, 0, str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870872), new ListSubheaderDelegate.Model("LIST_ID_PLUGIN_INFO_SUBHEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_ecommerce_plugin_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126));
        eVarB.addAll(((vw6.b) oVar.f190611b).a(pluginDetails.f266116a, pluginDetails.f266118c));
        return u.a(eVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027a A[LOOP:0: B:83:0x0274->B:85:0x027a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r33, java.lang.Object r34, java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        sy6.f fVar = (sy6.f) this.f261294b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((FreelancerInvoiceSettings) obj2, "<unused var>");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_invoice_date_title, null, null, 14);
        sr6.a aVar = fVar.f266631b;
        InputTextDelegate.Model modelA = r.a(new InputTextDelegate.Model("ITEM_ID_SETTINGS_INVOICE_DATE", aVar != null ? q.N(aVar) : null, textLocalisedClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_due_date_title, null, null, 14);
        sr6.b bVar = fVar.d;
        InputTextDelegate.Model modelA2 = r.a(new InputTextDelegate.Model("ITEM_ID_SETTINGS_DUE_DATE", bVar != null ? q.M(bVar) : null, textLocalisedClause2, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554440, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA2, 0, 0, 0, 0, null, false, 63);
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_supply_date_title, null, null, 14);
        sr6.a aVar2 = fVar.f266632c;
        InputTextDelegate.Model modelA3 = r.a(new InputTextDelegate.Model("ITEM_ID_SETTINGS_SUPPLY_DATE", aVar2 != null ? q.N(aVar2) : null, textLocalisedClause3, null, false, null, false, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_settings_payment_schedules_input_supply_date_footer, null, null, 14), null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -33554568, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.l(modelA3, 0, 0, 0, 0, null, false, 63);
        return v.k(modelA, modelA2, modelA3);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        szb.c cVar = (szb.c) this.f261294b;
        yhm.r rVar = (yhm.r) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        i[] elements = {((Boolean) rVar.f314201a).booleanValue() ? k.a("ID_TRANSACTIONS_USAGE", R$drawable.uikit_icn_24_browser, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_transactions_usage_title, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_transactions_usage_subtitle, cVar.f266785b) : null, ((Boolean) rVar.f314202b).booleanValue() ? k.a("ID_REVOLUT_PRODUCTS_USAGE", R$drawable.uikit_icn_24_revolut, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_revolut_product_usage_title, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_revolut_product_usage_subtitle, cVar.d) : null, ((Boolean) rVar.f314203c).booleanValue() ? k.a("ID_REVPOINTS_PROFILE_USAGE", R$drawable.uikit_icn_24_rev_points_mono, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_rev_points_profile_usage_title, com.revolut.feature.rev_points.api.R$string.profile_privacy_rev_points_personalisation_rev_points_profile_usage_subtitle, cVar.f) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.revolut.core.ui_kit_core.displayers.image.models.UrlImage] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v5, types: [com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r17v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 q09.g0, still in use, count: 2, list:
          (r3v5 q09.g0) from 0x00bf: MOVE (r52v1 q09.g0) = (r3v5 q09.g0)
          (r3v5 q09.g0) from 0x0068: MOVE (r52v3 q09.g0) = (r3v5 q09.g0)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object n(java.lang.Object r52, java.lang.Object r53, java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.n(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        t0c.g gVar = (t0c.g) this.f261294b;
        y19.d savingsBottomSheet = (y19.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(savingsBottomSheet, "savingsBottomSheet");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_bottom_sheet_title, u.c(new TextClause(savingsBottomSheet.f310336b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
        Clause clauseA = gVar.f267001a.a(savingsBottomSheet.f310337c);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        String str = savingsBottomSheet.f310335a;
        int iA = gVar.f267002b.a(str);
        if (iA <= 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Icon ", str, " not found"));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            iA = R$drawable.uikit_icn_24_rev_points;
        }
        lw0.a aVar = new lw0.a(textLocalisedClause, clauseA, new lw0.b(LayeredImage.Companion.b(companion, iA, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 12.0f, Float.valueOf(38.0f), null, 32), null), null, false, 24);
        ArrayList arrayList = savingsBottomSheet.e;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object obj5 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            y19.b bVar = (y19.b) obj5;
            arrayList2.add(new CellDetailsDelegate.Model(a0.d.n("CONTENT_ITEM_ID_", i), new t0((Clause) new TextClause(bVar.f310331a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), new TextClause(bVar.f310332b, (Style) null, (Integer) null, false, o9.SENSITIVE, (List) null, LDSFile.EF_DG14_TAG), null, null, null, null, 0, null, false, false, null, null, 28664));
            i = i2;
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        y19.c cVar = savingsBottomSheet.d;
        return new cii.b(cVar != null ? new aw0.e(false, null, null, new n6(new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_trophy_room_bottom_sheet_cta, u.c(new TextClause(cVar.f310333a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55) : null, arrayList2, aVar);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        t18.u uVar = (t18.u) this.f261294b;
        List groupedInsights = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(groupedInsights, "groupedInsights");
        if (groupedInsights.isEmpty()) {
            return t18.u.a();
        }
        t tVar = uVar.f267232a;
        Intrinsics.checkNotNullParameter(groupedInsights, "groupedInsights");
        List<t18.r> list = groupedInsights;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (t18.r rVar : list) {
            LocalDate localDate = rVar.f267226a;
            List list2 = rVar.f267227b;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(l.s("INSIGHTS_GROUP_DATE_", localDate), (Image) null, (Clause) new TimeClause(((x08.f) zhm.d0.b0(list2)).f301534c.toEpochMilli(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp32, R$attr.uikit_dp16, 0, 0, 52202);
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(w.t(list3, 10));
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                arrayList2.add(tVar.f267231a.a((x08.f) it8.next()));
            }
            int i = R$attr.uikit_dp0;
            arrayList.add(yp0.b.g(arrayList2, model, null, i, i, 114));
        }
        List[] elements = {w.u(arrayList), zBooleanValue ? t18.u.b() : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return w.u(kotlin.collections.d.L(elements));
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        t44.f fVar = (t44.f) this.f261294b;
        List addresses = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(addresses, "addresses");
        boolean zA = fVar.e.a();
        n nVar = fVar.e;
        e eVarB = u.b();
        List list = addresses;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                eVarB.addAll(arrayList);
                eVarB.add(new SelectableDelegate.Model("id_my_address_not_here", new RowDelegate.Model("id_my_address_not_here_row", null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_application_address_v2_address_selection_my_address_not_here, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906), nVar instanceof t44.l ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, null, false, 32744));
                e eVarA = u.a(eVarB);
                yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                return t44.q.a(fVar, zA, eVarA);
            }
            Object next = it8.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            hv3.a aVar = (hv3.a) next;
            t44.k kVar = nVar instanceof t44.k ? (t44.k) nVar : null;
            String str = kVar != null ? kVar.f267883a.f155783a : null;
            String str2 = aVar.f155783a;
            Address address = aVar.f155784b;
            boolean zF = Intrinsics.f(str, str2);
            String strN = a0.d.n("id_address_", i);
            String strN2 = a0.d.n("id_address_row_", i);
            List listK = v.k(address.getStreetLine1(), address.getStreetLine2());
            ArrayList arrayList2 = new ArrayList();
            Iterator it9 = listK.iterator();
            while (it9.hasNext()) {
                Iterator it10 = it9;
                Object next2 = it10.next();
                String str3 = (String) next2;
                if (str3 != null && str3.length() > 0) {
                    arrayList2.add(next2);
                }
                it9 = it10;
            }
            TextClause textClause = new TextClause(zhm.d0.k0(arrayList2, null, null, null, 0, null, 63), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            List listK2 = v.k(address.getCity(), address.getPostcode());
            ArrayList arrayList3 = new ArrayList();
            for (Object obj5 : listK2) {
                String str4 = (String) obj5;
                if (str4 != null && str4.length() > 0) {
                    arrayList3.add(obj5);
                }
            }
            arrayList.add(new SelectableDelegate.Model(strN, new RowDelegate.Model(strN2, null, textClause, null, 0, new TextClause(zhm.d0.k0(arrayList3, null, null, null, 0, null, 63), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870874), zF ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, aVar, null, false, 32488));
            i = i2;
        }
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        t7b.a aVar = (t7b.a) this.f261294b;
        p transactionsContent = (p) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        ArrayList arrayListA = whf.n.a(aVar.f268626a, transactionsContent, null, null, null, 14);
        if (arrayListA.isEmpty()) {
            return f0.f322471a;
        }
        e eVarB = u.b();
        eVarB.add(new CellDetailsNoteDelegate.Model("list_id_linked_transaction", new TextLocalisedClause(com.revolut.retail.feature.cobranded.cards.impl.R$string.cobrand_transaction_details_linked_transaction_title, null, null, 14), null, null, null, false, null, null, null, null, null, 0, 131060));
        eVarB.addAll(arrayListA);
        e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0207  */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r63, java.lang.Object r64, java.lang.Object r65) {
        /*
            Method dump skipped, instruction units count: 869
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fd  */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r43, java.lang.Object r44, java.lang.Object r45) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa5.b.t(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object u(Object obj2, Object obj3, Object obj4) {
        ta8.i iVar = (ta8.i) this.f261294b;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter((List) obj2, "<unused var>");
        String str = iVar.d;
        String str2 = !d0.W(str) ? str : null;
        InputTextDelegate.Model model = new InputTextDelegate.Model("NINO_INPUT_LIST_ID", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_nino_item_hint, null, null, 14), true, null, false, iVar.f269161b ? new TextLocalisedClause(com.revolut.feature.junior.isa.impl.R$string.junior_trading_nino_item_error, null, null, 14) : null, null, null, null, null, null, false, null, null, iVar.f269161b, false, false, false, new lr(528385), 0, null, null, false, true, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -606208156, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new ta8.k(u.c(model), iVar.f269162c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29, types: [com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r25v10 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$MainImage] */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws Throwable {
        List listG;
        CellDetailsChevronDelegate.Model model;
        UUID uuid;
        Throwable th10;
        List listN;
        RowDelegate.Model model2;
        int i;
        int i2;
        List listC;
        int i3 = this.f261293a;
        RowDelegate.Model model3 = null;
        Object obj5 = this.f261294b;
        switch (i3) {
            case 0:
                CreditPostTerminationPlanDetails details = (CreditPostTerminationPlanDetails) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(details, "plan");
                Intrinsics.checkNotNullParameter(details, "details");
                e eVarB = u.b();
                eVarB.addAll(((c) obj5).a(details));
                return new ja5.a(yp0.b.g(u.a(eVarB), c.b(), null, 0, 0, 126));
            case 1:
                p transactionsContent = (p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                return whf.n.a(((sd3.n) obj5).f261824a, transactionsContent, null, new whf.i(true), null, 10);
            case 2:
                sec.b bVar = (sec.b) obj5;
                List deliveryMethods = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(deliveryMethods, "deliveryMethods");
                List<DeliveryMethods.DeliveryMethod> list = deliveryMethods;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (DeliveryMethods.DeliveryMethod deliveryMethod : list) {
                    String selectedDeliveryMethodId = bVar.f262166b.f84737a;
                    Intrinsics.checkNotNullParameter(deliveryMethod, "deliveryMethod");
                    Intrinsics.checkNotNullParameter(selectedDeliveryMethodId, "selectedDeliveryMethodId");
                    dj0.d dVar = deliveryMethod.f84739c;
                    String str = deliveryMethod.f84737a;
                    Clause textLocalisedClause = dVar.k() ? new TextLocalisedClause(com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_delivery_methods_free, null, null, 14) : new MoneyClause(deliveryMethod.f84739c, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
                    String str2 = deliveryMethod.f84737a;
                    TextClause textClause = new TextClause(deliveryMethod.f84738b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str3 = deliveryMethod.d;
                    RowDelegate.Model model4 = new RowDelegate.Model(str2, null, textClause, null, 0, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, null, 0, new RowDelegate.Model.c.b(textLocalisedClause, null, null, false, 126), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869850);
                    String strR = a0.d.r(str, "_selectable");
                    qd0 qd0Var = qd0.SELECTED;
                    if (!Intrinsics.f(str, selectedDeliveryMethodId)) {
                        qd0Var = null;
                    }
                    if (qd0Var == null) {
                        qd0Var = qd0.UNSELECTED;
                    }
                    arrayList.add(new SelectableDelegate.Model(strR, model4, qd0Var, null, vd0.RADIO, false, null, null, null, false, 32744));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                Address address = bVar.f262167c.f84741b;
                Intrinsics.checkNotNullParameter(address, "address");
                int i5 = com.revolut.feature.revolutpay.shipping.shared.R$string.revolut_pay_delivery_methods_subtitle;
                String streetLine1 = address.getStreetLine1();
                if (streetLine1 == null) {
                    streetLine1 = "";
                }
                return new sec.g(new TextLocalisedClause(i5, u.c(new TextClause(streetLine1, (Style) new Click(30, (Integer) null, (Object) null, "SELECTED_ADDRESS_ACTION_ID", false), Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, SyslogConstants.LOG_CLOCK)), null, 12), arrayList, true);
            case 3:
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return sef.i.b(((sef.f) obj5).f262188b);
            case 4:
                sek.u uVar = (sek.u) obj5;
                List content = (List) obj2;
                ((Boolean) obj3).getClass();
                Throwable th11 = (Throwable) obj4;
                Intrinsics.checkNotNullParameter(content, "content");
                if (th11 != null && content.isEmpty()) {
                    listG = iii.c.b(null, null, 6, false);
                } else if (content.isEmpty()) {
                    FullScreenStateDelegate.Model model5 = new FullScreenStateDelegate.Model("EMPTY_STATE_ITEM_LIST_ID", new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_list_empty_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D261", null, null, null, 30)), null, new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_list_empty_state_add_new, null, new Click(30, (Integer) null, (Object) null, "EMPTY_STATE_ITEM_CAPTION_ID", false), 10), false, null, null, false, 0, 0, 32660);
                    yp0.b.l(model5, 0, 0, 0, 0, null, false, 63);
                    listG = u.c(model5);
                } else {
                    boolean z = content.size() > 1;
                    List<PodNominee> listP0 = zhm.d0.P0(content, new sek.t());
                    ArrayList arrayList2 = new ArrayList(w.t(listP0, 10));
                    for (PodNominee podNominee : listP0) {
                        String str4 = podNominee.f102617a;
                        int i6 = podNominee.f102621h;
                        arrayList2.add(new RowDelegate.Model(j6.a.q("POD_NOMINEE_LIST_ID_PREFIX_", str4), new RowDelegate.Model.MainImage.Image40(new ContactImage((String) null, (String) null, (String) null, (String) null, (String) null, podNominee.d, (String) null, false, (StylableContactImage$ContactStyle) null, (ImageTransformations) null, (TextLocalisedClause) null, 4063), null, null, false, null, false, 62), new TextClause(podNominee.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, z ? new pf(new TextClause(a0.d.h(i6, "%"), (Style) null, Integer.valueOf(R$attr.uikit_colorAccent), false, (o9) null, (List) null, 122), new ResourceImage(R$drawable.uikit_icn_24_edit, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), h4.FLAT, false, null, null, 504) : new RowDelegate.Model.c.b(new TextClause(a0.d.h(i6, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 126), false, null, false, null, null, null, null, null, null, podNominee, null, 0, 0, 0, 0, 532675576));
                    }
                    listG = yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("POD_NOMINEE_LIST_SUBHEADER_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_list_subheader_title, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(com.revolut.retail.feature.pod_nominees.impl.R$string.pod_nominees_list_subheader_add, null, null, 14), true, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 261946), null, 0, 0, 126);
                }
                return new sek.n(listG, sek.u.b(), uVar.a());
            case 5:
                shh.i iVar = (shh.i) obj5;
                Pair pair = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                j jVar = (j) pair.f186385a;
                hel.b bVar2 = (hel.b) pair.f186386b;
                if (jVar instanceof chh.h) {
                    WealthAccount.TaxAdvantageWealthAccount taxAdvantageWealthAccount = ((chh.h) jVar).f24238a;
                    iVar.getClass();
                    ListSubheaderDelegate.Model modelA = shh.i.a(iVar.f263483a.h(n2l.l.a(taxAdvantageWealthAccount), bVar2, null));
                    TradingAccount.Portfolio d = taxAdvantageWealthAccount.getD();
                    if (d == null || (uuid = d.f105210a) == null) {
                        model = null;
                    } else {
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_action_close_account, null, null, 14);
                        int i21 = R$attr.uikit_colorRed;
                        String string = uuid.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        CellDetailsChevronDelegate.Model model6 = new CellDetailsChevronDelegate.Model("TAA_SETTINGS_CLOSE_ACCOUNT_BUTTON_LIST_ID", textLocalisedClause2, i21, false, new chh.k(string), null, null, YearClass.CLASS_2016);
                        yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
                        model = model6;
                    }
                    return i2b.a.r(modelA, model);
                }
                if (jVar instanceof chh.i) {
                    WealthAccount.TaxAdvantageWealthAccount.JIsa jIsa = ((chh.i) jVar).f24239a;
                    iVar.getClass();
                    Beneficiary f = jIsa.getF();
                    ListSubheaderDelegate.Model modelA2 = shh.i.a(new TextLocalisedClause(com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_personal_jisa_header, u.c(f.f105176b), null, 12));
                    String string2 = f.f105175a.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    RowDelegate.Model model7 = new RowDelegate.Model(string2, new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_logout_door, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6), new TextLocalisedClause(com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_personal_jisa_item_title, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, chh.f.f24235a, null, 0, 0, 0, 0, 532676600);
                    yp0.b.l(model7, 0, 0, 0, 0, null, false, 63);
                    return i2b.a.r(modelA2, model7);
                }
                if (!(jVar instanceof chh.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                chh.g gVar = (chh.g) jVar;
                iVar.getClass();
                Beneficiary f4 = gVar.f24236a.getF();
                int i22 = com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_jisa_header;
                String str5 = f4.f105176b;
                UUID uuid2 = f4.f105175a;
                ListSubheaderDelegate.Model modelA3 = shh.i.a(new TextLocalisedClause(i22, u.c(str5), null, 12));
                chh.d dVar2 = gVar.f24237b;
                String str6 = dVar2.f24234b;
                String str7 = dVar2.f24233a;
                TextLocalisedClause textLocalisedClause3 = d0.W(str6) ? new TextLocalisedClause(com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_jisa_item_subtitle, u.c(str7), null, 12) : new TextLocalisedClause(com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_jisa_item_subtitle_with_comma, v.k(str7, z80.b.b(iVar.f263484b, str6, null, null, 6)), null, 12);
                String string3 = uuid2.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.wealth.tax_advantage_account.impl.R$string.wealth_invest_settings_jisa_item_title, null, null, 14);
                RowDelegate.Model.MainImage.Image24 image24 = new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_profile, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), false, false, 6);
                String string4 = uuid2.toString();
                Intrinsics.checkNotNullExpressionValue(string4, "toString(...)");
                RowDelegate.Model model8 = new RowDelegate.Model(string3, image24, textLocalisedClause4, null, 0, textLocalisedClause3, null, null, 0, null, false, null, false, null, null, null, null, null, null, new chh.c(string4), null, 0, 0, 0, 0, 532676568);
                yp0.b.l(model8, 0, 0, 0, 0, null, false, 63);
                return i2b.a.r(modelA3, model8);
            case 6:
                ((h8b.b) obj5).invoke((Throwable) obj2);
                return Unit.f186387a;
            case 7:
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.e eVar = (com.revolut.feature.backend_driven_limits.impl.v2.ui.list.e) obj5;
                il2.i restrictionsResult = (il2.i) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(restrictionsResult, "restrictionsResult");
                boolean z3 = restrictionsResult instanceof il2.h;
                com.revolut.feature.backend_driven_limits.impl.v2.ui.list.b kVar = b.a.f63212a;
                if (!z3) {
                    if (Intrinsics.f(restrictionsResult, i.a.f162058a)) {
                        return new sl2.m(c.a.f63214a, kVar, u.c(new FullScreenStateDelegate.Model("NO_CONTENT_LIST_ID", new TextLocalisedClause(com.revolut.feature.backend_driven_limits.impl.R$string.fincrime_limits_empty_title, null, null, 14), null, new ComplexImage.Regular(new ResourceImage(R$drawable.uikit_icn_24_check_success, (Integer) null, (Integer) null, (Integer) null, (List) null, new ImageTransformations(null, null, null, gz0.b.CenterInside, null, 56, 56, 23), (Clause) null, 190)), null, null, false, null, null, false, 0, 0, 32756)));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                il2.g gVar2 = ((il2.h) restrictionsResult).f162057a;
                TextClause textClause2 = new TextClause(gVar2.f162054a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str8 = gVar2.f162055b;
                sl2.l lVar = new sl2.l(textClause2, str8 != null ? new TextClause(str8, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null);
                il2.a aVar = gVar2.e;
                String str9 = aVar != null ? aVar.f162042a : null;
                if (!eVar.f63222b.f63207b && str9 != null) {
                    kVar = new sl2.k(new TextClause(str9, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                e eVarB2 = u.b();
                il2.e eVar2 = gVar2.f162056c;
                if (eVar2 != null) {
                    CounterTextDelegate.Model.Companion companion = CounterTextDelegate.Model.INSTANCE;
                    List listK = v.k(new TextClause(eVar2.f162051a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_16_chevron_right_small, ImageClauseTint.TextColor.f57790a, (Float) null, (Float) null, 28));
                    m70.a.t(kotlin.jvm.internal.t0.f186434a);
                    x4 x4Var = new x4(new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12));
                    RestrictedAmount restrictedAmount = eVar2.f162052b;
                    th10 = null;
                    long j2 = restrictedAmount.f63196a;
                    xi0.a aVar2 = xi0.b.Companion;
                    String str10 = restrictedAmount.f63197b;
                    aVar2.getClass();
                    CounterTextDelegate.Model modelA4 = CounterTextDelegate.Model.Companion.a(companion, "COUNTER_LIST_ID", x4Var, new MoneyClause(new dj0.d(j2, xi0.a.a(str10)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, eVar2.f162053c, 0, 0, 3992);
                    yp0.b.l(modelA4, 0, 0, 0, 0, null, false, 63);
                    eVarB2.add(modelA4);
                } else {
                    th10 = null;
                }
                il2.d dVar3 = gVar2.d;
                if (dVar3 != null) {
                    String str11 = dVar3.f162049a;
                    if (str11 != null) {
                        eVarB2.add(new ListSubheaderDelegate.Model("SUB_HEADER_LIST_ID", (Image) null, (Clause) new TextClause(str11, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
                    }
                    ArrayList arrayList3 = dVar3.f162050b;
                    ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
                    int i32 = 0;
                    for (Object obj6 : arrayList3) {
                        int i33 = i32 + 1;
                        if (i32 < 0) {
                            v.s();
                            throw th10;
                        }
                        il2.b bVar3 = (il2.b) obj6;
                        String strN = a0.d.n("ITEM_LIST_ID", i32);
                        TextClause textClause3 = new TextClause(bVar3.f162044a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        TextClause textClause4 = new TextClause(bVar3.f162045b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                        String str12 = bVar3.f162046c;
                        yxc.l lVar2 = eVar.f63221a;
                        aal.b bVarA = lVar2.a(str12);
                        ?? image40 = bVarA != null ? new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(yxc.l.b(bVarA), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorGreyTone20), new DangerCircleBadge(dw0.a.Suspicious), null, false, null, false, 60) : th10;
                        tf tfVar = new tf(new yy0.j(new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246)), sf.TOP);
                        ArrayList<il2.c> arrayList5 = bVar3.e;
                        e eVarB3 = u.b();
                        for (il2.c cVar : arrayList5) {
                            tf tfVar2 = tfVar;
                            TextClause textClause5 = new TextClause(cVar.f162048b, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
                            aal.b bVarA2 = lVar2.a(cVar.f162047a);
                            eVarB3.add(new jf(textClause5, bVarA2 != null ? new ResourceImage(yxc.l.b(bVarA2), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, new ImageTransformations(null, null, null, null, null, 16, 16, 31), (Clause) null, 182) : th10));
                            tfVar = tfVar2;
                        }
                        RowDelegate.Model model9 = new RowDelegate.Model(strN, image40, textClause3, null, 0, textClause4, null, null, 0, tfVar, true, u.a(eVarB3), false, null, null, null, null, null, null, bVar3.f, null, 0, 0, 0, 0, 532669400);
                        yp0.b.l(model9, 0, 0, 0, 0, null, false, 63);
                        arrayList4.add(model9);
                        i32 = i33;
                    }
                    eVarB2.addAll(arrayList4);
                }
                return new sl2.m(lVar, kVar, u.a(eVarB2));
            case 8:
                IndiaUpiApplications appData = (IndiaUpiApplications) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(appData, "appData");
                String str13 = ((sm6.j) obj5).f264369b;
                if (str13.length() == 0) {
                    List list2 = appData.f72372a;
                    List list3 = appData.f72373b;
                    e eVarB4 = u.b();
                    if (!list2.isEmpty()) {
                        eVarB4.addAll(sm6.q.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_upi_selection_popular, "LIST_ID_POPULAR_APP_SUBHEADER", list2));
                    }
                    if (!list3.isEmpty()) {
                        eVarB4.addAll(sm6.q.d(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_upi_selection_other_apps, "LIST_ID_OTHER_APP_SUBHEADER", list3));
                    }
                    listN = c6d.b.N(u.a(eVarB4));
                } else {
                    ArrayList arrayListA = sm6.q.a(str13, appData.f72372a);
                    ArrayList arrayList6 = new ArrayList(w.t(arrayListA, 10));
                    Iterator it8 = arrayListA.iterator();
                    while (it8.hasNext()) {
                        arrayList6.add(sm6.q.b((IndiaUpiProvider) it8.next()));
                    }
                    ArrayList arrayListA2 = sm6.q.a(str13, appData.f72373b);
                    ArrayList arrayList7 = new ArrayList(w.t(arrayListA2, 10));
                    Iterator it9 = arrayListA2.iterator();
                    while (it9.hasNext()) {
                        arrayList7.add(sm6.q.b((IndiaUpiProvider) it9.next()));
                    }
                    e eVarB5 = u.b();
                    eVarB5.addAll(arrayList6);
                    eVarB5.addAll(arrayList7);
                    e eVarA = u.a(eVarB5);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    listN = c6d.b.N(eVarA);
                }
                if (listN != null) {
                    return listN;
                }
                FullScreenStateDelegate.Model model10 = new FullScreenStateDelegate.Model("LIST_ID_EMPTY_SEARCH", new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_upi_selection_no_results_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.external_accounts.impl.R$string.india_core_topup_upi_selection_no_results_subtitle, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_binoculars, null, null, 6)), null, zj.REGULAR, false, null, null, null, 1856);
                yp0.b.l(model10, 0, 0, 0, 0, null, false, 63);
                return u.c(model10);
            case 9:
                return a(obj2, obj3, obj4);
            case 10:
                return b(obj2, obj3, obj4);
            case 11:
                return c(obj2, obj3, obj4);
            case 12:
                return d(obj2, obj3, obj4);
            case 13:
                return e(obj2, obj3, obj4);
            case 14:
                return g(obj2, obj3, obj4);
            case 15:
                return h(obj2, obj3, obj4);
            case 16:
                return i(obj2, obj3, obj4);
            case 17:
                return j(obj2, obj3, obj4);
            case 18:
                return k(obj2, obj3, obj4);
            case 19:
                return l(obj2, obj3, obj4);
            case 20:
                return m(obj2, obj3, obj4);
            case 21:
                return n(obj2, obj3, obj4);
            case 22:
                return o(obj2, obj3, obj4);
            case 23:
                return p(obj2, obj3, obj4);
            case 24:
                return q(obj2, obj3, obj4);
            case 25:
                return r(obj2, obj3, obj4);
            case 26:
                return s(obj2, obj3, obj4);
            case 27:
                return t(obj2, obj3, obj4);
            case 28:
                return u(obj2, obj3, obj4);
            default:
                Pair pair2 = (Pair) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair2.f186385a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) pair2.f186386b).booleanValue();
                TradingAccount tradingAccount = ((taf.f) obj5).f269313a;
                if (zBooleanValue) {
                    RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D377", null, null, null, 30), null, null, false, null, false, 60);
                    TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_to_revolut_title, null, null, 14);
                    boolean z4 = tradingAccount instanceof TradingAccount.Margin;
                    if (z4 || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.Robo) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.Unknown) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.GIA)) {
                        i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_to_revolut_description;
                    } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) {
                        i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_to_revolut_pea_description;
                    } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                        i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_to_revolut_isa_description;
                    } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                        i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_transfer_type_incoming_jisa_subtitle;
                    } else {
                        if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_transfer_type_incoming_personal_jisa_subtitle;
                    }
                    TextLocalisedClause textLocalisedClause6 = new TextLocalisedClause(i2, null, null, 14);
                    tf tfVar3 = new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false);
                    if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa)) {
                        listC = u.c(new pc("TO_REVOLUT_FREE_BADGE", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_gift, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_to_revolut_badge, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10), new Color.Solid(R$attr.uikit_colorGreyTone10), R$attr.uikit_colorTransparent, null, 1000), null));
                    } else {
                        if (!(tradingAccount instanceof TradingAccount.GIA) && !z4 && !(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.Robo) && !(tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        listC = f0.f322471a;
                    }
                    model2 = new RowDelegate.Model("TO_REVOLUT", image402, textLocalisedClause5, null, 0, textLocalisedClause6, null, null, 0, tfVar3, false, null, false, null, listC, null, null, null, null, taf.d.f269311a, null, 0, 0, 0, 0, 532642776);
                    yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
                } else {
                    model2 = null;
                }
                if (zBooleanValue2) {
                    RowDelegate.Model.MainImage.Image40 image403 = new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30), null, null, false, null, false, 62);
                    TextLocalisedClause textLocalisedClause7 = new TextLocalisedClause(com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_out_title, null, null, 14);
                    if ((tradingAccount instanceof TradingAccount.Margin) || (tradingAccount instanceof TradingAccount.MoneyMarketFunds) || (tradingAccount instanceof TradingAccount.Robo) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Unknown) || (tradingAccount instanceof TradingAccount.PaperTrading) || (tradingAccount instanceof TradingAccount.Unknown) || (tradingAccount instanceof TradingAccount.TaxAdvantage.Pea) || (tradingAccount instanceof TradingAccount.GIA)) {
                        i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_out_description;
                    } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) {
                        i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfer_in_transfer_type_out_isa_description;
                    } else if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                        i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_transfer_type_outgoing_jisa_subtitle;
                    } else {
                        if (!(tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = com.revolut.feature.trading.transfer.investments.impl.R$string.trading_stocks_transfers_transfer_type_outgoing_personal_jisa_subtitle;
                    }
                    RowDelegate.Model model11 = new RowDelegate.Model("OUT_OF_REVOLUT", image403, textLocalisedClause7, null, 0, new TextLocalisedClause(i, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGrey20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, taf.e.f269312a, null, 0, 0, 0, 0, 532675544);
                    yp0.b.l(model11, 0, 0, 0, 0, null, false, 63);
                    model3 = model11;
                }
                RowDelegate.Model[] elements = {model2, model3};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
        }
    }

    public /* synthetic */ b(Object obj2, Object obj3, int i) {
        this.f261293a = i;
        this.f261294b = obj3;
    }

    public /* synthetic */ b(sec.b bVar, sec.m mVar) {
        this.f261293a = 2;
        this.f261294b = bVar;
    }
}
