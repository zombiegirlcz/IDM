package ash;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8930b;

    public c(List models, b state) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f8929a = models;
        this.f8930b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8929a, cVar.f8929a) && this.f8930b == cVar.f8930b;
    }

    public final int hashCode() {
        return this.f8930b.hashCode() + (this.f8929a.hashCode() * 31);
    }
}
