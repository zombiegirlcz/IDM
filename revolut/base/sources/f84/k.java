package f84;

import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input;
import kotlin.jvm.internal.Intrinsics;
import nf4.l;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PluginFlowContract$Input f132736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uw3.a f132737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bu3.a f132738c;
    public final z1 d;

    public k(PluginFlowContract$Input inputData, uw3.a creditAddonInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditAddonInteractor, "creditAddonInteractor");
        this.f132736a = inputData;
        this.f132737b = creditAddonInteractor;
        this.d = q.b(0, 2, ukm.f.DROP_OLDEST);
    }

    @Override // nf4.l
    public final z1 a() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r4, gim.c r5) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r4 = r5 instanceof f84.h
            if (r4 == 0) goto L13
            r4 = r5
            f84.h r4 = (f84.h) r4
            int r0 = r4.f132731x
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f132731x = r0
            goto L18
        L13:
            f84.h r4 = new f84.h
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f132731x
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            f84.k r4 = r4.u
            yhm.o.b(r5)
            goto L40
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            r4.u = r3
            r4.f132731x = r2
            java.io.Serializable r5 = r3.e(r4)
            if (r5 != r0) goto L3f
            return r0
        L3f:
            r4 = r3
        L40:
            bu3.a r5 = (bu3.a) r5
            r4.getClass()
            nf4.t r4 = new nf4.t
            cv3.a r5 = r5.f18669b
            r4.<init>(r5, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.k.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r11) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof f84.f
            if (r0 == 0) goto L13
            r0 = r11
            f84.f r0 = (f84.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            f84.f r0 = new f84.f
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f132727x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
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
            f84.k r2 = r0.f132726w
            ft3.h1 r4 = r0.v
            uw3.a r5 = r0.u
            yhm.o.b(r11)
            r6 = r4
            goto L5a
        L3d:
            yhm.o.b(r11)
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r11 = r10.f132736a
            ft3.h1 r11 = r11.a9()
            uw3.a r5 = r10.f132737b
            r0.u = r5
            r0.v = r11
            r0.f132726w = r10
            r0.z = r4
            java.io.Serializable r2 = r10.e(r0)
            if (r2 != r1) goto L57
            goto L90
        L57:
            r6 = r11
            r11 = r2
            r2 = r10
        L5a:
            bu3.a r11 = (bu3.a) r11
            r2.getClass()
            cv3.a r11 = r11.f18669b
            java.util.List r11 = r11.e
            java.util.Map r11 = d9.e1.s(r11)
            java.lang.String r2 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r2)
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f132726w = r8
            r0.z = r3
            z24.a r5 = r5.f283543a
            jy3.a r7 = new jy3.a
            r7.<init>(r11)
            r5.getClass()
            y65.l r4 = new y65.l
            r9 = 24
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L91
        L90:
            return r1
        L91:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.k.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f84.g
            if (r0 == 0) goto L13
            r0 = r5
            f84.g r0 = (f84.g) r0
            int r1 = r0.f132729w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132729w = r1
            goto L18
        L13:
            f84.g r0 = new f84.g
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132729w
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
            r0.f132729w = r3
            java.io.Serializable r5 = r4.e(r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            bu3.a r5 = (bu3.a) r5
            ht3.l0 r5 = r5.f18668a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.k.d(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof f84.i
            if (r0 == 0) goto L13
            r0 = r7
            f84.i r0 = (f84.i) r0
            int r1 = r0.f132732w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132732w = r1
            goto L18
        L13:
            f84.i r0 = new f84.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f132732w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            bu3.a r7 = r6.f132738c
            if (r7 != 0) goto L5e
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r7 = r6.f132736a
            ft3.h1 r7 = r7.a9()
            r0.f132732w = r3
            uw3.a r2 = r6.f132737b
            z24.a r2 = r2.f283543a
            java.lang.String r7 = r7.f137835a
            r2.getClass()
            yv1.k r3 = new yv1.k
            r4 = 0
            r5 = 16
            r3.<init>(r2, r7, r4, r5)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r3, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            bu3.a r7 = (bu3.a) r7
            r6.f132738c = r7
        L5e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.k.e(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // nf4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r18, cv3.u r19, gim.c r20) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof f84.j
            if (r2 == 0) goto L17
            r2 = r1
            f84.j r2 = (f84.j) r2
            int r3 = r2.f132735y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f132735y = r3
            goto L1c
        L17:
            f84.j r2 = new f84.j
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f132733w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f132735y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L44
            if (r4 == r6) goto L39
            if (r4 != r5) goto L31
            bu3.a r2 = r2.v
            yhm.o.b(r1)
            goto La2
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            cv3.u r4 = r2.u
            yhm.o.b(r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L54
        L44:
            yhm.o.b(r1)
            r1 = r19
            r2.u = r1
            r2.f132735y = r6
            java.io.Serializable r4 = r0.e(r2)
            if (r4 != r3) goto L54
            goto La0
        L54:
            bu3.a r4 = (bu3.a) r4
            com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowContract$Input r7 = r0.f132736a
            ft3.h1 r7 = r7.a9()
            cv3.a r8 = r4.f18669b
            java.util.List r8 = r8.e
            java.util.Map r8 = d9.e1.s(r8)
            java.lang.String r9 = "parameters"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r9)
            java.lang.String r10 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
            java.util.Map r1 = r1.f109270a
            java.util.LinkedHashMap r1 = zhm.r0.p(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r9)
            r14 = 0
            r2.u = r14
            r2.v = r4
            r2.f132735y = r5
            uw3.a r5 = r0.f132737b
            z24.a r11 = r5.f283543a
            java.lang.String r12 = r7.f137835a
            jy3.a r13 = new jy3.a
            r13.<init>(r1)
            r11.getClass()
            y65.l r10 = new y65.l
            r15 = 25
            r10.<init>(r11, r12, r13, r14, r15)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r10, r2)
            if (r1 != r3) goto La1
        La0:
            return r3
        La1:
            r2 = r4
        La2:
            cv3.a r1 = (cv3.a) r1
            ht3.l0 r2 = r2.f18668a
            java.lang.String r3 = "calculator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            bu3.a r3 = new bu3.a
            r3.<init>(r2, r1)
            r0.f132738c = r3
            nf4.t r2 = new nf4.t
            r2.<init>(r1, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f84.k.i(java.lang.String, cv3.u, gim.c):java.lang.Object");
    }
}
