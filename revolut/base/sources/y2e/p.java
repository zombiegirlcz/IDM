package y2e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ StoreBrandsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(StoreBrandsScreen storeBrandsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = storeBrandsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.u
            com.revolut.core.ui_kit.delegates.FullScreenStateDelegate$Model r0 = (com.revolut.core.ui_kit.delegates.FullScreenStateDelegate.Model) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r6)
            com.revolut.feature.store.impl.ui.brands.StoreBrandsScreen r6 = r5.v
            y2e.g r6 = r6.R2()
            kotlin.jvm.internal.Intrinsics.h(r0)
            y2e.s r6 = (y2e.s) r6
            r6.getClass()
            java.lang.String r1 = "model"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r0 = r0.f52373a
            int r1 = r0.hashCode()
            r2 = -1798304149(0xffffffff94d00e6b, float:-2.100832E-26)
            r3 = 0
            if (r1 == r2) goto L60
            r2 = -1463488292(0xffffffffa8c4f0dc, float:-2.1864827E-14)
            if (r1 == r2) goto L57
            r2 = -1276062461(0xffffffffb3f0d503, float:-1.12146175E-7)
            if (r1 == r2) goto L34
            goto Lad
        L34:
            java.lang.String r1 = "EMPTY_FILTERS_STATE_ITEM_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3e
            goto Lad
        L3e:
            g2e.b r6 = r6.f310656q
            g2e.c r6 = (g2e.c) r6
            vkm.j2 r1 = r6.f139974a
        L44:
            java.lang.Object r6 = r1.getValue()
            r0 = r6
            g2e.a r0 = (g2e.a) r0
            g2e.a r0 = new g2e.a
            r0.<init>(r3)
            boolean r6 = r1.h(r6, r0)
            if (r6 == 0) goto L44
            goto Lad
        L57:
            java.lang.String r1 = "ERROR_STATE_PAGE_ITEM_ID"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L68
            goto Lad
        L60:
            java.lang.String r1 = "ERROR_STATE_GENERAL_ITEM_ID"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lad
        L68:
            y2e.k r6 = r6.o
            y2e.m r6 = (y2e.m) r6
            ihm.b r0 = r6.f310651c
            java.lang.Object r1 = r0.f()
            lk0.g r1 = (lk0.g) r1
            if (r1 != 0) goto L77
            goto Lad
        L77:
            java.util.List r1 = r1.f196174a
            java.lang.Object r2 = zhm.d0.o0(r1)
            lk0.e r2 = (lk0.e) r2
            if (r2 != 0) goto L82
            goto Lad
        L82:
            java.lang.Throwable r2 = r2.e
            if (r2 != 0) goto L87
            goto Lad
        L87:
            int r2 = r1.size()
            r4 = 1
            if (r2 != r4) goto L96
            ihm.f r6 = r6.e
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r6.onNext(r0)
            goto Lad
        L96:
            int r2 = r1.size()
            int r2 = r2 - r4
            java.util.List r1 = r1.subList(r3, r2)
            lk0.g r1 = lk0.g.a(r1)
            r0.onNext(r1)
            ihm.f r6 = r6.d
            lk0.h$b r0 = lk0.h.b.f196176a
            r6.onNext(r0)
        Lad:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: y2e.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
