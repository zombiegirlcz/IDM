package mp6;

import aw0.o9;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.feedback.impl.R$string;
import ip0.d80;
import ip0.n80;
import ip0.r80;
import ip0.sr;
import ip0.t80;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import lk7.p;
import org.jetbrains.annotations.NotNull;
import rp0.t;
import rp0.w;
import rp0.y;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ep6.b {

    @NotNull
    public static final C1174a Companion = new C1174a();

    /* JADX INFO: renamed from: mp6.a$a, reason: collision with other inner class name */
    public static final class C1174a {
        private C1174a() {
        }
    }

    public static ActionsView.Item a(FeedbackTag feedbackTag, Set set) {
        return new ActionsView.Item(feedbackTag.f73133a, set.contains(feedbackTag) ? mx0.d.ACCENT : mx0.d.SEMIBLACK, false, null, null, new TextClause(feedbackTag.f73134b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, null, false, null, null, feedbackTag, null, 24476);
    }

    public static n80 b(int i, int i2) {
        return new n80(new TextLocalisedClause(i, null, null, 14), new d80(new ResourceImage(i2, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, new ImageTransformations(null, null, null, null, null, 42, 42, 31), (Clause) null, 182)));
    }

    public static y c(List list) {
        return new y(list, new t(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_rating_title, null, null, 14), null, new w(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_skip, null, null, 14), "RATE_SKIP_LIST_ID"), 26), rp0.l.WINDOW, 0, null, null, 1000);
    }

    public static List d(Integer num) {
        List listC = u.c(new t80("RATE_ITEM_LIST_ID", null, new r80(b(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_poor, R$drawable.uikit_icn_24_social_dislike), b(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_ok, R$drawable.uikit_icn_24_social_like), b(com.revolut.core.ui_kit_core.R$string.uikit_widget_rating_great, R$drawable.uikit_icn_24_double_thumbs)), num, false, null, 1010));
        yp0.b.k(listC, 0, R$attr.uikit_dp16, 0, 0, 29);
        return listC;
    }

    public static InputTextDelegate.Model f(CharSequence value, TextLocalisedClause placeholder, sr style, boolean z) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(style, "style");
        InputTextDelegate.Model model = new InputTextDelegate.Model("FEEDBACK_EXTENSION_INPUT_LIST_ID", new TextClause(value.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, placeholder, false, null, false, null, null, null, null, null, null, false, 280, null, false, false, false, false, null, 0, null, style, false, false, null, null, true, null, false, z, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -553680908, 65534);
        yp0.b.r(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
        return model;
    }

    public final y e(Data data, Set chosenTags, CharSequence comment, sr inputStyle) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(chosenTags, "chosenTags");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(inputStyle, "inputStyle");
        return new y((List) iii.c.f(data, new ml3.y(this, inputStyle), new mh1.e(26), new p(this, chosenTags, comment, inputStyle)), new t(new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_header, null, null, 14), null, null, 30), null, 0, null, null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
    }
}
