package df4;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.application.plugins.impl.ui.offer.animated_intro.AnimatedIntroScreenContract$InputData;
import com.revolut.feature.credit.core.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedIntroScreenContract$InputData f113787a;

    public h(AnimatedIntroScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f113787a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        hs3.c cVar = this.f113787a.f68076a;
        String str = cVar.f154870a;
        aw0.e eVar = null;
        TextLocalisedClause textLocalisedClause = str != null ? new TextLocalisedClause(R$string.offer_animated_intro_title, u.c(str), new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 8) : null;
        String str2 = cVar.f154871b;
        TextLocalisedClause textLocalisedClause2 = str2 != null ? new TextLocalisedClause(R$string.offer_animated_intro_description, u.c(str2), new Custom(Integer.valueOf(R$attr.uikit_colorWhite), false, null, false, null, 254), 8) : null;
        String str3 = cVar.f154872c;
        if (str3 != null) {
            String str4 = cVar.d;
            eVar = new aw0.e(false, str4 != null ? new TextLocalisedClause(R$string.offer_animated_intro_disclaimer, u.c(str4), null, 12) : null, null, new n6(new TextLocalisedClause(R$string.offer_animated_intro_button, u.c(str3), null, 12), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 53);
        }
        return new f(textLocalisedClause, textLocalisedClause2, eVar, !domainState.f113781a);
    }
}
