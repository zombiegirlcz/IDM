package g48;

import com.youTransactor.uCube.rpc.Constants;
import et6.u1;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes13.dex */
public final class r0 implements k38.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f140404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mp.r f140405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k38.d f140406c;
    public final cl3.a d;
    public final wsg.n e;
    public final ne0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4l.f f140407g;

    public r0(ang.f userInteractor, mp.r featureState, k38.d jointRepository, cl3.a contactsInteractor, wsg.n walletInteractor, ne0.d memoryCache) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureState, "featureState");
        Intrinsics.checkNotNullParameter(jointRepository, "jointRepository");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f140404a = userInteractor;
        this.f140405b = featureState;
        this.f140406c = jointRepository;
        this.d = contactsInteractor;
        this.e = walletInteractor;
        this.f = memoryCache;
        final int i = 0;
        final int i2 = 1;
        this.f140407g = new w4l.f(new Function2(this) { // from class: g48.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f140349b;

            {
                this.f140349b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return te0.w.o0(skm.p0.f264003c, new g1k.i(this.f140349b, params, null, 8));
                    default:
                        b0 params2 = (b0) obj2;
                        od0.i invitationOptional = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(invitationOptional, "invitationOptional");
                        this.f140349b.f.f(r0.v(params2), invitationOptional);
                        return Unit.f186387a;
                }
            }
        }, new g1.b(this, 27), new Function2(this) { // from class: g48.a0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f140349b;

            {
                this.f140349b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        b0 params = (b0) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(params, "params");
                        return te0.w.o0(skm.p0.f264003c, new g1k.i(this.f140349b, params, null, 8));
                    default:
                        b0 params2 = (b0) obj2;
                        od0.i invitationOptional = (od0.i) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(invitationOptional, "invitationOptional");
                        this.f140349b.f.f(r0.v(params2), invitationOptional);
                        return Unit.f186387a;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public static String v(b0 b0Var) {
        return a0.d.r(b0Var.a(), zhm.d0.k0(b0Var.b(), null, null, null, 0, new g3e.h(10), 31));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(n38.d0 r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.b(n38.d0, gim.c):java.lang.Object");
    }

    public final akg.n c() {
        return nim.a.v(h(w4l.h.f294642c), new g3e.h(11));
    }

    public final wkm.l d(Set accountStates, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountStates, "accountStates");
        fo3.d dVar = fo3.d.PERSONAL_JOINT;
        fo3.e[] elements = {fo3.e.ACTIVE, fo3.e.LOCKED};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return vkm.q.Q(mo3.a.e(rd0.e.b(zi0.c.J(this.e.g0(dVar, loadingStrategy, kotlin.collections.d.y0(elements)))), new g3e.s(17), new g3e.s(14)), new eh9.j((Continuation) null, this, accountStates, 10));
    }

    public final cxe.u e(Set accountStates, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(accountStates, "accountStates");
        return g(loadingStrategy, new a83.d0(24, accountStates));
    }

    public final u1 f(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new u1(g(w4l.i.f294643c, new f9g.l(accountId, 29)), accountId, 22);
    }

    public final cxe.u g(w4l.k loadingStrategy, Function1 function1) {
        c48.g gVar = (c48.g) this.f140406c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new cxe.u(gVar.i.a(new ba4.x(rd0.e.b(gVar.f21114l.e(Unit.f186387a, loadingStrategy)), gVar, 14)), function1, 1);
    }

    public final cxe.u h(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return e(kotlin.collections.d.y0(elements), loadingStrategy);
    }

    public final cxe.u i(boolean z) {
        return h(z ? w4l.i.f294643c : w4l.h.f294642c);
    }

    public final Flow j(String str, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c48.g gVar = (c48.g) this.f140406c;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return boh.f.e(rd0.e.b(gVar.k.e(Unit.f186387a, loadingStrategy)), new g31.e(this, 3, str, loadingStrategy));
    }

    public final Object k(gim.c cVar) {
        return vkm.q.x(mo3.a.g(rd0.e.b(((c48.g) this.f140406c).f21115m.e(Unit.f186387a, w4l.h.f294642c)), null, new g3e.s(16), 1), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum l(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g48.h0
            if (r0 == 0) goto L13
            r0 = r5
            g48.h0 r0 = (g48.h0) r0
            int r1 = r0.f140374w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140374w = r1
            goto L18
        L13:
            g48.h0 r0 = new g48.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140374w
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
            r0.f140374w = r3
            java.lang.Object r5 = r4.k(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            n38.r r5 = (n38.r) r5
            n38.s r5 = r5.b()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.l(gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g48.i0
            if (r0 == 0) goto L13
            r0 = r5
            g48.i0 r0 = (g48.i0) r0
            int r1 = r0.f140377w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140377w = r1
            goto L18
        L13:
            g48.i0 r0 = new g48.i0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140377w
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
            r0.f140377w = r3
            java.lang.Object r5 = r4.k(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            n38.r r5 = (n38.r) r5
            boolean r5 = r5.a()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.m(gim.c):java.lang.Object");
    }

    public final Boolean n() {
        return Boolean.valueOf(((y91.b) this.f140405b.f207713b).c());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g48.j0
            if (r0 == 0) goto L13
            r0 = r5
            g48.j0 r0 = (g48.j0) r0
            int r1 = r0.f140381w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140381w = r1
            goto L18
        L13:
            g48.j0 r0 = new g48.j0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140381w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f140404a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f140381w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            boolean r5 = te0.w.V(r5)
            r5 = r5 ^ r3
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.o(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g48.k0
            if (r0 == 0) goto L13
            r0 = r5
            g48.k0 r0 = (g48.k0) r0
            int r1 = r0.f140384w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140384w = r1
            goto L18
        L13:
            g48.k0 r0 = new g48.k0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140384w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f140404a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f140384w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            kotlin.jvm.internal.Intrinsics.h(r5)
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L50
            wi0.b r5 = nz8.d.p(r5)
            goto L51
        L50:
            r5 = 0
        L51:
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.p0
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.p(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable q(n38.e0 r23, java.lang.String r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.q(n38.e0, java.lang.String, gim.c):java.io.Serializable");
    }

    public final u1 r() {
        return new u1(vkm.q.q(mo3.a.g(new ahe.l(u0.m(rd0.e.b(this.f140404a.k(false)), h(w4l.h.f294642c)), 4), new g3e.s(15), null, 2)), this, 23);
    }

    public final Object s(boolean z, gim.c cVar) throws Throwable {
        Object objJ = skm.e0.J(skm.p0.f264003c, new ald.m(this, z, null, 18), cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (k38.d.a(r3, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof g48.p0
            if (r0 == 0) goto L13
            r0 = r8
            g48.p0 r0 = (g48.p0) r0
            int r1 = r0.f140399w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140399w = r1
            goto L18
        L13:
            g48.p0 r0 = new g48.p0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140399w
            k38.d r3 = r6.f140406c
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)
            goto L62
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L59
        L38:
            yhm.o.b(r8)
            r0.f140399w = r5
            r8 = r3
            c48.g r8 = (c48.g) r8
            r8.getClass()
            c48.d r2 = new c48.d
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L54
            goto L56
        L54:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L56:
            if (r7 != r1) goto L59
            goto L61
        L59:
            r0.f140399w = r4
            java.lang.Object r7 = k38.d.a(r3, r0)
            if (r7 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.t(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (nim.a.a(r10, r0) != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(com.revolut.core.model.account.AccountId.Joint r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof g48.q0
            if (r0 == 0) goto L13
            r0 = r11
            g48.q0 r0 = (g48.q0) r0
            int r1 = r0.f140401w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140401w = r1
            goto L18
        L13:
            g48.q0 r0 = new g48.q0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140401w
            k38.d r3 = r9.f140406c
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3f
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yhm.o.b(r11)
            goto L8d
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            yhm.o.b(r11)
            goto L7a
        L3b:
            yhm.o.b(r11)
            goto L63
        L3f:
            yhm.o.b(r11)
            java.lang.String r10 = r10.f51412a
            r0.f140401w = r6
            r11 = r3
            c48.g r11 = (c48.g) r11
            r11.getClass()
            c48.d r2 = new c48.d
            r7 = 4
            r8 = 0
            r2.<init>(r11, r10, r8, r7)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r2, r0)
            if (r10 != r1) goto L5e
            goto L60
        L5e:
            kotlin.Unit r10 = kotlin.Unit.f186387a
        L60:
            if (r10 != r1) goto L63
            goto L8c
        L63:
            r0.f140401w = r5
            c48.g r3 = (c48.g) r3
            w4l.f r10 = r3.f21114l
            kotlin.Unit r11 = kotlin.Unit.f186387a
            r2 = 0
            efm.b r10 = r10.g(r11, r2)
            java.lang.Object r10 = nim.a.a(r10, r0)
            if (r10 != r1) goto L77
            r11 = r10
        L77:
            if (r11 != r1) goto L7a
            goto L8c
        L7a:
            wsg.n r10 = r9.e
            efm.b r10 = r10.l0(r6)
            pfm.a r10 = ue0.e.v(r10)
            r0.f140401w = r4
            java.lang.Object r10 = nim.a.a(r10, r0)
            if (r10 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.r0.u(com.revolut.core.model.account.AccountId$Joint, gim.c):java.lang.Object");
    }
}
