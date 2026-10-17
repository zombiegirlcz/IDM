package wuh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f f300157w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.workflow.engine.sdk_flow.f fVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f300157w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f300157w, continuation, 0);
            case 1:
                return new m(this.f300157w, continuation, 1);
            case 2:
                return new m(this.f300157w, continuation, 2);
            case 3:
                return new m(this.f300157w, continuation, 3);
            case 4:
                return new m(this.f300157w, continuation, 4);
            case 5:
                return new m(this.f300157w, continuation, 5);
            case 6:
                return new m(this.f300157w, continuation, 6);
            case 7:
                return new m(this.f300157w, continuation, 7);
            default:
                return new m(this.f300157w, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wuh.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
