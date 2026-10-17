package ilj;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.retail.feature.esim.api.model.EsimPickerItem;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.picker.EsimPickerScreen;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EsimPickerScreen esimPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.Q.getValue();
        Object obj3 = model.f;
        EsimPickerItem esimPickerItem = obj3 instanceof EsimPickerItem ? (EsimPickerItem) obj3 : null;
        gVar.getClass();
        if (esimPickerItem != null) {
            gVar.C2(new e(esimPickerItem));
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "EsimPickerScreenModel", "onItemClick: item null", null, h0Var);
        }
        return Unit.f186387a;
    }
}
