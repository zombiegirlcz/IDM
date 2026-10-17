package w7f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements p {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f295518a;

    public c(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f295518a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f295518a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f295518a, ((c) obj2).f295518a);
    }

    public final int hashCode() {
        return this.f295518a.hashCode();
    }
}
