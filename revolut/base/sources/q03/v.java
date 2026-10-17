package q03;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.settings.b f241103w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(RowDelegate.Model model, com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = model;
        this.f241103w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f241103w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            RowDelegate.Model model = this.v;
            String str = model.f53228a;
            boolean zF = Intrinsics.f(str, "CARD_SCA_ITEM");
            com.revolut.feature.card_management.impl.ui.kompot.settings.b bVar = this.f241103w;
            if (zF) {
                Object obj3 = model.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.cards.models.revolutcard.RevolutCard");
                bVar.I2((h93.f0) obj3);
            } else if (Intrinsics.f(str, "CARD_ITEM_LIST_ID")) {
                u uVar = new u(model, bVar, null);
                this.u = 1;
                if (u0.b0(bVar.X(), "CARD_ITEM_LIST_ID", uVar, this) == aVar) {
                    return aVar;
                }
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
