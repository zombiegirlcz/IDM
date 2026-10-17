package mjk;

import bjk.d2;
import bjk.e2;
import bjk.g2;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Badge;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptionItem;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BillingOptions;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$BottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Description;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$InfoBottomSheet;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Subtitle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$TextStyle;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$PlanPageLayout$Tooltip;
import ggk.a1;
import ggk.b1;
import ggk.c1;
import ggk.d1;
import ggk.e1;
import ggk.f1;
import ggk.g1;
import ggk.h1;
import ggk.i0;
import ggk.j0;
import ggk.k0;
import ggk.l0;
import ggk.m0;
import ggk.n0;
import ggk.o0;
import ggk.p0;
import ggk.q0;
import ggk.r0;
import ggk.s0;
import ggk.u0;
import ggk.x0;
import ggk.y0;
import ggk.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.d0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class r {
    public static final ArrayList a(List list) {
        u0 u0VarF;
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet;
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheetA;
        boolean z;
        List<g2.d.c> list2 = list == null ? f0.f322471a : list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (g2.d.c cVar : list2) {
            Intrinsics.checkNotNullParameter(cVar, "<this>");
            String id10 = cVar.getId();
            if (id10 == null) {
                m70.a.c(t0.f186434a);
                id10 = "";
            }
            String title = cVar.getTitle();
            String icon = cVar.getIcon();
            List<g2.d.e> benefits = cVar.getBenefits();
            ArrayList arrayList2 = new ArrayList(zhm.w.t(benefits, 10));
            for (g2.d.e eVar : benefits) {
                String title2 = eVar.getTitle();
                String iconUrl = eVar.getIconUrl();
                g2.d.C0106d descriptionOptions = eVar.getDescriptionOptions();
                if (descriptionOptions != null) {
                    u0VarF = f(descriptionOptions, eVar.getTitle());
                    plansDashboardLayout$PlanPageLayout$BottomSheet = null;
                } else {
                    u0VarF = null;
                    plansDashboardLayout$PlanPageLayout$BottomSheet = null;
                }
                String subtitle = eVar.getSubtitle();
                boolean zK = pd.b.k(eVar.getAvailable());
                g2.d.k bottomSheet = eVar.getBottomSheet();
                if (bottomSheet != null) {
                    z = zK;
                    plansDashboardLayout$PlanPageLayout$BottomSheetA = m.a(bottomSheet);
                } else {
                    plansDashboardLayout$PlanPageLayout$BottomSheetA = plansDashboardLayout$PlanPageLayout$BottomSheet;
                    z = zK;
                }
                arrayList2.add(new n0(title2, iconUrl, u0VarF, subtitle, z, plansDashboardLayout$PlanPageLayout$BottomSheetA));
            }
            arrayList.add(new o0(id10, title, icon, arrayList2));
        }
        return arrayList;
    }

    public static final ArrayList b(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<o0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (o0 o0Var : list2) {
            String str = o0Var.f143763a;
            String str2 = o0Var.f143764b;
            String str3 = o0Var.f143765c;
            ArrayList<n0> arrayList2 = o0Var.d;
            ArrayList arrayList3 = new ArrayList();
            for (n0 n0Var : arrayList2) {
                String str4 = n0Var.f143756a;
                String str5 = n0Var.f143757b;
                u0 u0Var = n0Var.f143758c;
                g2.d.C0106d c0106dM = u0Var != null ? m(u0Var) : null;
                Boolean boolValueOf = Boolean.valueOf(n0Var.e);
                g2.d.k kVarB = null;
                String str6 = n0Var.d;
                PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = n0Var.f;
                if (plansDashboardLayout$PlanPageLayout$BottomSheet != null) {
                    kVarB = m.b(plansDashboardLayout$PlanPageLayout$BottomSheet);
                }
                arrayList3.add(new g2.d.e(str4, str5, c0106dM, boolValueOf, str6, kVarB));
            }
            arrayList.add(new g2.d.c(str, str2, str3, arrayList3));
        }
        return arrayList;
    }

    public static final PlansDashboardLayout$PlanPageLayout$Badge c(g2.d.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        return new PlansDashboardLayout$PlanPageLayout$Badge(bVar.getIcon(), bVar.getText());
    }

    public static final PlansDashboardLayout$PlanPageLayout$Subtitle d(g2.d.x xVar) {
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = null;
        if (xVar == null) {
            return null;
        }
        g2.d.z primary = xVar.getPrimary();
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = primary == null ? null : new PlansDashboardLayout$PlanPageLayout$TextStyle(primary.getText(), primary.getStyle());
        g2.d.z secondary = xVar.getSecondary();
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2 = secondary == null ? null : new PlansDashboardLayout$PlanPageLayout$TextStyle(secondary.getText(), secondary.getStyle());
        g2.d.a0 tooltip = xVar.getTooltip();
        if (tooltip != null) {
            PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$TooltipE = e(tooltip);
            if (plansDashboardLayout$PlanPageLayout$TooltipE.f102791b != null) {
                plansDashboardLayout$PlanPageLayout$Tooltip = plansDashboardLayout$PlanPageLayout$TooltipE;
            }
        }
        return new PlansDashboardLayout$PlanPageLayout$Subtitle(plansDashboardLayout$PlanPageLayout$TextStyle, plansDashboardLayout$PlanPageLayout$TextStyle2, plansDashboardLayout$PlanPageLayout$Tooltip);
    }

    public static final PlansDashboardLayout$PlanPageLayout$Tooltip e(g2.d.a0 a0Var) {
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet;
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Background background;
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Background background2;
        g2.d.t payload = a0Var.getPayload();
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickActionB = null;
        if (payload != null) {
            List<g2.d.t.a> actions = payload.getActions();
            if (actions == null) {
                actions = f0.f322471a;
            }
            ArrayList arrayList = new ArrayList();
            for (g2.d.t.a aVar : actions) {
                String action = aVar.getAction();
                PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action action2 = Intrinsics.f(action, "CLOSE") ? new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action(c1.CLOSE, aVar.getLabel()) : Intrinsics.f(action, "UPGRADE") ? new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action(c1.UPGRADE, aVar.getLabel()) : null;
                if (action2 != null) {
                    arrayList.add(action2);
                }
            }
            String icon = payload.getIcon();
            String title = payload.getTitle();
            String description = payload.getDescription();
            e2 terms = payload.getTerms();
            PlanPageLayoutTerms planPageLayoutTermsA = terms != null ? n.a(terms) : null;
            g2.d.t.b background3 = payload.getBackground();
            if (background3 != null) {
                if (Intrinsics.f(background3.getType(), "ANIMATED_BACKGROUND")) {
                    com.revolut.retail.feature.pricing_plans.ui.api.models.i iVar = com.revolut.retail.feature.pricing_plans.ui.api.models.i.ANIMATED_BACKGROUND;
                    String code = background3.getCode();
                    if (code == null) {
                        code = "";
                    }
                    background2 = new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Background(iVar, code);
                } else {
                    background2 = null;
                }
                background = background2;
            } else {
                background = null;
            }
            plansDashboardLayout$PlanPageLayout$InfoBottomSheet = new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet(icon, title, description, arrayList, planPageLayoutTermsA, background);
        } else {
            plansDashboardLayout$PlanPageLayout$InfoBottomSheet = null;
        }
        String icon2 = a0Var.getIcon();
        if (!Intrinsics.f(a0Var.getAction(), "SHOW_BOTTOM_SHEET")) {
            String action3 = a0Var.getAction();
            if (action3 != null) {
                plansDashboardLayout$ClickActionB = p.b(action3, null);
            }
        } else if (plansDashboardLayout$PlanPageLayout$InfoBottomSheet != null) {
            plansDashboardLayout$ClickActionB = new PlansDashboardLayout$ClickAction.ShowBottomSheet(plansDashboardLayout$PlanPageLayout$InfoBottomSheet);
        }
        return new PlansDashboardLayout$PlanPageLayout$Tooltip(icon2, plansDashboardLayout$ClickActionB);
    }

    public static final u0 f(g2.d.C0106d c0106d, String str) {
        if (c0106d.getText() != null && c0106d.getUrl() != null) {
            return new q0(c0106d.getText(), c0106d.getUrl());
        }
        if (c0106d.getText() != null) {
            return new ggk.t0(c0106d.getText());
        }
        if (c0106d.getIcon() != null) {
            return new p0(c0106d.getIcon());
        }
        if (c0106d.getPlaceholder() != null) {
            return new r0(c0106d.getPlaceholder());
        }
        if (c0106d.getAsset() != null) {
            PlanPageLayoutAsset planPageLayoutAssetX = nz8.d.x(c0106d.getAsset());
            if (planPageLayoutAssetX != null) {
                return new s0(planPageLayoutAssetX);
            }
            return null;
        }
        IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("PlanDashboardLayoutMapping: unsupported description for benefit ", str));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        return null;
    }

    public static final x0 g(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.isEmpty() ? new x0(null, null) : list.size() == 1 ? new x0(null, q.a((g2.a) list.get(0))) : new x0(q.a((g2.a) list.get(0)), q.a((g2.a) list.get(1)));
    }

    public static final y0 h(g2.d.q qVar) {
        PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        String title = qVar.getTitle();
        List badges = qVar.getBadges();
        if (badges == null) {
            badges = f0.f322471a;
        }
        List list = badges;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(c((g2.d.b) it8.next()));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listL = arrayList;
        if (zIsEmpty) {
            g2.d.b badge = qVar.getBadge();
            listL = zhm.v.l(badge != null ? c(badge) : null);
        }
        List list2 = listL;
        PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$SubtitleD = d(qVar.getSubtitle());
        g2.d.p description = qVar.getDescription();
        if (description != null) {
            Intrinsics.checkNotNullParameter(description, "<this>");
            String text = description.getText();
            g2.d.a0 tooltip = description.getTooltip();
            plansDashboardLayout$PlanPageLayout$Description = new PlansDashboardLayout$PlanPageLayout$Description(text, tooltip != null ? e(tooltip) : null);
        } else {
            plansDashboardLayout$PlanPageLayout$Description = null;
        }
        d2 asset = qVar.getAsset();
        return new y0(title, list2, plansDashboardLayout$PlanPageLayout$SubtitleD, plansDashboardLayout$PlanPageLayout$Description, asset != null ? nz8.d.x(asset) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final ggk.b1 i(bjk.g2.d.s r11) {
        /*
            r0 = 0
            if (r11 == 0) goto L1c
            bjk.g2$d$r r1 = r11.getSpotlightBenefit()
            if (r1 == 0) goto L1c
            java.lang.String r2 = r1.getTitle()
            java.lang.String r3 = r1.getSubtitle()
            java.lang.String r1 = r1.getIcon()
            ggk.z0 r4 = new ggk.z0
            r4.<init>(r2, r1, r3)
            r6 = r4
            goto L1d
        L1c:
            r6 = r0
        L1d:
            if (r11 == 0) goto L24
            java.util.List r1 = r11.getBenefits()
            goto L25
        L24:
            r1 = r0
        L25:
            if (r1 != 0) goto L29
            zhm.f0 r1 = zhm.f0.f322471a
        L29:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r1, r2)
            r7.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            bjk.g2$d$r r2 = (bjk.g2.d.r) r2
            java.lang.String r3 = r2.getTitle()
            java.lang.String r4 = r2.getSubtitle()
            java.lang.String r2 = r2.getIcon()
            ggk.z0 r5 = new ggk.z0
            r5.<init>(r3, r2, r4)
            r7.add(r5)
            goto L3a
        L5b:
            if (r11 == 0) goto L7e
            bjk.g2$d$w r1 = r11.getSubscriptionsBenefit()
            if (r1 == 0) goto L7e
            java.lang.String r2 = r1.getTitle()
            java.lang.String r3 = r1.getIcon()
            java.lang.Integer r4 = r1.getTotalSubscriptions()
            java.util.List r1 = r1.getIconsListUrls()
            if (r1 != 0) goto L77
            zhm.f0 r1 = zhm.f0.f322471a
        L77:
            ggk.f1 r5 = new ggk.f1
            r5.<init>(r1, r2, r3, r4)
            r8 = r5
            goto L7f
        L7e:
            r8 = r0
        L7f:
            if (r11 == 0) goto La6
            java.lang.String r1 = r11.getStyle()
            if (r1 == 0) goto La6
            ggk.a1[] r2 = ggk.a1.values()
            int r3 = r2.length
            r4 = 0
        L8d:
            if (r4 >= r3) goto La0
            r5 = r2[r4]
            java.lang.String r9 = r5.name()
            r10 = 1
            boolean r9 = kotlin.text.a0.z(r9, r1, r10)
            if (r9 == 0) goto L9d
            goto La1
        L9d:
            int r4 = r4 + 1
            goto L8d
        La0:
            r5 = r0
        La1:
            if (r5 != 0) goto La4
            goto La6
        La4:
            r9 = r5
            goto La9
        La6:
            ggk.a1 r5 = ggk.a1.DEFAULT
            goto La4
        La9:
            if (r11 == 0) goto Lb5
            bjk.g2$a r11 = r11.getButton()
            if (r11 == 0) goto Lb5
            com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$Button r0 = mjk.q.a(r11)
        Lb5:
            r10 = r0
            ggk.b1 r5 = new ggk.b1
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.r.i(bjk.g2$d$s):ggk.b1");
    }

    public static final d1 j(g2.d.u uVar) {
        if (uVar == null) {
            return null;
        }
        String title = uVar.getTitle();
        String icon = uVar.getIcon();
        List<g2.d.a> apps = uVar.getApps();
        ArrayList arrayList = new ArrayList();
        for (g2.d.a aVar : apps) {
            String title2 = aVar.getTitle();
            String iconUrl = aVar.getIconUrl();
            g2.d.C0106d descriptionOptions = aVar.getDescriptionOptions();
            u0 u0VarF = descriptionOptions != null ? f(descriptionOptions, aVar.getTitle()) : null;
            boolean zK = pd.b.k(aVar.getAvailable());
            g2.d.k bottomSheet = aVar.getBottomSheet();
            arrayList.add(new m0(title2, iconUrl, u0VarF, zK, bottomSheet != null ? m.a(bottomSheet) : null));
        }
        return new d1(title, icon, arrayList);
    }

    public static final g1 k(g2.d dVar) {
        x0 x0Var;
        g2.a secondary;
        PlansDashboardLayout$Button plansDashboardLayout$ButtonA;
        g2.a primary;
        PlansDashboardLayout$Button plansDashboardLayout$ButtonA2;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        String id10 = dVar.getId();
        String title = dVar.getTitle();
        String dashboardTitle = dVar.getDashboardTitle();
        g2.d.q header = dVar.getHeader();
        y0 y0VarH = header != null ? h(header) : null;
        g2.d.v style = dVar.getStyle();
        e1 e1Var = style != null ? new e1(style.getBackgroundCode()) : null;
        b1 b1VarI = i(dVar.getSpecialBanner());
        b1 b1VarI2 = i(dVar.getHighlightedBenefits());
        ArrayList arrayListA = a(dVar.getBenefitCategories());
        d1 d1VarJ = j(dVar.getPerks());
        List buttonsOrdered = dVar.getButtonsOrdered();
        if (buttonsOrdered != null) {
            x0Var = g(buttonsOrdered);
        } else {
            g2.d.n buttons = dVar.getButtons();
            PlansDashboardLayout$Button plansDashboardLayout$ButtonA3 = (buttons == null || (primary = buttons.getPrimary()) == null || (plansDashboardLayout$ButtonA2 = q.a(primary)) == null) ? null : PlansDashboardLayout$Button.a(plansDashboardLayout$ButtonA2, ggk.h0.PRIMARY);
            PlansDashboardLayout$Button plansDashboardLayout$ButtonA4 = (buttons == null || (secondary = buttons.getSecondary()) == null || (plansDashboardLayout$ButtonA = q.a(secondary)) == null) ? null : PlansDashboardLayout$Button.a(plansDashboardLayout$ButtonA, ggk.h0.SECONDARY);
            PlansDashboardLayout$Button plansDashboardLayout$Button = plansDashboardLayout$ButtonA3 == null ? plansDashboardLayout$ButtonA4 : plansDashboardLayout$ButtonA3;
            if (plansDashboardLayout$ButtonA3 == null) {
                plansDashboardLayout$ButtonA4 = null;
            }
            x0Var = new x0(plansDashboardLayout$ButtonA4, plansDashboardLayout$Button);
        }
        g2.d.h billingOptions = dVar.getBillingOptions();
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptionsB = billingOptions != null ? k.b(billingOptions) : null;
        e2 terms = dVar.getTerms();
        return new g1(id10, title, dashboardTitle, y0VarH, e1Var, b1VarI, b1VarI2, arrayListA, d1VarJ, x0Var, plansDashboardLayout$PlanPageLayout$BillingOptionsB, terms != null ? n.a(terms) : null);
    }

    public static final h1 l(g2 g2Var) {
        Intrinsics.checkNotNullParameter(g2Var, "<this>");
        String suggestedPlanId = g2Var.getSuggestedPlanId();
        if (suggestedPlanId == null) {
            suggestedPlanId = ((g2.d) d0.b0(g2Var.getPlans())).getId();
        }
        List plans = g2Var.getPlans();
        ArrayList arrayList = new ArrayList(zhm.w.t(plans, 10));
        Iterator it8 = plans.iterator();
        while (it8.hasNext()) {
            arrayList.add(k((g2.d) it8.next()));
        }
        g2.b navigation = g2Var.getNavigation();
        return new h1(suggestedPlanId, arrayList, navigation != null ? s.a(navigation) : null);
    }

    public static final g2.d.C0106d m(u0 u0Var) {
        if (u0Var instanceof ggk.t0) {
            return new g2.d.C0106d(((ggk.t0) u0Var).f143782a, null, null, null, null);
        }
        if (u0Var instanceof p0) {
            return new g2.d.C0106d(null, null, ((p0) u0Var).f143770a, null, null);
        }
        if (u0Var instanceof r0) {
            return new g2.d.C0106d(null, ((r0) u0Var).f143775a, null, null, null);
        }
        if (u0Var instanceof s0) {
            PlanPageLayoutAsset planPageLayoutAsset = ((s0) u0Var).f143777a;
            Intrinsics.checkNotNullParameter(planPageLayoutAsset, "<this>");
            return new g2.d.C0106d(null, null, null, new d2(planPageLayoutAsset.f102708a, planPageLayoutAsset.f102709b.a()), null);
        }
        if (!(u0Var instanceof q0)) {
            throw new NoWhenBranchMatchedException();
        }
        q0 q0Var = (q0) u0Var;
        return new g2.d.C0106d(q0Var.f143771a, null, null, null, q0Var.f143772b);
    }

    public static final g2.d.s n(b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        z0 z0Var = b1Var.f143703a;
        g2.d.r rVar = z0Var != null ? new g2.d.r(z0Var.f143807a, z0Var.f143808b, z0Var.f143809c) : null;
        ArrayList<z0> arrayList = b1Var.f143704b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        for (z0 z0Var2 : arrayList) {
            arrayList2.add(new g2.d.r(z0Var2.f143807a, z0Var2.f143808b, z0Var2.f143809c));
        }
        f1 f1Var = b1Var.f143705c;
        g2.d.w wVar = f1Var != null ? new g2.d.w(f1Var.f143717c, f1Var.f143715a, f1Var.f143716b, f1Var.d) : null;
        a1 a1Var = b1Var.d;
        String strName = a1Var != null ? a1Var.name() : null;
        PlansDashboardLayout$Button plansDashboardLayout$Button = b1Var.e;
        return new g2.d.s(rVar, arrayList2, wVar, strName, plansDashboardLayout$Button != null ? q.b(plansDashboardLayout$Button) : null);
    }

    public static final g2.d.u o(d1 d1Var) {
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        String str = d1Var.f143707a;
        String str2 = d1Var.f143708b;
        List<m0> list = d1Var.f143709c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (m0 m0Var : list) {
            String str3 = m0Var.f143751a;
            String str4 = m0Var.f143752b;
            u0 u0Var = m0Var.f143753c;
            g2.d.k kVarB = null;
            g2.d.C0106d c0106dM = u0Var != null ? m(u0Var) : null;
            Boolean boolValueOf = Boolean.valueOf(m0Var.d);
            PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = m0Var.e;
            if (plansDashboardLayout$PlanPageLayout$BottomSheet != null) {
                kVarB = m.b(plansDashboardLayout$PlanPageLayout$BottomSheet);
            }
            arrayList.add(new g2.d.a(str3, str4, c0106dM, boolValueOf, kVarB));
        }
        return new g2.d.u(str, str2, arrayList);
    }

    public static final g2.d.x p(PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle) {
        Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$Subtitle, "<this>");
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = plansDashboardLayout$PlanPageLayout$Subtitle.f102785a;
        g2.d.z zVar = plansDashboardLayout$PlanPageLayout$TextStyle != null ? new g2.d.z(plansDashboardLayout$PlanPageLayout$TextStyle.f102788a, plansDashboardLayout$PlanPageLayout$TextStyle.f102789b) : null;
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle2 = plansDashboardLayout$PlanPageLayout$Subtitle.f102786b;
        g2.d.z zVar2 = plansDashboardLayout$PlanPageLayout$TextStyle2 != null ? new g2.d.z(plansDashboardLayout$PlanPageLayout$TextStyle2.f102788a, plansDashboardLayout$PlanPageLayout$TextStyle2.f102789b) : null;
        PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = plansDashboardLayout$PlanPageLayout$Subtitle.f102787c;
        return new g2.d.x(zVar, zVar2, plansDashboardLayout$PlanPageLayout$Tooltip != null ? q(plansDashboardLayout$PlanPageLayout$Tooltip) : null);
    }

    public static final g2.d.a0 q(PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip) {
        PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction = plansDashboardLayout$PlanPageLayout$Tooltip.f102791b;
        g2.d.t tVar = null;
        PlansDashboardLayout$ClickAction.ShowBottomSheet showBottomSheet = plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowBottomSheet ? (PlansDashboardLayout$ClickAction.ShowBottomSheet) plansDashboardLayout$ClickAction : null;
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet = showBottomSheet != null ? showBottomSheet.f102741a : null;
        String str = plansDashboardLayout$PlanPageLayout$Tooltip.f102790a;
        String strA = plansDashboardLayout$ClickAction != null ? p.a(plansDashboardLayout$ClickAction) : null;
        if (plansDashboardLayout$PlanPageLayout$InfoBottomSheet != null) {
            String str2 = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102778a;
            String str3 = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102779b;
            String str4 = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102780c;
            ArrayList<PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action> arrayList = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.d;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Action action : arrayList) {
                arrayList2.add(new g2.d.t.a(action.f102781a.name(), action.f102782b));
            }
            PlanPageLayoutTerms planPageLayoutTerms = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.e;
            e2 e2VarB = planPageLayoutTerms != null ? n.b(planPageLayoutTerms) : null;
            PlansDashboardLayout$PlanPageLayout$InfoBottomSheet.Background background = plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f;
            tVar = new g2.d.t(str2, str3, str4, arrayList2, e2VarB, background != null ? new g2.d.t.b(background.f102783a.name(), background.f102784b) : null);
        }
        return new g2.d.a0(str, strA, tVar);
    }

    public static final g2.d r(g1 g1Var) {
        g2.d.q qVar;
        g2.d.s sVar;
        g2.d.h hVar;
        d2 d2Var;
        g2.d.p pVar;
        Intrinsics.checkNotNullParameter(g1Var, "<this>");
        String str = g1Var.f143718a;
        String str2 = g1Var.f143719b;
        String str3 = g1Var.f143720c;
        y0 y0Var = g1Var.d;
        if (y0Var != null) {
            Intrinsics.checkNotNullParameter(y0Var, "<this>");
            String str4 = y0Var.f143801a;
            List<PlansDashboardLayout$PlanPageLayout$Badge> list = y0Var.f143802b;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            for (PlansDashboardLayout$PlanPageLayout$Badge plansDashboardLayout$PlanPageLayout$Badge : list) {
                Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$Badge, "<this>");
                arrayList.add(new g2.d.b(plansDashboardLayout$PlanPageLayout$Badge.f102745a, plansDashboardLayout$PlanPageLayout$Badge.f102746b));
            }
            PlansDashboardLayout$PlanPageLayout$Subtitle plansDashboardLayout$PlanPageLayout$Subtitle = y0Var.f143803c;
            g2.d.x xVarP = plansDashboardLayout$PlanPageLayout$Subtitle != null ? p(plansDashboardLayout$PlanPageLayout$Subtitle) : null;
            PlanPageLayoutAsset planPageLayoutAsset = y0Var.e;
            if (planPageLayoutAsset != null) {
                Intrinsics.checkNotNullParameter(planPageLayoutAsset, "<this>");
                d2Var = new d2(planPageLayoutAsset.f102708a, planPageLayoutAsset.f102709b.a());
            } else {
                d2Var = null;
            }
            PlansDashboardLayout$PlanPageLayout$Description plansDashboardLayout$PlanPageLayout$Description = y0Var.d;
            if (plansDashboardLayout$PlanPageLayout$Description != null) {
                Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$Description, "<this>");
                String str5 = plansDashboardLayout$PlanPageLayout$Description.f102774a;
                PlansDashboardLayout$PlanPageLayout$Tooltip plansDashboardLayout$PlanPageLayout$Tooltip = plansDashboardLayout$PlanPageLayout$Description.f102775b;
                pVar = new g2.d.p(str5, plansDashboardLayout$PlanPageLayout$Tooltip != null ? q(plansDashboardLayout$PlanPageLayout$Tooltip) : null);
            } else {
                pVar = null;
            }
            qVar = new g2.d.q(str4, arrayList, xVarP, pVar, d2Var);
        } else {
            qVar = null;
        }
        e1 e1Var = g1Var.e;
        g2.d.v vVar = e1Var != null ? new g2.d.v(e1Var.f143710a) : null;
        g2.d.s sVarN = n(g1Var.f);
        g2.d.s sVarN2 = n(g1Var.f143721g);
        ArrayList arrayListB = b(g1Var.f143722h);
        d1 d1Var = g1Var.i;
        g2.d.u uVarO = d1Var != null ? o(d1Var) : null;
        x0 x0Var = g1Var.f143723j;
        Intrinsics.checkNotNullParameter(x0Var, "<this>");
        PlansDashboardLayout$Button plansDashboardLayout$Button = x0Var.f143796a;
        g2.a aVarB = plansDashboardLayout$Button != null ? q.b(plansDashboardLayout$Button) : null;
        PlansDashboardLayout$Button plansDashboardLayout$Button2 = x0Var.f143797b;
        g2.a[] elements = {aVarB, plansDashboardLayout$Button2 != null ? q.b(plansDashboardLayout$Button2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = g1Var.k;
        if (plansDashboardLayout$PlanPageLayout$BillingOptions != null) {
            Intrinsics.checkNotNullParameter(plansDashboardLayout$PlanPageLayout$BillingOptions, "<this>");
            String str6 = plansDashboardLayout$PlanPageLayout$BillingOptions.f102756b;
            String str7 = plansDashboardLayout$PlanPageLayout$BillingOptions.f102757c;
            String strName = plansDashboardLayout$PlanPageLayout$BillingOptions.f102755a.name();
            ArrayList arrayList2 = plansDashboardLayout$PlanPageLayout$BillingOptions.d;
            sVar = sVarN;
            ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList2, 10));
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                arrayList3.add(k.d((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) it8.next()));
            }
            hVar = new g2.d.h(str6, str7, strName, arrayList3);
        } else {
            sVar = sVarN;
            hVar = null;
        }
        PlanPageLayoutTerms planPageLayoutTerms = g1Var.f143724l;
        return new g2.d(str, str2, str3, qVar, vVar, sVar, sVarN2, arrayListB, uVarO, hVar, listL, planPageLayoutTerms != null ? n.b(planPageLayoutTerms) : null);
    }

    public static final g2 s(h1 h1Var) {
        g2.c cVar;
        Intrinsics.checkNotNullParameter(h1Var, "<this>");
        String str = h1Var.f143726a;
        ArrayList arrayList = h1Var.f143727b;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(r((g1) it8.next()));
        }
        i0 i0Var = h1Var.f143728c;
        g2.b bVar = null;
        g2.c cVar2 = null;
        if (i0Var != null) {
            Intrinsics.checkNotNullParameter(i0Var, "<this>");
            l0 l0Var = i0Var.f143729a;
            if (l0Var != null) {
                if (l0Var instanceof j0) {
                    j0 j0Var = (j0) l0Var;
                    PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction = j0Var.f143735b;
                    String str2 = j0Var.f143734a;
                    String strA = p.a(plansDashboardLayout$ClickAction);
                    Intrinsics.checkNotNullParameter(plansDashboardLayout$ClickAction, "<this>");
                    cVar = new g2.c(str2, null, strA, plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenUrl ? ((PlansDashboardLayout$ClickAction.OpenUrl) plansDashboardLayout$ClickAction).f102739a : null);
                } else {
                    if (!(l0Var instanceof k0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    k0 k0Var = (k0) l0Var;
                    PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction2 = k0Var.f143740b;
                    String str3 = k0Var.f143739a;
                    String strA2 = p.a(plansDashboardLayout$ClickAction2);
                    Intrinsics.checkNotNullParameter(plansDashboardLayout$ClickAction2, "<this>");
                    cVar = new g2.c(null, str3, strA2, plansDashboardLayout$ClickAction2 instanceof PlansDashboardLayout$ClickAction.OpenUrl ? ((PlansDashboardLayout$ClickAction.OpenUrl) plansDashboardLayout$ClickAction2).f102739a : null);
                }
                cVar2 = cVar;
            }
            bVar = new g2.b(cVar2);
        }
        return new g2(str, arrayList2, bVar);
    }
}
