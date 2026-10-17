package wz1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.p;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.core.api.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f301348a;

    public h(k kVar) {
        this.f301348a = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List requests = (List) obj2;
        Intrinsics.checkNotNullParameter(requests, "requests");
        List list = requests;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (Iterator it8 = list.iterator(); it8.hasNext(); it8 = it8) {
            p02.a request = (p02.a) it8.next();
            c cVar = this.f301348a.f301352b;
            Intrinsics.checkNotNullParameter(request, "request");
            String strQ = j6.a.q("TopupRequestItem_", request.f231467a);
            a aVar = (a) cVar.f301340a;
            TextClause textClauseD = aVar.d(request);
            TextLocalisedClause textLocalisedClauseB = aVar.b(request);
            Intrinsics.checkNotNullParameter(request, "request");
            TimeClause timeClause = new TimeClause(oi0.d.c0(request.f), new TimeClause.Format.Pretty(q0.DATETIME), null, null, 12);
            t0 t0Var = t0.f186434a;
            Clause[] elements = {timeClause, new TextClause(m70.a.o(t0Var), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.apm_via_placeholder_prefix, v.k(new TextLocalisedClause(R$string.apm_topup_request_receiving_title, null, new Custom(Integer.valueOf(R$attr.uikit_colorOrange), false, null, false, null, 254), 10), textLocalisedClauseB), null, 12)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            CompositeClause compositeClause = new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14);
            ContactImage contactImageC = aVar.c(request);
            LayeredImage.Companion companion = LayeredImage.INSTANCE;
            int i = R$drawable.uikit_icn_16_hourglass;
            int i2 = R$attr.uikit_colorGroupedBackground;
            m mVar = new m(contactImageC, companion.d(i, R$attr.uikit_colorOrange, i2, Integer.valueOf(i2), 2.0f, 2.0f, Float.valueOf(16.0f)), (ProgressStyle) null, 4);
            MoneyClause moneyClauseA = aVar.a(request);
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            arrayList.add(new ActionWidgetDelegate.Model(strQ, textClauseD, compositeClause, mVar, new p(moneyClauseA, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new com.revolut.core.ui_kit.delegates.k(new TextLocalisedClause(R$string.apm_topup_request_receiving_cta_accept, null, null, 14), new TextLocalisedClause(R$string.apm_topup_request_receiving_cta_decline, null, null, 14), null, null, Constants.TAG_FC_SPEED_MODE), null, request, null, true, 4416));
        }
        return arrayList;
    }
}
