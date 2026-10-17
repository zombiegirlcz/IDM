package yve;

import gr6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f317173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f317174b;

    public e(n walletInteractor, m freelancerPocketsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        this.f317173a = walletInteractor;
        this.f317174b = freelancerPocketsInteractor;
    }

    public static ArrayList a(List recommendedCurrencies, List supportedCurrencies) {
        Intrinsics.checkNotNullParameter(recommendedCurrencies, "recommendedCurrencies");
        Intrinsics.checkNotNullParameter(supportedCurrencies, "supportedCurrencies");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : supportedCurrencies) {
            if (!recommendedCurrencies.contains((xi0.b) obj2)) {
                arrayList.add(obj2);
            }
        }
        return d0.E0(arrayList, recommendedCurrencies);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (r1 == r3) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(yte.n r17, com.revolut.core.model.account.AccountId r18, gim.c r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof yve.c
            if (r2 == 0) goto L17
            r2 = r1
            yve.c r2 = (yve.c) r2
            int r3 = r2.f317169w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f317169w = r3
            goto L1c
        L17:
            yve.c r2 = new yve.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f317169w
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3b
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r1)
            goto La1
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            goto L67
        L3b:
            yhm.o.b(r1)
            int[] r1 = yve.b.f317168a
            int r4 = r17.ordinal()
            r4 = r1[r4]
            w4l.h r8 = w4l.h.f294642c
            r15 = 0
            if (r4 != r5) goto L6e
            gr6.m r1 = r0.f317174b
            et6.i2 r1 = (et6.i2) r1
            vkm.d r1 = r1.c(r8)
            ypg.h r4 = new ypg.h
            r5 = 27
            r4.<init>(r5)
            jhi.b r1 = mo3.a.g(r1, r15, r4, r6)
            r2.f317169w = r6
            java.lang.Object r1 = vkm.q.z(r1, r2)
            if (r1 != r3) goto L67
            goto La0
        L67:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L6d
            zhm.f0 r1 = zhm.f0.f322471a
        L6d:
            return r1
        L6e:
            int r4 = r17.ordinal()
            r1 = r1[r4]
            if (r1 != r6) goto L7a
            io3.l r1 = io3.l.REVX_FIAT
        L78:
            r9 = r1
            goto L7d
        L7a:
            io3.l r1 = io3.l.CURRENT
            goto L78
        L7d:
            io3.j r12 = io3.j.PERSONAL
            io3.i r11 = io3.i.INTERNAL
            io3.k r10 = io3.k.ACTIVE
            qsg.a r13 = qsg.a.RECENT_FIRST
            wsg.n r7 = r0.f317173a
            r14 = r18
            efm.r r1 = r7.M(r8, r9, r10, r11, r12, r13, r14)
            ypg.h r4 = new ypg.h
            r7 = 28
            r4.<init>(r7)
            efm.r r1 = m70.a.g(r1, r15, r4, r6)
            r2.f317169w = r5
            java.lang.Object r1 = nim.a.e(r1, r2)
            if (r1 != r3) goto La1
        La0:
            return r3
        La1:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto La7
            zhm.f0 r1 = zhm.f0.f322471a
        La7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yve.e.b(yte.n, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(xi0.b r7, java.util.List r8, yte.n r9, com.revolut.core.model.account.AccountId r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yve.e.c(xi0.b, java.util.List, yte.n, com.revolut.core.model.account.AccountId, gim.c):java.io.Serializable");
    }
}
