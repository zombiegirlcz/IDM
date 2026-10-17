package nyb;

import com.revolut.feature.rev_points.impl.data.network.RevPointsService;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rxb.l f220812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pyb.l f220813b;

    public m0(rxb.l revPointsTransactionsRepository, pyb.l transactionContentMapper) {
        Intrinsics.checkNotNullParameter(revPointsTransactionsRepository, "revPointsTransactionsRepository");
        Intrinsics.checkNotNullParameter(transactionContentMapper, "transactionContentMapper");
        this.f220812a = revPointsTransactionsRepository;
        this.f220813b = transactionContentMapper;
    }

    public final efm.b a() {
        rxb.l lVar = this.f220812a;
        return lVar.e.get() ? pfm.m.f235744a : new pfm.a(lVar.d(), new rw9.d(new rxb.a(lVar, 1), 11), 4);
    }

    public final rfm.a b(String id10, kub.a loadingStrategy) {
        efm.k jVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        rxb.l lVar = this.f220812a;
        RevPointsService revPointsService = lVar.f258128a;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        int i = rxb.i.f258125a[loadingStrategy.ordinal()];
        if (i == 1) {
            return lVar.a(id10);
        }
        if (i == 2) {
            rfm.w wVarA = lVar.a(id10);
            if (lVar.e.get()) {
                jVar = lVar.c(id10);
            } else {
                jVar = new rfm.j(lVar.d(), new rxb.f(10, new rxb.g(lVar, id10, 0)), 2);
            }
            rfm.z zVarM = wVarA.m(jVar);
            Intrinsics.checkNotNullExpressionValue(zVarM, "switchIfEmpty(...)");
            return zVarM;
        }
        if (i == 3) {
            rfm.m mVar = new rfm.m(te0.w.h0(revPointsService.getRevPointsTransactionById(id10)), new rxb.f(7, new rxb.b(12)), 1);
            Intrinsics.checkNotNullExpressionValue(mVar, "map(...)");
            return mVar;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        efm.k<hxb.f0> revPointsTransactionById = revPointsService.getRevPointsTransactionById(id10);
        rxb.f fVar = new rxb.f(8, new rxb.b(13));
        revPointsTransactionById.getClass();
        rfm.m mVar2 = new rfm.m(new rfm.m(revPointsTransactionById, fVar, 1), new rxb.f(9, new rxb.a(lVar, 10)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar2, "flatMap(...)");
        return te0.w.h0(mVar2);
    }

    public final efm.r c(RevPointsTransactionPageParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        rxb.l lVar = this.f220812a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(params, "params");
        efm.r map = lVar.e.get() ? lVar.b(params).map(new rw9.d(new rxb.b(4), 20)) : new sfm.b(lVar.d(), new rw9.d(new rxb.d(lVar, params, 0), 21), 2);
        Intrinsics.h(map);
        efm.r rVarSwitchMap = te0.w.f0(map).switchMap(new h0(1, new nya.b0(this, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final sfm.b d() {
        rxb.l lVar = this.f220812a;
        sfm.b bVar = new sfm.b(te0.w.i0(lVar.f258129b.g().d()), new rxb.f(14, new rxb.a(lVar, 11)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (vkm.q.n(r2, r0) != r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof nyb.l0
            if (r0 == 0) goto L13
            r0 = r9
            nyb.l0 r0 = (nyb.l0) r0
            int r1 = r0.f220810w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f220810w = r1
            goto L18
        L13:
            nyb.l0 r0 = new nyb.l0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f220810w
            r3 = 1
            r4 = 0
            r5 = 3
            r6 = 2
            if (r2 == 0) goto L45
            if (r2 == r3) goto L41
            if (r2 == r6) goto L3d
            if (r2 != r5) goto L35
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto La6
        L2f:
            r9 = move-exception
            goto La9
        L32:
            r9 = move-exception
            goto Lb5
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3d:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto L7e
        L41:
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            goto L71
        L45:
            yhm.o.b(r9)
            rxb.l r9 = r8.f220812a     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            qfm.n r9 = r9.g()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            blm.f r9 = blm.g.a(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            m84.c r2 = new m84.c     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r7 = 10
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            vkm.q0 r7 = new vkm.q0     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r7.<init>(r9, r2, r3)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            nfj.i r9 = new nfj.i     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r9.<init>(r5, r5, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            vkm.t r2 = new vkm.t     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r2.<init>(r7, r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r0.f220810w = r3     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r9 = vkm.q.n(r2, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r9 != r1) goto L71
            goto La5
        L71:
            efm.b r9 = r8.a()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r0.f220810w = r6     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r9 = nim.a.a(r9, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r9 != r1) goto L7e
            goto La5
        L7e:
            sfm.b r9 = r8.d()     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            vkm.d r9 = rd0.e.b(r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            m84.c r2 = new m84.c     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r7 = 11
            r2.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            vkm.q0 r6 = new vkm.q0     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r6.<init>(r9, r2, r3)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            nfj.i r9 = new nfj.i     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r2 = 4
            r9.<init>(r5, r2, r4)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            vkm.t r2 = new vkm.t     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r2.<init>(r6, r9)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            r0.f220810w = r5     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            java.lang.Object r9 = vkm.q.n(r2, r0)     // Catch: java.lang.Exception -> L2f java.util.concurrent.CancellationException -> L32
            if (r9 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        La9:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r9, r0)
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        Lb5:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nyb.m0.e(gim.c):java.lang.Object");
    }
}
