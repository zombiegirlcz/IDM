package wff;

import com.revolut.feature.transaction.troubleshooter.api.domain.models.TroubleshooterAction;
import com.revolut.feature.transaction.troubleshooter.impl.ui.flow.screen.detail.TroubleshooterDetailScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import zhm.d0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TroubleshooterDetailScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(TroubleshooterDetailScreen troubleshooterDetailScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = troubleshooterDetailScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.v, continuation, 0);
            case 1:
                return new g(this.v, continuation, 1);
            default:
                return new g(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        int i = this.u;
        TroubleshooterDetailScreen troubleshooterDetailScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar = (x) troubleshooterDetailScreen.i3();
                TroubleshooterAction troubleshooterAction = (TroubleshooterAction) d0.e0(0, xVar.f297108r.f91885b.f91843g);
                if (troubleshooterAction != null && (str = troubleshooterAction.f91848c) != null) {
                    xVar.z2(str);
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVar2 = (x) troubleshooterDetailScreen.i3();
                TroubleshooterAction troubleshooterAction2 = (TroubleshooterAction) d0.e0(1, xVar2.f297108r.f91885b.f91843g);
                if (troubleshooterAction2 != null && (str2 = troubleshooterAction2.f91848c) != null) {
                    xVar2.z2(str2);
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                troubleshooterDetailScreen.m2().onBackPressed();
                break;
        }
        return Unit.f186387a;
    }
}
