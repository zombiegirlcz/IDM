package uz7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.insurance_pet.impl.ui.common.model.PolicyDocument;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$CoPaySelection;
import com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$ExcessSelection;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import uyd.z;
import zhm.d0;
import zw7.g0;
import zw7.h0;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f284597b;

    public /* synthetic */ e(p pVar, int i) {
        this.f284596a = i;
        this.f284597b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PolicyDocument.Pdf pdf2;
        int i = this.f284596a;
        pfm.m mVar = pfm.m.f235744a;
        p pVar = this.f284597b;
        switch (i) {
            case 0:
                h0 plan = (h0) obj2;
                Intrinsics.checkNotNullParameter(plan, "plan");
                ArrayList arrayList = plan.f325789g;
                ArrayList<zw7.m> arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (((zw7.m) obj3).f325814a != zw7.n.TERMS_CONDITIONS) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (zw7.m mVar2 : arrayList2) {
                    pVar.getClass();
                    zw7.n nVar = mVar2.f325814a;
                    zw7.o oVar = mVar2.f325815b;
                    int i2 = h.f284600a[nVar.ordinal()];
                    if (i2 == 1) {
                        pdf2 = new PolicyDocument.Pdf(new TextLocalisedClause(R$string.pets_confirm_purchase_documents_product_summary, null, null, 14), pVar.j3(mVar2), oVar == zw7.o.RELATIVE, zw7.n.IPID);
                    } else if (i2 == 2) {
                        pdf2 = new PolicyDocument.Pdf(new TextLocalisedClause(R$string.pets_confirm_purchase_documents_insurance_policy_wording, null, null, 14), pVar.j3(mVar2), oVar == zw7.o.RELATIVE, zw7.n.POLICY_WORDING);
                    } else if (i2 == 3) {
                        pdf2 = new PolicyDocument.Pdf(new TextLocalisedClause(R$string.pets_confirm_purchase_documents_t_and_c, null, null, 14), pVar.j3(mVar2), oVar == zw7.o.RELATIVE, zw7.n.TERMS_CONDITIONS);
                    } else {
                        if (i2 != 4 && i2 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pdf2 = null;
                    }
                    if (pdf2 != null) {
                        arrayList3.add(pdf2);
                    }
                }
                return arrayList3;
            case 1:
                h0 plan2 = (h0) obj2;
                Intrinsics.checkNotNullParameter(plan2, "plan");
                c cVar = pVar.e;
                v vVar = pVar.f284613g;
                r rVar = (r) cVar;
                String quoteId = (String) w.O(rVar.D0());
                if (quoteId == null || (rVar.B0().isInitialized() && rVar.A0().isInitialized())) {
                    te0.e eVarB0 = rVar.B0();
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(plan2, "plan");
                    pfm.t tVarZ0 = w.z0(eVarB0, new PetPlanBuilderContract$ExcessSelection(v.c(plan2).size() > 2 ? 1 : 0));
                    te0.e eVarA0 = rVar.A0();
                    Intrinsics.checkNotNullParameter(plan2, "plan");
                    return efm.b.p(tVarZ0, w.z0(eVarA0, new PetPlanBuilderContract$CoPaySelection(v.b(plan2).size() > 2 ? 1 : 0)));
                }
                te0.e eVarB02 = rVar.B0();
                vVar.getClass();
                Intrinsics.checkNotNullParameter(plan2, "plan");
                Intrinsics.checkNotNullParameter(quoteId, "quoteId");
                kotlin.text.m mVarC = v.c(plan2);
                h1 h1VarA = v.a(plan2, quoteId);
                String str = h1VarA != null ? h1VarA.f325793c : null;
                Intrinsics.checkNotNullParameter(mVarC, "<this>");
                pfm.t tVarZ02 = w.z0(eVarB02, new PetPlanBuilderContract$ExcessSelection(mVarC.indexOf(str)));
                te0.e eVarA02 = rVar.A0();
                Intrinsics.checkNotNullParameter(plan2, "plan");
                Intrinsics.checkNotNullParameter(quoteId, "quoteId");
                List listB = v.b(plan2);
                h1 h1VarA2 = v.a(plan2, quoteId);
                return efm.b.p(tVarZ02, w.z0(eVarA02, new PetPlanBuilderContract$CoPaySelection(d0.g0(h1VarA2 != null ? h1VarA2.d : null, listB))));
            case 2:
                h0 it8 = (h0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                te0.e eVarC0 = ((r) pVar.e).C0();
                g0 value = it8.f325787b;
                Intrinsics.checkNotNullParameter(eVarC0, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                if (eVarC0.isInitialized()) {
                    return mVar;
                }
                efm.b bVarIgnoreElements = eVarC0.b(value).ignoreElements();
                Intrinsics.h(bVarIgnoreElements);
                return bVarIgnoreElements;
            case 3:
                Data plans = (Data) obj2;
                Intrinsics.checkNotNullParameter(plans, "plans");
                return ((r) pVar.e).C0().c(te0.s.f270018a).map(new z(28, new d(plans, 0)));
            case 4:
                Date startDate = (Date) obj2;
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                return nim.a.w(pVar.f284612c.e(startDate, (String) ((r) pVar.e).x0().get(), false), new uyh.t(5));
            case 5:
                String petId = (String) obj2;
                Intrinsics.checkNotNullParameter(petId, "petId");
                return nim.a.w(pVar.f284612c.d(petId), new e(pVar, 7));
            case 6:
                a08.i data = (a08.i) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                fx7.a aVar = pVar.d;
                g0 plan3 = data.f187a;
                String monthlyPrice = data.f188b;
                aVar.getClass();
                Intrinsics.checkNotNullParameter(plan3, "plan");
                Intrinsics.checkNotNullParameter(monthlyPrice, "monthlyPrice");
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                return mVar;
            default:
                zw7.d0 it9 = (zw7.d0) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                c cVar2 = pVar.e;
                ((r) cVar2).y0().set(it9.d);
                r rVar2 = (r) cVar2;
                rVar2.w0().set(it9.e);
                rVar2.z0().set(it9.f325765b);
                return it9;
        }
    }
}
