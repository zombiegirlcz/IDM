package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f94031w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f94032x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z, c cVar, Continuation continuation) {
        super(2, continuation);
        this.f94031w = z;
        this.f94032x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f94031w, this.f94032x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.I2(r0, r1, r10, r9) == r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009c, code lost:
    
        if (nim.a.a(r10, r9) != r2) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c r0 = r9.f94032x
            cli.y r1 = r0.f94039x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r9.v
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r3 == 0) goto L41
            if (r3 == r7) goto L39
            if (r3 == r6) goto L30
            if (r3 == r5) goto L28
            if (r3 != r4) goto L20
            java.lang.Object r1 = r9.u
            zfi.a r1 = (zfi.a) r1
            yhm.o.b(r10)
            goto L9f
        L20:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L28:
            java.lang.Object r1 = r9.u
            zfi.a r1 = (zfi.a) r1
            yhm.o.b(r10)
            goto L8e
        L30:
            java.lang.Object r0 = r9.u
            java.lang.String r0 = (java.lang.String) r0
            yhm.o.b(r10)
            goto La9
        L39:
            java.lang.Object r1 = r9.u
            java.lang.String r1 = (java.lang.String) r1
            yhm.o.b(r10)
            goto L5f
        L41:
            yhm.o.b(r10)
            boolean r10 = r9.f94031w
            if (r10 == 0) goto L71
            java.lang.Object r10 = r1.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            neg.l r10 = (neg.l) r10
            java.lang.String r1 = r10.f214517g
            r9.u = r1
            r9.v = r7
            java.lang.Object r10 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.J2(r0, r1, r9)
            if (r10 != r2) goto L5f
            goto L9e
        L5f:
            dgi.i r10 = (dgi.i) r10
            if (r10 != 0) goto L66
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L66:
            r9.u = r8
            r9.v = r6
            java.lang.Object r10 = com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.c.I2(r0, r1, r10, r9)
            if (r10 != r2) goto La9
            goto L9e
        L71:
            java.lang.Object r10 = r1.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            neg.l r10 = (neg.l) r10
            zfi.a r1 = r10.e
            i9g.h0 r10 = r0.f94033p
            pfm.h r10 = r10.j(r1)
            r9.u = r1
            r9.v = r5
            java.lang.Object r10 = nim.a.a(r10, r9)
            if (r10 != r2) goto L8e
            goto L9e
        L8e:
            i9g.c r10 = r0.o
            pfm.a r10 = r10.d(r1)
            r9.u = r8
            r9.v = r4
            java.lang.Object r10 = nim.a.a(r10, r9)
            if (r10 != r2) goto L9f
        L9e:
            return r2
        L9f:
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a$a r10 = new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.a$a
            r1 = 0
            r2 = 7
            r10.<init>(r2, r8, r1)
            r0.C2(r10)
        La9:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.filters.listing.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
