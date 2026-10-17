package rv6;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import rp0.y;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f257712w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f257712w = uVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f257712w, continuation, 0);
            default:
                return new t(this.f257712w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                u uVar = this.f257712w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(uVar, null, 0);
                    this.v = 1;
                    obj2 = uVar.p2(this, sVar);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return uVar.C1(u0.b((NaviCommand) obj2));
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                u uVar2 = this.f257712w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    s sVar2 = new s(uVar2, null, 1);
                    this.v = 1;
                    obj2 = uVar2.p2(this, sVar2);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                efm.b bVarG = uVar2.o.G((y) obj2);
                this.v = 2;
                if (nim.a.a(bVarG, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
        }
    }
}
