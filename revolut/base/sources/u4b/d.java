package u4b;

import aw0.f4;
import com.revolut.feature.retail.cfd.impl.screens.withdraw.CfdWithdrawScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CfdWithdrawScreen f277289w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CfdWithdrawScreen cfdWithdrawScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f277289w = cfdWithdrawScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f277289w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            default:
                d dVar2 = new d(this.f277289w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        CfdWithdrawScreen cfdWithdrawScreen = this.f277289w;
        switch (i) {
            case 0:
                CharSequence text = (CharSequence) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = cfdWithdrawScreen.e3();
                Intrinsics.h(text);
                jVarE3.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                j2 j2Var = jVarE3.f277303t;
                do {
                    value = j2Var.getValue();
                    ((Number) value).longValue();
                } while (!j2Var.h(value, Long.valueOf(jVarE3.f277299p.b(text.toString(), jVarE3.o.f82284b.f306286a))));
                break;
            default:
                f4 f4Var = (f4) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = cfdWithdrawScreen.e3();
                jVarE32.H2(jVarE32.v, new rk.b(f4Var.f10304b, 21));
                break;
        }
        return Unit.f186387a;
    }
}
