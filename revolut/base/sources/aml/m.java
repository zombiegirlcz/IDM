package aml;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import com.revolut.sso.api.models.ConsentChallenge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements vil.g {

    @NotNull
    public static final k Companion = new k();

    public m(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public final np0.b a(ConsentChallenge data, long j2, long j3) {
        String str;
        Intrinsics.checkNotNullParameter(data, "data");
        ConsentChallenge.Operation f105927g = data.getF105927g();
        return new np0.b("timer_delegate_id", j2, j3, (f105927g == null || (str = f105927g.f105906a) == null) ? new TextLocalisedClause(R$string.revolut_sso_login_confirmation_title, null, null, 14) : new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aim.e b(com.revolut.sso.api.models.ConsentChallenge r36, boolean r37) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aml.m.b(com.revolut.sso.api.models.ConsentChallenge, boolean):aim.e");
    }
}
