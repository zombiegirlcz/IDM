package lle;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kze.h;
import skd.i;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w51.a f196738l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f196739m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f196740n;

    public b(w51.a appEntryPointInteractor, i slotManagerInteractor) {
        Intrinsics.checkNotNullParameter(appEntryPointInteractor, "appEntryPointInteractor");
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        this.f196738l = appEntryPointInteractor;
        this.f196739m = slotManagerInteractor;
        this.f196740n = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(lle.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof lle.a
            if (r0 == 0) goto L13
            r0 = r5
            lle.a r0 = (lle.a) r0
            int r1 = r0.f196737w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f196737w = r1
            goto L18
        L13:
            lle.a r0 = new lle.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f196737w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            skd.i r4 = r4.f196739m
            com.revolut.feature.slot_manager.api.model.SlotContext r5 = new com.revolut.feature.slot_manager.api.model.SlotContext
            akd.s r2 = akd.s.INVEST_HOME
            r5.<init>(r2)
            akg.n r4 = r4.b(r5)
            r0.f196737w = r3
            java.lang.Object r5 = c8g.a.h(r4, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = zhm.d0.d0(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lle.b.Z2(lle.b, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void D2() {
        if (this.f196738l.f294677a) {
            return;
        }
        T2(new h(this, null, 25), new yi5.b(27));
    }
}
