package vfg;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lfg.e f288613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lfg.s f288614b;

    public d(lfg.e accountRepository, lfg.s providerRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "accountRepository");
        Intrinsics.checkNotNullParameter(providerRepository, "providerRepository");
        this.f288613a = accountRepository;
        this.f288614b = providerRepository;
    }

    public static vkm.d a(d dVar) {
        dVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        lfg.e eVar = dVar.f288613a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(eVar.e.e(Unit.f186387a, loadingStrategy));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(hfg.d r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vfg.b
            if (r0 == 0) goto L13
            r0 = r8
            vfg.b r0 = (vfg.b) r0
            int r1 = r0.f288611x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288611x = r1
            goto L18
        L13:
            vfg.b r0 = new vfg.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288611x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2 r7 = r0.u
            yhm.o.b(r8)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L55
        L38:
            yhm.o.b(r8)
            r0.f288611x = r4
            lfg.e r8 = r6.f288613a
            r8.getClass()
            lb0.b0 r2 = new lb0.b0
            r4 = 9
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r7, r2, r0)
            if (r8 != r1) goto L55
            goto L6f
        L55:
            com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2 r8 = (com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2) r8
            r0.u = r8
            r0.f288611x = r3
            lfg.s r7 = r6.f288614b
            w4l.f r7 = r7.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            r3 = 0
            efm.b r7 = r7.g(r2, r3)
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L6d
            r2 = r7
        L6d:
            if (r2 != r1) goto L70
        L6f:
            return r1
        L70:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vfg.d.b(hfg.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vfg.c
            if (r0 == 0) goto L13
            r0 = r8
            vfg.c r0 = (vfg.c) r0
            int r1 = r0.f288612w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288612w = r1
            goto L18
        L13:
            vfg.c r0 = new vfg.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288612w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            goto L58
        L36:
            yhm.o.b(r8)
            r0.f288612w = r4
            lfg.e r8 = r6.f288613a
            r8.getClass()
            l34.a r2 = new l34.a
            r4 = 20
            r5 = 0
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L55:
            if (r7 != r1) goto L58
            goto L6e
        L58:
            r0.f288612w = r3
            lfg.s r7 = r6.f288614b
            w4l.f r7 = r7.d
            kotlin.Unit r8 = kotlin.Unit.f186387a
            r2 = 0
            efm.b r7 = r7.g(r8, r2)
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L6c
            r8 = r7
        L6c:
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vfg.d.c(java.lang.String, gim.c):java.lang.Object");
    }
}
