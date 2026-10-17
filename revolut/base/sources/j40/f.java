package j40;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l2c.v;
import org.jetbrains.annotations.NotNull;
import v20.f0;
import v20.o;
import v30.c0;
import vkm.q;
import vkm.t1;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends a {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l30.b f171274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final os2.g f171275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j30.c f171276n;
    public final df0.b o;

    public f(l30.b chatProvider, os2.g idleRegistry, j30.c chatFeatureToggles, df0.b dateProvider) {
        Intrinsics.checkNotNullParameter(chatProvider, "chatProvider");
        Intrinsics.checkNotNullParameter(idleRegistry, "idleRegistry");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f171274l = chatProvider;
        this.f171275m = idleRegistry;
        this.f171276n = chatFeatureToggles;
        this.o = dateProvider;
    }

    @Override // yji.n
    public final void H2() {
        if (((l30.e) this.f171274l).i) {
            return;
        }
        V2(new e(this, null, 2), new yi5.b(29));
    }

    @Override // j40.a
    public final Flow Z2() {
        l30.e eVar = (l30.e) this.f171274l;
        t1 t1Var = eVar.f191836j;
        o oVar = eVar.f191831a;
        c0 feedType = c0.ASSISTANT;
        f0 f0Var = (f0) oVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        return q.q(new t38.e(t1Var, 24, mo3.a.g(rd0.e.b(f0Var.u.e(j6.a.q("read_", feedType.d()), w4l.h.f294642c)), null, new v(1), 1), new d(this, null, 0)));
    }

    @Override // j40.a
    public final void b3(NavBarMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.f(message.f58114a, "assistant")) {
            A2(new MainContainerScreenDestination.Slide(dy0.o.BOTTOM, true));
        }
    }

    @Override // j40.a
    public final void c3(NavBarMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Intrinsics.f(message.f58114a, "assistant")) {
            T2(new e(this, null, 0), new yi5.b(27));
        }
    }

    @Override // j40.a
    public final void d3() {
        A2(new MainContainerScreenDestination.Slide(dy0.o.BOTTOM, true));
    }
}
