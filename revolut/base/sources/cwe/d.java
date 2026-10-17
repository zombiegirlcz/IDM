package cwe;

import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flow.add_card.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f109605w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f109606x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.topup_screen.impl.flow.add_card.b bVar, Set set, String str, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f109605w = set;
        this.f109606x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d(this.v, this.f109605w, this.f109606x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r8 == r2) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            com.revolut.feature.topup_screen.impl.flow.add_card.b r0 = r7.v
            p71.a r1 = r0.f90598p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L15
            yhm.o.b(r8)
            goto L48
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            yhm.o.b(r8)
            goto L34
        L21:
            yhm.o.b(r8)
            r8 = r1
            u21.k r8 = (u21.k) r8
            efm.b r8 = r8.c()
            r7.u = r5
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L34
            goto L47
        L34:
            u21.k r1 = (u21.k) r1
            efm.r r8 = r1.b()
            r1 = 3
            efm.r r8 = m70.a.g(r8, r6, r6, r1)
            r7.u = r4
            java.lang.Object r8 = nim.a.c(r8, r7)
            if (r8 != r2) goto L48
        L47:
            return r2
        L48:
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L53:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L75
            java.lang.Object r1 = r8.next()
            r2 = r1
            t61.g r2 = (t61.g) r2
            java.lang.String r3 = r2.f268137a
            java.util.Set r4 = r7.f109605w
            boolean r3 = r4.contains(r3)
            if (r3 != 0) goto L53
            java.lang.String r2 = r2.d
            java.lang.String r3 = r7.f109606x
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r2 == 0) goto L53
            goto L76
        L75:
            r1 = r6
        L76:
            t61.g r1 = (t61.g) r1
            if (r1 != 0) goto L8a
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r2 = "New card was added but wasn't found in the updated list of cards"
            r8.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r3 = rd0.d.f253311a
            rd0.c r3 = rd0.c.ERROR
            rd0.d.a(r3, r6, r6, r8, r2)
        L8a:
            sli.a r8 = new sli.a
            r8.<init>(r1)
            r0.C2(r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cwe.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
