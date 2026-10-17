package df4;

import cli.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements j {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f113781a;

    public static final class a {
        private a() {
        }
    }

    public d() {
        this(false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f113781a == ((d) obj2).f113781a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f113781a);
    }

    public d(boolean z) {
        this.f113781a = z;
    }
}
