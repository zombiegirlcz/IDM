package rj9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254633a;

    public e(Data plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f254633a = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f254633a, ((e) obj2).f254633a);
    }

    public final int hashCode() {
        return this.f254633a.hashCode();
    }
}
