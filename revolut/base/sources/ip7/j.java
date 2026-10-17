package ip7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.OptionValue;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options.PlanOptionsScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ll7.u;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PlanOptionsScreenContract$InputData f167673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f167674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f167675r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p stateMapper, PlanOptionsScreenContract$InputData inputData, u planRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        this.f167673p = inputData;
        this.f167674q = planRepository;
        this.f167675r = new f(inputData.f75599b, new Data(null, null, true, 3, null), h0.f322473a, inputData.e);
    }

    @Override // yji.l
    public final void I1() {
        String applicationFormId = this.f167673p.f75598a;
        u uVar = this.f167674q;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, uVar.d.b(applicationFormId, loadingStrategy), null, null, new ibg.g(this, null, 24), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f167675r;
    }

    public final void y2(Object obj2) {
        if (!(obj2 instanceof OptionValue)) {
            throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.l(obj2, "unexpected item in simpleOptionClicked: "));
        }
        x2(new ib6.j(obj2, 1));
    }
}
