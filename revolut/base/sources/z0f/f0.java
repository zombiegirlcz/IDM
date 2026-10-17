package z0f;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.model.TopUpMethodsContext;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData;
import com.revolut.revolut.feature_fourthline_impl.R;
import e0f.r1;
import e0f.v0;
import e7l.g;
import et6.i2;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.j2;
import vkm.o2;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 extends oki.h implements y {
    public final cli.y A;
    public final TopupMethodsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final tze.a f318252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u51.a f318253q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f318254r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b1f.a f318255s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j60.a f318256t;
    public final vte.a u;
    public final i4b.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gr6.m f318257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ecm.q f318258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yve.e f318259y;
    public final gte.a z;

    public f0(cli.n stateMapper, TopupMethodsScreenContract$InputData inputData, tze.a selectedCurrencyRelay, u51.a topupMethodsInteractor, wsg.n walletInteractor, b1f.a topUpMethodOutageDialogProvider, j60.a bottomDialogExtension, vte.a topUpInteractor, i4b.f legalEntityContextProvider, gr6.m freelancerPocketsInteractor, ecm.q retailPreferencesInteractor, yve.e topUpCurrencyOrderInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(selectedCurrencyRelay, "selectedCurrencyRelay");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(topUpMethodOutageDialogProvider, "topUpMethodOutageDialogProvider");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(retailPreferencesInteractor, "retailPreferencesInteractor");
        Intrinsics.checkNotNullParameter(topUpCurrencyOrderInteractor, "topUpCurrencyOrderInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = inputData;
        this.f318252p = selectedCurrencyRelay;
        this.f318253q = topupMethodsInteractor;
        this.f318254r = walletInteractor;
        this.f318255s = topUpMethodOutageDialogProvider;
        this.f318256t = bottomDialogExtension;
        this.u = topUpInteractor;
        this.v = legalEntityContextProvider;
        this.f318257w = freelancerPocketsInteractor;
        this.f318258x = retailPreferencesInteractor;
        this.f318259y = topUpCurrencyOrderInteractor;
        this.z = featureToggleInteractor;
        Data data = new Data(null, null, true, 3, null);
        String str = inputData.f91102a;
        boolean zC = retailPreferencesInteractor.c("SALARY_BANNER_AVAILABLE", true);
        yte.n nVar = inputData.f91103b;
        this.A = mra.d.b(this, new q(data, null, str, null, null, true, false, null, zC, (nVar == yte.n.CARD_CHECKOUT || nVar == yte.n.THREE_DS) ? false : true, new Data(null, null, true, 3, null), inputData.f), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(z0f.f0 r9, java.util.List r10, gim.c r11) {
        /*
            com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreenContract$InputData r0 = r9.o
            boolean r1 = r11 instanceof z0f.e0
            if (r1 == 0) goto L16
            r1 = r11
            z0f.e0 r1 = (z0f.e0) r1
            int r2 = r1.f318251x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f318251x = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            z0f.e0 r1 = new z0f.e0
            r1.<init>(r9, r11)
            goto L14
        L1c:
            java.lang.Object r11 = r7.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r7.f318251x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.util.ArrayList r10 = r7.u
            yhm.o.b(r11)
            goto L7f
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            yhm.o.b(r11)
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            xi0.a r2 = xi0.b.Companion
            java.util.ArrayList r8 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r11, r4)
            r8.<init>(r4)
            java.util.Iterator r11 = r11.iterator()
        L4c:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r11.next()
            java.lang.String r4 = (java.lang.String) r4
            t61.a.A(r2, r4, r8)
            goto L4c
        L5c:
            yve.e r2 = r9.f318259y
            xi0.a r11 = xi0.b.Companion
            java.lang.String r4 = r0.f91102a
            r11.getClass()
            xi0.b r11 = xi0.a.a(r4)
            yte.n r5 = r0.f91103b
            com.revolut.feature.topup_screen.common.TopUpTarget r0 = r0.f91104c
            com.revolut.core.model.account.AccountId r6 = e1f.c.a(r0)
            r7.u = r8
            r7.f318251x = r3
            r4 = r10
            r3 = r11
            java.io.Serializable r11 = r2.c(r3, r4, r5, r6, r7)
            if (r11 != r1) goto L7e
            return r1
        L7e:
            r10 = r8
        L7f:
            java.util.List r11 = (java.util.List) r11
            cli.y r0 = r9.A
            eh1.d r1 = new eh1.d
            r2 = 14
            r1.<init>(r11, r2, r10)
            r9.H2(r0, r1)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z0f.f0.I2(z0f.f0, java.util.List, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Flow flowC;
        TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = this.o;
        String currencyCode = topupMethodsScreenContract$InputData.f91102a;
        yte.n contextType = topupMethodsScreenContract$InputData.f91103b;
        List list = topupMethodsScreenContract$InputData.e;
        r1 r1Var = (r1) this.f318253q;
        r1Var.getClass();
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        hve.b bVar = r1Var.f121679a;
        TopUpMethodsContext topUpMethodsContext = new TopUpMethodsContext(currencyCode, contextType);
        hve.o oVar = (hve.o) bVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(topUpMethodsContext, "topUpMethodsContext");
        Continuation continuation = null;
        o2 o2Var = new o2(oVar.f155854l, new hsd.c((Object) oVar, (Object) topUpMethodsContext, false, continuation, 2));
        int i = 2;
        int i2 = 1;
        yji.l.a1(this, mo3.a.g(nim.a.v(o2Var, new do2.o(list, i)), null, new a0(0), 1), null, null, new d0(this, continuation, 4), 3);
        yy9.s sVar = new yy9.s(17);
        cli.y yVar = this.A;
        int i3 = 26;
        yji.l.a1(this, vkm.q.Q(yVar.B(sVar), new y4f.o(continuation, this, i3)), null, null, new d0(this, continuation, 3), 3);
        int i5 = 24;
        if (((q) ((j2) yVar.f22677a).getValue()).f318278j) {
            if (((jte.d) this.z).c(TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c)) {
                yji.l.a1(this, mo3.a.g(nim.a.v(yVar.B(new yy9.s(23)), new yy9.s(24)), null, null, 3), null, null, new yv1.k(this, continuation, 12), 3);
            } else {
                int i6 = c0.f318247a[contextType.ordinal()];
                w4l.h hVar = w4l.h.f294642c;
                switch (i6) {
                    case 1:
                        flowC = ((i2) this.f318257w).c(hVar);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        io3.l lVar = io3.l.CURRENT;
                        io3.j jVar = io3.j.PERSONAL;
                        io3.i iVar = io3.i.INTERNAL;
                        flowC = rd0.e.b(this.f318254r.M(hVar, lVar, io3.k.ACTIVE, iVar, jVar, qsg.a.RECENT_FIRST, e1f.c.a(topupMethodsScreenContract$InputData.f91104c)));
                        break;
                    case 6:
                        io3.l lVar2 = io3.l.REVX_FIAT;
                        io3.j jVar2 = io3.j.PERSONAL;
                        io3.i iVar2 = io3.i.INTERNAL;
                        flowC = rd0.e.b(this.f318254r.M(hVar, lVar2, io3.k.ACTIVE, iVar2, jVar2, qsg.a.RECENT_FIRST, e1f.c.a(topupMethodsScreenContract$InputData.f91104c)));
                        break;
                    default:
                        IllegalStateException illegalStateException = new IllegalStateException("Unsupported context for BE-driven methods");
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        flowC = vkm.i.f290039a;
                        break;
                }
                yji.l.a1(this, mo3.a.g(u0.i(flowC, nim.a.v(yVar.B(new yy9.s(18)), new yy9.s(19)), rd0.e.b(nim.a.w(((ik3.c) ((v0) this.u).f121693a).k(g.b.f123407a), new dz7.k(21)))), null, new yw9.j(29), 1), null, null, new d0(this, continuation, i2), 3);
            }
            yji.l.a1(this, this.f318252p.f275946b, null, null, new d0(this, continuation, i), 3);
        }
        l2(new yl6.b(this, continuation, i5), new yi5.b(i3));
    }

    public final void J2(TopupMethod topupMethod) {
        if ((topupMethod instanceof TopupMethod.StoredMethod.Card) || (topupMethod instanceof TopupMethod.StoredMethod.Openbanking) || (topupMethod instanceof TopupMethod.StoredMethod.PayTo) || (topupMethod instanceof TopupMethod.StoredMethod.UpiApp) || (topupMethod instanceof TopupMethod.StoredMethod.NetBanking) || (topupMethod instanceof TopupMethod.StoredMethod.PixSmartTransfer) || (topupMethod instanceof TopupMethod.StoredMethod.Akahu) || (topupMethod instanceof TopupMethod.StoredMethod.GmoPgBankDirect) || (topupMethod instanceof TopupMethod.OtherMethod)) {
            C2(new w(topupMethod, ((q) ((j2) this.A.f22677a).getValue()).f318275c));
        } else {
            if (!(topupMethod instanceof TopupMethod.SuggestedMethod)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException("Suggested method can't be selected on top-up methods screen");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    public final void K2(TopupMethod topupMethod) {
        if (((jte.d) this.z).c(TopupApi$Toggles.PayByBank.f90470c)) {
            J2(topupMethod);
        } else {
            H2(this.A, new b0(topupMethod, 0));
        }
    }

    public final void L2(TopupMethod.StoredMethod.Outage outageInfo) {
        this.f318255s.getClass();
        Intrinsics.checkNotNullParameter(outageInfo, "outageInfo");
        rp0.t tVar = new rp0.t(new TextClause(outageInfo.f60487a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(outageInfo.f60488b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 28);
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("LARGE_BUTTON_ID_TOP_UP_METHOD_GOT_IT", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), false, null, null, null, null, 1000);
        yp0.b.r(model, 0, R$attr.uikit_dp24, 0, 0, 13);
        this.f318256t.x(new rp0.y(zhm.u.c(model), tVar, rp0.l.WINDOW, null, null, null, null, null, null, null, 3832));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
