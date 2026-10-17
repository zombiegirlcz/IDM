package ukf;

import aw0.k7;
import aw0.t0;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import u80.t;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f280736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f280737b;

    public c(qd0.b languageProvider, t ratesMoneyUtils) {
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f280736a = ratesMoneyUtils;
        this.f280737b = languageProvider;
    }

    public static CellDetailsDelegate.Model a(a3 transaction, TextLocalisedClause title, k7 signShowingPolicy) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(signShowingPolicy, "signShowingPolicy");
        return new CellDetailsDelegate.Model("ID_EXTRAS_AMOUNT", new t0((Clause) title, (Image) null, 0, false, 30), new MoneyClause(transaction.N1, new MoneyClause.Format.Defaults(signShowingPolicy, null, false, false, 14), null, null, 12), null, null, null, null, 0, null, false, false, null, null, 32760);
    }
}
