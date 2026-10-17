package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109128w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f109128w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k1(this.f109128w, continuation, 0);
            case 1:
                return new k1(this.f109128w, continuation, 1);
            case 2:
                return new k1(this.f109128w, continuation, 2);
            case 3:
                return new k1(this.f109128w, continuation, 3);
            case 4:
                return new k1(this.f109128w, continuation, 4);
            case 5:
                return new k1(this.f109128w, continuation, 5);
            case 6:
                return new k1(this.f109128w, continuation, 6);
            case 7:
                return new k1(this.f109128w, continuation, 7);
            case 8:
                return new k1(this.f109128w, continuation, 8);
            case 9:
                return new k1(this.f109128w, continuation, 9);
            case 10:
                return new k1(this.f109128w, continuation, 10);
            case 11:
                return new k1(this.f109128w, continuation, 11);
            case 12:
                return new k1(this.f109128w, continuation, 12);
            case 13:
                return new k1(this.f109128w, continuation, 13);
            case 14:
                return new k1(this.f109128w, continuation, 14);
            default:
                return new k1(this.f109128w, continuation, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r5v21, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 1628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
