package b47;

import a2f.q;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, false, 0, 0, 31684);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new cii.b(null, (List) iii.c.f(domainState.f12188a, new b0a.j(this, 14), new axd.e(this, 23), new q(26, domainState, this)), new lw0.a(new TextLocalisedClause(com.revolut.feature.freelancer.impl.R$string.freelancer_tax_profile_reminder_header_title, null, null, 14), null, null, null, false, 30));
    }
}
