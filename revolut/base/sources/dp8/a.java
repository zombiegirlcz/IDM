package dp8;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116830a;

    public a(List taskIds) {
        Intrinsics.checkNotNullParameter(taskIds, "taskIds");
        this.f116830a = taskIds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f116830a, ((a) obj2).f116830a);
    }

    public final int hashCode() {
        return this.f116830a.hashCode();
    }
}
