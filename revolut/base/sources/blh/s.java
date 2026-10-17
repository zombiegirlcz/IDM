package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements z87.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.i f16689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o97.r f16690c;
    public final zsc.h d;
    public final clh.n e;
    public final ble.z f;

    public s(f01.c uikitResources, i instrumentsSearchDelegate, ybl.i accountAvailabilityInteractor, j searchSourceInstrumentFilter) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(accountAvailabilityInteractor, "accountAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        this.f16688a = instrumentsSearchDelegate;
        this.f16689b = accountAvailabilityInteractor;
        this.f16690c = o97.r.WEALTH_BONDS;
        a aVar = new a();
        zsc.p pVar = zsc.p.WORD_PREFIX;
        this.d = new zsc.h(new Pair(aVar, pVar), new Pair(tz4.d.a(uikitResources, R$string.wealth_search_category_bonds_name, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_buy, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_sell), pVar));
        this.e = new clh.n(clh.w.BONDS);
        this.f = new ble.z(this, 22);
    }

    @Override // z87.e
    public final o97.m a() {
        return this.f16688a.e;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        zsc.m.Companion.getClass();
        zsc.m mVarA = zsc.l.a(searchQuery);
        efm.r rVarSwitchMap = rd0.e.c(((ael.h0) this.f16689b).b(cfl.p.BONDS), kotlin.coroutines.g.f186406a).switchMap(new bjg.d(22, new b4d.c(this, 17, mVarA, remoteObservable)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16688a.c(extensions);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.f16690c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // z87.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r4, o97.y r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof blh.r
            if (r4 == 0) goto L13
            r4 = r6
            blh.r r4 = (blh.r) r4
            int r0 = r4.f16687w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f16687w = r0
            goto L1a
        L13:
            blh.r r4 = new blh.r
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f16687w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            blh.i r6 = r3.f16688a
            ufm.c r5 = r6.b(r5)
            r4.f16687w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L43
            return r0
        L43:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.s.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
