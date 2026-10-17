package tn7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.ui.screen.delivery.tracking.DocumentDeliveryTrackingScreenContract$InputData;
import jki.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import ll7.e0;
import ll7.v;
import tn7.e;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DocumentDeliveryTrackingScreenContract$InputData f272329p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f272330q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f272331r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p stateMapper, DocumentDeliveryTrackingScreenContract$InputData inputData, v policyRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        this.f272329p = inputData;
        this.f272330q = policyRepository;
        this.f272331r = new d(new Data(null, null, true, 3, null), inputData.f75522b);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    @Override // yji.l
    public final void I1() {
        DocumentDeliveryTrackingScreenContract$InputData documentDeliveryTrackingScreenContract$InputData = this.f272329p;
        String policyId = documentDeliveryTrackingScreenContract$InputData.f75521a;
        kl7.g documentType = documentDeliveryTrackingScreenContract$InputData.f75522b;
        e0 e0Var = (e0) this.f272330q;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        w4l.f fVar = e0Var.f196617n;
        Object obj2 = jl7.i.f175627a;
        Intrinsics.checkNotNullParameter(documentType, "<this>");
        l.a1(this, rd0.e.b(fVar.f(new Pair(policyId, u1.g(documentType, jl7.i.f175627a)), false)), null, null, new t9h.b(this, null, 29), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f272331r;
    }

    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        if (iHashCode == -1586557972) {
            if (listId.equals("DOWNLOAD_AND_PRINT_ID")) {
                v2(e.a.f272323a);
            }
        } else if (iHashCode == 304133450) {
            if (listId.equals("CONTACT_SUPPORT_ID")) {
                v2(e.c.f272325a);
            }
        } else if (iHashCode == 1789465511 && listId.equals("RECEIVED_DISC_ID")) {
            v2(e.b.f272324a);
        }
    }
}
