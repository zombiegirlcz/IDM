package fb7;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class h0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ vh v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f133476w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(vh vhVar, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.v = vhVar;
        this.f133476w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h0(this.v, this.f133476w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objL;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.f133476w;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = ((RowDelegate.Model) this.v.f54884b).u;
            if (obj3 instanceof v) {
                r10.t tVar = i0Var.f133477p;
                String str = ((v) obj3).f133498a.getF89728b().f89729a;
                na7.b bVar = ((j) ((j2) i0Var.v.f22677a).getValue()).f133484c;
                this.u = 1;
                wa7.m mVar = (wa7.m) tVar.f250858b;
                int i2 = hb7.c.f150619a[bVar.ordinal()];
                if (i2 == 1) {
                    objL = mVar.l(str, "HIDDEN_ACCOUNTS", this);
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objL = mVar.l(str, "SECRET_ACCOUNTS", this);
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                    if (objL != aVar) {
                        objL = Unit.f186387a;
                    }
                }
                if (objL == aVar) {
                    return aVar;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        yhm.o.b(obj2);
        i0Var.C2(p.f133492a);
        return Unit.f186387a;
    }
}
