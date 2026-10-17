package hq7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.policy.details.PolicyDetailsScreenContract$InputData;
import hq7.g;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ll7.e0;
import ll7.v;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends jki.g implements h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final PolicyDetailsScreenContract$InputData f154618p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final v f154619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr7.a f154620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f154621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vn7.a f154622t;
    public final ang.f u;
    public final n8b.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f154623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p stateMapper, PolicyDetailsScreenContract$InputData inputData, v policyRepository, tr7.a copyToClipboardHelper, j60.a bottomDialogExtension, vn7.a hintPopupFactory, ang.f userInteractor, n8b.a countryInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(policyRepository, "policyRepository");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f154618p = inputData;
        this.f154619q = policyRepository;
        this.f154620r = copyToClipboardHelper;
        this.f154621s = bottomDialogExtension;
        this.f154622t = hintPopupFactory;
        this.u = userInteractor;
        this.v = countryInteractor;
        this.f154623w = new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        PolicyDetailsScreenContract$InputData policyDetailsScreenContract$InputData = this.f154618p;
        String policyId = policyDetailsScreenContract$InputData.f75657a;
        v vVar = this.f154619q;
        e0 e0Var = (e0) vVar;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(policyId, "policyId");
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(e0Var.f196612g.f(policyId, false)), null, null, new j(this, continuation, 0), 3);
        yji.l.a1(this, v.a(vVar, policyDetailsScreenContract$InputData.f75657a), null, null, new j(this, continuation, 1), 3);
        yji.l.a1(this, rd0.e.b(this.u.k(false)), null, null, new j(this, continuation, 2), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f154623w;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        vn7.a aVar = this.f154622t;
        j60.a aVar2 = this.f154621s;
        switch (iHashCode) {
            case -1367868369:
                if (listId.equals("PRIMARY_BUTTON")) {
                    j60.a.v(aVar2, false, null, 3);
                    break;
                }
                break;
            case -601368842:
                if (listId.equals("POLICY_NUMBER")) {
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str != null) {
                        tr7.a.b(this.f154620r, str, null, 6);
                    }
                    break;
                }
                break;
            case 13932066:
                if (listId.equals("POLICY_RENEWAL_DATE")) {
                    aVar2.x(xl7.p.a(aVar, R$string.car_insurance_policy_summary_sections_policy_end_date));
                    break;
                }
                break;
            case 21468856:
                if (listId.equals("POLICY_START_DATE")) {
                    aVar2.x(xl7.p.a(aVar, R$string.car_insurance_policy_summary_sections_policy_start_date));
                    break;
                }
                break;
            case 1239599166:
                if (listId.equals("POLICY_NUMBER_IN_PROGRESS")) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    aVar2.x(vn7.a.d(aVar, R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_title, R$string.car_insurance_policy_summary_sections_policy_policy_number_in_progress_description, null, Integer.valueOf(R$string.car_insurance_common_understood), null, 116));
                    break;
                }
                break;
            case 1711629901:
                if (listId.equals("POLICY_DOCUMENTATION")) {
                    j60.a.v(aVar2, false, null, 3);
                    v2(g.a.f154612a);
                    break;
                }
                break;
        }
    }
}
