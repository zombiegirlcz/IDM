package wx6;

import android.os.Parcelable;
import anf.w;
import aw0.k7;
import aw0.ka;
import aw0.o9;
import aw0.r2;
import bw0.m;
import c1g.o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.ViewUtils;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.delegates.of;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.t;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.PairedImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.externalcards.AutoTopUpType;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import com.revolut.feature.cards.models.card.PocketWithSubaccount;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.TicketProgression;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.email_message.InvoiceEmailMessageScreenContract$InputData;
import com.revolut.feature.freelancer.impl.ui.perks.list.FreelancerPerksListScreenContract$PerkId;
import com.revolut.feature.rev_points.models.IssuedPoints;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.feature.statements.R$plurals;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.CustomStatementAccountPeriods;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomStatementElementPeriod;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.Product;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChartPoint;
import com.revolut.feature.wealth.assetdetails.ui.impl.ratings.credit_quality.CreditQualityScreenContract$RatingsContext;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.youTransactor.uCube.rpc.Constants;
import d9.e1;
import hs3.z1;
import ip0.ak0;
import ip0.iq;
import ip0.ps;
import ip0.q6;
import ip0.ql;
import ip0.qs;
import ip0.ss;
import ip0.ts;
import ip0.us;
import ip0.xh0;
import ip0.z;
import ip0.zj;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kp0.w0;
import ms0.h4;
import mx0.v5;
import org.jmrtd.cbeff.ISO781611;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.ReadableInstant;
import si9.b;
import svi.z0;
import tof.a3;
import tof.t4;
import vf0.y;
import whf.j;
import whf.p;
import wp4.j0;
import wyg.s;
import x0f.b0;
import x82.q;
import x82.r;
import xmd.v0;
import xuc.n;
import zh9.c0;
import zh9.e0;
import zh9.g0;
import zh9.g1;
import zh9.h1;
import zh9.i0;
import zh9.i1;
import zh9.j1;
import zh9.r0;
import zh9.u0;
import zh9.x0;
import zh9.y0;
import zhm.a0;
import zhm.a1;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f300767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f300768c;

    public /* synthetic */ k(Object obj2, Object obj3, int i) {
        this.f300766a = i;
        this.f300767b = obj2;
        this.f300768c = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Object a(Object obj2, Object obj3, Object obj4) {
        wi0.b bVar;
        boolean z;
        ActionsView.Item itemN;
        ActionsView.Item item;
        boolean z3;
        Collection collectionA;
        CardholderVerificationStatus cardholderVerificationStatus;
        aim.e eVarI;
        boolean z4;
        ActionsView.Item itemO;
        t61.g gVar;
        boolean z6;
        Collection collectionA2;
        Collection collectionA3;
        AutoTopUpType autoTopUpType;
        CardholderVerificationStatus cardholderVerificationStatus2;
        aim.e eVarI2;
        b0 b0Var = (b0) this.f300767b;
        ?? r2 = b0Var.d;
        x0f.h hVar = (x0f.h) this.f300768c;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        t61.g gVar2 = (t61.g) pair.f186385a;
        wi0.b bVar2 = (wi0.b) pair.f186386b;
        AutoTopUpState autoTopUpState = hVar.f301587b;
        boolean z11 = b0Var.f301580a.f91101c;
        boolean z12 = hVar.e;
        aue.a aVar = hVar.d;
        jte.d dVar = (jte.d) b0Var.f301582c;
        if (!dVar.c(TopupApi$Toggles.ExternalCardDetailsRevamp.f90463c)) {
            aim.e eVarB = u.b();
            wi0.b.Companion.getClass();
            boolean zF = Intrinsics.f(bVar2, wi0.b.f297770q3);
            t61.j jVar = gVar2.f268142j;
            t61.f fVar = gVar2.z;
            String str = gVar2.f268137a;
            boolean z29 = gVar2.o;
            boolean z31 = gVar2.f268141h;
            boolean z41 = (jVar != null ? jVar.f268168q : null) == null;
            ActionsView.Item itemO2 = (z29 || !zF) ? null : b0.o(z41);
            if (z11 && z31) {
                itemN = b0.n(z41);
                bVar = bVar2;
                z = z31;
            } else if (z31 || !z41) {
                bVar = bVar2;
                z = z31;
                itemN = null;
            } else {
                AutoTopUpType autoTopUpType2 = gVar2.f268147q;
                if (z12) {
                    if (autoTopUpState.f60421a && Intrinsics.f(autoTopUpState.f60423c, str)) {
                        bVar = bVar2;
                        z = z31;
                        item = new ActionsView.Item("ADJUST_AUTO_TOPUP_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.topup_card_details_edit_autotopup, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_auto_topup, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
                    } else {
                        bVar = bVar2;
                        z = z31;
                        if (!autoTopUpState.f60421a && (autoTopUpType2 == AutoTopUpType.AVAILABLE || autoTopUpType2 == AutoTopUpType.ENABLED)) {
                            item = new ActionsView.Item("SETUP_AUTO_TOPUP_ACTION_ID", null, false, null, null, new TextLocalisedClause(R$string.topup_card_details_setup_autotopup, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_auto_topup, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32670);
                        }
                    }
                    itemN = item;
                } else {
                    bVar = bVar2;
                    z = z31;
                }
                item = null;
                itemN = item;
            }
            ActionsView.Item[] elements = {itemO2, itemN, new ActionsView.Item("DELETE_ACTION_ID", null, false, null, new TextLocalisedClause(R$string.topup_card_details_accessibility_label_delete_card, null, null, 14), new TextLocalisedClause(R.string.bank_details_delete_action, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32654)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            eVarB.add(new z("ITEM_ACTIONS", kotlin.collections.d.L(elements), true, 0, 0, Constants.TAG_F4));
            if (fVar != null) {
                eVarB.add(b0.k(fVar, gVar2.A));
            }
            if (dVar.c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c) && (cardholderVerificationStatus = gVar2.f268152x) != null && (eVarI = b0Var.i(cardholderVerificationStatus, aVar)) != null) {
                eVarB.addAll(eVarI);
            }
            boolean z49 = autoTopUpState.f60421a;
            dj0.d dVar2 = autoTopUpState.f;
            if (z49 && Intrinsics.f(autoTopUpState.f60423c, str)) {
                aim.e eVarB2 = u.b();
                z3 = false;
                eVarB2.add(b0.d(false));
                CellDetailsDelegate.Model modelA = dVar2 != null ? b0.a(dVar2, false) : null;
                dj0.d dVar3 = autoTopUpState.e;
                CellDetailsDelegate.Model[] elements2 = {modelA, dVar3 != null ? b0.e(dVar3, false) : null, dVar2 != null ? b0.b(dVar2, false) : null};
                Intrinsics.checkNotNullParameter(elements2, "elements");
                List listL = kotlin.collections.d.L(elements2);
                yp0.b.k(listL, 0, 0, 0, 0, 31);
                eVarB2.addAll(listL);
                collectionA = u.a(eVarB2);
            } else {
                z3 = false;
                collectionA = f0.f322471a;
            }
            eVarB.addAll(collectionA);
            aim.e eVarB3 = u.b();
            eVarB3.add(b0.g());
            t61.j jVar2 = gVar2.f268142j;
            if ((jVar2 != null ? jVar2.f268168q : null) == null) {
                z3 = true;
            }
            Object[] elements3 = {b0.l(fVar != null ? fVar.f268134a : null, z29, z3, zF), b0.f(jli.g.c(tz4.d.l(jVar2))), b0.h(qxe.a.a(jVar2, bVar)), !((Boolean) r2.getValue()).booleanValue() ? b0.j(hx7.l.h(gVar2), z) : null};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            List listL2 = kotlin.collections.d.L(elements3);
            yp0.b.k(listL2, 0, 0, 0, 0, 31);
            eVarB3.addAll(listL2);
            eVarB.addAll(u.a(eVarB3));
            return u.a(eVarB);
        }
        aim.e eVarB4 = u.b();
        wi0.b.Companion.getClass();
        boolean zF2 = Intrinsics.f(bVar2, wi0.b.f297770q3);
        t61.j jVar3 = gVar2.f268142j;
        t61.f fVar2 = gVar2.z;
        boolean z54 = gVar2.o;
        boolean z74 = gVar2.f268141h;
        boolean z83 = (jVar3 != null ? jVar3.f268168q : null) == null;
        if (z54 || !zF2) {
            z4 = z83;
            itemO = null;
        } else {
            z4 = z83;
            itemO = b0.o(z83);
        }
        ActionsView.Item[] elements4 = {itemO, (z11 && z74) ? b0.n(z4) : null};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        List listL3 = kotlin.collections.d.L(elements4);
        z zVar = !listL3.isEmpty() ? new z("ITEM_ACTIONS", listL3, true, 0, 0, Constants.TAG_F4) : null;
        if (zVar != null) {
            eVarB4.add(zVar);
        }
        if (fVar2 != null) {
            eVarB4.add(b0.k(fVar2, gVar2.A));
        }
        if (dVar.c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c) && (cardholderVerificationStatus2 = gVar2.f268152x) != null && (eVarI2 = b0Var.i(cardholderVerificationStatus2, aVar)) != null) {
            eVarB4.addAll(eVarI2);
        }
        boolean z89 = z12 && ((jVar3 != null ? jVar3.f268168q : null) == null);
        boolean z96 = autoTopUpState.f60421a;
        dj0.d dVar4 = autoTopUpState.f;
        if (z96 && Intrinsics.f(autoTopUpState.f60423c, gVar2.f268137a)) {
            aim.e eVarB5 = u.b();
            eVarB5.add(b0.d(z74));
            aim.e eVarB6 = u.b();
            if (dVar4 != null) {
                eVarB6.add(b0.a(dVar4, z74));
            }
            dj0.d dVar5 = autoTopUpState.e;
            if (dVar5 != null) {
                eVarB6.add(b0.e(dVar5, z74));
            }
            if (dVar4 != null) {
                eVarB6.add(b0.b(dVar4, z74));
            }
            if (z89) {
                gVar = gVar2;
                z6 = z12;
                eVarB6.add(new RowDelegate.Model("ADJUST_AUTO_TOPUP_ACTION_ID", null, new TextLocalisedClause(R$string.topup_card_details_edit_autotopup, null, new Custom(Integer.valueOf(z74 ? R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), of.SMALL, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), !z74, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536867826));
            } else {
                gVar = gVar2;
                z6 = z12;
            }
            aim.e eVarA = u.a(eVarB6);
            yp0.b.k(eVarA, 0, 0, 0, 0, 31);
            eVarB5.addAll(eVarA);
            collectionA2 = u.a(eVarB5);
        } else {
            gVar = gVar2;
            z6 = z12;
            collectionA2 = f0.f322471a;
        }
        eVarB4.addAll(collectionA2);
        aim.e eVarB7 = u.b();
        eVarB7.add(b0.g());
        Object[] elements5 = {b0.l(fVar2 != null ? fVar2.f268134a : null, z54, (jVar3 != null ? jVar3.f268168q : null) == null, zF2), b0.f(tz4.d.l(jVar3)), b0.h(qxe.a.a(jVar3, bVar2)), !((Boolean) r2.getValue()).booleanValue() ? b0.j(hx7.l.h(gVar), z74) : null};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        List listL4 = kotlin.collections.d.L(elements5);
        yp0.b.k(listL4, 0, 0, 0, 0, 31);
        eVarB7.addAll(listL4);
        eVarB4.addAll(u.a(eVarB7));
        boolean z100 = (jVar3 != null ? jVar3.f268168q : null) == null;
        if (z6 && !z74 && z100 && !autoTopUpState.f60421a && ((autoTopUpType = gVar.f268147q) == AutoTopUpType.AVAILABLE || autoTopUpType == AutoTopUpType.ENABLED)) {
            aim.e eVarB8 = u.b();
            eVarB8.add(new ListSubheaderDelegate.Model("ITEM_MORE_FEATURES_SUBTITLE", (Image) null, (Clause) new TextLocalisedClause(R$string.topup_card_details_more_features_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, R$attr.uikit_dp8, 0, 0, 53242));
            RowDelegate.Model model = new RowDelegate.Model("SETUP_AUTO_TOPUP_ACTION_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_auto_topup, Integer.valueOf(R$attr.uikit_colorAccentNeutral), R$attr.uikit_colorAccentNeutral_10, 8.0f, null, null, 48), null, null, false, null, false, 60), new TextLocalisedClause(R$string.topup_card_details_more_features_cell_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.topup_card_details_more_features_cell_subtitle, null, null, 14), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB8.add(model);
            collectionA3 = u.a(eVarB8);
        } else {
            collectionA3 = null;
        }
        if (collectionA3 == null) {
            collectionA3 = f0.f322471a;
        }
        eVarB4.addAll(collectionA3);
        RowDelegate.Model model2 = new RowDelegate.Model("DELETE_ACTION_ID", null, new TextLocalisedClause(R$string.topup_card_details_remove, null, new Custom(Integer.valueOf(R$attr.uikit_colorStatusDanger), false, null, false, null, 254), 10), of.SMALL, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870898);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        eVarB4.add(model2);
        return u.a(eVarB4);
    }

    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object b(Object obj2, Object obj3, Object obj4) {
        int i;
        aim.e eVar;
        int[] iArr;
        MultibancoWithdrawalCode multibancoWithdrawalCode;
        List listA;
        Collection collectionA;
        Collection collectionA2;
        int i2;
        boolean z;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        ?? r152;
        Object obj5;
        r rVar = (r) this.f300767b;
        x82.b bVar = (x82.b) this.f300768c;
        MultibancoWithdrawalCode code = (MultibancoWithdrawalCode) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(code, "content");
        aim.e eVarB = u.b();
        boolean zA = c92.a.a(code);
        h02.f fVar = code.f61953c;
        z zVar = zA ? null : new z("ID_ACTIONS", u.c(new ActionsView.Item("ID_ACTION_GENERATE", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_action_generate_again, null, null, 14), new ResourceImage(R$drawable.uikit_icn_16_arrow_repeat, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, null, null, 32668)), null, mx0.l.NON_SCROLLABLE, 0, 0, code, 220);
        if (zVar != null) {
            eVarB.add(zVar);
        }
        c92.d dVar = rVar.f303276a;
        LocalDateTime localDateTime = code.f61954g;
        int[] iArr2 = q.f303275a;
        int i3 = iArr2[fVar.ordinal()];
        if (i3 == 1) {
            i = 3;
            long j2 = bVar.f303261c;
            Intrinsics.checkNotNullParameter(code, "code");
            long jA = code.a();
            long jMax = Math.max(0L, jA - (j2 - oi0.d.R(localDateTime)));
            eVar = eVarB;
            iArr = iArr2;
            multibancoWithdrawalCode = code;
            my0.l lVar = new my0.l(new r2(new TextClause(c92.a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null), new ql(6, null, LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_cash, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10)), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_widget_subtitle, v.k(c92.a.b(code), new TimeClause(jMax, new TimeClause.Format.Duration(0), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 8));
            my0.i iVar = new my0.i(u.c(new my0.f("ID_CODE_ACTION_SHARE", new TextLocalisedClause(R.string.common_share, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_share, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, 40)));
            int i5 = R$attr.uikit_colorAccent;
            listA = ky0.c.a(dVar.f22268a, c92.d.f22267b, new o(lVar, 8, iVar, new ProgressStyle((int) jMax, (int) jA, i5, i5, R$attr.uikit_colorBackground, 2.0f, 2.0f, null, ViewUtils.EDGE_TO_EDGE_FLAGS)));
        } else {
            if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Intrinsics.checkNotNullParameter(code, "code");
            int i6 = c92.c.f22266a[fVar.ordinal()];
            if (i6 == 1) {
                i = 3;
                i2 = 14;
                z = false;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_state_active, null, null, 14);
            } else if (i6 != 2) {
                if (i6 == 3) {
                    i = 3;
                    obj5 = null;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_state_expired, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
                } else if (i6 == 4) {
                    i = 3;
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_state_canceled, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
                    obj5 = null;
                } else {
                    if (i6 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_state_unknown, null, null, 14);
                    i = 3;
                    i2 = 14;
                    r152 = 0;
                    CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_ROW_STATUS", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_status, r152, r152, i2), textLocalisedClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                    CellDetailsDelegate.Model model2 = new CellDetailsDelegate.Model("ID_ROW_CODE", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_code, null, null, 14), new TextClause(c92.a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                    CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_ROW_AMOUNT", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_amount, null, null, 14), c92.a.b(code), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                    CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("ID_ROW_CREATED", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_created, null, null, 14), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                    qv0.i[] iVarArr = new qv0.i[4];
                    iVarArr[0] = model;
                    iVarArr[1] = model2;
                    iVarArr[2] = model3;
                    iVarArr[i] = model4;
                    List listK = v.k(iVarArr);
                    yp0.b.k(listK, 0, 0, 0, 0, 31);
                    multibancoWithdrawalCode = code;
                    eVar = eVarB;
                    listA = listK;
                    iArr = iArr2;
                }
                i2 = 14;
                r152 = obj5;
                CellDetailsDelegate.Model model5 = new CellDetailsDelegate.Model("ID_ROW_STATUS", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_status, r152, r152, i2), textLocalisedClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                CellDetailsDelegate.Model model22 = new CellDetailsDelegate.Model("ID_ROW_CODE", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_code, null, null, 14), new TextClause(c92.a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                CellDetailsDelegate.Model model32 = new CellDetailsDelegate.Model("ID_ROW_AMOUNT", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_amount, null, null, 14), c92.a.b(code), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                CellDetailsDelegate.Model model42 = new CellDetailsDelegate.Model("ID_ROW_CREATED", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_created, null, null, 14), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
                qv0.i[] iVarArr2 = new qv0.i[4];
                iVarArr2[0] = model5;
                iVarArr2[1] = model22;
                iVarArr2[2] = model32;
                iVarArr2[i] = model42;
                List listK2 = v.k(iVarArr2);
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                multibancoWithdrawalCode = code;
                eVar = eVarB;
                listA = listK2;
                iArr = iArr2;
            } else {
                i = 3;
                z = false;
                i2 = 14;
                textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_state_used, null, null, 14);
            }
            textLocalisedClause2 = textLocalisedClause;
            r152 = z;
            CellDetailsDelegate.Model model52 = new CellDetailsDelegate.Model("ID_ROW_STATUS", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_status, r152, r152, i2), textLocalisedClause2, null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            CellDetailsDelegate.Model model222 = new CellDetailsDelegate.Model("ID_ROW_CODE", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_code, null, null, 14), new TextClause(c92.a.c(code), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            CellDetailsDelegate.Model model322 = new CellDetailsDelegate.Model("ID_ROW_AMOUNT", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_amount, null, null, 14), c92.a.b(code), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            CellDetailsDelegate.Model model422 = new CellDetailsDelegate.Model("ID_ROW_CREATED", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_cell_created, null, null, 14), new TimeClause(oi0.d.R(localDateTime), new TimeClause.Format.Pretty(0), null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048552);
            qv0.i[] iVarArr22 = new qv0.i[4];
            iVarArr22[0] = model52;
            iVarArr22[1] = model222;
            iVarArr22[2] = model322;
            iVarArr22[i] = model422;
            List listK22 = v.k(iVarArr22);
            yp0.b.k(listK22, 0, 0, 0, 0, 31);
            multibancoWithdrawalCode = code;
            eVar = eVarB;
            listA = listK22;
            iArr = iArr2;
        }
        aim.e eVar2 = eVar;
        eVar2.addAll(listA);
        int i21 = iArr[fVar.ordinal()];
        if (i21 == 1) {
            List listK3 = v.k(new RowDelegate.Model("ID_INSTRUCTION", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_16_list_number, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_active_instructions, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, x82.a.ACTIVE_INSTRUCTIONS, null, 0, 0, 0, 0, 532675576), new RowDelegate.Model("ID_ATM", new RowDelegate.Model.MainImage.Image24(new ResourceImage(R$drawable.uikit_icn_24_map_point, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, false, 6), new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_active_atms, null, null, 14), null, 0, null, null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false), false, null, false, null, null, null, null, null, null, x82.a.ACTIVE_ATM, null, 0, 0, 0, 0, 532675576));
            yp0.b.k(listK3, 0, 0, 0, 0, 31);
            aim.e eVarB2 = u.b();
            eVarB2.addAll(listK3);
            eVarB2.add(r.a());
            CellDetailsChevronDelegate.Model model6 = new CellDetailsChevronDelegate.Model("ID_CANCEL", new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_active_cancel, null, null, 14), R$attr.uikit_colorRed, false, x82.a.ACTIVE_CANCEL, null, null, YearClass.CLASS_2016);
            yp0.b.l(model6, 0, 0, 0, 0, null, false, 63);
            eVarB2.add(model6);
            collectionA = u.a(eVarB2);
        } else if (i21 == 2) {
            collectionA = u.c(r.a());
        } else if (i21 != i) {
            if (i21 != 4 && i21 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            collectionA = u.c(r.a());
        } else {
            p pVar = bVar.f303260b;
            aim.e eVarB3 = u.b();
            if (pVar != null) {
                if (pVar.f297646a.isEmpty()) {
                    collectionA2 = f0.f322471a;
                } else {
                    ListSubheaderDelegate.Model model7 = new ListSubheaderDelegate.Model("ID_TX_HEADER", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_section_transaction_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp0, 0, 0, 57338);
                    ArrayList arrayListC = ((w) rVar.f303277b).c(pVar, new whf.l(0), j.a.f297643a);
                    yp0.b.k(arrayListC, 0, 0, 0, 0, 31);
                    aim.e eVarB4 = u.b();
                    eVarB4.add(model7);
                    eVarB4.addAll(arrayListC);
                    collectionA2 = u.a(eVarB4);
                }
                eVarB3.addAll(collectionA2);
            }
            eVarB3.add(r.a());
            collectionA = u.a(eVarB3);
        }
        eVar2.addAll(collectionA);
        return new x82.c(new TextLocalisedClause(com.revolut.feature.apm.multibanco.api.R$string.multibanco_withdrawal_details_title, u.c(c92.a.b(multibancoWithdrawalCode)), null, 12), u.a(eVar2));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r18v3 ??, still in use, count: 1, list:
          (r18v3 ?? I:qv0.n) from 0x012b: INVOKE (r18v3 ?? I:qv0.n), (r19v3 ?? I:int), (r19v3 ?? I:int), (r21v3 ?? I:int), (r22v2 ?? I:int), (r23v1 ?? I:int) STATIC call: yp0.b.r(qv0.n, int, int, int, int, int):void A[MD:(qv0.n, int, int, int, int, int):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    private final java.lang.Object c(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r18v3 ??, still in use, count: 1, list:
          (r18v3 ?? I:qv0.n) from 0x012b: INVOKE (r18v3 ?? I:qv0.n), (r19v3 ?? I:int), (r19v3 ?? I:int), (r21v3 ?? I:int), (r22v2 ?? I:int), (r23v1 ?? I:int) STATIC call: yp0.b.r(qv0.n, int, int, int, int, int):void A[MD:(qv0.n, int, int, int, int, int):void (m)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:73)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r52v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX WARN: Removed duplicated region for block: B:48:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b2  */
    /* JADX WARN: Type inference failed for: r11v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Iterable, java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r39, java.lang.Object r40, java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.e(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a  */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object g(java.lang.Object r27, java.lang.Object r28, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r35, java.lang.Object r36, java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012a A[EDGE_INSN: B:97:0x012a->B:28:0x012a BREAK  A[LOOP:1: B:16:0x00e4->B:98:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object i(java.lang.Object r47, java.lang.Object r48, java.lang.Object r49) {
        /*
            Method dump skipped, instruction units count: 1001
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r19v2, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    private final Object j(Object obj2, Object obj3, Object obj4) {
        Object obj5;
        m mVar;
        a3 a3Var;
        ?? model;
        xsi.r rVar = (xsi.r) this.f300767b;
        xsi.c cVar = (xsi.c) this.f300768c;
        xsi.b content = (xsi.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = cVar.f308527b;
        xsi.a aVar = content.f308525c;
        long j2 = content.f308524b;
        xsi.a aVar2 = content.f308525c;
        xi0.b bVar = aVar.f308522c;
        long j3 = aVar.f308520a;
        a3 a3Var2 = content.f308523a;
        boolean z3 = content.d;
        String strD = !z3 ? rVar.f308545a.d(j3, bVar.f306286a) : null;
        if (strD == null) {
            strD = "";
        }
        String str = strD;
        Long lValueOf = Long.valueOf(j3);
        if (z3) {
            lValueOf = null;
        }
        bw0.h hVar = new bw0.h(str, u80.o.b(new u80.g(new dj0.d(lValueOf != null ? lValueOf.longValue() : 0L, bVar), null, u80.b.SYMBOL, 10)).toString(), null, true, null, Boolean.TRUE, false, false, null, null, null, null, 32724);
        if (aVar2.f308520a > j2) {
            mVar = new m(new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_error_max, u.c(new MoneyClause(new dj0.d(j2, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.ERROR, null, false, null, 28);
            obj5 = null;
        } else {
            obj5 = null;
            mVar = new m(new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_input_subtitle, u.c(new MoneyClause(new dj0.d(aVar.f308521b, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), bw0.l.INFO, null, false, null, 28);
        }
        ?? r192 = obj5;
        CenteredAmountDelegate.Model model2 = new CenteredAmountDelegate.Model("inputAmountId", null, hVar, null, mVar, null, null, false, false, aVar, null, 1514);
        aim.e eVarB = u.b();
        eVarB.add(model2);
        if (z) {
            boolean z4 = content.d;
            thf.c cVar2 = rVar.f308546b;
            CellDetailsSwitcherDelegate.Model model3 = new CellDetailsSwitcherDelegate.Model("excludeId", new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_exlude_toggle, r192, r192, 14), z4, true, 0, null, null, null, 4080);
            if (z4) {
                a3Var = a3Var2;
                model = r192;
            } else {
                a3Var = a3Var2;
                wjf.e eVar = (wjf.e) cVar2;
                model = new CellDetailsActionDelegate.Model("categoryId", new TextLocalisedClause(com.revolut.retail.feature.adjust_analytics.api.R$string.analytics_adjust_amount_category, r192, r192, 14), 0, new ResourceImage(eVar.j(a3Var.Q), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextClause(eVar.k(a3Var.Q), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, false, null, null, null, 0, 0, 0, 0, 4194276);
            }
            Object[] elements = {model3, model};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            eVarB.addAll(listL);
        } else {
            a3Var = a3Var2;
        }
        aim.e eVarA = u.a(eVarB);
        boolean z6 = false;
        boolean z11 = aVar2.f308520a != hx7.l.m(a3Var);
        boolean z12 = z3 != Intrinsics.f(a3Var.u, t4.f273086a);
        if (aVar2.f308520a <= j2 && (z11 || z12)) {
            z6 = true;
        }
        return new xsi.e(eVarA, z6);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object k(java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.k(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        xuc.f fVar = (xuc.f) this.f300767b;
        n nVar = (n) this.f300768c;
        List connections = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(connections, "connections");
        int i = xuc.m.f309017a[fVar.f309012a.ordinal()];
        if (i == 1) {
            if (!ue0.e.n(connections)) {
                return nVar.a(connections, qtc.d.WALLET);
            }
            List listC = u.c(new FullScreenStateDelegate.Model("EMPTY_LINKED_WALLETS_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_linked_wallets_empty_caption, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (!ue0.e.n(connections)) {
            return nVar.a(connections, qtc.d.MERCHANT);
        }
        List listC2 = u.c(new FullScreenStateDelegate.Model("EMPTY_LINKED_MERCHANTS_STATE_LIST_ID", new TextLocalisedClause(com.revolut.feature.security_hub.api.R$string.security_hub_home_card_connections_linked_merchants_empty, null, null, 14), null, null, null, null, false, null, null, false, 0, 0, 32764));
        yp0.b.k(listC2, 0, 0, 0, 0, 31);
        return listC2;
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        List listK;
        xvf.n nVar = (xvf.n) this.f300767b;
        xvf.f fVar = (xvf.f) this.f300768c;
        axf.a content = (axf.a) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        long j2 = fVar.f309250b;
        if (j2 > 0) {
            CellDetailsActionDelegate.Model modelA = nVar.a(content.f10933a);
            String str = content.f10934b;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_get_help_otp_field_otp, null, null, 14);
            List listK2 = v.k(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), nVar.f309261c);
            m70.a.t(t0.f186434a);
            listK = v.k(modelA, new CellDetailsActionDelegate.Model("ID_PASSWORD", textLocalisedClause, 0, null, new CompositeClause(listK2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), false, false, null, new xvf.b(str), 0, 0, 32224), new CellDetailsDelegate.Model("ID_VALID", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_get_help_otp_field_username, null, null, 14), (Image) null, 0, false, 30), new TimeClause(j2, new TimeClause.Format.Duration(0), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760));
        } else {
            listK = v.k(nVar.a(content.f10933a), new CellDetailsActionDelegate.Model("ID_PASSWORD", new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_get_help_otp_field_otp, null, null, 14), 0, new ResourceImage(R$drawable.uikit_icn_16_arrow_repeat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(com.revolut.feature.transport.api.R$string.transport_get_help_otp_field_otp_generate, null, null, 14), false, false, null, xvf.a.f309245a, 0, 0, 32224));
        }
        List list = listK;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return list;
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        xxi.o oVar = (xxi.o) this.f300767b;
        xxi.e eVar = (xxi.e) this.f300768c;
        List pages = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        Intrinsics.checkNotNullParameter(pages, "pages");
        ArrayList arrayList = new ArrayList();
        Iterator it8 = pages.iterator();
        while (it8.hasNext()) {
            a0.x(((z0) it8.next()).f266020a, arrayList);
        }
        Collection collectionValues = eVar.f309538c.values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it9 = collectionValues.iterator();
            while (true) {
                if (!it9.hasNext()) {
                    break;
                }
                if (!((Set) it9.next()).isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            if (zBooleanValue) {
                return xxi.o.a();
            }
            List listC = u.c(new FullScreenStateDelegate.Model("ID_PASS_ACTIVITY_LIST_NO_RESULTS", new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_activity_empty_state_title, null, null, 14), z ? new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_activity_empty_state_description_filters, null, null, 14) : null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), z ? new l6(12, new TextLocalisedClause(com.revolut.retail.feature.airportlounges.impl.R$string.airport_lounges_pass_activity_empty_state_button_clear_filters, null, null, 14), null, h4.WHITE_OR_BLACK_INVERTED) : null, zj.REGULAR, false, z ? xxi.j.f309543a : null, null, null, 1728));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
            return listC;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj5 : arrayList) {
            LocalDate localDate = ((svi.t0) obj5).f265991b.atZone(ZoneId.systemDefault()).toLocalDate();
            Object objU = linkedHashMap.get(localDate);
            if (objU == null) {
                objU = h30.l.u(linkedHashMap, localDate);
            }
            ((List) objU).add(obj5);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            LocalDate localDate2 = (LocalDate) entry.getKey();
            List list = (List) entry.getValue();
            long epochMilli = localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                arrayList3.add(oVar.f309546a.a((svi.t0) it10.next(), hxi.i.f156607b));
            }
            a0.x(yp0.b.g(arrayList3, new ListSubheaderDelegate.Model(p.a.m(epochMilli, "ID_PASS_ACTIVITY_LIST_DATE_HEADER_"), (Image) null, (Clause) new TimeClause(epochMilli, new TimeClause.Format.Pretty(q0.ONLY_DATE_FULL_MONTH), null, null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126), arrayList2);
        }
        return arrayList2;
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelA;
        int i;
        Clause textLocalisedQuantityClause;
        Clause textLocalisedClause;
        Clause textLocalisedQuantityClause2;
        Clause textLocalisedClause2;
        List listC;
        xzd.w wVar = (xzd.w) this.f300767b;
        xzd.k kVar = (xzd.k) this.f300768c;
        CustomStatementData content = (CustomStatementData) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        CustomisationParameters parameters = content.getParameters();
        CustomisationSelection customisationSelection = kVar.f309931b;
        mzd.b bVar = wVar.f309949a;
        ProductSelection productSelection = customisationSelection.getProductSelection();
        Set<String> allSelectedProducts = productSelection.getAllSelectedProducts();
        List<Product> products = parameters.getProducts();
        ArrayList arrayList = new ArrayList();
        for (Object obj5 : products) {
            if (allSelectedProducts.contains(((Product) obj5).getType())) {
                arrayList.add(obj5);
            }
        }
        int size = arrayList.size();
        if (size == 1) {
            Product product = (Product) d0.b0(arrayList);
            modelA = xzd.w.a(new TextClause(product.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), mzd.b.c(product, productSelection), bVar.b(product));
        } else {
            modelA = productSelection.areAllSelected(parameters.getProducts()) ? xzd.w.a(new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_filter_all_accounts_title, null, null, 14), null, new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6)) : xzd.w.a(new TextLocalisedQuantityClause(R$plurals.consolidated_statement_filters_accounts_count, Integer.valueOf(size), (List) null, (Style) null, 28), null, new GlyphImage(R$drawable.uikit_icn_24_coins, null, null, 6));
        }
        eVarB.add(modelA);
        d0e.a aVar = wVar.f309950b;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.feature.statements.R$string.common_word_period, null, null, 14);
        StatementPeriodSelection period = customisationSelection.getPeriod();
        eVarB.add(aVar.a("ID_PERIOD_ITEM", textLocalisedClause3, period != null ? wVar.f309951c.r(period) : null, null, true));
        int i2 = xzd.v.f309948a[customisationSelection.getFormat().ordinal()];
        if (i2 == 1) {
            i = R.string.statements_pdf;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.statements.R$string.statement_format_csv;
        }
        CellDetailsActionDelegate.Model modelB = xzd.w.b(R$drawable.uikit_icn_24_vertical_expand, new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_settings_format, null, null, 14), "ID_FORMAT_ITEM");
        yp0.b.l(modelB, 0, 0, 0, 0, null, false, 63);
        eVarB.add(modelB);
        List<SelectableOption> transactionCategories = content.getParameters().getTransactionCategories();
        Set<String> selectedCategories = customisationSelection.getSelectedCategories();
        if (transactionCategories.size() == selectedCategories.size()) {
            textLocalisedClause = new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_description_all, null, null, 14);
        } else {
            if (selectedCategories.size() == 1) {
                for (SelectableOption selectableOption : transactionCategories) {
                    if (selectedCategories.contains(selectableOption.getType())) {
                        textLocalisedQuantityClause = new TextClause(selectableOption.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.documents_hub_custom_form_filter_description_categories, Integer.valueOf(selectedCategories.size()), (List) null, (Style) null, 28);
            textLocalisedClause = textLocalisedQuantityClause;
        }
        eVarB.add(xzd.w.b(R$drawable.uikit_icn_24_pencil, textLocalisedClause, new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_title_categories, null, null, 14), "ID_CATEGORIES_ITEM"));
        List<SelectableOption> transactionDirections = content.getParameters().getTransactionDirections();
        Set<String> selectedTransactionDirections = customisationSelection.getSelectedTransactionDirections();
        if (transactionDirections.size() == selectedTransactionDirections.size()) {
            textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_description_all, null, null, 14);
        } else {
            if (selectedTransactionDirections.size() == 1) {
                for (SelectableOption selectableOption2 : transactionDirections) {
                    if (selectedTransactionDirections.contains(selectableOption2.getType())) {
                        textLocalisedQuantityClause2 = new TextClause(selectableOption2.getName(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.documents_hub_custom_form_filter_description_transaction_types, Integer.valueOf(selectedTransactionDirections.size()), (List) null, (Style) null, 28);
            textLocalisedClause2 = textLocalisedQuantityClause2;
        }
        eVarB.add(xzd.w.b(R$drawable.uikit_icn_24_pencil, textLocalisedClause2, new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_filter_title_transaction_types, null, null, 14), "ID_TRANSACTION_DIRECTION_ITEM"));
        if (kVar.d) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("ID_SETTINGS_ITEM", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_settings, null, null, 14), (Image) null, 0, false, 30), new ImageClause(R$drawable.uikit_icn_16_chevron_up, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), null, null, null, null, 0, null, false, true, null, null, 26616);
            Locale language = customisationSelection.getLanguage();
            if (language == null) {
                language = Locale.ENGLISH;
            }
            Intrinsics.h(language);
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_language, null, null, 14);
            ResourceImage resourceImage = xzd.w.e;
            String displayLanguage = language.getDisplayLanguage();
            Intrinsics.checkNotNullExpressionValue(displayLanguage, "getDisplayLanguage(...)");
            CellDetailsActionDelegate.Model model2 = new CellDetailsActionDelegate.Model("ID_LANGUAGE", textLocalisedClause4, 0, resourceImage, new TextClause(displayLanguage, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, false, null, null, 0, 0, 32736);
            xi0.b currency = customisationSelection.getCurrency();
            if (currency == null) {
                xi0.b.Companion.getClass();
                currency = xi0.b.f306272g;
            }
            listC = v.k(model, model2, new CellDetailsActionDelegate.Model("ID_DISPLAY_CURRENCY", new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_display_currency, null, null, 14), 0, resourceImage, new CurrencyClause(currency, null, null, 6), false, false, null, null, 0, 0, 32736), new CellDetailsSwitcherDelegate.Model("ID_HIDE_BALANCES_SWITCH", new TextLocalisedClause(com.revolut.feature.statements.R$string.consolidated_statement_filters_setting_hide_balances, null, null, 14), customisationSelection.getHideBalances(), true, 0, null, null, null, 4080));
            yp0.b.k(listC, 0, 0, 0, 0, 31);
        } else {
            CellDetailsDelegate.Model model3 = new CellDetailsDelegate.Model("ID_SETTINGS_ITEM", new aw0.t0((Clause) new TextLocalisedClause(com.revolut.feature.statements.R$string.documents_hub_custom_form_settings, null, null, 14), (Image) null, 0, false, 30), new ImageClause(R$drawable.uikit_icn_16_chevron_down, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28), null, null, null, null, 0, null, false, true, null, null, 26616);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            listC = u.c(model3);
        }
        eVarB.addAll(listC);
        aim.e eVarA = u.a(eVarB);
        StatementPeriodSelection period2 = customisationSelection.getPeriod();
        StatementPeriod selectedPeriod = period2 != null ? period2.f88218b : null;
        boolean z = false;
        if (selectedPeriod != null) {
            kgm.i iVar = wVar.d;
            ProductSelection productSelection2 = customisationSelection.getProductSelection();
            List<CustomStatementAccountPeriods> productPeriods = content.getPeriods().getAccounts();
            l80.e eVar = (l80.e) iVar.f184024c;
            Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
            Intrinsics.checkNotNullParameter(productSelection2, "productSelection");
            Intrinsics.checkNotNullParameter(productPeriods, "productPeriods");
            Iterator<T> it8 = productPeriods.iterator();
            loop1: while (true) {
                if (!it8.hasNext()) {
                    z = true;
                    break;
                }
                CustomStatementAccountPeriods customStatementAccountPeriods = (CustomStatementAccountPeriods) it8.next();
                if (!customStatementAccountPeriods.getElements().isEmpty()) {
                    for (CustomStatementElementPeriod customStatementElementPeriod : customStatementAccountPeriods.getElements()) {
                        if (productSelection2.isProductElementSelected(customStatementElementPeriod.getId())) {
                            LocalDate startDate = customStatementElementPeriod.getStartDate();
                            LocalDate endDate = customStatementElementPeriod.getEndDate();
                            if (endDate == null) {
                                endDate = ((l80.f) eVar).e();
                            }
                            if (!startDate.isAfter(selectedPeriod.getEnd()) && !selectedPeriod.getStart().isAfter(endDate)) {
                                break loop1;
                            }
                        }
                    }
                } else if (productSelection2.getSelectedProducts().contains(customStatementAccountPeriods.getProductType())) {
                    LocalDate startDate2 = customStatementAccountPeriods.getStartDate();
                    LocalDate endDate2 = customStatementAccountPeriods.getEndDate();
                    if (endDate2 == null) {
                        endDate2 = ((l80.f) eVar).e();
                    }
                    if (!startDate2.isAfter(selectedPeriod.getEnd()) && !selectedPeriod.getStart().isAfter(endDate2)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
            z = !z;
        }
        return new xzd.n(eVarA, true, z);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        zh9.g gVar;
        List list;
        List list2;
        List list3;
        TextLocalisedClause textLocalisedClause;
        Clause clauseH;
        vi9.l lVar;
        i0 i0Var;
        zh9.i iVar;
        i0 i0Var2;
        Iterator it8;
        zh9.i iVar2;
        String str;
        vi9.l lVar2;
        LayeredImage layeredImage;
        Clause clauseM;
        RowDelegate.Model model;
        List list4;
        List listA;
        Clause textLocalisedQuantityClause;
        Collection collectionC;
        List list5;
        aim.f fVar;
        LinkedHashMap linkedHashMap;
        RowDelegate.Model model2;
        RowDelegate.Model.MainImage.Image40 image40;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        TextLocalisedClause textLocalisedClause4;
        Collection collectionG;
        y25.h hVar = (y25.h) this.f300767b;
        od0.i iVar3 = (od0.i) this.f300768c;
        y yVar = (y) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(yVar, "<destruct>");
        od0.i iVar4 = (od0.i) yVar.f288491a;
        j1 state = (j1) yVar.f288492b;
        List payLaterActiveCards = (List) yVar.f288493c;
        List list6 = (List) yVar.d;
        List list7 = (List) yVar.e;
        List upcomingInstalmentsWithPlan = (List) yVar.f;
        i0 i0Var3 = (i0) iVar4.c();
        vi9.l lVar3 = hVar.f310598c;
        vi9.n nVar = hVar.f310597b;
        aim.e eVarB = u.b();
        zh9.i iVar5 = i0Var3.f322286b;
        zh9.h hVar2 = iVar5.f;
        if (hVar2 == null || (gVar = hVar2.f322278r) == null) {
            gVar = zh9.g.MAX_PURCHASE_AMOUNT;
        }
        od0.i.Companion.getClass();
        od0.i accountConfig = od0.h.a(iVar5);
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accountConfig, "accountConfig");
        y0 productState = accountConfig.f224257a != null ? new x0(state, (zh9.i) accountConfig.c()) : y0.a.f322367a;
        vi9.h hVar3 = nVar.f289546a;
        Intrinsics.checkNotNullParameter(productState, "productState");
        Intrinsics.checkNotNullParameter(payLaterActiveCards, "payLaterActiveCards");
        aim.e eVarB2 = u.b();
        Intrinsics.checkNotNullParameter(productState, "productState");
        j1 j1VarA = productState.a();
        if (j1VarA instanceof h1) {
            boolean z = productState instanceof x0;
            list = payLaterActiveCards;
            list2 = list6;
            list3 = list7;
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_activation_widget_subtitle_healthy, null, null, 14);
            Object objH = textLocalisedClause5;
            if (z) {
                objH = w0.H(textLocalisedClause5);
            }
            clauseH = (Clause) objH;
        } else {
            list = payLaterActiveCards;
            list2 = list6;
            list3 = list7;
            if (j1VarA instanceof i1) {
                if ((productState instanceof x0 ? (x0) productState : null) == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                clauseH = w0.H(new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_timer_active_v2, u.c(Integer.valueOf(((i1) j1VarA).f322290c)), null, 12));
            } else {
                if (!(j1VarA instanceof g1)) {
                    throw new NoWhenBranchMatchedException();
                }
                g0 g0Var = ((g1) j1VarA).f322266a;
                if ((g0Var instanceof zh9.a0) || (g0Var instanceof zh9.f0)) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_toggle_deactivated, null, null, 14);
                } else {
                    if (!(g0Var instanceof e0) && !(g0Var instanceof zh9.d0) && !(g0Var instanceof c0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.credit_pay_later_account_activation_widget_subtitle_restricted, null, null, 14);
                }
                clauseH = w0.H(textLocalisedClause);
            }
        }
        Clause clause = clauseH;
        boolean z3 = j1VarA instanceof i1;
        y0 y0Var = productState;
        RowDelegate.Model header = new RowDelegate.Model("PAY_LATER_SWITCH_ID", z3 ? new RowDelegate.Model.MainImage.CountdownTimer(vi9.n.d((i1) j1VarA, false), null, false, false) : new RowDelegate.Model.MainImage.Image40(com.revolut.core.ui_kit_core.displayers.image.models.b.b("3D212"), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_toggle_title, null, null, 14), null, 0, clause, null, null, 0, new vf(z3, !(j1VarA instanceof g1)), false, null, false, null, null, null, null, null, null, y0Var, new AnalyticsContext(vi9.n.a(y0Var)), 0, 0, 0, 0, 524286936);
        if (y0Var.a() instanceof i1) {
            aim.e eVarB3 = u.b();
            List list8 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list8, 10));
            Iterator it9 = list8.iterator();
            while (it9.hasNext()) {
                h93.f0 card = (h93.f0) it9.next();
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(card, "card");
                if (ifk.b.m(card)) {
                    b93.j cardDesign = card.f150114h;
                    ia3.u uVar = hVar3.f289542a;
                    it8 = it9;
                    Intrinsics.checkNotNullParameter("PAY_LATER_DISPOSABLE_CARD_PLACEHOLDER", "listId");
                    Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
                    i0Var2 = i0Var3;
                    iVar2 = iVar5;
                    lVar2 = lVar3;
                    model = new RowDelegate.Model("PAY_LATER_DISPOSABLE_CARD_PLACEHOLDER", new RowDelegate.Model.MainImage.Image40(((ia3.h) uVar.f159951a).b(cardDesign, false), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_disposable_placeholder_name_short, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_disposable_placeholder_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869848);
                } else {
                    i0Var2 = i0Var3;
                    it8 = it9;
                    iVar2 = iVar5;
                    String str2 = card.f150110a;
                    CompositeClause compositeClauseJ = v04.b.J(card, card.f150111b, card.x() ? new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone10), false, null, false, null, 254) : null, null, 12);
                    if (card.x()) {
                        if (card.Z()) {
                            str = str2;
                            clauseM = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.card_state_temporarily_suspended, null, new Custom(Integer.valueOf(R$attr.uikit_colorRed), false, null, false, null, 254), 10);
                            layeredImage = null;
                        } else {
                            str = str2;
                            if (card.D()) {
                                layeredImage = null;
                                clauseM = new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_card_deactivated_status, null, new Custom(Integer.valueOf(R$attr.uikit_colorDeepGrey), false, null, false, null, 254), 10);
                            } else {
                                layeredImage = null;
                                clauseM = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.card_state_frozen_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorPink), false, null, false, null, 254), 10);
                            }
                        }
                        lVar2 = lVar3;
                    } else {
                        str = str2;
                        aim.e eVarB4 = u.b();
                        org.joda.time.LocalDate localDate = card.f150120q;
                        String str3 = card.f150115j;
                        if (str3 != null) {
                            eVarB4.add(new TextClause("*", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            eVarB4.add(new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        if (localDate != null) {
                            layeredImage = null;
                            eVarB4.add(new DotDividerClause((Integer) null));
                            lVar2 = lVar3;
                            eVarB4.add(new TextLocalisedClause(com.revolut.feature.cards_core.R$string.dashboard_widgets_cards_expires_on, null, null, 14));
                            eVarB4.add(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                            String string = localDate.toString("MM/YY");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            eVarB4.add(new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        } else {
                            lVar2 = lVar3;
                            layeredImage = null;
                        }
                        clauseM = yoj.b.m(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB4));
                    }
                    RowDelegate.Model model3 = new RowDelegate.Model(str, new RowDelegate.Model.MainImage.Image40(((ia3.h) hVar3.f289543b).c(card), card.x() ? card.Z() ? vi9.h.a(R$drawable.uikit_icn_16_exclamation_mark_sign, R$attr.uikit_colorRed) : card.D() ? vi9.h.a(R$drawable.uikit_icn_16_lock_closed, R$attr.uikit_colorDeepGrey) : vi9.h.a(R$drawable.uikit_icn_24_snowflake, R$attr.uikit_colorPink) : layeredImage, null, false, 28), compositeClauseJ, null, 0, clauseM, null, null, 0, null, false, null, false, null, null, null, null, null, null, new bi9.a(card.f150110a), null, 0, 0, 0, 0, 532675544);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    model = model3;
                }
                arrayList.add(model);
                lVar3 = lVar2;
                it9 = it8;
                i0Var3 = i0Var2;
                iVar5 = iVar2;
            }
            lVar = lVar3;
            i0Var = i0Var3;
            iVar = iVar5;
            eVarB3.addAll(arrayList);
            aim.e eVarA = u.a(eVarB3);
            LargeActionButtonDelegate.Model model4 = new LargeActionButtonDelegate.Model("PAY_LATER_SWITCH_GROUP_SEE_ALL", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_home_cards_see_all, null, null, 14), false, null, null, null, null, 1000);
            yp0.b.r(model4, R$attr.uikit_dp16, R$attr.uikit_dp12, 0, 0, 12);
            eVarB2.addAll(i26.l.d(header, eVarA, model4, 3));
        } else {
            Intrinsics.checkNotNullParameter(header, "header");
            eVarB2.add(header);
            lVar = lVar3;
            i0Var = i0Var3;
            iVar = iVar5;
        }
        aim.e eVarA2 = u.a(eVarB2);
        yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
        eVarB.addAll(eVarA2);
        if (list2.isEmpty()) {
            zh9.a configuration = cj9.c.Y(i0Var);
            if (configuration != null) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                zh9.l lVar4 = zh9.m.Companion;
                wi0.b bVar = (wi0.b) configuration.f322246a.f186386b;
                lVar4.getClass();
                boolean z4 = zh9.l.a(bVar).f322303a;
                collectionG = yp0.b.g(si9.c.a((z4 && configuration.f322248c) ? b.a.C1464a.f263528a : z4 ? b.a.C1465b.f263529a : b.a.c.f263530a).a(configuration), new ListSubheaderDelegate.Model("header_how_it_works", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_home_info_header, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
            } else {
                collectionG = f0.f322471a;
            }
            eVarB.addAll(collectionG);
        } else {
            int i = 2;
            if (gVar == zh9.g.TOTAL_OWED) {
                vi9.g0 g0Var2 = hVar.f310601j;
                vi9.b bVar2 = g0Var2.f289541a;
                if (list3.isEmpty() || list2.isEmpty()) {
                    list4 = upcomingInstalmentsWithPlan;
                    listA = f0.f322471a;
                } else {
                    List<r0> list9 = list2;
                    int iB = zhm.q0.b(zhm.w.t(list9, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB);
                    for (Object obj5 : list9) {
                        linkedHashMap2.put(((r0) obj5).f322328c, obj5);
                    }
                    aim.f builder = new aim.f();
                    for (r0 r0Var : list9) {
                        for (zh9.p pVar : r0Var.B) {
                            for (String str4 : pVar.f322319g) {
                                Object arrayList2 = builder.get(str4);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    builder.put(str4, arrayList2);
                                }
                                ((List) arrayList2).add(new zh9.y(pVar, r0Var));
                            }
                        }
                    }
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    aim.f fVarB = builder.b();
                    aim.e eVarB5 = u.b();
                    Intrinsics.checkNotNullParameter(upcomingInstalmentsWithPlan, "upcomingInstalmentsWithPlan");
                    DateTime dateTimePlusDays = new DateTime(System.currentTimeMillis()).plusDays(7);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj6 : upcomingInstalmentsWithPlan) {
                        if (((zh9.y) obj6).f322366b.f322317b.compareTo((ReadableInstant) dateTimePlusDays) <= 0) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        collectionC = f0.f322471a;
                    } else {
                        RowDelegate.Model.MainImage.Image40 image40A = g0Var2.a(arrayList3);
                        TextLocalisedQuantityClause textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_pay_later_transactions_upcoming_repayments_number, Integer.valueOf(arrayList3.size()), (List) null, (Style) null, 28);
                        if (arrayList3.size() == 1) {
                            int days = Days.daysBetween(new DateTime(System.currentTimeMillis()).withTimeAtStartOfDay(), ((zh9.y) d0.b0(arrayList3)).f322366b.f322317b.withTimeAtStartOfDay()).getDays();
                            textLocalisedQuantityClause = days < 1 ? new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_repayment_due_today, null, null, 14) : new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_pay_later_transactions_due_date_days, Integer.valueOf(days), (List) null, (Style) null, 28);
                        } else {
                            textLocalisedQuantityClause = new TextLocalisedQuantityClause(com.revolut.feature.credit.core.R$plurals.credit_pay_later_transactions_due_within_date_days, (Number) 7, (List) null, (Style) null, 28);
                        }
                        dj0.d.Companion.getClass();
                        dj0.d dVarV = dj0.d.e;
                        int i2 = 0;
                        for (Object obj7 : arrayList3) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                v.s();
                                throw null;
                            }
                            dVarV = i2 == 0 ? czi.c.v(((zh9.y) obj7).f322366b) : pyd.c.O(dVarV, czi.c.v(((zh9.y) obj7).f322366b));
                            i2 = i3;
                        }
                        collectionC = u.c(new RowDelegate.Model("upcoming_repayments_item", image40A, textLocalisedQuantityClause2, null, 0, textLocalisedQuantityClause, null, null, 0, new RowDelegate.Model.c.b(sx4.f.b(2, null, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), dVarV), null, null, false, 126), false, null, true, null, null, null, null, null, null, new bi9.h(arrayList3), null, 0, 0, 0, 0, 532667352));
                    }
                    eVarB5.addAll(collectionC);
                    HashSet hashSet = new HashSet();
                    ArrayList<a3> arrayList4 = new ArrayList();
                    for (Object obj8 : list3) {
                        if (hashSet.add(((a3) obj8).f272581b)) {
                            arrayList4.add(obj8);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (a3 transaction : arrayList4) {
                        String str5 = transaction.f272581b;
                        r0 plan = (r0) linkedHashMap2.get(str5);
                        List instalmentsWithPlan = (List) fVarB.get(str5);
                        if (instalmentsWithPlan == null) {
                            instalmentsWithPlan = f0.f322471a;
                        }
                        if (plan != null) {
                            Intrinsics.checkNotNullParameter(plan, "plan");
                            String strQ = j6.a.q("purchase_transaction_item_", plan.f322326a);
                            RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(bVar2.c(u0.Y(plan), null), null, null, false, null, false, 62);
                            TextClause textClause = new TextClause(plan.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                            TimeClause timeClause = new TimeClause(plan.f322330h.toEpochMilli(), new TimeClause.Format.Pretty(0), null, null, 12);
                            MoneyClause moneyClauseB = sx4.f.b(i, null, new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), plan.f322331j.l());
                            int i5 = vi9.f0.f289540a[plan.u.ordinal()];
                            if (i5 == 1) {
                                list5 = upcomingInstalmentsWithPlan;
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_30_days, null, null, 14);
                            } else if (i5 == i) {
                                list5 = upcomingInstalmentsWithPlan;
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(3), null, 12);
                            } else if (i5 == 3) {
                                list5 = upcomingInstalmentsWithPlan;
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(6), null, 12);
                            } else if (i5 == 4) {
                                list5 = upcomingInstalmentsWithPlan;
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(9), null, 12);
                            } else {
                                if (i5 != 5) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                list5 = upcomingInstalmentsWithPlan;
                                textLocalisedClause4 = new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_months, u.c(12), null, 12);
                            }
                            fVar = fVarB;
                            linkedHashMap = linkedHashMap2;
                            model2 = new RowDelegate.Model(strQ, image402, textClause, null, 0, timeClause, null, null, 0, new RowDelegate.Model.c.b(moneyClauseB, textLocalisedClause4, null, false, 124), false, null, false, null, null, null, null, null, null, new bi9.e(plan), null, 0, 0, 0, 0, 532675544);
                        } else {
                            list5 = upcomingInstalmentsWithPlan;
                            if (instalmentsWithPlan.isEmpty()) {
                                fVar = fVarB;
                                linkedHashMap = linkedHashMap2;
                                model2 = null;
                            } else {
                                Intrinsics.checkNotNullParameter(transaction, "transaction");
                                Intrinsics.checkNotNullParameter(instalmentsWithPlan, "instalmentsWithPlan");
                                zh9.y yVar2 = (zh9.y) d0.M0(instalmentsWithPlan);
                                dj0.d dVar = transaction.N1;
                                xi0.b bVar3 = dVar.f115083b;
                                String strQ2 = j6.a.q("repayment_transaction_item_", str5);
                                if (instalmentsWithPlan.size() == 1) {
                                    fVar = fVarB;
                                    linkedHashMap = linkedHashMap2;
                                    image40 = new RowDelegate.Model.MainImage.Image40(new PairedImage(new CurrencyImage(bVar3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), bVar2.c(u0.Y(((zh9.y) d0.K0(instalmentsWithPlan)).f322365a), null), R$attr.uikit_colorWidgetBackground, null), null, null, false, null, false, 62);
                                } else {
                                    fVar = fVarB;
                                    linkedHashMap = linkedHashMap2;
                                    List list10 = instalmentsWithPlan;
                                    ArrayList arrayList6 = new ArrayList(zhm.w.t(list10, 10));
                                    Iterator it10 = list10.iterator();
                                    while (it10.hasNext()) {
                                        arrayList6.add(((zh9.y) it10.next()).f322365a);
                                    }
                                    List listU = d0.U(arrayList6);
                                    image40 = listU.size() == 1 ? new RowDelegate.Model.MainImage.Image40(new PairedImage(new CurrencyImage(bVar3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), bVar2.c(u0.Y((r0) d0.K0(listU)), null), R$attr.uikit_colorWidgetBackground, null), null, null, false, null, false, 62) : g0Var2.a(instalmentsWithPlan);
                                }
                                RowDelegate.Model.MainImage.Image40 image403 = image40;
                                if (instalmentsWithPlan.size() > 1) {
                                    List list11 = instalmentsWithPlan;
                                    ArrayList arrayList7 = new ArrayList(zhm.w.t(list11, 10));
                                    Iterator it11 = list11.iterator();
                                    while (it11.hasNext()) {
                                        arrayList7.add(((zh9.y) it11.next()).f322365a);
                                    }
                                    List listU2 = d0.U(arrayList7);
                                    textLocalisedClause2 = listU2.size() == 1 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_transactions_repayment, u.c(((r0) d0.K0(listU2)).d), null, 12) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_transactions_bundled_repayment, null, null, 14);
                                } else {
                                    zh9.y yVar3 = (zh9.y) d0.K0(instalmentsWithPlan);
                                    dj0.d dVarA = dVar.a();
                                    zh9.p pVar2 = yVar3.f322366b;
                                    r0 r0Var2 = yVar3.f322365a;
                                    textLocalisedClause2 = dVarA.compareTo(czi.c.s(pVar2).a()) < 0 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_transactions_partial_repayment, u.c(r0Var2.d), null, 12) : new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_transactions_repayment, u.c(r0Var2.d), null, 12);
                                }
                                TextLocalisedClause textLocalisedClause6 = textLocalisedClause2;
                                TimeClause timeClause2 = new TimeClause(transaction.f272593h.getMillis(), new TimeClause.Format.Pretty(0), null, null, 12);
                                MoneyClause moneyClauseA = sx4.f.a(dVar.a(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), new Custom(Integer.valueOf(R$attr.uikit_colorGreen), false, null, false, null, 254));
                                if (yVar2 != null) {
                                    r0 r0Var3 = yVar2.f322365a;
                                    textLocalisedClause3 = vi9.f0.f289540a[r0Var3.u.ordinal()] == 1 ? new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_payment_schedule_instalment_type_pay_in_30_days, null, null, 14) : new TextLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_repayments_number_of_count, v.k(Integer.valueOf(yVar2.f322366b.f322316a + 1), Integer.valueOf(r0Var3.B.size())), null, 12);
                                } else {
                                    textLocalisedClause3 = null;
                                }
                                model2 = new RowDelegate.Model(strQ2, image403, textLocalisedClause6, null, 0, timeClause2, null, null, 0, new RowDelegate.Model.c.b(moneyClauseA, textLocalisedClause3, null, false, 124), false, null, false, null, null, null, null, null, null, yVar2 != null ? new bi9.g(yVar2) : new bi9.h(instalmentsWithPlan), null, 0, 0, 0, 0, 532675544);
                            }
                        }
                        if (model2 != null) {
                            arrayList5.add(model2);
                        }
                        upcomingInstalmentsWithPlan = list5;
                        fVarB = fVar;
                        linkedHashMap2 = linkedHashMap;
                        i = 2;
                    }
                    list4 = upcomingInstalmentsWithPlan;
                    eVarB5.addAll(arrayList5);
                    eVarB5.add(new LargeActionButtonDelegate.Model("see_all_pay_later_transactions", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000));
                    listA = u.a(eVarB5);
                    yp0.b.k(listA, 0, 0, 0, 0, 31);
                }
                eVarB.addAll(listA);
            } else {
                list4 = upcomingInstalmentsWithPlan;
            }
            if (list4.isEmpty()) {
                eVarB.addAll(yp0.b.i(new RowDelegate.Model("id_no_upcoming_repayment_item", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_coins, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62), new TextClause("No upcoming payments", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904), lVar.g(), yp0.e0.INSIDE_BOX, 0, 0, 124));
            } else {
                aim.e eVarB6 = u.b();
                List listV0 = d0.V0(d8l.d.u(list4), 2);
                ArrayList arrayList8 = new ArrayList(zhm.w.t(listV0, 10));
                Iterator it12 = listV0.iterator();
                while (it12.hasNext()) {
                    arrayList8.add(yh9.b.a(lVar, (zh9.y) it12.next()));
                }
                eVarB6.addAll(arrayList8);
                eVarB6.add(new LargeActionButtonDelegate.Model("SEE_ALL_REPAYMENTS", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000));
                eVarB.addAll(yp0.b.g(u.a(eVarB6), lVar.g(), yp0.e0.INSIDE_BOX, 0, 0, 124));
            }
            if (gVar != zh9.g.TOTAL_OWED) {
                aim.e eVarB7 = u.b();
                List listV02 = d0.V0(d0.P0(list2, new y25.e()), 2);
                ArrayList arrayList9 = new ArrayList(zhm.w.t(listV02, 10));
                Iterator it13 = listV02.iterator();
                while (it13.hasNext()) {
                    arrayList9.add(hVar.d.d(iVar, (r0) it13.next()));
                }
                eVarB7.addAll(arrayList9);
                if (list2.size() > 2) {
                    eVarB7.add(new LargeActionButtonDelegate.Model("SEE_ALL_PLANS", LargeActionButton.ButtonStyle.o, null, new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_common_see_all, null, null, 14), false, null, null, null, null, 1000));
                }
                eVarB.addAll(yp0.b.g(u.a(eVarB7), new ListSubheaderDelegate.Model("id_plans_subheader", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_pay_later_account_purchases, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), yp0.e0.INSIDE_BOX, 0, 0, 124));
            }
        }
        if (i0Var.e) {
            HtmlLocalisedClause htmlLocalisedClause = new HtmlLocalisedClause(com.revolut.feature.pay_later.api.R$string.pay_later_home_disclaimer_ie, (List) null, (Integer) null, (Object) null, 30);
            ak0 ak0Var = new ak0(null, null, 3);
            int i6 = R$attr.uikit_dp32;
            eVarB.add(new TextDelegate.Model("IE_DISCLAIMER", htmlLocalisedClause, false, ak0Var, null, null, i6, i6, i6, i6, 116));
        }
        return u.a(eVarB);
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        RowDelegate.Model modelB;
        TextLocalisedClause textLocalisedClause;
        AccountId accountId = (AccountId) this.f300767b;
        h93.f0 f0Var = (h93.f0) this.f300768c;
        x33.b content = (x33.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        ListSubheaderDelegate.Model modelC = y43.b.c();
        x33.j jVar = content.d;
        if (jVar instanceof x33.g) {
            modelB = y43.b.b(new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_all_accounts_crypto, null, null, 14), y43.b.a(R$drawable.uikit_icn_24_coins), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_all_accounts_crypto_subtitle, null, null, 14), f0Var);
        } else if (jVar instanceof x33.h) {
            if (f0Var.T) {
                xi0.b.Companion.getClass();
                xi0.b bVar = xi0.b.D;
                modelB = y43.b.b(new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4), y43.b.a(R$drawable.uikit_icn_24_rates_converter_page), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_pocket_subtitle, u.c(ix0.d0.a(bVar, null)), null, 12), f0Var);
            } else {
                if (accountId instanceof AccountId.Personal) {
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_all_accounts_cash, null, null, 14);
                } else {
                    if (!(accountId instanceof AccountId.Joint)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    textLocalisedClause = new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_all_accounts_joint, null, null, 14);
                }
                modelB = y43.b.b(textLocalisedClause, y43.b.a(R$drawable.uikit_icn_24_rates_converter_page), new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_all_accounts_cash_subtitle, null, null, 14), f0Var);
            }
        } else {
            if (!(jVar instanceof x33.i)) {
                throw new NoWhenBranchMatchedException();
            }
            PocketWithSubaccount pocketWithSubaccount = (PocketWithSubaccount) d0.b0(((x33.i) jVar).f302643a);
            io3.d dVar = pocketWithSubaccount.f65523a;
            xi0.b bVarL = z92.f.l(dVar);
            String str = pocketWithSubaccount.f65524b;
            Clause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : new CurrencyClause(bVarL, null, null, 6);
            Image currencyImage = pocketWithSubaccount.f65525c;
            if (currencyImage == null) {
                currencyImage = new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            }
            modelB = y43.b.b(textClause, currencyImage, pocketWithSubaccount.a() ? new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_personal_vault_subtitle, null, null, 14) : new TextLocalisedClause(com.revolut.feature.card_payment_method.impl.R$string.card_payment_method_pocket_subtitle, u.c(ix0.d0.a(z92.f.l(dVar), null)), null, 12), f0Var);
        }
        RowDelegate.Model model = modelB;
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return i2b.a.r(modelC, model);
    }

    private final Object r(Object obj2, Object obj3, Object obj4) {
        PlainTextDelegate.Model model;
        List listP;
        wdh.a aVar = (wdh.a) this.f300767b;
        y4h.i iVar = (y4h.i) this.f300768c;
        yel.b content = (yel.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        if (y4h.h.f310945a[aVar.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        u4h.b bVar = iVar.f310946a;
        if (content == null) {
            RowDelegate.Model model2 = new RowDelegate.Model("RATINGS_WIDGET_RATING", null, new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_widget_rating_empty, null, null, 14), null, 0, null, null, null, 0, null, false, null, false, RowDelegate.Model.b.a.f53266a, null, null, null, null, null, null, null, 0, 0, 0, 0, 536852474);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            listP = u.c(model2);
        } else {
            yel.a rating = content.f313034a;
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("RATINGS_TITLE", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_ratings_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65338);
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_ratings_cell_current_rating, null, null, 14);
            String strA = bVar.a(rating);
            Intrinsics.checkNotNullParameter(rating, "rating");
            q6 q6Var = new q6("RATINGS_ITEM_CURRENT_RATING", textLocalisedClause, u4h.a.a(Integer.valueOf(rating.ordinal() <= yel.a.BBB_MINUS.ordinal() ? R$attr.uikit_colorTeal : R$attr.uikit_colorOrange), strA), null, null, 0, 0, 2040);
            CellDetailsDelegate.Model model4 = new CellDetailsDelegate.Model("RATINGS_ITEM_CREDIT_QUALITY", new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_ratings_cell_credit_quality, null, null, 14), bVar.b(rating), null, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), true, 0, null, new CreditQualityScreenContract$RatingsContext.FitchRatingContext(rating), null, null, 0, null, false, null, 0, 0, 0, 0, 1048008);
            String str = content.d;
            CellDetailsDelegate.Model model5 = str != null ? new CellDetailsDelegate.Model("RATINGS_ITEM_OUTLOOK", new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_ratings_cell_outlook, null, null, 14), new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520) : null;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_ratings_cell_last_rating_action, null, null, 14);
            long jP = ebm.a.P(content.f313035b);
            TimeClause.Format.INSTANCE.getClass();
            Object[] elements = {q6Var, model4, model5, new CellDetailsDelegate.Model("RATINGS_ITEM_LAST_RATING_ACTION", textLocalisedClause2, new TimeClause(jP, TimeClause.Format.f57959a, null, null, 12), null, null, false, 0, null, null, null, null, 0, null, false, null, 0, 0, 0, 0, 1048520)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            List listL = kotlin.collections.d.L(elements);
            yp0.b.k(listL, 0, 0, 0, 0, 31);
            List listQ = i2b.a.q(model3, listL);
            String str2 = content.f313036c;
            if (str2 != null) {
                model = new PlainTextDelegate.Model("COMMENTARY_TITLE", (UrlImage) null, new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_section_commentary_title, null, null, 14), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (v5) null, (List) null, (String) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 32746);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            } else {
                model = null;
            }
            listP = i2b.a.p(listQ, model);
        }
        TextDelegate.Model model6 = new TextDelegate.Model("RATINGS_FOOTER", new TextLocalisedClause(com.revolut.feature.wealth.assetdetails.ui.impl.R$string.trading_bonds_ratings_details_footer_title, null, null, 14), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
        yp0.b.r(model6, 0, 0, 0, 0, 15);
        return i2b.a.p(listP, model6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04a6  */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wx6.k.s(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v66, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object content, Object obj2, Object obj3) {
        float fFloatValue;
        Data data;
        Collection collectionC;
        ?? arrayList;
        boolean z;
        ActionWidgetDelegate.Model model;
        fr2.j jVar;
        Integer numValueOf;
        fr2.a aVar;
        fr2.a aVar2;
        String str;
        int i;
        fr2.j jVar2;
        ?? arrayList2;
        xmd.u uVar;
        int i2 = this.f300766a;
        int i3 = 0;
        Object obj4 = this.f300768c;
        Object obj5 = this.f300767b;
        switch (i2) {
            case 0:
                l lVar = (l) obj5;
                h hVar = (h) obj4;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter((g) content, "<unused var>");
                String str2 = hVar.f300762c;
                boolean z3 = hVar.f300761b;
                aim.e eVarB = u.b();
                InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_ITEM_INPUT_MESSAGE", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, null, new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_customer_message_input_message_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_common_word_optional, null, null, 14), null, null, false, null, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090519180, 131071);
                yp0.b.r(model2, 0, 0, 0, 0, 15);
                eVarB.add(model2);
                if (lVar.f300769a instanceof InvoiceEmailMessageScreenContract$InputData.SingleInvoiceEmailMessage) {
                    InputChecklistDelegate.Model model3 = new InputChecklistDelegate.Model("ID_ITEM_CHECKBOX_DEFAULT", new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_sale_invoice_customer_message_input_make_default_title, null, null, 14), z3, false, null, iq.CHECK_BUTTON, null, null, null, null, 0, 0, 0, 524248);
                    yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
                    eVarB.add(model3);
                }
                return u.a(eVarB);
            case 1:
                wyd.c0 c0Var = (wyd.c0) obj5;
                Set set = (Set) obj4;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                Set setI = c0Var.f301246c.i();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj6 : (List) content) {
                    io3.d dVar = (io3.d) obj6;
                    io3.k[] elements = {io3.k.ACTIVE, io3.k.DELISTED};
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    if (!kotlin.collections.d.y0(elements).contains(dVar.f) || setI.contains(dVar.f163145a)) {
                        arrayList4.add(obj6);
                    } else {
                        arrayList3.add(obj6);
                    }
                }
                return d0.E0(wyd.c0.i(d0.P0(arrayList4, new q2j.v(c0Var, 20)), set), wyd.c0.i(d0.P0(arrayList3, new q2j.v(c0Var, 20)), set));
            case 2:
                wyg.u uVar2 = (wyg.u) obj5;
                wyg.a aVar3 = (wyg.a) obj4;
                PerformanceChart performanceData = (PerformanceChart) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(performanceData, "performanceData");
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_performance_title, null, null, 14);
                PerformanceChartPoint performanceChartPoint = (PerformanceChartPoint) d0.o0(performanceData.f94993c);
                Pair pair = aVar3.k;
                PerformanceChartPoint performanceChartPoint2 = aVar3.f301277j;
                if (pair != null) {
                    fFloatValue = ((PerformanceChartPoint) pair.f186386b).f94996c - ((PerformanceChartPoint) pair.f186385a).f94996c;
                } else if (performanceChartPoint2 != null) {
                    fFloatValue = performanceChartPoint2.f94996c;
                } else {
                    Float fValueOf = performanceChartPoint != null ? Float.valueOf(performanceChartPoint.f94996c) : null;
                    fFloatValue = fValueOf != null ? fValueOf.floatValue() : BitmapDescriptorFactory.HUE_RED;
                }
                BigDecimal bigDecimalMultiply = new BigDecimal(String.valueOf(fFloatValue)).multiply(new BigDecimal(100));
                Intrinsics.h(bigDecimalMultiply);
                CompositeClause compositeClauseC = xqi.a.c(bigDecimalMultiply, false, false, false, false, e1.D(bigDecimalMultiply), 71);
                CompositeClause compositeClauseB = uVar2.b(aVar3);
                Pair pair2 = aVar3.k;
                return new wyg.b(textLocalisedClause, compositeClauseC, compositeClauseB, true, uyg.c.c(pair2 != null ? new Pair(((PerformanceChartPoint) pair2.f186385a).f94994a, ((PerformanceChartPoint) pair2.f186386b).f94994a) : null, performanceChartPoint2 != null ? performanceChartPoint2.f94994a : null, aVar3.f301272a), false, (!((jte.d) uVar2.e).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c) || (data = aVar3.f301280n) == null) ? null : (TagViewData) iii.c.f(data, new wyc.p(4), new s(0), new j0(uVar2, performanceData, 14)));
            case 3:
                wz6.i iVar = (wz6.i) obj5;
                ht6.b perksContent = (ht6.b) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(perksContent, "perksContent");
                cgc.g gVar = ((wz6.d) obj4).f301373b;
                ArrayList<cgc.g> arrayList5 = perksContent.f155329b;
                if (arrayList5.size() < 2 || gVar == null) {
                    collectionC = f0.f322471a;
                } else {
                    ArrayList arrayList6 = new ArrayList(zhm.w.t(arrayList5, 10));
                    for (cgc.g gVar2 : arrayList5) {
                        arrayList6.add(new com.revolut.core.ui_kit.views.q(gVar2.f23912a, new t(new TextClause(gVar2.f23913b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), 34));
                    }
                    collectionC = u.c(new TabsDelegate.Model("LIST_ID_TABS", arrayList6, gVar.f23912a, null, null, null, 0, 0, null, 8184));
                }
                List list = perksContent.f155328a;
                if (gVar != null) {
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj7 : list) {
                        List list2 = ((cgc.c) obj7).f;
                        if (list2 == null) {
                            list2 = f0.f322471a;
                        }
                        if (list2.contains(gVar.f23912a)) {
                            arrayList7.add(obj7);
                        }
                    }
                    list = arrayList7;
                }
                Collection collection = collectionC;
                if (list.isEmpty()) {
                    arrayList = u.c(iVar.f301379b.a());
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                } else {
                    List list3 = list;
                    arrayList = new ArrayList(zhm.w.t(list3, 10));
                    int i5 = 0;
                    for (Object obj8 : list3) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            v.s();
                            throw null;
                        }
                        cgc.c cVar = (cgc.c) obj8;
                        kgc.d dVar2 = iVar.f301378a;
                        cgc.j jVar3 = cVar.d;
                        cgc.e eVar = cVar.e;
                        cgc.l lVar2 = cVar.f23909c;
                        Image imageA = ((sic.d) dVar2).a(cVar.hashCode(), jVar3.d);
                        String str3 = jVar3.f23916b;
                        String strN = a0.d.n("LIST_ID_PERK", i5);
                        ps psVar = new ps(imageA);
                        String str4 = lVar2.f23919b;
                        TextClause textClause = new TextClause(str4 == null ? "" : str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String str5 = lVar2.f23920c;
                        UrlImage urlImage = new UrlImage(str5 == null ? "" : str5, null, null, null, 0L, null, null, null, null, null, false, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 15), null, null, null, null, null, ISO781611.SMT_TAG), null, null, false, false, 507902);
                        us usVar = cVar.f23908b ? ss.f166386a : ts.f166562a;
                        String str6 = jVar3.f23915a;
                        TextClause textClause2 = str6 != null ? new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                        List listC = str3.length() > 0 ? u.c(TagViewData.Companion.d(TagViewData.INSTANCE, str3, R$attr.uikit_colorGreyTone20, R$attr.uikit_colorForeground)) : null;
                        Intrinsics.checkNotNullParameter(eVar, "<this>");
                        qs qsVar = new qs(strN, psVar, usVar, listC, textClause, textClause2, urlImage, null, Intrinsics.f(eVar.f23910a, "PERK_DETAILS") ? new FreelancerPerksListScreenContract$PerkId(eVar.f23911b) : null, 1920);
                        yp0.b.l(qsVar, 0, 0, 0, 0, null, false, 63);
                        arrayList.add(qsVar);
                        i5 = i6;
                    }
                }
                return d0.E0((Iterable) arrayList, collection);
            case 4:
                wzb.k kVar = (wzb.k) obj5;
                wzb.f fVar = (wzb.f) obj4;
                Map groupedExpiringPoints = (Map) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(groupedExpiringPoints, "groupedExpiringPoints");
                if (groupedExpiringPoints.isEmpty()) {
                    List listC2 = u.c(new FullScreenStateDelegate.Model("FULL_SCREEN_DELEGATE_ITEM_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_not_expiring_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_not_expiring_description, null, null, 14), new ComplexImage.Regular(new GlyphImage(R$drawable.uikit_icn_24_all_time, null, null, 6)), new l6(12, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_earn_more, null, null, 14), null, h4.ACCENT), zj.REGULAR, false, null, null, null, 1984));
                    yp0.b.k(listC2, 0, 0, 0, 0, 31);
                    return listC2;
                }
                aim.e eVarB2 = u.b();
                List list4 = (List) groupedExpiringPoints.values().iterator().next();
                YearMonth yearMonthFrom = YearMonth.from(((l80.f) kVar.f301404a).b().atZone(g0m.a.f139502a));
                ArrayList arrayList8 = new ArrayList();
                for (Object obj9 : list4) {
                    if (Intrinsics.f(YearMonth.from(((IssuedPoints) obj9).a()), yearMonthFrom)) {
                        arrayList8.add(obj9);
                    }
                }
                if (arrayList8.isEmpty()) {
                    z = true;
                    int i21 = com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_widget_not_expiring_new_title;
                    LocalDate localDateAtEndOfMonth = yearMonthFrom.atEndOfMonth();
                    Intrinsics.checkNotNullExpressionValue(localDateAtEndOfMonth, "atEndOfMonth(...)");
                    ZoneId zoneId = g0m.a.f139502a;
                    model = new ActionWidgetDelegate.Model("ACTION_WIDGET_ITEM_ID", new TextLocalisedClause(i21, u.c(new TimeClause(oc.c.E(localDateAtEndOfMonth, zoneId), new TimeClause.Format.Month(0), null, zoneId, 4)), null, 12), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_widget_not_expiring_description, null, null, 14), new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_earn_more, null, null, 14), null, false), null, null, null, false, 8016);
                } else {
                    long jE = oc.c.E(((IssuedPoints) d0.b0(arrayList8)).a(), g0m.a.f139502a);
                    dj0.d.Companion.getClass();
                    dj0.d dVarO = dj0.d.e;
                    int i22 = 0;
                    for (Object obj10 : arrayList8) {
                        int i32 = i22 + 1;
                        if (i22 < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO = i22 == 0 ? ((IssuedPoints) obj10).e : pyd.c.O(dVarO, ((IssuedPoints) obj10).e);
                        i22 = i32;
                    }
                    z = true;
                    model = new ActionWidgetDelegate.Model("ACTION_WIDGET_ITEM_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_widget_expiring_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_widget_expiring_description, v.k(nub.a.q(nub.a.a(dVarO), null, null, null, 7), new TimeClause(jE, new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, g0m.a.f139502a, 4)), null, 12), new com.revolut.core.ui_kit.delegates.m(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), (NewBadgeContent.WithNumber) null, (CircleBadgeModel) null, 10), null, new com.revolut.core.ui_kit.delegates.i(14, new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_learn_more, null, null, 14), null, false), null, arrayList8, null, false, 8016);
                }
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                eVarB2.add(model);
                Map map = fVar.f301400c;
                ArrayList arrayList9 = new ArrayList(groupedExpiringPoints.size());
                for (Map.Entry entry : groupedExpiringPoints.entrySet()) {
                    int iIntValue = ((Number) entry.getKey()).intValue();
                    List list5 = (List) entry.getValue();
                    boolean zBooleanValue = ((Boolean) map.getOrDefault(Integer.valueOf(iIntValue), Boolean.FALSE)).booleanValue();
                    List list6 = list5;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj11 : list6) {
                        Long lValueOf = Long.valueOf(oc.c.E(((IssuedPoints) obj11).a(), g0m.a.f139502a));
                        Object arrayList10 = linkedHashMap.get(lValueOf);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap.put(lValueOf, arrayList10);
                        }
                        ((List) arrayList10).add(obj11);
                    }
                    ArrayList arrayList11 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        long jLongValue = ((Number) entry2.getKey()).longValue();
                        List list7 = (List) entry2.getValue();
                        String strM = p.a.m(jLongValue, "ROW_ITEM_ID_PREFIX");
                        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_all_time, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), null, null, false, null, false, 62);
                        TimeClause timeClause = new TimeClause(jLongValue, new TimeClause.Format.DayAndMonth(ka.SHORT), null, g0m.a.f139502a, 4);
                        dj0.d.Companion.getClass();
                        dj0.d dVarO2 = dj0.d.e;
                        int i33 = 0;
                        for (Object obj12 : list7) {
                            int i43 = i33 + 1;
                            if (i33 < 0) {
                                v.s();
                                throw null;
                            }
                            dVarO2 = i33 == 0 ? ((IssuedPoints) obj12).e : pyd.c.O(dVarO2, ((IssuedPoints) obj12).e);
                            i33 = i43;
                        }
                        arrayList11.add(new RowDelegate.Model(strM, image40, timeClause, null, 0, null, null, null, 0, new RowDelegate.Model.c.b(nub.a.q(nub.a.a(dVarO2), null, null, null, 7), null, null, false, 126), false, null, false, null, null, null, null, null, null, list7, null, 0, 0, 0, 0, 532675576));
                    }
                    aim.e eVarB3 = u.b();
                    String strN2 = a0.d.n("YEARLY_GROUP_HEADER_LIST_ID_PREFIX", iIntValue);
                    TextClause textClause3 = new TextClause(String.valueOf(iIntValue), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    dj0.d.Companion.getClass();
                    dj0.d dVarO3 = dj0.d.e;
                    int i59 = 0;
                    for (Object obj13 : list6) {
                        int i66 = i59 + 1;
                        if (i59 < 0) {
                            v.s();
                            throw null;
                        }
                        dVarO3 = i59 == 0 ? ((IssuedPoints) obj13).e : pyd.c.O(dVarO3, ((IssuedPoints) obj13).e);
                        i59 = i66;
                    }
                    eVarB3.add(new ListSubheaderDelegate.Model(strN2, (Image) null, (Clause) textClause3, (Image) null, (Clause) nub.a.q(nub.a.a(dVarO3), null, null, null, 7), (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65514));
                    boolean z4 = arrayList11.size() <= 3 ? z : false;
                    boolean z6 = (zBooleanValue || z4) ? z : false;
                    aim.e eVarB4 = u.b();
                    eVarB4.addAll(z6 ? arrayList11 : d0.V0(arrayList11, 3));
                    if (!z4) {
                        eVarB4.add(new LargeActionButtonDelegate.Model(a0.d.n("LARGE_ACTION_BUTTON_ITEM_ID_PREFIX", iIntValue), LargeActionButton.ButtonStyle.o, null, zBooleanValue ? new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_less, null, null, 14) : new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_more, null, null, 14), false, null, null, Integer.valueOf(iIntValue), null, 744));
                    }
                    aim.e eVarA = u.a(eVarB4);
                    yp0.b.k(eVarA, 0, 0, 0, 0, 31);
                    eVarB3.addAll(eVarA);
                    arrayList9.add(u.a(eVarB3));
                }
                eVarB2.addAll(zhm.w.u(arrayList9));
                if (fVar.d) {
                    InputDisclosureDelegate.Model model4 = new InputDisclosureDelegate.Model("ROW_ITEM_ID_PREFIX_EXPIRED_POINTS", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_points_expiry_expired, null, null, 14), null, null, null, 1020);
                    yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
                    eVarB2.add(model4);
                }
                return u.a(eVarB2);
            case 5:
                return a(content, obj2, obj3);
            case 6:
                x1g.f0 f0Var = (x1g.f0) obj4;
                PaymentMethod.Pocket payment = (PaymentMethod.Pocket) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(payment, "payment");
                dec.o oVar = x1g.p.b((x1g.i) obj5) ? dec.o.DEFAULT : dec.o.INSUFFICIENT_FUNDS;
                ListSubheaderDelegate.Model model5 = new ListSubheaderDelegate.Model("PAY_WITH_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextLocalisedClause(com.revolut.feature.travel.experiences.api.R$string.experiences_checkout_payment_section_title, null, null, 14), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530);
                RowDelegate.Model modelC = dec.q.c(f0Var.e, payment, true, oVar, false, 24);
                yp0.b.l(modelC, 0, 0, 0, 0, null, false, 63);
                return v.k(model5, modelC);
            case 7:
                x64.j jVar4 = (x64.j) obj4;
                ku3.a content2 = (ku3.a) content;
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(content2, "content");
                return new x64.o(hb4.o.a(content2.f189646a), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_subtitle, u.c(new TextClause(content2.f189647b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.congratulations_template_prompt_action, u.c(new TextClause(content2.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), ((hb4.o) obj5).f150611b.b(content2.f189648c, jVar4.f303039a), zBooleanValue2, (jVar4.f303041c || zBooleanValue2) ? false : true);
            case 8:
                return b(content, obj2, obj3);
            case 9:
                TicketProgression progression = (TicketProgression) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(progression, "progression");
                z1 z1Var = ((xd4.a) obj4).f304255a;
                TextLocalisedClause textLocalisedClauseA = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_header_title, z1Var.f154980a);
                TextLocalisedClause textLocalisedClauseA2 = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_header_subtitle, z1Var.f154981b);
                TextLocalisedClause textLocalisedClauseA3 = ky4.a.a(com.revolut.feature.credit.core.R$string.credit_manual_underwriting_ticketor_primary_button_title, z1Var.d);
                z9l.i iVar2 = ((xd4.l) obj5).f304269a;
                String str7 = progression.f66489a;
                int i74 = progression.f66491c;
                ArrayList<TicketProgression.Step> arrayList12 = progression.f66490b;
                ArrayList arrayList13 = new ArrayList(zhm.w.t(arrayList12, 10));
                for (TicketProgression.Step step : arrayList12) {
                    String str8 = step.f66492a;
                    String str9 = step.f66493b;
                    Long l2 = step.f66494c;
                    com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.c cVar2 = step.d;
                    if (cVar2 != null) {
                        int i92 = xd4.k.f304266a[cVar2.ordinal()];
                        if (i92 == 1) {
                            jVar2 = fr2.j.SOLID;
                        } else {
                            if (i92 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jVar2 = fr2.j.DASHED;
                        }
                        jVar = jVar2;
                    } else {
                        jVar = null;
                    }
                    com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.b bVar = step.e;
                    if (bVar != null) {
                        switch (xd4.k.f304268c[bVar.ordinal()]) {
                            case 1:
                                i = R$attr.uikit_colorAccent;
                                break;
                            case 2:
                                i = R$attr.uikit_colorForeground;
                                break;
                            case 3:
                                i = R$attr.uikit_colorGrey50;
                                break;
                            case 4:
                                i = R$attr.uikit_colorGrey20;
                                break;
                            case 5:
                                i = R$attr.uikit_colorGrey20;
                                break;
                            case 6:
                                i = R$attr.uikit_colorPink;
                                break;
                            case 7:
                                i = R$attr.uikit_colorOrange;
                                break;
                            case 8:
                                i = R$attr.uikit_colorWhite;
                                break;
                            case 9:
                                i = R$attr.uikit_colorRed;
                                break;
                            case 10:
                                i = R$attr.uikit_colorBlack;
                                break;
                            case 11:
                                i = R$attr.uikit_colorBlue;
                                break;
                            case 12:
                                i = R$attr.uikit_colorGreen;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        numValueOf = Integer.valueOf(i);
                    } else {
                        numValueOf = null;
                    }
                    String str10 = step.f;
                    TicketProgression.Step.Action action = step.f66495g;
                    FincrimeHomeScreenAction.Deeplink deeplink = (action == null || (str = action.f66497a) == null) ? null : new FincrimeHomeScreenAction.Deeplink(str);
                    com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.a aVar4 = step.f66496h;
                    if (aVar4 != null) {
                        int i96 = xd4.k.f304267b[aVar4.ordinal()];
                        if (i96 == 1) {
                            aVar2 = fr2.a.INLINE;
                        } else {
                            if (i96 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2 = fr2.a.BUTTON;
                        }
                        aVar = aVar2;
                    } else {
                        aVar = null;
                    }
                    arrayList13.add(new Step(str8, str9, l2, jVar, numValueOf, deeplink, str10, aVar));
                }
                ArrayList arrayListA = z9l.i.a(iVar2, new SectionContent.ProgressionSteps(str7, null, arrayList13, i74, fr2.k.ALWAYS_BLUE, null), false, Integer.valueOf(R$attr.uikit_dp12), Integer.valueOf(R$attr.uikit_dp16), null, false, 50);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return new xd4.d(textLocalisedClauseA, textLocalisedClauseA2, textLocalisedClauseA3, arrayListA, false, true);
            case 10:
                return c(content, obj2, obj3);
            case 11:
                xed.o oVar2 = (xed.o) obj5;
                FavouritesAssetTypeKey favouritesAssetTypeKey = (FavouritesAssetTypeKey) obj4;
                List content3 = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content3, "content");
                if (content3.isEmpty()) {
                    arrayList2 = f0.f322471a;
                } else {
                    List list8 = content3;
                    arrayList2 = new ArrayList(zhm.w.t(list8, 10));
                    for (Object obj14 : list8) {
                        int i99 = i3 + 1;
                        if (i3 < 0) {
                            v.s();
                            throw null;
                        }
                        AlertItem alertItem = (AlertItem) obj14;
                        Intrinsics.checkNotNullParameter(alertItem, "alertItem");
                        String strQ = j6.a.q("COMPLETED_ALERTS_ITEM__", alertItem.getF86876a());
                        RowDelegate.Model modelB = ((p2d.b) oVar2.f304635b).b(favouritesAssetTypeKey, alertItem);
                        String str11 = favouritesAssetTypeKey.f86866a;
                        String str12 = alertItem.getF86877b().f86863a;
                        String f86878c = alertItem.getF86878c();
                        StringBuilder sbM = v0.a.m("COMPLETED_ALERTS_SWIPE_ACTION_ID_", str11, "_", str12, "_");
                        sbM.append(f86878c);
                        arrayList2.add(new wh(strQ, modelB, u.c(new SwipeToActionDelegate.SwipeAction(sbM.toString(), new ResourceImage(R$drawable.uikit_icn_24_delete, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextLocalisedClause(com.revolut.feature.shared_separate_favourites.api.R$string.shared_watchlist_watchlist_screen_item_swipe_action_delete, null, null, 14), xh0.NEGATIVE, null, alertItem, null, 80)), null, Constants.TAG_FULL_SVPP_IDENTIFICATION));
                        i3 = i99;
                    }
                }
                ?? r3 = arrayList2;
                yp0.b.k(r3, 0, R$attr.uikit_dp16, 0, 0, 29);
                return r3;
            case 12:
                return d(content, obj2, obj3);
            case 13:
                return e(content, obj2, obj3);
            case 14:
                return g(content, obj2, obj3);
            case 15:
                v0 v0Var = (v0) obj5;
                xmd.g gVar3 = (xmd.g) obj4;
                xmd.o content4 = (xmd.o) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(content4, "content");
                xmd.n nVar = content4.f307186b;
                dj0.d dVar3 = content4.f307185a;
                if (nVar instanceof xmd.h) {
                    return v0Var.a(gVar3, dVar3, ((xmd.h) nVar).f307172a, null);
                }
                if (nVar instanceof xmd.l) {
                    return v0Var.a(gVar3, dVar3, ((xmd.l) nVar).f307182a, xmd.r.f307194a);
                }
                if (Intrinsics.f(nVar, xmd.j.f307177a)) {
                    xmd.d dVar4 = new xmd.d(otd.f.c(3, null, null, dVar3));
                    xmd.a aVar5 = xmd.a.AVERAGE_SPENDING;
                    uVar = new xmd.u(gVar3, dVar4, aVar5 != null ? v0.d(aVar5) : null, null, AnimatedBackgroundType.Base.ACCENT);
                } else if (nVar instanceof xmd.i) {
                    xmd.i iVar3 = (xmd.i) nVar;
                    dj0.d dVar5 = iVar3.f307176c;
                    xmd.c cVar3 = new xmd.c(otd.f.c(3, null, null, dVar5), otd.f.c(3, null, null, dVar3));
                    xmd.a aVar6 = iVar3.f307175b;
                    uVar = new xmd.u(gVar3, cVar3, aVar6 != null ? v0.d(aVar6) : null, new xmd.p(Intrinsics.f(dVar5, dVar3) ? v0.d : v0.e), AnimatedBackgroundType.Base.ACCENT);
                } else {
                    if (!(nVar instanceof xmd.k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    xmd.d dVar6 = new xmd.d(otd.f.c(3, null, null, dVar3));
                    xmd.k kVar2 = (xmd.k) nVar;
                    xmd.a aVar7 = kVar2.f307179b;
                    uVar = new xmd.u(gVar3, dVar6, aVar7 != null ? v0.d(aVar7) : null, new xmd.q(v0.d(kVar2.f307180c)), AnimatedBackgroundType.Base.ACCENT);
                }
                return uVar;
            case 16:
                return h(content, obj2, obj3);
            case 17:
                return i(content, obj2, obj3);
            case 18:
                return j(content, obj2, obj3);
            case 19:
                return k(content, obj2, obj3);
            case 20:
                return l(content, obj2, obj3);
            case 21:
                return m(content, obj2, obj3);
            case 22:
                return n(content, obj2, obj3);
            case 23:
                xya.t tVar = (xya.t) obj5;
                Clause clause = (Clause) obj4;
                List content5 = (List) content;
                ((Boolean) obj2).booleanValue();
                Intrinsics.checkNotNullParameter(content5, "content");
                tVar.getClass();
                return content5.isEmpty() ? f0.f322471a : tVar.b(clause, content5);
            case 24:
                return o(content, obj2, obj3);
            case 25:
                return p(content, obj2, obj3);
            case 26:
                return q(content, obj2, obj3);
            case 27:
                return r(content, obj2, obj3);
            case 28:
                return s(content, obj2, obj3);
            default:
                y66.s sVar = (y66.s) obj5;
                y66.a aVar8 = (y66.a) obj4;
                List balances = (List) content;
                ((Boolean) obj2).getClass();
                Intrinsics.checkNotNullParameter(balances, "balances");
                List list9 = balances;
                ArrayList arrayList14 = new ArrayList(zhm.w.t(list9, 10));
                Iterator it8 = list9.iterator();
                while (it8.hasNext()) {
                    arrayList14.add(((e16.g) it8.next()).f121894a.f71635a);
                }
                Set setI1 = d0.i1(arrayList14);
                ArrayList arrayListB = sVar.b(balances);
                ArrayList arrayList15 = new ArrayList(zhm.w.t(arrayListB, 10));
                Iterator it9 = arrayListB.iterator();
                while (it9.hasNext()) {
                    arrayList15.add(sVar.e((e16.g) it9.next()));
                }
                List list10 = (List) iii.c.g(aVar8.f311183b, new y66.p(sVar, 1), new y65.n(3), new y66.q(a1.l(setI1, sVar.f311206a.f71881b), sVar, i3));
                aim.e eVarB5 = u.b();
                eVarB5.addAll(arrayList15);
                eVarB5.addAll(list10);
                aim.e eVarA2 = u.a(eVarB5);
                yp0.b.k(eVarA2, 0, 0, 0, 0, 31);
                return eVarA2;
        }
    }

    public /* synthetic */ k(y43.b bVar, AccountId accountId, h93.f0 f0Var) {
        this.f300766a = 26;
        this.f300767b = accountId;
        this.f300768c = f0Var;
    }
}
