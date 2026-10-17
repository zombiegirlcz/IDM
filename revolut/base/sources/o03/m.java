package o03;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import z6l.s;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends oki.h implements dli.b {
    public final CardReplaceReasonPickerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f221114p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yf.c f221115q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f221116r;

    public m(n stateMapper, CardReplaceReasonPickerContract$InputData inputData, s cardsInteractor, yf.c supportInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(supportInteractor, "supportInteractor");
        this.o = inputData;
        this.f221114p = cardsInteractor;
        this.f221115q = supportInteractor;
        this.f221116r = mra.d.b(this, new a(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable I2(o03.m r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof o03.l
            if (r0 == 0) goto L13
            r0 = r5
            o03.l r0 = (o03.l) r0
            int r1 = r0.f221113w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f221113w = r1
            goto L18
        L13:
            o03.l r0 = new o03.l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f221113w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L4e
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            yf.c r5 = r4.f221115q     // Catch: java.lang.Throwable -> L4e
            com.revolut.feature.card_management.impl.ui.kompot.replace.reason.CardReplaceReasonPickerContract$InputData r4 = r4.o     // Catch: java.lang.Throwable -> L4e
            java.lang.String r4 = r4.f64899a     // Catch: java.lang.Throwable -> L4e
            ufm.n r4 = r5.g(r4)     // Catch: java.lang.Throwable -> L4e
            r0.f221113w = r3     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r5 = nim.a.b(r4, r0)     // Catch: java.lang.Throwable -> L4e
            if (r5 != r1) goto L45
            return r1
        L45:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r4 = r5.getContent()     // Catch: java.lang.Throwable -> L4e
            d71.a r4 = (d71.a) r4     // Catch: java.lang.Throwable -> L4e
            return r4
        L4e:
            r4 = move-exception
            zhm.h0 r5 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            r1 = 0
            rd0.d.a(r0, r1, r1, r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o03.m.I2(o03.m, gim.c):java.io.Serializable");
    }

    @Override // yji.l
    public final void I1() {
        l2(new i0(this, (Continuation) null, 2), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f221116r;
    }
}
