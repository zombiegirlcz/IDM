package vse;

import a83.z;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.DangerCircleBadge;
import com.revolut.core.ui_kit.models.badge.InactiveCircleBadge;
import com.revolut.core.ui_kit.models.badge.SuccessCircleBadge;
import com.revolut.core.ui_kit.models.badge.WarningCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.models.TicketDetails;
import et0.q0;
import i26.l;
import ip0.a40;
import ip0.c40;
import ip0.d40;
import ip0.e40;
import ip0.f40;
import ip0.h40;
import ip0.i40;
import ip0.nb0;
import ip0.pb0;
import ip0.y30;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import soc.f;
import yxc.s;
import z9l.i;
import z9l.j;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements ose.e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f291770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f291771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bp6.b f291772c;

    public d(i progressionStepsMapper, j stepDateMapper, bp6.b feedbackWidgetMapper) {
        Intrinsics.checkNotNullParameter(progressionStepsMapper, "progressionStepsMapper");
        Intrinsics.checkNotNullParameter(stepDateMapper, "stepDateMapper");
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        this.f291770a = progressionStepsMapper;
        this.f291771b = stepDateMapper;
        this.f291772c = feedbackWidgetMapper;
    }

    public static RowDelegate.Model d(TicketDetails ticketDetails, boolean z) {
        dw0.a aVar;
        CircleBadgeModel accentCircleBadge;
        String strQ = j6.a.q("TICKET_HEADER_", ticketDetails.f90447a);
        FincrimeHomeScreen$V2 fincrimeHomeScreen$V2 = ticketDetails.f90448b;
        TextClause textClause = new TextClause(fincrimeHomeScreen$V2.f64127a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = fincrimeHomeScreen$V2.f64128b;
        if (str == null) {
            m70.a.c(t0.f186434a);
            str = "";
        }
        CircleBadgeModel circleBadgeModel = null;
        TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        GlyphImage glyphImage = new GlyphImage(R$drawable.uikit_icn_24_document, null, null, 6);
        aal.a aVar2 = fincrimeHomeScreen$V2.f64129c;
        if (aVar2 != null) {
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            int[] iArr = c.f291769a;
            switch (iArr[aVar2.ordinal()]) {
                case 1:
                    aVar = dw0.a.Checked;
                    break;
                case 2:
                    aVar = dw0.a.Edit;
                    break;
                case 3:
                    aVar = dw0.a.Income;
                    break;
                case 4:
                    aVar = dw0.a.Outgoing;
                    break;
                case 5:
                    aVar = dw0.a.Pending;
                    break;
                case 6:
                    aVar = dw0.a.Recurring;
                    break;
                case 7:
                    aVar = dw0.a.Revert;
                    break;
                case 8:
                    aVar = dw0.a.TopUp;
                    break;
                case 9:
                    aVar = dw0.a.Awaiting;
                    break;
                case 10:
                    aVar = dw0.a.Pending;
                    break;
                case 11:
                    aVar = dw0.a.Info;
                    break;
                case 12:
                    aVar = dw0.a.Suspicious;
                    break;
                case 13:
                    aVar = dw0.a.Checked;
                    break;
                case 14:
                    aVar = dw0.a.Error;
                    break;
                case 15:
                    aVar = dw0.a.Suspicious;
                    break;
                case 16:
                    aVar = dw0.a.Cancelled;
                    break;
                case 17:
                    aVar = dw0.a.Awaiting;
                    break;
                case 18:
                    aVar = dw0.a.Locked;
                    break;
                case 19:
                    aVar = dw0.a.Pending;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            switch (iArr[aVar2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    accentCircleBadge = new AccentCircleBadge(aVar);
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    accentCircleBadge = new WarningCircleBadge(aVar);
                    break;
                case 13:
                    accentCircleBadge = new SuccessCircleBadge(aVar);
                    break;
                case 14:
                case 15:
                    accentCircleBadge = new DangerCircleBadge(aVar);
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    accentCircleBadge = new InactiveCircleBadge(aVar);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            circleBadgeModel = accentCircleBadge;
        }
        return new RowDelegate.Model(strQ, new RowDelegate.Model.MainImage.Image40(glyphImage, circleBadgeModel, null, false, null, false, 60), textClause, null, 0, textClause2, null, null, 0, new tf(4, new ResourceImage(z ? R$drawable.uikit_icn_16_chevron_up : R$drawable.uikit_icn_16_chevron_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone20), (List) null, (ImageTransformations) null, (Clause) null, 246), true), true, null, false, null, null, null, null, null, null, new pse.a(ticketDetails.f90447a), null, 0, 0, 0, 0, 532673496);
    }

    @Override // ose.e
    public final List a() {
        return v.k(nb0.b(pb0.Companion, "DETAILED_TICKET_LOADING_HEADER_ID", false, 0, false, 30), new y30("DETAILED_TICKET_LOADING_ROW_ID"));
    }

    @Override // ose.e
    public final List b(TicketDetails details, Feedback feedback, ose.d orientation, boolean z) {
        a40 a40Var;
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (!(orientation instanceof ose.b)) {
            if (!(orientation instanceof ose.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ose.c cVar = (ose.c) orientation;
            return e(cVar.f229322a, cVar.f229323b, details, feedback, new q0(details, this, z, 11));
        }
        aim.e eVarB = u.b();
        eVarB.add(d(details, false));
        SectionContent.ProgressionSteps progressionSteps = details.f90449c;
        if (progressionSteps == null) {
            a40Var = null;
        } else {
            int i = progressionSteps.d;
            String str = details.f90447a;
            ArrayList arrayList = progressionSteps.f64180c;
            ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                Step step = (Step) obj2;
                String strK = com.google.android.gms.internal.mlkit_vision_face.a.k(i2, details.f90447a, "_STEP_");
                TextClause textClause = new TextClause(step.f64194a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Clause clauseA = ((s) this.f291771b).a(progressionSteps, step);
                if (clauseA == null) {
                    m70.a.c(t0.f186434a);
                    clauseA = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                }
                SectionContent.ProgressionSteps progressionSteps2 = progressionSteps;
                arrayList2.add(new h40(strK, textClause, clauseA, (step.f64198h != fr2.a.BUTTON || step.f64197g == null || step.f == null) ? i2 < i ? new f40(i40.NORMAL) : i2 == i ? new d40(i40.NORMAL) : e40.f164020a : c40.f163682a));
                i2 = i3;
                progressionSteps = progressionSteps2;
            }
            a40Var = new a40(str, arrayList2, Integer.valueOf(i), 0, R$attr.uikit_dp16, 8);
        }
        eVarB.add(a40Var);
        return d0.Z(u.a(eVarB));
    }

    @Override // ose.e
    public final List c(Data updates, TicketDetails details, Feedback feedback, ose.c orientation) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return (List) iii.c.f(updates, new uyh.w(this, 25, details, orientation), new z(this, 21, details, orientation), new f(this, 9, feedback, orientation));
    }

    public final List e(boolean z, boolean z3, TicketDetails ticketDetails, Feedback feedback, Function0 function0) {
        RowDelegate.Model modelD = d(ticketDetails, z);
        if (!z) {
            return u.c(modelD);
        }
        bp6.b feedbackWidgetMapper = this.f291772c;
        if (z3) {
            Collection collection = (Collection) function0.invoke();
            bp6.a style = bp6.a.FAQ;
            Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
            Intrinsics.checkNotNullParameter(style, "style");
            return l.e(modelD, d0.E0(feedback == null ? f0.f322471a : a.b(feedbackWidgetMapper.a(feedback, null, style), new vo8.b(2)), collection));
        }
        ArrayList arrayListE0 = d0.E0((Iterable) function0.invoke(), u.c(modelD));
        bp6.a style2 = bp6.a.FAQ;
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        Intrinsics.checkNotNullParameter(style2, "style");
        return d0.E0(feedback == null ? f0.f322471a : a.b(feedbackWidgetMapper.a(feedback, null, style2), new vo8.b(2)), arrayListE0);
    }
}
