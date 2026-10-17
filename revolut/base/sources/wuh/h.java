package wuh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.workflow.engine.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f300151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.workflow.engine.sdk_flow.f f300152b;

    public /* synthetic */ h(com.revolut.feature.workflow.engine.sdk_flow.f fVar, int i) {
        this.f300151a = i;
        this.f300152b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f300151a;
        boolean z = false;
        com.revolut.feature.workflow.engine.sdk_flow.f fVar = this.f300152b;
        switch (i) {
            case 0:
                od9.e result = (od9.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                fVar.v.c(tx8.s.f275362c, result);
                if (result instanceof od9.d) {
                    com.revolut.feature.workflow.engine.sdk_flow.f.R2(fVar, null, null, new m(fVar, null, 4), 3);
                } else if (result instanceof od9.c) {
                    com.revolut.feature.workflow.engine.sdk_flow.f.R2(fVar, null, null, new m(fVar, null, 5), 3);
                } else {
                    if (!Intrinsics.f(result, od9.a.f224330a) && !Intrinsics.f(result, od9.b.f224331a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Unexpected result for Penny topup flow in SdkFlow: " + result);
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 1:
                if (((Integer) obj2).intValue() == 30004) {
                    fVar.u.getClass();
                    yji.l.b1(fVar, fVar.X1(new y0("ID_MYINFO_ACCESS_DENIED_DIALOG", new z(new TextLocalisedClause(R$string.my_info_permission_dialogue_title, null, null, 14), new TextLocalisedClause(R$string.government_verification_permission_error_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new r(fVar, null, 2), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                if (((Integer) obj2).intValue() == 30004) {
                    fVar.u.getClass();
                    yji.l.b1(fVar, fVar.X1(new y0("ID_HYPERVERGE_ACCESS_DENIED_DIALOG", new z(new TextLocalisedClause(R$string.digilocker_verification_permission_error_title, null, null, 14), new TextLocalisedClause(R$string.government_verification_permission_error_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.feature.kyc.api.R$string.common_action_retry, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 4)), null, new r(fVar, null, 1), 3);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                if (((Integer) obj2).intValue() == 30001) {
                    fVar.C2(c.f300148a);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
