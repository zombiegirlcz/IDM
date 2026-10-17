package e7f;

import com.revolut.data.model.Data;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import com.revolut.feature.wealth.models.robo.Template;
import do3.n;
import ekf.j0;
import ekf.x;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import oim.p;
import tof.a3;
import tof.t3;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements p {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f123311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f123312x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f123313y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Continuation continuation) {
        super(6, continuation);
        this.u = i;
    }

    @Override // oim.p
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        switch (this.u) {
            case 0:
                a aVar = new a(0, (Continuation) obj7);
                aVar.v = (Data) obj2;
                aVar.f123311w = (Data) obj3;
                aVar.f123312x = (Data) obj4;
                aVar.f123313y = (Data) obj5;
                aVar.z = (Data) obj6;
                return aVar.invokeSuspend(Unit.f186387a);
            default:
                a aVar2 = new a(1, (Continuation) obj7);
                aVar2.v = (a3) obj2;
                aVar2.f123311w = (n) obj3;
                aVar2.f123312x = (t3) obj4;
                aVar2.f123313y = (j1) obj5;
                aVar2.z = (j0) obj6;
                return aVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Template template;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                Data data2 = (Data) this.f123311w;
                Data data3 = (Data) this.f123312x;
                Data data4 = (Data) this.f123313y;
                Data data5 = (Data) this.z;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVar = new e(data, data2, data3, data4);
                RoboPortfolioInfo roboPortfolioInfo = (RoboPortfolioInfo) data5.getContent();
                return new c(eVar, (roboPortfolioInfo == null || (template = roboPortfolioInfo.f95701a) == null) ? null : template.f95706a);
            default:
                a3 a3Var = (a3) this.v;
                n nVar = (n) this.f123311w;
                t3 t3Var = (t3) this.f123312x;
                j1 j1Var = (j1) this.f123313y;
                j0 j0Var = (j0) this.z;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return new x(a3Var, nVar, t3Var, j1Var, j0Var.f127094a, j0Var.f127095b, j0Var.f127096c, j0Var.d);
        }
    }
}
