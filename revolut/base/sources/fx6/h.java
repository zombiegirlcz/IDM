package fx6;

import au6.k2;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.feature.freelancer.impl.network.models.t;
import com.revolut.feature.freelancer.impl.network.services.FreelancerService;
import et6.h1;
import ft6.k;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.r;
import te0.w;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f138753w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f138753w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f138753w, continuation, 0);
            default:
                return new h(this.f138753w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        i iVar = this.f138753w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    h1 h1Var = iVar.o;
                    FreelancerInboundVolume inboundVolume = ((e) ((j2) iVar.f138755q.f22677a).getValue()).f138749b;
                    if (inboundVolume == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    h1Var.getClass();
                    Intrinsics.checkNotNullParameter(inboundVolume, "inboundVolume");
                    k2 k2Var = (k2) h1Var.f129237b;
                    k2Var.getClass();
                    Intrinsics.checkNotNullParameter(inboundVolume, "inboundVolume");
                    FreelancerService freelancerService = k2Var.f9553a;
                    Map map = k.f137948a;
                    Intrinsics.checkNotNullParameter(inboundVolume, "<this>");
                    r rVarG0 = w.g0(freelancerService.setAnnualInboundVolume(new t(inboundVolume.f73288c, inboundVolume.f73286a, inboundVolume.f73287b)));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    h hVar = new h(iVar, null, 0);
                    this.v = 1;
                    if (iVar.p2(this, hVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                iVar.B2();
                return Unit.f186387a;
        }
    }
}
