package sl5;

import com.revolut.feature.crypto.spare.change.api.models.CryptoSpareChangeState;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import vkm.q;
import w4l.i;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rl5.c f264149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xvh.c f264150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ol5.c f264151c;

    public f(rl5.c cryptoSpareChangeRepository, xvh.c autoInvestInteractor, ol5.c cryptoSpareChangeStateController) {
        Intrinsics.checkNotNullParameter(cryptoSpareChangeRepository, "cryptoSpareChangeRepository");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeStateController, "cryptoSpareChangeStateController");
        this.f264149a = cryptoSpareChangeRepository;
        this.f264150b = autoInvestInteractor;
        this.f264151c = cryptoSpareChangeStateController;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r9, int r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof sl5.b
            if (r0 == 0) goto L13
            r0 = r11
            sl5.b r0 = (sl5.b) r0
            int r1 = r0.f264145w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264145w = r1
            goto L18
        L13:
            sl5.b r0 = new sl5.b
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f264145w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L4d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r11)
            r0.f264145w = r3
            rl5.c r3 = r8.f264149a
            r3.getClass()
            rl5.b r2 = new rl5.b
            r7 = 0
            r6 = 0
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r9, r2, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            r9 = r11
            il5.d r9 = (il5.d) r9
            boolean r9 = r9 instanceof il5.b
            if (r9 == 0) goto L59
            xvh.c r9 = r8.f264150b
            xvh.c.a(r9)
        L59:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.f.a(xi0.b, int, gim.c):java.lang.Object");
    }

    public final vkm.f b() {
        ol5.c cVar = this.f264151c;
        Object cryptoSpareChangeActive = (CryptoSpareChangeState) cVar.d.get("CRYPTO_SPARE_CHANGE_STATE_MEMORY_CACHE_KEY");
        if (cryptoSpareChangeActive == null) {
            ll5.c cVar2 = (ll5.c) j6.a.k(ll5.c.class, cVar.e, "CRYPTO_SPARE_CHANGE_STATE_MEMORY_CACHE_KEY");
            if (cVar2 != null) {
                Intrinsics.checkNotNullParameter(cVar2, "<this>");
                if (cVar2.getIsEnabled()) {
                    xi0.a aVar = xi0.b.Companion;
                    String currency = cVar2.getCurrency();
                    aVar.getClass();
                    cryptoSpareChangeActive = new CryptoSpareChangeState.CryptoSpareChangeActive(cVar2.getMultiplier(), xi0.a.a(currency));
                } else {
                    cryptoSpareChangeActive = CryptoSpareChangeState.CryptoSpareChangeNotActive.f70995a;
                }
            } else {
                cryptoSpareChangeActive = null;
            }
        }
        return q.J(cryptoSpareChangeActive != null ? q.c(zi0.c.P(cryptoSpareChangeActive, false, null, 3)) : q.b(0, 7, null), nim.a.u(new ol5.b(cVar, null), nim.a.v(rd0.e.b(w.f0(xvh.c.c(cVar.f226337c, null, i.f294643c, 1))), new okk.d(4))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof sl5.c
            if (r0 == 0) goto L13
            r0 = r5
            sl5.c r0 = (sl5.c) r0
            int r1 = r0.f264146w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264146w = r1
            goto L18
        L13:
            sl5.c r0 = new sl5.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f264146w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            xvh.c r5 = r4.f264150b
            ufm.i r5 = xvh.c.b(r5)
            r0.f264146w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            yvh.b r5 = (yvh.b) r5
            boolean r0 = r5.f317177b
            if (r0 == 0) goto L4e
            yvh.h r0 = r5.e
            yvh.h r1 = yvh.h.CURRENT_POCKET
            if (r0 == r1) goto L4e
            return r5
        L4e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.f.c(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof sl5.d
            if (r0 == 0) goto L13
            r0 = r6
            sl5.d r0 = (sl5.d) r0
            int r1 = r0.f264147w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264147w = r1
            goto L18
        L13:
            sl5.d r0 = new sl5.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f264147w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            r0.f264147w = r3
            rl5.c r6 = r5.f264149a
            r6.getClass()
            rbh.k r2 = new rbh.k
            r3 = 7
            r4 = 0
            r2.<init>(r6, r4, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r6
            il5.d r0 = (il5.d) r0
            boolean r0 = r0 instanceof il5.a
            if (r0 == 0) goto L57
            xvh.c r0 = r5.f264150b
            xvh.c.a(r0)
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.f.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(xi0.b r9, int r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof sl5.e
            if (r0 == 0) goto L13
            r0 = r11
            sl5.e r0 = (sl5.e) r0
            int r1 = r0.f264148w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f264148w = r1
            goto L18
        L13:
            sl5.e r0 = new sl5.e
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f264148w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r11)
            goto L4d
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r11)
            r0.f264148w = r3
            rl5.c r3 = r8.f264149a
            r3.getClass()
            rl5.b r2 = new rl5.b
            r7 = 1
            r6 = 0
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r9, r2, r0)
            if (r11 != r1) goto L4d
            return r1
        L4d:
            r9 = r11
            il5.d r9 = (il5.d) r9
            boolean r9 = r9 instanceof il5.b
            if (r9 == 0) goto L59
            xvh.c r9 = r8.f264150b
            xvh.c.a(r9)
        L59:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sl5.f.e(xi0.b, int, gim.c):java.lang.Object");
    }
}
