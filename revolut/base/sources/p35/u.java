package p35;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class u implements Serializable {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u f232674b = new u(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f232675a;

    public u(boolean z) {
        this.f232675a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && this.f232675a == ((u) obj2).f232675a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f232675a);
    }
}
