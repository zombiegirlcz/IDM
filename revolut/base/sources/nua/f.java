package nua;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.recurring_buys.schedule.impl.ui.frequency_picker.FrequencyPickerController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FrequencyPickerController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(FrequencyPickerController frequencyPickerController, Continuation continuation) {
        super(2, continuation);
        this.v = frequencyPickerController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.L.getValue();
        Object obj3 = model.f;
        hVar.getClass();
        if (obj3 instanceof hua.c) {
            hVar.C2(new b((hua.c) obj3));
        }
        return Unit.f186387a;
    }
}
