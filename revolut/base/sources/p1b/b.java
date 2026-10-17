package p1b;

import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.ui.login.pin.LoginScreenContract$Configuration;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lwl.n;
import lwl.o;

/* JADX INFO: loaded from: classes13.dex */
public final class b {
    public final NaviCommand a(asi.c sessionState) {
        Intrinsics.checkNotNullParameter(sessionState, "sessionState");
        int i = a.f231884a[sessionState.ordinal()];
        if (i == 1 || i == 2) {
            return DummyCommand.f98635a;
        }
        if (i == 3) {
            o.Companion.getClass();
            return com.revolut.retail.core.navigation.a.a(new ActivityNavigateCommand(n.a(), null, null, null, 0, null, null, null, null, false, 1022));
        }
        if (i != 4 && i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        o.Companion.getClass();
        return new ActivityNavigateCommand(n.a(), new LoginScreenContract$Configuration(sab.b.SIGN_LOGIN, null, null, null, 126), null, null, 0, null, null, null, new ActivityAnimation.ContentTransition(false), false, 764);
    }
}
