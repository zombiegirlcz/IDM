package ak8;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_profile.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.c f5746a;

    public l(zzl.c regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f5746a = regexMatcher;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        InputTextDelegate.Model model = new InputTextDelegate.Model("MAIL_LIST_ID", new TextClause(domainState.f5736a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.junior_profile_change_email_email_placeholder, null, null, 14), null, false, null, null, null, null, null, null, false, null, null, false, false, 1, 0, null, false, false, null, false, null, false, false, false, null, null, 0, -2097160, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, R$attr.uikit_dp24, 0, 0, 0, null, false, 62);
        List listC = u.c(model);
        String str = domainState.f5737b;
        String str2 = domainState.f5736a;
        return new h(listC, !Intrinsics.f(str, str2) && this.f5746a.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str2));
    }
}
