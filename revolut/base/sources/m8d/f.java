package m8d;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.pigeon.content.PigeonContentScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PigeonContentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PigeonContentScreen pigeonContentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pigeonContentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        u uVarT2 = this.v.T2();
        CharSequence comment = textData.f52598b;
        h0 h0Var = (h0) uVarT2;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        h0Var.u.t1(comment);
        return Unit.f186387a;
    }
}
