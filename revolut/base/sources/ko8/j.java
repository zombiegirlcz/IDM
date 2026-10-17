package ko8;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements n {
    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause("Paste or enter the QR code data", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = domainState.f186270a;
        String str2 = str.length() > 0 ? str : null;
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_QR_DATA_INPUT", str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, textClause, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, R$attr.uikit_dp16, R$attr.uikit_dp8, 0, 0, 12);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58725a;
        LargeActionButtonDelegate.Model model2 = new LargeActionButtonDelegate.Model("ID_SUBMIT_ACTION", defaultFilledButton, null, new TextClause("Submit", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, "LOADING_TAG_SUBMIT_ACTION", null, null, null, 936);
        yp0.b.r(model2, R$attr.uikit_dp24, 0, 0, 0, 14);
        LargeActionButtonDelegate.Model model3 = new LargeActionButtonDelegate.Model("ID_PASTE_AND_SUBMIT_ACTION", defaultFilledButton, null, new TextClause("Paste and Submit", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, "LOADING_TAG_PASTE_AND_SUBMIT_ACTION", null, null, null, 936);
        yp0.b.r(model3, 0, 0, 0, 0, 15);
        return new h(new TextClause("Enter QR data", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(model, model2, model3));
    }
}
