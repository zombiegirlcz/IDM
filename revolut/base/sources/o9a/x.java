package o9a;

import com.revolut.feature.pix.api.model.PixQrCodeTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mhd.o0;
import skm.p0;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ dj0.d A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a f223175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f223176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f223177y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar, dj0.d dVar, String str, String str2, dj0.d dVar2, boolean z, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f223175w = aVar;
        this.f223176x = dVar;
        this.f223177y = str;
        this.z = str2;
        this.A = dVar2;
        this.B = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f223175w, this.f223176x, this.f223177y, this.z, this.A, this.B, continuation, 0);
            case 1:
                return new x(this.f223175w, this.f223176x, this.f223177y, this.z, this.A, this.B, continuation, 1);
            default:
                return new x(this.f223175w, this.f223176x, this.f223177y, this.z, this.A, this.B, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
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
                ryc.a aVar2 = this.f223175w.f80596q;
                PixQrCodeTransferData pixQrCodeTransferData = new PixQrCodeTransferData(this.f223176x, null, this.f223177y, this.z, this.A, this.B);
                this.v = 1;
                n8a.b0 b0Var = (n8a.b0) aVar2.f258290b;
                b0Var.getClass();
                n3j.w wVar = new n3j.w(new o0(b0Var, pixQrCodeTransferData, null, 23), b0Var, (Continuation) null);
                p0 p0Var = p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, wVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar4 = this.f223175w;
                x xVar = new x(aVar4, this.f223176x, this.f223177y, this.z, this.A, this.B, null, 0);
                this.v = 1;
                Object objT = do3.q.t(aVar4, xVar, this);
                return objT == aVar3 ? aVar3 : objT;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.pix.impl.flow.authorisation_request.screens.request.a aVar6 = this.f223175w;
                x xVar2 = new x(aVar6, this.f223176x, this.f223177y, this.z, this.A, this.B, null, 1);
                this.v = 1;
                Object objB0 = u0.b0(aVar6.X(), "CONFIRM_BUTTON_TAG", xVar2, this);
                return objB0 == aVar5 ? aVar5 : objB0;
        }
    }
}
