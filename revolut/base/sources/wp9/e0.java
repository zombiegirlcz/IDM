package wp9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements cli.p {

    @NotNull
    public static final d0 Companion = new d0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f299181b;

    public e0(List items, r buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f299180a = items;
        this.f299181b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f299180a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f299180a, e0Var.f299180a) && Intrinsics.f(this.f299181b, e0Var.f299181b);
    }

    public final int hashCode() {
        return this.f299181b.hashCode() + (this.f299180a.hashCode() * 31);
    }
}
