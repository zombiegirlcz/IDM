package ucc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f279022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f279023b;

    public d(c id10, String title) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f279022a = id10;
        this.f279023b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f279022a == dVar.f279022a && Intrinsics.f(this.f279023b, dVar.f279023b);
    }

    public final int hashCode() {
        return this.f279023b.hashCode() + (this.f279022a.hashCode() * 31);
    }
}
