package dfj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.a1 f114130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ynj.i f114131b;

    public v2(nfj.a1 repository, ynj.i defaultPollingDurationProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(defaultPollingDurationProvider, "defaultPollingDurationProvider");
        this.f114130a = repository;
        this.f114131b = defaultPollingDurationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dfj.v2 r14, nfj.a1 r15, dej.q1 r16, kotlin.jvm.functions.Function1 r17, gim.c r18) throws java.lang.Throwable {
        /*
            r0 = r16
            r1 = r18
            r14.getClass()
            boolean r2 = r1 instanceof dfj.q2
            if (r2 == 0) goto L1a
            r2 = r1
            dfj.q2 r2 = (dfj.q2) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.B = r3
            goto L1f
        L1a:
            dfj.q2 r2 = new dfj.q2
            r2.<init>(r14, r1)
        L1f:
            java.lang.Object r1 = r2.z
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.B
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L50
            if (r4 == r6) goto L3c
            if (r4 != r5) goto L34
            kotlin.jvm.internal.Ref$ObjectRef r14 = r2.f114078x
            yhm.o.b(r1)
            goto L95
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3c:
            kotlin.jvm.internal.Ref$ObjectRef r15 = r2.f114079y
            kotlin.jvm.internal.Ref$ObjectRef r0 = r2.f114078x
            kotlin.jvm.functions.Function1 r4 = r2.f114077w
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            dej.q1 r6 = r2.v
            nfj.a1 r7 = r2.u
            yhm.o.b(r1)
            r8 = r0
            r9 = r4
            r10 = r6
            r12 = r7
            goto L74
        L50:
            kotlin.jvm.internal.Ref$ObjectRef r1 = p.a.w(r1)
            java.lang.String r4 = r0.f113625a
            r2.u = r15
            r2.v = r0
            r7 = r17
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r2.f114077w = r7
            r2.f114078x = r1
            r2.f114079y = r1
            r2.B = r6
            java.lang.Object r4 = r14.b(r15, r4, r2)
            if (r4 != r3) goto L6d
            goto L93
        L6d:
            r12 = r15
            r9 = r17
            r10 = r0
            r15 = r1
            r8 = r15
            r1 = r4
        L74:
            r15.f186409a = r1
            long r0 = r10.f113627c
            ac8.h r6 = new ac8.h
            r13 = 0
            r7 = 2
            r11 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r14 = 0
            r2.u = r14
            r2.v = r14
            r2.f114077w = r14
            r2.f114078x = r8
            r2.f114079y = r14
            r2.B = r5
            java.lang.Object r14 = skm.h2.e(r0, r6, r2)
            if (r14 != r3) goto L94
        L93:
            return r3
        L94:
            r14 = r8
        L95:
            java.lang.Object r14 = r14.f186409a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v2.a(dfj.v2, nfj.a1, dej.q1, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nfj.a1 r6, java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof dfj.m2
            if (r0 == 0) goto L13
            r0 = r8
            dfj.m2 r0 = (dfj.m2) r0
            int r1 = r0.f114042x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114042x = r1
            goto L18
        L13:
            dfj.m2 r0 = new dfj.m2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114042x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            r0.u = r7
            r0.f114042x = r4
            nfj.m1 r6 = (nfj.m1) r6
            r6.getClass()
            n3j.w r8 = new n3j.w
            r2 = 24
            r4 = 0
            r8.<init>(r6, r4, r3, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r6, r8, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r6 = r8.iterator()
        L57:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L6d
            java.lang.Object r8 = r6.next()
            r0 = r8
            com.revolut.retail.feature.esim.api.model.EsimProfile r0 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r0
            java.lang.String r0 = r0.f100423a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r0 == 0) goto L57
            return r8
        L6d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v2.b(nfj.a1, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dfj.n2
            if (r0 == 0) goto L13
            r0 = r7
            dfj.n2 r0 = (dfj.n2) r0
            int r1 = r0.f114051x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114051x = r1
            goto L18
        L13:
            dfj.n2 r0 = new dfj.n2
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114051x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            r0.u = r6
            r0.f114051x = r3
            nfj.a1 r7 = r5.f114130a
            nfj.m1 r7 = (nfj.m1) r7
            ne0.j r0 = r7.f214988b
            java.lang.String r2 = "PROFILES_KEY"
            java.lang.Object r0 = r0.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L60
            ue0.c r7 = r7.f214989c
            java.lang.reflect.Type r0 = nfj.m1.i
            java.lang.Object r7 = r7.T2(r2, r0)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5a
            java.util.ArrayList r7 = ofj.m.b(r7)
            goto L5b
        L5a:
            r7 = r4
        L5b:
            if (r7 != 0) goto L61
            zhm.f0 r7 = zhm.f0.f322471a
            goto L61
        L60:
            r7 = r0
        L61:
            if (r7 != r1) goto L64
            return r1
        L64:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L6a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r7.next()
            r1 = r0
            com.revolut.retail.feature.esim.api.model.EsimProfile r1 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r1
            com.revolut.retail.feature.esim.api.model.EsimProfileDetails r1 = r1.f100426g
            if (r1 == 0) goto L7e
            java.lang.String r1 = r1.f100433a
            goto L7f
        L7e:
            r1 = r4
        L7f:
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r6)
            if (r1 == 0) goto L6a
            return r0
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v2.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, w4l.k r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof dfj.o2
            if (r0 == 0) goto L13
            r0 = r9
            dfj.o2 r0 = (dfj.o2) r0
            int r1 = r0.f114059x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114059x = r1
            goto L18
        L13:
            dfj.o2 r0 = new dfj.o2
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114059x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L5b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            nfj.a1 r9 = r6.f114130a
            nfj.m1 r9 = (nfj.m1) r9
            r9.getClass()
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            x4l.c r9 = r9.e
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r8 = r9.b(r2, r8)
            d4f.m r9 = new d4f.m
            r2 = 2
            r5 = 3
            r9.<init>(r2, r5, r4)
            r0.u = r7
            r0.f114059x = r3
            java.lang.Object r9 = vkm.q.A(r8, r9, r0)
            if (r9 != r1) goto L5b
            return r1
        L5b:
            com.revolut.data.model.Data r9 = (com.revolut.data.model.Data) r9
            if (r9 == 0) goto L85
            java.lang.Object r8 = r9.getContent()
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L85
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L6d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L83
            java.lang.Object r9 = r8.next()
            r0 = r9
            com.revolut.retail.feature.esim.api.model.EsimProfile r0 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r0
            java.lang.String r0 = r0.f100423a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r7)
            if (r0 == 0) goto L6d
            r4 = r9
        L83:
            com.revolut.retail.feature.esim.api.model.EsimProfile r4 = (com.revolut.retail.feature.esim.api.model.EsimProfile) r4
        L85:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v2.d(java.lang.String, w4l.k, gim.c):java.lang.Object");
    }

    public final m0 e(String id10, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.m1 m1Var = (nfj.m1) this.f114130a;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new m0(nim.a.v(m1Var.e.b(Unit.f186387a, loadingStrategy), new d7a.p(id10, 16)), id10, 1);
    }

    public final vkm.d f(dej.m mobilePlanType) {
        Intrinsics.checkNotNullParameter(mobilePlanType, "mobilePlanType");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.m1 m1Var = (nfj.m1) this.f114130a;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(mobilePlanType, "mobilePlanType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return m1Var.f.b(mobilePlanType, loadingStrategy);
    }

    public final vkm.d g(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.m1 m1Var = (nfj.m1) this.f114130a;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return m1Var.e.b(Unit.f186387a, loadingStrategy);
    }

    public final akg.n h() {
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(f(dej.m.MOBILE_PLAN), new dee.x(20));
    }
}
