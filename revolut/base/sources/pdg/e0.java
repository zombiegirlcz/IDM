package pdg;

import com.revolut.data.model.Data;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import java.time.LocalDate;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f235183w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(i0 i0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f235183w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f235183w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f235183w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(this.f235183w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0(this.f235183w, continuation, 3);
                e0Var4.v = obj2;
                return e0Var4;
            case 4:
                e0 e0Var5 = new e0(this.f235183w, continuation, 4);
                e0Var5.v = obj2;
                return e0Var5;
            default:
                e0 e0Var6 = new e0(this.f235183w, continuation, 5);
                e0Var6.v = obj2;
                return e0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e0) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((b0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 24;
        int i3 = 25;
        i0 i0Var = this.f235183w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.E, new ox5.m0(data, i2));
                break;
            case 1:
                LocalDate localDate = (LocalDate) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.E, new a15.l(i2, localDate));
                break;
            case 2:
                LocalDate localDate2 = (LocalDate) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.E, new a15.l(i3, localDate2));
                break;
            case 3:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.E, new njf.e(list, 18));
                break;
            case 4:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i0Var.H2(i0Var.E, new ox5.m0(data2, i3));
                break;
            default:
                b0 b0Var = (b0) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data3 = b0Var.f235174a;
                List list2 = b0Var.f235175b;
                Data data4 = b0Var.f235176c;
                i0Var.H2(i0Var.E, new n68.w(data3, b0Var.d, data4, list2, 24));
                HotelsProperty hotelsProperty = (HotelsProperty) data3.getContent();
                if (hotelsProperty != null) {
                    i0Var.l2(new c0(i0Var, hotelsProperty, null, 5), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
