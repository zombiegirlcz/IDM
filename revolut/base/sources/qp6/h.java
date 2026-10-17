package qp6;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.onfido.android.sdk.capture.internal.camera.camerax.DefaultFrameSampler;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.feedback.impl.R$string;
import ip0.qr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    @NotNull
    private static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Integer num = domainState.f248298c;
        CharSequence charSequence = domainState.f248296a;
        lw0.a aVar = new lw0.a(new TextLocalisedClause(num != null ? num.intValue() : R$string.cx_feedback_feedback_bottom_sheet_header_hear_more, null, null, 14), null, null, null, false, 30);
        InputTextDelegate.Model model = new InputTextDelegate.Model("INPUT_LIST_ID", new TextClause(charSequence.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_nps_placeholder, null, null, 14), false, null, false, null, null, null, null, null, null, false, 280, null, false, false, false, false, null, 0, null, qr.f166041a, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -16809996, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, R$attr.uikit_dp0, R$attr.uikit_dp16, 0, 0, 12);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cx_feedback_feedback_bottom_sheet_submit, null, null, 14);
        boolean z = !d0.W(charSequence) && charSequence.length() <= 280;
        int i = R$attr.uikit_dp8;
        int i2 = R$attr.uikit_dp16;
        return new cii.b(null, v.k(model, new LargeActionButtonDelegate.Model("BUTTON_LIST_ID", defaultFilledButton, null, textLocalisedClause, z, null, null, i, i2, i2, i2, DefaultFrameSampler.DESIRED_FRAME_WIDTH)), aVar);
    }
}
