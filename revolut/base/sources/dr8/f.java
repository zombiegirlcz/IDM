package dr8;

import fr8.n;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a f117110w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f117111x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.junior_transfer.impl.ui.flow.transfer.a aVar, n nVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f117110w = aVar;
        this.f117111x = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f117110w, this.f117111x, continuation, 0);
            case 1:
                return new f(this.f117110w, this.f117111x, continuation, 1);
            case 2:
                return new f(this.f117110w, this.f117111x, continuation, 2);
            case 3:
                return new f(this.f117110w, this.f117111x, continuation, 3);
            case 4:
                return new f(this.f117110w, this.f117111x, continuation, 4);
            default:
                return new f(this.f117110w, this.f117111x, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr8.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
