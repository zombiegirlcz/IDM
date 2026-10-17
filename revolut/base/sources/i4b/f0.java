package i4b;

import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g0 f158331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ MarginQuote f158332x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, MarginQuote marginQuote, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f158331w = g0Var;
        this.f158332x = marginQuote;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f0(this.f158331w, this.f158332x, continuation, 0);
            default:
                return new f0(this.f158331w, this.f158332x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c4  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4b.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
