package suh;

import android.os.Parcelable;
import aw0.ka;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.workflow.engine.R$string;
import com.revolut.feature.workflow.engine.rfi.api.models.Answer;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Question;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import yp0.r;
import zhm.a0;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends iuh.j {

    @NotNull
    public static final k Companion = new k();

    public static InputTextDelegate.Model b(iuh.e eVar, String str, int i, Long l2, TextClause textClause) {
        TimeClause.Format monthAndYear;
        TimeClause timeClause = null;
        if (l2 != null) {
            long jLongValue = l2.longValue();
            int i2 = l.f265770a[((Question.Timeline) eVar.f168606a).e.d.ordinal()];
            if (i2 == 1) {
                TimeClause.Format.INSTANCE.getClass();
                monthAndYear = TimeClause.Format.f57959a;
            } else if (i2 == 2) {
                monthAndYear = new TimeClause.Format.MonthAndYear((ka) null, 3);
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                monthAndYear = new TimeClause.Format.Year(0);
            }
            timeClause = new TimeClause(jLongValue, monthAndYear, null, null, 12);
        }
        return r.a(new InputTextDelegate.Model(str, timeClause, textClause, null, null, null, null, false, null, false, false, 0, true, 0, false, false, false, null, false, false, 0, false, false, Integer.valueOf(i), -16777224, 130559));
    }

    @Override // iuh.j
    public final List a(iuh.e domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Answer answer = domainState.f168607b;
        Question question = domainState.f168606a;
        if (answer == null) {
            throw new IllegalStateException("Required value was null.");
        }
        boolean z = false;
        IntRange intRangeO = kotlin.ranges.f.o(0, ((Answer.Timeline) answer).f96533b.size());
        ArrayList arrayList = new ArrayList();
        vim.f it8 = intRangeO.iterator();
        while (true) {
            SmallActionButtonDelegate.Model model = null;
            if (!it8.f289625c) {
                Question.Timeline timeline = (Question.Timeline) question;
                String str = timeline.f;
                if (str != null) {
                    if (answer == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str2 = ((Answer.Timeline) answer).f96533b.size() < timeline.f105631g ? str : null;
                    if (str2 != null) {
                        SmallActionButtonDelegate.Model model2 = new SmallActionButtonDelegate.Model("ACTION_BUTTON_ID", h4.SEMIACCENT, new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        yp0.b.r(model2, R$attr.uikit_dp4, 0, R$attr.uikit_dp16, 0, 10);
                        model = model2;
                    }
                }
                return d0.E0(v.l(model), arrayList);
            }
            int iNextInt = it8.nextInt();
            Question.Timeline timeline2 = (Question.Timeline) question;
            ListSubheaderDelegate.Model model3 = new ListSubheaderDelegate.Model("INPUT_HEADER_ID", (Image) null, (Clause) new TextClause((String) timeline2.f105632h.get(iNextInt), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Image) null, (Clause) (iNextInt > 0 ? new TextLocalisedClause(R$string.workflow_timeline_action_remove, null, new Click(30, (Integer) null, (Object) null, "INPUT_HEADER_END_LABEL_ID", false), 10) : null), (String) null, (ListSubheaderDelegate.Model.a) new ListSubheaderDelegate.Model.a.b(z, z, true, 3), false, false, (Object) Integer.valueOf(iNextInt), (Parcelable) null, 0, 0, 0, 0, 64426);
            String strN = a0.d.n("INPUT_TEXT_ID_", iNextInt);
            if (answer == null) {
                throw new IllegalStateException("Required value was null.");
            }
            List list = ((Answer.Timeline) answer).f96533b;
            TextClause textClause = new TextClause(((Answer.Timeline.Item) list.get(iNextInt)).f96534a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            Question.Timeline.Item item = timeline2.e;
            Question.Timeline.Item item2 = timeline2.e;
            z = false;
            List listK = v.k(model3, new InputTextDelegate.Model(strN, textClause, new TextClause(item.f105633a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, false, false, 0, true, 0, false, false, false, null, false, false, 0, false, false, null, -16777224, 131071), new InputDualTextDelegate.Model("INPUT_DATE_ID", b(domainState, "INPUT_START_DATE_ID", iNextInt, ((Answer.Timeline.Item) list.get(iNextInt)).f96535b, new TextClause(item2.f105634b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), b(domainState, "INPUT_END_DATE_ID", iNextInt, ((Answer.Timeline.Item) list.get(iNextInt)).f96536c, new TextClause(item2.f105635c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new InputDualTextView.b.a(0), 40));
            yp0.b.k(listK, 0, 0, 0, 0, 31);
            a0.x(listK, arrayList);
        }
    }
}
