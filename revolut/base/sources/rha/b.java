package rha;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f254392a;

    public b(Map workflows) {
        Intrinsics.checkNotNullParameter(workflows, "workflows");
        this.f254392a = workflows;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f254392a.equals(((b) obj2).f254392a);
    }

    public final int hashCode() {
        return this.f254392a.hashCode();
    }
}
