package se4;

import cli.y;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import ft3.h1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.k0;
import skm.p0;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f262111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f262111w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f262111w, continuation, 0);
            case 1:
                return new m(this.f262111w, continuation, 1);
            case 2:
                return new m(this.f262111w, continuation, 2);
            default:
                return new m(this.f262111w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        o oVar = this.f262111w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                o.I2(oVar);
                return Unit.f186387a;
            case 1:
                y yVar = oVar.f262116s;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    String str = ((e) ((j2) yVar.f22677a).getValue()).f262100a;
                    re4.e eVar = oVar.o;
                    this.v = 1;
                    px3.a aVar3 = eVar.f253518b;
                    h1 h1VarA9 = eVar.f253517a.a9();
                    t34.e eVar2 = aVar3.f240564a;
                    eVar2.getClass();
                    t34.c cVar = new t34.c(eVar2, h1VarA9, str, null, 1);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, cVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        o.I2(oVar);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objJ = obj2;
                }
                yy3.y yVar2 = (yy3.y) objJ;
                oVar.H2(yVar, new scl.e(yVar2, 10));
                int i5 = n.f262112a[yVar2.f317806a.ordinal()];
                if (i5 == 1) {
                    oVar.C2(i.f262105a);
                } else if (i5 == 2) {
                    this.v = 2;
                    if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar2) {
                        return aVar2;
                    }
                    o.I2(oVar);
                } else if (i5 != 3 && i5 != 4 && i5 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (k0.b(CapturePresenter.PASSPORT_OVERLAY_DELAY_MS, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                o.I2(oVar);
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                rik.e eVar3 = new rik.e(oVar, null, 22);
                this.v = 1;
                Object objB = pu7.a.B(oVar.k, "startSigningProcess", eVar3, this);
                return objB == aVar5 ? aVar5 : objB;
        }
    }
}
