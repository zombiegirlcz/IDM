package rhj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f254495a;

    public f(Data subscriptionsByView) {
        Intrinsics.checkNotNullParameter(subscriptionsByView, "subscriptionsByView");
        this.f254495a = subscriptionsByView;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f254495a, ((f) obj2).f254495a);
    }

    public final int hashCode() {
        return this.f254495a.hashCode();
    }
}
