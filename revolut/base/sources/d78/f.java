package d78;

import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior.accounts.impl.ui.switcher.mapper.JuniorDiscoveryProductAccountMapper;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import ghk.a0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s56.d0;
import sfe.z;
import vkm.y;
import zh9.u0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s78.m f111838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s78.h f111839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rea.m f111840c;
    public final wsg.n d;
    public final d88.g e;

    public f(s78.m juniorDashboardTransactionsItemProvider, s78.h juniorDashboardStatusWidgetProvider, rea.m pocketDetailsInteractor, wsg.n walletInteractor, d88.g juniorProductAccountsSourceDelegate, d88.h youthDiscoverDataSource) {
        Intrinsics.checkNotNullParameter(juniorDashboardTransactionsItemProvider, "juniorDashboardTransactionsItemProvider");
        Intrinsics.checkNotNullParameter(juniorDashboardStatusWidgetProvider, "juniorDashboardStatusWidgetProvider");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProductAccountsSourceDelegate, "juniorProductAccountsSourceDelegate");
        Intrinsics.checkNotNullParameter(youthDiscoverDataSource, "youthDiscoverDataSource");
        this.f111838a = juniorDashboardTransactionsItemProvider;
        this.f111839b = juniorDashboardStatusWidgetProvider;
        this.f111840c = pocketDetailsInteractor;
        this.d = walletInteractor;
        this.e = juniorProductAccountsSourceDelegate;
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (Intrinsics.f(accountId.f89729a, "DISCOVER_JUNIOR_ACCOUNT_ID")) {
            List listK = zhm.v.k(d88.h.a(R$drawable.uikit_icn_24_cards, R$string.junior_account_discovery_section_own_app_title, R$string.junior_account_discovery_section_own_app_subtitle, "LIST_ID_DISCOVER_JUNIOR_OWN_APP_SECTION"), d88.h.a(R$drawable.uikit_icn_24_time_and_money, R$string.junior_account_discovery_section_money_habits_title, R$string.junior_account_discovery_section_money_habits_subtitle, "LIST_ID_DISCOVER_JUNIOR_MONEY_HABITS_SECTION"), d88.h.a(R$drawable.uikit_icn_24_controls, R$string.junior_account_discovery_section_control_title, R$string.junior_account_discovery_section_control_subtitle, "LIST_ID_DISCOVER_JUNIOR_CONTROL_SECTION"));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            return new c(new go.g(listK, 2), 0);
        }
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        d88.g gVar = this.e;
        i88.b bVar = gVar.f112159q;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ProductAccountId.Payload payload = accountId.f89730b;
        return new cqh.m(payload instanceof JuniorDiscoveryProductAccountMapper.DiscoverMulticurrencyItemParcel ? new a0(bVar.f159476a.a(), payload, 28) : vkm.i.f290039a, gVar.o, 6);
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId productAccountId) {
        Intrinsics.checkNotNullParameter(productAccountId, "accountId");
        JuniorProductAccountIdPayload juniorProductAccountIdPayloadA = z88.a.a(productAccountId);
        String juniorId = juniorProductAccountIdPayloadA.f76717a;
        String str = juniorProductAccountIdPayloadA.f76718b;
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        s78.h hVar = this.f111839b;
        int i = 15;
        akg.n nVarV = nim.a.v(hVar.f260575a.e(), new rvc.k(juniorId, i));
        zf8.n nVar = hVar.f260576b;
        w4l.h hVar2 = w4l.h.f294642c;
        Continuation continuation = null;
        ahe.i iVar = new ahe.i(new y(new rhl.b(hVar, juniorId, continuation, 19), boh.f.e(u0.m(nVarV, nVar.c(juniorId, hVar2)), new s31.a(hVar, juniorId, 12))), i);
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(productAccountId, "productAccountId");
        s78.m mVar = this.f111838a;
        return new ag1.k(new Flow[]{iVar, vkm.q.Q(new y(new d0(2, mVar, juniorId, str, productAccountId, (Continuation) null), boh.f.e(mVar.f260585a.c(juniorId, hVar2), new q2k.b(juniorId, (Object) mVar, str, (Object) productAccountId, 26))), new r3k.c(continuation, mVar, 26))}, 13);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d78.d
            if (r0 == 0) goto L13
            r0 = r8
            d78.d r0 = (d78.d) r0
            int r1 = r0.f111836w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111836w = r1
            goto L1a
        L13:
            d78.d r0 = new d78.d
            gim.c r8 = (gim.c) r8
            r0.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111836w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r8)
            goto L5f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload r8 = z88.a.a(r7)
            java.lang.String r2 = r8.f76717a
            java.lang.String r8 = r8.f76718b
            if (r8 == 0) goto L84
            wsg.n r4 = r6.d
            w4l.h r5 = w4l.h.f294642c
            efm.r r2 = r4.e0(r2, r5)
            d78.a r4 = new d78.a
            r5 = 0
            r4.<init>(r7, r8, r5)
            efm.r r7 = nim.a.w(r2, r4)
            r8 = 3
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r2, r8)
            r0.f111836w = r3
            java.lang.Object r8 = nim.a.c(r7, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            io3.d r8 = (io3.d) r8
            long r0 = r8.i
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L81
            xfe.c r7 = new xfe.c
            dj0.d r0 = new dj0.d
            long r1 = r8.i
            xi0.a r3 = xi0.b.Companion
            java.lang.String r8 = r8.f163147c
            r3.getClass()
            xi0.b r8 = xi0.a.a(r8)
            r0.<init>(r1, r8)
            r7.<init>(r0)
            return r7
        L81:
            xfe.a$b r7 = xfe.a.b.f305242a
            return r7
        L84:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "JuniorProductAccountIdPayload::pocketId is expected"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d78.f.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        if (nim.a.a(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountId r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d78.e
            if (r0 == 0) goto L13
            r0 = r9
            d78.e r0 = (d78.e) r0
            int r1 = r0.f111837w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111837w = r1
            goto L1a
        L13:
            d78.e r0 = new d78.e
            gim.c r9 = (gim.c) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111837w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto L9e
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L66
        L38:
            yhm.o.b(r9)
            com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload r9 = z88.a.a(r8)
            java.lang.String r2 = r9.f76717a
            java.lang.String r9 = r9.f76718b
            if (r9 == 0) goto La1
            wsg.n r5 = r7.d
            w4l.h r6 = w4l.h.f294642c
            efm.r r2 = r5.e0(r2, r6)
            d78.a r5 = new d78.a
            r6 = 1
            r5.<init>(r8, r9, r6)
            efm.r r8 = nim.a.w(r2, r5)
            r9 = 3
            r2 = 0
            efm.r r8 = m70.a.g(r8, r2, r2, r9)
            r0.f111837w = r4
            java.lang.Object r9 = nim.a.c(r8, r0)
            if (r9 != r1) goto L66
            goto L9d
        L66:
            io3.d r9 = (io3.d) r9
            java.lang.String r8 = r9.f163145a
            java.lang.String r9 = "pocketId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            rea.m r2 = r7.f111840c
            z71.a r5 = r2.f253578a
            j31.g r5 = (j31.g) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            com.revolut.data.network.services.wallet.AccountsService r9 = r5.f170930a
            efm.b r8 = r9.deletePocket(r8)
            pfm.r r8 = te0.w.g0(r8)
            wsg.n r9 = r2.f253579b
            efm.b r9 = r9.l0(r4)
            pfm.a r9 = ue0.e.v(r9)
            pfm.a r8 = r8.e(r9)
            java.lang.String r9 = "andThen(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            r0.f111837w = r3
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "JuniorProductAccountIdPayload::pocketId is expected"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d78.f.h(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        String juniorId = z88.a.a(productAccountId).f76717a;
        HomeFeedWidgetContext.Junior.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        return new z(new HomeFeedWidgetContext.Junior(null, juniorId, 1, null));
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (Intrinsics.f(accountId.f89729a, "DISCOVER_JUNIOR_ACCOUNT_ID")) {
            return new go.g(zi0.c.P(d88.h.b(), false, null, 3), 2);
        }
        return nim.a.v(this.e.b(z88.a.a(accountId).f76717a, pie.v.ACCOUNTS, w4l.i.f294643c, null), new cia.b(accountId, 1));
    }

    @Override // pfe.b
    public final Object n(ProductAccountId productAccountId, gim.c cVar) {
        return new SlotContext(akd.s.JUNIOR, y0.b(z88.a.a(productAccountId).f76717a));
    }
}
