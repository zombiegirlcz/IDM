package vni;

import aw0.n6;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CodeEditorDelegate;
import com.revolut.core.ui_kit.delegates.z3;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.otp.input.R$string;
import ip0.ab;
import ip0.bb;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements n {
    @Override // cli.n
    public final o c(j jVar) {
        b domainState = (b) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_description, null, null, 14), new lw0.c(new GlyphImage(R$drawable.uikit_icn_24_change_passcode, null, null, 6)), null, false, 24);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.revolut_sso_confirm_push_screen_primary_action, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, domainState.f290814c, null, null, 988), null, null, 55), u.c(new z3("LIST_ID_OTP_CODE", domainState.f290812a, ab.DIGITS_6, CodeEditorDelegate.a.b.f52102a, domainState.f290813b, bb.CENTER_HORIZONTAL, true, false, R$attr.uikit_dp8, R$attr.uikit_dp16, 0, 0, 3200)), aVar);
    }
}
