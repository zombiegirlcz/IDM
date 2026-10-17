package c7k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.money_request.impl.ui_kompot.reject_reason.MoneyRequestRejectWithReasonScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoneyRequestRejectWithReasonScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(MoneyRequestRejectWithReasonScreen moneyRequestRejectWithReasonScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moneyRequestRejectWithReasonScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.Z.getValue();
        String note = textData.f52598b.toString();
        j jVar = (j) bVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(note, "note");
        jVar.x2(new bd2.b(note, 28));
        return Unit.f186387a;
    }
}
