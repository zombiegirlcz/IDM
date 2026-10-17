package rmb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f255230w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, Continuation continuation, q qVar) {
        super(2, continuation);
        this.u = i;
        this.f255230w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(0, continuation, this.f255230w);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(1, continuation, this.f255230w);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Data data = (Data) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((o) create(data, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            rmb.q r1 = r8.f255230w
            switch(r0) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r8.v
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            cli.y r9 = r1.f255237x
            rj9.i r2 = new rj9.i
            r3 = 4
            r2.<init>(r0, r3)
            r1.H2(r9, r2)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L1e:
            cli.y r0 = r1.f255237x
            java.lang.Object r2 = r8.v
            com.revolut.data.model.Data r2 = (com.revolut.data.model.Data) r2
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r9)
            java.lang.Object r9 = r2.getContent()
            java.util.List r9 = (java.util.List) r9
            r3 = 0
            if (r9 == 0) goto L6d
            r4 = r9
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.revolut.feature.shared.savings.models.product.SavingsProductData r6 = (com.revolut.feature.shared.savings.models.product.SavingsProductData) r6
            com.revolut.feature.shared.savings.models.product.SavingsProduct r6 = r6.f86683a
            java.lang.String r6 = r6.f86617a
            java.lang.Object r7 = r0.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            rmb.a r7 = (rmb.a) r7
            com.revolut.feature.shared.savings.models.product.SavingsProductData r7 = r7.f255216b
            if (r7 == 0) goto L5d
            com.revolut.feature.shared.savings.models.product.SavingsProduct r7 = r7.f86683a
            java.lang.String r7 = r7.f86617a
            goto L5e
        L5d:
            r7 = r3
        L5e:
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L39
            goto L66
        L65:
            r5 = r3
        L66:
            com.revolut.feature.shared.savings.models.product.SavingsProductData r5 = (com.revolut.feature.shared.savings.models.product.SavingsProductData) r5
            if (r5 != 0) goto L6b
            goto L6d
        L6b:
            r3 = r5
            goto L76
        L6d:
            if (r9 == 0) goto L76
            java.lang.Object r9 = zhm.d0.d0(r9)
            r3 = r9
            com.revolut.feature.shared.savings.models.product.SavingsProductData r3 = (com.revolut.feature.shared.savings.models.product.SavingsProductData) r3
        L76:
            vkm.j2 r9 = r1.v
            r9.setValue(r3)
            rgf.m r9 = new rgf.m
            r4 = 11
            r9.<init>(r2, r3, r4)
            r1.H2(r0, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rmb.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
