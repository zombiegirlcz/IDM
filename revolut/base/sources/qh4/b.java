package qh4;

import android.os.Bundle;
import com.revolut.feature.credit.application.plugins.impl.ui.rollee.RolleeScreen;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends yji.p {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f246451c;

    public b(z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f246451c = screen;
    }

    @Override // yji.p
    public final String Q() {
        return "ROLLEE_EXTENSION";
    }

    @Override // yji.r
    public final void e(Bundle state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ((RolleeScreen) this.f246451c).f3().restoreState(state);
    }

    @Override // yji.r
    public final void g(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        ((RolleeScreen) this.f246451c).f3().saveState(outState);
    }
}
