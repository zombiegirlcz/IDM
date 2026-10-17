package d34;

import akl.o;
import com.revolut.feature.credit.application.plugins.impl.network.CreditPluginsService;
import cvi.i;
import cwj.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mp.p;
import s04.g;
import wsg.n;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditPluginsService f110914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f110915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f110916c;
    public final n d;
    public final xx4.d e;
    public final x4l.c f;

    public e(CreditPluginsService creditPluginsService, g dtoMapper, p creditApplicationDtoMapper, n walletInteractor, xx4.d memoryCache) {
        Intrinsics.checkNotNullParameter(creditPluginsService, "creditPluginsService");
        Intrinsics.checkNotNullParameter(dtoMapper, "dtoMapper");
        Intrinsics.checkNotNullParameter(creditApplicationDtoMapper, "creditApplicationDtoMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f110914a = creditPluginsService;
        this.f110915b = dtoMapper;
        this.f110916c = creditApplicationDtoMapper;
        this.d = walletInteractor;
        this.e = memoryCache;
        Continuation continuation = null;
        this.f = new x4l.c(new i(this, continuation, 6), new b(this, 0), new h(this, 6), new o(2, 25, continuation), new a19.e(3, 23, continuation));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(d34.e r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof d34.d
            if (r0 == 0) goto L16
            r0 = r5
            d34.d r0 = (d34.d) r0
            int r1 = r0.f110913w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f110913w = r1
            goto L1b
        L16:
            d34.d r0 = new d34.d
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110913w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            wsg.n r4 = r4.d
            com.revolut.core.model.account.AccountId$Personal r5 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r4 = r4.x(r5)
            r0.f110913w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L46
            return r1
        L46:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d34.e.a(d34.e, gim.c):java.lang.Object");
    }
}
