package vha;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.pro.accounts.impl.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ q0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f289452w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(q0 q0Var, String str, Continuation continuation) {
        super(1, continuation);
        this.v = q0Var;
        this.f289452w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new x(this.v, this.f289452w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((x) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        q0 q0Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            t38.e eVar = new t38.e(mo3.a.g(rd0.e.b(q0Var.o.b(sfe.a.FULL)), null, new vgg.a0(9), 1), 21, q0Var, this.f289452w);
            this.u = 1;
            obj2 = vkm.q.x(eVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List list = (List) obj2;
        j60.a aVar2 = q0Var.f289421s;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        aVar2.x(new rp0.y(list, new rp0.t(new TextLocalisedClause(R$string.freelancer_account_picker_header_title, null, null, 14), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}
