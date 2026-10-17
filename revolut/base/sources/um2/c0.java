package um2;

import com.revolut.feature.backgroundpicker.impl.interactor.ThemeCustomisationSandboxInteractorImpl$SandboxState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b f281186w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281186w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f281186w, continuation, 0);
            case 1:
                return new c0(this.f281186w, continuation, 1);
            default:
                return new c0(this.f281186w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c0) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
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
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar = this.f281186w;
                uk9.h hVar = new uk9.h(bVar, null, 2);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "clearThemeBgs", hVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar2 = this.f281186w;
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.a aVar3 = new com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.a(bVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "applyThemeCustomisation", aVar3, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.b bVar3 = this.f281186w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    vjg.g gVar = bVar3.f63794x;
                    this.v = 1;
                    if (((gwl.d) gVar).g(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bn2.e0 e0Var = bVar3.u;
                j2 j2Var = e0Var.f17005j;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, ThemeCustomisationSandboxInteractorImpl$SandboxState.a((ThemeCustomisationSandboxInteractorImpl$SandboxState) value, e0Var.f17002c.j(), null, null, 6)));
                return Unit.f186387a;
        }
    }
}
