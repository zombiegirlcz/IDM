package qk2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f246952a;

    public c(Map workflowParams) {
        Intrinsics.checkNotNullParameter(workflowParams, "workflowParams");
        this.f246952a = workflowParams;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f246952a, ((c) obj2).f246952a);
    }

    public final int hashCode() {
        return this.f246952a.hashCode();
    }
}
