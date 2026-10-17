package grc;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.salary_switch.impl.R$string;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static c a(l lVar, String str, String str2, TextLocalisedClause textLocalisedClause, boolean z, int i) {
        TextClause textClause;
        boolean z3 = (i & 4) == 0;
        boolean z4 = (i & 8) == 0;
        TextLocalisedClause textLocalisedClause2 = (i & 16) != 0 ? null : textLocalisedClause;
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.salary_switch_mx_bank_account_input_title, null, null, 14);
        if (str != null) {
            HashMap map = im.c.f162274c;
            textClause = new TextClause(d0.H0(v13.d.l(str2, f0.f322471a).b(new jm.a(str, str.length()), true).f162271a.f175891b).toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = null;
        }
        InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_TEXT_LIST_ITEM_ID", textClause, textLocalisedClause3, null, false, textLocalisedClause2, null, null, null, z ? new ResourceImage(R$drawable.uikit_icn_24_camera, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, null, false, null, null, z3, false, 2, 0, null, false, true, null, true, null, false, true, false, str2, null, 0, -606212232, 65015);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new c(u.c(model), z4 && !z3);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        grc.a domainState = (grc.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        jrc.f fVar = domainState.f145962a;
        if (fVar instanceof jrc.e) {
            return a(this, ((jrc.e) fVar).f177988a.getValue(), domainState.f145963b, null, domainState.f145964c, 20);
        }
        if (fVar instanceof jrc.d) {
            return a(this, ((jrc.d) fVar).f177987a, domainState.f145963b, new TextLocalisedClause(R$string.salary_switch_mx_bank_account_input_validation_error, null, null, 14), domainState.f145964c, 8);
        }
        if (fVar instanceof jrc.c) {
            return a(this, ((jrc.c) fVar).f177986a, domainState.f145963b, null, domainState.f145964c, 28);
        }
        if (fVar == null) {
            return a(this, null, domainState.f145963b, null, domainState.f145964c, 28);
        }
        throw new NoWhenBranchMatchedException();
    }
}
