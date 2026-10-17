package tl7;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = this.v;
        j60.a.v(fVar.f272009c, false, null, 3);
        String str = model.f52613a;
        int iHashCode = str.hashCode();
        if (iHashCode != -1367868369) {
            if (iHashCode != -1350029187) {
                if (iHashCode == 582202889 && str.equals("TIME_PICKER_BUTTON_ID")) {
                    fVar.f272018r.invoke(fVar.f272013l);
                }
            } else if (str.equals("SECONDARY_BUTTON")) {
                fVar.f272015n.invoke();
            }
        } else if (str.equals("PRIMARY_BUTTON")) {
            fVar.f272014m.invoke();
        }
        return Unit.f186387a;
    }
}
