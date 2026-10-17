package h5f;

import aah.m;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.wealth.api.ui.extensions.disclaimers.WealthDisclaimersContract$Disclaimer$Investment;
import ip0.ak0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements t1h.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f149548a;

    public c(m disclaimersMapper) {
        Intrinsics.checkNotNullParameter(disclaimersMapper, "disclaimersMapper");
        this.f149548a = disclaimersMapper;
    }

    @Override // t1h.d
    public final List a(t1h.b disclaimer) {
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        a aVar = disclaimer instanceof a ? (a) disclaimer : null;
        if (aVar == null) {
            return f0.f322471a;
        }
        hel.b bVar = aVar.f149547a.f318564b;
        CompositeClause compositeClauseA = q1.a(this.f149548a, u.c(new WealthDisclaimersContract$Disclaimer$Investment.Withdraw(bVar)), bVar);
        if (compositeClauseA == null) {
            return f0.f322471a;
        }
        ak0 ak0Var = new ak0(null, null, 3);
        int i = R$attr.uikit_dp0;
        return u.c(new TextDelegate.Model("STOCK_WITHDRAW_DISCLAIMER_ID", compositeClauseA, false, ak0Var, null, null, i, i, 0, 0, 1652));
    }
}
