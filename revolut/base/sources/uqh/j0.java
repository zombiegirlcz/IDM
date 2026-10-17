package uqh;

import com.revolut.data.model.Data;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSortingOptions;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f282155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i, Continuation continuation, l0 l0Var) {
        super(2, continuation);
        this.u = i;
        this.f282155w = l0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j0 j0Var = new j0(0, continuation, this.f282155w);
                j0Var.v = obj2;
                return j0Var;
            case 1:
                j0 j0Var2 = new j0(1, continuation, this.f282155w);
                j0Var2.v = obj2;
                return j0Var2;
            case 2:
                j0 j0Var3 = new j0(2, continuation, this.f282155w);
                j0Var3.v = obj2;
                return j0Var3;
            case 3:
                j0 j0Var4 = new j0(3, continuation, this.f282155w);
                j0Var4.v = obj2;
                return j0Var4;
            case 4:
                j0 j0Var5 = new j0(4, continuation, this.f282155w);
                j0Var5.v = obj2;
                return j0Var5;
            default:
                j0 j0Var6 = new j0(5, continuation, this.f282155w);
                j0Var6.v = obj2;
                return j0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((j0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        l0 l0Var = this.f282155w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0Var.X2(l0Var.f282162r, new unc.y(data, 6));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0Var.X2(l0Var.f282162r, new unc.y(data2, 7));
                break;
            case 2:
                t tVar = (t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0Var.X2(l0Var.f282162r, new um7.d(tVar, 22));
                break;
            case 3:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vki.a aVar5 = l0Var.f282162r;
                l0Var.X2(aVar5, new unc.y(data3, 8));
                zel.h hVar = (zel.h) data3.getContent();
                ScreenerSortingOptions screenerSortingOptions = hVar != null ? hVar.f321804c : null;
                if (screenerSortingOptions != null) {
                    if (l0Var.f282166x) {
                        l0Var.X2(aVar5, new um7.d(screenerSortingOptions.f105174c, 21));
                    } else {
                        l0Var.X2(aVar5, new e0(screenerSortingOptions, 0));
                    }
                }
                break;
            case 4:
                Data data4 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0Var.X2(l0Var.f282162r, new unc.y(data4, 9));
                break;
            default:
                Data data5 = (Data) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0Var.X2(l0Var.f282162r, new unc.y(data5, 10));
                break;
        }
        return Unit.f186387a;
    }
}
