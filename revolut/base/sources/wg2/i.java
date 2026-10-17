package wg2;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.upi.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List listC = u.c(new InputTextDelegate.Model("INPUT_ID_OR_MOBILE_LIST_ID", new TextClause(domainState.f297220a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.upi_id_mobile_input_text, null, null, 14), false, null, false, null, null, null, null, new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536875020, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        yp0.b.q(listC, 0, R$attr.uikit_dp0, 0, 0, 13);
        return new f(d0.E0(u.c(new IconDelegate.Model("UPI_LOGO_LIST_ID", te2.a.f270024a, null, null, 124)), listC), domainState.f297221b != null);
    }
}
