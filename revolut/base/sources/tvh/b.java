package tvh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AccountWidgetConfigScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AccountWidgetConfigScreen accountWidgetConfigScreen, Continuation continuation) {
        super(2, continuation);
        this.v = accountWidgetConfigScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        if (obj3 instanceof ida.c) {
            g gVar = (g) this.v.W.getValue();
            ida.c parcel = (ida.c) obj3;
            gVar.getClass();
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            gVar.l2(new f(parcel, gVar, null), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
