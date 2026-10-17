package q03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f241104w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(RowDelegate.Model model, com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f241104w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.f241104w, this.v, continuation);
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
            n0 n0Var = this.v.f64912s;
            RowDelegate.Model model = this.f241104w;
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.settings.CardSettingsType");
            RowDelegate.Model.c cVar = model.k;
            Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
            boolean z = !((vf) cVar).f54880a;
            this.u = 1;
            if (((h0) n0Var).f((i93.e) obj3, z, this) == aVar) {
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
