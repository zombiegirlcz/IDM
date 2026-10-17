package qg9;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {
    @Override // cli.n
    public final o c(j jVar) {
        String str;
        TextClause textClause;
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        String str2 = domainState.f245703a;
        String str3 = domainState.f245704b;
        if (str3 != null) {
            textClause = new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            str = str3;
        } else {
            str = str3;
            textClause = null;
        }
        m70.a.c(t0.f186434a);
        InputTextDelegate.Model model = new InputTextDelegate.Model(str2, textClause, new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return new g(u.c(model), !(str == null || d0.W(str)));
    }
}
