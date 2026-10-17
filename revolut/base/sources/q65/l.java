package q65;

import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.data.model.Data;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.revolutpay.impl.domain.models.payment_schedule.PaymentScheduleSelection;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.cancellation_policy.TravelHotelsCancellationPolicyScreenContract$Mode;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q9c.r;
import q9c.s;
import qdk.x;
import qll.q;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Data f242502b;

    public /* synthetic */ l(Data data, int i) {
        this.f242501a = i;
        this.f242502b = data;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Map mapG;
        List list;
        BigDecimal scale;
        Object next;
        Data data;
        eel.e eVar;
        List list2;
        eel.l lVar;
        ej0.b bVar;
        BigDecimal bigDecimal;
        switch (this.f242501a) {
            case 0:
                g gVar = (g) obj2;
                int i = gVar.f242493a;
                wi0.b countryCode = gVar.f242495c;
                Data newRepaymentSchedule = this.f242502b;
                Intrinsics.checkNotNullParameter(newRepaymentSchedule, "newRepaymentSchedule");
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                return new g(i, newRepaymentSchedule, countryCode);
            case 1:
                q6h.a aVar = (q6h.a) obj2;
                lk0.g gVar2 = aVar.f242595a;
                aVar.getClass();
                return new q6h.a(gVar2, this.f242502b);
            case 2:
                return q75.f.a((q75.f) obj2, null, this.f242502b, null, 5);
            case 3:
                return q7b.f.a((q7b.f) obj2, this.f242502b, null, 2);
            case 4:
                return q7b.f.a((q7b.f) obj2, null, this.f242502b, 1);
            case 5:
                o63.e variant = ((q83.b) obj2).f242966a;
                Intrinsics.checkNotNullParameter(variant, "variant");
                Data user = this.f242502b;
                Intrinsics.checkNotNullParameter(user, "user");
                return new q83.b(variant, user);
            case 6:
                Data loanPaymentSource = this.f242502b;
                Intrinsics.h(loanPaymentSource);
                ((q85.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(loanPaymentSource, "loanPaymentSource");
                return new q85.c(loanPaymentSource);
            case 7:
                return q87.j.a((q87.j) obj2, null, null, null, this.f242502b, null, null, null, null, null, 503);
            case 8:
                return q87.j.a((q87.j) obj2, null, null, null, null, null, null, null, null, this.f242502b, 255);
            case 9:
                q87.j jVar = (q87.j) obj2;
                eel.c cVar = jVar.f;
                Data data2 = this.f242502b;
                if (cVar == null || (list = (List) data2.getContent()) == null) {
                    mapG = r0.g();
                } else {
                    List<t87.h> list3 = list;
                    int iB = q0.b(w.t(list3, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    mapG = new LinkedHashMap(iB);
                    for (t87.h hVar : list3) {
                        Iterator it8 = hVar.f268850b.iterator();
                        while (true) {
                            scale = null;
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (((t87.g) next).f268846a == cVar) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        t87.g gVar3 = (t87.g) next;
                        if (gVar3 != null && (data = gVar3.f268848c) != null && (eVar = (eel.e) data.getContent()) != null && (list2 = eVar.f125227a) != null && (lVar = (eel.l) d0.o0(list2)) != null && (bVar = ((eel.f) lVar.f125239c).f125230a) != null && (bigDecimal = bVar.f126703a) != null) {
                            scale = bigDecimal.setScale(2, RoundingMode.HALF_EVEN);
                        }
                        mapG.put(hVar.f268849a, scale);
                    }
                }
                return q87.j.a(jVar, null, null, null, null, data2, null, mapG, null, null, 431);
            case 10:
                return q87.j.a((q87.j) obj2, null, null, this.f242502b, null, null, null, null, null, null, 507);
            case 11:
                ((q8d.c) obj2).getClass();
                Data actions = this.f242502b;
                Intrinsics.checkNotNullParameter(actions, "actions");
                return new q8d.c(actions);
            case 12:
                ((q92.a) obj2).getClass();
                Data enrollments = this.f242502b;
                Intrinsics.checkNotNullParameter(enrollments, "enrollments");
                return new q92.a(enrollments);
            case 13:
                s update = (s) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                r rVar = (r) this.f242502b.getContent();
                return s.a(update, null, null, (rVar != null ? rVar.f243876c : null) instanceof PaymentScheduleSelection.PayLater, null, 11);
            case 14:
                ((qaj.d) obj2).getClass();
                Data newlyAddedCrypto = this.f242502b;
                Intrinsics.checkNotNullParameter(newlyAddedCrypto, "newlyAddedCrypto");
                return new qaj.d(newlyAddedCrypto);
            case 15:
                TravelHotelsCancellationPolicyScreenContract$Mode mode = ((qbg.e) obj2).f244270b;
                Data policyData = this.f242502b;
                Intrinsics.checkNotNullParameter(policyData, "policyData");
                Intrinsics.checkNotNullParameter(mode, "mode");
                return new qbg.e(policyData, mode);
            case 16:
                return qc2.b.a((qc2.b) obj2, this.f242502b, false, 2);
            case 17:
                return qcc.e.a((qcc.e) obj2, this.f242502b, null, null, false, 14);
            case 18:
                x xVar = (x) obj2;
                boolean z = xVar.f244993c;
                Data data3 = this.f242502b;
                boolean z3 = z && data3.getContent() != null && !data3.getLoading() && data3.getError() == null;
                return x.a(xVar, null, data3, xVar.f244993c && !z3, z3 ? new AnimationRequest(false) : null, 1);
            case 19:
                Data profileType = this.f242502b;
                Intrinsics.h(profileType);
                ((qe5.c) obj2).getClass();
                Intrinsics.checkNotNullParameter(profileType, "profileType");
                return new qe5.c(profileType);
            case 20:
                ((qeb.f) obj2).getClass();
                Data details = this.f242502b;
                Intrinsics.checkNotNullParameter(details, "details");
                return new qeb.f(details);
            case 21:
                qg1.l lVar2 = (qg1.l) obj2;
                Data designConfig = this.f242502b;
                Intrinsics.h(designConfig);
                SharedRevolutCardWrapper cardWrapper = lVar2.f245633a;
                boolean z4 = lVar2.f245634b;
                o5l.g screenDensity = lVar2.d;
                Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
                Intrinsics.checkNotNullParameter(designConfig, "designConfig");
                Intrinsics.checkNotNullParameter(screenDensity, "screenDensity");
                return new qg1.l(cardWrapper, z4, designConfig, screenDensity);
            case 22:
                ((qg7.e) obj2).getClass();
                Data lotteryDrawDetails = this.f242502b;
                Intrinsics.checkNotNullParameter(lotteryDrawDetails, "lotteryDrawDetails");
                return new qg7.e(lotteryDrawDetails);
            case 23:
                return qjk.c.c((qjk.c) obj2, this.f242502b, null, 2);
            case 24:
                ql6.m update2 = (ql6.m) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return ql6.m.a(update2, this.f242502b, null, 11);
            case 25:
                ql6.m update3 = (ql6.m) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return ql6.m.a(update3, null, this.f242502b, 7);
            case 26:
                return q.a((q) obj2, null, null, null, this.f242502b, 15);
            case 27:
                ((qmg.a) obj2).getClass();
                Data checklistItem = this.f242502b;
                Intrinsics.checkNotNullParameter(checklistItem, "checklistItem");
                return new qmg.a(checklistItem);
            case 28:
                return qn9.f.a((qn9.f) obj2, null, 0L, null, null, this.f242502b, 15);
            default:
                return qna.f.a((qna.f) obj2, (Boolean) this.f242502b.getContent(), null, null, null, null, null, false, 126);
        }
    }

    public /* synthetic */ l(Data data, com.revolut.feature.global_markets.impl.ui.redesign.screen.market.a aVar) {
        this.f242501a = 9;
        this.f242502b = data;
    }
}
