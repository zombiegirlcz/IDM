package jgd;

import com.revolut.feature.shared_separate_favourites.api.converter.navigation.SharedConverterDestination;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$ConverterHistory;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreenContract$InputData;
import iyg.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends jki.g implements n {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d3d.g f173987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SharedConverterScreenContract$InputData f173988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w80.b f173989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final z1 f173990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f173991t;
    public final a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d3d.g interactor, SharedConverterScreenContract$InputData inputData, w80.b amountFormatter, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f173987p = interactor;
        this.f173988q = inputData;
        this.f173989r = amountFormatter;
        this.f173990s = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        this.f173991t = new j(new SharedConverterScreenContract$ConverterHistory(null, null), false, false, false);
        this.u = new a();
    }

    @Override // yji.l
    public final void I1() {
        d3d.g gVar = this.f173987p;
        efm.r rVarDefer = efm.r.defer(new h4d.d(gVar.f111093a, 0));
        Intrinsics.checkNotNullExpressionValue(rVarDefer, "defer(...)");
        Continuation continuation = null;
        yji.l.a1(this, new t38.e(((j) t2()).f173970a, 23, vkm.q.Q(rd0.e.b(rVarDefer), new a32.b(continuation, gVar, 23)), new hwi.b(3, 14, continuation)), null, null, new s(this, continuation, 0), 3);
        if (!Intrinsics.f(this.f173988q.f86858b, SharedConverterDestination.Configuration.Action.ShowKeyboard.f86791a) || ((j) t2()).f173972c) {
            return;
        }
        x2(new p(this, 2));
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (!((j) t2()).d && Intrinsics.f(this.f173988q.f86858b, SharedConverterDestination.Configuration.Action.AddAsset.f86790a)) {
            x2(new p(this, 0));
            z2();
        }
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(new b0(vkm.q.q(this.f173990s), 3), new iw6.l(continuation, this, 15)), null, new s(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f173991t;
    }

    @Override // jki.g
    public final kki.a s2() {
        return this.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y2(com.revolut.core.ui_kit.delegates.RowDelegate.Model r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof jgd.v
            if (r0 == 0) goto L13
            r0 = r6
            jgd.v r0 = (jgd.v) r0
            int r1 = r0.f173985w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173985w = r1
            goto L18
        L13:
            jgd.v r0 = new jgd.v
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173985w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.u
            boolean r6 = r5 instanceof com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem
            if (r6 == 0) goto L3b
            com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem r5 = (com.revolut.feature.shared_separate_favourites.domain.converter.SharedConverterItem) r5
            goto L3c
        L3b:
            r5 = 0
        L3c:
            if (r5 != 0) goto L41
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L41:
            r0.f173985w = r3
            d3d.g r6 = r4.f173987p
            java.lang.Object r5 = r6.c(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            jgd.p r5 = new jgd.p
            r6 = 1
            r5.<init>(r4, r6)
            r4.x2(r5)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jgd.x.y2(com.revolut.core.ui_kit.delegates.RowDelegate$Model, gim.c):java.lang.Object");
    }

    public final void z2() {
        v2(new l(d0.d1(this.f173988q.f86857a)));
    }
}
