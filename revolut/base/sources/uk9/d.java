package uk9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280701a;

    public d(Data plans) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        this.f280701a = plans;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f280701a, ((d) obj2).f280701a);
    }

    public final int hashCode() {
        return this.f280701a.hashCode();
    }
}
