package nok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$Button$Action;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ButtonStyle;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import gok.d;
import gok.e;
import gok.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mok.c;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public static final PricingPlanWaitlistLayout$BottomSheet a(c.a aVar) {
        ?? arrayList;
        ?? arrayList2;
        PricingPlanWaitlistLayout$ButtonStyle pricingPlanWaitlistLayout$ButtonStyle;
        String title = aVar.getTitle();
        String str = title == null ? "" : title;
        String subtitle = aVar.getSubtitle();
        String str2 = subtitle == null ? "" : subtitle;
        String icon = aVar.getIcon();
        List sectionsOrdered = aVar.getSectionsOrdered();
        if (sectionsOrdered != null) {
            List<c.a.b> list = sectionsOrdered;
            arrayList = new ArrayList(w.t(list, 10));
            for (c.a.b bVar : list) {
                String title2 = bVar.getTitle();
                String text = bVar.getText();
                c.a.b.C1170a actionLabel = bVar.getActionLabel();
                arrayList.add(new PricingPlanWaitlistLayout$BottomSheet.Section(title2, text, actionLabel != null ? new PricingPlanWaitlistLayout$BottomSheet.Section.Action(actionLabel.getLabel(), actionLabel.getDeeplink()) : null));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        List buttonsOrdered = aVar.getButtonsOrdered();
        if (buttonsOrdered != null) {
            List<c.a.C1169a> list2 = buttonsOrdered;
            arrayList2 = new ArrayList(w.t(list2, 10));
            for (c.a.C1169a c1169a : list2) {
                String label = c1169a.getLabel();
                String deeplink = c1169a.getDeeplink();
                int i = a.f218066b[c1169a.getStyle().ordinal()];
                if (i == 1) {
                    pricingPlanWaitlistLayout$ButtonStyle = PricingPlanWaitlistLayout$ButtonStyle.PRIMARY;
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pricingPlanWaitlistLayout$ButtonStyle = PricingPlanWaitlistLayout$ButtonStyle.SECONDARY;
                }
                arrayList2.add(new PricingPlanWaitlistLayout$BottomSheet.Button(label, deeplink, pricingPlanWaitlistLayout$ButtonStyle));
            }
        } else {
            arrayList2 = f0.f322471a;
        }
        return new PricingPlanWaitlistLayout$BottomSheet(str, str2, icon, r62, arrayList2);
    }

    public static final PricingPlanWaitlistLayout$ProductIntro b(c.e eVar) {
        String style = eVar.getStyle();
        List<c.e.a> steps = eVar.getSteps();
        ArrayList arrayList = new ArrayList(w.t(steps, 10));
        for (c.e.a aVar : steps) {
            String id10 = aVar.getId();
            String type = aVar.getType();
            String title = aVar.getTitle();
            String subtitle = aVar.getSubtitle();
            String videoUrl = aVar.getVideoUrl();
            c.e.a.C1172a badge = aVar.getBadge();
            arrayList.add(new PricingPlanWaitlistLayout$ProductIntro.Step(id10, type, title, subtitle, videoUrl, badge != null ? new PricingPlanWaitlistLayout$ProductIntro.Badge(badge.getLabel(), badge.getIcon()) : null));
        }
        return new PricingPlanWaitlistLayout$ProductIntro(style, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List] */
    public static final f c(c cVar) {
        ?? arrayList;
        d dVar;
        PricingPlanWaitlistLayout$ButtonStyle pricingPlanWaitlistLayout$ButtonStyle;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String title = cVar.getTitle();
        String subtitle = cVar.getSubtitle();
        String backgroundImageUrl = cVar.getBackgroundImageUrl();
        String backgroundVideoUrl = cVar.getBackgroundVideoUrl();
        List buttonsOrdered = cVar.getButtonsOrdered();
        if (buttonsOrdered != null) {
            List<c.b> list = buttonsOrdered;
            arrayList = new ArrayList(w.t(list, 10));
            for (c.b bVar : list) {
                String label = bVar.getLabel();
                int i = a.f218065a[bVar.getAction().ordinal()];
                PricingPlanWaitlistLayout$Button$Action showBottomSheet = PricingPlanWaitlistLayout$Button$Action.Unknown.f103669a;
                if (i == 1) {
                    c.a bottomSheet = cVar.getBottomSheet();
                    if (bottomSheet != null) {
                        showBottomSheet = new PricingPlanWaitlistLayout$Button$Action.ShowBottomSheet(a(bottomSheet));
                    }
                } else if (i == 2) {
                    c.e productIntro = cVar.getProductIntro();
                    if (productIntro != null) {
                        showBottomSheet = new PricingPlanWaitlistLayout$Button$Action.ShowBenefits(b(productIntro));
                    }
                } else if (i == 3) {
                    showBottomSheet = PricingPlanWaitlistLayout$Button$Action.AcceptInvite.f103666a;
                } else if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                int i2 = a.f218066b[bVar.getStyle().ordinal()];
                if (i2 == 1) {
                    pricingPlanWaitlistLayout$ButtonStyle = PricingPlanWaitlistLayout$ButtonStyle.PRIMARY;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pricingPlanWaitlistLayout$ButtonStyle = PricingPlanWaitlistLayout$ButtonStyle.SECONDARY;
                }
                arrayList.add(new gok.c(label, showBottomSheet, pricingPlanWaitlistLayout$ButtonStyle));
            }
        } else {
            arrayList = f0.f322471a;
        }
        ?? r62 = arrayList;
        c.d footer = cVar.getFooter();
        if (footer != null) {
            String text = footer.getText();
            c.f terms = footer.getTerms();
            dVar = new d(text, terms != null ? new e(terms.getUrl(), terms.getLabel()) : null);
        } else {
            dVar = null;
        }
        c.a bottomSheet2 = cVar.getBottomSheet();
        PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheetA = bottomSheet2 != null ? a(bottomSheet2) : null;
        c.e productIntro2 = cVar.getProductIntro();
        return new f(title, subtitle, backgroundImageUrl, backgroundVideoUrl, r62, dVar, pricingPlanWaitlistLayout$BottomSheetA, productIntro2 != null ? b(productIntro2) : null);
    }
}
