package j54;

import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.retail.core.navigation.NaviCommand;
import ft3.j1;
import j54.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class o0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r0 f171535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PluginPayload f171536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c84.p f171537y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(r0 r0Var, PluginPayload pluginPayload, c84.p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171535w = r0Var;
        this.f171536x = pluginPayload;
        this.f171537y = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o0(this.f171535w, this.f171536x, this.f171537y, continuation, 0);
            case 1:
                return new o0(this.f171535w, this.f171536x, this.f171537y, continuation, 1);
            case 2:
                return new o0(this.f171535w, this.f171536x, this.f171537y, continuation, 2);
            case 3:
                return new o0(this.f171535w, this.f171536x, this.f171537y, continuation, 3);
            default:
                return new o0(this.f171535w, this.f171536x, this.f171537y, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    f fVar = this.f171535w.f171556s;
                    c84.m mVar = (c84.m) this.f171537y;
                    boolean z = mVar.f22098a;
                    String str = mVar.f22099b;
                    this.v = 1;
                    if (((com.revolut.feature.credit.application.plugins.impl.ui.application.extensions.c) fVar).b3(this.f171536x, z, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    r0 r0Var = this.f171535w;
                    o0 o0Var = new o0(r0Var, this.f171536x, this.f171537y, null, 0);
                    this.v = 1;
                    if (r0Var.Y2(this, o0Var) == aVar2) {
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
                    v vVar = this.f171535w.f171555r;
                    String str2 = this.f171536x.f66247a.f168323a;
                    NaviCommand naviCommand = ((c84.n) this.f171537y).f22100a;
                    this.v = 1;
                    y yVar = (y) vVar;
                    mri.w wVar = yVar.f171584l;
                    if (str2 != null) {
                        mri.w.r0(wVar, str2);
                    }
                    pw5.a.x(wVar);
                    yVar.r2().M0(new t.b(naviCommand, str2));
                    if (Unit.f186387a == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    v vVar2 = this.f171535w.f171555r;
                    String str3 = this.f171536x.f66247a.f168323a;
                    c84.j jVar = (c84.j) this.f171537y;
                    j1 j1Var = jVar.f22092a;
                    String str4 = jVar.f22093b;
                    this.v = 1;
                    y yVar2 = (y) vVar2;
                    mri.w wVar2 = yVar2.f171584l;
                    mri.w.r0(wVar2, str3);
                    pw5.a.w(wVar2);
                    yVar2.r2().M0(new u(j1Var, str4, null));
                    if (Unit.f186387a == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    v vVar3 = this.f171535w.f171555r;
                    String str5 = this.f171536x.f66247a.f168323a;
                    NaviCommand naviCommand2 = ((c84.l) this.f171537y).f22097a;
                    this.v = 1;
                    if (((y) vVar3).Z2(str5, naviCommand2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
