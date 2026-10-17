package a0l;

import android.text.InputFilter;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements cli.n {
    public final List a(xel.f document, InputFilter.AllCaps inputFilter) {
        Clause textClause;
        Intrinsics.checkNotNullParameter(document, "document");
        Intrinsics.checkNotNullParameter(inputFilter, "inputFilter");
        xel.c cVar = document.f304713a;
        String str = cVar.i;
        if (str == null) {
            str = "";
        }
        TextClause textClause2 = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause3 = new TextClause(cVar.f304707c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        boolean z = document.f304715c && !document.f304714b;
        if (z) {
            textClause = new TextLocalisedClause(R$string.wealth_trade_onboarding_add_info_documents_number_error, null, null, 14);
        } else {
            String str2 = cVar.d;
            textClause = str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model(cVar.f304706b, textClause2, textClause3, null, false, textClause, null, null, null, null, null, false, null, null, z, false, 524288, 0, null, false, true, null, true, u.c(inputFilter), false, false, false, null, null, 0, -1679949960, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, R$attr.uikit_dp32, 0, 0, 0, null, false, 62);
        return u.c(model);
    }

    public final List b(xel.f document) {
        Intrinsics.checkNotNullParameter(document, "document");
        IconNavBarMenuItem iconNavBarMenuItemA = IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "READ_MORE", new ResourceImage(R$drawable.uikit_icn_24_question_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124);
        if (document.f304713a.f304710j == null) {
            iconNavBarMenuItemA = null;
        }
        NavBarMenuItem[] elements = {iconNavBarMenuItemA, Intrinsics.f(document.f304713a.f, Boolean.TRUE) ? new TextNavBarMenuItem("SKIP", new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_skip, null, null, 14), null, null, 12) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        xel.f fVar = domainState.f426a;
        List listA = a(fVar, new InputFilter.AllCaps());
        xel.c cVar = fVar.f304713a;
        TextClause textClause = new TextClause(cVar.f304707c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = cVar.e;
        if (str == null) {
            str = "";
        }
        return new h(listA, new g(textClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), b(fVar)), new c(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14), fVar.f304714b));
    }
}
