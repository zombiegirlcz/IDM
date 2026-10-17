package x0l;

import aw0.m6;
import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wyc.p;
import wyg.s;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static aw0.e a() {
        return new aw0.e(false, null, null, m6.c(n6.Companion, new TextLocalisedClause(R.string.common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, null, 1020), new aw0.d(new ResourceImage(R$drawable.uikit_icn_24_arrow_thin_down, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246)), null, 39);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        x0l.a domainState = (x0l.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (b) iii.c.f(domainState.f301652a, new p(this, 26), new s(this, 16), new x0b.h(this, 1));
    }
}
