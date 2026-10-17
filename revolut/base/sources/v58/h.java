package v58;

import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAccountActivationService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAsyncAccountActivationService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements d {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorAccountActivationService f286165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JuniorAsyncAccountActivationService f286166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sf0.h f286167c;
    public final ao.h d;
    public final ao.h e;
    public final ao.h f;

    public h(JuniorAccountActivationService service, JuniorAsyncAccountActivationService asyncActivationService, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(asyncActivationService, "asyncActivationService");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f286165a = service;
        this.f286166b = asyncActivationService;
        this.f286167c = serverErrorParser;
        this.d = new ao.h(20, new e(this, 1));
        this.e = new ao.h(20, new e(this, 2));
        this.f = new ao.h(20, new e(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(r58.a r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v58.g
            if (r0 == 0) goto L13
            r0 = r6
            v58.g r0 = (v58.g) r0
            int r1 = r0.f286164w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286164w = r1
            goto L18
        L13:
            v58.g r0 = new v58.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286164w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.e
            efm.d0 r5 = r6.k(r5)
            r0.f286164w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v58.h.a(r58.a, gim.c):java.lang.Object");
    }
}
