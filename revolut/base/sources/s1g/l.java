package s1g;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.travel.experiences.api.R$plurals;
import com.revolut.feature.travel.experiences.api.R$string;
import com.revolut.feature.travel.experiences.impl.ui.screen.cancellation.TravelExperiencesCancellationScreenContract$Mode;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationCondition;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationWindow;
import ip0.o40;
import ip0.r40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.joda.time.DateTime;
import org.joda.time.Period;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1g.c f259141a;

    public l(b1g.c dateFormatter) {
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        this.f259141a = dateFormatter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [qv0.i, qv0.o] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v14, types: [qv0.i, qv0.o] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    @Override // jki.p
    public final m a(jki.i iVar) {
        TextLocalisedClause textLocalisedClause;
        int i;
        TextLocalisedClause textLocalisedClause2;
        Clause clause;
        TextLocalisedQuantityClause textLocalisedQuantityClause;
        TextLocalisedQuantityClause textLocalisedQuantityClause2;
        List listC;
        Object next;
        RowDelegate.Model model;
        Object next2;
        RowDelegate.Model model2;
        g domainState = (g) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        s0 s0Var = new s0(3);
        TravelExperiencesCancellationScreenContract$Mode travelExperiencesCancellationScreenContract$Mode = domainState.f259135a;
        TravelExperienceCancellationPolicy travelExperienceCancellationPolicyA = travelExperiencesCancellationScreenContract$Mode.a();
        Intrinsics.checkNotNullParameter(travelExperienceCancellationPolicyA, "<this>");
        List listB = travelExperienceCancellationPolicyA.b();
        int i2 = 12;
        int i3 = 14;
        TextLocalisedClause textLocalisedClause3 = null;
        if ((listB instanceof Collection) && listB.isEmpty()) {
            TextLocalisedClause textLocalisedClause4 = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund_title, null, null, 14);
            TextLocalisedClause textLocalisedClause5 = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund, null, null, 14);
            int i5 = R$attr.uikit_colorRed;
            o40 o40Var = new o40(false);
            int i6 = R$attr.uikit_dp16;
            r40 r40Var = new r40("CANCELLATION_POLICY_ITEM_ID", null, textLocalisedClause4, textLocalisedClause5, null, null, i5, false, o40Var, i6, i6, 0, null, 14514);
            yp0.b.l(r40Var, 0, 0, 0, 0, null, false, 63);
            listC = u.c(r40Var);
        } else {
            Iterator it8 = listB.iterator();
            while (it8.hasNext()) {
                if (c6d.b.z((TravelExperienceCancellationWindow) it8.next()) != x3g.b.NO_REFUND) {
                    List<TravelExperienceCancellationWindow> listB2 = travelExperienceCancellationPolicyA.b();
                    ArrayList arrayList = new ArrayList(w.t(listB2, 10));
                    for (TravelExperienceCancellationWindow travelExperienceCancellationWindow : listB2) {
                        String strQ = j6.a.q("CANCELLATION_POLICY_ITEM_ID", travelExperienceCancellationWindow.getF93190c());
                        x3g.b bVarZ = c6d.b.z(travelExperienceCancellationWindow);
                        int[] iArr = k.f259140a;
                        int i21 = iArr[bVarZ.ordinal()];
                        if (i21 == 1) {
                            textLocalisedClause = new TextLocalisedClause(R$string.experiences_cancellation_policy_free_cancellation_title, null, null, i3);
                        } else if (i21 == 2) {
                            textLocalisedClause = new TextLocalisedClause(R$string.experience_cancellation_policy_partially_refundable_title, null, null, i3);
                        } else {
                            if (i21 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textLocalisedClause = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund_title, null, null, i3);
                        }
                        TextLocalisedClause textLocalisedClause6 = textLocalisedClause;
                        int i22 = iArr[c6d.b.z(travelExperienceCancellationWindow).ordinal()];
                        if (i22 == 1) {
                            i = R$attr.uikit_colorGreen;
                        } else if (i22 == 2) {
                            i = R$attr.uikit_colorOrange;
                        } else {
                            if (i22 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = R$attr.uikit_colorRed;
                        }
                        int i32 = i;
                        if (travelExperienceCancellationWindow instanceof TravelExperienceCancellationWindow.Experience) {
                            TravelExperienceCancellationWindow.Experience experience = (TravelExperienceCancellationWindow.Experience) travelExperienceCancellationWindow;
                            Period period = experience.f93189b;
                            Period period2 = experience.f93188a;
                            int i33 = iArr[c6d.b.z(experience).ordinal()];
                            if (i33 != 1) {
                                if (i33 != 2) {
                                    if (i33 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    if (period2 != null) {
                                        int hours = period2.toStandardHours().getHours();
                                        if (hours < 0 || hours >= 25) {
                                            textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.experiences_cancellation_policy_no_refund_description_days, Integer.valueOf(period2.toStandardDays().getDays()), u.c(Integer.valueOf(period2.toStandardDays().getDays())), (Style) null, 24);
                                            clause = textLocalisedQuantityClause;
                                        } else {
                                            textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.experiences_cancellation_policy_no_refund_description_hours, Integer.valueOf(hours), u.c(Integer.valueOf(hours)), (Style) null, 24);
                                            clause = textLocalisedQuantityClause2;
                                        }
                                    }
                                } else if (period2 != null) {
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_cancellation_policy_partially_refundable_description, v.k(Integer.valueOf(period2.toStandardDays().getDays()), Integer.valueOf(period.toStandardDays().getDays())), null, i2);
                                    clause = textLocalisedClause2;
                                }
                                clause = null;
                            } else {
                                int hours2 = period.toStandardHours().getHours();
                                if (hours2 < 0 || hours2 >= 25) {
                                    textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.experiences_cancellation_policy_free_cancellation_description_days, Integer.valueOf(period.toStandardDays().getDays()), u.c(Integer.valueOf(period.toStandardDays().getDays())), (Style) null, 24);
                                    clause = textLocalisedQuantityClause;
                                } else {
                                    textLocalisedQuantityClause2 = new TextLocalisedQuantityClause(R$plurals.experiences_cancellation_policy_free_cancellation_description_hours, Integer.valueOf(hours2), u.c(Integer.valueOf(hours2)), (Style) null, 24);
                                    clause = textLocalisedQuantityClause2;
                                }
                            }
                        } else {
                            if (travelExperienceCancellationWindow instanceof TravelExperienceCancellationWindow.Booking) {
                                TravelExperienceCancellationWindow.Booking booking = (TravelExperienceCancellationWindow.Booking) travelExperienceCancellationWindow;
                                DateTime dateTime = booking.f93186b;
                                DateTime dateTime2 = booking.f93185a;
                                int i43 = iArr[c6d.b.z(booking).ordinal()];
                                b1g.c cVar = this.f259141a;
                                if (i43 == 1) {
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_cancellation_policy_free_cancellation_days_description, u.c(new TextClause(cVar.b(dateTime), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                } else if (i43 == 2) {
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_cancellation_policy_partially_refund_days_description, v.k(booking.f93187c, new TextClause(cVar.b(dateTime2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(cVar.b(dateTime), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                } else {
                                    if (i43 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    textLocalisedClause2 = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund_days_description, u.c(new TextClause(cVar.b(dateTime2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12);
                                }
                                clause = textLocalisedClause2;
                            }
                            clause = null;
                        }
                        arrayList.add(new r40(strQ, null, textLocalisedClause6, clause, null, null, i32, false, new o40(false), 0, 0, 0, null, 16050));
                        i2 = 12;
                        i3 = 14;
                    }
                    ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                    int i59 = 0;
                    for (?? r62 : arrayList) {
                        int i66 = i59 + 1;
                        if (i59 < 0) {
                            v.s();
                            throw null;
                        }
                        if (i59 == 0) {
                            r62 = (qv0.i) r62;
                            r62.g(R$attr.uikit_dp16);
                        }
                        arrayList2.add(r62);
                        i59 = i66;
                    }
                    int iJ = v.j(arrayList2);
                    ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                    int i74 = 0;
                    for (?? r64 : arrayList2) {
                        int i92 = i74 + 1;
                        if (i74 < 0) {
                            v.s();
                            throw null;
                        }
                        if (i74 == iJ) {
                            r64 = (qv0.i) r64;
                            r64.o(R$attr.uikit_dp16);
                        }
                        arrayList3.add(r64);
                        i74 = i92;
                    }
                    yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                    listC = arrayList3;
                }
            }
            TextLocalisedClause textLocalisedClause42 = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund_title, null, null, 14);
            TextLocalisedClause textLocalisedClause52 = new TextLocalisedClause(R$string.experiences_cancellation_policy_no_refund, null, null, 14);
            int i510 = R$attr.uikit_colorRed;
            o40 o40Var2 = new o40(false);
            int i610 = R$attr.uikit_dp16;
            r40 r40Var2 = new r40("CANCELLATION_POLICY_ITEM_ID", null, textLocalisedClause42, textLocalisedClause52, null, null, i510, false, o40Var2, i610, i610, 0, null, 14514);
            yp0.b.l(r40Var2, 0, 0, 0, 0, null, false, 63);
            listC = u.c(r40Var2);
        }
        s0Var.b(listC.toArray(new qv0.i[0]));
        Iterator it9 = travelExperiencesCancellationScreenContract$Mode.a().a().iterator();
        while (true) {
            if (!it9.hasNext()) {
                next = null;
                break;
            }
            next = it9.next();
            if (((TravelExperienceCancellationCondition) next).f93177a == x3g.a.CANCELLABLE_IF_BAD_WEATHER) {
                break;
            }
        }
        TravelExperienceCancellationCondition travelExperienceCancellationCondition = (TravelExperienceCancellationCondition) next;
        if (travelExperienceCancellationCondition != null) {
            RowDelegate.Model model3 = new RowDelegate.Model("WEATHER_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_cloud, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.experiences_cancellation_policy_weather_condition_title, null, null, 14), new TextClause(travelExperienceCancellationCondition.f93178b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            model = model3;
        } else {
            model = null;
        }
        s0Var.a(model);
        Iterator it10 = travelExperiencesCancellationScreenContract$Mode.a().a().iterator();
        while (true) {
            if (!it10.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it10.next();
            if (((TravelExperienceCancellationCondition) next2).f93177a == x3g.a.CANCELLABLE_IF_MIN_VISITORS_NOT_MET) {
                break;
            }
        }
        TravelExperienceCancellationCondition travelExperienceCancellationCondition2 = (TravelExperienceCancellationCondition) next2;
        if (travelExperienceCancellationCondition2 != null) {
            RowDelegate.Model model4 = new RowDelegate.Model("MIN_TRAVELERS_ITEM_ID", new ResourceImage(R$drawable.uikit_icn_24_people, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, new TextLocalisedClause(R$string.experiences_cancellation_policy_travellers_condition_title, null, null, 14), new TextClause(travelExperienceCancellationCondition2.f93178b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
            yp0.b.l(model4, 0, 0, 0, 0, null, false, 63);
            model2 = model4;
        } else {
            model2 = null;
        }
        s0Var.a(model2);
        ArrayList arrayList4 = s0Var.f186433a;
        List listM = v.m(arrayList4.toArray(new qv0.i[arrayList4.size()]));
        TravelExperienceCancellationPolicy travelExperienceCancellationPolicyA2 = travelExperiencesCancellationScreenContract$Mode.a();
        if (travelExperienceCancellationPolicyA2 instanceof TravelExperienceCancellationPolicy.Booking) {
            ArrayList arrayList5 = ((TravelExperienceCancellationPolicy.Booking) travelExperienceCancellationPolicyA2).d;
            String displayName = !arrayList5.isEmpty() ? ((TravelExperienceCancellationWindow.Booking) d0.b0(arrayList5)).f93185a.getZone().toTimeZone().getDisplayName() : null;
            if (displayName != null) {
                textLocalisedClause3 = new TextLocalisedClause(R$string.experiences_details_cancellation_policy_description, u.c(displayName), null, 12);
            }
        }
        return new i(textLocalisedClause3, listM, travelExperiencesCancellationScreenContract$Mode instanceof TravelExperiencesCancellationScreenContract$Mode.BookingCancellation);
    }
}
