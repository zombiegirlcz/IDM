package p3h;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListCellDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.SuggestionsBarDelegate;
import com.revolut.core.ui_kit.delegates.j8;
import com.revolut.core.ui_kit.delegates.nh;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import f01.c;
import ip0.jh0;
import java.util.ArrayList;
import java.util.List;
import jel.k1;
import kotlin.jvm.internal.Intrinsics;
import mx0.s5;
import mx0.u5;
import s2h.a;
import s2h.h;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f232752a;

    public a(c uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f232752a = uiKitResources;
    }

    public static PlainTextDelegate.Model d(String str, boolean z) {
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R.string.common_action_see_less, null, null, 14) : new TextLocalisedClause(R.string.common_action_see_more, null, null, 14);
        return new PlainTextDelegate.Model("bio.content", (Clause) null, (Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), z ? new u5(2, textLocalisedClause) : new s5(3, textLocalisedClause), (UrlImage) null, false, (pa) null, z ? a.b.f259344a : a.c.f259345a, (AnalyticsContext) null, 0, 0, 0, 0, 64462);
    }

    public static ListCellDelegate.Model e(int i, String str) {
        return new ListCellDelegate.Model("bio.kid", new j8(new ResourceImage(R$drawable.uikit_icn_24_document, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246)), new TextLocalisedClause(i, null, new Click(30, (Integer) null, (Object) null, "bio.kid.link", false), 10), null, false, new s2h.c(str), null, 0, 0, 0, 0, 4056);
    }

    public final nh c(List list) {
        List<k1> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (k1 k1Var : list2) {
            int iA = this.f232752a.a(k1Var.f173491b);
            arrayList.add(new SuggestionsBarDelegate.Suggestion(j6.a.q("suggestion-list-id-", k1Var.f173490a), new TextClause(k1Var.f173490a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ResourceImage(iA, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, null, 504));
        }
        return new nh("actions-delegate-id", arrayList, jh0.FLEXBOX, R$attr.uikit_dp16, 0, 0, 0, 0, 496);
    }
}
