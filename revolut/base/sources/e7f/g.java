package e7f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements p {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123322a;

    public g(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123322a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f123322a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f123322a, ((g) obj2).f123322a);
    }

    public final int hashCode() {
        return this.f123322a.hashCode();
    }
}
