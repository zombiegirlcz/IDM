package wo7;

import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.youTransactor.uCube.rpc.Constants;
import ip0.vd;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ DateSelectorScreen f298897w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(DateSelectorScreen dateSelectorScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f298897w = dateSelectorScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f298897w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f298897w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((vd) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        DateSelectorScreen dateSelectorScreen = this.f298897w;
        switch (i) {
            case 0:
                String id10 = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar = (i) dateSelectorScreen.Z.getValue();
                Intrinsics.h(id10);
                iVar.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                tl7.f.R(iVar.f298904p, R$string.car_insurance_policy_start_date_learn_more_title, R$string.car_insurance_policy_start_date_learn_more_description, null, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE);
                break;
            default:
                vd vdVar = (vd) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                i iVar2 = (i) dateSelectorScreen.Z.getValue();
                LocalDate selectedDate = vdVar.f166807b;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedDate, "selectedDate");
                iVar2.x2(new t5g.h(8, selectedDate));
                break;
        }
        return Unit.f186387a;
    }
}
