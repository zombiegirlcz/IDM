package sbb;

import com.revolut.feature.retail.main_screen.container.models.action_payload.ApmDeeplinkPayload;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ gim.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f261541w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ParcelableDestination f261542x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ApmDeeplinkPayload.Apm f261543y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(ApmDeeplinkPayload.Apm apm, ParcelableDestination parcelableDestination, Continuation continuation, Function1 function1, k kVar) {
        super(1, continuation);
        this.v = (gim.i) function1;
        this.f261541w = kVar;
        this.f261542x = parcelableDestination;
        this.f261543y = apm;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f261543y, this.f261542x, continuation, this.v, this.f261541w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            this.u = 1;
            obj2 = this.v.invoke(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        k kVar = this.f261541w;
        if (zBooleanValue) {
            return kVar.A2(this.f261542x);
        }
        ApmDeeplinkPayload.Apm apm = this.f261543y;
        IllegalStateException illegalStateException = new IllegalStateException(p.a.p("Deeplink requires ", apm.getF82736a(), " to be enabled"));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        kVar.c3(apm);
        return Unit.f186387a;
    }
}
