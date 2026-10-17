package dl6;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.external_accounts.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.b f115710a;

    public i(zzl.b regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f115710a = regexMatcher;
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zA = ((zzl.c) this.f115710a).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", domainState.f115706a);
        String str = domainState.f115706a;
        TextLocalisedClause textLocalisedClause = (zA || str.length() <= 0) ? null : new TextLocalisedClause(R$string.pse_topup_email_input_validation_error, null, null, 14);
        List listC = u.c(new InputTextDelegate.Model("PSE_EMAIL_INPUT_ID", new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.pse_topup_email_input_hint, null, null, 14), null, false, textLocalisedClause, null, null, null, null, null, false, null, null, textLocalisedClause != null, false, 33, 0, null, false, false, null, true, null, false, false, false, null, null, 0, -539099272, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
        int i = R$attr.uikit_dp16;
        yp0.b.q(listC, 0, 0, i, i, 3);
        return new g(listC, zA);
    }
}
