package ea2;

import ahe.a1;
import ahe.b1;
import ahe.k1;
import ahe.w0;
import android.app.Activity;
import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import b9.w2;
import com.google.common.collect.ImmutableMap;
import com.revolut.biometric_verification.api.models.BiometricVerificationFeature;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CameraKitClientSettings;
import com.revolut.camerakit.client.api.models.CameraKitUiSettings;
import com.revolut.camerakit.core.settings.VideoWatermark;
import com.revolut.camerakit.ui.views.view.CameraKitPreviewView;
import com.revolut.feature.referrals.shared.ui.impl.network.services.ReferralsTroubleshooterService;
import com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.InviteCampaignHomeControllerContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.InvitesListContract$InputData;
import com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.AllReferralsScreenContract$InputData;
import com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.CardDeliveryDetailsContract$InputData;
import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.us_direct_deposit.impl.atomic.network.AtomicApi;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceContract$InputData;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreenContract$InputData;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreenContract$InputData;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.category_budget.CategoryBudgetContract$InputData;
import com.revolut.retail.feature.impl.budgeting.ui.rev10.goals.upcoming_payments.UpcomingPaymentsContract$InputData;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import f60.v;
import f60.y;
import g48.r0;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import jhe.w;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineScope;
import pya.a0;
import retrofit2.Retrofit;
import rp0.l0;
import rp0.x0;
import skm.p0;
import sy.d0;
import t80.e;
import vge.c1;
import vge.c2;
import vge.e2;
import vge.g1;
import vge.i0;
import vge.l1;
import vge.m0;
import vge.n0;
import vge.o1;
import vge.p1;
import vge.q0;
import vge.q1;
import vge.s0;
import vge.t0;
import vge.t2;
import vge.t3;
import vge.u3;
import vge.v1;
import vge.x;
import vge.x1;
import vge.y2;
import vge.z2;
import xge.b0;
import xge.g0;
import xge.z;
import ybh.c0;
import yfe.e1;
import yfe.o0;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f124106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f124107c;
    public final Object d;

    public /* synthetic */ p(Object obj2, Object obj3, int i, int i2) {
        this.f124105a = i2;
        this.f124106b = obj2;
        this.d = obj3;
        this.f124107c = i;
    }

    private final Object a() {
        ehe.c cVar = (ehe.c) this.f124106b;
        ehe.b bVar = (ehe.b) this.d;
        int i = this.f124107c;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) bVar.d.get();
                xge.a aVar = (xge.a) bVar.z.get();
                e2 e2Var = (e2) bVar.f125953h.get();
                z2 z2Var = (z2) bVar.B.get();
                bn2.p pVarC = cVar.I.c();
                o1 o1Var = (o1) bVar.C.get();
                fhe.a aVarA = hhe.c.a();
                ImmutableMap immutableMapN = bVar.n();
                ssi.o oVarC = cVar.E.c();
                vc.s.j(oVarC);
                ash.i iVarI = ((tc7.d) cVar.J).i();
                vc.s.j(iVarI);
                skd.i iVarC = cVar.K.c();
                i49.a aVar2 = (i49.a) cVar.L.f202679b.get();
                vc.s.j(aVar2);
                v1 v1Var = new v1((xge.a) bVar.z.get(), bVar.n());
                l1 l1Var = new l1(bVar.f125950b.f125991s.i());
                r10.d dVarE = ((zc6.a) cVar.M).e();
                b9k.f dependencies = bVar.f125949a;
                sge.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                return new x(coroutineScope, aVar, e2Var, z2Var, pVarC, o1Var, aVarA, immutableMapN, oVarC, iVarI, iVarC, aVar2, v1Var, l1Var, dVarE, (nge.h) dependencies.f13817b);
            case 1:
                hhe.b.Companion.getClass();
                return rd0.e.a(p0.f264002b);
            case 2:
                e4m.e eVar = bVar.d;
                ehe.c cVar2 = bVar.f125950b;
                CoroutineScope coroutineScope2 = (CoroutineScope) eVar.get();
                e2 e2Var2 = (e2) bVar.f125953h.get();
                lge.j jVar = new lge.j();
                lge.h hVar = new lge.h(cVar2.f125983m.e(), ((blb.e) cVar2.f125982l).e());
                su9.c cVar3 = new su9.c(new tul.b((b0) bVar.i.get()), (b0) bVar.i.get());
                b0 b0Var = (b0) bVar.i.get();
                xge.j jVar2 = (xge.j) bVar.k.get();
                y2 y2VarO = bVar.o();
                s0 s0Var = (s0) bVar.u.get();
                u3 u3Var = (u3) bVar.f125965y.get();
                tul.b bVar2 = new tul.b((e2) bVar.f125953h.get());
                i0 i0Var = (i0) bVar.f125954j.get();
                m0 m0VarM = bVar.m();
                z zVar = new z(cVar2.f125991s.i());
                xge.n nVar = new xge.n(bVar.h());
                gte.a aVarB = cVar.v.b();
                vc.s.j(aVarB);
                return new xge.g(coroutineScope2, e2Var2, jVar, hVar, cVar3, b0Var, jVar2, y2VarO, s0Var, u3Var, bVar2, i0Var, m0VarM, zVar, nVar, aVarB);
            case 3:
                ne0.j jVar3 = (ne0.j) bVar.e.get();
                mk0.a aVarA2 = cVar.f125971c.a();
                vc.s.j(aVarA2);
                sge.c.a();
                return new t2(jVar3, aVarA2, TabAccountsMode.Home.f89466a, (x1) bVar.f125952g.get());
            case 4:
                hhe.b.Companion.getClass();
                return new ne0.d();
            case 5:
                return new c2((ue0.c) bVar.f.get(), (Map) cVar.f125994t0.get(), bVar.h());
            case 6:
                sge.c.a();
                TabAccountsMode.Home home = TabAccountsMode.Home.f89466a;
                an0.c cVar4 = cVar.d;
                ee0.a aVar3 = cVar.e;
                yk0.a aVarB2 = cVar4.b();
                vc.s.j(aVarB2);
                je0.d dVarD = aVar3.d();
                vc.s.j(dVarD);
                xe0.f fVarF = aVar3.f();
                vc.s.j(fVarF);
                return h7d.a.t(home, aVarB2, dVarD, fVarF);
            case 7:
                mk0.a aVarA3 = cVar.f125971c.a();
                vc.s.j(aVarA3);
                sge.c.a();
                return new g0(aVarA3, TabAccountsMode.Home.f89466a);
            case 8:
                CoroutineScope coroutineScope3 = (CoroutineScope) bVar.d.get();
                i0 i0Var2 = (i0) bVar.f125954j.get();
                Map map = (Map) bVar.f125950b.A0.get();
                b9k.f dependencies2 = bVar.f125949a;
                sge.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependencies2, "dependencies");
                return new xge.j(coroutineScope3, i0Var2, new xge.u(map, (rfe.d) dependencies2.d));
            case 9:
                return new i0();
            case 10:
                return new t0(cVar.f125988q.b(), cVar.f125989r.a(), (u3) bVar.f125965y.get());
            case 11:
                return new u3((c1) bVar.f125956m.get(), (yge.a) bVar.f125964x.get());
            case 12:
                CoroutineScope coroutineScope4 = (CoroutineScope) bVar.d.get();
                n0 n0Var = (n0) bVar.f125955l.get();
                b9k.f dependencies3 = bVar.f125949a;
                sge.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependencies3, "dependencies");
                vge.b0 b0Var2 = new vge.b0((kge.d) dependencies3.f13819g, (e2) bVar.f125953h.get());
                ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
                ProductId productId = ProductId.CURRENCY;
                ehe.c cVar5 = bVar.f125950b;
                builderBuilderWithExpectedSize.put(productId, cVar5.B0.get());
                builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, cVar5.C0.get());
                builderBuilderWithExpectedSize.put(ProductId.YOUTH, cVar5.D0.get());
                builderBuilderWithExpectedSize.put(ProductId.TEEN, cVar5.E0.get());
                builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, cVar5.F0.get());
                builderBuilderWithExpectedSize.put(ProductId.SAVINGS, cVar5.G0.get());
                builderBuilderWithExpectedSize.put(ProductId.CREDIT, cVar5.H0.get());
                builderBuilderWithExpectedSize.put(ProductId.CREDIT_HUB, cVar5.I0.get());
                builderBuilderWithExpectedSize.put(ProductId.LINKED, cVar5.J0.get());
                builderBuilderWithExpectedSize.put(ProductId.PRO, cVar5.K0.get());
                builderBuilderWithExpectedSize.put(ProductId.JOINT, cVar5.L0.get());
                builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, cVar5.M0.get());
                builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, bVar.f125963w.get());
                return new g1(coroutineScope4, n0Var, b0Var2, builderBuilderWithExpectedSize.build());
            case 13:
                return new q0(cVar.f125983m.e(), cVar.f125991s.i());
            case 14:
                gte.a aVarB3 = cVar.v.b();
                vc.s.j(aVarB3);
                return new w(aVarB3, e4m.b.a(bVar.v), new jhe.x(), cVar.D.b());
            case 15:
                e4m.e eVar2 = bVar.d;
                ehe.c cVar6 = bVar.f125950b;
                CoroutineScope coroutineScope5 = (CoroutineScope) eVar2.get();
                ahe.b bVar3 = (ahe.b) bVar.f125957n.get();
                ahe.e eVar3 = (ahe.e) bVar.o.get();
                jhe.b bVar4 = new jhe.b();
                g6e.b bVarA = cVar6.f126000y.a();
                vc.s.j(bVarA);
                jhe.a aVar4 = new jhe.a(bVar4, bVarA);
                ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(7);
                yfe.a aVar5 = yfe.a.Cash;
                g6e.b bVarA2 = ((yy5.b) cVar6.f125993t).B.a();
                vc.s.j(bVarA2);
                builderBuilderWithExpectedSize2.put(aVar5, new vy5.b(bVarA2));
                yfe.a aVar6 = yfe.a.Credit;
                yfe.b bVar5 = (yfe.b) ((t15.d) cVar6.f125978h).W.get();
                vc.s.j(bVar5);
                builderBuilderWithExpectedSize2.put(aVar6, bVar5);
                yfe.a aVar7 = yfe.a.Joint;
                yfe.b bVar6 = (yfe.b) ((q38.b) cVar6.f125984n).N.get();
                vc.s.j(bVar6);
                builderBuilderWithExpectedSize2.put(aVar7, bVar6);
                yfe.a aVar8 = yfe.a.Savings;
                yfe.b bVar7 = (yfe.b) ((fob.a) cVar6.k).X.get();
                vc.s.j(bVar7);
                builderBuilderWithExpectedSize2.put(aVar8, bVar7);
                yfe.a aVar9 = yfe.a.Pro;
                yfe.b bVar8 = (yfe.b) ((yha.a) cVar6.o).D.get();
                vc.s.j(bVar8);
                builderBuilderWithExpectedSize2.put(aVar9, bVar8);
                yfe.a aVar10 = yfe.a.Youth;
                yfe.b bVar9 = (yfe.b) ((k78.b) cVar6.i).f181878w0.get();
                vc.s.j(bVar9);
                builderBuilderWithExpectedSize2.put(aVar10, bVar9);
                yfe.a aVar11 = yfe.a.Linked;
                yfe.b bVar10 = (yfe.b) ((xf6.t) cVar6.z).H0.get();
                vc.s.j(bVar10);
                builderBuilderWithExpectedSize2.put(aVar11, bVar10);
                ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize2.build();
                ImmutableMap.Builder builderBuilderWithExpectedSize3 = ImmutableMap.builderWithExpectedSize(7);
                o0 o0Var = (o0) ((yy5.b) cVar6.f125993t).G.get();
                vc.s.j(o0Var);
                builderBuilderWithExpectedSize3.put(aVar5, o0Var);
                o0 o0Var2 = (o0) ((q38.b) cVar6.f125984n).M.get();
                vc.s.j(o0Var2);
                builderBuilderWithExpectedSize3.put(aVar7, o0Var2);
                o0 o0Var3 = (o0) ((fob.a) cVar6.k).W.get();
                vc.s.j(o0Var3);
                builderBuilderWithExpectedSize3.put(aVar8, o0Var3);
                o0 o0Var4 = (o0) ((t15.d) cVar6.f125978h).V.get();
                vc.s.j(o0Var4);
                builderBuilderWithExpectedSize3.put(aVar6, o0Var4);
                o0 o0Var5 = (o0) ((yha.a) cVar6.o).C.get();
                vc.s.j(o0Var5);
                builderBuilderWithExpectedSize3.put(aVar9, o0Var5);
                o0 o0Var6 = (o0) ((k78.b) cVar6.i).f181876v0.get();
                vc.s.j(o0Var6);
                builderBuilderWithExpectedSize3.put(aVar10, o0Var6);
                o0 o0Var7 = (o0) ((xf6.t) cVar6.z).G0.get();
                vc.s.j(o0Var7);
                builderBuilderWithExpectedSize3.put(aVar11, o0Var7);
                ImmutableMap immutableMapBuild2 = builderBuilderWithExpectedSize3.build();
                wsg.b bVarA3 = cVar.f125988q.a();
                ppk.f fVarA = cVar.f125989r.a();
                b1 b1Var = (b1) bVar.f125959q.get();
                yfe.a aVar12 = yfe.a.Crypto;
                e1 e1Var = (e1) cVar6.A.f144912h.get();
                vc.s.j(e1Var);
                return new w0(coroutineScope5, bVar3, eVar3, aVar4, immutableMapBuild, immutableMapBuild2, bVarA3, fVarA, b1Var, ImmutableMap.of(aVar12, (cmh.n) e1Var, yfe.a.Invest, ((mkh.s) cVar6.B).d()), new lge.h(cVar6.f125983m.e(), ((blb.e) cVar6.f125982l).e()), new lge.j(), new jhe.g((mhe.e) bVar.f125960r.get()), bVar.m(), new t1j.b((e2) bVar.f125953h.get()), (ahe.n) bVar.f125961s.get(), (ahe.f) bVar.f125962t.get(), (s0) bVar.u.get());
            case 16:
                bVar.getClass();
                ehe.c cVar7 = bVar.f125950b;
                ImmutableMap.Builder builderBuilderWithExpectedSize4 = ImmutableMap.builderWithExpectedSize(7);
                builderBuilderWithExpectedSize4.put(yfe.a.Cash, new phe.a((c1) bVar.f125956m.get(), bVar.p()));
                builderBuilderWithExpectedSize4.put(yfe.a.Savings, new phe.g((c1) bVar.f125956m.get()));
                builderBuilderWithExpectedSize4.put(yfe.a.Joint, new phe.e((c1) bVar.f125956m.get(), cVar7.f125998x.c(), bVar.p()));
                builderBuilderWithExpectedSize4.put(yfe.a.Credit, new phe.c((c1) bVar.f125956m.get()));
                builderBuilderWithExpectedSize4.put(yfe.a.Pro, new phe.f((c1) bVar.f125956m.get(), bVar.p()));
                builderBuilderWithExpectedSize4.put(yfe.a.Youth, new phe.i((c1) bVar.f125956m.get(), (xge.j) bVar.k.get(), bVar.p()));
                builderBuilderWithExpectedSize4.put(yfe.a.Linked, new bhe.a((c1) bVar.f125956m.get()));
                return new ahe.d(builderBuilderWithExpectedSize4.build(), new ahe.m(cVar7.f125991s.i()), new a1((e2) bVar.f125953h.get(), new tul.b((b0) bVar.i.get())));
            case 17:
                return new ahe.e();
            case 18:
                return new k1((ne0.j) bVar.e.get(), (ue0.c) bVar.f125958p.get(), (Map) cVar.f125994t0.get());
            case 19:
                an0.c cVar8 = cVar.d;
                ee0.a aVar13 = cVar.e;
                yk0.a databaseSessionProvider = cVar8.b();
                vc.s.j(databaseSessionProvider);
                je0.d mapper = aVar13.d();
                vc.s.j(mapper);
                xe0.f storageFactory = aVar13.f();
                vc.s.j(storageFactory);
                Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                return xe0.f.c(storageFactory, databaseSessionProvider, "TOTAL_WEALTH_STORAGE", mapper, 5, 16);
            case 20:
                Context context = bVar.f125950b.C;
                hhe.a aVar14 = hhe.b.Companion;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                tw0.g1.Companion.getClass();
                tw0.g1 widgetGridSpec = tw0.b1.a(context);
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(widgetGridSpec, "widgetGridSpec");
                return new mhe.e(widgetGridSpec);
            case 21:
                mk0.a aVarA4 = cVar.f125971c.a();
                vc.s.j(aVarA4);
                return new ahe.q(aVarA4);
            case 22:
                mk0.a aVarA5 = cVar.f125971c.a();
                vc.s.j(aVarA5);
                return new ahe.j(aVarA5);
            case 23:
                return new yge.e((CoroutineScope) bVar.d.get(), (e2) bVar.f125953h.get(), (xge.j) bVar.k.get());
            case 24:
                CoroutineScope coroutineScope6 = (CoroutineScope) bVar.d.get();
                e2 e2Var3 = (e2) bVar.f125953h.get();
                u3 u3Var2 = (u3) bVar.f125965y.get();
                y2 y2VarO2 = bVar.o();
                v1 v1Var2 = new v1((xge.a) bVar.z.get(), bVar.n());
                xge.j jVar4 = (xge.j) bVar.k.get();
                xge.a aVar15 = (xge.a) bVar.z.get();
                b9k.f dependencies4 = bVar.f125949a;
                sge.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependencies4, "dependencies");
                sge.c.a();
                return new t3(coroutineScope6, e2Var3, u3Var2, y2VarO2, v1Var2, jVar4, aVar15, qge.c.f245790a, TabAccountsMode.Home.f89466a);
            case 25:
                ahe.t tVar = (ahe.t) bVar.v.get();
                jhe.x xVar = new jhe.x();
                mhe.g gVar = new mhe.g();
                ssi.o oVarC2 = cVar.E.c();
                vc.s.j(oVarC2);
                qfe.a aVar16 = (qfe.a) ((rhe.n) cVar.F).f254441l.get();
                vc.s.j(aVar16);
                mhf.b bVarB = ((bjf.a) cVar.G).b();
                vc.s.j(bVarB);
                kge.d dVarB = cVar.D.b();
                gte.a aVarB4 = cVar.v.b();
                vc.s.j(aVarB4);
                tzg.m mVarT = cVar.H.t();
                vc.s.j(mVarT);
                return new jhe.t(tVar, xVar, gVar, oVarC2, aVar16, bVarB, dVarB, aVarB4, mVarT, new rkg.b());
            case 26:
                return new o1((e2) bVar.f125953h.get());
            case 27:
                vge.b1 b1Var2 = new vge.b1(bVar.o(), (e2) bVar.f125953h.get(), (vge.d) bVar.D.get());
                cm2.f fVarB = cVar.I.b();
                vc.s.j(fVarB);
                return new che.c(b1Var2, fVarB, cVar.I.c());
            case 28:
                b9k.f dependencies5 = bVar.f125949a;
                sge.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(dependencies5, "dependencies");
                kge.d dVar = (kge.d) dependencies5.f13819g;
                z2 z2Var2 = (z2) bVar.B.get();
                r0 r0VarC = cVar.f125998x.c();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) cVar.G).c();
                vc.s.j(aVarC);
                ang.f fVarE = cVar.f125983m.e();
                l80.e eVarH = cVar.T.h();
                vc.s.j(eVarH);
                return new zge.i(dVar, z2Var2, r0VarC, aVarC, fVarE, eVarH, (ue0.c) bVar.f.get());
            case 29:
                return new eie.b();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object b() {
        euh.f fVar = (euh.f) this.d;
        int i = this.f124107c;
        if (i != 0) {
            if (i == 1) {
                return new quh.a((iuh.o) ((euh.e) this.f124106b).f129586h.get());
            }
            throw new AssertionError(i);
        }
        BaseQuestionScreenContract$InputData inputData = fVar.f129587a;
        iuh.b answerValidator = (iuh.b) fVar.f129589c.get();
        euh.e eVar = fVar.f129588b;
        iuh.l buttonClauseFactory = (iuh.l) eVar.d.get();
        iuh.m questionSubtitleMapper = (iuh.m) eVar.f.get();
        Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
        Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
        quh.e stateMapper = new quh.e(buttonClauseFactory, questionSubtitleMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        return new quh.d(inputData, stateMapper, answerValidator);
    }

    private final Object c() {
        euh.d dVar = (euh.d) this.f124106b;
        euh.h hVar = (euh.h) this.d;
        int i = this.f124107c;
        switch (i) {
            case 0:
                return f0k.d.p((e60.a) hVar.f129600m.get());
            case 1:
                com.revolut.kompot.navigable.a aVar = (com.revolut.kompot.navigable.a) hVar.e.get();
                g60.a aVarA = v.a((com.revolut.kompot.navigable.a) hVar.e.get());
                Activity activityA = f60.t.a((com.revolut.kompot.navigable.a) hVar.e.get());
                t80.g gVar = (t80.g) hVar.f.get();
                com.revolut.kompot.navigable.a aVar2 = (com.revolut.kompot.navigable.a) hVar.e.get();
                y.a(aVar2);
                d4m.a aVarA2 = e4m.b.a(hVar.f129596g);
                nli.a aVar3 = new nli.a((t80.c) hVar.f129597h.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar.e.get()));
                t80.g gVar2 = (t80.g) hVar.f.get();
                zk0.b bVarL = hVar.f129594b.f129576g.l();
                vc.s.j(bVarL);
                return v1.c.q(aVar, new t80.v(aVarA, activityA, gVar, aVar2, aVarA2, aVar3, new oli.c(gVar2, bVarL, new nli.a((t80.c) hVar.f129597h.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar.e.get())), v.a((com.revolut.kompot.navigable.a) hVar.e.get()), hVar.c()), new oli.g(f60.u.a(f60.t.a((com.revolut.kompot.navigable.a) hVar.e.get())), v1.c.e((com.revolut.kompot.navigable.a) hVar.e.get()), new ami.n(e4m.b.a(hVar.i), 1), e4m.b.a(hVar.f129596g), (t80.g) hVar.f.get(), new nli.a((t80.c) hVar.f129597h.get(), f60.t.a((com.revolut.kompot.navigable.a) hVar.e.get())), new i90.b(), hVar.b(), hVar.c()), hVar.c()), f60.x.a(), (rp0.m) hVar.f129598j.get(), (e60.t) hVar.f129599l.get());
            case 2:
                l70.e eVar = dVar.f129576g;
                l70.e eVar2 = dVar.f129576g;
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                l80.e eVarH = eVar2.h();
                vc.s.j(eVarH);
                zk0.b bVarL2 = eVar2.l();
                vc.s.j(bVarL2);
                return new t80.b(aVarX, eVarH, bVarL2);
            case 3:
                com.revolut.kompot.navigable.a aVar4 = (com.revolut.kompot.navigable.a) hVar.e.get();
                y.a(aVar4);
                return pli.c.a(new ks0.n(aVar4));
            case 4:
                BaseQuestionScreenContract$InputData inputData = hVar.f129593a;
                muh.a.Companion.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                return new t80.c(new e.a("RfiDocuments"), ((Question.Documents) inputData.f96544b).f105614g);
            case 5:
                return t96.a.a();
            case 6:
                return f60.z.a();
            case 7:
                aii.o oVar = (aii.o) hVar.k.get();
                y80.a aVarR = dVar.f129576g.r();
                vc.s.j(aVarR);
                return new e60.y(oVar, aVarR, hVar.b(), Optional.empty());
            case 8:
                e60.t tVar = (e60.t) hVar.f129599l.get();
                f60.w.a(tVar);
                return tVar;
            case 9:
                BaseQuestionScreenContract$InputData baseQuestionScreenContract$InputData = hVar.f129593a;
                iuh.b bVar = (iuh.b) hVar.f129602p.get();
                euh.e eVar3 = hVar.f129595c;
                iuh.l buttonClauseFactory = (iuh.l) eVar3.d.get();
                iuh.m questionSubtitleMapper = (iuh.m) eVar3.f.get();
                Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
                Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
                return new com.revolut.feature.workflow.engine.rfi.impl.ui.documents.a(baseQuestionScreenContract$InputData, bVar, new luh.k(buttonClauseFactory, questionSubtitleMapper), (luh.m) hVar.f129603q.get(), (e60.a) hVar.f129600m.get(), (zth.b) dVar.o.get());
            case 10:
                return new luh.l();
            case 11:
                return new luh.n();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        ev2.e eVar = (ev2.e) this.d;
        int i = this.f124107c;
        if (i == 0) {
            return new ov2.f((cli.n) eVar.f129694b.get());
        }
        if (i == 1) {
            return new ov2.h(eVar.f129693a, ((ev2.c) this.f124106b).f129687b.a());
        }
        throw new AssertionError(i);
    }

    private final Object e() {
        ev2.f fVar = (ev2.f) this.d;
        ev2.c cVar = (ev2.c) this.f124106b;
        o3i.a aVar = cVar.f129687b;
        int i = this.f124107c;
        if (i != 0) {
            if (i == 1) {
                return new mv2.q(aVar.a());
            }
            throw new AssertionError(i);
        }
        cli.n nVar = (cli.n) fVar.f129697b.get();
        mv2.d dVar = fVar.f129696a;
        y51.a aVarA = cVar.f129688c.a();
        vc.s.j(aVarA);
        return new mv2.o(nVar, dVar, aVarA, aVar.a());
    }

    private final Object f() {
        ewg.h hVar = (ewg.h) this.f124106b;
        ewg.f fVar = (ewg.f) this.d;
        int i = this.f124107c;
        if (i == 0) {
            return new aah.g(fVar.f130184a, (pyg.a) fVar.e.get());
        }
        if (i == 1) {
            return new pyg.g((v9j.a) fVar.d.get());
        }
        if (i == 2) {
            w9j.a aVarA = hVar.f130209q.a();
            vc.s.j(aVarA);
            return qw7.u.m(aVarA);
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        ewg.h hVar2 = fVar.f130186c;
        bbj.c cVarA = hVar2.f130210r.a();
        vc.s.j(cVarA);
        gte.a aVarB = hVar2.k.b();
        vc.s.j(aVarB);
        return new ywg.l(new bof.r(new pyg.i(cVarA, aVarB), new o7.b(new exg.a()), new axg.a(new exg.a(), hVar2.f130211s.g())), fVar.f130185b, hVar.b());
    }

    private final Object g() {
        ewg.h hVar = (ewg.h) this.f124106b;
        ewg.l lVar = (ewg.l) this.d;
        ewg.k kVar = lVar.d;
        ewg.h hVar2 = lVar.f130235c;
        int i = this.f124107c;
        switch (i) {
            case 0:
                return new aah.g(lVar.f130233a, (pyg.a) lVar.f.get());
            case 1:
                return new pyg.g((v9j.a) lVar.e.get());
            case 2:
                w9j.a aVarA = hVar.f130209q.a();
                vc.s.j(aVarA);
                return qw7.u.m(aVarA);
            case 3:
                WidgetisedAnalyticsPerformanceContract$InputData widgetisedAnalyticsPerformanceContract$InputData = lVar.f130234b;
                ite.a aVar = hVar2.k;
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                qxg.g gVar = new qxg.g(new qxg.b(aVarB));
                gte.a aVarB2 = aVar.b();
                vc.s.j(aVarB2);
                pxg.b bVar = new pxg.b(new kxg.b(aVarB2), (mxg.a) lVar.i.get(), (nxg.a) lVar.f130238j.get());
                gte.a aVarB3 = aVar.b();
                vc.s.j(aVarB3);
                uyg.e eVar = new uyg.e(aVarB3);
                uyg.c cVar = new uyg.c();
                bbj.c cVarA = hVar2.f130210r.a();
                vc.s.j(cVarA);
                gte.a aVarB4 = aVar.b();
                vc.s.j(aVarB4);
                pyg.i iVar = new pyg.i(cVarA, aVarB4);
                azg.b bVar2 = new azg.b();
                uyg.k kVar2 = new uyg.k();
                gte.a aVarB5 = aVar.b();
                vc.s.j(aVarB5);
                wyg.u uVar = new wyg.u(gVar, bVar, eVar, cVar, iVar, bVar2, kVar2, aVarB5);
                tyg.j jVarD = hVar.d();
                kwg.b bVarC = kVar.c();
                ybl.b bVarB = hVar2.f130205n.b();
                vc.s.j(bVarB);
                kwg.l lVar2 = (kwg.l) bVarC;
                jpc.e eVar2 = new jpc.e(lVar2, new sxg.k(bVarB, (kwg.l) kVar.c(), hVar2.d()), hVar2.d());
                tzg.m mVarT = hVar2.i.t();
                vc.s.j(mVarT);
                ybl.d dVarH = hVar2.f130205n.h();
                vc.s.j(dVarH);
                bwg.a aVar2 = new bwg.a();
                gwg.a aVar3 = kVar.f130231b;
                clc.b bVarA = hVar2.f130208p.a();
                vc.s.j(bVarA);
                oxg.q qVar = new oxg.q(mVarT, dVarH, aVar2, aVar3, bVarA);
                azg.b calculationMethodMapper = new azg.b();
                Intrinsics.checkNotNullParameter(calculationMethodMapper, "calculationMethodMapper");
                yyg.b bVar3 = new yyg.b();
                l0 l0Var = (l0) lVar.f130239l.get();
                w9j.e eVarB = hVar2.f130209q.b();
                vc.s.j(eVarB);
                tyg.a aVar4 = new tyg.a(eVarB);
                zyg.a aVar5 = new zyg.a(kVar.f130232c, new azg.b());
                byg.c cVar2 = new byg.c();
                vvg.b bVar4 = (vvg.b) hVar2.p0.get();
                tyg.j jVarD2 = hVar2.d();
                gvg.b bVar5 = (gvg.b) hVar2.f130213w;
                ivg.b bVar6 = (ivg.b) bVar5.f.get();
                ybl.b bVarB2 = bVar5.d.b();
                vc.s.j(bVarB2);
                return new com.revolut.feature.wealth.analytics.ui.widgetised.performance.a(widgetisedAnalyticsPerformanceContract$InputData, uVar, jVarD, eVar2, qVar, bVar3, l0Var, aVar4, aVar5, cVar2, new kbb.c(bVar4, jVarD2, new zq.a(bVar6, bVarB2)));
            case 4:
                return new mxg.b((lxg.a) lVar.f130237h.get());
            case 5:
                return new lxg.b();
            case 6:
                return new nxg.b();
            case 7:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) lVar.k.get();
                xyg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        ewg.h hVar = (ewg.h) this.f124106b;
        ewg.m mVar = (ewg.m) this.d;
        ewg.k kVar = mVar.d;
        ewg.h hVar2 = mVar.f130243c;
        int i = this.f124107c;
        switch (i) {
            case 0:
                return new aah.g(mVar.f130241a, (pyg.a) mVar.f.get());
            case 1:
                return new pyg.g((v9j.a) mVar.e.get());
            case 2:
                w9j.a aVarA = hVar.f130209q.a();
                vc.s.j(aVarA);
                return qw7.u.m(aVarA);
            case 3:
                mxg.a aVar = (mxg.a) mVar.i.get();
                nxg.a aVar2 = (nxg.a) mVar.f130246j.get();
                gte.a aVarB = hVar2.k.b();
                vc.s.j(aVarB);
                gyg.o oVar = new gyg.o(new kxg.e(new kxg.b(aVarB), aVar, aVar2));
                ite.a aVar3 = hVar2.k;
                gte.a aVarB2 = aVar3.b();
                vc.s.j(aVarB2);
                czg.c cVar = new czg.c(new qxg.b(aVarB2));
                gte.a aVarB3 = aVar3.b();
                vc.s.j(aVarB3);
                uyg.e eVar = new uyg.e(aVarB3);
                gte.a aVarB4 = hVar2.k.b();
                vc.s.j(aVarB4);
                kxg.b bVar = new kxg.b(aVarB4);
                hyg.b bVar2 = new hyg.b();
                l80.e eVarH = hVar2.f130195c.h();
                vc.s.j(eVarH);
                gte.a aVarB5 = aVar3.b();
                vc.s.j(aVarB5);
                gyg.m mVar2 = new gyg.m(bVar, bVar2, eVarH, aVarB5);
                uyg.c cVar2 = new uyg.c();
                bbj.c cVarA = hVar2.f130210r.a();
                vc.s.j(cVarA);
                gte.a aVarB6 = aVar3.b();
                vc.s.j(aVarB6);
                pyg.i iVar = new pyg.i(cVarA, aVarB6);
                gte.a aVarB7 = aVar3.b();
                vc.s.j(aVarB7);
                bzg.y yVar = new bzg.y(oVar, cVar, eVar, mVar2, cVar2, iVar, aVarB7);
                WidgetisedAnalyticsPnLScreenContract$InputData widgetisedAnalyticsPnLScreenContract$InputData = mVar.f130242b;
                kwg.b bVarC = kVar.c();
                kwg.b bVarC2 = kVar.c();
                ybl.b bVarB = hVar2.f130205n.b();
                vc.s.j(bVarB);
                kwg.l lVar = (kwg.l) bVarC2;
                jpc.e eVar2 = new jpc.e(lVar, new sxg.k(bVarB, (kwg.l) kVar.c(), hVar2.d()), hVar2.d());
                kbb.c cVarB = kVar.b();
                ybl.b bVarB2 = hVar2.f130205n.b();
                vc.s.j(bVarB2);
                kwg.l lVar2 = (kwg.l) bVarC;
                ou5.b bVar3 = new ou5.b(lVar2, eVar2, cVarB, new sxg.k(bVarB2, (kwg.l) kVar.c(), hVar2.d()), hVar2.d());
                ezg.b bVar4 = new ezg.b();
                l0 l0Var = (l0) mVar.f130247l.get();
                bzg.a aVar4 = new bzg.a(kVar.f130232c);
                tzg.m mVarT = hVar2.i.t();
                vc.s.j(mVarT);
                ybl.d dVarH = hVar2.f130205n.h();
                vc.s.j(dVarH);
                bwg.a aVar5 = new bwg.a();
                gwg.a aVar6 = kVar.f130231b;
                clc.b bVarA = hVar2.f130208p.a();
                vc.s.j(bVarA);
                oxg.q qVar = new oxg.q(mVarT, dVarH, aVar5, aVar6, bVarA);
                tyg.j jVarD = hVar.d();
                w9j.e eVarB = hVar2.f130209q.b();
                vc.s.j(eVarB);
                return new com.revolut.feature.wealth.analytics.ui.widgetised.pnl.a(yVar, widgetisedAnalyticsPnLScreenContract$InputData, bVar3, bVar4, l0Var, aVar4, qVar, jVarD, new tyg.a(eVarB));
            case 4:
                return new mxg.b((lxg.a) mVar.f130245h.get());
            case 5:
                return new lxg.b();
            case 6:
                return new nxg.b();
            case 7:
                com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) mVar.k.get();
                dzg.b.Companion.getClass();
                Intrinsics.checkNotNullParameter(controller, "controller");
                return new l0(controller.m2());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        l70.e eVar = ((ewj.c) this.f124106b).f130305c;
        int i = this.f124107c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            pwj.d.Companion.getClass();
            return new wwj.h(new pwj.b());
        }
        cli.n nVar = (cli.n) ((ewj.b) this.d).f130301b.get();
        s70.a aVarM = eVar.m();
        vc.s.j(aVarM);
        w70.a aVar = eVar.f192433b;
        vc.s.j(aVar);
        return new wwj.f(nVar, aVarM, aVar);
    }

    private final Object j() {
        exk.a aVar = (exk.a) this.d;
        int i = this.f124107c;
        if (i == 0) {
            return new kxk.n(aVar.f130452a, (cli.n) aVar.e.get(), (hxk.a) ((exk.c) this.f124106b).f130466p.get());
        }
        if (i == 1) {
            return new kxk.o((lxk.c) aVar.f130453b.get(), (lxk.a) aVar.d.get());
        }
        if (i == 2) {
            return new lxk.d();
        }
        if (i == 3) {
            return new lxk.b((lxk.g) aVar.f130454c.get());
        }
        if (i == 4) {
            return new lxk.e();
        }
        throw new AssertionError(i);
    }

    private final Object k() {
        String str;
        ey.b bVar = (ey.b) this.f124106b;
        ey.d dVar = (ey.d) this.d;
        int i = this.f124107c;
        switch (i) {
            case 0:
                oy.b bVar2 = dVar.f130490b;
                oy.a extension = (oy.a) dVar.i.get();
                Intrinsics.checkNotNullParameter(extension, "extension");
                vc.s.k(extension);
                return extension;
            case 1:
                return olc.c.b(dVar.f130490b, (com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 2:
                xy.b bVar3 = dVar.f130491c;
                xy.a extension2 = (xy.a) dVar.E.get();
                Intrinsics.checkNotNullParameter(extension2, "extension");
                vc.s.k(extension2);
                return extension2;
            case 3:
                return xhi.f.e(dVar.f130491c, (com.revolut.kompot.navigable.a) dVar.f130493h.get(), (yy.c) dVar.D.get());
            case 4:
                xv.h hVar = (xv.h) dVar.u.get();
                pv.a aVar = (pv.a) dVar.v.get();
                sx.a aVar2 = (sx.a) bVar.f130480g.k.get();
                vc.s.j(aVar2);
                py.d dVarB = bVar.f130480g.b();
                vc.s.j(dVarB);
                return new yy.c(hVar, aVar, aVar2, dVarB, (dv.a) dVar.A.get(), (ww.b) dVar.B.get(), new d0(), (pw.c) dVar.C.get());
            case 5:
                bVar.d.getClass();
                ex.b imageFormatConverter = new ex.b();
                Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
                dcl.q factory = new dcl.q();
                gx.e.Companion.getClass();
                Intrinsics.checkNotNullParameter(factory, "impl");
                ey.b bVar4 = (ey.b) dVar.L;
                u00.d dVar2 = bVar4.e;
                vy.a inputData = dVar.d;
                ey.e eVar = ey.f.Companion;
                eVar.getClass();
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Set set = inputData.e;
                vc.s.k(set);
                LinkedHashSet validators = dw3.l.h(dVar2, set, (dx.l) dVar.f130495l.get(), bVar4.f);
                xv.d framesProvider = (xv.d) dVar.f130502t.get();
                LifecycleOwner lifecycleOwner = (LifecycleOwner) dVar.f130496m.get();
                iy.b experimentsInteractor = ((ey.b) dVar.L).f130481h.a();
                eVar.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor, "experimentsInteractor");
                boolean zA = experimentsInteractor.a(px.a.f240490a);
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(validators, "validators");
                Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
                Intrinsics.checkNotNullParameter(validators, "validators");
                Intrinsics.checkNotNullParameter(framesProvider, "framesProvider");
                Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
                od0.a aVar3 = od0.a.f224253a;
                return (od0.a.i() || zA) ? new nx.b(new kl.b0(framesProvider), (f0) new eki.e(1, 2, LifecycleOwnerKt.class, lifecycleOwner, "lifecycleScope", "getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;")) : new ix.b(validators, new kl.b0(framesProvider), LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), imageFormatConverter, new fx.d(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)));
            case 6:
                dx.m mVar = (dx.m) dVar.k.get();
                dw3.l.u(mVar);
                return mVar;
            case 7:
                return dw3.l.s((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 8:
                return dw3.l.b((sw.d) dVar.f130501s.get());
            case 9:
                tw.a aVarA = bVar.f130480g.a();
                e4m.e eVar2 = dVar.f130496m;
                ey.b bVar5 = (ey.b) dVar.L;
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) eVar2.get();
                PreviewView previewView = (PreviewView) dVar.o.get();
                yw.h hVar2 = (yw.h) dVar.f130500r.get();
                ey.e eVar3 = ey.f.Companion;
                iy.b experimentsInteractor2 = bVar5.f130481h.a();
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(experimentsInteractor2, "experimentsInteractor");
                boolean zA2 = experimentsInteractor2.a(px.a.f240490a);
                f4h.a featuresInteractor = new f4h.a(bVar5.f130478b);
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
                vw.b bVarU = featuresInteractor.u();
                f4h.a featuresInteractor2 = new f4h.a(bVar5.f130478b);
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor2, "featuresInteractor");
                vw.c cVarR = featuresInteractor2.r();
                f4h.a featuresInteractor3 = new f4h.a(bVar5.f130478b);
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor3, "featuresInteractor");
                vw.d dVarJ = featuresInteractor3.j();
                f4h.a featuresInteractor4 = new f4h.a(bVar5.f130478b);
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor4, "featuresInteractor");
                return dw3.l.d(aVarA, lifecycleOwner2, previewView, hVar2, zA2, bVarU, cVarR, dVarJ, featuresInteractor4.g());
            case 10:
                return wy.d.a();
            case 11:
                return dw3.l.t((CameraKitPreviewView) dVar.f130497n.get());
            case 12:
                return dw3.l.f((com.revolut.kompot.navigable.a) dVar.f130493h.get());
            case 13:
                yw.f impl = (yw.f) dVar.f130499q.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                vc.s.k(impl);
                return impl;
            case 14:
                fy.a factory2 = (fy.a) dVar.f130498p.get();
                ly.c cVar = ((ey.b) dVar.L).f130478b;
                f4h.a featuresInteractor5 = new f4h.a(cVar);
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(featuresInteractor5, "featuresInteractor");
                yw.e photoResolution = yw.e.HD;
                factory2.getClass();
                Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                yw.a cameraLens = yw.a.BACK;
                CameraKitClientSettings cameraKitClientSettings = factory2.f138839a;
                yw.e videoResolution = hy.e.a(cameraKitClientSettings);
                yw.e previewResolution = yw.e.FHD;
                CameraCaptureSettings cameraCaptureSettings = cameraKitClientSettings.f50706a;
                yw.d cameraPreset = new yw.d(new yw.c(hy.a.a(cameraCaptureSettings), hy.b.a(cameraCaptureSettings), hy.a.b(cameraCaptureSettings)), new yw.i(hy.d.a(cameraCaptureSettings), hy.c.a(cameraCaptureSettings)));
                yw.b initialMode = yw.b.COMBINED;
                VideoWatermark videoWatermark = hy.f.a(cameraCaptureSettings);
                Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
                Intrinsics.checkNotNullParameter(videoWatermark, "videoWatermark");
                BiometricVerificationFeature biometricVerificationFeature = cVar.i.f50396j;
                boolean z = false;
                if (biometricVerificationFeature != null) {
                    str = "videoWatermark";
                    if (biometricVerificationFeature.f50390a) {
                        z = true;
                    }
                } else {
                    str = "videoWatermark";
                }
                Intrinsics.checkNotNullParameter(cameraLens, "cameraLens");
                Intrinsics.checkNotNullParameter(videoResolution, "videoResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "analysisResolution");
                Intrinsics.checkNotNullParameter(photoResolution, "photoResolution");
                Intrinsics.checkNotNullParameter(cameraPreset, "cameraPreset");
                Intrinsics.checkNotNullParameter(initialMode, "initialMode");
                Intrinsics.checkNotNullParameter(previewResolution, "previewResolution");
                Intrinsics.checkNotNullParameter(videoWatermark, str);
                return new yw.f(cameraLens, videoResolution, photoResolution, photoResolution, cameraPreset, initialMode, previewResolution, videoWatermark, z);
            case 15:
                CameraKitClientSettings cameraKitClientSettings2 = dVar.e;
                Intrinsics.checkNotNullParameter(cameraKitClientSettings2, "cameraKitClientSettings");
                return new fy.a(cameraKitClientSettings2);
            case 16:
                return dw3.l.e(bVar.i);
            case 17:
                nv.a aVar4 = bVar.i;
                e4m.e eVar4 = dVar.f130503w;
                ey.b bVar6 = (ey.b) dVar.L;
                dv.m mVar2 = (dv.m) eVar4.get();
                xv.c cVar2 = (xv.c) dVar.f130504x.get();
                CameraKitClientSettings cameraKitClientSettings3 = dVar.e;
                xv.h hVar3 = (xv.h) dVar.u.get();
                LifecycleOwner lifecycleOwner3 = (LifecycleOwner) dVar.f130496m.get();
                CameraKitUiSettings cameraKitUiSettings = dVar.f130492g;
                pv.a aVar5 = (pv.a) dVar.v.get();
                ww.b bVar7 = (ww.b) dVar.f130505y.get();
                dx.m mVar3 = (dx.m) dVar.k.get();
                fv.e eVar5 = bVar.f130482j;
                yw.h hVar4 = (yw.h) dVar.z.get();
                ey.e eVar6 = ey.f.Companion;
                f4h.a featuresInteractor6 = new f4h.a(bVar6.f130478b);
                eVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor6, "featuresInteractor");
                vw.b bVarU2 = featuresInteractor6.u();
                f4h.a featuresInteractor7 = new f4h.a(bVar6.f130478b);
                eVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor7, "featuresInteractor");
                vw.c cVarR2 = featuresInteractor7.r();
                f4h.a featuresInteractor8 = new f4h.a(bVar6.f130478b);
                eVar6.getClass();
                Intrinsics.checkNotNullParameter(featuresInteractor8, "featuresInteractor");
                return dw3.l.c(aVar4, mVar2, cVar2, cameraKitClientSettings3, hVar3, lifecycleOwner3, cameraKitUiSettings, aVar5, bVar7, mVar3, eVar5, hVar4, bVarU2, cVarR2, featuresInteractor8.j());
            case 18:
                return dw3.l.g(bVar.i, dVar.f, dVar.f130492g);
            case 19:
                return dw3.l.a((sw.d) dVar.f130501s.get());
            case 20:
                return dw3.l.r((sw.d) dVar.f130501s.get());
            case 21:
                yw.h impl2 = (yw.h) dVar.f130500r.get();
                Intrinsics.checkNotNullParameter(impl2, "impl");
                vc.s.k(impl2);
                return impl2;
            case 22:
                return dw3.l.q((sw.d) dVar.f130501s.get());
            case 23:
                return dw3.l.k((sw.d) dVar.f130501s.get());
            case 24:
                yy.c cVar3 = (yy.c) dVar.D.get();
                yf6.b.h(cVar3);
                return cVar3;
            case 25:
                fz.b bVar8 = new fz.b((fz.c) dVar.H.get(), (com.revolut.kompot.navigable.a) dVar.f130493h.get());
                gsi.d.i(bVar8);
                return bVar8;
            case 26:
                return wpg.v.k((LifecycleOwner) dVar.f130496m.get());
            case 27:
                uy.a aVar6 = new uy.a();
                dv.a aVar7 = (dv.a) dVar.A.get();
                xv.h hVar5 = (xv.h) dVar.u.get();
                vy.a aVar8 = dVar.d;
                py.d dVarB2 = bVar.f130480g.b();
                vc.s.j(dVarB2);
                yy.c cVar4 = (yy.c) dVar.D.get();
                dz.a aVar9 = new dz.a();
                ty.h hVar6 = new ty.h();
                ty.i iVar = new ty.i();
                qd0.b bVarN = ((ey.b) dVar.L).f130479c.n();
                vc.s.j(bVarN);
                return new com.revolut.camerakit.revolut.ui.flow.steps.camera.a(aVar6, aVar7, hVar5, aVar8, dVarB2, cVar4, aVar9, hVar6, iVar, new zy.f(new c0(bVarN, new ez.a())), (cli.n) dVar.J.get());
            case 28:
                qy.a aVar10 = (qy.a) bVar.f130483l.get();
                vy.a aVar11 = dVar.d;
                qd0.b bVarN2 = bVar.f130479c.n();
                vc.s.j(bVarN2);
                return new sy.c0(aVar10, aVar11, bVarN2);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object l() {
        eya.j jVar = (eya.j) this.f124106b;
        eya.a aVar = (eya.a) this.d;
        eya.j jVar2 = aVar.f130607b;
        int i = this.f124107c;
        if (i == 0) {
            cya.f fVar = (cya.f) aVar.f130608c.get();
            ewg.w.C(fVar);
            return fVar;
        }
        if (i == 1) {
            return new cya.f(((s41.a) jVar.f130639g).d());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        AllReferralsScreenContract$InputData allReferralsScreenContract$InputData = aVar.f130606a;
        wwa.b bVarA = jVar.f130640h.a();
        vc.s.j(bVarA);
        r10.t tVar = new r10.t(bVarA, new tya.j(jVar.e.a(), jVar.a()));
        jxa.j jVar3 = new jxa.j();
        wwa.b bVarA2 = jVar2.f130640h.a();
        vc.s.j(bVarA2);
        jya.d dVar = new jya.d(bVarA2);
        gte.a aVarB = jVar.i.b();
        vc.s.j(aVarB);
        return new com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.all.b(allReferralsScreenContract$InputData, tVar, jVar3, dVar, aVarB, new cya.g(), (cya.f) aVar.f130608c.get(), new xya.t(aVar.f130606a, new tya.h(new rya.v(jVar2.a()), jVar2.a()), jVar2.a()));
    }

    private final Object m() {
        eya.b bVar = (eya.b) this.d;
        eya.j jVar = (eya.j) this.f124106b;
        cri.b bVar2 = jVar.f130639g;
        l70.e eVar = jVar.f;
        int i = this.f124107c;
        if (i == 0) {
            Object extension = (cya.k) bVar.d.get();
            eya.q.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            r70.c cVarA = eVar.A();
            vc.s.j(cVarA);
            c70.a aVarZ = eVar.z();
            vc.s.j(aVarZ);
            return new cya.l(cVarA, aVarZ, (iki.c) bVar.f130611c.get());
        }
        if (i == 2) {
            z70.a contextProvider = eVar.f();
            vc.s.j(contextProvider);
            eya.q.Companion.getClass();
            Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
            return new iki.c(contextProvider.getContext());
        }
        if (i == 3) {
            cya.f fVar = (cya.f) bVar.f.get();
            ewg.w.C(fVar);
            return fVar;
        }
        if (i == 4) {
            return new cya.f(((s41.a) bVar2).d());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData = bVar.f130609a;
        l80.e eVarH = eVar.h();
        vc.s.j(eVarH);
        wwa.b bVarA = jVar.f130640h.a();
        vc.s.j(bVarA);
        nya.o0 o0Var = new nya.o0();
        n5j.i iVar = (n5j.i) jVar.d.f181515b.get();
        vc.s.j(iVar);
        jxa.f fVar2 = new jxa.f();
        gte.a aVarB = jVar.i.b();
        vc.s.j(aVarB);
        cya.g gVar = new cya.g();
        cya.h hVar = new cya.h();
        cya.k kVar = (cya.k) bVar.d.get();
        wli.x xVarD = ((s41.a) bVar2).d();
        cya.f fVar3 = (cya.f) bVar.f.get();
        jxa.h hVar2 = new jxa.h();
        jxa.i iVar2 = new jxa.i();
        jxa.g gVar2 = new jxa.g();
        mya.a aVar = new mya.a();
        eya.j jVar2 = bVar.f130610b;
        jxa.a aVar2 = jVar2.e;
        pqi.a aVar3 = jVar2.f130641j;
        kl.c0 c0Var = new kl.c0(new mya.g(new cya.b(new tya.j(aVar2.a(), new tya.c((cya.i) jVar2.f130646q.get())))));
        mya.o oVar = new mya.o();
        mya.m mVar = new mya.m();
        mya.d dVar = new mya.d();
        mya.h hVar3 = new mya.h();
        mya.j jVar3 = new mya.j();
        mya.l lVar = new mya.l(aVar3.g());
        mya.e eVar2 = new mya.e();
        mya.c cVar = new mya.c(aVar3.g());
        InviteCampaignHomeControllerContract$InputData inviteCampaignHomeControllerContract$InputData2 = bVar.f130609a;
        gte.a aVarB2 = jVar2.i.b();
        vc.s.j(aVarB2);
        return new com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d(inviteCampaignHomeControllerContract$InputData, eVarH, bVarA, o0Var, iVar, fVar2, aVarB, gVar, hVar, kVar, xVarD, fVar3, hVar2, iVar2, gVar2, new nya.n0(aVar, c0Var, oVar, mVar, dVar, hVar3, jVar3, lVar, eVar2, cVar, inviteCampaignHomeControllerContract$InputData2, aVarB2));
    }

    private final Object n() {
        eya.c cVar = (eya.c) this.d;
        eya.j jVar = cVar.f130615b;
        eya.j jVar2 = (eya.j) this.f124106b;
        vwa.b bVar = jVar2.f130640h;
        int i = this.f124107c;
        if (i != 0) {
            if (i != 1) {
                throw new AssertionError(i);
            }
            com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) cVar.f130616c.get();
            qya.b.Companion.getClass();
            Intrinsics.checkNotNullParameter(controller, "controller");
            return new c90.c(controller.m2());
        }
        InvitesDetailsContract$InputData invitesDetailsContract$InputData = cVar.f130614a;
        wwa.b bVarA = bVar.a();
        vc.s.j(bVarA);
        hg0.p pVar = (hg0.p) jVar2.k.P.get();
        vc.s.j(pVar);
        wli.x xVarD = ((s41.a) jVar2.f130639g).d();
        com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) jVar.e.f179098c).c();
        vc.s.j(aVarC);
        gya.c cVar2 = new gya.c(new jxa.l(aVarC, 0));
        wwa.f fVar = (wwa.f) bVar.f292679r.get();
        vc.s.j(fVar);
        InvitesDetailsContract$InputData invitesDetailsContract$InputData2 = cVar.f130614a;
        wwa.b bVarA2 = jVar.f130640h.a();
        vc.s.j(bVarA2);
        jx0.a aVar = new jx0.a(invitesDetailsContract$InputData2, bVarA2);
        jxa.a aVar2 = jVar2.e;
        jxa.c cVar3 = new jxa.c();
        jxa.e eVarA = aVar2.a();
        jxa.f fVar2 = new jxa.f();
        jxa.i iVar = new jxa.i();
        cya.h hVar = new cya.h();
        cya.g gVar = new cya.g();
        gte.a aVarB = jVar2.i.b();
        vc.s.j(aVarB);
        jxa.e eVarA2 = jVar.e.a();
        InvitesDetailsContract$InputData invitesDetailsContract$InputData3 = cVar.f130614a;
        pya.c0 c0Var = new pya.c0((c90.c) cVar.d.get());
        gte.a aVarB2 = jVar.i.b();
        vc.s.j(aVarB2);
        return new com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.a(invitesDetailsContract$InputData, bVarA, pVar, xVarD, cVar2, fVar, aVar, cVar3, eVarA, fVar2, iVar, hVar, gVar, aVarB, new a0(eVarA2, invitesDetailsContract$InputData3, c0Var, aVarB2, new jxa.c()));
    }

    private final Object o() {
        eya.j jVar = (eya.j) this.f124106b;
        l70.e eVar = jVar.f;
        eya.d dVar = (eya.d) this.d;
        eya.j jVar2 = dVar.f130618b;
        int i = this.f124107c;
        if (i == 0) {
            Object extension = (cya.k) dVar.d.get();
            eya.q.Companion.getClass();
            Intrinsics.checkNotNullParameter(extension, "extension");
            yji.n nVar = (yji.n) extension;
            vc.s.k(nVar);
            return nVar;
        }
        if (i == 1) {
            r70.c cVarA = eVar.A();
            vc.s.j(cVarA);
            c70.a aVarZ = eVar.z();
            vc.s.j(aVarZ);
            return new cya.l(cVarA, aVarZ, (iki.c) dVar.f130619c.get());
        }
        if (i == 2) {
            z70.a contextProvider = eVar.f();
            vc.s.j(contextProvider);
            eya.q.Companion.getClass();
            Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
            return new iki.c(contextProvider.getContext());
        }
        if (i == 3) {
            cya.f fVar = (cya.f) dVar.f.get();
            ewg.w.C(fVar);
            return fVar;
        }
        if (i == 4) {
            return new cya.f(((s41.a) jVar.f130639g).d());
        }
        if (i != 5) {
            throw new AssertionError(i);
        }
        InvitesListContract$InputData invitesListContract$InputData = dVar.f130617a;
        wwa.b bVarA = jVar.f130640h.a();
        vc.s.j(bVarA);
        wwa.b bVarA2 = jVar2.f130640h.a();
        vc.s.j(bVarA2);
        jya.d dVar2 = new jya.d(bVarA2);
        gte.a aVarB = jVar.i.b();
        vc.s.j(aVarB);
        return new com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.a(invitesListContract$InputData, bVarA, dVar2, aVarB, new cya.g(), (cya.k) dVar.d.get(), (cya.f) dVar.f.get(), new com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.b(dVar.f130617a, new cya.b(new tya.j(jVar2.e.a(), dVar.b())), new com.revolut.feature.referrals.shared.ui.impl.ui.invites_list.c(), new rya.a(dVar.f130617a, dVar.b()), new tya.h(new rya.v(dVar.b()), dVar.b()), dVar.b()));
    }

    private final Object p() {
        eya.f fVar = (eya.f) this.d;
        eya.j jVar = (eya.j) this.f124106b;
        int i = this.f124107c;
        if (i == 0) {
            zja.a aVarA = ((ika.b) jVar.f130638c).a();
            vc.s.j(aVarA);
            n5j.i iVar = (n5j.i) jVar.d.f181515b.get();
            vc.s.j(iVar);
            return new com.revolut.feature.referrals.shared.ui.impl.ui.referrals_flow.e(aVarA, iVar, (f01.a) fVar.e.get(), fVar.f130625a, new jxa.j(), new jxa.b());
        }
        if (i != 1) {
            throw new AssertionError(i);
        }
        com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) fVar.d.get();
        bza.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        return new f01.c(controller.m2());
    }

    private final Object q() {
        eya.j jVar = (eya.j) this.f124106b;
        cri.b bVar = jVar.f130639g;
        eya.g gVar = (eya.g) this.d;
        eya.j jVar2 = gVar.f130629b;
        int i = this.f124107c;
        if (i == 0) {
            cya.f fVar = (cya.f) gVar.f130630c.get();
            ewg.w.C(fVar);
            return fVar;
        }
        if (i == 1) {
            return new cya.f(((s41.a) bVar).d());
        }
        if (i != 2) {
            throw new AssertionError(i);
        }
        wya.r rVar = new wya.r(gVar.f130628a, new cya.b(new tya.j(jVar2.e.a(), new tya.c((cya.i) jVar2.f130646q.get()))), new rya.v(new tya.c((cya.i) jVar2.f130646q.get())), new tya.c((cya.i) jVar2.f130646q.get()));
        gte.a aVarB = jVar.i.b();
        vc.s.j(aVarB);
        wwa.b bVarA = jVar.f130640h.a();
        vc.s.j(bVarA);
        return new com.revolut.feature.referrals.shared.ui.impl.ui.referral_troubleshooter.a(rVar, aVarB, bVarA, new g2e.t(new kya.b((ue0.c) jVar2.f130645p.get(), (ReferralsTroubleshooterService) jVar2.f130647r.get(), (ne0.j) jVar2.o.get())), ((s41.a) bVar).d(), new cya.g(), (cya.f) gVar.f130630c.get(), gVar.f130628a);
    }

    private final Object r() {
        eya.h hVar = (eya.h) this.d;
        int i = this.f124107c;
        if (i == 0) {
            return new cza.g((cli.n) hVar.f130633c.get(), hVar.f130631a, ((s41.a) ((eya.j) this.f124106b).f130639g).d());
        }
        if (i == 1) {
            return new cza.i(new mya.l(hVar.f130632b.f130641j.g()), new mya.o());
        }
        throw new AssertionError(i);
    }

    @Override // phm.a
    public final Object get() {
        Object xVar;
        Object dVar;
        int i = this.f124105a;
        int i2 = this.f124107c;
        Object obj2 = this.d;
        Object obj3 = this.f124106b;
        switch (i) {
            case 0:
                o oVar = (o) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new cb2.h();
                    }
                    throw new AssertionError(i2);
                }
                cb2.d dVar2 = oVar.f124103b;
                vw1.b bVarC = ((lz1.m) ((h) obj3).f124071a).c();
                vc.s.j(bVarC);
                h hVar = oVar.f124104c;
                vw1.b bVarC2 = ((lz1.m) hVar.f124071a).c();
                vc.s.j(bVarC2);
                wj0.a aVarI = ((nj0.d) hVar.e).i();
                vc.s.j(aVarI);
                return new cb2.m(dVar2, bVarC, new r10.w(bVarC2, aVarI), (cli.n) oVar.d.get());
            case 1:
                h hVar2 = (h) obj3;
                r rVar = (r) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new bb2.u();
                        }
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller = (com.revolut.kompot.navigable.a) rVar.f124113c.get();
                    gb2.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller, "controller");
                    return x0.a(rp0.g1.Companion, controller.D2());
                }
                vw1.b bVarC3 = ((lz1.m) hVar2.f124071a).c();
                vc.s.j(bVarC3);
                wj0.a aVarI2 = ((nj0.d) hVar2.e).i();
                vc.s.j(aVarI2);
                h hVar3 = rVar.f124112b;
                vw1.b bVarC4 = ((lz1.m) hVar3.f124071a).c();
                vc.s.j(bVarC4);
                wj0.a aVarI3 = ((nj0.d) hVar3.e).i();
                vc.s.j(aVarI3);
                r10.w wVar = new r10.w(bVarC4, aVarI3);
                c70.a aVarZ = hVar2.d.z();
                vc.s.j(aVarZ);
                return new com.revolut.feature.apm.payid.impl.screen.settings.a(bVarC3, aVarI2, wVar, aVarZ, (rp0.g1) rVar.d.get(), new eb2.l(), new eb2.a(), (cli.n) rVar.e.get());
            case 2:
                h hVar4 = (h) obj3;
                r rVar2 = (r) obj2;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return new bb2.u();
                        }
                        throw new AssertionError(i2);
                    }
                    com.revolut.kompot.navigable.a controller2 = (com.revolut.kompot.navigable.a) rVar2.f124113c.get();
                    gb2.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter(controller2, "controller");
                    return x0.a(rp0.g1.Companion, controller2.D2());
                }
                vw1.b bVarC5 = ((lz1.m) hVar4.f124071a).c();
                vc.s.j(bVarC5);
                wj0.a aVarI4 = ((nj0.d) hVar4.e).i();
                vc.s.j(aVarI4);
                h hVar5 = rVar2.f124112b;
                vw1.b bVarC6 = ((lz1.m) hVar5.f124071a).c();
                vc.s.j(bVarC6);
                wj0.a aVarI5 = ((nj0.d) hVar5.e).i();
                vc.s.j(aVarI5);
                r10.w wVar2 = new r10.w(bVarC6, aVarI5);
                c70.a aVarZ2 = hVar4.d.z();
                vc.s.j(aVarZ2);
                return new com.revolut.feature.apm.payid.impl.screen.settings.a(bVarC5, aVarI4, wVar2, aVarZ2, (rp0.g1) rVar2.d.get(), new eb2.l(), new eb2.a(), (cli.n) rVar2.e.get());
            case 3:
                ede.e eVar = (ede.e) obj3;
                tz2.d dVar3 = eVar.e;
                ede.d dVar4 = (ede.d) obj2;
                if (i2 == 0) {
                    return kxa.j.k((j60.a) dVar4.e.get());
                }
                if (i2 == 1) {
                    return ehe.n.s((com.revolut.kompot.navigable.a) dVar4.f125004c.get(), (rp0.m) dVar4.d.get());
                }
                if (i2 == 2) {
                    return new rp0.m();
                }
                if (i2 != 3) {
                    throw new AssertionError(i2);
                }
                CardDeliveryDetailsContract$InputData cardDeliveryDetailsContract$InputData = dVar4.f125002a;
                ede.e eVar2 = dVar4.f125003b;
                l70.e eVar3 = eVar2.f125007b;
                l80.e eVarH = eVar3.h();
                vc.s.j(eVarH);
                gte.a aVarB = eVar2.f125006a.b();
                vc.s.j(aVarB);
                oee.c cVar = new oee.c(aVarB, eVarH);
                l80.e eVarH2 = eVar3.h();
                vc.s.j(eVarH2);
                ha3.o oVar2 = (ha3.o) eVar2.f125008c.G.get();
                vc.s.j(oVar2);
                nee.g gVar = new nee.g(cVar, new oee.g(eVarH2, oVar2));
                l80.e eVarH3 = eVar3.h();
                vc.s.j(eVarH3);
                qee.s sVar = new qee.s(gVar, eVarH3);
                z6l.s sVarE = eVar.d.e();
                uz2.b bVar = (uz2.b) dVar3.f275756j.get();
                vc.s.j(bVar);
                l93.e eVar4 = (l93.e) eVar.f125008c.I.get();
                vc.s.j(eVar4);
                ang.f fVarE = eVar.f.e();
                yf.c cVarA = eVar.f125009g.a();
                az2.b bVarA = dVar3.a();
                vc.s.j(bVarA);
                return new com.revolut.feature.support.impl.ui.troubleshooting.carddelivery.kompot.a(cardDeliveryDetailsContract$InputData, sVar, sVarE, bVar, eVar4, fVarE, cVarA, bVarA, (j60.a) dVar4.e.get(), new qee.v(), new qee.u());
            case 4:
                ee6.e eVar5 = (ee6.e) obj3;
                ee6.d dVar5 = (ee6.d) obj2;
                switch (i2) {
                    case 0:
                        return kpi.f.a();
                    case 1:
                        Context contextI = bq.i.i(dVar5.f125090a);
                        BaseDelegatesActivity baseDelegatesActivityF = bq.i.f(dVar5.f125090a);
                        t70.g gVarO = eVar5.f125100a.o();
                        vc.s.j(gVarO);
                        return new npi.c(contextI, baseDelegatesActivityF, gVarO);
                    case 2:
                        return new tpi.i((rpi.c) dVar5.e.get(), gsi.c.a(dVar5.f125090a));
                    case 3:
                        return new rpi.b(bq.i.b(dVar5.f125090a));
                    case 4:
                        return new rpi.h(bq.i.b(dVar5.f125090a));
                    case 5:
                        return new iri.g((iri.j) eVar5.f125104h.get(), (iri.m) eVar5.i.get(), bq.i.f(dVar5.f125090a), bq.i.l(dVar5.f125090a));
                    case 6:
                        return new iri.l((iri.m) eVar5.i.get(), bq.i.f(dVar5.f125090a), (iri.d) dVar5.i.get());
                    case 7:
                        return new iri.d(bq.i.f(dVar5.f125090a));
                    case 8:
                        return new opi.b(bq.i.f(dVar5.f125090a));
                    case 9:
                        dVar5.getClass();
                        jqi.c cVar2 = jqi.d.Companion;
                        return new jqi.b(bq.i.b(dVar5.f125090a));
                    case 10:
                        return new k3l.d(bq.i.b(dVar5.f125090a));
                    case 11:
                        return new aqi.d(bq.i.b(dVar5.f125090a), new y80.b());
                    case 12:
                        sri.m mVarL = bq.i.l(dVar5.f125090a);
                        ge6.l lVar = (ge6.l) eVar5.f125105j.get();
                        vil.g gVar2 = (vil.g) ((ljl.q0) dVar5.f125091b.d).l0.get();
                        vc.s.j(gVar2);
                        ge6.h hVar6 = new ge6.h(gVar2);
                        jqi.e eVar6 = (jqi.e) dVar5.f125096l.get();
                        k3l.b bVar2 = (k3l.b) dVar5.f125097m.get();
                        tpi.j jVar = (tpi.j) dVar5.f.get();
                        f9b.f fVar = (f9b.f) dVar5.o.get();
                        tri.c cVarE = bq.i.e(dVar5.f125090a);
                        s70.a aVarM = eVar5.f125100a.m();
                        vc.s.j(aVarM);
                        til.m mVarA = eVar5.e.a();
                        vc.s.j(mVarA);
                        return new ge6.v(mVarL, lVar, hVar6, eVar6, bVar2, jVar, fVar, cVarE, aVarM, mVarA);
                    case 13:
                        return bq.i.t(dVar5.f125090a);
                    default:
                        throw new AssertionError(i2);
                }
            case 5:
                ehe.c cVar3 = (ehe.c) obj3;
                ehe.a aVar = (ehe.a) obj2;
                q1 q1Var = q1.f288981a;
                switch (i2) {
                    case 0:
                        CoroutineScope coroutineScope = (CoroutineScope) aVar.d.get();
                        xge.a aVar2 = (xge.a) aVar.z.get();
                        e2 e2Var = (e2) aVar.f125936h.get();
                        z2 z2Var = (z2) aVar.B.get();
                        bn2.p pVarC = cVar3.I.c();
                        o1 o1Var = (o1) aVar.C.get();
                        fhe.a aVarA = hhe.c.a();
                        ImmutableMap immutableMapM = aVar.m();
                        ssi.o oVarC = cVar3.E.c();
                        vc.s.j(oVarC);
                        ash.i iVarI = ((tc7.d) cVar3.J).i();
                        vc.s.j(iVarI);
                        skd.i iVarC = cVar3.K.c();
                        i49.a aVar3 = (i49.a) cVar3.L.f202679b.get();
                        vc.s.j(aVar3);
                        v1 v1Var = new v1((xge.a) aVar.z.get(), aVar.m());
                        l1 l1Var = new l1(aVar.f125933b.f125991s.i());
                        r10.d dVarE = ((zc6.a) cVar3.M).e();
                        w2 dependencies = aVar.f125932a;
                        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
                        xVar = new x(coroutineScope, aVar2, e2Var, z2Var, pVarC, o1Var, aVarA, immutableMapM, oVarC, iVarI, iVarC, aVar3, v1Var, l1Var, dVarE, (vie.g) dependencies.f13499b);
                        return xVar;
                    case 1:
                        hhe.b.Companion.getClass();
                        return rd0.e.a(p0.f264002b);
                    case 2:
                        e4m.e eVar7 = aVar.d;
                        ehe.c cVar4 = aVar.f125933b;
                        CoroutineScope coroutineScope2 = (CoroutineScope) eVar7.get();
                        e2 e2Var2 = (e2) aVar.f125936h.get();
                        lge.j jVar2 = new lge.j();
                        lge.h hVar7 = new lge.h(cVar4.f125983m.e(), ((blb.e) cVar4.f125982l).e());
                        su9.c cVar5 = new su9.c(new tul.b((b0) aVar.i.get()), (b0) aVar.i.get());
                        b0 b0Var = (b0) aVar.i.get();
                        xge.j jVar3 = (xge.j) aVar.k.get();
                        y2 y2VarN = aVar.n();
                        s0 s0Var = (s0) aVar.u.get();
                        u3 u3Var = (u3) aVar.f125948y.get();
                        usc.a decorator = new usc.a((e2) aVar.f125936h.get());
                        Intrinsics.checkNotNullParameter(decorator, "decorator");
                        i0 i0Var = (i0) aVar.f125937j.get();
                        z zVar = new z(cVar4.f125991s.i());
                        xge.n nVar = new xge.n(aVar.h());
                        gte.a aVarB2 = cVar3.v.b();
                        vc.s.j(aVarB2);
                        return new xge.g(coroutineScope2, e2Var2, jVar2, hVar7, cVar5, b0Var, jVar3, y2VarN, s0Var, u3Var, decorator, i0Var, q1Var, zVar, nVar, aVarB2);
                    case 3:
                        ne0.j jVar4 = (ne0.j) aVar.e.get();
                        mk0.a aVarA2 = cVar3.f125971c.a();
                        vc.s.j(aVarA2);
                        return new t2(jVar4, aVarA2, TabAccountsMode.Credit.f89462a, (x1) aVar.f125935g.get());
                    case 4:
                        hhe.b.Companion.getClass();
                        return new ne0.d();
                    case 5:
                        return new c2((ue0.c) aVar.f.get(), (Map) cVar3.f125994t0.get(), aVar.h());
                    case 6:
                        TabAccountsMode.Credit credit = TabAccountsMode.Credit.f89462a;
                        an0.c cVar6 = cVar3.d;
                        ee0.a aVar4 = cVar3.e;
                        yk0.a aVarB3 = cVar6.b();
                        vc.s.j(aVarB3);
                        je0.d dVarD = aVar4.d();
                        vc.s.j(dVarD);
                        xe0.f fVarF = aVar4.f();
                        vc.s.j(fVarF);
                        return h7d.a.t(credit, aVarB3, dVarD, fVarF);
                    case 7:
                        mk0.a aVarA3 = cVar3.f125971c.a();
                        vc.s.j(aVarA3);
                        return new g0(aVarA3, TabAccountsMode.Credit.f89462a);
                    case 8:
                        CoroutineScope coroutineScope3 = (CoroutineScope) aVar.d.get();
                        i0 i0Var2 = (i0) aVar.f125937j.get();
                        Map map = (Map) aVar.f125933b.A0.get();
                        w2 dependencies2 = aVar.f125932a;
                        Intrinsics.checkNotNullParameter(dependencies2, "dependencies");
                        return new xge.j(coroutineScope3, i0Var2, new xge.u(map, (rfe.e) dependencies2.e));
                    case 9:
                        return new i0();
                    case 10:
                        return new t0(cVar3.f125988q.b(), cVar3.f125989r.a(), (u3) aVar.f125948y.get());
                    case 11:
                        return new u3((c1) aVar.f125939m.get(), (yge.a) aVar.f125947x.get());
                    case 12:
                        CoroutineScope coroutineScope4 = (CoroutineScope) aVar.d.get();
                        n0 n0Var = (n0) aVar.f125938l.get();
                        ImmutableMap.Builder builderBuilderWithExpectedSize = ImmutableMap.builderWithExpectedSize(13);
                        ProductId productId = ProductId.CURRENCY;
                        ehe.c cVar7 = aVar.f125933b;
                        builderBuilderWithExpectedSize.put(productId, cVar7.B0.get());
                        builderBuilderWithExpectedSize.put(ProductId.ON_HOLD, cVar7.C0.get());
                        builderBuilderWithExpectedSize.put(ProductId.YOUTH, cVar7.D0.get());
                        builderBuilderWithExpectedSize.put(ProductId.TEEN, cVar7.E0.get());
                        builderBuilderWithExpectedSize.put(ProductId.SUBACCOUNT, cVar7.F0.get());
                        builderBuilderWithExpectedSize.put(ProductId.SAVINGS, cVar7.G0.get());
                        builderBuilderWithExpectedSize.put(ProductId.CREDIT, cVar7.H0.get());
                        builderBuilderWithExpectedSize.put(ProductId.CREDIT_HUB, cVar7.I0.get());
                        builderBuilderWithExpectedSize.put(ProductId.LINKED, cVar7.J0.get());
                        builderBuilderWithExpectedSize.put(ProductId.PRO, cVar7.K0.get());
                        builderBuilderWithExpectedSize.put(ProductId.JOINT, cVar7.L0.get());
                        builderBuilderWithExpectedSize.put(ProductId.BEREAVEMENT, cVar7.M0.get());
                        builderBuilderWithExpectedSize.put(ProductId.TOTAL_WEALTH, aVar.f125946w.get());
                        return new g1(coroutineScope4, n0Var, p1.f288972a, builderBuilderWithExpectedSize.build());
                    case 13:
                        return new q0(cVar3.f125983m.e(), cVar3.f125991s.i());
                    case 14:
                        gte.a aVarB4 = cVar3.v.b();
                        vc.s.j(aVarB4);
                        return new w(aVarB4, e4m.b.a(aVar.v), new jhe.x(), cVar3.D.b());
                    case 15:
                        e4m.e eVar8 = aVar.d;
                        ehe.c cVar8 = aVar.f125933b;
                        CoroutineScope coroutineScope5 = (CoroutineScope) eVar8.get();
                        ahe.b bVar3 = (ahe.b) aVar.f125940n.get();
                        ahe.e eVar9 = (ahe.e) aVar.o.get();
                        jhe.b bVar4 = new jhe.b();
                        g6e.b bVarA2 = cVar8.f126000y.a();
                        vc.s.j(bVarA2);
                        jhe.a aVar5 = new jhe.a(bVar4, bVarA2);
                        ImmutableMap.Builder builderBuilderWithExpectedSize2 = ImmutableMap.builderWithExpectedSize(7);
                        yfe.a aVar6 = yfe.a.Cash;
                        g6e.b bVarA3 = ((yy5.b) cVar8.f125993t).B.a();
                        vc.s.j(bVarA3);
                        builderBuilderWithExpectedSize2.put(aVar6, new vy5.b(bVarA3));
                        yfe.a aVar7 = yfe.a.Credit;
                        yfe.b bVar5 = (yfe.b) ((t15.d) cVar8.f125978h).W.get();
                        vc.s.j(bVar5);
                        builderBuilderWithExpectedSize2.put(aVar7, bVar5);
                        yfe.a aVar8 = yfe.a.Joint;
                        yfe.b bVar6 = (yfe.b) ((q38.b) cVar8.f125984n).N.get();
                        vc.s.j(bVar6);
                        builderBuilderWithExpectedSize2.put(aVar8, bVar6);
                        yfe.a aVar9 = yfe.a.Savings;
                        yfe.b bVar7 = (yfe.b) ((fob.a) cVar8.k).X.get();
                        vc.s.j(bVar7);
                        builderBuilderWithExpectedSize2.put(aVar9, bVar7);
                        yfe.a aVar10 = yfe.a.Pro;
                        yfe.b bVar8 = (yfe.b) ((yha.a) cVar8.o).D.get();
                        vc.s.j(bVar8);
                        builderBuilderWithExpectedSize2.put(aVar10, bVar8);
                        yfe.a aVar11 = yfe.a.Youth;
                        yfe.b bVar9 = (yfe.b) ((k78.b) cVar8.i).f181878w0.get();
                        vc.s.j(bVar9);
                        builderBuilderWithExpectedSize2.put(aVar11, bVar9);
                        yfe.a aVar12 = yfe.a.Linked;
                        yfe.b bVar10 = (yfe.b) ((xf6.t) cVar8.z).H0.get();
                        vc.s.j(bVar10);
                        builderBuilderWithExpectedSize2.put(aVar12, bVar10);
                        ImmutableMap immutableMapBuild = builderBuilderWithExpectedSize2.build();
                        ImmutableMap.Builder builderBuilderWithExpectedSize3 = ImmutableMap.builderWithExpectedSize(7);
                        o0 o0Var = (o0) ((yy5.b) cVar8.f125993t).G.get();
                        vc.s.j(o0Var);
                        builderBuilderWithExpectedSize3.put(aVar6, o0Var);
                        o0 o0Var2 = (o0) ((q38.b) cVar8.f125984n).M.get();
                        vc.s.j(o0Var2);
                        builderBuilderWithExpectedSize3.put(aVar8, o0Var2);
                        o0 o0Var3 = (o0) ((fob.a) cVar8.k).W.get();
                        vc.s.j(o0Var3);
                        builderBuilderWithExpectedSize3.put(aVar9, o0Var3);
                        o0 o0Var4 = (o0) ((t15.d) cVar8.f125978h).V.get();
                        vc.s.j(o0Var4);
                        builderBuilderWithExpectedSize3.put(aVar7, o0Var4);
                        o0 o0Var5 = (o0) ((yha.a) cVar8.o).C.get();
                        vc.s.j(o0Var5);
                        builderBuilderWithExpectedSize3.put(aVar10, o0Var5);
                        o0 o0Var6 = (o0) ((k78.b) cVar8.i).f181876v0.get();
                        vc.s.j(o0Var6);
                        builderBuilderWithExpectedSize3.put(aVar11, o0Var6);
                        o0 o0Var7 = (o0) ((xf6.t) cVar8.z).G0.get();
                        vc.s.j(o0Var7);
                        builderBuilderWithExpectedSize3.put(aVar12, o0Var7);
                        ImmutableMap immutableMapBuild2 = builderBuilderWithExpectedSize3.build();
                        wsg.b bVarA4 = cVar3.f125988q.a();
                        ppk.f fVarA = cVar3.f125989r.a();
                        b1 b1Var = (b1) aVar.f125942q.get();
                        yfe.a aVar13 = yfe.a.Crypto;
                        e1 e1Var = (e1) cVar8.A.f144912h.get();
                        vc.s.j(e1Var);
                        xVar = new w0(coroutineScope5, bVar3, eVar9, aVar5, immutableMapBuild, immutableMapBuild2, bVarA4, fVarA, b1Var, ImmutableMap.of(aVar13, (cmh.n) e1Var, yfe.a.Invest, ((mkh.s) cVar8.B).d()), new lge.h(cVar8.f125983m.e(), ((blb.e) cVar8.f125982l).e()), new lge.j(), new jhe.g((mhe.e) aVar.f125943r.get()), q1Var, new t1j.b((e2) aVar.f125936h.get()), (ahe.n) aVar.f125944s.get(), (ahe.f) aVar.f125945t.get(), (s0) aVar.u.get());
                        return xVar;
                    case 16:
                        aVar.getClass();
                        ehe.c cVar9 = aVar.f125933b;
                        ImmutableMap.Builder builderBuilderWithExpectedSize4 = ImmutableMap.builderWithExpectedSize(7);
                        builderBuilderWithExpectedSize4.put(yfe.a.Cash, new phe.a((c1) aVar.f125939m.get(), aVar.o()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Savings, new phe.g((c1) aVar.f125939m.get()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Joint, new phe.e((c1) aVar.f125939m.get(), cVar9.f125998x.c(), aVar.o()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Credit, new phe.c((c1) aVar.f125939m.get()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Pro, new phe.f((c1) aVar.f125939m.get(), aVar.o()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Youth, new phe.i((c1) aVar.f125939m.get(), (xge.j) aVar.k.get(), aVar.o()));
                        builderBuilderWithExpectedSize4.put(yfe.a.Linked, new bhe.a((c1) aVar.f125939m.get()));
                        dVar = new ahe.d(builderBuilderWithExpectedSize4.build(), new ahe.m(cVar9.f125991s.i()), new a1((e2) aVar.f125936h.get(), new tul.b((b0) aVar.i.get())));
                        return dVar;
                    case 17:
                        return new ahe.e();
                    case 18:
                        return new k1((ne0.j) aVar.e.get(), (ue0.c) aVar.f125941p.get(), (Map) cVar3.f125994t0.get());
                    case 19:
                        an0.c cVar10 = cVar3.d;
                        ee0.a aVar14 = cVar3.e;
                        yk0.a databaseSessionProvider = cVar10.b();
                        vc.s.j(databaseSessionProvider);
                        je0.d mapper = aVar14.d();
                        vc.s.j(mapper);
                        xe0.f storageFactory = aVar14.f();
                        vc.s.j(storageFactory);
                        Intrinsics.checkNotNullParameter(databaseSessionProvider, "databaseSessionProvider");
                        Intrinsics.checkNotNullParameter(mapper, "mapper");
                        Intrinsics.checkNotNullParameter(storageFactory, "storageFactory");
                        return xe0.f.c(storageFactory, databaseSessionProvider, "TOTAL_WEALTH_STORAGE", mapper, 5, 16);
                    case 20:
                        Context context = aVar.f125933b.C;
                        hhe.a aVar15 = hhe.b.Companion;
                        aVar15.getClass();
                        Intrinsics.checkNotNullParameter(context, "context");
                        tw0.g1.Companion.getClass();
                        tw0.g1 widgetGridSpec = tw0.b1.a(context);
                        aVar15.getClass();
                        Intrinsics.checkNotNullParameter(widgetGridSpec, "widgetGridSpec");
                        dVar = new mhe.e(widgetGridSpec);
                        return dVar;
                    case 21:
                        mk0.a aVarA4 = cVar3.f125971c.a();
                        vc.s.j(aVarA4);
                        return new ahe.q(aVarA4);
                    case 22:
                        mk0.a aVarA5 = cVar3.f125971c.a();
                        vc.s.j(aVarA5);
                        return new ahe.j(aVarA5);
                    case 23:
                        return new yge.e((CoroutineScope) aVar.d.get(), (e2) aVar.f125936h.get(), (xge.j) aVar.k.get());
                    case 24:
                        CoroutineScope coroutineScope6 = (CoroutineScope) aVar.d.get();
                        e2 e2Var3 = (e2) aVar.f125936h.get();
                        u3 u3Var2 = (u3) aVar.f125948y.get();
                        y2 y2VarN2 = aVar.n();
                        v1 v1Var2 = new v1((xge.a) aVar.z.get(), aVar.m());
                        xge.j jVar5 = (xge.j) aVar.k.get();
                        xge.a aVar16 = (xge.a) aVar.z.get();
                        w2 dependencies3 = aVar.f125932a;
                        Intrinsics.checkNotNullParameter(dependencies3, "dependencies");
                        return new t3(coroutineScope6, e2Var3, u3Var2, y2VarN2, v1Var2, jVar5, aVar16, (vfg.p) dependencies3.f13501g, TabAccountsMode.Credit.f89462a);
                    case 25:
                        ahe.t tVar = (ahe.t) aVar.v.get();
                        jhe.x xVar2 = new jhe.x();
                        mhe.g gVar3 = new mhe.g();
                        ssi.o oVarC2 = cVar3.E.c();
                        vc.s.j(oVarC2);
                        qfe.a aVar17 = (qfe.a) ((rhe.n) cVar3.F).f254441l.get();
                        vc.s.j(aVar17);
                        mhf.b bVarB = ((bjf.a) cVar3.G).b();
                        vc.s.j(bVarB);
                        kge.d dVarB = cVar3.D.b();
                        gte.a aVarB5 = cVar3.v.b();
                        vc.s.j(aVarB5);
                        tzg.m mVarT = cVar3.H.t();
                        vc.s.j(mVarT);
                        return new jhe.t(tVar, xVar2, gVar3, oVarC2, aVar17, bVarB, dVarB, aVarB5, mVarT, new rkg.b());
                    case 26:
                        return new o1((e2) aVar.f125936h.get());
                    case 27:
                        vge.b1 b1Var2 = new vge.b1(aVar.n(), (e2) aVar.f125936h.get(), (vge.d) aVar.D.get());
                        cm2.f fVarB = cVar3.I.b();
                        vc.s.j(fVarB);
                        return new che.c(b1Var2, fVarB, cVar3.I.c());
                    case 28:
                        return new eie.b();
                    default:
                        throw new AssertionError(i2);
                }
            case 6:
                return a();
            case 7:
                elg.c cVar11 = (elg.c) obj2;
                switch (i2) {
                    case 0:
                        return new wkg.f((jki.p) cVar11.f127448b.get(), (zkg.b) cVar11.f127450g.get());
                    case 1:
                        return new wkg.h();
                    case 2:
                        return new zkg.d((blg.a) cVar11.d.get(), (xkg.a) cVar11.e.get(), (wkg.g) cVar11.f.get());
                    case 3:
                        return new blg.a((AtomicApi) cVar11.f127449c.get());
                    case 4:
                        Retrofit retrofit = ((c21.b) ((elg.e) obj3).f127456b).i();
                        vc.s.j(retrofit);
                        ykg.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                        Object objCreate = retrofit.create(AtomicApi.class);
                        Intrinsics.checkNotNullExpressionValue(objCreate, "create(...)");
                        AtomicApi atomicApi = (AtomicApi) objCreate;
                        vc.s.k(atomicApi);
                        return atomicApi;
                    case 5:
                        ykg.a.Companion.getClass();
                        return new xkg.a();
                    case 6:
                        Activity context2 = cVar11.f127447a;
                        ykg.a.Companion.getClass();
                        Intrinsics.checkNotNullParameter(context2, "context");
                        return new wkg.g(context2);
                    default:
                        throw new AssertionError(i2);
                }
            case 8:
                erj.j jVar6 = (erj.j) obj2;
                erj.h hVar8 = (erj.h) obj3;
                ke3.e eVar10 = hVar8.f128694g;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    thf.l lVarF = eVar10.f182973h.f();
                    vc.s.j(lVarF);
                    oe3.b bVar11 = new oe3.b(lVarF, eVar10.i.b());
                    thf.c cVarC = hVar8.f128699n.c();
                    vc.s.j(cVarC);
                    srj.c cVar12 = new srj.c();
                    thf.c cVarC2 = jVar6.f128712b.f128699n.c();
                    vc.s.j(cVarC2);
                    return new rrj.x(bVar11, cVarC, cVar12, new srj.b(cVarC2));
                }
                jki.p pVar = (jki.p) jVar6.f128713c.get();
                CategoryBudgetContract$InputData categoryBudgetContract$InputData = jVar6.f128711a;
                pzi.b bVar12 = (pzi.b) hVar8.z.get();
                ge3.e eVarD = eVar10.d();
                vc.s.j(eVarD);
                ang.f fVarE2 = hVar8.f128696j.e();
                l5i.q qVarB = eVar10.b();
                pzi.a aVar18 = (pzi.a) hVar8.B.get();
                mrj.a aVar19 = (mrj.a) hVar8.F.get();
                l80.e eVarH4 = hVar8.e.h();
                vc.s.j(eVarH4);
                ge3.a aVarE = eVar10.e();
                vc.s.j(aVarE);
                return new rrj.o(pVar, categoryBudgetContract$InputData, bVar12, eVarD, fVarE2, qVarB, aVar18, aVar19, eVarH4, aVarE);
            case 9:
                erj.n nVar2 = (erj.n) obj2;
                UpcomingPaymentsContract$InputData upcomingPaymentsContract$InputData = nVar2.f128726a;
                erj.h hVar9 = (erj.h) obj3;
                ke3.e eVar11 = hVar9.f128694g;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new AssertionError(i2);
                    }
                    erj.h hVar10 = nVar2.f128727b;
                    mae.p factory = hVar10.f128700p.e();
                    vc.s.j(factory);
                    f01.c uikitResources = hVar10.f128701q.g();
                    t70.b currenciesLocalization = hVar10.e.g();
                    vc.s.j(currenciesLocalization);
                    xrj.b.Companion.getClass();
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
                    Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
                    return new wrj.u(upcomingPaymentsContract$InputData, factory.d(uikitResources, currenciesLocalization));
                }
                jki.p pVar2 = (jki.p) nVar2.f128728c.get();
                ppg.b bVarB2 = ((wpg.l) hVar9.f128702r).b();
                vc.s.j(bVarB2);
                l5i.q qVarB2 = eVar11.b();
                xld.f fVar2 = (xld.f) hVar9.f128698m.z0.get();
                vc.s.j(fVar2);
                c9e.c cVarB = hVar9.f128700p.b();
                vc.s.j(cVarB);
                ge3.a aVarE2 = eVar11.e();
                vc.s.j(aVarE2);
                l80.e eVarH5 = hVar9.e.h();
                vc.s.j(eVarH5);
                cl3.a aVarD = hVar9.f128703s.d();
                vc.s.j(aVarD);
                nhf.a aVarA6 = hVar9.f128704t.a();
                vc.s.j(aVarA6);
                return new wrj.l(pVar2, upcomingPaymentsContract$InputData, bVarB2, qVarB2, fVar2, cVarB, aVarE2, eVarH5, aVarD, aVarA6);
            case 10:
                euh.c cVar13 = (euh.c) obj2;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return new ouh.a((iuh.o) ((euh.e) obj3).f129586h.get());
                    }
                    throw new AssertionError(i2);
                }
                BaseQuestionScreenContract$InputData inputData = cVar13.f129570a;
                iuh.b answerValidator = (iuh.b) cVar13.f129572c.get();
                euh.e eVar12 = cVar13.f129571b;
                iuh.l buttonClauseFactory = (iuh.l) eVar12.d.get();
                iuh.m questionSubtitleMapper = (iuh.m) eVar12.f.get();
                Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
                Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
                ouh.e stateMapper = new ouh.e(buttonClauseFactory, questionSubtitleMapper);
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter(answerValidator, "answerValidator");
                Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
                return new ouh.d(inputData, stateMapper, answerValidator);
            case 11:
                euh.d dVar6 = (euh.d) obj3;
                euh.e eVar13 = (euh.e) obj2;
                if (i2 == 0) {
                    return new com.revolut.feature.workflow.engine.rfi.impl.ui.flow.a(eVar13.f129582a, (iuh.l) eVar13.d.get(), (nuh.a) eVar13.e.get(), (iuh.m) eVar13.f.get(), (zth.b) dVar6.o.get());
                }
                if (i2 == 1) {
                    return new iuh.l();
                }
                if (i2 == 2) {
                    yxc.l iconUiMapper = dVar6.f129575c.a();
                    vc.s.j(iconUiMapper);
                    Intrinsics.checkNotNullParameter(iconUiMapper, "iconUiMapper");
                    return new nuh.b();
                }
                if (i2 == 3) {
                    return new iuh.n();
                }
                if (i2 == 4) {
                    return new iuh.o();
                }
                throw new AssertionError(i2);
            case 12:
                return b();
            case 13:
                return c();
            case 14:
                return d();
            case 15:
                return e();
            case 16:
                return f();
            case 17:
                return g();
            case 18:
                return h();
            case 19:
                return i();
            case 20:
                return j();
            case 21:
                return k();
            case 22:
                return l();
            case 23:
                return m();
            case 24:
                return n();
            case 25:
                return o();
            case 26:
                return p();
            case 27:
                return q();
            case 28:
                return r();
            default:
                eyd.b0 b0Var2 = (eyd.b0) obj3;
                vxd.b bVar13 = b0Var2.f130699c;
                eyd.g gVar4 = (eyd.g) obj2;
                switch (i2) {
                    case 0:
                        return iz8.c.i((i0e.f) gVar4.f130747g.get());
                    case 1:
                        return new i0e.m((j60.a) gVar4.f130746c.get(), (i0e.g) gVar4.f.get());
                    case 2:
                        return iz8.c.B((com.revolut.kompot.navigable.a) gVar4.f130745b.get(), kxa.j.o(new nji.b()));
                    case 3:
                        i0e.c cVar14 = (i0e.c) gVar4.d.get();
                        zxd.c cVarA2 = ((eyd.b) bVar13).a();
                        vc.s.j(cVarA2);
                        return new i0e.q(cVar14, cVarA2, (i0e.h) gVar4.e.get(), (j60.a) gVar4.f130746c.get());
                    case 4:
                        return new i0e.r();
                    case 5:
                        return new i0e.g0();
                    case 6:
                        return iz8.c.h((j60.a) gVar4.f130746c.get());
                    case 7:
                        return iz8.c.j((i0e.g) gVar4.f.get());
                    case 8:
                        azd.l lVar2 = new azd.l();
                        azd.e eVar14 = gVar4.f130744a;
                        i0e.e eVar15 = (i0e.e) gVar4.f.get();
                        zxd.c cVarA3 = ((eyd.b) bVar13).a();
                        vc.s.j(cVarA3);
                        n0e.b bVarC7 = ((eyd.b) bVar13).c();
                        vyd.a aVar20 = new vyd.a();
                        sf0.h hVarB = b0Var2.d.b();
                        vc.s.j(hVarB);
                        return new azd.k(lVar2, eVar14, eVar15, cVarA3, bVarC7, aVar20, hVarB);
                    default:
                        throw new AssertionError(i2);
                }
        }
    }
}
