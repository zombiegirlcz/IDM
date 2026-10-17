package om8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jm8.b f226778a;

    public f(jm8.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f226778a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof om8.d
            if (r0 == 0) goto L13
            r0 = r11
            om8.d r0 = (om8.d) r0
            int r1 = r0.f226776w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226776w = r1
            goto L18
        L13:
            om8.d r0 = new om8.d
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226776w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            goto L50
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r11)
            jm8.b r5 = r8.f226778a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            r0.f226776w = r3     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            skm.p0 r11 = skm.p0.f264001a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            elm.f r11 = elm.f.f127540b     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            i4g.d r2 = new i4g.d     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            r3 = 13
            r7 = 0
            r6 = r9
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            java.lang.Object r9 = skm.e0.J(r11, r2, r0)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            if (r9 != r1) goto L4b
            goto L4d
        L4b:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
        L4d:
            if (r9 != r1) goto L50
            return r1
        L50:
            gm8.b r9 = gm8.b.f144792a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L53
            return r9
        L53:
            gm8.a r9 = gm8.a.f144791a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: om8.f.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof om8.e
            if (r0 == 0) goto L13
            r0 = r8
            om8.e r0 = (om8.e) r0
            int r1 = r0.f226777w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226777w = r1
            goto L18
        L13:
            om8.e r0 = new om8.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226777w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            goto L4e
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            jm8.b r8 = r6.f226778a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            r0.f226777w = r3     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            skm.p0 r2 = skm.p0.f264001a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            elm.f r2 = elm.f.f127540b     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            ix6.l0 r3 = new ix6.l0     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            r4 = 20
            r5 = 0
            r3.<init>(r8, r7, r5, r4)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            java.lang.Object r7 = skm.e0.J(r2, r3, r0)     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            if (r7 != r1) goto L49
            goto L4b
        L49:
            kotlin.Unit r7 = kotlin.Unit.f186387a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
        L4b:
            if (r7 != r1) goto L4e
            return r1
        L4e:
            gm8.b r7 = gm8.b.f144792a     // Catch: com.revolut.feature.junior_rewards.impl.data.exception.JuniorDeviceNotFoundException -> L51
            return r7
        L51:
            gm8.a r7 = gm8.a.f144791a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om8.f.b(java.lang.String, gim.c):java.lang.Object");
    }
}
