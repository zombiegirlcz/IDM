package hi1;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.address.common.impl.flow.screen.add.address_type.AddressTypeBottomSheetScreen;
import com.revolut.feature.address.models.Address;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AddressTypeBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AddressTypeBottomSheetScreen addressTypeBottomSheetScreen, Continuation continuation) {
        super(2, continuation);
        this.v = addressTypeBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.f;
        Address.Type type = obj3 instanceof Address.Type ? (Address.Type) obj3 : null;
        h hVar = (h) this.v.T.getValue();
        f event = new f(type);
        hVar.getClass();
        Intrinsics.checkNotNullParameter(event, "event");
        if (type != null) {
            hVar.C2(new d(type));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Address type is null");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
