package rh8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 implements lh8.d {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f254350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ih0.b f254351b;

    public k0(d0 juniorOnboardingWorkflowInteractor, ih0.b remoteConfig) {
        Intrinsics.checkNotNullParameter(juniorOnboardingWorkflowInteractor, "juniorOnboardingWorkflowInteractor");
        Intrinsics.checkNotNullParameter(remoteConfig, "remoteConfig");
        this.f254350a = juniorOnboardingWorkflowInteractor;
        this.f254351b = remoteConfig;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046 A[Catch: Exception -> 0x0037, TRY_ENTER, TryCatch #0 {Exception -> 0x0037, blocks: (B:16:0x0033, B:26:0x0051, B:23:0x0046), top: B:36:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0075 -> B:21:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rh8.k0 r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof rh8.i0
            if (r0 == 0) goto L13
            r0 = r9
            rh8.i0 r0 = (rh8.i0) r0
            int r1 = r0.f254344x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254344x = r1
            goto L18
        L13:
            rh8.i0 r0 = new rh8.i0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254344x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            goto L39
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L37
            goto L51
        L37:
            r9 = move-exception
            goto L54
        L39:
            yhm.o.b(r9)
        L3c:
            kotlin.coroutines.CoroutineContext r9 = r0.getContext()
            boolean r9 = skm.e0.x(r9)
            if (r9 == 0) goto L78
            r0.u = r8     // Catch: java.lang.Exception -> L37
            r0.f254344x = r4     // Catch: java.lang.Exception -> L37
            java.lang.Object r9 = r7.d(r8, r0)     // Catch: java.lang.Exception -> L37
            if (r9 != r1) goto L51
            goto L7a
        L51:
            mh8.k r9 = (mh8.k) r9     // Catch: java.lang.Exception -> L37
            goto L5f
        L54:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            r6 = 0
            rd0.d.a(r5, r6, r6, r9, r2)
            r9 = r6
        L5f:
            if (r9 == 0) goto L63
            r1 = r9
            goto L7a
        L63:
            kotlin.time.b$a r9 = kotlin.time.b.INSTANCE
            r9 = 500(0x1f4, float:7.0E-43)
            pkm.e r2 = pkm.e.MILLISECONDS
            long r5 = kotlin.time.c.g(r9, r2)
            r0.u = r8
            r0.f254344x = r3
            java.lang.Object r9 = skm.k0.c(r5, r0)
            if (r9 != r1) goto L3c
            goto L7a
        L78:
            mh8.i r1 = mh8.i.f205430a
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.k0.a(rh8.k0, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rh8.g0
            if (r0 == 0) goto L13
            r0 = r9
            rh8.g0 r0 = (rh8.g0) r0
            int r1 = r0.f254338x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254338x = r1
            goto L18
        L13:
            rh8.g0 r0 = new rh8.g0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254338x
            r3 = 0
            rh8.d0 r4 = r7.f254350a
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 != r5) goto L2e
            yhm.o.b(r9)
            goto L9d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Exception -> L3c
            goto L5a
        L3c:
            r9 = move-exception
            goto L5d
        L3e:
            yhm.o.b(r9)
            r0.u = r8     // Catch: java.lang.Exception -> L3c
            r0.f254338x = r6     // Catch: java.lang.Exception -> L3c
            wh8.j r9 = r4.f254330a     // Catch: java.lang.Exception -> L3c
            x4l.c r9 = r9.d     // Catch: java.lang.Exception -> L3c
            java.lang.Object r9 = r9.d(r8, r6, r0)     // Catch: java.lang.Exception -> L3c
            if (r9 != r1) goto L50
            goto L52
        L50:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L3c
        L52:
            if (r9 != r1) goto L55
            goto L57
        L55:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L3c
        L57:
            if (r9 != r1) goto L5a
            goto L9c
        L5a:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Exception -> L3c
            goto L66
        L5d:
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r6 = rd0.d.f253311a
            rd0.c r6 = rd0.c.ERROR
            rd0.d.a(r6, r3, r3, r9, r2)
        L66:
            r4.getClass()
            java.lang.String r9 = "juniorId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            w4l.j r2 = w4l.j.f294644c
            java.lang.String r6 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            wh8.j r4 = r4.f254330a
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            x4l.c r9 = r4.d
            vkm.d r8 = r9.b(r8, r2)
            zfd.e r8 = zi0.c.w(r8)
            rg3.d r9 = new rg3.d
            r2 = 13
            r9.<init>(r2)
            akg.n r8 = nim.a.v(r8, r9)
            r0.u = r3
            r0.f254338x = r5
            java.lang.Object r9 = vkm.q.z(r8, r0)
            if (r9 != r1) goto L9d
        L9c:
            return r1
        L9d:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            if (r9 == 0) goto La8
            java.lang.Object r8 = r9.getContent()
            r3 = r8
            mh8.g r3 = (mh8.g) r3
        La8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.k0.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rh8.h0
            if (r0 == 0) goto L13
            r0 = r9
            rh8.h0 r0 = (rh8.h0) r0
            int r1 = r0.f254341w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254341w = r1
            goto L18
        L13:
            rh8.h0 r0 = new rh8.h0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254341w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r9)
            goto L75
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r9)
            ih0.b r9 = r7.f254351b     // Catch: java.lang.Exception -> L49
            java.lang.String r2 = "EID_YOUTH_WORKFLOW_POST_ONBOARDING_POLLING_TIME_SECONDS"
            ii0.b r9 = (ii0.b) r9     // Catch: java.lang.Exception -> L49
            long r5 = r9.d(r2)     // Catch: java.lang.Exception -> L49
            int r9 = (int) r5     // Catch: java.lang.Exception -> L49
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L49
            if (r4 > r9) goto L53
            r5 = 301(0x12d, float:4.22E-43)
            if (r9 >= r5) goto L53
            goto L54
        L49:
            r9 = move-exception
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            rd0.d.a(r5, r3, r3, r9, r2)
        L53:
            r2 = r3
        L54:
            if (r2 == 0) goto L5b
            int r9 = r2.intValue()
            goto L5d
        L5b:
            r9 = 30
        L5d:
            kotlin.time.b$a r2 = kotlin.time.b.INSTANCE
            pkm.e r2 = pkm.e.SECONDS
            long r5 = kotlin.time.c.g(r9, r2)
            r83.g r9 = new r83.g
            r2 = 20
            r9.<init>(r7, r8, r3, r2)
            r0.f254341w = r4
            java.lang.Object r9 = skm.h2.e(r5, r9, r0)
            if (r9 != r1) goto L75
            return r1
        L75:
            mh8.k r9 = (mh8.k) r9
            if (r9 != 0) goto L8b
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r9 = "Couldn't retrieve post onboarding navigation in timely manner"
            r8.<init>(r9)
            zhm.h0 r9 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r8, r9)
            mh8.i r9 = mh8.i.f205430a
        L8b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.k0.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rh8.j0
            if (r0 == 0) goto L13
            r0 = r6
            rh8.j0 r0 = (rh8.j0) r0
            int r1 = r0.f254347w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f254347w = r1
            goto L18
        L13:
            rh8.j0 r0 = new rh8.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f254347w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            r0.f254347w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            mh8.g r6 = (mh8.g) r6
            r5 = 0
            if (r6 == 0) goto L43
            mh8.f r0 = r6.f205429b
            goto L44
        L43:
            r0 = r5
        L44:
            r1 = -1
            if (r0 != 0) goto L49
            r0 = r1
            goto L51
        L49:
            int[] r2 = rh8.f0.f254335a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L51:
            if (r0 == r1) goto L6c
            if (r0 == r3) goto L65
            r6 = 2
            if (r0 == r6) goto L62
            r6 = 3
            if (r0 != r6) goto L5c
            goto L6c
        L5c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L62:
            mh8.i r5 = mh8.i.f205430a
            return r5
        L65:
            mh8.j r5 = new mh8.j
            java.lang.String r6 = r6.f205428a
            r5.<init>(r6)
        L6c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rh8.k0.d(java.lang.String, gim.c):java.lang.Object");
    }
}
