package mjk;

import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheetFooter;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheetItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$HyperText;
import ggk.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class m {
    public static final PlansDashboardLayout$PlanPageLayout$BottomSheet a(g2.d.k kVar) {
        ArrayList arrayList;
        Object objA;
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter;
        String text;
        ArrayList arrayList2;
        Object objA2;
        w0 w0Var;
        com.revolut.retail.feature.pricing_plans.ui.api.models.h hVar;
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        String logoUrl = kVar.getLogoUrl();
        String title = kVar.getTitle();
        String description = kVar.getDescription();
        List<g2.d.m> items = kVar.getItems();
        if (items != null) {
            arrayList = new ArrayList();
            for (g2.d.m mVar : items) {
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    String type = mVar.getType();
                    w0[] w0VarArrValues = w0.values();
                    int length = w0VarArrValues.length;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            w0Var = null;
                            break;
                        }
                        w0Var = w0VarArrValues[i2];
                        if (a0.z(w0Var.name(), type, true)) {
                            break;
                        }
                        i2++;
                    }
                    int i3 = w0Var == null ? -1 : l.f206062a[w0Var.ordinal()];
                    if (i3 == 1) {
                        String icon = mVar.getIcon();
                        String title2 = mVar.getTitle();
                        if (title2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String description2 = mVar.getDescription();
                        if (description2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        objA2 = new PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell(icon, title2, description2);
                    } else if (i3 == 2) {
                        String title3 = mVar.getTitle();
                        if (title3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String description3 = mVar.getDescription();
                        if (description3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        objA2 = new PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details(title3, description3);
                    } else if (i3 == 3) {
                        String text2 = mVar.getText();
                        if (text2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        objA2 = new PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text(text2);
                    } else if (i3 != 4) {
                        objA2 = null;
                    } else {
                        g2.d.i asset = mVar.getAsset();
                        if (asset == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String type2 = asset.getType();
                        com.revolut.retail.feature.pricing_plans.ui.api.models.h[] hVarArrValues = com.revolut.retail.feature.pricing_plans.ui.api.models.h.values();
                        int length2 = hVarArrValues.length;
                        while (true) {
                            if (i >= length2) {
                                hVar = null;
                                break;
                            }
                            hVar = hVarArrValues[i];
                            if (a0.z(hVar.name(), type2, true)) {
                                break;
                            }
                            i++;
                        }
                        if (hVar == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        String url2 = asset.getUrl();
                        if (url2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        objA2 = new PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media(hVar, url2);
                    }
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA2 = yhm.o.a(th10);
                }
                m.Companion companion3 = yhm.m.INSTANCE;
                if (objA2 instanceof yhm.n) {
                    objA2 = null;
                }
                PlansDashboardLayout$PlanPageLayout$BottomSheetItem plansDashboardLayout$PlanPageLayout$BottomSheetItem = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem) objA2;
                if (plansDashboardLayout$PlanPageLayout$BottomSheetItem != null) {
                    arrayList.add(plansDashboardLayout$PlanPageLayout$BottomSheetItem);
                }
            }
        } else {
            arrayList = null;
        }
        g2.d.l footer = kVar.getFooter();
        if (footer != null) {
            try {
                m.Companion companion4 = yhm.m.INSTANCE;
                text = footer.getText();
            } catch (Throwable th11) {
                m.Companion companion5 = yhm.m.INSTANCE;
                objA = yhm.o.a(th11);
            }
            if (text == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List descriptors = footer.getDescriptors();
            if (descriptors != null) {
                List<g2.d.j> list = descriptors;
                arrayList2 = new ArrayList(zhm.w.t(list, 10));
                for (g2.d.j jVar : list) {
                    arrayList2.add(new PlansDashboardLayout$PlanPageLayout$HyperText(jVar.getText(), jVar.getUrl()));
                }
            } else {
                arrayList2 = null;
            }
            objA = new PlansDashboardLayout$PlanPageLayout$BottomSheetFooter(text, arrayList2);
            m.Companion companion6 = yhm.m.INSTANCE;
            plansDashboardLayout$PlanPageLayout$BottomSheetFooter = (PlansDashboardLayout$PlanPageLayout$BottomSheetFooter) (objA instanceof yhm.n ? null : objA);
        } else {
            plansDashboardLayout$PlanPageLayout$BottomSheetFooter = null;
        }
        return new PlansDashboardLayout$PlanPageLayout$BottomSheet(logoUrl, title, description, arrayList, plansDashboardLayout$PlanPageLayout$BottomSheetFooter);
    }

    public static final g2.d.k b(PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet) {
        ArrayList arrayList;
        g2.d.m mVar;
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$BottomSheet, "<this>");
        String str = plansDashboardLayout$PlanPageLayout$BottomSheet.f102758a;
        String str2 = plansDashboardLayout$PlanPageLayout$BottomSheet.f102759b;
        String str3 = plansDashboardLayout$PlanPageLayout$BottomSheet.f102760c;
        List list = plansDashboardLayout$PlanPageLayout$BottomSheet.d;
        g2.d.l lVar = null;
        ArrayList arrayList2 = null;
        if (list != null) {
            List<PlansDashboardLayout$PlanPageLayout$BottomSheetItem> list2 = list;
            arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (PlansDashboardLayout$PlanPageLayout$BottomSheetItem plansDashboardLayout$PlanPageLayout$BottomSheetItem : list2) {
                if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell) {
                    PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell cell = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Cell) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                    mVar = new g2.d.m(cell.d.name(), cell.f102763a, cell.f102764b, cell.f102765c, null, null);
                } else if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details) {
                    PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details details = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Details) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                    mVar = new g2.d.m(details.f102768c.name(), null, details.f102766a, details.f102767b, null, null);
                } else if (plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text) {
                    PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text text = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Text) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                    mVar = new g2.d.m(text.f102773b.name(), null, null, null, text.f102772a, null);
                } else {
                    if (!(plansDashboardLayout$PlanPageLayout$BottomSheetItem instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media media = (PlansDashboardLayout$PlanPageLayout$BottomSheetItem.Media) plansDashboardLayout$PlanPageLayout$BottomSheetItem;
                    mVar = new g2.d.m(media.f102771c.name(), null, null, null, null, new g2.d.i(media.f102769a.name(), media.f102770b));
                }
                arrayList.add(mVar);
            }
        } else {
            arrayList = null;
        }
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter = plansDashboardLayout$PlanPageLayout$BottomSheet.e;
        if (plansDashboardLayout$PlanPageLayout$BottomSheetFooter != null) {
            String str4 = plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102761a;
            List list3 = plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102762b;
            if (list3 != null) {
                List<PlansDashboardLayout$PlanPageLayout$HyperText> list4 = list3;
                arrayList2 = new ArrayList(zhm.w.t(list4, 10));
                for (PlansDashboardLayout$PlanPageLayout$HyperText plansDashboardLayout$PlanPageLayout$HyperText : list4) {
                    arrayList2.add(new g2.d.j(plansDashboardLayout$PlanPageLayout$HyperText.f102776a, plansDashboardLayout$PlanPageLayout$HyperText.f102777b));
                }
            }
            lVar = new g2.d.l(str4, arrayList2);
        }
        return new g2.d.k(str, str2, str3, arrayList, lVar);
    }
}
