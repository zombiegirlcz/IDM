package t6f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements p {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f268334a;

    public k(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f268334a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f268334a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f268334a, ((k) obj2).f268334a);
    }

    public final int hashCode() {
        return this.f268334a.hashCode();
    }
}
