package p48;

import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.full_screen_prompt.c;
import com.revolut.feature.joint.api.data.JointAccountCloseReason;
import com.revolut.feature.joint.impl.ui.close_flow.JointCloseFlowContract$Step;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.joint.impl.ui.close_flow.a f232842b;

    public /* synthetic */ c(com.revolut.feature.joint.impl.ui.close_flow.a aVar, int i) {
        this.f232841a = i;
        this.f232842b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f232841a;
        com.revolut.feature.joint.impl.ui.close_flow.a aVar = this.f232842b;
        Continuation continuation = null;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                aVar.X().d(new y0(null, new z(new TextLocalisedClause(R.string.common_error_something_went_wrong, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "JointCloseFlowModel", null, throwable, h0Var);
                return Boolean.TRUE;
            case 1:
                o48.d outputData = (o48.d) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof o48.b;
                com.revolut.feature.joint.impl.ui.close_flow.a aVar2 = this.f232842b;
                if (z) {
                    JointAccountCloseReason jointAccountCloseReason = aVar2.o.f76513b;
                    if (jointAccountCloseReason instanceof JointAccountCloseReason.UserIntention) {
                        l.j2(aVar2, aVar2.e1(new n90.a(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "c42ddf97-b247-4162-b511-edff9f1e9a06", null, null, 6))), null, new c(aVar2, 4), 1);
                    } else {
                        if (!(jointAccountCloseReason instanceof JointAccountCloseReason.ForceOffBoarding)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        oki.h.t2(aVar2, aVar2.f76520s, JointCloseFlowContract$Step.Statement.f76516a, true, null, false, 12);
                    }
                } else {
                    if (!(outputData instanceof o48.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar2.f76520s);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.feature.full_screen_prompt.c result = (com.revolut.feature.full_screen_prompt.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof c.C0497c) {
                    aVar.l2(new g(aVar, null), new yi5.b(26));
                }
                return Unit.f186387a;
            case 3:
                q48.g output = (q48.g) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof q48.e) {
                    aVar.l2(new omg.e(aVar, continuation, 21), aVar.f76521t);
                } else {
                    if (!(output instanceof q48.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(aVar.f76520s);
                }
                return Unit.f186387a;
            default:
                m90.b result2 = (m90.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (!(result2 instanceof m90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.joint.impl.ui.close_flow.a aVar3 = this.f232842b;
                oki.h.t2(aVar3, aVar3.f76520s, JointCloseFlowContract$Step.Statement.f76516a, true, null, false, 12);
                return Unit.f186387a;
        }
    }
}
