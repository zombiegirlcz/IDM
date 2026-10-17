package wuh;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f f300155w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ od9.e f300156x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.workflow.engine.sdk_flow.f fVar, od9.e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f300155w = fVar;
        this.f300156x = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f300155w, this.f300156x, continuation, 0);
            case 1:
                return new l(this.f300155w, this.f300156x, continuation, 1);
            case 2:
                return new l(this.f300155w, this.f300156x, continuation, 2);
            default:
                return new l(this.f300155w, this.f300156x, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wuh.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
