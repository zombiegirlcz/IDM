package fq9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.payments.bills_chooser.impl.ui.itemization.members.ItemizationMembersController;
import f9g.l;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ItemizationMembersController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ItemizationMembersController itemizationMembersController, Continuation continuation) {
        super(2, continuation);
        this.v = itemizationMembersController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.S.getValue();
        Object obj3 = ((RowDelegate.Model) model.f53305b).u;
        fVar.getClass();
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str == null) {
            hx7.e.h(new IllegalArgumentException(a0.d.m(obj3, "Expected String parcel, got ")));
        } else {
            fVar.H2(fVar.o, new l(str, 17));
        }
        return Unit.f186387a;
    }
}
