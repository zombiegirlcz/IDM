package kk8;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import te8.y;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements dk8.a {

    @NotNull
    public static final l Companion = new l();
    public static final long d;
    public static final long e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f184520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f184521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zm0.b f184522c;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.SECONDS;
        d = kotlin.time.c.g(30, eVar);
        e = kotlin.time.c.g(1, eVar);
    }

    public o(k juniorProgressionInteractor, y juniorPollingInteractor, zm0.b sessionController) {
        Intrinsics.checkNotNullParameter(juniorProgressionInteractor, "juniorProgressionInteractor");
        Intrinsics.checkNotNullParameter(juniorPollingInteractor, "juniorPollingInteractor");
        Intrinsics.checkNotNullParameter(sessionController, "sessionController");
        this.f184520a = juniorProgressionInteractor;
        this.f184521b = juniorPollingInteractor;
        this.f184522c = sessionController;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007b, code lost:
    
        if (b(r7) == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (b(r7) == r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof kk8.m
            if (r2 == 0) goto L18
            r2 = r1
            kk8.m r2 = (kk8.m) r2
            int r3 = r2.f184518w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f184518w = r3
        L16:
            r7 = r2
            goto L1e
        L18:
            kk8.m r2 = new kk8.m
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r7.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.f184518w
            r9 = 3
            r10 = 2
            r4 = 1
            if (r3 == 0) goto L44
            if (r3 == r4) goto L40
            if (r3 == r10) goto L3c
            if (r3 != r9) goto L34
            yhm.o.b(r1)
            goto Lad
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r1)
            goto L7e
        L40:
            yhm.o.b(r1)
            goto L6f
        L44:
            yhm.o.b(r1)
            pe8.e r1 = new pe8.e
            long r5 = kk8.o.d
            long r11 = kk8.o.e
            r1.<init>(r5, r11)
            iyi.j r5 = new iyi.j
            r3 = 25
            r6 = 0
            r5.<init>(r0, r6, r3)
            kk8.n r3 = new kk8.n
            r8 = 0
            r11 = r17
            r3.<init>(r8, r11, r6)
            r7.f184518w = r4
            r6 = r3
            te8.y r3 = r0.f184521b
            r8 = 8
            r4 = r1
            java.lang.Object r1 = te8.y.c(r3, r4, r5, r6, r7, r8)
            if (r1 != r2) goto L6f
            goto Lac
        L6f:
            pe8.j r1 = (pe8.j) r1
            boolean r3 = r1 instanceof pe8.i
            if (r3 == 0) goto L81
            r7.f184518w = r10
            java.lang.Object r1 = r0.b(r7)
            if (r1 != r2) goto L7e
            goto Lac
        L7e:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        L81:
            boolean r3 = r1 instanceof pe8.h
            if (r3 == 0) goto Lb0
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r10 = rd0.c.WARNING
            pe8.h r1 = (pe8.h) r1
            java.lang.Exception r1 = r1.getException()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r3 = "Plan polling failed: "
            java.lang.String r4 = ". Proceeding with refresh anyway."
            java.lang.String r12 = p.a.p(r3, r1, r4)
            r14 = 0
            r15 = 16
            java.lang.String r11 = "ProgressionRefreshInteractor"
            r13 = 0
            rd0.d.b(r10, r11, r12, r13, r14, r15)
            r7.f184518w = r9
            java.lang.Object r1 = r0.b(r7)
            if (r1 != r2) goto Lad
        Lac:
            return r2
        Lad:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lb0:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kk8.o.a(java.lang.String, gim.c):java.lang.Object");
    }

    public final Object b(gim.c cVar) {
        Object objD = this.f184520a.d(r0.g(), cVar);
        return objD == fim.a.COROUTINE_SUSPENDED ? objD : Unit.f186387a;
    }
}
