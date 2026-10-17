package ccb;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f23023w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, c0 c0Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f23023w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                x xVar = new x(0, this.f23023w, continuation);
                xVar.v = obj2;
                return xVar;
            case 1:
                x xVar2 = new x(1, this.f23023w, continuation);
                xVar2.v = obj2;
                return xVar2;
            default:
                x xVar3 = new x(2, this.f23023w, continuation);
                xVar3.v = obj2;
                return xVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((x) create((bcb.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((x) create((Image) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((x) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        c0 c0Var = this.f23023w;
        switch (i) {
            case 0:
                bcb.e eVar = (bcb.e) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.x2(new c69.v(eVar, 24));
                break;
            case 1:
                Image image = (Image) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.x2(new be3.l(1, image));
                break;
            default:
                i iVar = (i) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c0Var.x2(new c69.v(iVar, 26));
                break;
        }
        return Unit.f186387a;
    }
}
