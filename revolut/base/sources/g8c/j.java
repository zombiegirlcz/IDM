package g8c;

import aw0.n6;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.revolutpay.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import ox0.b0;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f141347a;

    public j(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f141347a = regexMatcher;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("EMAIL_FIELD_LIST_ID", null, new TextLocalisedClause(R$string.revolut_pay_add_email_email_input_placeholder, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 32, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -538968070, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new h(u.c(model), new aw0.e(true, new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_add_email_bottom_note, null, null, 14), b0.ABOVE_BUTTONS, new n6(new TextLocalisedClause(com.revolut.feature.revolutpay.shared.R$string.revolut_pay_common_action_continue, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, ((zzl.c) this.f141347a).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", domainState.f141342a), null, null, 988), null, null, 48));
    }
}
