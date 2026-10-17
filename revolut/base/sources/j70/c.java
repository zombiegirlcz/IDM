package j70;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    @NotNull
    private static final b Companion = new b(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g8.d f171826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f171827b;

    public c(g8.d performanceSpecs) {
        Intrinsics.checkNotNullParameter(performanceSpecs, "performanceSpecs");
        this.f171826a = performanceSpecs;
        this.f171827b = j.b(new ite.d(this, 2));
    }

    public final d a() {
        return (d) this.f171827b.getValue();
    }
}
