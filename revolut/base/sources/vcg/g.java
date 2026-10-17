package vcg;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_travel_hotels_models.location.Coordinates;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import yv0.i;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Coordinates coordinates = domainState.f287691a.f93948a;
        ah0.a aVar = new ah0.a(coordinates.f97948a, coordinates.f97949b);
        yv0.b bVar = new yv0.b(new ResourceImage(R$drawable.uikit_icn_24_location_pin, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
        int i = R$attr.uikit_colorAccent;
        m70.a.c(t0.f186434a);
        return new e(aVar, new i(aVar, bVar, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, i, i, null, SyslogConstants.LOG_LOCAL3));
    }
}
