package kcg;

import android.os.Parcelable;
import aw0.j0;
import aw0.m6;
import aw0.n6;
import aw0.o9;
import aw0.t0;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.delegates.airtip.AirTipDelegate;
import com.revolut.core.ui_kit.delegates.dc;
import com.revolut.core.ui_kit.delegates.eg;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.lj;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.delegates.xg;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit.views.input.MaskedTextInputEditText;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.TopupRequestDetailsContract$ModalStep;
import com.revolut.feature.globalsearch.impl.ui.screen.GlobalSearchScreen;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$Icon;
import com.revolut.feature.rev_points.api.navigation.RevPointsEarnOptionsScreenApi$InputData;
import com.revolut.feature.rev_points.models.RevPointsTextWithLinks;
import com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.ConsentPromptPreconditionScreenContract$InputData;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import com.revolut.tracking.v3.AirTipContext;
import com.youTransactor.uCube.rpc.Constants;
import ip0.ak0;
import ip0.lg0;
import ip0.n40;
import ip0.o40;
import ip0.pb0;
import ip0.r40;
import ip0.xc;
import ip0.z;
import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import k8d.t;
import koe.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.Charsets;
import kqh.o;
import kug.q;
import l0c.p;
import l0c.r;
import l97.i0;
import mx0.pc;
import nel.p0;
import o97.g0;
import tw0.y;
import yp0.e0;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f182734b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f182733a = i;
        this.f182734b = obj2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v0 kkk.p, still in use, count: 2, list:
          (r11v0 kkk.p) from 0x016e: MOVE (r44v0 kkk.p) = (r11v0 kkk.p)
          (r11v0 kkk.p) from 0x0165: MOVE (r44v2 kkk.p) = (r11v0 kkk.p)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object a(java.lang.Object r74, java.lang.Object r75, java.lang.Object r76) {
        /*
            Method dump skipped, instruction units count: 1431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05b5  */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20, types: [com.revolut.feature.retail.savings.api.challenge.model.SavingsChallenge] */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v31, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57 */
    /* JADX WARN: Type inference failed for: r12v11, types: [com.revolut.core.ui_kit_core.displayers.image.models.CdnImage, ip0.yj0] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v8, types: [com.revolut.core.ui_kit.models.HtmlClause] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v13 */
    /* JADX WARN: Type inference failed for: r22v14, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r22v20 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v12, types: [kotlin.jvm.internal.s0] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r68, java.lang.Object r69, java.lang.Object r70) {
        /*
            Method dump skipped, instruction units count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0989 A[LOOP:6: B:178:0x0983->B:180:0x0989, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x027c  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 2586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object d(Object obj2, Object obj3, Object obj4) {
        Data data;
        kqh.f fVar = (kqh.f) this.f182734b;
        List instrumentGroups = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentGroups, "instrumentGroups");
        List<zel.f> list = instrumentGroups;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (zel.f group : list) {
            Map map = fVar.f188411c;
            Collection collectionValues = map.values();
            boolean z = true;
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                Iterator it8 = collectionValues.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (((Data) it8.next()).getLoading()) {
                        z = false;
                        break;
                    }
                }
            }
            Collection collectionValues2 = map.values();
            TextLocalisedQuantityClause textLocalisedQuantityClause = null;
            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                data = (Data) map.get(group);
            } else {
                Iterator it9 = collectionValues2.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    if (((Data) it9.next()).getContent() == null) {
                        if (z) {
                            break;
                        }
                        data = null;
                    }
                }
            }
            boolean z3 = fVar.d;
            Intrinsics.checkNotNullParameter(group, "group");
            String strName = group.name();
            dc dcVar = new dc(LayeredImage.INSTANCE.i(o.a(group), R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10));
            TextLocalisedClause textLocalisedClause = (group == zel.f.ETP && z3) ? new TextLocalisedClause(R$string.screener_picker_product_etps_etfs_title, null, null, 14) : new TextLocalisedClause(o.b(group, z3), null, null, 14);
            if (data != null) {
                textLocalisedQuantityClause = (TextLocalisedQuantityClause) iii.c.f(data, new kpj.a(7), new x(25), new t(11));
            }
            arrayList.add(new ProductSelectionDelegate.Model(strName, dcVar, textLocalisedClause, textLocalisedQuantityClause, null, new kqh.l(group), null, false, false, false, 976));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj2, Object obj3, Object obj4) {
        fug.a aVar;
        Pair pair;
        com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.c cVar = (com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.c) this.f182734b;
        TradingAccount tradingAccount = (TradingAccount) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        ConsentPromptPreconditionScreenContract$InputData consentPromptPreconditionScreenContract$InputData = cVar.f94944b;
        fug.c cVar2 = cVar.f94943a;
        if (consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseAccountInputData) {
            Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
            if (tradingAccount instanceof TradingAccount.GIA) {
                aVar = new fug.a(new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_cancel, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30));
            } else if (tradingAccount instanceof TradingAccount.Robo) {
                aVar = new fug.a(new TextLocalisedClause(cVar2.e() ? R$string.wealth_strategies_account_closure_confirmation_prompt_title : R$string.wealth_robo_account_closure_confirmation_prompt_title, null, null, 14), new TextLocalisedClause(cVar2.e() ? R$string.wealth_strategies_account_closure_confirmation_prompt_description : R$string.wealth_robo_account_closure_confirmation_prompt_description, null, null, 14), cVar2.e() ? new TextLocalisedClause(R$string.wealth_robo_account_closure_strategy_confirmation_prompt_action, null, null, 14) : new TextLocalisedClause(R$string.wealth_robo_account_closure_confirmation_prompt_action, null, null, 14), cVar2.e() ? new TextLocalisedClause(R$string.wealth_robo_account_closure_strategy_confirmation_prompt_cancel, null, null, 14) : new TextLocalisedClause(R$string.wealth_robo_account_closure_confirmation_prompt_cancel, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D064", null, null, null, 30));
            } else if (tradingAccount instanceof TradingAccount.Margin) {
                aVar = new fug.a(new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_confirmation_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_confirmation_prompt_description, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_confirmation_prompt_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.wealth_margin_account_closure_confirmation_prompt_cancel, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30));
            } else {
                if (!(tradingAccount instanceof TradingAccount.TaxAdvantage)) {
                    if (!(tradingAccount instanceof TradingAccount.MoneyMarketFunds) && !(tradingAccount instanceof TradingAccount.PaperTrading) && !(tradingAccount instanceof TradingAccount.Unknown)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException(tradingAccount.W() + " account closure confirmation prompt not expected.");
                }
                TradingAccount.TaxAdvantage taxAdvantage = (TradingAccount.TaxAdvantage) tradingAccount;
                if ((taxAdvantage instanceof TradingAccount.TaxAdvantage.Isa) || (taxAdvantage instanceof TradingAccount.TaxAdvantage.JIsa)) {
                    pair = new Pair(Integer.valueOf(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_isa_title), Integer.valueOf(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_isa_description));
                } else {
                    if (!(taxAdvantage instanceof TradingAccount.TaxAdvantage.Pea)) {
                        if (taxAdvantage instanceof TradingAccount.TaxAdvantage.Unknown) {
                            throw new IllegalStateException("Unknown TAA not supported");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    pair = new Pair(Integer.valueOf(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_pea_title), Integer.valueOf(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_pea_description));
                }
                aVar = new fug.a(new TextLocalisedClause(((Number) pair.f186385a).intValue(), null, null, 14), new TextLocalisedClause(((Number) pair.f186386b).intValue(), null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_action, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_account_closure_confirmation_prompt_cancel, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D051", null, null, null, 30));
            }
        } else {
            if (!(consentPromptPreconditionScreenContract$InputData instanceof ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            TradingProductCode product = ((ConsentPromptPreconditionScreenContract$InputData.CloseTradingProductInputData) consentPromptPreconditionScreenContract$InputData).f94930b;
            Intrinsics.checkNotNullParameter(product, "product");
            if (!Intrinsics.f(product, TradingProductCode.GiaMarginTrading.f105306a)) {
                throw new IllegalStateException(p.a.p("Trading product closure for ", product.getF105337a(), " not expected."));
            }
            aVar = new fug.a(new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_margin_offboarding_prompt_title, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_margin_offboarding_prompt_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_margin_offboarding_prompt_action_disable, null, null, 14), new TextLocalisedClause(com.revolut.feature.wealth.account_closure.impl.R$string.trading_margin_offboarding_prompt_action_back, null, null, 14), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D231", null, null, null, 30));
        }
        return u.c(new PromptMarketingContentDelegate.Model("ACCOUNT_CLOSURE_CONSENT_PROMPT_ID", aVar.f138204a, aVar.f138205b, new PromptMarketingContentDelegate.Model.Content.BackgroundMediaContent(aVar.e), null, null, new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), 0 == true ? 1 : 0, null, new PromptMarketingContentDelegate.Model.Button((Clause) aVar.f138206c, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), new PromptMarketingContentDelegate.Model.Button((Clause) aVar.d, (ResourceImage) null, (LargeActionButton.ButtonStyle) null, false, (String) null, 62), null, null, new q(tradingAccount), null, null, null, null, null, null, null, 2087344));
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        kvg.b bVar = (kvg.b) this.f182734b;
        List benchmarks = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(benchmarks, "benchmarks");
        boolean z = bVar.f190114b == null;
        RowDelegate.Model model = new RowDelegate.Model("HIDE_BENCHMARK_LIST_ID", new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_eye_hide, R$attr.uikit_colorAccentNeutral, R$attr.uikit_colorAccentNeutral_10), d8l.d.b(z), null, false, null, false, 60), new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_widgetised_benchmarks_hide_benchmark, null, null, 14), null, 0, null, null, null, 0, null, false, null, z, null, null, null, null, null, null, kvg.c.f190115a, null, 0, 0, 0, 0, 532668408);
        String str = bVar.f190114b;
        List<lwg.a> list = benchmarks;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (lwg.a aVar : list) {
            String str2 = aVar.f200457a;
            String str3 = aVar.f200457a;
            boolean zF = Intrinsics.f(str, str2);
            arrayList.add(new RowDelegate.Model(j6.a.q("BENCHMARK_LIST_ID_", str3), new RowDelegate.Model.MainImage.Image40(new InstrumentImage(str3, 30, null, null), d8l.d.b(zF), null, false, null, false, 60), new TextClause(aVar.f200458b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextClause(aVar.f200459c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, zF, null, null, null, null, null, null, aVar, null, 0, 0, 0, 0, 532668376));
        }
        return ue0.e.J(model, arrayList);
    }

    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v20, types: [com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17, types: [com.revolut.core.ui_kit.models.Clause, com.revolut.core.ui_kit.models.Custom, com.revolut.core.ui_kit.models.MoneyClause$Format, com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause] */
    /* JADX WARN: Type inference failed for: r15v24 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v0 kw4.n, still in use, count: 2, list:
          (r4v0 kw4.n) from 0x00e1: MOVE (r17v1 kw4.n) = (r4v0 kw4.n)
          (r4v0 kw4.n) from 0x00cb: MOVE (r17v3 kw4.n) = (r4v0 kw4.n)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object h(java.lang.Object r65, java.lang.Object r66, java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 1459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        Object objK;
        kxk.o oVar;
        List listC;
        kxk.o oVar2;
        Clause clauseB;
        n40 n40Var;
        int i;
        TextLocalisedClause textLocalisedClause;
        ImageClause imageClauseA;
        n40 n40Var2;
        int i2;
        TextLocalisedClause textLocalisedClause2;
        kxk.o oVar3 = (kxk.o) this.f182734b;
        gxk.h content = (gxk.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        lxk.c cVar = (lxk.c) oVar3.f190611b;
        gxk.a aVar = content.f147767b;
        gxk.a aVar2 = content.f147766a;
        if (aVar != null) {
            lxk.d dVar = (lxk.d) cVar;
            objK = v.k(dVar.a(aVar2.f147760a, kxk.j.MAIN_ASSET.c()), dVar.a(aVar.f147760a, kxk.j.RELATED_CFD.c()));
        } else {
            objK = f0.f322471a;
        }
        gxk.a[] elements = {aVar2, aVar};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        int i3 = 10;
        ArrayList arrayList = new ArrayList(w.t(listL, 10));
        int i5 = 0;
        for (Object obj5 : listL) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                v.s();
                throw null;
            }
            lxk.a aVar3 = (lxk.a) oVar3.f190612c;
            gxk.d tradingSchedule = ((gxk.a) obj5).f147761b;
            lxk.g gVar = ((lxk.b) aVar3).f200591a;
            Intrinsics.checkNotNullParameter(tradingSchedule, "tradingSchedule");
            if (tradingSchedule instanceof gxk.c) {
                ArrayList arrayList2 = ((gxk.c) tradingSchedule).f147763a.f222299b;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, i3));
                int i21 = 0;
                for (Object obj6 : arrayList2) {
                    int i22 = i21 + 1;
                    if (i21 < 0) {
                        v.s();
                        throw null;
                    }
                    o4l.a tradingSessionSchedule = (o4l.a) obj6;
                    if (i21 == 0) {
                        TextLocalisedClause textLocalisedClauseB = ((lxk.e) gVar).b(tradingSessionSchedule);
                        p0 p0Var = tradingSessionSchedule.f222295a;
                        Intrinsics.checkNotNullParameter(tradingSessionSchedule, "tradingSessionSchedule");
                        int[] iArr = lxk.f.f200592a;
                        int i32 = iArr[p0Var.ordinal()];
                        oVar2 = oVar3;
                        if (i32 == 1) {
                            imageClauseA = lxk.e.a(R$drawable.uikit_icn_24_sunrise, R$attr.uikit_colorOrange);
                        } else if (i32 == 2) {
                            imageClauseA = lxk.e.a(R$drawable.uikit_icn_24_sun, R$attr.uikit_colorYellow);
                        } else if (i32 == 3) {
                            imageClauseA = lxk.e.a(R$drawable.uikit_icn_24_sunrise_outline, R$attr.uikit_colorColdBlue);
                        } else {
                            if (i32 != 4 && i32 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            imageClauseA = lxk.e.a(R$drawable.uikit_icn_24_moon, R$attr.uikit_colorDeepGrey);
                        }
                        clauseB = new CompositeClause(v.k(textLocalisedClauseB, imageClauseA), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                        n40 n40Var3 = n40.CURRENT;
                        int i33 = R$attr.uikit_colorBlue;
                        Intrinsics.checkNotNullParameter(tradingSessionSchedule, "tradingSessionSchedule");
                        int i43 = iArr[p0Var.ordinal()];
                        if (i43 == 1) {
                            n40Var2 = n40Var3;
                            i2 = i33;
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_pre_market_description, null, null, 14);
                        } else if (i43 == 2) {
                            n40Var2 = n40Var3;
                            i2 = i33;
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_open_description, null, null, 14);
                        } else if (i43 == 3) {
                            n40Var2 = n40Var3;
                            i2 = i33;
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_after_hours_description, null, null, 14);
                        } else {
                            if (i43 != 4 && i43 != 5) {
                                throw new NoWhenBranchMatchedException();
                            }
                            n40Var2 = n40Var3;
                            i2 = i33;
                            textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_closed_description, null, null, 14);
                        }
                        textLocalisedClause = textLocalisedClause2;
                        n40Var = n40Var2;
                        i = i2;
                    } else {
                        oVar2 = oVar3;
                        clauseB = ((lxk.e) gVar).b(tradingSessionSchedule);
                        n40Var = n40.FUTURE;
                        i = R$attr.uikit_colorGreyTone10;
                        textLocalisedClause = null;
                    }
                    Clause clause = clauseB;
                    String strN = a0.d.n("SESSION_", i21);
                    ((lxk.e) gVar).getClass();
                    Intrinsics.checkNotNullParameter(tradingSessionSchedule, "tradingSessionSchedule");
                    Instant instant = tradingSessionSchedule.f222296b.toInstant();
                    Instant instant2 = tradingSessionSchedule.f222297c.toInstant();
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    LocalDate localDate = instant.atZone(zoneIdSystemDefault).toLocalDate();
                    LocalDate localDate2 = instant2.atZone(zoneIdSystemDefault).toLocalDate();
                    long epochMilli = instant.toEpochMilli();
                    TimeClause.Format.DayOfWeek dayOfWeek = TimeClause.Format.DayOfWeek.f57966b;
                    TimeClause timeClause = new TimeClause(epochMilli, dayOfWeek, null, null, 12);
                    long epochMilli2 = instant.toEpochMilli();
                    TimeClause.Format.TimeDefault timeDefault = TimeClause.Format.TimeDefault.f57977b;
                    CompositeClause compositeClauseM = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(timeClause, new TimeClause(epochMilli2, timeDefault, null, null, 12)));
                    TimeClause[] elements2 = {!Intrinsics.f(localDate, localDate2) ? new TimeClause(instant2.toEpochMilli(), dayOfWeek, null, null, 12) : null, new TimeClause(instant2.toEpochMilli(), timeDefault, null, null, 12)};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    CompositeClause compositeClause = new CompositeClause(v.k(compositeClauseM, yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), kotlin.collections.d.L(elements2))), new TextClause(" - ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), null, 8);
                    o40 o40Var = new o40(n40Var);
                    int i59 = R$attr.uikit_dp8;
                    arrayList3.add(new r40(strN, null, clause, compositeClause, textLocalisedClause, null, i, false, o40Var, i59, i59, 0, null, 14498));
                    i21 = i22;
                    oVar3 = oVar2;
                }
                oVar = oVar3;
                listC = arrayList3;
            } else {
                oVar = oVar3;
                if (!tradingSchedule.equals(gxk.b.f147762a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((lxk.e) gVar).getClass();
                CompositeClause compositeClause2 = new CompositeClause(v.k(new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_open_title, null, null, 14), lxk.e.a(R$drawable.uikit_icn_24_sun, R$attr.uikit_colorYellow)), new TextClause("  ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
                TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealth_commodities_market_hours_twenty_four_seven, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
                TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_open_description, null, null, 14);
                o40 o40Var2 = new o40(n40.CURRENT);
                int i66 = R$attr.uikit_colorBlue;
                int i74 = R$attr.uikit_dp8;
                listC = u.c(new r40("SESSION_ALWAYS_OPEN", null, compositeClause2, textLocalisedClause3, textLocalisedClause4, null, i66, false, o40Var2, i74, i74, 0, null, 14498));
            }
            List list = listC;
            yp0.b.k(list, 0, 0, 0, 0, 31);
            TextDelegate.Model model = new TextDelegate.Model("LEARN_MORE", new TextLocalisedClause(com.revolut.retail.feature.trading_hours.impl.R$string.wealthcore_trading_market_hours_footer, u.c(new TextLocalisedClause(R$string.retail_wealth_core_common_learn_more, null, new Click(28, (Integer) null, (Object) kxk.h.f190602a, "LEARN-MORE-CLICK", false), 10)), null, 12), false, new ak0(null, null, 3), null, null, 0, 0, 0, 0, 2036);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            arrayList.add(new xc(a0.d.n("TRADING_SCHEDULE_PAGE_", i5), d0.F0(model, list), 0, null, null, 0, 0, 0, 1020));
            i5 = i6;
            i3 = 10;
            oVar3 = oVar;
        }
        return new Pair(objK, arrayList);
    }

    private final Object j(Object obj2, Object obj3, Object obj4) {
        int iB;
        aw0.i eVar;
        RowDelegate.Model.MainImage.Image24 image24;
        Iterator it8;
        List list;
        Image resourceImage;
        Image imageB;
        kzb.k kVar = (kzb.k) this.f182734b;
        m1c.h content = (m1c.h) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        aim.e eVarB = u.b();
        m1c.f fVar = content.f201370b;
        if (fVar != null) {
            CellDetailsDelegate.Model model = new CellDetailsDelegate.Model("CURRENT_PROGRESS_ITEM_ID", new t0((Clause) new TextClause(fVar.f201359a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, 0, false, 30), i1c.d.a(fVar.f201360b), null, null, null, null, 0, null, false, false, null, null, 32760);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
        }
        ArrayList arrayList = content.d;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        int i = 0;
        while (it9.hasNext()) {
            Object next = it9.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            m1c.b bVar = (m1c.b) next;
            String strValueOf = String.valueOf(i);
            m1c.e eVar2 = bVar.f201335a;
            if (eVar2 != null) {
                m1c.d dVar = eVar2.f201354a;
                String str = eVar2.f201355b;
                Integer num = eVar2.f201356c;
                int i3 = kzb.j.f191093a[dVar.ordinal()];
                if (i3 == 1 && str != null) {
                    imageB = new ResourceImage(kVar.b(str), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                } else if (i3 != 2 || num == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No matches for type:" + dVar + ", iconCode:" + str + ", value:" + num);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                    resourceImage = new ResourceImage(R$drawable.uikit_icn_24_revolut, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
                    boolean z = false;
                    image24 = new RowDelegate.Model.MainImage.Image24(resourceImage, z, z, 6);
                } else {
                    imageB = com.revolut.core.ui_kit_core.displayers.image.models.a.b(num.intValue(), Integer.valueOf(R$attr.uikit_colorBackground), Integer.valueOf(R$attr.uikit_colorForeground), null, 8);
                }
                resourceImage = imageB;
                boolean z3 = false;
                image24 = new RowDelegate.Model.MainImage.Image24(resourceImage, z3, z3, 6);
            } else {
                image24 = null;
            }
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_options_bottom_sheet_item_title, u.c(new TextClause(bVar.f201336b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            String str2 = bVar.f201337c;
            TextClause textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
            tf tfVar = new tf(nz8.d.L(new ResourceImage(R$drawable.uikit_icn_16_chevron_right, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254)));
            List list2 = bVar.d;
            if (list2 != null) {
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList(w.t(list3, 10));
                int i5 = 0;
                for (Object obj5 : list3) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        v.s();
                        throw null;
                    }
                    m1c.g gVar = (m1c.g) obj5;
                    String strValueOf2 = String.valueOf(i5);
                    String str3 = gVar.f201364a;
                    arrayList3.add(new pc(strValueOf2, new TagViewData(str3 != null ? new ResourceImage(kVar.b(str3), (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, new TextClause(gVar.f201365b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorAccentNeutral), 0.2f), R$attr.uikit_colorTransparent, null, 1000), null));
                    it9 = it9;
                    i5 = i6;
                }
                it8 = it9;
                list = arrayList3;
            } else {
                it8 = it9;
                list = f0.f322471a;
            }
            arrayList2.add(new RowDelegate.Model(strValueOf, image24, textLocalisedClause, null, 0, textClause, null, null, 0, tfVar, false, null, false, null, list, null, null, null, null, new kzb.e(bVar.e.f201331a), null, 0, 0, 0, 0, 532642776));
            it9 = it8;
            i = i2;
        }
        eVarB.addAll(yp0.b.g(arrayList2, new ListSubheaderDelegate.Model("SECTION_SUBHEADER_ITEM_ID", (Image) null, (Clause) new TextClause(content.f201371c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, 0, 124));
        aim.e eVarA = u.a(eVarB);
        RevPointsTextWithLinks revPointsTextWithLinks = content.f201369a;
        RevPointsEarnOptionsScreenApi$InputData revPointsEarnOptionsScreenApi$InputData = kVar.f191094a;
        Clause clause = revPointsEarnOptionsScreenApi$InputData.f83489c;
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        RevPointsEarnOptionsScreenApi$Icon revPointsEarnOptionsScreenApi$Icon = revPointsEarnOptionsScreenApi$InputData.f83488b;
        if (revPointsEarnOptionsScreenApi$Icon instanceof RevPointsEarnOptionsScreenApi$Icon.Resource) {
            iB = ((RevPointsEarnOptionsScreenApi$Icon.Resource) revPointsEarnOptionsScreenApi$Icon).f83486a;
        } else {
            if (!(revPointsEarnOptionsScreenApi$Icon instanceof RevPointsEarnOptionsScreenApi$Icon.Code)) {
                throw new NoWhenBranchMatchedException();
            }
            iB = kVar.b(((RevPointsEarnOptionsScreenApi$Icon.Code) revPointsEarnOptionsScreenApi$Icon).f83485a);
        }
        int i21 = iB;
        int i22 = R$attr.uikit_colorForeground;
        lw0.a aVar = new lw0.a(clause, revPointsTextWithLinks != null ? new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_options_bottom_sheet_subtitle, u.c(kVar.f191096c.a(revPointsTextWithLinks)), null, 12) : null, new lw0.b(LayeredImage.Companion.a(companion, i21, new Color.Solid(i22), new Color.ModifiedColor(new Color.Solid(i22), 0.1f), 10.0f, null, 48), null), null, false, 24);
        m1c.c cVar = content.e;
        m1c.c cVar2 = content.f;
        if (cVar == null || cVar2 == null) {
            eVar = cVar != null ? new aw0.e(false, null, null, kzb.k.a(cVar.f201344a, cVar.f201345b), null, null, 55) : null;
        } else {
            n6 n6VarA = kzb.k.a(cVar.f201344a, cVar.f201345b);
            m6 m6Var = n6.Companion;
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_earn_options_bottom_sheet_cta_secondary, u.c(new TextClause(cVar2.f201344a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
            LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain plain = LargeActionButton.ButtonStyle.f;
            String str4 = cVar2.f201345b;
            eVar = new aw0.h(false, n6VarA, m6.c(m6Var, textLocalisedClause2, plain, null, null, false, null, null, str4 != null ? new kzb.e(str4) : null, 508), null, null, null, 121);
        }
        return new cii.b(eVar, eVarA, aVar);
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        l0c.j jVar = (l0c.j) this.f182734b;
        l0c.q content = (l0c.q) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List listC = jVar.f191213b.getContent() != null ? u.c(new TextNavBarMenuItem("DOWNLOAD_BUTTON_LIST_ID", new TextLocalisedClause(com.revolut.feature.rev_points.api.R$string.rev_points_terms_review_menu_download, null, null, 14), null, null, 12)) : f0.f322471a;
        if (!(content instanceof l0c.o)) {
            if (content instanceof p) {
                return new r((List) f0.f322471a, l0c.x.a(jVar), ((p) content).f191218a, listC, true);
            }
            throw new NoWhenBranchMatchedException();
        }
        File file = ((l0c.o) content).f191217a;
        Intrinsics.checkNotNullParameter(file, "file");
        kj kjVar = new kj("HTML_ITEM_ID", new lj(lim.m.f(file, Charsets.UTF_8), "utf-8"), null, Constants.TAG_FC_SPEED_MODE);
        int i = R$attr.uikit_dp16;
        yp0.b.l(kjVar, 0, 0, i, i, null, false, 51);
        return new r(u.c(kjVar), l0c.x.a(jVar), listC, jVar.f191214c, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.l(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        int i;
        l1k.o oVar = (l1k.o) this.f182734b;
        List relatedAssets = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(relatedAssets, "relatedAssets");
        if (relatedAssets.isEmpty()) {
            return f0.f322471a;
        }
        List list = relatedAssets;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(j1h.b.b(oVar.f191573a, (vel.f) it8.next(), null, null, null, 14));
        }
        eg egVar = new eg("NEWS_ARTICLE_RELATED_ASSETS_DELEGATE_ID", arrayList, null, 16.0f, 0, 0, 1012);
        int i2 = com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_reader_screen_assets_section_header_title;
        if ((list instanceof Collection) && list.isEmpty()) {
            i = com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_asset_type_stocks_name;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (!(((vel.f) it9.next()) instanceof vel.e)) {
                    i = com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_news_reader_screen_assets_section_header_assets;
                    break;
                }
            }
            i = com.revolut.retail.feature.marketnews.impl.R$string.wealthHome_asset_type_stocks_name;
        }
        return yp0.b.i(egVar, new ListSubheaderDelegate.Model("NEWS_ARTICLE_RELATED_ASSETS_HEADER_DELEGATE_ID", (Image) null, (Clause) new TextLocalisedClause(i2, u.c(new TextLocalisedClause(i, null, null, 14)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), e0.INSIDE_BOX, 0, R$attr.uikit_dp16, 116);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object n(Object obj2, Object obj3, Object obj4) {
        com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.a aVar = (com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.a) this.f182734b;
        l42.b data = (l42.b) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        p02.a request = data.f192034a;
        TopupRequestDetailsContract$ModalStep.Decline decline = TopupRequestDetailsContract$ModalStep.Decline.f62411a;
        Object[] objArr = 0 == true ? 1 : 0;
        z zVar = new z("ID_ACTIONS", v.k(new ActionsView.Item("APPROVE", mx0.d.ACCENT, false, null, null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_topup_request_receiving_cta_accept, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_check, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, false, null, null, TopupRequestDetailsContract$ModalStep.Approve.f62410a, null, 24476), new ActionsView.Item("DECLINE", mx0.d.SEMIACCENT, false, objArr, null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_topup_request_receiving_cta_decline, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_cross, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, 0 == true ? 1 : 0, null, false, 0 == true ? 1 : 0, null, decline, null, 24476)), j0.TRANSPARENT, null, R$attr.uikit_dp0, R$attr.uikit_dp8, 72);
        Intrinsics.checkNotNullParameter(request, "request");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_topup_request_receiving_status_title, null, null, 14);
        int i = com.revolut.feature.apm.core.api.R$string.apm_topup_request_receiving_status_pending;
        wz1.a aVar2 = (wz1.a) aVar.f62412a;
        CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model("ID_STATUS", textLocalisedClause, null, new TextLocalisedClause(i, u.c(aVar2.b(request)), null, 12), null, false, null, null, null, null, null, 0, 131060);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ID_HELP", new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_action_get_help, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        List listK = v.k(zVar, model, model2);
        p02.a request2 = data.f192034a;
        MoneyClause moneyClauseA = aVar2.a(request2);
        ContactImage contactImageC = aVar2.c(request2);
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i2 = R$drawable.uikit_icn_16_hourglass;
        int i3 = R$attr.uikit_colorGroupedBackground;
        LayeredImage layeredImageD = companion.d(i2, R$attr.uikit_colorOrange, i3, Integer.valueOf(i3), 2.0f, 2.0f, Float.valueOf(16.0f));
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_topup_request_receiving_from, u.c(aVar2.d(request2)), null, 12);
        int i5 = com.revolut.feature.apm.core.api.R$string.apm_via_placeholder_prefix;
        Intrinsics.checkNotNullParameter(request2, "request");
        return new l42.d(listK, new l42.c(moneyClauseA, textLocalisedClause2, new TextLocalisedClause(i5, v.k(new TimeClause(oi0.d.c0(request2.f), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12), aVar2.b(request2)), null, 12), contactImageC, layeredImageD));
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        AnimationRequest animationRequest;
        l5d.k kVar = (l5d.k) this.f182734b;
        od0.i content = (od0.i) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        l5d.l lVar = (l5d.l) content.f224257a;
        if (lVar == null) {
            return f0.f322471a;
        }
        e5d.c cVar = lVar.f192252a;
        d5d.a aVar = cVar.f122807a;
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AirTipContext.a aVarNewBuilder = AirTipContext.newBuilder();
        String str = aVar.f111406a;
        aVarNewBuilder.c();
        ((AirTipContext) aVarNewBuilder.f49761b).setId(str);
        String str2 = aVar.f111407b;
        aVarNewBuilder.c();
        ((AirTipContext) aVarNewBuilder.f49761b).setType(str2);
        String str3 = aVar.f111408c;
        aVarNewBuilder.c();
        ((AirTipContext) aVarNewBuilder.f49761b).setTitle(str3);
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        w0 w0VarA2 = AnalyticsContext.Companion.a(w0VarA);
        String str4 = aVar.f111406a;
        TextClause textClause = new TextClause(aVar.f111408c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(aVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        l5d.a aVar2 = kVar.f192251a;
        String airTipId = aVar.f111406a;
        boolean z = lVar.f192253b;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(airTipId, "airTipId");
        if (z) {
            LinkedHashMap linkedHashMap = aVar2.f192230a;
            Object animationRequest2 = linkedHashMap.get(airTipId);
            if (animationRequest2 == null) {
                animationRequest2 = new AnimationRequest(false);
                linkedHashMap.put(airTipId, animationRequest2);
            }
            animationRequest = (AnimationRequest) animationRequest2;
        } else {
            animationRequest = null;
        }
        AnimationRequest animationRequest3 = animationRequest;
        l5d.b bVar = new l5d.b(new e5d.b(aVar, cVar.f122808b));
        bVar.f192232b = new AnalyticsContext(w0VarA2);
        Unit unit = Unit.f186387a;
        AirTipDelegate.Model model = new AirTipDelegate.Model(str4, textClause, textClause2, animationRequest3, bVar, new AnalyticsContext(w0VarA2), 24);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return u.c(model);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object p(java.lang.Object r28, java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.p(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object q(Object obj2, Object obj3, Object obj4) {
        xi0.b bVar;
        GlobalSearchScreen globalSearchScreen = (GlobalSearchScreen) this.f182734b;
        SmartTileExchangeDelegate.Model model = (SmartTileExchangeDelegate.Model) obj2;
        lg0 position = (lg0) obj3;
        AmountEditView field = (AmountEditView) obj4;
        KProperty[] kPropertyArr = GlobalSearchScreen.B0;
        Intrinsics.checkNotNullParameter(model, "data");
        Intrinsics.checkNotNullParameter(position, "fieldPosition");
        Intrinsics.checkNotNullParameter(field, "field");
        MaskedTextInputEditText editText = field.getEditText();
        int i = l97.d.f193052a[position.ordinal()];
        if (i == 1) {
            bVar = model.f53423b.f164416a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = model.f53424c.f164416a;
        }
        xi0.b bVar2 = bVar;
        qd0.b bVar3 = globalSearchScreen.z0;
        if (bVar3 == null) {
            Intrinsics.r("languageProvider");
            throw null;
        }
        u80.d dVar = new u80.d(((s80.b) bVar3).b());
        SmartTileExchangeDelegate.Companion companion = SmartTileExchangeDelegate.INSTANCE;
        ihm.f consumer = globalSearchScreen.Q;
        companion.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        return new zp0.d(editText, bVar2, dVar, null, new xg(consumer, position, model), false, false, 0, false, null, 1928);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    private final Object r(Object obj2, Object obj3, Object obj4) {
        boolean z;
        List listC;
        i0 i0Var = (i0) this.f182734b;
        List<o97.d0> searchResult = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(searchResult, "searchSectionItems");
        l97.a aVar = i0Var.f193067h;
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        ?? arrayList = new ArrayList();
        for (o97.d0 d0Var : searchResult) {
            if (d0Var instanceof o97.f0) {
                o97.f0 f0Var = (o97.f0) d0Var;
                listC = u.c(l97.a.b(f0Var.f223101a, null, f0Var.f223102b, null));
            } else if (d0Var instanceof g0) {
                g0 g0Var = (g0) d0Var;
                listC = u.c(l97.a.b(g0Var.f223104a, g0Var.f223105b, g0Var.f223106c, g0Var.d));
            } else if (d0Var instanceof o97.e0) {
                listC = ((o97.e0) d0Var).f223097a;
            } else if (d0Var instanceof o97.h0) {
                RowDelegate.Model model = new RowDelegate.Model("no_result", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_heart_broken, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(com.revolut.feature.globalsearch.api.R$string.search_block_error_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870904);
                yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
                listC = u.c(model);
            } else {
                if (!(d0Var instanceof o97.i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                List listC2 = u.c(new pb0("shimmer_row"));
                yp0.b.k(listC2, 0, 0, 0, 0, 31);
                listC = listC2;
            }
            a0.x(listC, arrayList);
        }
        if (arrayList.isEmpty()) {
            arrayList = f0.f322471a;
        } else {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (!(((koi.j) it8.next()) instanceof ListSubheaderDelegate.Model)) {
                    break;
                }
            }
            arrayList = f0.f322471a;
        }
        ?? r3 = arrayList;
        if (((Collection) r3).isEmpty()) {
            z = false;
            break;
        }
        Iterable<koi.j> iterable = (Iterable) r3;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (koi.j jVar : iterable) {
                if (!(jVar instanceof ListSubheaderDelegate.Model) && (!(jVar instanceof y) || !((y) jVar).getF55088h())) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        return new Data(r3, null, z, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0ae0  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r72, java.lang.Object r73, java.lang.Object r74) {
        /*
            Method dump skipped, instruction units count: 3530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kcg.j.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f182733a = i;
        this.f182734b = obj3;
    }

    public /* synthetic */ j(kqh.f fVar, kqh.r rVar) {
        this.f182733a = 11;
        this.f182734b = fVar;
    }
}
