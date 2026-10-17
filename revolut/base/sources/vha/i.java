package vha;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import q97.g3;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements pfe.b {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f289372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f289373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f289374c;
    public final d1 d;
    public final cia.a e;
    public final p56.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f289375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final x79.a f289376h;
    public final wa7.m i;

    public i(s proAccountsInteractor, v0 proAccountsUpcomingPaymentsInteractor, t0 proAccountsProductMapper, d1 proDiscoverDataSource, cia.a sectionFlowBuilder, p56.a removePocketInteractor, wsg.n walletInteractor, x79.a onHoldAccountInteractor, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(proAccountsInteractor, "proAccountsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsUpcomingPaymentsInteractor, "proAccountsUpcomingPaymentsInteractor");
        Intrinsics.checkNotNullParameter(proAccountsProductMapper, "proAccountsProductMapper");
        Intrinsics.checkNotNullParameter(proDiscoverDataSource, "proDiscoverDataSource");
        Intrinsics.checkNotNullParameter(sectionFlowBuilder, "sectionFlowBuilder");
        Intrinsics.checkNotNullParameter(removePocketInteractor, "removePocketInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f289372a = proAccountsInteractor;
        this.f289373b = proAccountsUpcomingPaymentsInteractor;
        this.f289374c = proAccountsProductMapper;
        this.d = proDiscoverDataSource;
        this.e = sectionFlowBuilder;
        this.f = removePocketInteractor;
        this.f289375g = walletInteractor;
        this.f289376h = onHoldAccountInteractor;
        this.i = hiddenAccountsInteractor;
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) {
        Flow bVar;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (Intrinsics.f(accountId.f89729a, "DISCOVER_PRO_ACCOUNT_ID")) {
            d1 d1Var = this.d;
            bVar = new v0b.b(((et6.y0) d1Var.f289359a).b(), d1Var, 10);
        } else {
            bVar = new go.g(zhm.f0.f322471a, 2);
        }
        return new tnb.k(bVar, 27);
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return rd0.e.b(nim.a.w(mif.a.d(this.f289372a.c(zhm.y0.b(accountId)), this.f289373b.b(accountId)), new cia.b(accountId, this, 3)));
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Flow gVar;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        int i = 2;
        if (Intrinsics.f(accountId.f89729a, "DISCOVER_PRO_ACCOUNT_ID")) {
            return new go.g(zhm.f0.f322471a, 2);
        }
        cia.e eVar = (cia.e) this.e;
        s sVar = eVar.f24435a;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (Intrinsics.f(accountId.f89729a, "PENDING_PRO_ACCOUNT_ID")) {
            Continuation continuation = null;
            gVar = vkm.q.Q(rd0.e.e(new g3(mo3.a.g(((et6.g) sVar.f289431h).d(w4l.j.f294644c), null, null, 3), 28), zhm.h0.f322473a, new vge.f1(3, 9, continuation)), new bw4.s(continuation, eVar, 14));
        } else {
            gVar = new go.g(zhm.f0.f322471a, 2);
        }
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        efm.r rVarSwitchMap = nim.a.w(mif.a.d(sVar.c(zhm.y0.b(accountId)), eVar.f24436b.b(accountId)), new cia.b(accountId, 0)).switchMap(new ch6.d(new cia.d(1, eVar.e, ssi.o.class, "observeWidgetItems", "observeWidgetItems(Lcom/revolut/data/model/Data;Z)Lio/reactivex/Observable;", 0, 0), i));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return new ag1.k(new Flow[]{gVar, rd0.e.b(rVarSwitchMap)}, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vha.e
            if (r0 == 0) goto L13
            r0 = r7
            vha.e r0 = (vha.e) r0
            int r1 = r0.f289360w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289360w = r1
            goto L1a
        L13:
            vha.e r0 = new vha.e
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289360w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L59
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            vha.s r7 = r5.f289372a
            sfe.a r2 = sfe.a.FULL
            efm.r r7 = r7.b(r2)
            vkm.d r7 = rd0.e.b(r7)
            cia.b r2 = new cia.b
            r4 = 4
            r2.<init>(r6, r4)
            akg.n r6 = nim.a.v(r7, r2)
            r7 = 3
            r2 = 0
            jhi.b r6 = mo3.a.g(r6, r2, r2, r7)
            r0.f289360w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L59
            return r1
        L59:
            io3.d r7 = (io3.d) r7
            long r0 = r7.i
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L7b
            xfe.c r6 = new xfe.c
            dj0.d r0 = new dj0.d
            long r1 = r7.i
            xi0.a r3 = xi0.b.Companion
            java.lang.String r7 = r7.f163147c
            r3.getClass()
            xi0.b r7 = xi0.a.a(r7)
            r0.<init>(r1, r7)
            r6.<init>(r0)
            return r6
        L7b:
            xfe.a$b r6 = xfe.a.b.f305242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.i.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (nim.a.a(r13, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountId r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vha.i.h(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        if (Intrinsics.f(productAccountId.f89729a, "DISCOVER_PRO_ACCOUNT_ID")) {
            return sfe.a0.f262402a;
        }
        HomeFeedWidgetContext.Pro.Companion companion = HomeFeedWidgetContext.Pro.INSTANCE;
        String accountId = productAccountId.f89729a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new sfe.z(new HomeFeedWidgetContext.Pro(null, accountId, 1, null));
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Continuation continuation = null;
        if (Intrinsics.f(accountId.f89729a, "DISCOVER_PRO_ACCOUNT_ID")) {
            return new go.g(zi0.c.P(t0.d(null), false, null, 3), 2);
        }
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.Q(mo3.a.g(((et6.g) this.f289372a.f289431h).d(loadingStrategy), null, new vgg.a0(6), 1), new sdi.a(continuation, this, accountId, 23));
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        if (Intrinsics.f(productAccountId.f89729a, "DISCOVER_PRO_ACCOUNT_ID")) {
            return null;
        }
        return new SlotContext(akd.s.PRO);
    }
}
