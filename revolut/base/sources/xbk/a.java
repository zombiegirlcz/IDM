package xbk;

import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import com.revolut.retail.feature.plan_gifting.api.model.PlanGiftingHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vbk.e;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {
    public static final PlanGiftingHyperText a(e eVar) {
        ArrayList arrayList;
        PlanGiftingHyperText.HyperTextAction seeAllDocuments;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        List documents = eVar.getDocuments();
        if (documents != null) {
            List<e.d> list = documents;
            arrayList = new ArrayList(w.t(list, 10));
            for (e.d dVar : list) {
                arrayList.add(new PricingPlanDocument(dVar.getText(), dVar.getUrl()));
            }
        } else {
            arrayList = null;
        }
        String text = eVar.getText();
        List<e.c> descriptors = eVar.getDescriptors();
        ArrayList arrayList2 = new ArrayList();
        for (e.c cVar : descriptors) {
            if (cVar.getUrl() != null) {
                seeAllDocuments = new PlanGiftingHyperText.HyperTextAction.UrlAction(cVar.getUrl());
            } else if (Intrinsics.f(cVar.getAction(), "SEE_ALL_BENEFITS")) {
                seeAllDocuments = PlanGiftingHyperText.HyperTextAction.BenefitsFullList.f102438a;
            } else if (Intrinsics.f(cVar.getAction(), "SEE_ALL_DOCUMENTS")) {
                seeAllDocuments = new PlanGiftingHyperText.HyperTextAction.SeeAllDocuments(arrayList == null ? f0.f322471a : arrayList);
            } else {
                seeAllDocuments = null;
            }
            PlanGiftingHyperText.HyperTextDescriptor hyperTextDescriptor = seeAllDocuments == null ? null : new PlanGiftingHyperText.HyperTextDescriptor(cVar.getText(), seeAllDocuments);
            if (hyperTextDescriptor != null) {
                arrayList2.add(hyperTextDescriptor);
            }
        }
        return new PlanGiftingHyperText(arrayList2, arrayList, text);
    }

    public static final e b(PlanGiftingHyperText planGiftingHyperText) {
        String str;
        Intrinsics.checkNotNullParameter(planGiftingHyperText, "<this>");
        String str2 = planGiftingHyperText.f102435a;
        ArrayList arrayList = planGiftingHyperText.f102436b;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (true) {
            ArrayList arrayList3 = null;
            String str3 = null;
            if (!it8.hasNext()) {
                List list = planGiftingHyperText.f102437c;
                if (list != null) {
                    List<PricingPlanDocument> list2 = list;
                    arrayList3 = new ArrayList(w.t(list2, 10));
                    for (PricingPlanDocument pricingPlanDocument : list2) {
                        arrayList3.add(new e.d(pricingPlanDocument.f81186a, pricingPlanDocument.f81187b));
                    }
                }
                return new e(arrayList2, arrayList3, str2);
            }
            PlanGiftingHyperText.HyperTextDescriptor hyperTextDescriptor = (PlanGiftingHyperText.HyperTextDescriptor) it8.next();
            String str4 = hyperTextDescriptor.f102441a;
            PlanGiftingHyperText.HyperTextAction hyperTextAction = hyperTextDescriptor.f102442b;
            boolean z = hyperTextAction instanceof PlanGiftingHyperText.HyperTextAction.UrlAction;
            if (z) {
                str = ((PlanGiftingHyperText.HyperTextAction.UrlAction) hyperTextAction).f102440a;
            } else {
                if (!(hyperTextAction instanceof PlanGiftingHyperText.HyperTextAction.BenefitsFullList) && !(hyperTextAction instanceof PlanGiftingHyperText.HyperTextAction.SeeAllDocuments)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            if (hyperTextAction instanceof PlanGiftingHyperText.HyperTextAction.BenefitsFullList) {
                str3 = "SEE_ALL_BENEFITS";
            } else if (hyperTextAction instanceof PlanGiftingHyperText.HyperTextAction.SeeAllDocuments) {
                str3 = "SEE_ALL_DOCUMENTS";
            } else if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(new e.c(str4, str, str3));
        }
    }
}
