package ifk;

import com.revolut.feature.pricingplans.models.cancel.PricingPlanCancelScreenConfig;
import hfk.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qfk.a f161036a;

    public c(qfk.a pricingPlanDescriptorMapper) {
        Intrinsics.checkNotNullParameter(pricingPlanDescriptorMapper, "pricingPlanDescriptorMapper");
        this.f161036a = pricingPlanDescriptorMapper;
    }

    public static PricingPlanCancelScreenConfig.ActionButton c(i.a aVar) {
        String label = aVar.getLabel();
        if (label == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return new PricingPlanCancelScreenConfig.ActionButton(aVar.getAction(), label, aVar.getDeeplink());
    }

    public final PricingPlanCancelScreenConfig.Footer a(i.e eVar) {
        ArrayList arrayList = null;
        if (eVar == null) {
            return null;
        }
        String title = eVar.getTitle();
        List links = eVar.getLinks();
        if (links != null) {
            List<i.f> list = links;
            arrayList = new ArrayList(w.t(list, 10));
            for (i.f fVar : list) {
                arrayList.add(new eha.a(fVar.getText(), fVar.getUrl()));
            }
        }
        return new PricingPlanCancelScreenConfig.Footer(this.f161036a.a(title, arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.ArrayList] */
    public final PricingPlanCancelScreenConfig b(i iVar) {
        ArrayList arrayList;
        PricingPlanCancelScreenConfig.SimpleTextItem simpleTextItem;
        ?? arrayList2;
        Iterator it8;
        PricingPlanCancelScreenConfig.DetailDialogScreenConfig detailDialogScreenConfig;
        ?? arrayList3;
        if (iVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String screenName = iVar.getScreenName();
        String title = iVar.getTitle();
        if (title == null) {
            title = "";
        }
        String description = iVar.getDescription();
        List links = iVar.getLinks();
        int i = 10;
        if (links != null) {
            List<i.f> list = links;
            arrayList = new ArrayList(w.t(list, 10));
            for (i.f fVar : list) {
                arrayList.add(new eha.a(fVar.getText(), fVar.getUrl()));
            }
        } else {
            arrayList = null;
        }
        PricingPlanCancelScreenConfig.Header header = new PricingPlanCancelScreenConfig.Header(title, this.f161036a.a(description, arrayList));
        i.g total = iVar.getTotal();
        if (total != null) {
            String title2 = total.getTitle();
            if (title2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            i.b description2 = total.getDescription();
            simpleTextItem = new PricingPlanCancelScreenConfig.SimpleTextItem(title2, description2 != null ? description2.getText() : null);
        } else {
            simpleTextItem = null;
        }
        List feesAndRefunds = iVar.getFeesAndRefunds();
        if (feesAndRefunds != null) {
            List list2 = feesAndRefunds;
            arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                i.d dVar = (i.d) it9.next();
                String title3 = dVar.getTitle();
                if (title3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                i.b description3 = dVar.getDescription();
                String text = description3 != null ? description3.getText() : null;
                i.c detailsScreen = dVar.getDetailsScreen();
                if (detailsScreen != null) {
                    String title4 = detailsScreen.getTitle();
                    if (title4 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String description4 = detailsScreen.getDescription();
                    List items = detailsScreen.getItems();
                    if (items != null) {
                        List list3 = items;
                        it8 = it9;
                        arrayList3 = new ArrayList(w.t(list3, i));
                        Iterator it10 = list3.iterator();
                        while (it10.hasNext()) {
                            i.g gVar = (i.g) it10.next();
                            Iterator it11 = it10;
                            String title5 = gVar.getTitle();
                            if (title5 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            i.b description5 = gVar.getDescription();
                            arrayList3.add(new PricingPlanCancelScreenConfig.SimpleTextItem(title5, description5 != null ? description5.getText() : null));
                            it10 = it11;
                        }
                    } else {
                        it8 = it9;
                        arrayList3 = f0.f322471a;
                    }
                    ?? r162 = arrayList3;
                    i.a primaryButton = detailsScreen.getPrimaryButton();
                    PricingPlanCancelScreenConfig.ActionButton actionButtonC = primaryButton != null ? c(primaryButton) : null;
                    i.a secondaryButton = detailsScreen.getSecondaryButton();
                    detailDialogScreenConfig = new PricingPlanCancelScreenConfig.DetailDialogScreenConfig(title4, description4, r162, actionButtonC, secondaryButton != null ? c(secondaryButton) : null);
                } else {
                    it8 = it9;
                    detailDialogScreenConfig = null;
                }
                arrayList2.add(new PricingPlanCancelScreenConfig.FeeAndRefundItem(title3, text, detailDialogScreenConfig));
                it9 = it8;
                i = 10;
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        ?? r62 = arrayList2;
        i.a primaryButton2 = iVar.getPrimaryButton();
        PricingPlanCancelScreenConfig.ActionButton actionButtonC2 = primaryButton2 != null ? c(primaryButton2) : null;
        i.a secondaryButton2 = iVar.getSecondaryButton();
        return new PricingPlanCancelScreenConfig(screenName, header, simpleTextItem, r62, actionButtonC2, secondaryButton2 != null ? c(secondaryButton2) : null, a(iVar.getFooter()));
    }
}
