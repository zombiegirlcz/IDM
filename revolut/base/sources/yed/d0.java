package yed;

import com.revolut.data.model.Data;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b f312856w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f312856w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d0 d0Var = new d0(0, this.f312856w, continuation);
                d0Var.v = obj2;
                return d0Var;
            case 1:
                d0 d0Var2 = new d0(1, this.f312856w, continuation);
                d0Var2.v = obj2;
                return d0Var2;
            case 2:
                d0 d0Var3 = new d0(2, this.f312856w, continuation);
                d0Var3.v = obj2;
                return d0Var3;
            case 3:
                d0 d0Var4 = new d0(3, this.f312856w, continuation);
                d0Var4.v = obj2;
                return d0Var4;
            default:
                d0 d0Var5 = new d0(4, this.f312856w, continuation);
                d0Var5.v = obj2;
                return d0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d0) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d0) create((BigDecimal) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d0) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 8;
        com.revolut.feature.shared_separate_favourites.alerts.ui.screen.create_alert.b bVar = this.f312856w;
        switch (i) {
            case 0:
                List list = (List) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new x5f.m(list, 15));
                bVar.E2();
                break;
            case 1:
                n nVar = (n) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new g0(nVar, 0));
                break;
            case 2:
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new y4c.i(data, 26));
                break;
            case 3:
                BigDecimal bigDecimal = (BigDecimal) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new b4b.x(i2, bigDecimal));
                bVar.E2();
                break;
            default:
                String str = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.x2(new y9d.c(str, i2));
                break;
        }
        return Unit.f186387a;
    }
}
