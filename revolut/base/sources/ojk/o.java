package ojk;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f225830w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f225831x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f225830w = qVar;
        this.f225831x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f225830w, this.f225831x, continuation, 0);
            case 1:
                return new o(this.f225830w, this.f225831x, continuation, 1);
            default:
                return new o(this.f225830w, this.f225831x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                efm.d0 d0VarC = ((s06.j) this.f225830w.o).c(this.f225831x, false, lg0.a.OPEN_BROWSER);
                this.v = 1;
                Object objB = nim.a.b(d0VarC, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    q qVar = this.f225830w;
                    ajk.c cVar = qVar.f225837q;
                    boolean z = qVar.f225839s;
                    String str = this.f225831x;
                    ViewController viewControllerA = cVar.a(str, z);
                    if (viewControllerA != null) {
                        yji.l.j2(qVar, viewControllerA, ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
                        return Unit.f186387a;
                    }
                    ajk.b bVar = qVar.f225838r;
                    oa2.b bVar2 = new oa2.b(qVar, str, 16);
                    this.v = 1;
                    if (igk.k.b(qVar, bVar, str, bVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    q qVar2 = this.f225830w;
                    o oVar = new o(qVar2, this.f225831x, null, 1);
                    this.v = 1;
                    if (qVar2.p2(this, oVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
