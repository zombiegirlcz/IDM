package r15;

import com.revolut.core.ui_kit.views.ActionsView;
import ip0.x10;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import wli.x;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ x10 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f250909w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x10 x10Var, n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = x10Var;
        this.f250909w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, this.f250909w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        x10 x10Var = this.v;
        ActionsView.Item item = x10Var.f167082b;
        Object obj3 = item.f58324n;
        boolean z = obj3 instanceof e;
        n nVar = this.f250909w;
        if (z) {
            nVar.y2();
            return Unit.f186387a;
        }
        if (!(obj3 instanceof f)) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "FinancialDifficultiesScreenModel.kt", a0.d.s("Unsupported clickData: modelListId=", x10Var.f167081a.f54700a, ", itemListId=", item.f58316a), null, h0Var);
            return Unit.f186387a;
        }
        x xVar = nVar.f250910p;
        String str = ((f) obj3).f250905a;
        this.u = 1;
        Object objX1 = lg0.b.x1(xVar, str, null, null, this, 6);
        return objX1 == aVar ? aVar : objX1;
    }
}
