package byc;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FincrimeHomeScreenAction.Request f19803w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, FincrimeHomeScreenAction.Request request, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f19803w = request;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f19803w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e4, code lost:
    
        if (r2.emit(r3, r20) == r1) goto L35;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: byc.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
