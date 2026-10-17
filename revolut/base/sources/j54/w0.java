package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class w0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y0 f171577w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f171578x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z0 f171579y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(y0 y0Var, String str, z0 z0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171577w = y0Var;
        this.f171578x = str;
        this.f171579y = z0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new w0(this.f171577w, this.f171578x, this.f171579y, continuation, 0);
            case 1:
                return new w0(this.f171577w, this.f171578x, this.f171579y, continuation, 1);
            case 2:
                return new w0(this.f171577w, this.f171578x, this.f171579y, continuation, 2);
            default:
                return new w0(this.f171577w, this.f171578x, this.f171579y, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((w0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                y0 y0Var = this.f171577w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    xq3.j jVar = y0Var.o;
                    this.v = 1;
                    obj2 = jVar.f(this.f171578x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                it3.d dVar = (it3.d) obj2;
                f fVar = y0Var.f171591p;
                z0 z0Var = this.f171579y;
                PluginPayload pluginPayload = new PluginPayload(dVar, z0Var.f171594c, z0Var.e, false, null);
                this.v = 2;
                if (((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) fVar).b3(pluginPayload, true, null, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y0 y0Var2 = this.f171577w;
                    w0 w0Var = new w0(y0Var2, this.f171578x, this.f171579y, null, 0);
                    this.v = 1;
                    if (y0Var2.Y2(this, w0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    i0 i0Var = this.f171577w.f171589m;
                    boolean z = this.f171579y.d;
                    this.v = 1;
                    if (((r0) i0Var).b3(this, this.f171578x, z) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    y0 y0Var3 = this.f171577w;
                    w0 w0Var2 = new w0(y0Var3, this.f171578x, this.f171579y, null, 2);
                    this.v = 1;
                    if (y0Var3.Y2(this, w0Var2) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
