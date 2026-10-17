package g03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f139280w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f139280w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, this.f139280w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RowDelegate.Model model = this.f139280w;
            com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = this.v;
            v vVar = new v(bVar, model, null);
            this.u = 1;
            if (bVar.p2(this, vVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
