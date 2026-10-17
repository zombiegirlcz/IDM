package mjk;

import android.os.Parcelable;
import bjk.e2;
import com.revolut.feature.pricingplans.models.PricingPlanDescriptorAction;
import com.revolut.feature.pricingplans.models.documents.PricingPlanDocument;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final PlanPageLayoutTerms a(e2 e2Var) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        String text = e2Var.getText();
        List<e2.a> descriptors = e2Var.getDescriptors();
        ArrayList arrayList2 = null;
        if (descriptors != null) {
            arrayList = new ArrayList();
            for (e2.a aVar : descriptors) {
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                String action = aVar.getAction();
                PricingPlanDescriptorAction.INSTANCE.getClass();
                PricingPlanDescriptorAction pricingPlanDescriptorAction = PricingPlanDescriptorAction.f81116b;
                PricingPlanDescriptorAction pricingPlanDescriptorAction2 = Intrinsics.f(action, pricingPlanDescriptorAction.f81117a) ? pricingPlanDescriptorAction : null;
                Parcelable actionDescriptor = Intrinsics.f(pricingPlanDescriptorAction2 != null ? pricingPlanDescriptorAction2.f81117a : null, pricingPlanDescriptorAction.f81117a) ? new PlanPageLayoutTerms.Descriptor.ActionDescriptor(aVar.getText(), pricingPlanDescriptorAction) : aVar.getUrl() != null ? new PlanPageLayoutTerms.Descriptor.UrlDescriptor(aVar.getText(), aVar.getUrl()) : null;
                if (actionDescriptor != null) {
                    arrayList.add(actionDescriptor);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = f0.f322471a;
        }
        List documents = e2Var.getDocuments();
        if (documents != null) {
            List<e2.b> list = documents;
            arrayList2 = new ArrayList(zhm.w.t(list, 10));
            for (e2.b bVar : list) {
                Intrinsics.checkNotNullParameter(bVar, "<this>");
                arrayList2.add(new PricingPlanDocument(bVar.getText(), bVar.getUrl()));
            }
        }
        return new PlanPageLayoutTerms(text, arrayList2, arrayList);
    }

    public static final e2 b(PlanPageLayoutTerms planPageLayoutTerms) {
        e2.a aVar;
        Intrinsics.checkNotNullParameter(planPageLayoutTerms, "<this>");
        String str = planPageLayoutTerms.f102710a;
        List list = planPageLayoutTerms.f102711b;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            ArrayList arrayList2 = null;
            if (!it8.hasNext()) {
                List list2 = planPageLayoutTerms.f102712c;
                if (list2 != null) {
                    List<PricingPlanDocument> list3 = list2;
                    arrayList2 = new ArrayList(zhm.w.t(list3, 10));
                    for (PricingPlanDocument pricingPlanDocument : list3) {
                        Intrinsics.checkNotNullParameter(pricingPlanDocument, "<this>");
                        arrayList2.add(new e2.b(pricingPlanDocument.f81186a, pricingPlanDocument.f81187b));
                    }
                }
                return new e2(arrayList, arrayList2, str);
            }
            PlanPageLayoutTerms.Descriptor descriptor = (PlanPageLayoutTerms.Descriptor) it8.next();
            Intrinsics.checkNotNullParameter(descriptor, "<this>");
            if (descriptor instanceof PlanPageLayoutTerms.Descriptor.UrlDescriptor) {
                PlanPageLayoutTerms.Descriptor.UrlDescriptor urlDescriptor = (PlanPageLayoutTerms.Descriptor.UrlDescriptor) descriptor;
                aVar = new e2.a(urlDescriptor.f102715a, urlDescriptor.f102716b, null);
            } else {
                if (!(descriptor instanceof PlanPageLayoutTerms.Descriptor.ActionDescriptor)) {
                    throw new NoWhenBranchMatchedException();
                }
                PlanPageLayoutTerms.Descriptor.ActionDescriptor actionDescriptor = (PlanPageLayoutTerms.Descriptor.ActionDescriptor) descriptor;
                aVar = new e2.a(actionDescriptor.f102713a, null, actionDescriptor.f102714b.f81117a);
            }
            arrayList.add(aVar);
        }
    }
}
