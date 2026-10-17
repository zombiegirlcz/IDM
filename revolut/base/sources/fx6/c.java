package fx6;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.freelancer.common.models.FreelancerInboundVolume;
import com.revolut.feature.freelancer.impl.ui.inbound_volume.AnnualInboundVolumeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ AnnualInboundVolumeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AnnualInboundVolumeScreen annualInboundVolumeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = annualInboundVolumeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(model);
        i iVar = (i) fVarE3;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.i;
        if (!(obj3 instanceof FreelancerInboundVolume)) {
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj3, "Unsupported parcel: "));
        }
        iVar.H2(iVar.f138755q, new av8.o(obj3, 19));
        return Unit.f186387a;
    }
}
