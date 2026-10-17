package a6k;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ufm.b f1704w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ufm.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f1704w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f1704w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r5 == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.u
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r5)
            goto L4a
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            yhm.o.b(r5)
            goto L2c
        L1c:
            yhm.o.b(r5)
            a6k.d r5 = r4.v
            cu8.r0 r5 = r5.f1706b
            r4.u = r3
            java.lang.Object r5 = ks8.m.b(r5, r4)
            if (r5 != r0) goto L2c
            goto L49
        L2c:
            ks8.j r5 = (ks8.j) r5
            boolean r1 = r5 instanceof ks8.i
            if (r1 == 0) goto L37
            ks8.i r5 = (ks8.i) r5
            com.revolut.retail.core.navigation.FeatureCommand r5 = r5.f189312a
            goto L4c
        L37:
            ks8.j$a r1 = ks8.j.a.f189313a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r1)
            if (r5 == 0) goto L50
            r4.u = r2
            ufm.b r5 = r4.f1704w
            java.lang.Object r5 = nim.a.b(r5, r4)
            if (r5 != r0) goto L4a
        L49:
            return r0
        L4a:
            com.revolut.retail.core.navigation.NaviCommand r5 = (com.revolut.retail.core.navigation.NaviCommand) r5
        L4c:
            kotlin.jvm.internal.Intrinsics.h(r5)
            return r5
        L50:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a6k.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
