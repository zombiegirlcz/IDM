package yb2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f312161a;

    public d(Data storedMethod) {
        Intrinsics.checkNotNullParameter(storedMethod, "storedMethod");
        this.f312161a = storedMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f312161a, ((d) obj2).f312161a);
    }

    public final int hashCode() {
        return this.f312161a.hashCode();
    }
}
