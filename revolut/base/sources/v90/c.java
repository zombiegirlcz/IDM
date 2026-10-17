package v90;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.DeeplinkScreen;
import kotlin.jvm.internal.Intrinsics;
import q90.m4;
import q90.z0;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends a {
    @Override // v90.a
    public final BackendScreen a(m4 m4Var) {
        z0 screen = (z0) m4Var;
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new DeeplinkScreen(screen.getId(), screen.getLink(), screen.getPreviousViewId(), pd.b.k(screen.getCloseForm()));
    }

    @Override // v90.a
    public final m4 b(BackendScreen backendScreen) {
        DeeplinkScreen screen = (DeeplinkScreen) backendScreen;
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new z0(screen.f63390a, screen.d, screen.f63391b, Boolean.valueOf(screen.f63392c));
    }
}
