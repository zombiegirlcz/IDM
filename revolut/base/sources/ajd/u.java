package ajd;

import aw0.o9;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.faq.R$string;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import ip0.jh0;
import ip0.lh0;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements jki.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5562a = 0;

    public u(kg0.c editFaqFeedbackScreenStateMapper) {
        Intrinsics.checkNotNullParameter(editFaqFeedbackScreenStateMapper, "editFaqFeedbackScreenStateMapper");
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        nh nhVar;
        boolean z = true;
        switch (this.f5562a) {
            case 0:
                h domainState = (h) iVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                String str = domainState.f5544c;
                int i = 0;
                if (str != null && !d0.W(str)) {
                    z = false;
                }
                Data data = domainState.f5543b;
                return new o(data == null ? f0.f322471a : (List) iii.c.f(t1.t(data, domainState.e), new a2g.p(this, z), new ah1.p(11), new t(this, z, domainState, i)));
            case 1:
                i8d.a domainState2 = (i8d.a) iVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                List list = domainState2.f159498a;
                Set set = domainState2.f159499b;
                kg0.a domainState3 = new kg0.a(domainState2.f159500c, list, set);
                Intrinsics.checkNotNullParameter(domainState3, "domainState");
                TextLocalisedClause screenTitle = new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_title, null, null, 14);
                TextLocalisedClause submitAction = new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_action, null, null, 14);
                boolean zIsEmpty = true ^ set.isEmpty();
                ArrayList items = new ArrayList();
                if (list.isEmpty()) {
                    nhVar = null;
                } else {
                    List<FeedbackTag> list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    for (FeedbackTag feedbackTag : list2) {
                        arrayList.add(new SuggestionsBarDelegate.Suggestion(j6.a.q("LIST_ID_TAG.", feedbackTag.f73133a), new TextClause(feedbackTag.f73134b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, domainState3.f183894b.contains(feedbackTag) ? lh0.ACCENT : lh0.SEMIACCENT, null, false, new kg0.b(feedbackTag), null, 368));
                    }
                    nhVar = new nh("LIST_ID_TAGS_BOX", arrayList, null, jh0.FLEXBOX, 0, 0, 0, 0, 0, 32756);
                }
                if (nhVar != null) {
                    items.add(nhVar);
                }
                InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_COMMENT", new TextClause(domainState3.f183895c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.support_faq_feedback_form_dialog_field_title, null, null, 14), null, null, null, null, true, 280, false, false, 0, false, 0, false, false, true, null, false, false, 0, false, false, null, -1090568200, 131071);
                yp0.b.l(model, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
                items.add(model);
                Unit unit = Unit.f186387a;
                Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
                Intrinsics.checkNotNullParameter(submitAction, "submitAction");
                Intrinsics.checkNotNullParameter(items, "items");
                return new i8d.b(screenTitle, submitAction, items, zIsEmpty);
            default:
                ywi.e domainState4 = (ywi.e) iVar;
                Intrinsics.checkNotNullParameter(domainState4, "domainState");
                return (ywi.f) iii.c.f(domainState4.f317445a, new yv8.j(this, 10), new yw9.j(this, 4), new y5g.l(this, 16));
        }
    }

    public u(bjd.c shopsSearchLayoutMapper) {
        Intrinsics.checkNotNullParameter(shopsSearchLayoutMapper, "shopsSearchLayoutMapper");
    }

    public u(vxi.a amenitiesItemMapper, wxi.a amenitiesTypeResolver) {
        Intrinsics.checkNotNullParameter(amenitiesItemMapper, "amenitiesItemMapper");
        Intrinsics.checkNotNullParameter(amenitiesTypeResolver, "amenitiesTypeResolver");
    }
}
