package nz6;

import au6.r1;
import com.revolut.feature.freelancer.impl.network.services.FreelancerOnboardingService;
import com.revolut.feature.freelancer.impl.ui.onboarding.flow.FreelancerOnboardingFlowContract$DomainState;
import et6.y1;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import pfm.r;
import te0.w;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b f220962w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f220962w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f220962w, continuation, 0);
            case 1:
                return new h(this.f220962w, continuation, 1);
            case 2:
                return new h(this.f220962w, continuation, 2);
            default:
                return new h(this.f220962w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar = this.f220962w;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = new g(bVar, objArr == true ? 1 : 0, 0);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "finishFreelancerOnboarding", gVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar2 = new g(bVar, objArr2 == true ? 1 : 0, i2);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar.k, "finishFreelancerOnboarding", gVar2, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    g gVar3 = new g(bVar, objArr3 == true ? 1 : 0, 2);
                    this.v = 1;
                    if (bVar.p2(this, gVar3) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                qki.d dVar = bVar.C;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    o.b(obj2);
                    y1 y1Var = bVar.f73994q;
                    String str = ((FreelancerOnboardingFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f73976b;
                    if (d0.W(str)) {
                        str = null;
                    }
                    String str2 = ((FreelancerOnboardingFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).f73977c;
                    if (d0.W(str2)) {
                        str2 = null;
                    }
                    String str3 = ((FreelancerOnboardingFlowContract$DomainState) ((j2) dVar.f22677a).getValue()).d;
                    String str4 = d0.W(str3) ? null : str3;
                    vr6.a progress = new vr6.a(str, str2, str4);
                    y1Var.getClass();
                    Intrinsics.checkNotNullParameter(progress, "progress");
                    r1 r1Var = y1Var.f129383a;
                    r1Var.getClass();
                    Intrinsics.checkNotNullParameter(progress, "progress");
                    FreelancerOnboardingService freelancerOnboardingService = r1Var.f9607a;
                    Map map = ft6.k.f137948a;
                    Intrinsics.checkNotNullParameter(progress, "<this>");
                    r rVarG0 = w.g0(freelancerOnboardingService.saveOnboardingProgress(new st6.b(str, str2, str4)));
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
