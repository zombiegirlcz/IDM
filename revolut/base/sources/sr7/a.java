package sr7;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f265132a;

    public a(Map actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f265132a = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f265132a, ((a) obj2).f265132a);
    }

    public final int hashCode() {
        return this.f265132a.hashCode();
    }
}
