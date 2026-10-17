package eu2;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.call_security_info.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        RowDelegate.Model model = new RowDelegate.Model("CALL_DETECTION_LIST_ID", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, false, null, false, 60), new TextLocalisedClause(R$string.in_app_calls_screen_call_detection_title, null, null, 14), null, 0, null, null, null, 0, new vf(domainState.f129477a && !domainState.f129478b, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869880);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new f(u.c(model));
    }
}
