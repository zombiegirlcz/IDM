package qp7;

import com.revolut.data.model.Data;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.reservation.ReservationScreenContract$InputData;
import com.revolut.feature.insurance_common.data.model.Document;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kl7.d2;
import kotlin.jvm.internal.Intrinsics;
import ll7.u;
import zhm.a0;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends jki.g implements jki.h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReservationScreenContract$InputData f248314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f248315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vn7.a f248316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f248317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f248318t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, ReservationScreenContract$InputData inputData, j60.a bottomExpandableDialogExtension, vn7.a hintPopupFactory, u planRepository) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogExtension, "bottomExpandableDialogExtension");
        Intrinsics.checkNotNullParameter(hintPopupFactory, "hintPopupFactory");
        Intrinsics.checkNotNullParameter(planRepository, "planRepository");
        this.f248314p = inputData;
        this.f248315q = bottomExpandableDialogExtension;
        this.f248316r = hintPopupFactory;
        this.f248317s = planRepository;
        this.f248318t = new i(new Data(null, null, true, 3, null), h0.f322473a);
    }

    public final void A2(String str) {
        Set setH1 = d0.h1(((i) t2()).f248305b);
        if (setH1.contains(str)) {
            setH1.remove(str);
        } else {
            setH1.add(str);
        }
        x2(new imk.e(28, setH1));
    }

    @Override // yji.l
    public final void I1() {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f248318t;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void y2(String id10) {
        d2 d2Var;
        d2 d2Var2;
        Object next;
        d2 d2Var3;
        d2 d2Var4;
        Intrinsics.checkNotNullParameter(id10, "id");
        switch (id10.hashCode()) {
            case -1727995644:
                if (id10.equals("DATE_ITEM")) {
                    this.f248315q.x(vn7.a.d(this.f248316r, R$string.car_insurance_policy_review_sections_details_cells_start_date_learn_more_title, R$string.car_insurance_policy_review_sections_details_cells_start_date_learn_more_text, null, Integer.valueOf(R$string.car_insurance_common_understood), null, 116));
                    break;
                }
                break;
            case -1310768060:
                if (id10.equals("TOTAl_PRICE_ITEM") && (d2Var = (d2) ((i) t2()).f248304a.getContent()) != null) {
                    v2(new n(d2Var.e));
                }
                break;
            case -893549006:
                if (id10.equals("LEGAL_CHECK_ITEM_ALL")) {
                    A2("CONDITION_GENERAL");
                    break;
                }
                break;
            case 125297694:
                if (id10.equals("LEGAL_CHECK_ITEM_MONTHLY")) {
                    A2("CONDITION_MONTHLY_PAYMENT");
                    break;
                }
                break;
            case 292621972:
                if (id10.equals("FOOTER_LINK_ITEM") && (d2Var2 = (d2) ((i) t2()).f248304a.getContent()) != null) {
                    ArrayList arrayList = d2Var2.f185307g;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        a0.x(((DocumentsGroup) it8.next()).f75717b, arrayList2);
                    }
                    Iterator it9 = arrayList2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((Document) next).f75715c, "STATEMENT_OF_FACT")) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    Document document = (Document) next;
                    if (document != null) {
                        v2(new j(document));
                    }
                }
                break;
            case 309509658:
                if (id10.equals("LEGAL_CHECK_ITEM_SMART")) {
                    A2("CONDITION_SMART_DRIVING");
                    break;
                }
                break;
            case 309700698:
                if (id10.equals("DOCUMENTS_ITEM") && (d2Var3 = (d2) ((i) t2()).f248304a.getContent()) != null) {
                    v2(new m(d2Var3.f185307g));
                }
                break;
            case 1316940398:
                if (id10.equals("PLAN_INFO_ITEM") && (d2Var4 = (d2) ((i) t2()).f248304a.getContent()) != null) {
                    v2(new l(d2Var4.f.d));
                }
                break;
        }
    }

    public final void z2() {
        String reservationId = this.f248314p.f75628a;
        u uVar = this.f248317s;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(reservationId, "reservationId");
        yji.l.a1(this, rd0.e.b(uVar.e.f(reservationId, false)), null, null, new g(this, null, 1), 3);
    }
}
