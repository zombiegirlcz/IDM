package khj;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.device_picker.EsimDevicePickerControllerScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimDevicePickerControllerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EsimDevicePickerControllerScreen esimDevicePickerControllerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimDevicePickerControllerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.U.getValue();
        Object obj3 = model.u;
        j jVar = (j) eVar;
        if (obj3 instanceof i) {
            jVar.H2(jVar.f184157q, new ib6.j(obj3, 8));
            jVar.C2(new d((i) obj3));
        } else {
            jVar.getClass();
        }
        return Unit.f186387a;
    }
}
