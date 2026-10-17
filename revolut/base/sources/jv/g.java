package jv;

import com.revolut.camerakit.core.errors.CameraKitException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f178702w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f178703x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f178703x = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                g gVar = new g(this.f178703x, continuation, 0);
                gVar.f178702w = obj2;
                return gVar;
            case 1:
                g gVar2 = new g(this.f178703x, continuation, 1);
                gVar2.f178702w = obj2;
                return gVar2;
            default:
                g gVar3 = new g(this.f178703x, continuation, 2);
                gVar3.f178702w = obj2;
                return gVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((g) create((CameraKitException) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((g) create((gv.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((g) create((rz.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                CameraKitException cameraKitException = (CameraKitException) this.f178702w;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = this.f178703x.f178729s;
                    dv.b bVar = new dv.b(cameraKitException);
                    this.f178702w = null;
                    this.v = 1;
                    if (z1Var.emit(bVar, this) == aVar) {
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
                gv.d dVar = (gv.d) this.f178702w;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var2 = this.f178703x.f178729s;
                    dv.d dVar2 = new dv.d(dVar);
                    this.f178702w = null;
                    this.v = 1;
                    if (z1Var2.emit(dVar2, this) == aVar2) {
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
                rz.p pVar = (rz.p) this.f178702w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    boolean zF = Intrinsics.f(pVar, rz.n.f258452a);
                    r rVar = this.f178703x;
                    if (zF) {
                        z1 z1Var3 = rVar.f178727q;
                        uv.b bVar2 = new uv.b(rVar.d(), gv.e.SHUTTER_BUTTON_CLICKED, null);
                        this.f178702w = null;
                        this.v = 1;
                        if (z1Var3.emit(bVar2, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (!Intrinsics.f(pVar, rz.o.f258453a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kv.p pVar2 = rVar.d;
                        this.f178702w = null;
                        this.v = 2;
                        Unit unitStopVideoRecording = pVar2.f189905a.stopVideoRecording();
                        if (unitStopVideoRecording != aVar3) {
                            unitStopVideoRecording = Unit.f186387a;
                        }
                        if (unitStopVideoRecording == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
