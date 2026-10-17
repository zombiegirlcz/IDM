package ce4;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements pf4.v, nf4.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginFlowContract$Input f23374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nx3.a f23375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public wy3.j f23376c;
    public wy3.j d;
    public final z1 e;
    public final z1 f;

    public n(PluginFlowContract$Input inputData, nx3.a mortgageOfferInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mortgageOfferInteractor, "mortgageOfferInteractor");
        this.f23374a = inputData;
        this.f23375b = mortgageOfferInteractor;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        this.e = vkm.q.b(0, 2, fVar);
        this.f = vkm.q.b(0, 2, fVar);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public static cv3.a k(wy3.j jVar, String screenId) {
        jVar.getClass();
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        wy3.i iVar = (wy3.i) jVar.f301079c.get(screenId);
        cv3.a aVar = iVar instanceof wy3.d ? ((wy3.d) iVar).f301070a : iVar instanceof wy3.f ? ((wy3.f) iVar).f301073a.f18669b : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Missing CalculatorContent for ".concat(screenId).toString());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static cv3.s l(wy3.j jVar, String screenId) {
        jVar.getClass();
        Intrinsics.checkNotNullParameter(screenId, "screenId");
        wy3.i iVar = (wy3.i) jVar.f301079c.get(screenId);
        wy3.g gVar = iVar instanceof wy3.g ? (wy3.g) iVar : null;
        cv3.s sVar = gVar != null ? gVar.f301074a : null;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Missing OfferContent for ".concat(screenId).toString());
    }

    @Override // nf4.l
    public final z1 a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ce4.e
            if (r0 == 0) goto L13
            r0 = r7
            ce4.e r0 = (ce4.e) r0
            int r1 = r0.f23353y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23353y = r1
            goto L18
        L13:
            ce4.e r0 = new ce4.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f23351w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23353y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
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
            ce4.n r6 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r7)
            goto L52
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.v = r5
            r0.f23353y = r4
            wy3.j r7 = r5.d
            if (r7 != 0) goto L4d
            java.lang.Object r7 = r5.h(r0)
            java.io.Serializable r7 = (java.io.Serializable) r7
        L4d:
            if (r7 != r1) goto L50
            goto L61
        L50:
            r2 = r6
            r6 = r5
        L52:
            wy3.j r7 = (wy3.j) r7
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f23353y = r3
            java.lang.Object r6 = r6.m(r7, r2, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ce4.c
            if (r0 == 0) goto L13
            r0 = r11
            ce4.c r0 = (ce4.c) r0
            int r1 = r0.f23347y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23347y = r1
            goto L18
        L13:
            ce4.c r0 = new ce4.c
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f23345w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23347y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            return r11
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            ft3.h1 r2 = r0.v
            nx3.a r4 = r0.u
            yhm.o.b(r11)
        L39:
            r6 = r2
            goto L57
        L3b:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r11 = r10.f23374a
            ft3.h1 r2 = r11.a9()
            nx3.a r11 = r10.f23375b
            r0.u = r11
            r0.v = r2
            r0.f23347y = r4
            java.lang.Object r4 = r10.h(r0)
            if (r4 != r1) goto L53
            goto L77
        L53:
            r6 = r4
            r4 = r11
            r11 = r6
            goto L39
        L57:
            wy3.j r11 = (wy3.j) r11
            cv3.u r7 = r11.f301077a
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f23347y = r3
            r34.b r5 = r4.f220118a
            r5.getClass()
            r34.a r4 = new r34.a
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L78
        L77:
            return r1
        L78:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r9 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (kotlin.Unit.f186387a == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ce4.d
            if (r0 == 0) goto L13
            r0 = r10
            ce4.d r0 = (ce4.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            ce4.d r0 = new ce4.d
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f23349x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r10)
            goto La5
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            ce4.n r9 = r0.v
            cv3.a r9 = (cv3.a) r9
            yhm.o.b(r10)
            goto L91
        L3f:
            int r9 = r0.f23348w
            ce4.n r2 = r0.v
            java.lang.String r3 = r0.u
            yhm.o.b(r10)
            r7 = r2
            r2 = r9
            r9 = r3
            r3 = r7
            goto L69
        L4d:
            yhm.o.b(r10)
            wy3.j r10 = r8.d
            if (r10 != 0) goto L56
            r2 = r5
            goto L57
        L56:
            r2 = 0
        L57:
            if (r2 == 0) goto L94
            r0.u = r9
            r0.v = r8
            r0.f23348w = r2
            r0.z = r5
            java.lang.Object r10 = r8.h(r0)
            if (r10 != r1) goto L68
            goto La4
        L68:
            r3 = r8
        L69:
            wy3.j r10 = (wy3.j) r10
            r3.getClass()
            cv3.a r9 = k(r10, r9)
            cv3.u r10 = new cv3.u
            java.util.List r9 = r9.e
            java.util.Map r9 = d9.e1.s(r9)
            r10.<init>(r9)
            r0.u = r6
            r0.v = r6
            r0.f23348w = r2
            r0.z = r4
            java.io.Serializable r9 = r8.n(r10, r0)
            if (r9 != r1) goto L8c
            goto L8e
        L8c:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L8e:
            if (r9 != r1) goto L91
            goto La4
        L91:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L94:
            r0.u = r6
            r0.f23348w = r2
            r0.z = r3
            if (r10 == 0) goto L9e
            r8.f23376c = r10
        L9e:
            r8.d = r6
            kotlin.Unit r9 = kotlin.Unit.f186387a
            if (r9 != r1) goto La5
        La4:
            return r1
        La5:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.d(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // pf4.v
    public final z1 e() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ce4.g
            if (r0 == 0) goto L13
            r0 = r7
            ce4.g r0 = (ce4.g) r0
            int r1 = r0.f23357y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23357y = r1
            goto L18
        L13:
            ce4.g r0 = new ce4.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f23355w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23357y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ce4.n r6 = r0.v
            java.lang.String r0 = r0.u
            yhm.o.b(r7)
            goto L4e
        L3a:
            yhm.o.b(r7)
            if (r6 == 0) goto L58
            r0.u = r6
            r0.v = r5
            r0.f23357y = r4
            java.lang.Object r7 = r5.h(r0)
            if (r7 != r1) goto L4c
            goto L63
        L4c:
            r0 = r6
            r6 = r5
        L4e:
            wy3.j r7 = (wy3.j) r7
            r6.getClass()
            cv3.s r6 = l(r7, r0)
            return r6
        L58:
            r6 = 0
            r0.u = r6
            r0.f23357y = r3
            java.lang.Object r7 = r5.h(r0)
            if (r7 != r1) goto L64
        L63:
            return r1
        L64:
            wy3.j r7 = (wy3.j) r7
            cv3.s r6 = r7.f301078b
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.f(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pf4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.lang.String r5, cv3.u r6, gim.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ce4.l
            if (r0 == 0) goto L13
            r0 = r7
            ce4.l r0 = (ce4.l) r0
            int r1 = r0.f23370x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23370x = r1
            goto L18
        L13:
            ce4.l r0 = new ce4.l
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23370x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            r0.u = r5
            r0.f23370x = r3
            java.io.Serializable r7 = r4.n(r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            wy3.j r7 = (wy3.j) r7
            if (r5 == 0) goto L48
            cv3.s r5 = l(r7, r5)
            return r5
        L48:
            cv3.s r5 = r7.f301078b
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.g(java.lang.String, cv3.u, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof ce4.f
            if (r0 == 0) goto L13
            r0 = r7
            ce4.f r0 = (ce4.f) r0
            int r1 = r0.f23354w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23354w = r1
            goto L18
        L13:
            ce4.f r0 = new ce4.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23354w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            wy3.j r7 = r6.f23376c
            if (r7 != 0) goto L5c
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r7 = r6.f23374a
            ft3.h1 r7 = r7.a9()
            r0.f23354w = r3
            nx3.a r2 = r6.f23375b
            r34.b r2 = r2.f220118a
            r2.getClass()
            qu4.s r3 = new qu4.s
            r4 = 0
            r5 = 21
            r3.<init>(r2, r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            wy3.j r7 = (wy3.j) r7
            r6.f23376c = r7
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r8, cv3.u r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof ce4.j
            if (r0 == 0) goto L13
            r0 = r10
            ce4.j r0 = (ce4.j) r0
            int r1 = r0.f23366y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23366y = r1
            goto L18
        L13:
            ce4.j r0 = new ce4.j
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f23364w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23366y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L8a
        L3c:
            cv3.u r9 = r0.v
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L5a
        L44:
            yhm.o.b(r10)
            r0.u = r8
            r0.v = r9
            r0.f23366y = r5
            wy3.j r10 = r7.d
            if (r10 != 0) goto L57
            java.lang.Object r10 = r7.h(r0)
            java.io.Serializable r10 = (java.io.Serializable) r10
        L57:
            if (r10 != r1) goto L5a
            goto L9a
        L5a:
            wy3.j r10 = (wy3.j) r10
            cv3.u r10 = r10.f301077a
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r2 = r7.f23374a
            ft3.h1 r2 = r2.a9()
            java.lang.String r5 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            java.util.Map r5 = r10.f109270a
            java.util.Map r9 = r9.f109270a
            java.util.LinkedHashMap r9 = zhm.r0.p(r5, r9)
            java.lang.String r5 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r5)
            cv3.u r5 = new cv3.u
            r5.<init>(r9)
            r0.u = r8
            r0.v = r6
            r0.f23366y = r4
            nx3.a r9 = r7.f23375b
            java.lang.Object r10 = r9.a(r2, r10, r5, r0)
            if (r10 != r1) goto L8a
            goto L9a
        L8a:
            wy3.j r10 = (wy3.j) r10
            r7.d = r10
            r0.u = r6
            r0.v = r6
            r0.f23366y = r3
            java.lang.Object r8 = r7.m(r10, r8, r0)
            if (r8 != r1) goto L9b
        L9a:
            return r1
        L9b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.i(java.lang.String, cv3.u, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.util.List r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ce4.h
            if (r0 == 0) goto L13
            r0 = r7
            ce4.h r0 = (ce4.h) r0
            int r1 = r0.f23360y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23360y = r1
            goto L18
        L13:
            ce4.h r0 = new ce4.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f23358w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23360y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            ce4.n r6 = r0.v
            java.util.List r0 = r0.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r7)
            goto L83
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.util.List r6 = r0.u
            java.util.List r6 = (java.util.List) r6
            yhm.o.b(r7)
            goto L51
        L40:
            yhm.o.b(r7)
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r0.u = r7
            r0.f23360y = r4
            java.lang.Object r7 = r5.h(r0)
            if (r7 != r1) goto L51
            goto L81
        L51:
            wy3.j r7 = (wy3.j) r7
            cv3.u r7 = r7.f301077a
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r2 = r5.f23374a
            ft3.h1 r2 = r2.a9()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.String r4 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.Map r4 = r7.f109270a
            java.util.Map r6 = zhm.r0.m(r4, r6)
            java.lang.String r4 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            cv3.u r4 = new cv3.u
            r4.<init>(r6)
            r6 = 0
            r0.u = r6
            r0.v = r5
            r0.f23360y = r3
            nx3.a r6 = r5.f23375b
            java.lang.Object r7 = r6.a(r2, r7, r4, r0)
            if (r7 != r1) goto L82
        L81:
            return r1
        L82:
            r6 = r5
        L83:
            wy3.j r7 = (wy3.j) r7
            r6.d = r7
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.j(java.util.List, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(wy3.j r5, java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof ce4.i
            if (r0 == 0) goto L13
            r0 = r7
            ce4.i r0 = (ce4.i) r0
            int r1 = r0.f23363y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23363y = r1
            goto L18
        L13:
            ce4.i r0 = new ce4.i
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f23361w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23363y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            cv3.u r5 = r0.v
            cv3.a r6 = r0.u
            yhm.o.b(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            cv3.a r6 = k(r5, r6)
            cv3.u r5 = r5.f301077a
            r0.u = r6
            r0.v = r5
            r0.f23363y = r3
            java.lang.Object r7 = r4.h(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            wy3.j r7 = (wy3.j) r7
            cv3.u r7 = r7.f301077a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r7)
            r5 = r5 ^ r3
            nf4.t r7 = new nf4.t
            r7.<init>(r6, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.m(wy3.j, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable n(cv3.u r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ce4.k
            if (r0 == 0) goto L13
            r0 = r7
            ce4.k r0 = (ce4.k) r0
            int r1 = r0.f23368x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23368x = r1
            goto L18
        L13:
            ce4.k r0 = new ce4.k
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23368x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L75
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            cv3.u r6 = r0.u
            yhm.o.b(r7)
            goto L46
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f23368x = r4
            java.lang.Object r7 = r5.h(r0)
            if (r7 != r1) goto L46
            goto L74
        L46:
            wy3.j r7 = (wy3.j) r7
            cv3.u r7 = r7.f301077a
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r2 = r5.f23374a
            ft3.h1 r2 = r2.a9()
            java.lang.String r4 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            java.util.Map r4 = r7.f109270a
            java.util.Map r6 = r6.f109270a
            java.util.LinkedHashMap r6 = zhm.r0.p(r4, r6)
            java.lang.String r4 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r4)
            cv3.u r4 = new cv3.u
            r4.<init>(r6)
            r6 = 0
            r0.u = r6
            r0.f23368x = r3
            nx3.a r6 = r5.f23375b
            java.lang.Object r7 = r6.a(r2, r7, r4, r0)
            if (r7 != r1) goto L75
        L74:
            return r1
        L75:
            wy3.j r7 = (wy3.j) r7
            r5.f23376c = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.n(cv3.u, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof ce4.m
            if (r0 == 0) goto L13
            r0 = r11
            ce4.m r0 = (ce4.m) r0
            int r1 = r0.f23373y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23373y = r1
            goto L18
        L13:
            ce4.m r0 = new ce4.m
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f23371w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f23373y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            return r11
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L32:
            ft3.h1 r2 = r0.v
            nx3.a r4 = r0.u
            yhm.o.b(r11)
        L39:
            r6 = r2
            goto L57
        L3b:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r11 = r10.f23374a
            ft3.h1 r2 = r11.a9()
            nx3.a r11 = r10.f23375b
            r0.u = r11
            r0.v = r2
            r0.f23373y = r4
            java.lang.Object r4 = r10.h(r0)
            if (r4 != r1) goto L53
            goto L77
        L53:
            r6 = r4
            r4 = r11
            r11 = r6
            goto L39
        L57:
            wy3.j r11 = (wy3.j) r11
            cv3.u r7 = r11.f301077a
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f23373y = r3
            r34.b r5 = r4.f220118a
            r5.getClass()
            r34.a r4 = new r34.a
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L78
        L77:
            return r1
        L78:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ce4.n.o(gim.c):java.lang.Object");
    }
}
