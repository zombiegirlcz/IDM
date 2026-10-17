package tg2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f271042a;

    public d(Data pendingAction) {
        Intrinsics.checkNotNullParameter(pendingAction, "pendingAction");
        this.f271042a = pendingAction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271042a, ((d) obj2).f271042a);
    }

    public final int hashCode() {
        return this.f271042a.hashCode();
    }
}
