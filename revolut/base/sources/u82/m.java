package u82;

import aw0.f4;
import cli.y;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends oki.h implements g {

    @NotNull
    public static final h Companion = new h();
    public final t82.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t82.g f278091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d92.b f278092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xdk.b f278093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n60.a f278094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ldd.b f278095t;
    public final w80.b u;
    public final y v;

    public m(t82.f interactor, t82.g resultInteractor, d92.b validatorExtension, xdk.b pocketExtension, n60.a keyboardExtension, ldd.b focusRequesterDelegate, w80.b amountFormatter, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(resultInteractor, "resultInteractor");
        Intrinsics.checkNotNullParameter(validatorExtension, "validatorExtension");
        Intrinsics.checkNotNullParameter(pocketExtension, "pocketExtension");
        Intrinsics.checkNotNullParameter(keyboardExtension, "keyboardExtension");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f278091p = resultInteractor;
        this.f278092q = validatorExtension;
        this.f278093r = pocketExtension;
        this.f278094s = keyboardExtension;
        this.f278095t = focusRequesterDelegate;
        this.u = amountFormatter;
        hrf.h.Companion.getClass();
        this.v = mra.d.b(this, new d(null, new e(hrf.h.d, f0.f322471a), 0), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(u82.m r4, t82.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof u82.i
            if (r0 == 0) goto L13
            r0 = r6
            u82.i r0 = (u82.i) r0
            int r1 = r0.f278086w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278086w = r1
            goto L18
        L13:
            u82.i r0 = new u82.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278086w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            xdk.b r4 = r4.f278093r
            com.revolut.core.model.account.AccountId r6 = r5.d
            com.revolut.feature.transfer.core.models.FundingSource r5 = r5.f268800c
            xi0.b r2 = r5.f92241b
            java.lang.String r5 = r5.f92240a
            r0.f278086w = r3
            java.lang.Object r6 = r4.b3(r6, r2, r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u82.m.I2(u82.m, t82.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        ldd.b bVar = this.f278095t;
        bVar.f194072c = false;
        bVar.b(new f4("ITEM_AMOUNT_INPUT_ID", true));
        Continuation continuation = null;
        l2(new k(this, continuation, 1), new yi5.b(26));
        yji.l.a1(this, q.Q(new t0(this.v.B(new u4e.i(25)), 1), new tik.b(continuation, this, 26)), null, null, new u7k.f0(this, continuation, 3), 3);
    }

    public final t82.a J2() {
        t82.a aVar = ((d) ((j2) this.v.f22677a).getValue()).f278079a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void P1() {
        H2(this.v, new u6b.k(this, 5));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
