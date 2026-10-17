package b59;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a59.a f12475a;

    public b(a59.a mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f12475a = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f12475a == ((b) obj2).f12475a;
    }

    public final int hashCode() {
        return this.f12475a.hashCode();
    }
}
