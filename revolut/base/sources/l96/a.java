package l96;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.feature.direct_deposit.impl.ui_kompot.screen.type_selection.DirectDepositTypeSelectionSheet;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDepositTypeSelectionSheet v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DirectDepositTypeSelectionSheet directDepositTypeSelectionSheet, Continuation continuation) {
        super(2, continuation);
        this.v = directDepositTypeSelectionSheet;
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

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.T.getValue();
        Intrinsics.h(model);
        f fVar = (f) eVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        if (obj3 instanceof DepositAmount) {
            fVar.C2(new d((DepositAmount) obj3));
        }
        return Unit.f186387a;
    }
}
