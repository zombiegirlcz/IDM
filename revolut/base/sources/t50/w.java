package t50;

import aw0.n6;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import ip0.f90;
import ip0.qr;
import ip0.rr;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import k50.y;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f268033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z40.c f268034b;

    public w(h inputData, z40.c chatExperienceRatingUiFactory, v rateChatTagsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(chatExperienceRatingUiFactory, "chatExperienceRatingUiFactory");
        Intrinsics.checkNotNullParameter(rateChatTagsMapper, "rateChatTagsMapper");
        this.f268033a = inputData;
        this.f268034b = chatExperienceRatingUiFactory;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        List listC;
        String strD;
        y domainState = (y) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        z30.e eVar = domainState.f181290a;
        Set set = domainState.f181292c;
        aw0.e eVar2 = null;
        lw0.a aVar = new lw0.a((eVar == null || (strD = eVar.d()) == null) ? new TextLocalisedClause(R$string.chat_rate_1click_title, null, null, 14) : new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, 30);
        z30.j jVar2 = domainState.f181291b;
        if (eVar == null) {
            f90 f90Var = new f90("LIST_ID_EXPRESSION_RATING", this.f268034b.c(jVar2), new TextLocalisedClause(R$string.chat_rate_1click_title, null, null, 14), null, 56);
            yp0.b.r(f90Var, 0, 0, 0, 0, 15);
            listC = zhm.u.c(f90Var);
        } else {
            List listA = v.a(eVar, jVar2, set);
            String str = domainState.d;
            List list = listA;
            boolean zIsEmpty = list.isEmpty();
            boolean z = domainState.f181293g;
            InputTextDelegate.Model model = new InputTextDelegate.Model("LIST_ID_INPUT", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.chat_rate_feedback_placeholder, null, null, 14), false, null, null, null, null, null, null, false, 500, null, false, false, 16385, 0, !zIsEmpty ? rr.f166227a : qr.f166041a, false, z, null, false, null, false, false, false, null, null, 0, -86016012, 65534);
            yp0.b.r(model, 0, 0, 0, 0, 15);
            ArrayList arrayListF1 = d0.f1(list);
            arrayListF1.add(model);
            listC = arrayListF1;
        }
        if (eVar != null) {
            int length = domainState.d.length();
            boolean z3 = 1 <= length && length < 501;
            boolean zIsEmpty2 = set.isEmpty();
            eVar2 = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.chat_rate_footer_submit, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, z3 || !zIsEmpty2, new AnalyticsContext(z50.a.a(AnalyticsContext.INSTANCE, this.f268033a.f268016a)), null, 920), null, null, 55);
        }
        return new cii.b(eVar2, listC, aVar);
    }
}
