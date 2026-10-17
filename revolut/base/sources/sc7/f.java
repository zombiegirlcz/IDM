package sc7;

import androidx.room.RxRoom;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.ContactsWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.R$string;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionInputData;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.m;
import efm.d0;
import efm.r;
import hx7.q;
import ip0.c2;
import jq9.a0;
import jq9.b0;
import jq9.t;
import jq9.u;
import jq9.v;
import jq9.w;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import rvc.k;
import u3a.n;
import xx9.p;
import zm3.l;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f261649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d3a.b f261650c;
    public final gc7.c d;
    public final iz9.c e;
    public final px9.d f;

    public f(p recentsInteractor, d3a.b paymentsSearchInteractor, gc7.c mapper, iz9.c paymentsChatTransactionsInteractor, r3a.b transferNavigationScreenProvider, px9.d unreadCounterInteractor) {
        Intrinsics.checkNotNullParameter(recentsInteractor, "recentsInteractor");
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(paymentsChatTransactionsInteractor, "paymentsChatTransactionsInteractor");
        Intrinsics.checkNotNullParameter(transferNavigationScreenProvider, "transferNavigationScreenProvider");
        Intrinsics.checkNotNullParameter(unreadCounterInteractor, "unreadCounterInteractor");
        this.f261649b = recentsInteractor;
        this.f261650c = paymentsSearchInteractor;
        this.d = mapper;
        this.e = paymentsChatTransactionsInteractor;
        this.f = unreadCounterInteractor;
    }

    public static String j(t tVar) {
        if (tVar instanceof y) {
            return k(((y) tVar).f177526a);
        }
        if (tVar instanceof w) {
            return ((w) tVar).f177524a.f81495a.f81490a;
        }
        if (tVar instanceof b0) {
            return ((b0) tVar).f177496a.f79285a;
        }
        if (tVar instanceof v) {
            return ((v) tVar).f177523a.f132329a;
        }
        if (tVar instanceof a0) {
            return ((a0) tVar).f177495a.f71059a;
        }
        if (tVar instanceof x) {
            return ((x) tVar).f177525a.f13938a;
        }
        if (tVar instanceof u) {
            return ((u) tVar).f177522a.getF62137a().getF62112a();
        }
        if (tVar instanceof z) {
            return ((z) tVar).f177527a.f79060a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String k(zm3.a aVar) {
        if (aVar instanceof zm3.g) {
            return q.F((zm3.g) aVar);
        }
        if (aVar instanceof zm3.p) {
            return q.G((zm3.p) aVar);
        }
        if (aVar instanceof l) {
            return ((l) aVar).getCode();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (Intrinsics.f(str, "TransfersMedium")) {
            dsh.e.Companion.getClass();
            return dsh.d.a();
        }
        if (Intrinsics.f(str, "TransfersSmall")) {
            return i(cVar);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            xx9.p r7 = r6.f261649b
            fc.g r7 = r7.f309448a
            boolean r0 = r8 instanceof sc7.d
            if (r0 == 0) goto L17
            r0 = r8
            sc7.d r0 = (sc7.d) r0
            int r1 = r0.f261647w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f261647w = r1
            goto L1e
        L17:
            sc7.d r0 = new sc7.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1e:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261647w
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L7c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.i
            java.util.concurrent.ThreadPoolExecutor r8 = (java.util.concurrent.ThreadPoolExecutor) r8
            au0.n4 r2 = new au0.n4
            r4 = 10
            r5 = 0
            r2.<init>(r5, r7, r4)
            r8.submit(r2)
            java.lang.Object r8 = r7.f133579a
            tx9.f r8 = (tx9.f) r8
            tx9.e r8 = r8.f275378a
            kotlin.Lazy r8 = r8.f275376b
            java.lang.Object r8 = r8.getValue()
            te0.v r8 = (te0.v) r8
            efm.r r8 = r8.a()
            xx9.n r2 = new xx9.n
            r4 = 2
            r2.<init>(r7, r4)
            xx9.d r7 = new xx9.d
            r4 = 10
            r7.<init>(r4, r2)
            efm.r r7 = r8.switchMap(r7)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f261647w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L7c
            return r1
        L7c:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: sc7.f.c(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        if (Intrinsics.f(widgetType, "TransfersMedium")) {
            return ContactsWidgetDelegate.Model.Companion.b(ContactsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.home_feed_interactive_widget_title_recent_payees, null, null, 14), c2.CIRCLE);
        }
        if (Intrinsics.f(widgetType, "TransfersSmall")) {
            return new QuickActionWidgetLoadingDelegate.Model(id10);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        if (Intrinsics.f(str2, "TransfersMedium")) {
            Object objX = vkm.q.x(n(str), fVar);
            return objX == fim.a.COROUTINE_SUSPENDED ? objX : (BaseDraggableWidgetDelegate.Model) objX;
        }
        if (!Intrinsics.f(str2, "TransfersSmall")) {
            throw new IllegalArgumentException();
        }
        Object objX2 = vkm.q.x(m(str, eVar), fVar);
        return objX2 == fim.a.COROUTINE_SUSPENDED ? objX2 : (BaseDraggableWidgetDelegate.Model) objX2;
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        if (Intrinsics.f(widgetType, "TransfersMedium")) {
            return n(id10);
        }
        if (Intrinsics.f(widgetType, "TransfersSmall")) {
            return m(id10, config);
        }
        throw new IllegalArgumentException();
    }

    @Override // csh.e
    public final dsh.j h(WidgetContext widgetContext, String widgetType, dsh.e inputConfig) {
        HomeFeedWidgetContext.Personal widgetContext2 = (HomeFeedWidgetContext.Personal) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        if (!Intrinsics.f(widgetType, "TransfersSmall")) {
            super.h(widgetContext2, widgetType, inputConfig);
            return null;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_feed_widget_payees_select_payee, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.home_feed_widget_payees_select_payee, null, null, 14);
        WhoToTransferFilter[] elements = {WhoToTransferFilter.Accounts.f79984a, WhoToTransferFilter.Cards.f79998a, WhoToTransferFilter.Groups.f80003a, WhoToTransferFilter.Revolut.f80005a, WhoToTransferFilter.CryptoWallets.f80001a, WhoToTransferFilter.Checks.f80000a, WhoToTransferFilter.Charities.f79999a};
        Intrinsics.checkNotNullParameter(elements, "elements");
        RecipientSelectionInputData inputData = new RecipientSelectionInputData(textLocalisedClause2, true, false, kotlin.collections.d.y0(elements), null, null, null, null, 240);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new dsh.j(textLocalisedClause, new m(new RecipientSelectionScreen(inputData), new dsh.q(this, inputConfig)), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof sc7.c
            if (r0 == 0) goto L13
            r0 = r5
            sc7.c r0 = (sc7.c) r0
            int r1 = r0.f261646w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261646w = r1
            goto L18
        L13:
            sc7.c r0 = new sc7.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261646w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            jq9.a r5 = jq9.a.NONE
            efm.r r5 = r4.l(r5)
            sa6.y r2 = new sa6.y
            r2.<init>(r4)
            efm.r r5 = te0.w.a0(r5, r2)
            r0.f261646w = r3
            java.lang.Object r5 = nim.a.e(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            dsh.e r5 = (dsh.e) r5
            if (r5 != 0) goto L57
            dsh.d r5 = dsh.e.Companion
            r5.getClass()
            dsh.e r5 = dsh.d.a()
        L57:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sc7.f.i(gim.c):java.io.Serializable");
    }

    public final r l(jq9.a aVar) {
        return m70.a.g(zi0.c.J(p.c(this.f261649b, false, aVar, 1)), null, new sa5.a(6), 1);
    }

    public final vkm.d m(String str, dsh.e eVar) {
        String id10 = eVar != null ? eVar.a("id") : null;
        if (id10 == null) {
            r rVarFlatMap = te0.w.a0(l(jq9.a.NONE), new sa6.y(13)).flatMap(new sa6.a(new a(this, str, 1), 25));
            Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
            return rd0.e.b(rVarFlatMap);
        }
        r rVarA0 = te0.w.a0(m70.a.g(zi0.c.J(((n) this.f261650c).d(null, zhm.v.k(d3a.a.ACCOUNTS, d3a.a.CARDS, d3a.a.GROUPS, d3a.a.REVOLUT, d3a.a.CRYPTO_WALLET, d3a.a.CHECKS, d3a.a.CHARITIES), jq9.a.NONE)), null, new sa5.a(7), 1), new k(20, id10, this));
        Intrinsics.checkNotNullParameter(id10, "id");
        yx9.a aVar = this.f.f240587a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        kx9.a aVar2 = aVar.f317601a;
        d0 d0VarCreateSingle = RxRoom.createSingle(aVar2.f190507a, true, false, new kp0.q(aVar2, id10, 23));
        yua.h hVar = new yua.h(new yv8.j(16), 19);
        d0VarCreateSingle.getClass();
        ufm.i iVar = new ufm.i(d0VarCreateSingle, hVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        r rVarX = te0.w.i0(iVar).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        r rVarFlatMap2 = te0.w.l(rVarA0, rVarX).flatMap(new sa6.a(new a(this, str, 0), 24));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap2, "flatMap(...)");
        return rd0.e.b(rVarFlatMap2);
    }

    public final mle.x n(String str) {
        r map = l(jq9.a.ALL).map(new sa6.a(new sa6.y(14), 26));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return new mle.x(rd0.e.b(map), this, str, 27);
    }
}
