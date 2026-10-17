package wl5;

import com.revolut.feature.crypto.spare.change.impl.ui.crypto_spare_change.CryptoSpareChangeScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nyb.i0;
import org.jetbrains.annotations.NotNull;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends jki.g implements jki.h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wsg.n f298428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sl5.f f298429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ul5.g f298430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ul5.e f298431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xl5.b f298432t;
    public final i0 u;
    public final xvh.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CryptoSpareChangeScreenContract$InputData f298433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f298434x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(wsg.n walletInteractor, sl5.f cryptoSpareChangeInteractor, ul5.g spareChangeMultipliersProvider, ul5.e spareChangeExcludedCurrenciesProvider, xl5.b spareChangeBottomSheetController, i0 revPointsProductEligibilityInteractor, xvh.c autoInvestInteractor, CryptoSpareChangeScreenContract$InputData inputData, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(cryptoSpareChangeInteractor, "cryptoSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeMultipliersProvider, "spareChangeMultipliersProvider");
        Intrinsics.checkNotNullParameter(spareChangeExcludedCurrenciesProvider, "spareChangeExcludedCurrenciesProvider");
        Intrinsics.checkNotNullParameter(spareChangeBottomSheetController, "spareChangeBottomSheetController");
        Intrinsics.checkNotNullParameter(revPointsProductEligibilityInteractor, "revPointsProductEligibilityInteractor");
        Intrinsics.checkNotNullParameter(autoInvestInteractor, "autoInvestInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f298428p = walletInteractor;
        this.f298429q = cryptoSpareChangeInteractor;
        this.f298430r = spareChangeMultipliersProvider;
        this.f298431s = spareChangeExcludedCurrenciesProvider;
        this.f298432t = spareChangeBottomSheetController;
        this.u = revPointsProductEligibilityInteractor;
        this.v = autoInvestInteractor;
        this.f298433w = inputData;
        this.f298434x = new g(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A2(wl5.s r4, yl5.a r5, kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof wl5.r
            if (r0 == 0) goto L13
            r0 = r7
            wl5.r r0 = (wl5.r) r0
            int r1 = r0.f298427w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f298427w = r1
            goto L18
        L13:
            wl5.r r0 = new wl5.r
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f298427w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L27
            goto L46
        L27:
            r5 = move-exception
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r7)
            wk2.x r7 = new wk2.x     // Catch: java.lang.Throwable -> L27
            r2 = 6
            r7.<init>(r5, r2)     // Catch: java.lang.Throwable -> L27
            r4.x2(r7)     // Catch: java.lang.Throwable -> L27
            r0.f298427w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = r6.invoke(r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L46
            return r1
        L46:
            wl3.d r5 = new wl3.d
            r6 = 4
            r5.<init>(r6)
            r4.x2(r5)
            return r7
        L50:
            wl3.d r6 = new wl3.d
            r7 = 4
            r6.<init>(r7)
            r4.x2(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wl5.s.A2(wl5.s, yl5.a, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static final xi0.b y2(s sVar) {
        xi0.b bVar = ((g) sVar.t2()).f298416c;
        return bVar == null ? ((g) sVar.t2()).d : bVar;
    }

    public static final int z2(s sVar) {
        Integer num = ((g) sVar.t2()).f298415b;
        if (num != null) {
            return num.intValue();
        }
        Integer num2 = ((g) sVar.t2()).f298414a;
        return num2 != null ? num2.intValue() : ((ul5.f) d0.b0(sVar.f298430r.a())).f280893b;
    }

    @Override // yji.l
    public final void I1() {
        l2(new wih.c(this, (Continuation) null, 5), new yi5.b(26));
        yji.l.a1(this, this.f298429q.b(), null, null, new j(this, null), 3);
        xvh.c.a(this.v);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        x2(new wl3.d(3));
        super.o1(throwable);
        return false;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f298434x;
    }
}
