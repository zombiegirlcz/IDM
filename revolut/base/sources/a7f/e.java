package a7f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements p {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1862a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f1862a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f1862a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f1862a, ((e) obj2).f1862a);
    }

    public final int hashCode() {
        return this.f1862a.hashCode();
    }
}
