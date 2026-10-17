package cv3;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class u implements Serializable {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f109270a;

    public u(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f109270a = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f109270a, ((u) obj2).f109270a);
    }

    public final int hashCode() {
        return this.f109270a.hashCode();
    }
}
