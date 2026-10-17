package blh;

import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.retail.wealth.resources.R$string;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 implements z87.e {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f16648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4f.b f16649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f16650c;
    public final ybl.i d;
    public final o97.r e;
    public final zsc.h f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final clh.n f16651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f16652h;

    public f0(f01.c uikitResources, i instrumentsSearchDelegate, b4f.b temporaryInstrumentRefProvider, ybl.b instrumentTickerInteractor, j searchSourceInstrumentFilter, ybl.i productGroupAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(uikitResources, "uikitResources");
        Intrinsics.checkNotNullParameter(instrumentsSearchDelegate, "instrumentsSearchDelegate");
        Intrinsics.checkNotNullParameter(temporaryInstrumentRefProvider, "temporaryInstrumentRefProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(searchSourceInstrumentFilter, "searchSourceInstrumentFilter");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        this.f16648a = instrumentsSearchDelegate;
        this.f16649b = temporaryInstrumentRefProvider;
        this.f16650c = instrumentTickerInteractor;
        this.d = productGroupAvailabilityInteractor;
        this.e = o97.r.WEALTH_FUNDS;
        a aVar = new a();
        zsc.p pVar = zsc.p.WORD_PREFIX;
        this.f = new zsc.h(new Pair(aVar, pVar), new Pair(tz4.d.a(uikitResources, R$string.wealth_search_category_funds_name, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_buy, com.revolut.feature.globalsearch.api.R$string.search_block_account_action_sell), pVar));
        this.f16651g = new clh.n(clh.w.FUNDS);
        this.f16652h = new y(1);
    }

    @Override // z87.e
    public final o97.m a() {
        return this.f16648a.e;
    }

    @Override // z87.e
    public final efm.r e(String searchQuery, GlobalSearchContext context, efm.r remoteObservable) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
        return pd.b.r(nim.a.w(rd0.e.c(((ael.h0) this.d).d(), p0.f264003c), new y(2)), new b4d.c(this, 19, searchQuery, remoteObservable));
    }

    @Override // z87.f
    public final void g(Set extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16648a.c(extensions);
    }

    @Override // z87.f
    public final o97.r h() {
        return this.e;
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
            boolean r4 = r6 instanceof blh.e0
            if (r4 == 0) goto L13
            r4 = r6
            blh.e0 r4 = (blh.e0) r4
            int r0 = r4.f16647w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f16647w = r0
            goto L1a
        L13:
            blh.e0 r4 = new blh.e0
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f16647w
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
            blh.i r6 = r3.f16648a
            ufm.c r5 = r6.b(r5)
            r4.f16647w = r2
            java.lang.Object r6 = nim.a.b(r5, r4)
            if (r6 != r0) goto L43
            return r0
        L43:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: blh.f0.l(java.lang.String, o97.y, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
