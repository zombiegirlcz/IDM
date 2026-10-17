package mfa;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import wim.z;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfa.e f204982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f204983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x9k.a f204984c;

    public l(qfa.e repository, gte.a featureToggleInteractor, x9k.a pcwAuthInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(pcwAuthInteractor, "pcwAuthInteractor");
        this.f204982a = repository;
        this.f204983b = featureToggleInteractor;
        this.f204984c = pcwAuthInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mfa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mfa.i
            if (r0 == 0) goto L13
            r0 = r7
            mfa.i r0 = (mfa.i) r0
            int r1 = r0.f204977w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204977w = r1
            goto L1a
        L13:
            mfa.i r0 = new mfa.i
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204977w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            qfa.e r7 = r6.f204982a
            ue0.c r7 = r7.f245284c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "POST_ACTIVATION_STEP_CONTACTS_SYNC_SEEN"
            java.lang.Object r7 = z9h.n.h(r4, r7, r5, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7d
            r0.f204977w = r3
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L59
            zhm.f0 r7 = zhm.f0.f322471a
        L59:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof ofa.r
            if (r2 == 0) goto L64
            r0.add(r1)
            goto L64
        L76:
            java.lang.Object r7 = zhm.d0.d0(r0)
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            r3 = 0
        L7e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.l.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x011e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00df A[EDGE_INSN: B:192:0x00df->B:50:0x00df BREAK  A[LOOP:9: B:45:0x00bf->B:193:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    @Override // mfa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.l.b(boolean, gim.c):java.lang.Object");
    }

    @Override // mfa.a
    public final Object c(rfa.e eVar) {
        this.f204982a.a();
        return Unit.f186387a;
    }

    @Override // mfa.a
    public final void d() {
        ue0.c cVar = this.f204982a.f245284c;
        cVar.G(Boolean.TRUE, "POST_ACTIVATION_COMPLETED_KEY", z.d(o0.b(Boolean.TYPE)));
        cVar.I0("POST_ACTIVATION_NEEDED_KEY");
    }

    @Override // mfa.a
    public final Object e(rfa.e eVar) {
        this.f204982a.b();
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mfa.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mfa.j
            if (r0 == 0) goto L13
            r0 = r7
            mfa.j r0 = (mfa.j) r0
            int r1 = r0.f204978w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204978w = r1
            goto L1a
        L13:
            mfa.j r0 = new mfa.j
            gim.c r7 = (gim.c) r7
            r0.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204978w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L53
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            yhm.o.b(r7)
            qfa.e r7 = r6.f204982a
            ue0.c r7 = r7.f245284c
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            java.lang.Class r4 = java.lang.Boolean.TYPE
            java.lang.String r5 = "POST_ACTIVATION_STEP_PROFILE_SEEN"
            java.lang.Object r7 = z9h.n.h(r4, r7, r5, r2)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L7d
            r0.f204978w = r3
            java.lang.Object r7 = r6.g(r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L59
            zhm.f0 r7 = zhm.f0.f322471a
        L59:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L64:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L76
            java.lang.Object r1 = r7.next()
            boolean r2 = r1 instanceof ofa.w
            if (r2 == 0) goto L64
            r0.add(r1)
            goto L64
        L76:
            java.lang.Object r7 = zhm.d0.d0(r0)
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            r3 = 0
        L7e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.l.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof mfa.h
            if (r0 == 0) goto L13
            r0 = r6
            mfa.h r0 = (mfa.h) r0
            int r1 = r0.f204976w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204976w = r1
            goto L18
        L13:
            mfa.h r0 = new mfa.h
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204976w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L59
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            qfa.e r6 = r5.f204982a
            r6.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.h r4 = w4l.h.f294642c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r6 = r6.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r6 = r6.b(r2, r4)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.d(r6, r2)
            zfd.e r6 = zi0.c.w(r6)
            r0.f204976w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L59
            return r1
        L59:
            com.revolut.data.model.Data r6 = (com.revolut.data.model.Data) r6
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.getContent()
            java.util.List r6 = (java.util.List) r6
            return r6
        L64:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mfa.l.g(gim.c):java.lang.Object");
    }
}
