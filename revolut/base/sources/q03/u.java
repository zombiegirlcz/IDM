package q03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class u extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b f241102w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(RowDelegate.Model model, com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f241102w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new u(this.v, this.f241102w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((u) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r6 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (((q03.h0) r0).a(r5) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            com.revolut.feature.card_management.impl.ui.kompot.settings.b r0 = r5.f241102w
            q03.n0 r0 = r0.f64912s
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r5.u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1d
            if (r2 == r4) goto L19
            if (r2 != r3) goto L11
            goto L19
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            yhm.o.b(r6)
            goto L56
        L1d:
            yhm.o.b(r6)
            com.revolut.core.ui_kit.delegates.RowDelegate$Model r6 = r5.v
            java.lang.Object r6 = r6.u
            java.lang.String r2 = "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard"
            kotlin.jvm.internal.Intrinsics.i(r6, r2)
            h93.f0 r6 = (h93.f0) r6
            java.lang.String r2 = r6.f150110a
            boolean r6 = h93.h0.e(r6)
            if (r6 == 0) goto L4b
            r5.u = r4
            q03.h0 r0 = (q03.h0) r0
            l93.f r6 = r0.f241073b
            ha3.x r6 = (ha3.x) r6
            pfm.h r6 = r6.I(r2)
            java.lang.Object r6 = nim.a.a(r6, r5)
            if (r6 != r1) goto L46
            goto L48
        L46:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L48:
            if (r6 != r1) goto L56
            goto L55
        L4b:
            r5.u = r3
            q03.h0 r0 = (q03.h0) r0
            java.lang.Object r6 = r0.a(r5)
            if (r6 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q03.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
