package mz3;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f0 f210593w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f210594x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(f0 f0Var, PluginPayload pluginPayload, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f210593w = f0Var;
        this.f210594x = pluginPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(this.f210593w, this.f210594x, continuation, 0);
            default:
                return new e0(this.f210593w, this.f210594x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        PluginPayload pluginPayload = this.f210594x;
        f0 f0Var = this.f210593w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    vw3.f fVar = f0Var.f210598a;
                    String str = pluginPayload.f66247a.f168323a;
                    this.v = 1;
                    if (fVar.a(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                vw3.d dVar = f0Var.f210599b;
                String str2 = pluginPayload.f66247a.f168323a;
                this.v = 1;
                a34.c cVar = dVar.f292618b;
                cVar.getClass();
                a34.b bVar = new a34.b(cVar, str2, null, i2);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, bVar, this);
                return objJ == aVar2 ? aVar2 : objJ;
        }
    }
}
