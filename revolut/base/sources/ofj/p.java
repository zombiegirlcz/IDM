package ofj;

import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTerms;
import com.revolut.retail.feature.esim.api.model.EsimAutoRenewalTermsItem;
import com.revolut.retail.feature.esim.api.model.EsimCoverage;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimInfoBottomSheetData;
import com.revolut.retail.feature.esim.api.model.EsimMigrationFromDataPlansOnly;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPerk;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingProgress;
import com.revolut.retail.feature.esim.api.model.EsimPortingStep;
import com.revolut.retail.feature.esim.api.model.EsimProfileEntry;
import com.revolut.retail.feature.esim.api.model.EsimProfileLock;
import com.revolut.retail.feature.esim.api.model.EsimProfileScope;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionNextPlan;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPacPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPortOutOptIn;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumberStacPortOutEligibility;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPlanChange;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails;
import dej.c2;
import dej.c3;
import dej.d2;
import dej.e2;
import dej.f1;
import dej.f2;
import dej.f3;
import dej.g2;
import dej.h1;
import dej.h2;
import dej.i3;
import dej.j2;
import dej.k1;
import dej.k3;
import dej.l2;
import dej.m2;
import dej.n2;
import dej.n3;
import dej.o2;
import dej.p2;
import dej.q2;
import dej.t1;
import dej.u2;
import dej.v2;
import dej.w2;
import dej.x2;
import dej.y2;
import dej.z1;
import dej.z2;
import java.time.Instant;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.a3;
import kfj.a4;
import kfj.c4;
import kfj.d4;
import kfj.e0;
import kfj.e3;
import kfj.e4;
import kfj.f4;
import kfj.g3;
import kfj.h1;
import kfj.i1;
import kfj.i4;
import kfj.j4;
import kfj.k2;
import kfj.k4;
import kfj.l0;
import kfj.l3;
import kfj.m3;
import kfj.n4;
import kfj.o3;
import kfj.p3;
import kfj.q3;
import kfj.q4;
import kfj.r3;
import kfj.r4;
import kfj.s2;
import kfj.s3;
import kfj.t3;
import kfj.t4;
import kfj.u3;
import kfj.u4;
import kfj.v3;
import kfj.v4;
import kfj.w3;
import kfj.x1;
import kfj.x3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import le.u1;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f224901a = r0.k(new Pair("NON_ELIGIBLE", f3.NON_ELIGIBLE), new Pair("ELIGIBLE", f3.ELIGIBLE), new Pair("PENDING", f3.PENDING), new Pair("COMPLETED", f3.COMPLETED), new Pair("UNKNOWN", f3.UNKNOWN));

    public static final EsimPhoneNumberPortingProgress.Action a(i1 i1Var, String str, String str2, String str3) {
        EsimPhoneNumberPortingProgress.Action.Data createPorting;
        Intrinsics.checkNotNullParameter(i1Var, "<this>");
        String label = i1Var.getLabel();
        String url2 = i1Var.getUrl();
        if (url2 != null) {
            createPorting = new EsimPhoneNumberPortingProgress.Action.Data.Url(url2);
        } else {
            h1 code = i1Var.getCode();
            int i = code == null ? -1 : o.f224900a[code.ordinal()];
            if (i == -1) {
                return null;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                if (str == null || str2 == null || str3 == null) {
                    return null;
                }
                createPorting = new EsimPhoneNumberPortingProgress.Action.Data.UpdatePorting(str, str3, str2);
            } else {
                if (str == null || str2 == null) {
                    return null;
                }
                createPorting = new EsimPhoneNumberPortingProgress.Action.Data.CreatePorting(str, str2);
            }
        }
        return new EsimPhoneNumberPortingProgress.Action(label, createPorting);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final EsimSubscriptionPhoneNumber b(a4 a4Var, String str, String str2) {
        z2 z2Var;
        EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility;
        EsimSubscriptionPhoneNumberStacPortOutEligibility esimSubscriptionPhoneNumberStacPortOutEligibility;
        Intrinsics.checkNotNullParameter(a4Var, "<this>");
        String id10 = a4Var.getId();
        String state = a4Var.getState();
        z2[] z2VarArrValues = z2.values();
        int length = z2VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z2Var = null;
                break;
            }
            z2Var = z2VarArrValues[i];
            if (a0.z(z2Var.name(), state, true)) {
                break;
            }
            i++;
        }
        if (z2Var == null) {
            z2Var = z2.UNKNOWN;
        }
        z2 z2Var2 = z2Var;
        String phoneNumber = a4Var.getPhoneNumber();
        boolean primary = a4Var.getPrimary();
        boolean temporary = a4Var.getTemporary();
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = null;
        String label = a4Var.getLabel();
        Long suspensionDate = a4Var.getSuspensionDate();
        Instant instantOfEpochMilli = suspensionDate != null ? Instant.ofEpochMilli(suspensionDate.longValue()) : null;
        Long terminationDate = a4Var.getTerminationDate();
        Instant instantOfEpochMilli2 = terminationDate != null ? Instant.ofEpochMilli(terminationDate.longValue()) : null;
        f4 porting = a4Var.getPorting();
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPortingC = porting != null ? c(porting, str, str2, a4Var.getId()) : null;
        d4 portOutEligibility = a4Var.getPortOutEligibility();
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility2 = esimSubscriptionPhoneNumberPortOutEligibility;
        if (portOutEligibility != null) {
            Intrinsics.checkNotNullParameter(portOutEligibility, "<this>");
            c4 pac2 = portOutEligibility.getPac();
            if (pac2 != null) {
                Intrinsics.checkNotNullParameter(pac2, "<this>");
                esimSubscriptionPhoneNumberPacPortOutEligibility = new EsimSubscriptionPhoneNumberPacPortOutEligibility(pac2.getRequestable());
            } else {
                esimSubscriptionPhoneNumberPacPortOutEligibility = null;
            }
            i4 stac = portOutEligibility.getStac();
            if (stac != null) {
                Intrinsics.checkNotNullParameter(stac, "<this>");
                esimSubscriptionPhoneNumberStacPortOutEligibility = new EsimSubscriptionPhoneNumberStacPortOutEligibility(stac.getRequestable());
            } else {
                esimSubscriptionPhoneNumberStacPortOutEligibility = null;
            }
            e4 portOutOptIn = portOutEligibility.getPortOutOptIn();
            EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn = esimSubscriptionPhoneNumberPortOutEligibility;
            if (portOutOptIn != null) {
                Intrinsics.checkNotNullParameter(portOutOptIn, "<this>");
                boolean changeable = portOutOptIn.getChangeable();
                boolean enabled = portOutOptIn.getEnabled();
                Long expiresAt = portOutOptIn.getExpiresAt();
                esimSubscriptionPhoneNumberPortOutOptIn = new EsimSubscriptionPhoneNumberPortOutOptIn(changeable, enabled, expiresAt != null ? Instant.ofEpochMilli(expiresAt.longValue()) : null);
            }
            esimSubscriptionPhoneNumberPortOutEligibility2 = new EsimSubscriptionPhoneNumberPortOutEligibility(esimSubscriptionPhoneNumberPacPortOutEligibility, esimSubscriptionPhoneNumberStacPortOutEligibility, esimSubscriptionPhoneNumberPortOutOptIn);
        }
        return new EsimSubscriptionPhoneNumber(id10, z2Var2, phoneNumber, primary, temporary, label, instantOfEpochMilli, instantOfEpochMilli2, esimSubscriptionPhoneNumberPortingC, esimSubscriptionPhoneNumberPortOutEligibility2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    public static final EsimSubscriptionPhoneNumberPorting c(f4 f4Var, String str, String str2, String str3) {
        x2 x2Var;
        y2 y2Var;
        EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress;
        ArrayList arrayList;
        ?? arrayList2;
        Intrinsics.checkNotNullParameter(f4Var, "<this>");
        String id10 = f4Var.getId();
        String direction = f4Var.getDirection();
        x2[] x2VarArrValues = x2.values();
        int length = x2VarArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                x2Var = null;
                break;
            }
            x2Var = x2VarArrValues[i];
            if (a0.z(x2Var.name(), direction, true)) {
                break;
            }
            i++;
        }
        if (x2Var == null) {
            x2Var = x2.UNKNOWN;
        }
        x2 x2Var2 = x2Var;
        boolean cancellableUntilDate = f4Var.getCancellableUntilDate();
        Long cancellationDate = f4Var.getCancellationDate();
        Instant instantOfEpochMilli = cancellationDate != null ? Instant.ofEpochMilli(cancellationDate.longValue()) : null;
        Long scheduledDate = f4Var.getScheduledDate();
        Instant instantOfEpochMilli2 = scheduledDate != null ? Instant.ofEpochMilli(scheduledDate.longValue()) : null;
        Long completionDate = f4Var.getCompletionDate();
        Instant instantOfEpochMilli3 = completionDate != null ? Instant.ofEpochMilli(completionDate.longValue()) : null;
        String state = f4Var.getState();
        y2[] y2VarArrValues = y2.values();
        int length2 = y2VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                y2Var = null;
                break;
            }
            y2Var = y2VarArrValues[i2];
            if (a0.z(y2Var.name(), state, true)) {
                break;
            }
            i2++;
        }
        if (y2Var == null) {
            y2Var = y2.UNKNOWN;
        }
        y2 y2Var2 = y2Var;
        String failureReason = f4Var.getFailureReason();
        x1 progress = f4Var.getProgress();
        if (progress != null) {
            Intrinsics.checkNotNullParameter(progress, "<this>");
            String title = progress.getTitle();
            List steps = progress.getSteps();
            if (steps != null) {
                List list = steps;
                arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(ifk.b.w((s2) it8.next(), k1.FUTURE));
                    progress = progress;
                }
            } else {
                arrayList = null;
            }
            x1 x1Var = progress;
            List list2 = arrayList;
            if (arrayList == null) {
                list2 = f0.f322471a;
            }
            List inlineActions = x1Var.getInlineActions();
            if (inlineActions != null) {
                arrayList2 = new ArrayList();
                Iterator it9 = inlineActions.iterator();
                while (it9.hasNext()) {
                    EsimPhoneNumberPortingProgress.Action actionA = a((i1) it9.next(), str, str2, str3);
                    if (actionA != null) {
                        arrayList2.add(actionA);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = f0.f322471a;
            }
            i1 callToAction = x1Var.getCallToAction();
            esimPhoneNumberPortingProgress = new EsimPhoneNumberPortingProgress(title, list2, arrayList2, callToAction != null ? a(callToAction, str, str2, str3) : null);
        } else {
            esimPhoneNumberPortingProgress = null;
        }
        return new EsimSubscriptionPhoneNumberPorting(id10, x2Var2, cancellableUntilDate, instantOfEpochMilli2, instantOfEpochMilli, instantOfEpochMilli3, y2Var2, failureReason, esimPhoneNumberPortingProgress);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0b95  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0a2c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0b98 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0c95 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [dej.c3] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v27, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r10v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r10v40, types: [dej.l[]] */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.time.Period] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [dej.w2] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v2, types: [dej.x1] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r19v4, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r1v109 */
    /* JADX WARN: Type inference failed for: r1v110, types: [dej.m3] */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v126, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionRefundIneligibilityDetails] */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v16, types: [dej.v2[]] */
    /* JADX WARN: Type inference failed for: r20v5, types: [dej.z1] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5, types: [dej.m2] */
    /* JADX WARN: Type inference failed for: r24v6, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r29v10, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v9, types: [dej.b2] */
    /* JADX WARN: Type inference failed for: r2v34, types: [dej.m3[]] */
    /* JADX WARN: Type inference failed for: r2v54, types: [dej.b2[]] */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66, types: [dj0.d] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r31v6, types: [dej.b2] */
    /* JADX WARN: Type inference failed for: r32v2, types: [dej.n3] */
    /* JADX WARN: Type inference failed for: r33v10 */
    /* JADX WARN: Type inference failed for: r33v11, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r33v12 */
    /* JADX WARN: Type inference failed for: r33v2, types: [dej.n2] */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v10 */
    /* JADX WARN: Type inference failed for: r34v11 */
    /* JADX WARN: Type inference failed for: r34v12, types: [dej.h2] */
    /* JADX WARN: Type inference failed for: r34v13 */
    /* JADX WARN: Type inference failed for: r34v14 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3, types: [dej.f1] */
    /* JADX WARN: Type inference failed for: r34v4 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6 */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r34v8 */
    /* JADX WARN: Type inference failed for: r34v9 */
    /* JADX WARN: Type inference failed for: r35v11 */
    /* JADX WARN: Type inference failed for: r35v12, types: [com.revolut.retail.feature.esim.api.model.EsimSubscriptionCancellationConfirmation] */
    /* JADX WARN: Type inference failed for: r35v13 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [dej.v2] */
    /* JADX WARN: Type inference failed for: r3v127 */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v138, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v96 */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98, types: [boolean] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r45v0, types: [dej.g3] */
    /* JADX WARN: Type inference failed for: r45v6 */
    /* JADX WARN: Type inference failed for: r45v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r45v8 */
    /* JADX WARN: Type inference failed for: r46v4 */
    /* JADX WARN: Type inference failed for: r46v5 */
    /* JADX WARN: Type inference failed for: r46v6, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r46v7 */
    /* JADX WARN: Type inference failed for: r46v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r46v9 */
    /* JADX WARN: Type inference failed for: r47v3 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105, types: [dej.h2] */
    /* JADX WARN: Type inference failed for: r4v123 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v59, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r60v0, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r6v11, types: [dej.m2] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r8v62 */
    /* JADX WARN: Type inference failed for: r8v63 */
    /* JADX WARN: Type inference failed for: r8v64, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v79, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r8v8, types: [dej.m] */
    /* JADX WARN: Type inference failed for: r8v80, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [dej.l] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dej.t1 d(kfj.q3 r70) {
        /*
            Method dump skipped, instruction units count: 4249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.p.d(kfj.q3):dej.t1");
    }

    public static final c2 e(l3 l3Var) {
        Intrinsics.checkNotNullParameter(l3Var, "<this>");
        return new c2(l3Var.getUsageRelevance(), l3Var.getPriorityRank());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dej.h2 f(kfj.m3 r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = r10.getAction()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            dej.d2[] r4 = dej.d2.values()
            int r5 = r4.length
            r6 = r1
        L14:
            if (r6 >= r5) goto L26
            r7 = r4[r6]
            java.lang.String r8 = r7.name()
            boolean r8 = kotlin.text.a0.z(r8, r0, r3)
            if (r8 == 0) goto L23
            goto L27
        L23:
            int r6 = r6 + 1
            goto L14
        L26:
            r7 = r2
        L27:
            if (r7 == 0) goto L2f
            dej.e2 r0 = new dej.e2
            r0.<init>(r7)
            goto L3d
        L2f:
            java.lang.String r0 = r10.getUrl()
            if (r0 == 0) goto L3c
            dej.f2 r4 = new dej.f2
            r4.<init>(r0)
            r0 = r4
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 != 0) goto L57
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r10 = r10.getAction()
            java.lang.String r3 = "EsimSubscriptionDetailsActionItemDto: unsupported action '"
            java.lang.String r4 = "' and no url fallback"
            java.lang.String r10 = p.a.p(r3, r10, r4)
            java.lang.String r3 = "EsimSubscriptionsMapping"
            rd0.d.a(r1, r3, r10, r2, r0)
            return r2
        L57:
            java.lang.String r4 = r10.getTitle()
            java.lang.String r5 = r10.getIcon()
            java.lang.String r10 = r10.getSeverity()
            if (r10 == 0) goto L7d
            dej.m2[] r6 = dej.m2.values()
            int r7 = r6.length
        L6a:
            if (r1 >= r7) goto L7d
            r8 = r6[r1]
            java.lang.String r9 = r8.name()
            boolean r9 = kotlin.text.a0.z(r9, r10, r3)
            if (r9 == 0) goto L7a
            r2 = r8
            goto L7d
        L7a:
            int r1 = r1 + 1
            goto L6a
        L7d:
            dej.h2 r10 = new dej.h2
            r10.<init>(r4, r5, r2, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.p.f(kfj.m3):dej.h2");
    }

    public static final i3 g(r4 r4Var) {
        c2 c2Var;
        n3 n3VarH;
        Intrinsics.checkNotNullParameter(r4Var, "<this>");
        String name = r4Var.getName();
        Long initialBalanceBytes = r4Var.getInitialBalanceBytes();
        Long initialBalanceVoiceSeconds = r4Var.getInitialBalanceVoiceSeconds();
        Long initialBalanceSmsCount = r4Var.getInitialBalanceSmsCount();
        Boolean bytesUnlimited = r4Var.getBytesUnlimited();
        boolean voiceSecondsUnlimited = r4Var.getVoiceSecondsUnlimited();
        Boolean smsCountUnlimited = r4Var.getSmsCountUnlimited();
        EsimCoverage esimCoverageB = b.b(r4Var.getCoverageType(), r4Var.getCoverageCode(), null, r4Var.getCoverageCountries());
        v4 usage = r4Var.getUsage();
        if (usage != null) {
            n3VarH = h(usage);
            c2Var = null;
        } else {
            c2Var = null;
            n3VarH = null;
        }
        long order = r4Var.getOrder();
        l3 contextualOrder = r4Var.getContextualOrder();
        return new i3(name, initialBalanceBytes, initialBalanceVoiceSeconds, initialBalanceSmsCount, bytesUnlimited, voiceSecondsUnlimited, smsCountUnlimited, esimCoverageB, n3VarH, order, contextualOrder != null ? e(contextualOrder) : c2Var);
    }

    public static final n3 h(v4 v4Var) {
        Intrinsics.checkNotNullParameter(v4Var, "<this>");
        long spendBalanceBytes = v4Var.getSpendBalanceBytes();
        Long currentBalanceBytes = v4Var.getCurrentBalanceBytes();
        long spendBalanceVoiceSeconds = v4Var.getSpendBalanceVoiceSeconds();
        Long currentBalanceVoiceSeconds = v4Var.getCurrentBalanceVoiceSeconds();
        long spendBalanceSmsCount = v4Var.getSpendBalanceSmsCount();
        Long currentBalanceSmsCount = v4Var.getCurrentBalanceSmsCount();
        Instant instantOfEpochMilli = Instant.ofEpochMilli(v4Var.getDate());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochMilli, "ofEpochMilli(...)");
        return new n3(spendBalanceBytes, currentBalanceBytes, spendBalanceVoiceSeconds, currentBalanceVoiceSeconds, spendBalanceSmsCount, currentBalanceSmsCount, instantOfEpochMilli);
    }

    public static final ArrayList i(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(d((q3) it8.next()));
        }
        return arrayList;
    }

    public static final i1 j(EsimPhoneNumberPortingProgress.Action action) {
        h1 h1Var;
        Intrinsics.checkNotNullParameter(action, "<this>");
        String str = action.f100386a;
        EsimPhoneNumberPortingProgress.Action.Data data = action.f100387b;
        if (data instanceof EsimPhoneNumberPortingProgress.Action.Data.CreatePorting) {
            h1Var = h1.PORTING_CREATE;
        } else if (data instanceof EsimPhoneNumberPortingProgress.Action.Data.UpdatePorting) {
            h1Var = h1.PORTING_UPDATE;
        } else {
            if (!(data instanceof EsimPhoneNumberPortingProgress.Action.Data.Url)) {
                throw new NoWhenBranchMatchedException();
            }
            h1Var = null;
        }
        if (!(data instanceof EsimPhoneNumberPortingProgress.Action.Data.Url)) {
            data = null;
        }
        EsimPhoneNumberPortingProgress.Action.Data.Url url2 = (EsimPhoneNumberPortingProgress.Action.Data.Url) data;
        return new i1(str, h1Var, url2 != null ? url2.f100393a : null);
    }

    public static final m3 k(h2 h2Var) {
        Intrinsics.checkNotNullParameter(h2Var, "<this>");
        String str = h2Var.f113549a;
        g2 g2Var = h2Var.d;
        String str2 = h2Var.f113550b;
        m2 m2Var = h2Var.f113551c;
        String strName = m2Var != null ? m2Var.name() : null;
        e2 e2Var = g2Var instanceof e2 ? (e2) g2Var : null;
        String strName2 = e2Var != null ? e2Var.f113530a.name() : null;
        f2 f2Var = g2Var instanceof f2 ? (f2) g2Var : null;
        return new m3(str, str2, strName, strName2, f2Var != null ? f2Var.f113533a : null);
    }

    public static final p3 l(l2 l2Var) {
        Intrinsics.checkNotNullParameter(l2Var, "<this>");
        return new p3(l2Var.f113588b, l2Var.f113589c.name(), f.a(l2Var.f113587a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Object, java.util.Map] */
    public static final q3 m(t1 t1Var) {
        String str;
        l0 l0Var;
        String str2;
        String str3;
        kfj.z2 z2Var;
        k4 k4Var;
        x3 x3Var;
        String str4;
        String str5;
        ArrayList arrayList;
        Long l2;
        String str6;
        String str7;
        e3 e3Var;
        Long l3;
        g3 g3Var;
        Long l4;
        ArrayList arrayList2;
        kfj.x2 x2Var;
        String str8;
        q4 q4Var;
        boolean z;
        q4 q4Var2;
        Long l5;
        Long l22;
        r3 r3Var;
        k2 k2Var;
        boolean z3;
        ArrayList arrayList3;
        k2 k2Var2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        l3 l3Var;
        long j2;
        ArrayList arrayList6;
        ArrayList arrayList7;
        l3 l3Var2;
        ArrayList arrayList8;
        j4 j4Var;
        j4 j4Var2;
        boolean z4;
        o3 o3Var;
        v3 v3Var;
        kfj.n3 n3Var;
        t3 t3Var;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList arrayList11;
        t4 t4Var;
        u3 u3Var;
        String strName;
        String str9;
        ArrayList arrayList12;
        ArrayList arrayList13;
        n4 n4Var;
        kfj.f3 f3Var;
        boolean z6;
        boolean z11;
        kfj.a aVar;
        String strName2;
        Intrinsics.checkNotNullParameter(t1Var, "<this>");
        String str10 = t1Var.f113650a;
        String strName3 = t1Var.f113651b.name();
        String str11 = t1Var.f113652c;
        EsimCoverage esimCoverage = t1Var.d;
        String str12 = esimCoverage.getF100209b().f100235a;
        String strA = b.a(esimCoverage);
        List f100208a = esimCoverage.getF100208a();
        ArrayList arrayList14 = new ArrayList(w.t(f100208a, 10));
        Iterator it8 = f100208a.iterator();
        while (it8.hasNext()) {
            arrayList14.add(((wi0.b) it8.next()).f297794a);
        }
        String f100210c = esimCoverage.getF100210c();
        EsimProfileEntry esimProfileEntry = t1Var.e;
        Object obj2 = m.f224899a;
        Intrinsics.checkNotNullParameter(esimProfileEntry, "<this>");
        String str13 = esimProfileEntry.f100440a;
        String strG = u1.g(esimProfileEntry.f100441b, m.f224899a);
        String str14 = esimProfileEntry.f100442c;
        String str15 = esimProfileEntry.d;
        String str16 = esimProfileEntry.e;
        String str17 = esimProfileEntry.f;
        EsimMigrationFromDataPlansOnly esimMigrationFromDataPlansOnly = esimProfileEntry.f100443g;
        if (esimMigrationFromDataPlansOnly != null) {
            Intrinsics.checkNotNullParameter(esimMigrationFromDataPlansOnly, "<this>");
            str = str10;
            l0Var = new l0(esimMigrationFromDataPlansOnly.f100292a);
        } else {
            str = str10;
            l0Var = null;
        }
        EsimProfileScope esimProfileScope = esimProfileEntry.f100444h;
        a3 a3VarD = esimProfileScope != null ? m.d(esimProfileScope) : null;
        EsimProfileLock esimProfileLock = esimProfileEntry.i;
        if (esimProfileLock != null) {
            Intrinsics.checkNotNullParameter(esimProfileLock, "<this>");
            str2 = strName3;
            str3 = str11;
            z2Var = new kfj.z2(esimProfileLock.f100447a, esimProfileLock.f100448b, esimProfileLock.f100449c, esimProfileLock.d);
        } else {
            str2 = strName3;
            str3 = str11;
            z2Var = null;
        }
        kfj.x2 x2Var2 = new kfj.x2(str13, strG, str14, str15, str16, str17, l0Var, a3VarD, z2Var);
        String str18 = t1Var.f;
        dej.m mVar = t1Var.f113653g;
        String str19 = (mVar == null || (strName2 = mVar.name()) == null) ? "UNKNOWN" : strName2;
        dej.l lVar = t1Var.f113654h;
        String strName4 = lVar != null ? lVar.name() : null;
        c3 c3Var = t1Var.i;
        if (c3Var != null) {
            Intrinsics.checkNotNullParameter(c3Var, "<this>");
            String string = c3Var.f113511a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jo3.a aVarP = mo3.a.p(c3Var.f113512b);
            Double d = c3Var.f113513c;
            String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
            Instant instant = c3Var.d;
            k4Var = new k4(string, aVarP, strValueOf, instant != null ? Long.valueOf(instant.toEpochMilli()) : null);
        } else {
            k4Var = null;
        }
        Period period = t1Var.f113655j;
        String string2 = period != null ? period.toString() : null;
        w2 w2Var = t1Var.k;
        if (w2Var != null) {
            Intrinsics.checkNotNullParameter(w2Var, "<this>");
            String str20 = w2Var.f113681a;
            long epochMilli = w2Var.f113682b.toEpochMilli();
            dj0.d dVar = w2Var.f113683c;
            x3Var = new x3(str20, epochMilli, dVar != null ? mo3.a.p(dVar) : null, w2Var.d);
        } else {
            x3Var = null;
        }
        String str21 = t1Var.f113656l;
        EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber = t1Var.f113657m;
        a4 a4VarN = esimSubscriptionPhoneNumber != null ? n(esimSubscriptionPhoneNumber) : null;
        Long l31 = t1Var.f113658n;
        List list = t1Var.o;
        if (list != null) {
            List list2 = list;
            str4 = str21;
            str5 = "UNKNOWN";
            ArrayList arrayList15 = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList15.add(o((i3) it9.next()));
            }
            arrayList = arrayList15;
        } else {
            str4 = str21;
            str5 = "UNKNOWN";
            arrayList = null;
        }
        dej.x1 x1Var = t1Var.f113659p;
        if (x1Var != null) {
            Intrinsics.checkNotNullParameter(x1Var, "<this>");
            boolean z12 = x1Var.f113689a;
            boolean z29 = x1Var.f113690b;
            EsimAutoRenewalTerms esimAutoRenewalTerms = x1Var.e;
            if (esimAutoRenewalTerms != null) {
                Intrinsics.checkNotNullParameter(esimAutoRenewalTerms, "<this>");
                z6 = z12;
                l2 = l31;
                String str22 = esimAutoRenewalTerms.f100188a;
                ArrayList arrayList16 = esimAutoRenewalTerms.f100189b;
                Intrinsics.checkNotNullParameter(arrayList16, "<this>");
                z11 = z29;
                str6 = str12;
                str7 = strA;
                ArrayList arrayList17 = new ArrayList(w.t(arrayList16, 10));
                for (Iterator it10 = arrayList16.iterator(); it10.hasNext(); it10 = it10) {
                    EsimAutoRenewalTermsItem esimAutoRenewalTermsItem = (EsimAutoRenewalTermsItem) it10.next();
                    Intrinsics.checkNotNullParameter(esimAutoRenewalTermsItem, "<this>");
                    arrayList17.add(new kfj.b(esimAutoRenewalTermsItem.f100190a, esimAutoRenewalTermsItem.f100191b));
                }
                aVar = new kfj.a(str22, arrayList17);
            } else {
                z6 = z12;
                l2 = l31;
                z11 = z29;
                str6 = str12;
                str7 = strA;
                aVar = null;
            }
            String str23 = x1Var.f;
            Instant instant2 = x1Var.d;
            e3Var = new e3(z6, z11, aVar, instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null, x1Var.f113691c.toEpochMilli(), str23);
        } else {
            l2 = l31;
            str6 = str12;
            str7 = strA;
            e3Var = null;
        }
        Instant instant3 = t1Var.f113660q;
        Long lValueOf = instant3 != null ? Long.valueOf(instant3.toEpochMilli()) : null;
        Instant instant4 = t1Var.f113661r;
        Long lValueOf2 = instant4 != null ? Long.valueOf(instant4.toEpochMilli()) : null;
        z1 z1Var = t1Var.f113662s;
        if (z1Var != null) {
            Intrinsics.checkNotNullParameter(z1Var, "<this>");
            String strName5 = z1Var.f113697a.name();
            String str24 = z1Var.f113698b;
            Instant instant5 = z1Var.f113699c;
            Long lValueOf3 = instant5 != null ? Long.valueOf(instant5.toEpochMilli()) : null;
            h2 h2Var = z1Var.d;
            m3 m3VarK = h2Var != null ? k(h2Var) : null;
            EsimSubscriptionCancellationConfirmation esimSubscriptionCancellationConfirmation = z1Var.e;
            if (esimSubscriptionCancellationConfirmation != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionCancellationConfirmation, "<this>");
                l3 = lValueOf;
                f3Var = new kfj.f3(esimSubscriptionCancellationConfirmation.f100459a, f.a(esimSubscriptionCancellationConfirmation.f100460b), esimSubscriptionCancellationConfirmation.f100461c, esimSubscriptionCancellationConfirmation.d);
            } else {
                l3 = lValueOf;
                f3Var = null;
            }
            g3Var = new g3(strName5, str24, lValueOf3, m3VarK, f3Var);
        } else {
            l3 = lValueOf;
            g3Var = null;
        }
        dej.g3 g3Var2 = t1Var.f113663t;
        if (g3Var2 != null) {
            Intrinsics.checkNotNullParameter(g3Var2, "<this>");
            String strG2 = u1.g(g3Var2.f113541a, f224901a);
            Instant instant6 = g3Var2.f113542b;
            Long lValueOf4 = instant6 != null ? Long.valueOf(instant6.toEpochMilli()) : null;
            h2 h2Var2 = g3Var2.f113543c;
            m3 m3VarK2 = h2Var2 != null ? k(h2Var2) : null;
            EsimSubscriptionRefundIneligibilityDetails esimSubscriptionRefundIneligibilityDetails = g3Var2.d;
            if (esimSubscriptionRefundIneligibilityDetails != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionRefundIneligibilityDetails, "<this>");
                String str25 = esimSubscriptionRefundIneligibilityDetails.f100505a;
                l4 = lValueOf2;
                e0 e0VarA = f.a(esimSubscriptionRefundIneligibilityDetails.f100506b);
                ArrayList arrayList18 = esimSubscriptionRefundIneligibilityDetails.f100507c;
                arrayList2 = arrayList14;
                x2Var = x2Var2;
                str8 = str18;
                ArrayList arrayList19 = new ArrayList(w.t(arrayList18, 10));
                Iterator it11 = arrayList18.iterator();
                while (it11.hasNext()) {
                    arrayList19.add(f.a((EsimHyperText) it11.next()));
                }
                n4Var = new n4(str25, e0VarA, arrayList19);
            } else {
                l4 = lValueOf2;
                arrayList2 = arrayList14;
                x2Var = x2Var2;
                str8 = str18;
                n4Var = null;
            }
            q4Var = new q4(strG2, lValueOf4, m3VarK2, n4Var);
        } else {
            l4 = lValueOf2;
            arrayList2 = arrayList14;
            x2Var = x2Var2;
            str8 = str18;
            q4Var = null;
        }
        long epochMilli2 = t1Var.u.toEpochMilli();
        Instant instant7 = t1Var.v;
        Long lValueOf5 = instant7 != null ? Long.valueOf(instant7.toEpochMilli()) : null;
        Instant instant8 = t1Var.f113664w;
        Long lValueOf6 = instant8 != null ? Long.valueOf(instant8.toEpochMilli()) : null;
        String str26 = t1Var.f113665x;
        Long l37 = t1Var.f113666y;
        boolean z31 = t1Var.z;
        Long l39 = t1Var.A;
        boolean z41 = t1Var.B;
        Long l51 = t1Var.C;
        boolean z49 = t1Var.D;
        n3 n3Var2 = t1Var.E;
        v4 v4VarP = n3Var2 != null ? p(n3Var2) : null;
        n2 n2Var = t1Var.F;
        if (n2Var != null) {
            Intrinsics.checkNotNullParameter(n2Var, "<this>");
            z = z49;
            Long l52 = n2Var.f113599a;
            Long l60 = n2Var.f113600b;
            Long l66 = n2Var.f113601c;
            Long l69 = n2Var.d;
            List list3 = n2Var.e;
            if (list3 != null) {
                List list4 = list3;
                q4Var2 = q4Var;
                l5 = lValueOf5;
                l22 = lValueOf6;
                ArrayList arrayList20 = new ArrayList(w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    arrayList20.add(((wi0.b) it12.next()).f297794a);
                }
                arrayList12 = arrayList20;
            } else {
                q4Var2 = q4Var;
                l5 = lValueOf5;
                l22 = lValueOf6;
                arrayList12 = null;
            }
            List list5 = n2Var.f;
            if (list5 != null) {
                List list6 = list5;
                ArrayList arrayList21 = new ArrayList(w.t(list6, 10));
                Iterator it13 = list6.iterator();
                while (it13.hasNext()) {
                    arrayList21.add(((wi0.b) it13.next()).f297794a);
                }
                arrayList13 = arrayList21;
            } else {
                arrayList13 = null;
            }
            r3Var = new r3(l52, l60, l66, l69, arrayList12, arrayList13, n2Var.f113602g, n2Var.f113603h);
        } else {
            z = z49;
            q4Var2 = q4Var;
            l5 = lValueOf5;
            l22 = lValueOf6;
            r3Var = null;
        }
        f1 f1Var = t1Var.G;
        if (f1Var != null) {
            Intrinsics.checkNotNullParameter(f1Var, "<this>");
            String str27 = f1Var.f113531a;
            dej.h1 h1Var = f1Var.f113532b;
            if (h1Var.equals(h1.a.f113547a)) {
                str9 = "PRICING_PLAN_BENEFIT";
            } else {
                if (!h1Var.equals(h1.b.f113548a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str9 = str5;
            }
            k2Var = new k2(str27, str9);
        } else {
            k2Var = null;
        }
        boolean z54 = t1Var.H;
        List list7 = t1Var.I;
        if (list7 != null) {
            List list8 = list7;
            z3 = z54;
            arrayList3 = new ArrayList(w.t(list8, 10));
            Iterator it14 = list8.iterator();
            while (it14.hasNext()) {
                dej.l3 l3Var3 = (dej.l3) it14.next();
                Intrinsics.checkNotNullParameter(l3Var3, "<this>");
                Iterator it15 = it14;
                String str28 = l3Var3.f113590a;
                dej.m3 m3Var = l3Var3.f113591b;
                if (m3Var == null || (strName = m3Var.name()) == null) {
                    strName = str5;
                }
                arrayList3.add(new u4(str28, strName));
                it14 = it15;
            }
        } else {
            z3 = z54;
            arrayList3 = null;
        }
        List list9 = t1Var.J;
        if (list9 != null) {
            List list10 = list9;
            k2Var2 = k2Var;
            arrayList4 = new ArrayList(w.t(list10, 10));
            Iterator it16 = list10.iterator();
            while (it16.hasNext()) {
                o2 o2Var = (o2) it16.next();
                Intrinsics.checkNotNullParameter(o2Var, "<this>");
                arrayList4.add(new s3(o2Var.f113611a, o2Var.f113612b.toEpochMilli(), mo3.a.p(o2Var.f113613c)));
                it16 = it16;
                arrayList3 = arrayList3;
                str26 = str26;
                l37 = l37;
            }
        } else {
            k2Var2 = k2Var;
            arrayList4 = null;
        }
        ArrayList arrayList22 = arrayList3;
        String str29 = str26;
        Long l79 = l37;
        List list11 = t1Var.K;
        if (list11 != null) {
            List list12 = list11;
            ArrayList arrayList23 = new ArrayList(w.t(list12, 10));
            Iterator it17 = list12.iterator();
            while (it17.hasNext()) {
                arrayList23.add(n((EsimSubscriptionPhoneNumber) it17.next()));
            }
            arrayList5 = arrayList23;
        } else {
            arrayList5 = null;
        }
        long j3 = t1Var.L;
        c2 c2Var = t1Var.M;
        if (c2Var != null) {
            Intrinsics.checkNotNullParameter(c2Var, "<this>");
            l3Var = new l3(c2Var.f113510b, c2Var.f113509a);
        } else {
            l3Var = null;
        }
        List list13 = t1Var.N;
        if (list13 != null) {
            Intrinsics.checkNotNullParameter(list13, "<this>");
            List list14 = list13;
            j2 = j3;
            arrayList6 = new ArrayList(w.t(list14, 10));
            Iterator it18 = list14.iterator();
            while (it18.hasNext()) {
                EsimMobilePlanPerk esimMobilePlanPerk = (EsimMobilePlanPerk) it18.next();
                Intrinsics.checkNotNullParameter(esimMobilePlanPerk, "<this>");
                String str30 = esimMobilePlanPerk.f100301a;
                String str31 = esimMobilePlanPerk.f100302b;
                Iterator it19 = it18;
                String str32 = esimMobilePlanPerk.f100303c;
                String str33 = esimMobilePlanPerk.d;
                String str34 = str33 == null ? null : str33;
                EsimInfoBottomSheetData esimInfoBottomSheetData = esimMobilePlanPerk.e;
                arrayList6.add(new kfj.r0(str30, str31, str32, str34, esimInfoBottomSheetData != null ? i.b(esimInfoBottomSheetData) : null));
                it18 = it19;
            }
        } else {
            j2 = j3;
            arrayList6 = null;
        }
        EsimSubscriptionPlanChange esimSubscriptionPlanChange = t1Var.O;
        if (esimSubscriptionPlanChange != null) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPlanChange, "<this>");
            Boolean boolValueOf = Boolean.valueOf(esimSubscriptionPlanChange.f100495a);
            boolean z74 = esimSubscriptionPlanChange.f100496b;
            EsimSubscriptionNextPlan esimSubscriptionNextPlan = esimSubscriptionPlanChange.f100497c;
            if (esimSubscriptionNextPlan != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionNextPlan, "<this>");
                arrayList7 = arrayList4;
                l3Var2 = l3Var;
                Instant instant9 = esimSubscriptionNextPlan.f100467a;
                arrayList8 = arrayList6;
                u3Var = new u3(instant9 != null ? Long.valueOf(instant9.toEpochMilli()) : null, esimSubscriptionNextPlan.f100468b, esimSubscriptionNextPlan.f100469c);
            } else {
                arrayList7 = arrayList4;
                l3Var2 = l3Var;
                arrayList8 = arrayList6;
                u3Var = null;
            }
            j4Var = new j4(boolValueOf, z74, u3Var);
        } else {
            arrayList7 = arrayList4;
            l3Var2 = l3Var;
            arrayList8 = arrayList6;
            j4Var = null;
        }
        dej.k2 k2Var3 = t1Var.P;
        if (k2Var3 != null) {
            Intrinsics.checkNotNullParameter(k2Var3, "<this>");
            q2 q2Var = k2Var3.f113580a;
            if (q2Var != null) {
                Intrinsics.checkNotNullParameter(q2Var, "<this>");
                List list15 = q2Var.f113628a;
                if (list15 != null) {
                    List list16 = list15;
                    j4Var2 = j4Var;
                    arrayList11 = new ArrayList(w.t(list16, 10));
                    Iterator it20 = list16.iterator();
                    while (it20.hasNext()) {
                        arrayList11.add(l((l2) it20.next()));
                    }
                } else {
                    j4Var2 = j4Var;
                    arrayList11 = null;
                }
                k3 k3Var = q2Var.f113629b;
                if (k3Var != null) {
                    Intrinsics.checkNotNullParameter(k3Var, "<this>");
                    t4Var = new t4(k3Var.f113583a, k3Var.f113584b.name());
                } else {
                    t4Var = null;
                }
                v3Var = new v3(arrayList11, t4Var);
            } else {
                j4Var2 = j4Var;
                v3Var = null;
            }
            j2 j2Var = k2Var3.f113581b;
            if (j2Var != null) {
                Intrinsics.checkNotNullParameter(j2Var, "<this>");
                l2 l2Var = j2Var.f113571a;
                p3 p3VarL = l2Var != null ? l(l2Var) : null;
                l2 l2Var2 = j2Var.f113572b;
                p3 p3VarL2 = l2Var2 != null ? l(l2Var2) : null;
                List list17 = j2Var.f113573c;
                if (list17 != null) {
                    List list18 = list17;
                    z4 = z31;
                    ArrayList arrayList24 = new ArrayList(w.t(list18, 10));
                    Iterator it21 = list18.iterator();
                    while (it21.hasNext()) {
                        arrayList24.add(((d2) it21.next()).name());
                    }
                    arrayList9 = arrayList24;
                } else {
                    z4 = z31;
                    arrayList9 = null;
                }
                List list19 = j2Var.d;
                if (list19 != null) {
                    List list20 = list19;
                    ArrayList arrayList25 = new ArrayList(w.t(list20, 10));
                    Iterator it22 = list20.iterator();
                    while (it22.hasNext()) {
                        arrayList25.add(k((h2) it22.next()));
                    }
                    arrayList10 = arrayList25;
                } else {
                    arrayList10 = null;
                }
                l2 l2Var3 = j2Var.e;
                p3 p3VarL3 = l2Var3 != null ? l(l2Var3) : null;
                l2 l2Var4 = j2Var.f;
                n3Var = new kfj.n3(p3VarL, p3VarL2, arrayList9, arrayList10, p3VarL3, l2Var4 != null ? l(l2Var4) : null);
            } else {
                z4 = z31;
                n3Var = null;
            }
            p2 p2Var = k2Var3.f113582c;
            if (p2Var != null) {
                Intrinsics.checkNotNullParameter(p2Var, "<this>");
                l2 l2Var5 = p2Var.f113616a;
                t3Var = new t3(l2Var5 != null ? l(l2Var5) : null);
            } else {
                t3Var = null;
            }
            o3Var = new o3(v3Var, n3Var, t3Var);
        } else {
            j4Var2 = j4Var;
            z4 = z31;
            o3Var = null;
        }
        u2 u2Var = t1Var.Q;
        if (u2Var != null) {
            Intrinsics.checkNotNullParameter(u2Var, "<this>");
            v2 v2Var = u2Var.f113669a;
            w3Var = new w3(v2Var != null ? v2Var.name() : null);
        }
        return new q3(str, str2, str3, str6, str7, arrayList2, f100210c, x2Var, str8, str19, strName4, k4Var, string2, x3Var, str4, a4VarN, l2, arrayList, e3Var, l3, l4, g3Var, q4Var2, epochMilli2, l5, l22, str29, l79, z4, l39, z41, l51, z, v4VarP, r3Var, k2Var2, z3, arrayList22, arrayList7, arrayList5, j2, l3Var2, arrayList8, j4Var2, o3Var, w3Var);
    }

    public static final a4 n(EsimSubscriptionPhoneNumber esimSubscriptionPhoneNumber) {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z3;
        f4 f4Var;
        d4 d4Var;
        c4 c4Var;
        i4 i4Var;
        e4 e4Var;
        x1 x1Var;
        Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumber, "<this>");
        String str4 = esimSubscriptionPhoneNumber.f100470a;
        String strName = esimSubscriptionPhoneNumber.f100471b.name();
        String str5 = esimSubscriptionPhoneNumber.f100472c;
        boolean z4 = esimSubscriptionPhoneNumber.d;
        boolean z6 = esimSubscriptionPhoneNumber.e;
        String str6 = esimSubscriptionPhoneNumber.f;
        EsimSubscriptionPhoneNumberPorting esimSubscriptionPhoneNumberPorting = esimSubscriptionPhoneNumber.i;
        if (esimSubscriptionPhoneNumberPorting != null) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumberPorting, "<this>");
            String str7 = esimSubscriptionPhoneNumberPorting.f100488a;
            String strName2 = esimSubscriptionPhoneNumberPorting.f100489b.name();
            String strName3 = esimSubscriptionPhoneNumberPorting.f100491g.name();
            Instant instant = esimSubscriptionPhoneNumberPorting.e;
            Long lValueOf = instant != null ? Long.valueOf(instant.toEpochMilli()) : null;
            Instant instant2 = esimSubscriptionPhoneNumberPorting.d;
            Long lValueOf2 = instant2 != null ? Long.valueOf(instant2.toEpochMilli()) : null;
            Instant instant3 = esimSubscriptionPhoneNumberPorting.f;
            Long lValueOf3 = instant3 != null ? Long.valueOf(instant3.toEpochMilli()) : null;
            boolean z11 = esimSubscriptionPhoneNumberPorting.f100490c;
            String str8 = esimSubscriptionPhoneNumberPorting.f100492h;
            EsimPhoneNumberPortingProgress esimPhoneNumberPortingProgress = esimSubscriptionPhoneNumberPorting.i;
            if (esimPhoneNumberPortingProgress != null) {
                Intrinsics.checkNotNullParameter(esimPhoneNumberPortingProgress, "<this>");
                String str9 = esimPhoneNumberPortingProgress.f100383a;
                str = str4;
                List list = esimPhoneNumberPortingProgress.f100384b;
                str2 = strName;
                str3 = str5;
                z = z4;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    EsimPortingStep esimPortingStep = (EsimPortingStep) it8.next();
                    Intrinsics.checkNotNullParameter(esimPortingStep, "<this>");
                    arrayList.add(new s2(esimPortingStep.f100416a, esimPortingStep.f100418c.name(), f.a(esimPortingStep.f100417b)));
                    it8 = it8;
                    z6 = z6;
                }
                z3 = z6;
                List list2 = esimPhoneNumberPortingProgress.f100385c;
                ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList2.add(j((EsimPhoneNumberPortingProgress.Action) it9.next()));
                }
                EsimPhoneNumberPortingProgress.Action action = esimPhoneNumberPortingProgress.d;
                x1Var = new x1(str9, arrayList, arrayList2, action != null ? j(action) : null);
            } else {
                str = str4;
                str2 = strName;
                str3 = str5;
                z = z4;
                z3 = z6;
                x1Var = null;
            }
            f4Var = new f4(str7, strName2, z11, lValueOf, lValueOf2, lValueOf3, strName3, str8, x1Var);
        } else {
            str = str4;
            str2 = strName;
            str3 = str5;
            z = z4;
            z3 = z6;
            f4Var = null;
        }
        Instant instant4 = esimSubscriptionPhoneNumber.f100473g;
        Long lValueOf4 = instant4 != null ? Long.valueOf(instant4.toEpochMilli()) : null;
        Instant instant5 = esimSubscriptionPhoneNumber.f100474h;
        Long lValueOf5 = instant5 != null ? Long.valueOf(instant5.toEpochMilli()) : null;
        EsimSubscriptionPhoneNumberPortOutEligibility esimSubscriptionPhoneNumberPortOutEligibility = esimSubscriptionPhoneNumber.f100475j;
        if (esimSubscriptionPhoneNumberPortOutEligibility != null) {
            Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumberPortOutEligibility, "<this>");
            EsimSubscriptionPhoneNumberPacPortOutEligibility esimSubscriptionPhoneNumberPacPortOutEligibility = esimSubscriptionPhoneNumberPortOutEligibility.f100482a;
            if (esimSubscriptionPhoneNumberPacPortOutEligibility != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumberPacPortOutEligibility, "<this>");
                c4Var = new c4(esimSubscriptionPhoneNumberPacPortOutEligibility.f100481a);
            } else {
                c4Var = null;
            }
            EsimSubscriptionPhoneNumberStacPortOutEligibility esimSubscriptionPhoneNumberStacPortOutEligibility = esimSubscriptionPhoneNumberPortOutEligibility.f100483b;
            if (esimSubscriptionPhoneNumberStacPortOutEligibility != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumberStacPortOutEligibility, "<this>");
                i4Var = new i4(esimSubscriptionPhoneNumberStacPortOutEligibility.f100494a);
            } else {
                i4Var = null;
            }
            EsimSubscriptionPhoneNumberPortOutOptIn esimSubscriptionPhoneNumberPortOutOptIn = esimSubscriptionPhoneNumberPortOutEligibility.f100484c;
            if (esimSubscriptionPhoneNumberPortOutOptIn != null) {
                Intrinsics.checkNotNullParameter(esimSubscriptionPhoneNumberPortOutOptIn, "<this>");
                boolean z12 = esimSubscriptionPhoneNumberPortOutOptIn.f100485a;
                boolean z29 = esimSubscriptionPhoneNumberPortOutOptIn.f100486b;
                Instant instant6 = esimSubscriptionPhoneNumberPortOutOptIn.f100487c;
                e4Var = new e4(z12, z29, instant6 != null ? Long.valueOf(instant6.toEpochMilli()) : null);
            } else {
                e4Var = null;
            }
            d4Var = new d4(c4Var, i4Var, e4Var);
        } else {
            d4Var = null;
        }
        return new a4(str, str2, str3, z, z3, str6, lValueOf4, lValueOf5, f4Var, d4Var);
    }

    public static final r4 o(i3 i3Var) {
        v4 v4Var;
        Intrinsics.checkNotNullParameter(i3Var, "<this>");
        String str = i3Var.f113559a;
        Long l2 = i3Var.f113560b;
        Long l3 = i3Var.f113561c;
        Long l4 = i3Var.d;
        Boolean bool = i3Var.e;
        boolean z = i3Var.f;
        Boolean bool2 = i3Var.f113562g;
        EsimCoverage esimCoverage = i3Var.f113563h;
        String strA = b.a(esimCoverage);
        String str2 = esimCoverage.getF100209b().f100235a;
        List f100208a = esimCoverage.getF100208a();
        ArrayList arrayList = new ArrayList(w.t(f100208a, 10));
        Iterator it8 = f100208a.iterator();
        while (it8.hasNext()) {
            arrayList.add(((wi0.b) it8.next()).f297794a);
        }
        n3 n3Var = i3Var.i;
        l3 l3Var = null;
        v4 v4VarP = n3Var != null ? p(n3Var) : null;
        long j2 = i3Var.f113564j;
        c2 c2Var = i3Var.k;
        if (c2Var != null) {
            Intrinsics.checkNotNullParameter(c2Var, "<this>");
            v4Var = v4VarP;
            l3Var = new l3(c2Var.f113510b, c2Var.f113509a);
        } else {
            v4Var = v4VarP;
        }
        return new r4(str, l2, l3, l4, bool, z, bool2, strA, str2, arrayList, v4Var, j2, l3Var);
    }

    public static final v4 p(n3 n3Var) {
        Intrinsics.checkNotNullParameter(n3Var, "<this>");
        return new v4(n3Var.f113604a, n3Var.f113605b, n3Var.f113606c, n3Var.d, n3Var.e, n3Var.f, n3Var.f113607g.toEpochMilli());
    }
}
