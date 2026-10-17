package vse;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.be_driven_design.models.domain.SectionContent;
import com.revolut.feature.be_driven_design.models.domain.Step;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.tickets.api.models.TicketDetails;
import ip0.s7;
import ip0.w40;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import soc.f;
import vq5.x;
import yxc.r;
import z9l.i;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements ose.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f291773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bp6.b f291774b;

    public e(i progressionStepsMapper, bp6.b feedbackWidgetMapper) {
        Intrinsics.checkNotNullParameter(progressionStepsMapper, "progressionStepsMapper");
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        this.f291773a = progressionStepsMapper;
        this.f291774b = feedbackWidgetMapper;
    }

    public static CellDetailsDelegate.Model e(TicketDetails ticketDetails, boolean z) {
        return new CellDetailsDelegate.Model(j6.a.q("TICKET_HEADER_", ticketDetails.f90447a), new CompositeClause(v.k(new TextClause(ticketDetails.f90448b.f64127a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(z ? R$drawable.uikit_icn_16_chevron_up_small : R$drawable.uikit_icn_16_chevron_down_small, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, 0, new pse.a(ticketDetails.f90447a), null, null, null, null, false, 0, 0, 31720);
    }

    @Override // ose.e
    public final List a() {
        return v.k(new s7("DETAILED_TICKET_LOADING_HEADER_ID", 0, 0, 0, 0, false, null, 126), new w40("DETAILED_TICKET_LOADING_ROW_ID"));
    }

    @Override // ose.e
    public final List b(TicketDetails details, Feedback feedback, ose.d orientation, boolean z) {
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation.equals(ose.b.f229321a)) {
            return d(details, z);
        }
        if (!(orientation instanceof ose.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((ose.c) orientation).f229322a) {
            return d(details, z);
        }
        CellDetailsDelegate.Model modelE = e(details, true);
        SectionContent.ProgressionSteps progressionSteps = details.f90449c;
        Collection collectionA = progressionSteps != null ? i.a(this.f291773a, progressionSteps, true, null, null, details.f90447a, z, 12) : f0.f322471a;
        bp6.a style = bp6.a.TICKETS;
        bp6.b feedbackWidgetMapper = this.f291774b;
        Intrinsics.checkNotNullParameter(feedbackWidgetMapper, "feedbackWidgetMapper");
        Intrinsics.checkNotNullParameter(style, "style");
        Collection collectionB = feedback == null ? f0.f322471a : a.b(feedbackWidgetMapper.a(feedback, null, style), new vo8.b(2));
        ArrayList arrayList = new ArrayList();
        arrayList.add(modelE);
        arrayList.addAll(collectionA);
        arrayList.addAll(collectionB);
        return arrayList;
    }

    @Override // ose.e
    public final List c(Data updates, TicketDetails details, Feedback feedback, ose.c orientation) {
        Intrinsics.checkNotNullParameter(updates, "updates");
        Intrinsics.checkNotNullParameter(details, "details");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return (List) iii.c.f(updates, new x(this, 11), new vh9.b(this, details), new f(this, 10, feedback, orientation));
    }

    public final ArrayList d(TicketDetails ticketDetails, boolean z) {
        Iterable iterableC;
        CellDetailsDelegate.Model modelE = e(ticketDetails, false);
        SectionContent.ProgressionSteps progressionSection = ticketDetails.f90449c;
        if (progressionSection != null) {
            int i = progressionSection.d;
            String listIdPrefix = ticketDetails.f90447a;
            r rVar = (r) this.f291773a;
            Intrinsics.checkNotNullParameter(progressionSection, "progressionSection");
            Intrinsics.checkNotNullParameter(listIdPrefix, "listIdPrefix");
            iterableC = u.c(rVar.c(progressionSection, (Step) progressionSection.f64180c.get(i), i, true, true, listIdPrefix, z, null, null));
        } else {
            iterableC = f0.f322471a;
        }
        return d0.E0(iterableC, u.c(modelE));
    }
}
