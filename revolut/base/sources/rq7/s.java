package rq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.CancellationDetails;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.revolut.feature.insurance_car.impl.data.model.RenewalDetails;
import com.revolut.feature.insurance_car.impl.data.model.TodoItem;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.summary.PolicySummaryScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import rq7.k;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends jki.g implements p {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PolicySummaryScreenContract$InputData f256500p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ll7.v f256501q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr7.a f256502r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f256503s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vn7.a f256504t;
    public final j u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jki.p stateMapper, PolicySummaryScreenContract$InputData inputData, ll7.v policyRepository, tr7.a copyToClipboardHelper, j60.a bottomDialogExtension, vn7.a hintPopupFactory) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        this.f256500p = inputData;
        this.f256501q = policyRepository;
        this.f256502r = copyToClipboardHelper;
        this.f256503s = bottomDialogExtension;
        this.f256504t = hintPopupFactory;
        this.u = new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        ll7.v vVar = this.f256501q;
        yji.l.a1(this, ll7.v.d(vVar), null, null, new r(this, null, 0), 3);
        PolicySummaryScreenContract$InputData policySummaryScreenContract$InputData = this.f256500p;
        String policyId = policySummaryScreenContract$InputData.f75672a;
        e0 e0Var = (e0) vVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.f196616m.f(policyId, true)), null, null, new r(this, null, 1), 3);
        String policyId2 = policySummaryScreenContract$InputData.f75672a;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId2, "policyId");
        yji.l.a1(this, rd0.e.b(e0Var.k.f(policyId2, false)), null, null, new r(this, null, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(Object obj2, String listId) {
        Policy policy;
        CancellationDetails cancellationDetails;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        k.b bVar = k.b.f256486a;
        vn7.a aVar = this.f256504t;
        j60.a aVar2 = this.f256503s;
        switch (iHashCode) {
            case -1814683163:
                if (listId.equals("TOP_UP")) {
                    Policy policy2 = obj2 instanceof Policy ? (Policy) obj2 : null;
                    if (policy2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    v2(new m(policy2));
                }
                break;
            case -1367868369:
                if (listId.equals("PRIMARY_BUTTON")) {
                    j60.a.v(aVar2, false, null, 3);
                }
                break;
            case -601368842:
                if (listId.equals("POLICY_NUMBER")) {
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        tr7.a.b(this.f256502r, str, null, 6);
                    }
                }
                break;
            case 13932066:
                if (listId.equals("POLICY_RENEWAL_DATE")) {
                    aVar2.x(xl7.p.a(aVar, R$string.car_insurance_policy_summary_sections_policy_end_date));
                }
                break;
            case 21468856:
                if (listId.equals("POLICY_START_DATE")) {
                    aVar2.x(xl7.p.a(aVar, R$string.car_insurance_policy_summary_sections_policy_start_date));
                }
                break;
            case 370099582:
                if (listId.equals("VIEW_DOCUMENTS")) {
                    v2(bVar);
                }
                break;
            case 915362880:
                if (listId.equals("VIEW_CANCELLATION_DETAILS") && (policy = (Policy) ((j) t2()).f256482a.getContent()) != null && (cancellationDetails = policy.f75291j) != null) {
                    v2(new n(policy.f75288c, cancellationDetails));
                }
                break;
            case 1239599166:
                if (listId.equals("POLICY_NUMBER_IN_PROGRESS")) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    aVar2.x(vn7.a.d(aVar, R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_title, R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_description, null, Integer.valueOf(R$string.car_insurance_common_understood), null, 116));
                }
                break;
            case 1619486959:
                if (listId.equals("VIEW_POLICY_DETAILS")) {
                    v2(k.e.f256489a);
                }
                break;
            case 1660197196:
                if (listId.equals("MANAGE_POLICY")) {
                    v2(k.c.f256487a);
                }
                break;
            case 1711629901:
                if (listId.equals("POLICY_DOCUMENTATION")) {
                    j60.a.v(aVar2, false, null, 3);
                    v2(bVar);
                }
                break;
            case 1873079236:
                if (listId.equals("SMART_DRIVING_SCORE")) {
                    v2(k.d.f256488a);
                }
                break;
            case 1990349751:
                if (listId.equals("CLAIMS")) {
                    v2(k.a.f256485a);
                }
                break;
        }
        if (obj2 instanceof TodoItem) {
            v2(new o((TodoItem) obj2));
        } else if (obj2 instanceof RenewalDetails) {
            v2(new l(((RenewalDetails) obj2).f75299a));
        }
    }
}
