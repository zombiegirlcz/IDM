package q6i;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldd.b f242610a;

    public d(q7i.a noteDelegate, ldd.b focusRequesterDelegate) {
        Intrinsics.checkNotNullParameter(noteDelegate, "noteDelegate");
        Intrinsics.checkNotNullParameter(focusRequesterDelegate, "focusRequesterDelegate");
        this.f242610a = focusRequesterDelegate;
    }
}
