package wo7;

import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DateSelectorScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(DateSelectorScreen dateSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dateSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DateSelectorScreen dateSelectorScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                dateSelectorScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) dateSelectorScreen.Z.getValue();
                LocalDate localDateE = ((l80.f) iVar.f298905q).e();
                if (((d) iVar.t2()).f298898a.isBefore(localDateE)) {
                    iVar.x2(new t5g.h(7, localDateE));
                } else {
                    iVar.v2(new e(((d) iVar.t2()).f298898a));
                }
                break;
        }
        return Unit.f186387a;
    }
}
