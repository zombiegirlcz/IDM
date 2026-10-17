package gxa;

import com.revolut.feature.referrals.impl.network.services.PersonalizedTrackingService;
import gim.i;
import java.time.Instant;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import ne0.j;
import nxa.g0;
import nxa.i0;
import nxa.l0;
import nxa.o0;
import nxa.t0;
import pwa.n;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f147738w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f147739x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f147738w = cVar;
        this.f147739x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f147738w, this.f147739x, continuation, 0);
            default:
                return new b(this.f147738w, this.f147739x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    PersonalizedTrackingService personalizedTrackingService = this.f147738w.f147742c;
                    this.v = 1;
                    if (personalizedTrackingService.acceptInvitation(this.f147739x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    c cVar = this.f147738w;
                    j jVar = cVar.d;
                    String str = this.f147739x;
                    t0 t0Var = (t0) jVar.get(c.a(str));
                    if (t0Var == null) {
                        t0Var = (t0) j6.a.k(t0.class, cVar.f147740a, c.a(str));
                    }
                    if (t0Var == null) {
                        return null;
                    }
                    x4l.c cVar2 = cVar.e;
                    Boolean bool = Boolean.TRUE;
                    String title = t0Var.f220526a;
                    i0 status = t0Var.f220527b;
                    String imageUrl = t0Var.f220528c;
                    String termsUrl = t0Var.d;
                    String riskDisclosureUrl = t0Var.e;
                    g0 g0Var = t0Var.f;
                    Instant instant = t0Var.f220529g;
                    int i3 = t0Var.f220530h;
                    List steps = t0Var.i;
                    n nVar = t0Var.f220531j;
                    o0 o0Var = t0Var.k;
                    l0 l0Var = t0Var.f220532l;
                    l0 l0Var2 = t0Var.f220533m;
                    String str2 = t0Var.o;
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(status, "status");
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    Intrinsics.checkNotNullParameter(termsUrl, "termsUrl");
                    Intrinsics.checkNotNullParameter(riskDisclosureUrl, "riskDisclosureUrl");
                    Intrinsics.checkNotNullParameter(steps, "steps");
                    t0 t0Var2 = new t0(title, status, imageUrl, termsUrl, riskDisclosureUrl, g0Var, instant, i3, steps, nVar, o0Var, l0Var, l0Var2, bool, str2);
                    this.v = 1;
                    if (cVar2.f(str, t0Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
