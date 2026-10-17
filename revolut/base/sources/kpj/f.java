package kpj;

import akd.s;
import com.google.android.gms.wallet.PaymentData;
import com.onfido.api.client.data.DocSide;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.impl.ui.collateral_move_money.CollateralMoveMoneyScreen;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistData;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistFetchConfig;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import defpackage.m0;
import defpackage.q0;
import efm.d0;
import efm.r;
import ht1.l;
import igm.p;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kfm.o;
import kl.b0;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.flow.Flow;
import ku1.f0;
import le.u1;
import li8.n;
import m7i.k;
import n2l.g;
import n2l.h;
import n2l.j;
import nd.i;
import nd.q;
import o3l.m;
import x8h.v0;
import zhm.h0;
import zhm.t0;
import zhm.u;
import zhm.v;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements ITaskMonitor, o, zp0.c, i, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f188257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f188258b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f188257a = i;
        this.f188258b = obj2;
    }

    public static TextLocalisedClause f(f fVar, j uiType) {
        Integer numValueOf;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(uiType, "uiType");
        if (uiType instanceof n2l.a) {
            numValueOf = Integer.valueOf(R$string.wealth_trading_orders_account_selector_cfd_subtitle);
        } else if (uiType instanceof n2l.d) {
            numValueOf = Integer.valueOf(R$string.wealth_trading_orders_account_selector_isa_buy_subtitle);
        } else if (uiType instanceof n2l.f) {
            numValueOf = Integer.valueOf(R$string.wealth_trading_orders_account_selector_pea_buy_subtitle);
        } else if ((uiType instanceof n2l.c) || (uiType instanceof g)) {
            numValueOf = Integer.valueOf(R$string.wealth_invest_home_not_onboarded_jisa_description);
        } else if (uiType instanceof n2l.i) {
            numValueOf = Integer.valueOf(R$string.wealth_trading_orders_account_selector_gia_buy_subtitle);
        } else {
            if (!(uiType instanceof n2l.e) && !(uiType instanceof h) && !(uiType instanceof n2l.b)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        if (numValueOf != null) {
            return new TextLocalisedClause(numValueOf.intValue(), null, null, 10);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(npg.g r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof okb.o
            if (r0 == 0) goto L13
            r0 = r8
            okb.o r0 = (okb.o) r0
            int r1 = r0.f225964x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f225964x = r1
            goto L18
        L13:
            okb.o r0 = new okb.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f225964x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            npg.e r7 = r0.u
            yhm.o.b(r8)
            goto L78
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            java.util.List r7 = r7.f218213b
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L3c:
            boolean r8 = r7.hasNext()
            r2 = 0
            if (r8 == 0) goto L51
            java.lang.Object r8 = r7.next()
            r4 = r8
            npg.e r4 = (npg.e) r4
            npg.c r4 = r4.f218209a
            npg.c r5 = npg.c.IDENTITY_DOCUMENT
            if (r4 != r5) goto L3c
            goto L52
        L51:
            r8 = r2
        L52:
            r7 = r8
            npg.e r7 = (npg.e) r7
            if (r7 == 0) goto La0
            java.lang.Object r8 = r6.f188258b
            ypg.e r8 = (ypg.e) r8
            r0.u = r7
            r0.f225964x = r3
            dqg.a r8 = r8.f315869a
            dqg.e r8 = (dqg.e) r8
            r8.getClass()
            cq6.k r4 = new cq6.k
            r5 = 28
            r4.<init>(r8, r2, r5)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r4, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L83
            okb.e r7 = okb.e.VERIFYING
            goto L9a
        L83:
            npg.d r7 = r7.f218210b
            int[] r8 = okb.n.f225962a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r3) goto L98
            r8 = 2
            if (r7 == r8) goto L95
            okb.e r7 = okb.e.VALID
            goto L9a
        L95:
            okb.e r7 = okb.e.EXPIRED
            goto L9a
        L98:
            okb.e r7 = okb.e.INVALID
        L9a:
            okb.b r8 = new okb.b
            r8.<init>(r7)
            return r8
        La0:
            okb.c r7 = okb.c.f225953a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kpj.f.a(npg.g, gim.c):java.lang.Object");
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f188257a) {
            case 12:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 4) {
                    return ((kfm.i) this.f188258b).apply(objArr[0], objArr[1], objArr[2], objArr[3]);
                }
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr.length);
            case 13:
                List list = (List) obj2;
                Collections.sort(list, (Comparator) this.f188258b);
                return list;
            default:
                return ((m) this.f188258b).invoke(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a07.p b(java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kpj.f.b(java.util.List):a07.p");
    }

    public SlotContext c(SlotChecklistPayload payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload instanceof SlotChecklistData) {
            return ((SlotChecklistData) payload).f87295b;
        }
        if (!(payload instanceof SlotChecklistFetchConfig)) {
            throw new NoWhenBranchMatchedException();
        }
        SlotChecklistFetchConfig slotChecklistFetchConfig = (SlotChecklistFetchConfig) payload;
        s sVarA = ((yqb.b) this.f188258b).a(slotChecklistFetchConfig.f87297a);
        String str = slotChecklistFetchConfig.f87298b;
        Set setB = str != null ? y0.b(str) : null;
        if (setB == null) {
            setB = h0.f322473a;
        }
        return new SlotContext(sVarA, setB);
    }

    public j23.b d() {
        Flow gVar;
        hwg.c cVar = (hwg.c) ((hwg.a) this.f188258b);
        kwg.m mVar = cVar.f156177b;
        Flow flowA = kwg.m.a().contains(iwg.a.SECURITY) ? cVar.a(o0.f186429a.b(TradingAccount.GIA.class)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar2 = cVar.f156177b;
        Flow flowA2 = kwg.m.a().contains(iwg.a.ISA) ? cVar.a(o0.f186429a.b(TradingAccount.TaxAdvantage.Isa.class)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar3 = cVar.f156177b;
        Flow flowA3 = kwg.m.a().contains(iwg.a.JISA) ? cVar.a(o0.f186429a.b(TradingAccount.TaxAdvantage.JIsa.class)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar4 = cVar.f156177b;
        Flow flowA4 = kwg.m.a().contains(iwg.a.PEA) ? cVar.a(o0.f186429a.b(TradingAccount.TaxAdvantage.Pea.class)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar5 = cVar.f156177b;
        Flow flowF = kwg.m.a().contains(iwg.a.COMMODITY) ? mo3.a.f(((v0) cVar.e).f(), new f0(22), new gzb.d(20), new l(24)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar6 = cVar.f156177b;
        int i = 4;
        int i2 = 3;
        if (kwg.m.a().contains(iwg.a.CRYPTO)) {
            r map = ((cpj.b) cVar.f156176a).j(yoj.c.CRYPTO, w4l.h.f294642c).map(new hw3.d(i, new hwf.b(i2)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            gVar = rd0.e.b(ue0.e.H(map, h0.f322473a, new hwf.b(i)));
        } else {
            gVar = new go.g(Boolean.FALSE, 2);
        }
        kwg.m mVar7 = cVar.f156177b;
        Flow flowE = kwg.m.a().contains(iwg.a.ROBO) ? rd0.e.e(mo3.a.g(boh.f.e(rd0.e.b(((cpj.b) cVar.f156176a).k(yoj.c.ROBO, yoj.d.DISABLED)), new hw9.a(cVar, 1)), null, null, 3), h0.f322473a, new g23.j(i2, 26, null)) : new go.g(Boolean.FALSE, 2);
        Flow flowA5 = (((jte.d) cVar.d).c(WealthAnalyticsApi$Toggles.CfdsAnalytics.f94966c) && kwg.m.a().contains(iwg.a.CFD)) ? cVar.a(o0.f186429a.b(TradingAccount.Margin.class)) : new go.g(Boolean.FALSE, 2);
        kwg.m mVar8 = cVar.f156177b;
        return new j23.b(new Flow[]{flowA, flowA2, flowA3, flowA4, flowF, gVar, flowE, flowA5, new go.g(Boolean.TRUE, 2)}, i2);
    }

    @Override // nd.i
    public Object e(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it8 = arrayList.iterator();
        Exception exc2 = null;
        while (it8.hasNext()) {
            try {
                return ((q) this.f188258b).a(str, (Provider) it8.next());
            } catch (Exception e) {
                if (exc2 == null) {
                    exc2 = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc2);
    }

    public int g(j uiType) {
        Intrinsics.checkNotNullParameter(uiType, "uiType");
        if (uiType instanceof n2l.a) {
            return R$drawable.uikit_icn_24_cfd;
        }
        if (uiType instanceof n2l.b) {
            return R$drawable.uikit_icn_24_commodities;
        }
        if ((uiType instanceof n2l.f) || (uiType instanceof n2l.d) || (uiType instanceof g)) {
            return R$drawable.uikit_icn_24_bar_chart_percent;
        }
        if (uiType instanceof n2l.c) {
            return R$drawable.uikit_icn_24_children;
        }
        if (uiType instanceof h) {
            return ((jte.d) ((adh.i) this.f188258b).f3354a).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$drawable.uikit_icn_16_revolut : R$drawable.uikit_icn_24_robo_advisor;
        }
        if (uiType instanceof n2l.i) {
            return R$drawable.uikit_icn_24_wealth;
        }
        if (uiType instanceof n2l.e) {
            return R$drawable.uikit_icn_24_joint;
        }
        throw new NoWhenBranchMatchedException();
    }

    public TextLocalisedClause h(j uiType, hel.b bVar, Style style) {
        int i;
        List listC;
        int i2;
        Intrinsics.checkNotNullParameter(uiType, "uiType");
        boolean z = uiType instanceof n2l.a;
        if (z) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_trading_account_cfd_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof n2l.b) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_trading_account_commodities_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof n2l.d) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_trading_account_isa_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof n2l.f) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_trading_account_pea_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof g) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_home_not_onboarded_jisa_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof n2l.c) {
            String str = ((n2l.c) uiType).f211585a;
            if (str == null || str.length() == 0) {
                switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i = R$string.wealth_invest_home_not_onboarded_jisa_title;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                    case -1:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        i = R$string.wealth_invest_home_portfolio_jisa_header_title;
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (uiType instanceof h) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    i = !((jte.d) ((adh.i) this.f188258b).f3354a).c(WealthUiApi$Toggles.RoboStrategies.f95863c) ? R$string.wealth_invest_trading_account_robo_title : R$string.wealth_invest_trading_account_strategies_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else if (uiType instanceof n2l.i) {
            switch (bVar == null ? -1 : n2l.m.f211594a[bVar.ordinal()]) {
                case -1:
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                    i = R$string.wealth_invest_trading_account_gia_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 2:
                    i = R$string.wealth_invest_trading_account_gia_title_uk;
                    break;
                case 4:
                    i = R$string.wealth_invest_trading_account_brokerage_title;
                    break;
            }
        } else {
            if (!(uiType instanceof n2l.e)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_invest_home_portfolio_joint_invest_header_title;
        }
        if (uiType instanceof n2l.c) {
            listC = v.l(((n2l.c) uiType).f211585a);
        } else if (uiType instanceof n2l.e) {
            switch (bVar != null ? n2l.m.f211594a[bVar.ordinal()] : -1) {
                case -1:
                case 1:
                case 3:
                case 5:
                case 6:
                case 7:
                    i2 = R$string.wealth_invest_trading_account_gia_title;
                    break;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 2:
                    i2 = R$string.wealth_invest_trading_account_gia_title_uk;
                    break;
                case 4:
                    i2 = R$string.wealth_invest_trading_account_brokerage_title;
                    break;
            }
            listC = u.c(new TextLocalisedClause(i2, null, null, 14));
        } else {
            if (!(uiType instanceof g) && !z && !(uiType instanceof n2l.b) && !(uiType instanceof n2l.d) && !(uiType instanceof n2l.f) && !(uiType instanceof h) && !(uiType instanceof n2l.i)) {
                throw new NoWhenBranchMatchedException();
            }
            listC = zhm.f0.f322471a;
        }
        return new TextLocalisedClause(i, listC, style, 8);
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        q0 q0Var = (q0) this.f188258b;
        int i = m0.f201029a[taskEvent.ordinal()];
        if (i == 1) {
            q0Var.d = (ITask) objArr[0];
            q0Var.notifyMonitor(TaskEvent.FAILED, this);
        } else {
            if (i != 2) {
                return;
            }
            q0Var.notifyMonitor(TaskEvent.SUCCESS, (List) objArr[0]);
        }
    }

    public r i() {
        oyc.c cVar = (oyc.c) this.f188258b;
        return nim.a.w(cVar.f230942h.f(Unit.f186387a, true), new oyc.a(cVar, 6));
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.Map] */
    public Flow j(String symbol, c1b.h interval) {
        Intrinsics.checkNotNullParameter(symbol, "ref");
        Intrinsics.checkNotNullParameter(interval, "chartInterval");
        switch (nrb.d.f218603a[interval.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return vkm.i.f290039a;
            case 12:
            case 13:
            case 14:
            case 15:
                trb.c cVar = (trb.c) this.f188258b;
                Intrinsics.checkNotNullParameter(symbol, "symbol");
                Intrinsics.checkNotNullParameter(interval, "interval");
                return nim.a.v(qe0.o.a(do3.q.f(cVar.f273777c, cVar.f273776b), new trb.b(symbol, u1.g(interval, trb.c.d)), 1L, w4l.i.f294643c, true, null, 16), new nrb.c(1));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        ((CollateralMoveMoneyScreen) this.f188258b).S.k(formattedValue);
    }

    public r l() {
        oyc.c cVar = (oyc.c) this.f188258b;
        return nim.a.w(cVar.f.f(Unit.f186387a, true), new oyc.a(cVar, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable m(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lyc.b
            if (r0 == 0) goto L13
            r0 = r8
            lyc.b r0 = (lyc.b) r0
            int r1 = r0.f200778w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f200778w = r1
            goto L18
        L13:
            lyc.b r0 = new lyc.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f200778w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L28
            goto L5a
        L28:
            r7 = move-exception
            goto L5d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            efm.r r8 = r6.l()     // Catch: java.lang.Exception -> L28
            lu6.p r2 = new lu6.p     // Catch: java.lang.Exception -> L28
            r5 = 1
            r2.<init>(r7, r5)     // Catch: java.lang.Exception -> L28
            efm.r r7 = nim.a.w(r8, r2)     // Catch: java.lang.Exception -> L28
            r8 = 3
            efm.r r7 = m70.a.g(r7, r4, r4, r8)     // Catch: java.lang.Exception -> L28
            efm.d0 r7 = r7.firstOrError()     // Catch: java.lang.Exception -> L28
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)     // Catch: java.lang.Exception -> L28
            r0.f200778w = r3     // Catch: java.lang.Exception -> L28
            java.lang.Object r8 = nim.a.b(r7, r0)     // Catch: java.lang.Exception -> L28
            if (r8 != r1) goto L5a
            return r1
        L5a:
            com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence r8 = (com.revolut.feature.selfserve.sot.api.models.SubmissionEvidence) r8     // Catch: java.lang.Exception -> L28
            return r8
        L5d:
            gom.c r8 = gom.e.f145194a
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "SOT Kompot: refreshEvidenceAfterSubmit failed"
            r8.e(r7, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kpj.f.m(java.lang.String, gim.c):java.io.Serializable");
    }

    public sfm.b n(String transactionId, IncomeSource incomeSource, String str, String str2, Map documentsToUpload) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        Intrinsics.checkNotNullParameter(documentsToUpload, "documentsToUpload");
        oyc.c cVar = (oyc.c) this.f188258b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(incomeSource, "incomeSource");
        d0 d0VarFirstOrError = m70.a.g(cVar.e.f(Unit.f186387a, false), null, new ox5.d0(16), 1).firstOrError();
        oy9.b bVar = new oy9.b(new kwg.e(cVar, incomeSource, transactionId, str2, str, 21), 18);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, bVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        sfm.b bVar2 = new sfm.b(iVar, new lxb.c(17, new lul.d(this, documentsToUpload, 6)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
        return bVar2;
    }

    public iv9.a o(kv9.h messageDto) {
        Intrinsics.checkNotNullParameter(messageDto, "messageDto");
        String strC = messageDto.getId();
        String code = messageDto.getSender().getCode();
        String code2 = messageDto.getRecipient().getCode();
        if (code2 == null && (code2 = messageDto.getRecipient().getGroupId()) == null) {
            code2 = "";
        }
        String str = code2;
        String groupId = messageDto.getRecipient().getGroupId();
        boolean z = false;
        if (groupId != null && groupId.length() > 0) {
            z = true;
        }
        boolean z3 = z;
        String strD = messageDto.getMedia();
        String strValueOf = String.valueOf(messageDto.getType());
        long jB = messageDto.getCreatedDate();
        long j2 = messageDto.getUpdatedDate();
        String id10 = dv9.d.SENT.getId();
        String strH = messageDto.getState();
        kgm.i iVar = (kgm.i) this.f188258b;
        Intrinsics.checkNotNullParameter(messageDto, "messageDto");
        return new iv9.a(strC, code, str, strD, strValueOf, z3, jB, j2, id10, strH, (messageDto.getType() != kv9.j.TEXT || messageDto.getMedia() == null) ? null : iVar.r(messageDto.getMedia()));
    }

    public r p(String str, String str2, Map map) {
        r rVarConcatMap = r.fromIterable(t0.C(map)).concatMap(new lxb.c(16, new n(this, 9, str, str2)));
        Intrinsics.checkNotNullExpressionValue(rVarConcatMap, "concatMap(...)");
        return c6d.b.R(rVarConcatMap, w.u(map.values()));
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        tl.b it8 = (tl.b) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8.f271979a.getDocSide() == ((DocSide) this.f188258b);
    }

    public f(m function) {
        this.f188257a = 25;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f188258b = function;
    }

    public /* synthetic */ f(oc.f fVar) {
        this.f188257a = 26;
        b0 b0Var = new b0(fVar, 28);
        this.f188258b = pc.b.a(new kye.e(pc.b.a(new jt0.b(pc.b.a(new kge.d(b0Var, pc.b.a(new c0(b0Var, 29)), 16)), 14, pc.b.a(new kgm.c(b0Var, 26)), b0Var)), 25));
    }

    public f(PaymentData internal) {
        this.f188257a = 21;
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f188258b = internal;
    }

    public f(m25.n creditCardBoletoSectionMapper) {
        this.f188257a = 10;
        Intrinsics.checkNotNullParameter(creditCardBoletoSectionMapper, "creditCardBoletoSectionMapper");
        this.f188258b = creditCardBoletoSectionMapper;
    }

    public f(kgm.i messageMentionsParser) {
        this.f188257a = 16;
        Intrinsics.checkNotNullParameter(messageMentionsParser, "messageMentionsParser");
        this.f188258b = messageMentionsParser;
    }

    public f(ypg.e savingsInteractor) {
        this.f188257a = 27;
        Intrinsics.checkNotNullParameter(savingsInteractor, "savingsInteractor");
        this.f188258b = savingsInteractor;
    }

    public f(f80.a uriHelper) {
        this.f188257a = 5;
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        this.f188258b = uriHelper;
    }

    public f(hwg.a assetsEnabledProvider) {
        this.f188257a = 1;
        Intrinsics.checkNotNullParameter(assetsEnabledProvider, "assetsEnabledProvider");
        this.f188258b = assetsEnabledProvider;
    }

    public f(lo5.p cryptoSendNaviCommandProvider) {
        this.f188257a = 29;
        Intrinsics.checkNotNullParameter(cryptoSendNaviCommandProvider, "cryptoSendNaviCommandProvider");
        this.f188258b = cryptoSendNaviCommandProvider;
    }

    public f(n8b.a countryInteractor) {
        this.f188257a = 4;
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f188258b = countryInteractor;
    }

    public f(yqb.b slotManagerScreenMapper) {
        this.f188257a = 6;
        Intrinsics.checkNotNullParameter(slotManagerScreenMapper, "slotManagerScreenMapper");
        this.f188258b = slotManagerScreenMapper;
    }

    public f(f5h.c additionalServicesRepository) {
        this.f188257a = 19;
        Intrinsics.checkNotNullParameter(additionalServicesRepository, "additionalServicesRepository");
        this.f188258b = additionalServicesRepository;
    }

    public f(m93.g cardsSimplifiedItemMapper) {
        this.f188257a = 7;
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        this.f188258b = cardsSimplifiedItemMapper;
    }

    public f(old.e slotChecklistHeaderProgressMapper, old.b slotChecklistHeaderAssetMapper) {
        this.f188257a = 23;
        Intrinsics.checkNotNullParameter(slotChecklistHeaderProgressMapper, "slotChecklistHeaderProgressMapper");
        Intrinsics.checkNotNullParameter(slotChecklistHeaderAssetMapper, "slotChecklistHeaderAssetMapper");
        this.f188258b = slotChecklistHeaderAssetMapper;
    }

    public f(adh.i roboStrategiesToggleProvider) {
        this.f188257a = 18;
        Intrinsics.checkNotNullParameter(roboStrategiesToggleProvider, "roboStrategiesToggleProvider");
        this.f188258b = roboStrategiesToggleProvider;
    }

    public f(trb.c repository) {
        this.f188257a = 24;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f188258b = repository;
    }

    public f(m7i.a collisionValidator, k sameAccountsCollisionValidator, m7i.b incomeSorterCollisionValidator, m7i.m zeroAmountValidator, m7i.d insufficientBalanceValidator, m7i.e limitValidator, m7i.g mmfExceedsModeErrorValidator) {
        this.f188257a = 11;
        Intrinsics.checkNotNullParameter(collisionValidator, "collisionValidator");
        Intrinsics.checkNotNullParameter(sameAccountsCollisionValidator, "sameAccountsCollisionValidator");
        Intrinsics.checkNotNullParameter(incomeSorterCollisionValidator, "incomeSorterCollisionValidator");
        Intrinsics.checkNotNullParameter(zeroAmountValidator, "zeroAmountValidator");
        Intrinsics.checkNotNullParameter(insufficientBalanceValidator, "insufficientBalanceValidator");
        Intrinsics.checkNotNullParameter(limitValidator, "limitValidator");
        Intrinsics.checkNotNullParameter(mmfExceedsModeErrorValidator, "mmfExceedsModeErrorValidator");
        this.f188258b = collisionValidator;
    }

    public f(zjh.c pricingPlanInteractor) {
        this.f188257a = 0;
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f188258b = pricingPlanInteractor;
    }

    public f(hz3.c creditApplicationCommandsFactory) {
        this.f188257a = 17;
        Intrinsics.checkNotNullParameter(creditApplicationCommandsFactory, "creditApplicationCommandsFactory");
        this.f188258b = creditApplicationCommandsFactory;
    }

    public f(oyc.c sotRepository) {
        this.f188257a = 8;
        Intrinsics.checkNotNullParameter(sotRepository, "sotRepository");
        this.f188258b = sotRepository;
    }

    public f(xx9.p interactor, oy9.f recipientSearchItemClickDelegate) {
        this.f188257a = 28;
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(recipientSearchItemClickDelegate, "recipientSearchItemClickDelegate");
        this.f188258b = interactor;
    }

    public f(int i, Set additionalConfig) {
        this.f188257a = i;
        switch (i) {
            case 14:
                Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
                this.f188258b = additionalConfig;
                break;
            default:
                Intrinsics.checkNotNullParameter(additionalConfig, "interactors");
                Set set = additionalConfig;
                int iB = zhm.q0.b(w.t(set, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
                for (Object obj2 : set) {
                    linkedHashMap.put(((u3d.b) obj2).a(), obj2);
                }
                this.f188258b = linkedHashMap;
                break;
        }
    }
}
