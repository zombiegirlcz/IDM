package lq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.data.model.MtaAvailabilityContainer;
import com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.manage.ManagePolicyScreenContract$InputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ManagePolicyScreenContract$InputData f199202p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f199203q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tl7.f f199204r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f199205s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p stateMapper, ManagePolicyScreenContract$InputData inputData, v policyRepository, tl7.f bottomDialog) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.f199202p = inputData;
        this.f199203q = policyRepository;
        this.f199204r = bottomDialog;
        this.f199205s = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        v vVar = this.f199203q;
        yji.l.a1(this, v.d(vVar), null, null, new k(this, null, 0), 3);
        ManagePolicyScreenContract$InputData managePolicyScreenContract$InputData = this.f199202p;
        String policyId = managePolicyScreenContract$InputData.f75660a;
        e0 e0Var = (e0) vVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, e0Var.i.c(policyId, true), null, null, new k(this, null, 1), 3);
        String policyId2 = managePolicyScreenContract$InputData.f75660a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId2, "policyId");
        yji.l.a1(this, e0Var.f196614j.c(policyId2, true), null, null, new k(this, null, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f199205s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0088, code lost:
    
        if (r10.equals("DETAILS_ADD_DRIVER_ITEM") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008b, code lost:
    
        z2(com.revolut.feature.insurance_car.impl.data.model.MtaFlowVariant.AddDriver.f75251a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r10.equals("DETAILS_DRIVERS_SUBHEADER") == false) goto L40;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y2(java.lang.Object r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lq7.l.y2(java.lang.Object, java.lang.String):void");
    }

    public final void z2(MtaFlowVariant mtaFlowVariant) {
        MtaAvailabilityContainer mtaAvailabilityContainer = (MtaAvailabilityContainer) ((f) t2()).f199196c.getContent();
        if (mtaAvailabilityContainer == null) {
            throw new IllegalStateException("mtaAvailability must be present");
        }
        v2(new h(mtaFlowVariant, mtaAvailabilityContainer));
    }
}
