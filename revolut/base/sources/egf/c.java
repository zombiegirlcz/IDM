package egf;

import com.revolut.feature.transaction.workflow.impl.network.TransactionWorkflowService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Json f125633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionWorkflowService f125634b;

    public c(Json json, TransactionWorkflowService service) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f125633a = json;
        this.f125634b = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(egf.c r4, java.lang.String r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof egf.b
            if (r0 == 0) goto L16
            r0 = r6
            egf.b r0 = (egf.b) r0
            int r1 = r0.f125632w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f125632w = r1
            goto L1b
        L16:
            egf.b r0 = new egf.b
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f125632w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L46
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            dp4.y0 r6 = new dp4.y0
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.f125632w = r3
            r4 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r6 = skm.h2.d(r4, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            bgf.j r6 = (bgf.j) r6
            if (r6 != 0) goto L4d
            bgf.g r4 = bgf.g.f15195a
            return r4
        L4d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: egf.c.a(egf.c, java.lang.String, gim.c):java.lang.Object");
    }
}
