package a0i;

import acf.l;
import android.os.Parcelable;
import avk.i0;
import avk.m;
import aw0.o9;
import cci.f;
import cci.h;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.domain.models.transactions.InsufficientFunds;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature.recurring_payments.api.data.models.RecurringPaymentWithExtra;
import com.revolut.feature.trading_add_ons.impl.R$string;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import fcf.o;
import fcf.p;
import fci.g;
import fci.k;
import ieg.z;
import ip0.ji;
import ise.r0;
import j4h.n;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jel.a3;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import lbf.e;
import mx0.b6;
import qv0.i;
import wvg.o0;
import wvg.y1;
import yy0.j;
import zhm.a0;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f388c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(i0 i0Var, Data data, m mVar) {
        this.f386a = 4;
        this.f387b = i0Var;
        this.d = data;
        this.f388c = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model, still in use, count: 3, list:
          (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) from 0x00d1: MOVE (r25v0 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) = (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model)
          (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) from 0x0164: MOVE (r25v5 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) = (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model)
          (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) from 0x00e6: MOVE (r25v6 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model) = (r12v1 com.revolut.core.ui_kit.delegates.HeaderDelegate$Model)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    private final java.lang.Object a(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.b(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01cb  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12, types: [com.revolut.core.ui_kit_core.displayers.image.Image] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v4, types: [com.revolut.core.ui_kit.delegates.RowDelegate$Model$c] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object c(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.c(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.d(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object e(Object obj2, Object obj3, Object obj4) {
        Period period;
        Object textLocalisedClause;
        Period period2;
        p pVar = (p) this.f387b;
        lbf.b bVar = (lbf.b) this.f388c;
        dj0.d dVar = bVar.f193668c;
        e eVar = bVar.e;
        hel.b bVar2 = (hel.b) this.d;
        wbf.d portfolioStatus = (wbf.d) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(portfolioStatus, "portfolioStatus");
        pVar.getClass();
        if (portfolioStatus != wbf.d.ACTIVE) {
            if (eVar == null || (period = eVar.f193672a) == null) {
                return new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button_no_trial_pending, null, null, 14);
            }
            return new TextLocalisedClause(o.f133742a[bVar2.ordinal()] == 1 ? R$string.price_plan_add_ons_add_on_start_button_pending_us : R$string.price_plan_add_ons_add_on_start_button_pending, u.c(String.valueOf(period.getDays())), null, 12);
        }
        if (eVar != null && (period2 = eVar.f193672a) != null) {
            return new TextLocalisedClause(o.f133742a[bVar2.ordinal()] == 1 ? R$string.price_plan_add_ons_add_on_start_button_us : R$string.price_plan_add_ons_add_on_start_button, u.c(String.valueOf(period2.getDays())), null, 12);
        }
        if (o.f133742a[bVar2.ordinal()] == 1) {
            return new TextLocalisedClause(R$string.price_plan_add_ons_add_on_start_button_no_trial_us, null, null, 14);
        }
        if (dVar.k()) {
            return new TextLocalisedClause(R$string.price_plan_add_ons_add_on_title_get_trading_pro, null, null, 14);
        }
        int i = R$string.price_plan_add_ons_add_on_start_button_no_trial;
        MoneyClause moneyClause = new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        lbf.c cVar = bVar.f193666a;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        int i2 = l.f3137a[cVar.ordinal()];
        if (i2 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_year_short, null, null, 14);
        } else if (i2 == 2) {
            textLocalisedClause = new TextLocalisedClause(R$string.price_plan_add_ons_add_on_period_month_short, null, null, 14);
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        return new TextLocalisedClause(i, v.k(moneyClause, textLocalisedClause), null, 12);
    }

    private final Object g(Object obj2, Object obj3, Object obj4) {
        List listL;
        fci.b bVar = (fci.b) this.f387b;
        g gVar = (g) this.f388c;
        g gVar2 = (g) this.d;
        f applicablePurposes = (f) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(applicablePurposes, "applicablePurposes");
        List list = gVar.f133775b;
        wi0.b bVar2 = bVar.f133760a.f97719a;
        List list2 = fci.b.f133750l;
        int i = fci.b.k;
        int i2 = fci.b.f133748h;
        List list3 = fci.b.f133747g;
        int i3 = fci.b.f;
        List list4 = fci.b.d;
        int i5 = fci.b.f133746c;
        Set setI1 = d0.i1(applicablePurposes.a());
        if (applicablePurposes instanceof cci.e) {
            Set set = setI1;
            h[] elements = {fci.b.a(fci.b.f133756s, d0.h0(fci.b.f133757t, set)), fci.b.a(fci.b.u, d0.h0(fci.b.v, set)), fci.b.a(fci.b.f133758w, d0.h0(fci.b.f133759x, set))};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
        } else if (applicablePurposes instanceof cci.c) {
            Set set2 = setI1;
            h[] elements2 = {fci.b.a(i5, d0.h0(fci.b.e, set2)), fci.b.a(fci.b.f133751m, d0.h0(fci.b.f133752n, set2)), fci.b.a(fci.b.o, d0.h0(fci.b.f133753p, set2)), fci.b.a(fci.b.f133754q, d0.h0(fci.b.f133755r, set2))};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        } else if (applicablePurposes instanceof cci.a) {
            Set set3 = setI1;
            h[] elements3 = {fci.b.a(i5, d0.h0(list4, set3)), fci.b.a(i3, d0.h0(list3, set3)), fci.b.a(i2, d0.h0(fci.b.f133749j, set3)), fci.b.a(i, d0.h0(list2, set3))};
            Intrinsics.checkNotNullParameter(elements3, "elements");
            listL = kotlin.collections.d.L(elements3);
        } else {
            Set set4 = setI1;
            h[] elements4 = {fci.b.a(i5, d0.h0(list4, set4)), fci.b.a(i3, d0.h0(list3, set4)), fci.b.a(i2, d0.h0(fci.b.i, set4)), fci.b.a(i, d0.h0(list2, set4))};
            Intrinsics.checkNotNullParameter(elements4, "elements");
            listL = kotlin.collections.d.L(elements4);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it8 = listL.iterator();
        int i6 = 0;
        while (it8.hasNext()) {
            Object next = it8.next();
            int i21 = i6 + 1;
            if (i6 < 0) {
                v.s();
                throw null;
            }
            h hVar = (h) next;
            ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model(a0.d.n("purpose_category_", i6), (Image) null, (Clause) hVar.f23115a, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, R$attr.uikit_dp8, 0, 0, 57338);
            List list5 = hVar.f23116b;
            String strN = a0.d.n("purpose_", i6);
            List list6 = list5;
            ArrayList arrayList2 = new ArrayList(w.t(list6, 10));
            int i22 = 0;
            for (Object obj5 : list6) {
                int i32 = i22 + 1;
                if (i22 < 0) {
                    v.s();
                    throw null;
                }
                cci.g gVar3 = (cci.g) obj5;
                arrayList2.add(new b6(com.google.android.gms.internal.mlkit_vision_face.a.k(i22, strN, "_"), null, new TextClause(bVar.f133761b.b(gVar3, bVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, list.contains(gVar3), gVar3, 42));
                it8 = it8;
                i22 = i32;
            }
            Iterator it9 = it8;
            i[] elements5 = {model, new ji(R$attr.uikit_dp8, 56, strN, arrayList2)};
            Intrinsics.checkNotNullParameter(elements5, "elements");
            a0.y(arrayList, kotlin.collections.d.E(elements5));
            i6 = i21;
            it8 = it9;
        }
        return new k(bVar.b(gVar2.f133776c), bVar.d(gVar2.f133776c), d0.d1(arrayList), !gVar.f133775b.isEmpty());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ce A[PHI: r16
      0x03ce: PHI (r16v7 boolean) = (r16v3 boolean), (r16v4 boolean), (r16v8 boolean) binds: [B:141:0x0563, B:135:0x04bb, B:116:0x03cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0216  */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.revolut.core.ui_kit.background.AnimatedBackgroundType] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object h(java.lang.Object r55, java.lang.Object r56, java.lang.Object r57) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.h(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object i(Object obj2, Object obj3, Object obj4) {
        int i;
        i8b.b bVar = (i8b.b) this.f387b;
        j8b.b headerVariant = (j8b.b) this.f388c;
        String str = (String) this.d;
        List events = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(events, "events");
        j8b.h hVar = bVar.f159488q;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(headerVariant, "headerVariant");
        int i2 = j8b.g.f172164a[headerVariant.ordinal()];
        if (i2 == 1) {
            i = com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_screen_title;
        } else if (i2 == 2) {
            i = com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_screen_title_events;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_widget_past_events_title;
        }
        ListSubheaderDelegate.Model model = new ListSubheaderDelegate.Model("CORPORATE_EVENTS_HEADER_SEE_ALL_ID", (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), (ResourceImage) null, false, false, (Clause) new TextLocalisedClause(R.string.common_action_see_all, null, null, 14), true, (Object) str, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 259898);
        boolean z = str != null;
        List list = events;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(hVar.a((kp3.b) it8.next(), z));
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List listC = arrayList;
        if (zIsEmpty) {
            listC = u.c(new RowDelegate.Model("CORPORATE_EVENT_EMPTY_EVENTS_STATE_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D074", null, null, null, 30), null, null, new TextLocalisedClause(com.revolut.feature.retail.corporate_events.common.R$string.feature_corporate_events_empty_state_no_events_for_month, null, null, 14), null, null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073741804));
        }
        List list2 = listC;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        return i2b.a.q(model, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0b82  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0bd0  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c0d  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0c30  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0dc5  */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [com.revolut.core.ui_kit.models.PercentageClause$Format, com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r4v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v66, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v67, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [com.revolut.core.ui_kit.models.PercentageClause$Format, com.revolut.core.ui_kit.models.Style] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r9v62, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v64, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v65, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v66, types: [com.revolut.analytics.tracking.v3.AnalyticsContext, com.revolut.core.ui_kit.models.Style, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r71, java.lang.Object r72, java.lang.Object r73) {
        /*
            Method dump skipped, instruction units count: 3736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.j(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    private final Object k(Object obj2, Object obj3, Object obj4) {
        im3.h hVar = (im3.h) this.f387b;
        aim.f fVar = (aim.f) this.f388c;
        q qVar = (q) this.d;
        List content = (List) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        List list = content;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new RecurringPaymentWithExtra.General((qua.p) it8.next()));
        }
        a9e.h hVar2 = hVar.f162293a;
        f0 f0Var = f0.f322471a;
        List listA = a9e.h.a(hVar2, arrayList, a9e.e.f2426a, f0Var, null, fVar, qVar, 24);
        return listA == null ? f0Var : listA;
    }

    private final Object l(Object obj2, Object obj3, Object obj4) {
        Clause compositeClause;
        xte.a aVar = ((com.revolut.feature.three_ds_verification.impl.ui.sceen.g) this.f387b).d;
        InsufficientFunds insufficientFunds = (InsufficientFunds) this.f388c;
        Data data = (Data) this.d;
        AddMoneyMethod method = (AddMoneyMethod) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        if (!(method instanceof AddMoneyMethod.MoveMoney)) {
            if (!(method instanceof AddMoneyMethod.TopUp)) {
                throw new NoWhenBranchMatchedException();
            }
            TopupMethod topupMethod = ((AddMoneyMethod.TopUp) method).f65827a;
            if (topupMethod instanceof TopupMethod.StoredMethod) {
                TopupMethod.StoredMethod storedMethod = (TopupMethod.StoredMethod) topupMethod;
                dj0.d amount = insufficientFunds.f60531a;
                Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
                Intrinsics.checkNotNullParameter(amount, "amount");
                return u.c(new RowDelegate.Model("LIST_ID_STORED_METHOD_THREE_DS", new RowDelegate.Model.MainImage.Image40(((aze.b) aVar).c(storedMethod), null, null, false, null, false, 60), new TextClause(storedMethod.getF60522c(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 2, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.ds_verification_screen_topup_subtitle, u.c(new MoneyClause(amount, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, storedMethod, null, 0, 0, 0, 0, 532675528));
            }
            if (!(topupMethod instanceof TopupMethod.OtherMethod)) {
                return f0.f322471a;
            }
            TopupMethod.OtherMethod otherMethod = (TopupMethod.OtherMethod) topupMethod;
            dj0.d amount2 = insufficientFunds.f60531a;
            Intrinsics.checkNotNullParameter(otherMethod, "otherMethod");
            Intrinsics.checkNotNullParameter(amount2, "amount");
            Image imageB = ((aze.b) aVar).b(otherMethod);
            if (imageB == null) {
                imageB = sze.d.b(otherMethod.f60440a);
            }
            return u.c(new RowDelegate.Model("LIST_ID_OTHER_METHOD_THREE_DS", new RowDelegate.Model.MainImage.Image40(imageB, null, null, false, null, false, 60), new TextClause(otherMethod.f60441b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, new TextLocalisedClause(com.revolut.feature.cards_core.R$string.ds_verification_screen_topup_subtitle, u.c(new MoneyClause(amount2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, new tf(new j(new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246))), false, null, false, null, null, null, null, null, null, otherMethod, null, 0, 0, 0, 0, 532675544));
        }
        aim.e eVarB = u.b();
        AddMoneyMethod.MoveMoney moveMoney = (AddMoneyMethod.MoveMoney) method;
        BalanceWrapper balanceWrapper = moveMoney.f65825a;
        String str = balanceWrapper.f99404a;
        boolean z = balanceWrapper instanceof BalanceWrapper.PocketBalanceWrapper;
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(z ? new CurrencyImage(((BalanceWrapper.PocketBalanceWrapper) balanceWrapper).i.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14) : balanceWrapper instanceof BalanceWrapper.SavingsBalanceWrapper ? ((BalanceWrapper.SavingsBalanceWrapper) balanceWrapper).f99439h.f86461b : LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), null, null, false, null, false, 60);
        int i = r0.d[balanceWrapper.getF99407g().ordinal()];
        Integer numValueOf = (i == 1 || i == 2 || i == 3) ? Integer.valueOf(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_joint_title) : i != 4 ? null : Integer.valueOf(com.revolut.retail.feature.balance.picker.api.R$string.payments_balance_picker_section_pro_title);
        TextLocalisedClause textLocalisedClause = numValueOf != null ? new TextLocalisedClause(numValueOf.intValue(), null, null, 14) : null;
        TextClause textClause = new TextClause(balanceWrapper.getE(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        if (textLocalisedClause != null) {
            List listK = v.k(textLocalisedClause, textClause);
            m70.a.a(t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            compositeClause = textClause;
        }
        eVarB.add(new RowDelegate.Model(str, image40, compositeClause, null, 0, new TextLocalisedClause(z ? com.revolut.feature.cards_core.R$string.ds_verification_screen_move_money_subtitle_account : com.revolut.feature.cards_core.R$string.ds_verification_screen_move_money_subtitle_pocket, u.c(new MoneyClause(insufficientFunds.f60531a, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), null, null, 0, new tf(6, new ResourceImage(R$drawable.uikit_icn_24_chevron_right, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), false), false, null, false, null, null, null, null, null, null, moveMoney, null, 0, 0, 0, 0, 532675544));
        OrderQuote orderQuote = (OrderQuote) data.getContent();
        if (orderQuote != null) {
            Amount amount3 = orderQuote.d;
            if (amount3 == null) {
                amount3 = orderQuote.f104754c;
            }
            Clause moneyClause = new MoneyClause(l4i.a.b(amount3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.three_ds_move_money_total_exchanged, null, null, 14);
            if (!orderQuote.f104755g.f104731a.f104723b.isEmpty()) {
                moneyClause = new TextLocalisedClause(com.revolut.feature.cards_core.R$string.ds_verification_screen_move_money_total_exchanged_with_fees, u.c(moneyClause), null, 12);
            }
            eVarB.add(new CellDetailsActionDelegate.Model("MOVE_MONEY_EXCHANGE_AMOUNT_LIST_ID", textLocalisedClause2, 0, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), moneyClause, null, false, false, null, null, null, 0, 0, 0, 0, 4194276));
        }
        return u.a(eVarB);
    }

    private final Object m(Object obj2, Object obj3, Object obj4) {
        Data data = (Data) this.d;
        j4h.p pVar = (j4h.p) this.f387b;
        j4h.e eVar = (j4h.e) this.f388c;
        nel.a0 instrumentWithTicker = (nel.a0) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(instrumentWithTicker, "instrumentWithTicker");
        return (BaseChatBubbleDelegate.BaseModel) iii.c.f(data, new j4h.m(pVar, eVar, instrumentWithTicker), new n(pVar, eVar, 0), new z(pVar, eVar, instrumentWithTicker, 19));
    }

    private final Object n(Object obj2, Object obj3, Object obj4) {
        Iterable iterableE0;
        com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b bVar = (com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b) this.f387b;
        jck.o oVar = (jck.o) this.f388c;
        jck.m mVar = (jck.m) this.d;
        Pair pair = (Pair) obj2;
        ((Boolean) obj3).getClass();
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        List list = (List) pair.f186385a;
        List list2 = (List) pair.f186386b;
        List list3 = (List) iii.c.f(oVar.f172862b, new jcj.n(12), new j7b.m(15), new jb8.b(bVar, 1));
        if (list.isEmpty() && list2.isEmpty()) {
            iterableE0 = com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.picker.b.a(oVar);
        } else {
            Data data = mVar.e;
            Data data2 = mVar.f172860c;
            List list4 = (List) iii.c.f(t1.t(data, data2), new jcj.n(11), new j7b.m(19), new jb8.b(bVar, 2));
            List list5 = (List) iii.c.f(t1.u(mVar.f172859b, data2, mVar.f), new jcj.n(9), new j7b.m(16), new j75.i(bVar, 4));
            List listE = bVar.e(list);
            iterableE0 = d0.E0(listE, d0.E0(list5, list4));
        }
        return d0.E0(iterableE0, list3);
    }

    private final Object o(Object obj2, Object obj3, Object obj4) {
        kwg.l lVar = (kwg.l) this.f387b;
        iwg.a aVar = (iwg.a) this.f388c;
        eel.c cVar = (eel.c) this.d;
        String userId = (String) obj2;
        xi0.b currency = (xi0.b) obj4;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return rd0.e.c(nim.a.v(lVar.f190365s.c(userId, kwg.l.a(aVar), (String) obj3, cVar, currency, w4l.i.f294643c), new kwg.i(lVar, 0)), kotlin.coroutines.g.f186406a);
    }

    private final Object p(Object obj2, Object obj3, Object obj4) {
        kwg.l lVar = (kwg.l) this.f387b;
        a3 sector = (a3) this.f388c;
        WidgetisedAnalyticsType widgetisedAnalyticsType = (WidgetisedAnalyticsType) this.d;
        String userId = (String) obj2;
        xi0.b currency = (xi0.b) obj3;
        iwg.a analyticsProductType = (iwg.a) obj4;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        o0 o0Var = lVar.i;
        iwg.a analyticsProductType2 = kwg.l.a(analyticsProductType);
        String strB = kwg.l.b(widgetisedAnalyticsType);
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType2, "analyticsProductType");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return nim.a.w(o0Var.d.f(new y1(userId, analyticsProductType2, sector, strB, currency), true), new kp0.q(analyticsProductType, new ku1.f0(18), 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x0523  */
    /* JADX WARN: Type inference failed for: r5v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 3414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0i.a.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ a(Data data, j4h.p pVar, j4h.e eVar) {
        this.f386a = 25;
        this.d = data;
        this.f387b = pVar;
        this.f388c = eVar;
    }

    public /* synthetic */ a(Object obj2, int i, Object obj3, Object obj4) {
        this.f386a = i;
        this.f387b = obj2;
        this.f388c = obj3;
        this.d = obj4;
    }
}
