package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218575a;

    public m(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f218575a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f218575a, ((m) obj2).f218575a);
    }

    public final int hashCode() {
        return this.f218575a.hashCode();
    }
}
