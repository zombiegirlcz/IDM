package mf4;

import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData;
import ft3.h1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 implements e {

    @NotNull
    private static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sx3.a f204833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sp3.a f204834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OfferV2FlowContract$InputData f204835c;
    public final z1 d;
    public final z1 e;
    public cv3.b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public cv3.b0 f204836g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cv3.b0 f204837h;
    public cv3.g i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cv3.h f204838j;

    public a0(sx3.a offerInteractor, sp3.a creditDataMonitoringFacade, OfferV2FlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(offerInteractor, "offerInteractor");
        Intrinsics.checkNotNullParameter(creditDataMonitoringFacade, "creditDataMonitoringFacade");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f204833a = offerInteractor;
        this.f204834b = creditDataMonitoringFacade;
        this.f204835c = inputData;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.d = vkm.q.b(0, 2, fVar);
        this.e = vkm.q.b(0, 2, fVar);
    }

    @Override // nf4.l
    public final z1 a() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mf4.j
            if (r0 == 0) goto L13
            r0 = r7
            mf4.j r0 = (mf4.j) r0
            int r1 = r0.f204863w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204863w = r1
            goto L18
        L13:
            mf4.j r0 = new mf4.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204863w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L46
        L36:
            yhm.o.b(r7)
            cv3.b0 r7 = r5.f204836g
            if (r7 != 0) goto L4a
            r0.f204863w = r4
            java.lang.Object r7 = r5.l(r6, r0)
            if (r7 != r1) goto L46
            goto L52
        L46:
            cv3.b0 r7 = (cv3.b0) r7
            r5.f204836g = r7
        L4a:
            r0.f204863w = r3
            java.lang.Object r6 = r5.u(r7, r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.b(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // mh4.r
    public final Object c(h1 h1Var, l40.j jVar) {
        throw new IllegalStateException("OFFER_V2 doesn't support credit to refinance intro dialog");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oc4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mf4.l
            if (r0 == 0) goto L13
            r0 = r5
            mf4.l r0 = (mf4.l) r0
            int r1 = r0.f204868w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204868w = r1
            goto L18
        L13:
            mf4.l r0 = new mf4.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204868w
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
            r0.f204868w = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            cv3.b0 r5 = (cv3.b0) r5
            mu3.b r5 = r5.d
            if (r5 == 0) goto L42
            return r5
        L42:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.d(gim.c):java.lang.Object");
    }

    @Override // pf4.v
    public final z1 e() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r4, gim.c r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof mf4.o
            if (r4 == 0) goto L13
            r4 = r5
            mf4.o r4 = (mf4.o) r4
            int r0 = r4.f204876w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f204876w = r0
            goto L18
        L13:
            mf4.o r4 = new mf4.o
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f204876w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r4.f204876w = r2
            java.lang.Object r5 = r3.o(r4)
            if (r5 != r0) goto L3b
            return r0
        L3b:
            cv3.b0 r5 = (cv3.b0) r5
            cv3.s r4 = r5.f109238b
            if (r4 == 0) goto L42
            return r4
        L42:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.f(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r4, cv3.u r5, gim.c r6) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r6 instanceof mf4.z
            if (r4 == 0) goto L13
            r4 = r6
            mf4.z r4 = (mf4.z) r4
            int r0 = r4.f204903w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f204903w = r0
            goto L18
        L13:
            mf4.z r4 = new mf4.z
            r4.<init>(r3, r6)
        L18:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f204903w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            yhm.o.b(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            r4.f204903w = r2
            java.lang.Object r6 = r3.w(r5, r4)
            if (r6 != r0) goto L3b
            return r0
        L3b:
            cv3.b0 r6 = (cv3.b0) r6
            cv3.s r4 = r6.f109238b
            if (r4 == 0) goto L42
            return r4
        L42:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.g(java.lang.String, cv3.u, gim.c):java.io.Serializable");
    }

    @Override // mh4.r
    public final Flow h(mv3.i refinancingOfferInput, h1 productPayload) {
        Intrinsics.checkNotNullParameter(refinancingOfferInput, "refinancingOfferInput");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        return ngm.n.K(new r(this, refinancingOfferInput, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r11 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[PHI: r2 r9 r10 r11
      0x0089: PHI (r2v4 cv3.d0) = (r2v2 cv3.d0), (r2v6 cv3.d0) binds: [B:32:0x0086, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r9v6 java.lang.String) = (r9v4 java.lang.String), (r9v8 java.lang.String) binds: [B:32:0x0086, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r10v4 sx3.a) = (r10v2 sx3.a), (r10v6 sx3.a) binds: [B:32:0x0086, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x0089: PHI (r11v8 java.lang.Object) = (r11v5 java.lang.Object), (r11v1 java.lang.Object) binds: [B:32:0x0086, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[PHI: r11
      0x00a5: PHI (r11v11 java.lang.Object) = (r11v10 java.lang.Object), (r11v1 java.lang.Object) binds: [B:35:0x00a2, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, cv3.u r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof mf4.w
            if (r0 == 0) goto L13
            r0 = r11
            mf4.w r0 = (mf4.w) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mf4.w r0 = new mf4.w
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f204896y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L51
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            sx3.a r9 = r0.f204894w
            cv3.b0 r9 = (cv3.b0) r9
            yhm.o.b(r11)
            return r11
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            yhm.o.b(r11)
            goto La5
        L41:
            java.lang.String r9 = r0.f204895x
            sx3.a r10 = r0.f204894w
            cv3.d0 r2 = r0.v
            yhm.o.b(r11)
            goto L89
        L4b:
            cv3.u r10 = r0.u
            yhm.o.b(r11)
            goto L63
        L51:
            yhm.o.b(r11)
            cv3.b0 r11 = r8.f204836g
            if (r11 != 0) goto L65
            r0.u = r10
            r0.A = r6
            java.lang.Object r11 = r8.l(r9, r0)
            if (r11 != r1) goto L63
            goto Lb7
        L63:
            cv3.b0 r11 = (cv3.b0) r11
        L65:
            cv3.d0 r9 = r11.f109237a
            if (r9 == 0) goto L6f
            cv3.d0 r9 = r9.a(r10)
            r2 = r9
            goto L70
        L6f:
            r2 = r7
        L70:
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r9 = r8.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r9 = r9.f68090b
            java.lang.String r9 = r9.f66892b
            r0.u = r7
            r0.v = r2
            sx3.a r10 = r8.f204833a
            r0.f204894w = r10
            r0.f204895x = r9
            r0.A = r5
            java.lang.Enum r11 = r8.p(r0)
            if (r11 != r1) goto L89
            goto Lb7
        L89:
            cv3.h r11 = (cv3.h) r11
            cv3.c0$a r5 = cv3.c0.Companion
            r5.getClass()
            cv3.c0 r2 = cv3.c0.a.a(r2)
            r0.u = r7
            r0.v = r7
            r0.f204894w = r7
            r0.f204895x = r7
            r0.A = r4
            java.lang.Object r11 = r10.a(r9, r11, r2, r0)
            if (r11 != r1) goto La5
            goto Lb7
        La5:
            cv3.b0 r11 = (cv3.b0) r11
            r8.f204836g = r11
            r0.u = r7
            r0.v = r7
            r0.f204894w = r7
            r0.A = r3
            java.lang.Object r9 = r8.u(r11, r0)
            if (r9 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.i(java.lang.String, cv3.u, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.j(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable k(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mf4.i
            if (r0 == 0) goto L13
            r0 = r5
            mf4.i r0 = (mf4.i) r0
            int r1 = r0.f204861w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204861w = r1
            goto L18
        L13:
            mf4.i r0 = new mf4.i
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204861w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            cv3.b0 r5 = r4.f
            if (r5 != 0) goto L41
            r0.f204861w = r3
            java.lang.Object r5 = r4.o(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cv3.b0 r5 = (cv3.b0) r5
        L41:
            cv3.d0 r5 = r5.f109237a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.k(gim.c):java.io.Serializable");
    }

    public final Object l(String str, gim.c cVar) {
        cv3.b0.Companion.getClass();
        cv3.y yVarA = cv3.z.a(str);
        int i = yVarA == null ? -1 : g.f204853a[yVarA.ordinal()];
        if (i == 1) {
            return o(cVar);
        }
        if (i == 2) {
            return m(cVar);
        }
        throw new IllegalStateException("Unknown id for calculator screen");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mf4.k
            if (r0 == 0) goto L13
            r0 = r5
            mf4.k r0 = (mf4.k) r0
            int r1 = r0.f204866w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204866w = r1
            goto L18
        L13:
            mf4.k r0 = new mf4.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204866w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            cv3.b0 r5 = r4.f204837h
            if (r5 != 0) goto L43
            r0.f204866w = r3
            java.lang.Object r5 = r4.t(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cv3.b0 r5 = (cv3.b0) r5
            r4.f204837h = r5
        L43:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.m(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof mf4.m
            if (r0 == 0) goto L13
            r0 = r7
            mf4.m r0 = (mf4.m) r0
            int r1 = r0.f204871w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204871w = r1
            goto L18
        L13:
            mf4.m r0 = new mf4.m
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204871w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            r7 = 0
            r6.f = r7
            r6.f204836g = r7
            r6.f204837h = r7
            cv3.g r2 = r6.i
            if (r2 != 0) goto L69
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r2 = r6.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r2 = r2.f68090b
            java.lang.String r2 = r2.f66892b
            r0.f204871w = r3
            sx3.a r3 = r6.f204833a
            w34.b r3 = r3.f266355a
            r3.getClass()
            vnl.o r4 = new vnl.o
            r5 = 24
            r4.<init>(r3, r2, r7, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r4, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            cv3.g r7 = (cv3.g) r7
            r6.i = r7
            cv3.h r0 = r7.l5()
            r6.f204838j = r0
            return r7
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.n(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mf4.n
            if (r0 == 0) goto L13
            r0 = r5
            mf4.n r0 = (mf4.n) r0
            int r1 = r0.f204873w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204873w = r1
            goto L18
        L13:
            mf4.n r0 = new mf4.n
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204873w
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
            r0.f204873w = r3
            java.lang.Object r5 = r4.t(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            r0 = r5
            cv3.b0 r0 = (cv3.b0) r0
            r4.f = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum p(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mf4.p
            if (r0 == 0) goto L13
            r0 = r5
            mf4.p r0 = (mf4.p) r0
            int r1 = r0.f204877w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204877w = r1
            goto L18
        L13:
            mf4.p r0 = new mf4.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204877w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            cv3.h r5 = r4.f204838j
            if (r5 != 0) goto L50
            r0.f204877w = r3
            java.io.Serializable r5 = r4.n(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            cv3.g r5 = (cv3.g) r5
            cv3.h r5 = r5.l5()
            if (r5 == 0) goto L48
            return r5
        L48:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r5.<init>(r0)
            throw r5
        L50:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.p(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r15 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(int r14, gim.c r15) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r15 instanceof mf4.q
            if (r0 == 0) goto L13
            r0 = r15
            mf4.q r0 = (mf4.q) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mf4.q r0 = new mf4.q
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f204880y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r15)
            return r15
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            int r14 = r0.u
            java.lang.String r2 = r0.f204879x
            sx3.a r4 = r0.f204878w
            cv3.d0 r5 = r0.v
            yhm.o.b(r15)
            goto L90
        L41:
            int r14 = r0.u
            yhm.o.b(r15)
            goto L60
        L47:
            yhm.o.b(r15)
            cv3.b0 r15 = r13.f204836g
            if (r15 == 0) goto L55
            cv3.d0 r15 = r15.f109237a
            if (r15 != 0) goto L53
            goto L55
        L53:
            r5 = r15
            goto L63
        L55:
            r0.u = r14
            r0.A = r5
            java.io.Serializable r15 = r13.k(r0)
            if (r15 != r1) goto L60
            goto Lac
        L60:
            cv3.d0 r15 = (cv3.d0) r15
            goto L53
        L63:
            if (r5 == 0) goto Lae
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r14)
            r10 = 0
            r11 = 59
            r6 = 0
            r7 = 0
            r9 = 0
            cv3.d0 r5 = cv3.d0.b(r5, r6, r7, r8, r9, r10, r11)
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r15 = r13.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r15 = r15.f68090b
            java.lang.String r2 = r15.f66892b
            r0.v = r5
            sx3.a r15 = r13.f204833a
            r0.f204878w = r15
            r0.f204879x = r2
            r0.u = r14
            r0.A = r4
            java.lang.Enum r4 = r13.p(r0)
            if (r4 != r1) goto L8d
            goto Lac
        L8d:
            r12 = r4
            r4 = r15
            r15 = r12
        L90:
            cv3.h r15 = (cv3.h) r15
            cv3.c0$a r6 = cv3.c0.Companion
            r6.getClass()
            cv3.c0 r5 = cv3.c0.a.a(r5)
            r6 = 0
            r0.v = r6
            r0.f204878w = r6
            r0.f204879x = r6
            r0.u = r14
            r0.A = r3
            java.lang.Object r14 = r4.a(r2, r15, r5, r0)
            if (r14 != r1) goto Lad
        Lac:
            return r1
        Lad:
            return r14
        Lae:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r15 = "Required value was null."
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.q(int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable r(int r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mf4.s
            if (r0 == 0) goto L13
            r0 = r6
            mf4.s r0 = (mf4.s) r0
            int r1 = r0.f204884w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204884w = r1
            goto L18
        L13:
            mf4.s r0 = new mf4.s
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204884w
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
            r0.f204884w = r3
            java.lang.Object r6 = r4.q(r5, r0)
            if (r6 != r1) goto L3b
            return r1
        L3b:
            cv3.b0 r6 = (cv3.b0) r6
            hu3.a r5 = r6.f109240g
            if (r5 == 0) goto L42
            return r5
        L42:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "repaymentDaySelection is missing in the offer response"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.r(int, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(gim.c r12) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r12 instanceof mf4.t
            if (r0 == 0) goto L13
            r0 = r12
            mf4.t r0 = (mf4.t) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            mf4.t r0 = new mf4.t
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f204886x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L40
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r12)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L35:
            java.lang.String r2 = r0.f204885w
            sx3.a r4 = r0.v
            cv3.d0 r5 = r0.u
            yhm.o.b(r12)
        L3e:
            r6 = r2
            goto L6e
        L40:
            yhm.o.b(r12)
            goto L50
        L44:
            yhm.o.b(r12)
            r0.z = r5
            java.io.Serializable r12 = r11.k(r0)
            if (r12 != r1) goto L50
            goto L99
        L50:
            r5 = r12
            cv3.d0 r5 = (cv3.d0) r5
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r12 = r11.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r12 = r12.f68090b
            java.lang.String r2 = r12.f66892b
            r0.u = r5
            sx3.a r12 = r11.f204833a
            r0.v = r12
            r0.f204885w = r2
            r0.z = r4
            java.lang.Enum r4 = r11.p(r0)
            if (r4 != r1) goto L6a
            goto L99
        L6a:
            r6 = r4
            r4 = r12
            r12 = r6
            goto L3e
        L6e:
            r7 = r12
            cv3.h r7 = (cv3.h) r7
            cv3.c0$a r12 = cv3.c0.Companion
            r12.getClass()
            cv3.c0 r8 = cv3.c0.a.a(r5)
            r12 = 0
            r0.u = r12
            r0.v = r12
            r0.f204885w = r12
            r0.z = r3
            w34.b r5 = r4.f266355a
            r5.getClass()
            w34.a r4 = new w34.a
            r9 = 0
            r10 = 2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L9a
        L99:
            return r1
        L9a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.s(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(gim.c r14) throws java.lang.Throwable {
        /*
            r13 = this;
            boolean r0 = r14 instanceof mf4.u
            if (r0 == 0) goto L13
            r0 = r14
            mf4.u r0 = (mf4.u) r0
            int r1 = r0.f204890y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204890y = r1
            goto L18
        L13:
            mf4.u r0 = new mf4.u
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.f204888w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204890y
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r3 = r13.f204835c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L34:
            java.lang.String r2 = r0.v
            sx3.a r6 = r0.u
            yhm.o.b(r14)
        L3b:
            r8 = r2
            goto L57
        L3d:
            yhm.o.b(r14)
            cv3.b0 r14 = r13.f
            if (r14 != 0) goto L85
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r14 = r3.f68090b
            java.lang.String r2 = r14.f66892b
            sx3.a r6 = r13.f204833a
            r0.u = r6
            r0.v = r2
            r0.f204890y = r5
            java.lang.Enum r14 = r13.p(r0)
            if (r14 != r1) goto L3b
            goto L84
        L57:
            r9 = r14
            cv3.h r9 = (cv3.h) r9
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r14 = r3.f68090b
            ks3.c r14 = r14.f66895h
            ys3.a r2 = ys3.a.SUMMARY
            if (r14 != r2) goto L64
        L62:
            r10 = r5
            goto L66
        L64:
            r5 = 0
            goto L62
        L66:
            r14 = 0
            r0.u = r14
            r0.v = r14
            r0.f204890y = r4
            w34.b r7 = r6.f266355a
            r7.getClass()
            ack.o r6 = new ack.o
            r11 = 0
            r12 = 28
            r6.<init>(r7, r8, r9, r10, r11, r12)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r14, r6, r0)
            if (r14 != r1) goto L85
        L84:
            return r1
        L85:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.t(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(cv3.b0 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof mf4.v
            if (r0 == 0) goto L13
            r0 = r7
            mf4.v r0 = (mf4.v) r0
            int r1 = r0.f204893y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f204893y = r1
            goto L18
        L13:
            mf4.v r0 = new mf4.v
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f204891w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f204893y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cv3.d0 r6 = r0.v
            cv3.a r0 = r0.u
            yhm.o.b(r7)
            goto L4c
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            cv3.a r7 = r6.f109239c
            if (r7 == 0) goto L57
            cv3.d0 r6 = r6.f109237a
            r0.u = r7
            r0.v = r6
            r0.f204893y = r3
            java.io.Serializable r0 = r5.k(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r4 = r0
            r0 = r7
            r7 = r4
        L4c:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            r6 = r6 ^ r3
            nf4.t r7 = new nf4.t
            r7.<init>(r0, r6)
            return r7
        L57:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Required value was null."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.u(cv3.b0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r1 != r3) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.String r18, gim.c r19) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof mf4.x
            if (r2 == 0) goto L17
            r2 = r1
            mf4.x r2 = (mf4.x) r2
            int r3 = r2.A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.A = r3
            goto L1c
        L17:
            mf4.x r2 = new mf4.x
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f204899y
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.A
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L4c
            if (r4 == r7) goto L45
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L33
            yhm.o.b(r1)
            goto La7
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            java.lang.String r4 = r2.f204898x
            sx3.a r6 = r2.f204897w
            cv3.d0 r7 = r2.v
            yhm.o.b(r1)
            goto L8b
        L45:
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            r14 = r4
            goto L5e
        L4c:
            yhm.o.b(r1)
            r1 = r18
            r2.u = r1
            r2.A = r7
            java.io.Serializable r4 = r0.k(r2)
            if (r4 != r3) goto L5c
            goto La6
        L5c:
            r14 = r1
            r1 = r4
        L5e:
            if (r1 == 0) goto Lae
            r9 = r1
            cv3.d0 r9 = (cv3.d0) r9
            r13 = 0
            r15 = 31
            r10 = 0
            r11 = 0
            r12 = 0
            cv3.d0 r7 = cv3.d0.b(r9, r10, r11, r12, r13, r14, r15)
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r1 = r0.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r1 = r1.f68090b
            java.lang.String r4 = r1.f66892b
            r2.u = r8
            r2.v = r7
            sx3.a r1 = r0.f204833a
            r2.f204897w = r1
            r2.f204898x = r4
            r2.A = r6
            java.lang.Enum r6 = r0.p(r2)
            if (r6 != r3) goto L86
            goto La6
        L86:
            r16 = r6
            r6 = r1
            r1 = r16
        L8b:
            cv3.h r1 = (cv3.h) r1
            cv3.c0$a r9 = cv3.c0.Companion
            r9.getClass()
            cv3.c0 r7 = cv3.c0.a.a(r7)
            r2.u = r8
            r2.v = r8
            r2.f204897w = r8
            r2.f204898x = r8
            r2.A = r5
            java.lang.Object r1 = r6.a(r4, r1, r7, r2)
            if (r1 != r3) goto La7
        La6:
            return r3
        La7:
            cv3.b0 r1 = (cv3.b0) r1
            r0.f = r1
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        Lae:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Required value was null."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.v(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r10 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(cv3.u r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof mf4.y
            if (r0 == 0) goto L13
            r0 = r10
            mf4.y r0 = (mf4.y) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            mf4.y r0 = new mf4.y
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f204902y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L46
            if (r2 == r5) goto L40
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            goto L95
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            java.lang.String r9 = r0.f204901x
            sx3.a r2 = r0.f204900w
            cv3.d0 r4 = r0.v
            yhm.o.b(r10)
            goto L79
        L40:
            cv3.u r9 = r0.u
            yhm.o.b(r10)
            goto L54
        L46:
            yhm.o.b(r10)
            r0.u = r9
            r0.A = r5
            java.io.Serializable r10 = r8.k(r0)
            if (r10 != r1) goto L54
            goto L94
        L54:
            if (r10 == 0) goto L9a
            cv3.d0 r10 = (cv3.d0) r10
            cv3.d0 r9 = r10.a(r9)
            com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$InputData r10 = r8.f204835c
            com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration r10 = r10.f68090b
            java.lang.String r10 = r10.f66892b
            r0.u = r6
            r0.v = r9
            sx3.a r2 = r8.f204833a
            r0.f204900w = r2
            r0.f204901x = r10
            r0.A = r4
            java.lang.Enum r4 = r8.p(r0)
            if (r4 != r1) goto L75
            goto L94
        L75:
            r7 = r4
            r4 = r9
            r9 = r10
            r10 = r7
        L79:
            cv3.h r10 = (cv3.h) r10
            cv3.c0$a r5 = cv3.c0.Companion
            r5.getClass()
            cv3.c0 r4 = cv3.c0.a.a(r4)
            r0.u = r6
            r0.v = r6
            r0.f204900w = r6
            r0.f204901x = r6
            r0.A = r3
            java.lang.Object r10 = r2.a(r9, r10, r4, r0)
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            cv3.b0 r10 = (cv3.b0) r10
            r8.f = r10
            return r10
        L9a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Required value was null."
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: mf4.a0.w(cv3.u, gim.c):java.lang.Object");
    }
}
