package dfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 implements z0, y0 {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vkm.z1 f113903a;

    public static final class a {
        private a() {
        }
    }

    public a1() {
        vkm.z1 internalDeeplinkActions = vkm.q.b(10, 1, ukm.f.DROP_OLDEST);
        Intrinsics.checkNotNullParameter(internalDeeplinkActions, "internalDeeplinkActions");
        this.f113903a = internalDeeplinkActions;
    }

    public final boolean a() {
        return ((Number) ((wkm.y) this.f113903a.l()).getValue()).intValue() > 0;
    }
}
