package hgb;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_hub.a f152163w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f152163w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f152163w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            default:
                z zVar2 = new z(this.f152163w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((do3.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.u
            com.revolut.feature.retail.salary_account.impl.salary_hub.a r1 = r6.f152163w
            switch(r0) {
                case 0: goto L64;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r6.v
            com.revolut.data.model.Data r0 = (com.revolut.data.model.Data) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            java.lang.Object r7 = r0.getContent()
            mgb.n r7 = (mgb.n) r7
            boolean r7 = r7 instanceof mgb.m
            if (r7 == 0) goto L26
            boolean r7 = r0.getLoading()
            if (r7 != 0) goto L61
            hgb.o r7 = hgb.o.f152150a
            r1.C2(r7)
            goto L61
        L26:
            r7 = 0
            java.lang.Object r2 = r0.getContent()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L3e
            mgb.n r2 = (mgb.n) r2     // Catch: java.lang.Throwable -> L36
            boolean r3 = r2 instanceof mgb.l     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L38
            mgb.l r2 = (mgb.l) r2     // Catch: java.lang.Throwable -> L36
            goto L39
        L36:
            r2 = move-exception
            goto L4d
        L38:
            r2 = r7
        L39:
            if (r2 == 0) goto L3e
            mgb.k r2 = r2.f205252a     // Catch: java.lang.Throwable -> L36
            goto L3f
        L3e:
            r2 = r7
        L3f:
            java.lang.Throwable r3 = r0.getError()     // Catch: java.lang.Throwable -> L36
            boolean r4 = r0.getLoading()     // Catch: java.lang.Throwable -> L36
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L36
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L36
            goto L56
        L4d:
            com.revolut.data.model.Data r5 = new com.revolut.data.model.Data
            boolean r0 = r0.getLoading()
            r5.<init>(r7, r2, r0)
        L56:
            cli.y r7 = r1.f82995t
            hea.e0 r0 = new hea.e0
            r2 = 4
            r0.<init>(r5, r2)
            r1.H2(r7, r0)
        L61:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L64:
            java.lang.Object r0 = r6.v
            do3.g r0 = (do3.g) r0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r7)
            cli.y r7 = r1.f82995t
            hg4.a r2 = new hg4.a
            r3 = 1
            r2.<init>(r0, r3)
            r1.H2(r7, r2)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hgb.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
