package jfb;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    @NotNull
    private static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f173844a;

    public x(gpk.c appVersionNameProvider) {
        Intrinsics.checkNotNullParameter(appVersionNameProvider, "appVersionNameProvider");
        this.f173844a = appVersionNameProvider;
    }

    public final String a(boolean z) {
        rlm.b bVar = Json.d;
        v vVar = new v((String) ((Lazy) this.f173844a.f145464b).getValue(), z);
        bVar.getClass();
        return p.a.p("window.appConfig = ", bVar.c(v.Companion.serializer(), vVar), ";");
    }
}
