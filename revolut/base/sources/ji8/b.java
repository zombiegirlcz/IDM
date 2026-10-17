package ji8;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.gender.JuniorGenderPickerScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorGenderPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorGenderPickerScreen juniorGenderPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorGenderPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.S.getValue();
        Intrinsics.h(model);
        g gVar = (g) fVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (obj3 instanceof bj0.b) {
            if (obj3 != gVar.o.f174385a) {
                gVar.C2(new e((bj0.b) obj3));
            } else {
                gVar.B2();
            }
        }
        return Unit.f186387a;
    }
}
