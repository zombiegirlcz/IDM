package le1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CatalogueProduct f194439w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TaxRate f194440x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, CatalogueProduct catalogueProduct, TaxRate taxRate, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f194439w = catalogueProduct;
        this.f194440x = taxRate;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, this.f194439w, this.f194440x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8.a(r1, r0, r7.f194440x, r7) != r2) goto L23;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            le1.i r0 = r7.v
            nd1.i r1 = r0.f194443r
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r8)
            goto L5d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            goto L44
        L23:
            yhm.o.b(r8)
            goto L33
        L27:
            yhm.o.b(r8)
            r7.u = r6
            java.lang.Object r8 = r1.c(r7)
            if (r8 != r2) goto L33
            goto L5c
        L33:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L44
            r7.u = r5
            java.lang.Object r8 = r1.e(r7)
            if (r8 != r2) goto L44
            goto L5c
        L44:
            nd1.n r8 = r0.f194442q
            pd1.a r0 = r0.f194444s
            com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct r1 = r7.f194439w
            java.lang.String r3 = r1.d
            pd1.c r0 = (pd1.c) r0
            int r0 = r0.c(r3)
            r7.u = r4
            com.revolut.feature.acquiring.lite_pos.api.model.TaxRate r3 = r7.f194440x
            java.lang.Object r8 = r8.a(r1, r0, r3, r7)
            if (r8 != r2) goto L5d
        L5c:
            return r2
        L5d:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: le1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
