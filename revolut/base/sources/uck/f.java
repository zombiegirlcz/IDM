package uck;

import com.revolut.retail.feature.plan_referrals.impl.network.PlanReferralsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import nfj.i;
import org.jetbrains.annotations.NotNull;
import pti.s;
import u6b.k;
import u7k.w;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanReferralsService f279050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f279051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p56.a f279052c;
    public final x4l.c d;

    public f(PlanReferralsService service, j memoryCache, p56.a errorMapper, a campaignInfoErrorMapper) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(errorMapper, "errorMapper");
        Intrinsics.checkNotNullParameter(campaignInfoErrorMapper, "campaignInfoErrorMapper");
        this.f279050a = service;
        this.f279051b = memoryCache;
        this.f279052c = errorMapper;
        Continuation continuation = null;
        this.d = new x4l.c(new s(this, continuation, 23), new k(this, 27), new w(this, 11), new rp1.c(2, 12, continuation), new i(3, 26, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uck.d
            if (r0 == 0) goto L13
            r0 = r5
            uck.d r0 = (uck.d) r0
            int r1 = r0.f279048w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279048w = r1
            goto L18
        L13:
            uck.d r0 = new uck.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279048w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: retrofit2.HttpException -> L27
            goto L3f
        L27:
            r5 = move-exception
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            com.revolut.retail.feature.plan_referrals.impl.network.PlanReferralsService r5 = r4.f279050a     // Catch: retrofit2.HttpException -> L27
            r0.f279048w = r3     // Catch: retrofit2.HttpException -> L27
            java.lang.Object r5 = r5.getCampaignInfo(r0)     // Catch: retrofit2.HttpException -> L27
            if (r5 != r1) goto L3f
            return r1
        L3f:
            tck.f r5 = (tck.f) r5     // Catch: retrofit2.HttpException -> L27
            pck.d r5 = ksj.b.G(r5)     // Catch: retrofit2.HttpException -> L27
            pck.e r0 = new pck.e     // Catch: retrofit2.HttpException -> L27
            r0.<init>(r5)     // Catch: retrofit2.HttpException -> L27
            return r0
        L4b:
            java.lang.String r0 = "error"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.revolut.core.error.data.model.ServerErrorException r0 = com.revolut.core.error.data.model.a.a(r5)
            com.revolut.core.error.data.model.ServerError r0 = r0.f
            int r0 = r0.f51362a
            switch(r0) {
                case 130111: goto L5d;
                case 130112: goto L5d;
                default: goto L5b;
            }
        L5b:
            r0 = 0
            goto L5f
        L5d:
            pck.f r0 = pck.f.f234928a
        L5f:
            if (r0 == 0) goto L62
            return r0
        L62:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uck.f.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uck.e
            if (r0 == 0) goto L13
            r0 = r5
            uck.e r0 = (uck.e) r0
            int r1 = r0.f279049w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f279049w = r1
            goto L18
        L13:
            uck.e r0 = new uck.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f279049w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f279049w = r3
            java.lang.Object r5 = r4.a(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            r0 = r5
            pck.g r0 = (pck.g) r0
            x4l.c r1 = r4.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r1.g(r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uck.f.b(gim.c):java.lang.Object");
    }
}
