package ulk;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.youTransactor.uCube.rpc.Constants;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static MoneyClause a(dj0.d dVar, boolean z) {
        return new MoneyClause(dVar.l(), new MoneyClause.Format.Defaults(k7.ALWAYS, null, false, false, 14), z ? new Custom(null, true, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION) : null, o9.NON_SENSITIVE);
    }
}
