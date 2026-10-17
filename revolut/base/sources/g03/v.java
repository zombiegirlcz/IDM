package g03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f139279w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, RowDelegate.Model model, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
        this.f139279w = model;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new v(this.v, this.f139279w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((v) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RowDelegate.Model model = this.f139279w;
            Object obj3 = model.u;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.settings.CardSettingsType");
            RowDelegate.Model.c cVar = model.k;
            Intrinsics.i(cVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.RowDelegate.Model.Value.Switch");
            boolean z = !((vf) cVar).f54880a;
            this.u = 1;
            if (this.v.M2((i93.e) obj3, z, this) == aVar) {
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
