package ulf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f280973a;

    public i(m delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f280973a = delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0085 -> B:20:0x0088). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r12, dj0.d r13, gim.c r14, java.util.List r15) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ulf.h
            if (r0 == 0) goto L13
            r0 = r14
            ulf.h r0 = (ulf.h) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            ulf.h r0 = new ulf.h
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            int r12 = r0.z
            int r13 = r0.f280972y
            java.util.Iterator r15 = r0.f280971x
            java.util.Collection r2 = r0.f280970w
            java.util.Collection r2 = (java.util.Collection) r2
            dj0.d r4 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = r0.u
            yhm.o.b(r14)
            r9 = r4
            r8 = r5
            goto L88
        L37:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3f:
            yhm.o.b(r14)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            r14 = 10
            java.util.ArrayList r14 = zhm.d0.S(r15, r14)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r14 = r14.iterator()
            r2 = 0
            r8 = r12
            r9 = r13
            r12 = r2
            r13 = r12
            r2 = r15
            r15 = r14
        L5a:
            boolean r14 = r15.hasNext()
            if (r14 == 0) goto L8e
            java.lang.Object r14 = r15.next()
            r6 = r14
            java.util.List r6 = (java.util.List) r6
            s56.d0 r4 = new s56.d0
            r10 = 0
            r5 = 9
            r7 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.u = r8
            r0.v = r9
            r14 = r2
            java.util.Collection r14 = (java.util.Collection) r14
            r0.f280970w = r14
            r0.f280971x = r15
            r0.f280972y = r13
            r0.z = r12
            r0.C = r3
            java.lang.Object r14 = skm.e0.o(r4, r0)
            if (r14 != r1) goto L88
            return r1
        L88:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            zhm.a0.x(r14, r2)
            goto L5a
        L8e:
            java.util.List r2 = (java.util.List) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.i.a(com.revolut.feature_move_money.api.model.AccountWrapper, dj0.d, gim.c, java.util.List):java.lang.Object");
    }
}
