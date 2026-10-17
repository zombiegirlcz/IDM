package jv9;

import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocialPaymentsService f178795a;

    public e(SocialPaymentsService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f178795a = service;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dv9.m r6, long r7, boolean r9, gim.c r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof jv9.d
            if (r0 == 0) goto L13
            r0 = r10
            jv9.d r0 = (jv9.d) r0
            int r1 = r0.f178794x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f178794x = r1
            goto L18
        L13:
            jv9.d r0 = new jv9.d
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f178794x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r6 = r0.u
            yhm.o.b(r10)
            goto L88
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r10)
            boolean r10 = r6 instanceof dv9.k
            if (r10 == 0) goto L3b
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L4a
        L3b:
            boolean r2 = r6 instanceof dv9.l
            if (r2 != 0) goto L48
            if (r6 != 0) goto L42
            goto L48
        L42:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L48:
            r2 = 3000(0xbb8, float:4.204E-42)
        L4a:
            com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService r4 = r5.f178795a
            if (r10 == 0) goto L61
            dv9.k r6 = (dv9.k) r6
            java.lang.String r6 = r6.f118076a
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            efm.d0 r6 = r4.getGroupMessages(r6, r10, r7, r9)
            goto L7c
        L61:
            boolean r10 = r6 instanceof dv9.l
            if (r10 != 0) goto L6e
            if (r6 != 0) goto L68
            goto L6e
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L6e:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r7)
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r2)
            efm.d0 r6 = r4.getMessages(r6, r7, r9)
        L7c:
            r0.u = r2
            r0.f178794x = r3
            java.lang.Object r10 = nim.a.b(r6, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            r6 = r2
        L88:
            java.util.List r10 = (java.util.List) r10
            jv9.f r7 = new jv9.f
            kotlin.jvm.internal.Intrinsics.h(r10)
            int r8 = r10.size()
            if (r8 >= r6) goto L96
            goto L97
        L96:
            r3 = 0
        L97:
            r7.<init>(r10, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jv9.e.a(dv9.m, long, boolean, gim.c):java.lang.Object");
    }
}
