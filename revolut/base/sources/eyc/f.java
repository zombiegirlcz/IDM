package eyc;

import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreenActionButton;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreen;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.a;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ EntityHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(EntityHomeScreen entityHomeScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = entityHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            case 1:
                return new f(this.v, continuation, 1);
            default:
                return new f(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FincrimeHomeScreen$V2 fincrimeHomeScreen$V2;
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton;
        FincrimeHomeScreenActionButton fincrimeHomeScreenActionButton2;
        int i = this.u;
        EntityHomeScreen entityHomeScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) entityHomeScreen.e3();
                Object content = ((n) ((j2) bVar.f85856w.f22677a).getValue()).f130663b.getContent();
                fincrimeHomeScreen$V2 = content instanceof FincrimeHomeScreen$V2 ? (FincrimeHomeScreen$V2) content : null;
                if (fincrimeHomeScreen$V2 != null && (fincrimeHomeScreenActionButton = fincrimeHomeScreen$V2.f) != null) {
                    bVar.I2(fincrimeHomeScreenActionButton.f64148b);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar2 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) entityHomeScreen.e3();
                Object content2 = ((n) ((j2) bVar2.f85856w.f22677a).getValue()).f130663b.getContent();
                fincrimeHomeScreen$V2 = content2 instanceof FincrimeHomeScreen$V2 ? (FincrimeHomeScreen$V2) content2 : null;
                if (fincrimeHomeScreen$V2 != null && (fincrimeHomeScreenActionButton2 = fincrimeHomeScreen$V2.f64130g) != null) {
                    bVar2.I2(fincrimeHomeScreenActionButton2.f64148b);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.selfserve.entity.config.shared.ui.home.b bVar3 = (com.revolut.feature.selfserve.entity.config.shared.ui.home.b) entityHomeScreen.e3();
                if (((n) ((j2) bVar3.f85856w.f22677a).getValue()).f130662a) {
                    bVar3.C2(a.C0539a.f85849a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
