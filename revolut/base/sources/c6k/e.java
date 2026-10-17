package c6k;

import aw0.o9;
import aw0.t0;
import aw0.u0;
import com.google.common.collect.ImmutableMap;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.r40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalTime;
import tof.a2;
import tof.b2;
import tof.c2;
import tof.d2;
import tof.e2;
import tof.f2;
import tof.g2;
import tof.h2;
import tof.j4;
import tof.v2;
import tof.x4;
import tof.y1;
import tof.y4;
import tof.z1;
import tof.z4;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements c {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f21815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f21816b;

    public e(ImmutableMap stepMappers, l80.e dateProvider, a paymentTrackingDateFormatter) {
        Intrinsics.checkNotNullParameter(stepMappers, "stepMappers");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(paymentTrackingDateFormatter, "paymentTrackingDateFormatter");
        this.f21815a = stepMappers;
        this.f21816b = dateProvider;
    }

    public static List d(TimeClause timeClause, ArrayList arrayList, int i, boolean z) {
        if (i < 0) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i2 = 0;
        for (Object obj2 : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            r40 r40VarE = (r40) obj2;
            if ((i2 == i && z) || i2 > i) {
                r40VarE = r40.e(r40VarE, timeClause, 0, 524285);
            }
            arrayList2.add(r40VarE);
            i2 = i3;
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final List b(List trackingInfo, j4 j4Var, v2 v2Var, z61.a aVar, z4 transactionExternalShare) {
        int i;
        boolean z;
        Clause compositeClause;
        boolean z3;
        x4 x4Var;
        ArrayList arrayList;
        List listD;
        r40 r40VarD;
        ?? arrayList2;
        TimeClause timeClause;
        DateTime dateTime;
        int i2;
        r40 r40VarD2;
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
        Intrinsics.checkNotNullParameter(transactionExternalShare, "transactionExternalShare");
        if (trackingInfo.isEmpty()) {
            return f0.f322471a;
        }
        List list = trackingInfo;
        boolean z4 = list instanceof Collection;
        if (z4 && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it8 = list.iterator();
            i = 0;
            while (it8.hasNext()) {
                if (((h2) it8.next()).h() == f2.COMPLETED && (i = i + 1) < 0) {
                    v.r();
                    throw null;
                }
            }
        }
        boolean z6 = true;
        if (z4 && list.isEmpty()) {
            z = false;
        } else {
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                if (((h2) it9.next()).h() == f2.FAILED) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        boolean z11 = v2Var == v2.DECLINED;
        int size = trackingInfo.size();
        t0 t0Var = new t0((Clause) (z11 ? new TextLocalisedClause(R$string.bank_transfer_tracker_title_declined, null, null, 14) : z ? new TextLocalisedClause(R$string.bank_transfer_tracker_title_failed, null, null, 14) : i == size ? new TextLocalisedClause(R$string.bank_transfer_tracker_title_completed, null, null, 14) : new TextLocalisedClause(R$string.bank_transfer_tracker_title_pending_steps, v.k(Integer.valueOf(i + 1), Integer.valueOf(size)), null, 12)), (Image) null, 0, false, 30);
        Float fValueOf = Float.valueOf(16.0f);
        y4 y4Var = y4.f273180a;
        if (transactionExternalShare.equals(y4Var)) {
            m70.a.c(kotlin.jvm.internal.t0.f186434a);
            compositeClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            if (!(transactionExternalShare instanceof x4)) {
                throw new NoWhenBranchMatchedException();
            }
            List listK = v.k(new ImageClause(R$drawable.uikit_icn_24_share_ios, Integer.valueOf(R$attr.uikit_colorAccent), fValueOf, fValueOf, 16), new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_share, null, null, 14));
            m70.a.t(kotlin.jvm.internal.t0.f186434a);
            compositeClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(30, (Integer) null, (Object) null, "SHARE_LINK_CLICK_ID", false), null, 8);
        }
        if (transactionExternalShare.equals(y4Var)) {
            z3 = false;
        } else {
            if (!(transactionExternalShare instanceof x4)) {
                throw new NoWhenBranchMatchedException();
            }
            z3 = true;
        }
        if (transactionExternalShare.equals(y4Var)) {
            x4Var = null;
        } else {
            if (!(transactionExternalShare instanceof x4)) {
                throw new NoWhenBranchMatchedException();
            }
            x4Var = (x4) transactionExternalShare;
        }
        List listC = u.c(new CellDetailsDelegate.Model("VIEW_ID_TRACKER_HEADER", t0Var, compositeClause, null, x4Var, null, u0.SMALL, 0, null, z3, false, null, null, 30392));
        if (!z) {
            if (i != trackingInfo.size()) {
                List list2 = trackingInfo;
                arrayList = new ArrayList(w.t(list2, 10));
                int i3 = 0;
                boolean z12 = false;
                for (Object obj2 : list2) {
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        v.s();
                        throw null;
                    }
                    h2 step = (h2) obj2;
                    g gVarC = c(step);
                    f2 f2VarH = step.h();
                    f2 f2Var = f2.PENDING;
                    if (f2VarH == f2Var && !z12) {
                        int i6 = i3 - 1;
                        h2 h2Var = i6 >= 0 ? (h2) trackingInfo.get(i6) : null;
                        Intrinsics.checkNotNullParameter(step, "step");
                        r40VarD = gVarC.e(step, h2Var, R$attr.uikit_colorBlue, v2Var);
                        z12 = true;
                    } else if (step.h() == f2Var) {
                        Intrinsics.checkNotNullParameter(step, "step");
                        r40VarD = gVarC.d(step, R$attr.uikit_colorGrey10, null);
                    } else {
                        Intrinsics.checkNotNullParameter(step, "step");
                        r40VarD = gVarC.d(step, R$attr.uikit_colorBlue, v2Var);
                    }
                    arrayList.add(r40VarD);
                    i3 = i5;
                }
                Iterator it10 = trackingInfo.iterator();
                int i21 = 0;
                while (true) {
                    if (!it10.hasNext()) {
                        i21 = -1;
                        break;
                    }
                    h2 h2Var2 = (h2) it10.next();
                    DateTime dateTimeH = foh.i.h(h2Var2, h2Var2 instanceof g2);
                    DateTime dateTimeWithTimeAtStartOfDay = dateTimeH != null ? dateTimeH.withTimeAtStartOfDay() : null;
                    if (h2Var2.h() == f2.PENDING && dateTimeWithTimeAtStartOfDay != null && ((l80.f) this.f21816b).g().toDateTime(DateTimeZone.UTC).withTimeAtStartOfDay().isAfter(dateTimeWithTimeAtStartOfDay)) {
                        break;
                    }
                    i21++;
                }
                if (i21 >= 0) {
                    listD = d(null, arrayList, i21, true);
                    arrayList2 = listD;
                }
                arrayList2 = arrayList;
                break;
            }
            List<h2> list3 = trackingInfo;
            arrayList = new ArrayList(w.t(list3, 10));
            for (h2 h2Var3 : list3) {
                arrayList.add(c(h2Var3).a(h2Var3, v2Var));
            }
            h2 h2Var4 = (h2) d0.d0(trackingInfo);
            r40 r40Var = (r40) d0.d0(arrayList);
            Clause clause = r40Var != null ? r40Var.f166105b : null;
            if (h2Var4 != null && clause != null && !arrayList.isEmpty()) {
                if (!arrayList.isEmpty()) {
                    Iterator it11 = arrayList.iterator();
                    while (it11.hasNext()) {
                        if (!Intrinsics.f(((r40) it11.next()).f166105b, clause)) {
                        }
                    }
                }
                DateTime dateTimeH2 = foh.i.h(h2Var4, false);
                LocalTime time = (dateTimeH2 == null || (dateTime = dateTimeH2.toDateTime(DateTimeZone.getDefault())) == null) ? null : dateTime.toLocalTime();
                if (time != null) {
                    Intrinsics.checkNotNullParameter(time, "time");
                    timeClause = new TimeClause(time.toDateTimeToday().getMillis(), TimeClause.Format.TimeDefault.f57977b, null, null, 12);
                } else {
                    timeClause = null;
                }
                listD = d(timeClause, arrayList, 0, false);
                arrayList2 = listD;
            }
            arrayList2 = arrayList;
            break;
        }
        List<h2> list4 = trackingInfo;
        arrayList2 = new ArrayList(w.t(list4, 10));
        boolean z29 = false;
        for (h2 step2 : list4) {
            g gVarC2 = c(step2);
            f2 f2VarH2 = step2.h();
            f2 f2Var2 = f2.FAILED;
            if (f2VarH2 == f2Var2 && z29) {
                Intrinsics.checkNotNullParameter(step2, "step");
                z6 = z29;
                r40VarD2 = gVarC2.d(step2, R$attr.uikit_colorGrey10, null);
            } else if (step2.h() == f2Var2) {
                r40VarD2 = gVarC2.b(step2, j4Var, v2Var, aVar);
            } else {
                Intrinsics.checkNotNullParameter(step2, "step");
                boolean z31 = z29;
                r40VarD2 = gVarC2.d(step2, R$attr.uikit_colorRed, null);
                z6 = z31;
            }
            arrayList2.add(r40VarD2);
            z29 = z6;
            z6 = true;
        }
        Iterator it12 = trackingInfo.iterator();
        int i22 = 0;
        while (true) {
            if (!it12.hasNext()) {
                i2 = -1;
                break;
            }
            if (((h2) it12.next()).h() == f2.FAILED) {
                i2 = i22;
                break;
            }
            i22++;
        }
        if (i2 >= 0) {
            arrayList2 = d(null, arrayList2, i2, false);
        }
        int iJ = v.j(arrayList2);
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        int i32 = 0;
        for (Object objE : arrayList2) {
            int i33 = i32 + 1;
            if (i32 < 0) {
                v.s();
                throw null;
            }
            if (i32 == iJ) {
                objE = r40.e((r40) objE, null, R$attr.uikit_dp16, 491519);
            }
            arrayList3.add(objE);
            i32 = i33;
        }
        List listO = i2b.a.o(listC, arrayList3);
        yp0.b.k(listO, 0, 0, 0, 0, 31);
        return listO;
    }

    public final g c(h2 h2Var) {
        g gVar;
        boolean z = h2Var instanceof y1;
        Map map = this.f21815a;
        if (z) {
            gVar = (g) map.get("KEY_STEP_CREDIT");
        } else if (h2Var instanceof z1) {
            gVar = (g) map.get("KEY_STEP_DELIVERY");
        } else if (h2Var instanceof e2) {
            gVar = (g) map.get("KEY_STEP_PROCESSING");
        } else if (h2Var instanceof g2) {
            gVar = (g) map.get("KEY_STEP_VERIFICATION");
        } else if (h2Var instanceof d2) {
            gVar = (g) map.get("KEY_STEP_LINK_CREATED");
        } else if (h2Var instanceof c2) {
            gVar = (g) map.get("KEY_STEP_LINK_CLAIMED");
        } else if (h2Var instanceof a2) {
            gVar = (g) map.get("KEY_STEP_FUNDS_RECEIVED");
        } else {
            if (!(h2Var instanceof b2)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = (g) map.get("KEY_STEP_FUNDS_RETURNED");
        }
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("No mapper found for step `" + h2Var + "`");
    }
}
