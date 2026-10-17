package hw1;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.apm.breb.api.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* JADX INFO: loaded from: classes20.dex */
public final class v implements cli.n {
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        m domainState = (m) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String strD = domainState.f156042a.d();
        InputTextDelegate.Model model = new InputTextDelegate.Model("KEY_INPUT_ID", new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.bre_b_new_contact_key_hint, null, null, 14), false, null, false, null, null, null, null, d0.W(strD) ? new ResourceImage(R$drawable.uikit_icn_24_scan_qr, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246) : null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, !d0.W(strD), null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536875020, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new t(zhm.u.c(model), !(domainState.f156042a instanceof av1.b));
    }
}
