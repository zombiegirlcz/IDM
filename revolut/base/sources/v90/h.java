package v90;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.StatusDialogScreen;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import org.jetbrains.annotations.NotNull;
import q90.m4;
import q90.o3;
import xl2.d0;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends v90.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f286959a = r0.k(new Pair("SUCCESS", d0.SUCCESS), new Pair("ERROR", d0.ERROR), new Pair("EXIT", d0.EXIT), new Pair("PENDING", d0.PENDING));

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static StatusDialogScreen c(o3 screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        String id10 = screen.getId();
        String previousViewId = screen.getPreviousViewId();
        String title = screen.getTitle();
        String description = screen.getDescription();
        d0 d0Var = (d0) u1.u(screen.getDialogType(), f286959a);
        String actionLabel = screen.getActionLabel();
        if (screen.getDeeplink() == null) {
            actionLabel = null;
        }
        return new StatusDialogScreen(id10, title, description, d0Var, actionLabel, screen.getDeeplink(), screen.getAttributes(), previousViewId);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static o3 d(StatusDialogScreen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return new o3(screen.f63658a, screen.f63662h, screen.f63659b, screen.f63660c, u1.g(screen.d, f286959a), screen.f, screen.e, screen.f63661g);
    }

    @Override // v90.a
    public final /* bridge */ /* synthetic */ BackendScreen a(m4 m4Var) {
        return c((o3) m4Var);
    }

    @Override // v90.a
    public final /* bridge */ /* synthetic */ m4 b(BackendScreen backendScreen) {
        return d((StatusDialogScreen) backendScreen);
    }
}
