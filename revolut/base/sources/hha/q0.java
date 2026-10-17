package hha;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f152334a;

    public q0(ArrayList subscriptions) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        this.f152334a = subscriptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q0) && this.f152334a.equals(((q0) obj2).f152334a);
    }

    public final int hashCode() {
        return this.f152334a.hashCode();
    }
}
