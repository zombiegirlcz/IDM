package l8f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements p {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f192978a;

    public d(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f192978a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f192978a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f192978a, ((d) obj2).f192978a);
    }

    public final int hashCode() {
        return this.f192978a.hashCode();
    }
}
