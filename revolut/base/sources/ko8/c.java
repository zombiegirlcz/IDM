package ko8;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.enter_qr_data.EnterQrDataController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EnterQrDataController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EnterQrDataController enterQrDataController, Continuation continuation) {
        super(2, continuation);
        this.v = enterQrDataController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ?? r06 = this.v.O;
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = model.f52613a;
        if (Intrinsics.f(str, "ID_SUBMIT_ACTION")) {
            i iVar = (i) r06.getValue();
            iVar.C2(new f(((d) ((j2) iVar.f186275p.f22677a).getValue()).f186270a));
        } else if (Intrinsics.f(str, "ID_PASTE_AND_SUBMIT_ACTION")) {
            i iVar2 = (i) r06.getValue();
            String strD = iVar2.o.d();
            if (strD != null) {
                iVar2.C2(new f(strD));
            }
        }
        return Unit.f186387a;
    }
}
