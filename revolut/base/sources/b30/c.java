package b30;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ e v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L5d;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            b30.e r8 = r7.v
            ue0.c r0 = r8.f11981c
            java.lang.String r1 = "key_suggestions_title"
            java.lang.Class<kg.w> r2 = kg.w.class
            java.lang.Object r0 = r0.T2(r1, r2)
            kg.w r0 = (kg.w) r0
            r1 = 0
            if (r0 == 0) goto L58
            java.lang.String r2 = "timestamp"
            kg.u r2 = r0.i(r2)
            if (r2 == 0) goto L40
            long r2 = r2.e()
            java.lang.String r4 = "titleId"
            kg.u r0 = r0.i(r4)
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.f()
            if (r0 != 0) goto L36
            goto L40
        L36:
            b30.b r4 = new b30.b
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = b30.e.a(r0)
            r4.<init>(r5, r0, r2)
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 == 0) goto L58
            df0.b r0 = r8.d
            java.time.Instant r0 = r0.a()
            long r2 = r0.toEpochMilli()
            long r5 = r4.f11975c
            long r2 = r2 - r5
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L58
            r1 = r4
        L58:
            r8.f11982g = r1
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L5d:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r8)
            b30.e r8 = r7.v
            nf3.a r8 = r8.f
            java.util.List r8 = r8.f214802b
            int r0 = r8.size()
            r1 = 3
            if (r0 <= r1) goto L81
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.util.List r8 = zhm.d0.g1(r8)
            java.util.Collections.shuffle(r8)
            java.util.List r8 = zhm.d0.V0(r8, r1)
        L81:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b30.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
