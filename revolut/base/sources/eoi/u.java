package eoi;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import org.jetbrains.annotations.NotNull;
import uo.q0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f127978a;

    public u(q0 screenNameFinder) {
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        this.f127978a = screenNameFinder;
    }

    public final String a(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        String str = this.f127978a.e(screen).f281496a;
        return str.length() > 100 ? f0.V0(100, str) : str;
    }

    public final String b(Object screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        String name = screen.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name.length() > 100 ? f0.V0(100, name) : name;
    }
}
