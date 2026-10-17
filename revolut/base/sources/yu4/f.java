package yu4;

import al4.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import om4.x2;
import vkm.j2;
import yhm.o;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f316881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f316881w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f316881w, continuation, 0);
            default:
                return new f(this.f316881w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                g gVar = this.f316881w;
                if (i == 0) {
                    o.b(obj2);
                    n nVar = gVar.f316882p;
                    String str = gVar.o.f69630a;
                    int i2 = ((d) ((j2) gVar.f316883q.f22677a).getValue()).f316877b;
                    this.v = 1;
                    if (((x2) nVar).g(str, i2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                l.b1(gVar, gVar.X1(new mii.f("id_credit_card_change_due_date_dialog_success", new TextLocalisedClause(R$string.credit_card_select_due_date_success, null, null, 14), null, null, null, null, 124)), null, null, 7);
                gVar.B2();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    g gVar2 = this.f316881w;
                    f fVar = new f(gVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(gVar2.X(), "tag_credit_card_change_due_date_action", fVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
