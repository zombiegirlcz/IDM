package tea;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.feature.pockets.impl.new_pocket_details.NewPocketDetailsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NewPocketDetailsScreen newPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        ((d) create((SmallActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        throw null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SmallActionButtonDelegate.Model model = (SmallActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.v.e3();
        Intrinsics.h(model);
        throw null;
    }
}
