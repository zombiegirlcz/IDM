package ts1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f273925a;

    public e(List subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f273925a = subscriptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f273925a, ((e) obj2).f273925a);
    }

    public final int hashCode() {
        return this.f273925a.hashCode();
    }
}
