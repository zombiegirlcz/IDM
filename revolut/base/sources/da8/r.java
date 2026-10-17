package da8;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import d7j.o0;
import d7j.p0;
import grl.b4;
import ip0.ck0;
import ip0.qd0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements cli.n {
    public static SelectableDelegate.Model a(String str, TextLocalisedClause textLocalisedClause, boolean z, ConsentMechanics.OptOut optOut) {
        return new SelectableDelegate.Model(str, new TextDelegate.Model(str, textLocalisedClause, true, new ck0(0), optOut, null, 0, 0, 0, 0, b4.EXPIRED_OR_INVALID_KEY_VALUE), z ? qd0.SELECTED : qd0.UNSELECTED, null, null, false, null, null, null, false, 32760);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(t1.t(domainState.f112475a, domainState.f112476b), new p0(this, 27), new o0(14), new cf1.h(this, domainState, 25));
    }
}
