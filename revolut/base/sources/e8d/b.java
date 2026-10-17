package e8d;

import aw0.s0;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsSingleButtonDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.shared.help_centre.impl.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import v20.d1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    @NotNull
    public static final C0723b Companion = new C0723b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f123631a = new a();

        private a() {
        }
    }

    /* JADX INFO: renamed from: e8d.b$b, reason: collision with other inner class name */
    public static final class C0723b {
        private C0723b() {
        }
    }

    public static s0 a(d1 d1Var) {
        return d1Var != null ? new s0(new TextLocalisedClause(R$string.help_center_section_need_more_help_action_v2_chat, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_chat, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), 10) : new s0(new TextLocalisedClause(R$string.help_center_section_need_more_help_action_chat, null, null, 14), (ResourceImage) null, 14);
    }

    public static List b(boolean z, d1 d1Var) {
        Object model = null;
        if (z && d1Var != null) {
            model = new CellDetailsTwinButtonsDelegate.Model(new t0((Clause) new TextLocalisedClause(R$string.help_center_section_need_more_help_title, null, null, 14), (Image) null, 0, false, 30), a(d1Var), new s0(new TextLocalisedClause(R$string.help_center_section_need_more_help_action_v2_call_inbound, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), 10), d1Var);
        } else if (z) {
            model = new CellDetailsSingleButtonDelegate.Model("NEED_MORE_HELP_LIST_ID", new t0((Clause) new TextLocalisedClause(R$string.help_center_section_need_more_help_title, null, null, 14), (Image) null, 0, false, 30), a(null), a.f123631a, null, 104);
        }
        if (model == null) {
            return f0.f322471a;
        }
        List listC = u.c(model);
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
