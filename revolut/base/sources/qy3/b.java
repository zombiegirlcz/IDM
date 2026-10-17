package qy3;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f250140a;

    public b(Map parameters) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f250140a = parameters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f250140a, ((b) obj2).f250140a);
    }

    public final int hashCode() {
        return this.f250140a.hashCode();
    }
}
