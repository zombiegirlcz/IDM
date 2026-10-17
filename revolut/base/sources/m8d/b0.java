package m8d;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.help_centre.impl.utils.FaqNotLoadedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ h0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h0 h0Var, Continuation continuation) {
        super(2, continuation);
        this.v = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b0 b0Var = new b0(this.v, continuation);
        b0Var.u = obj2;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws FaqNotLoadedException {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean loading = data.getLoading();
        h0 h0Var = this.v;
        if (loading || data.getContent() != null) {
            h0Var.x2(new lul.d(h0Var, data, 26));
            return Unit.f186387a;
        }
        FaqNotLoadedException.Companion companion = FaqNotLoadedException.INSTANCE;
        String str = h0Var.v.f86287a;
        companion.getClass();
        FaqNotLoadedException.Companion.a(str);
        throw null;
    }
}
