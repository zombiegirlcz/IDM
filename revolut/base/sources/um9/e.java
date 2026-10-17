package um9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f281271a;

    public e(Data ownerAndPayees) {
        Intrinsics.checkNotNullParameter(ownerAndPayees, "ownerAndPayees");
        this.f281271a = ownerAndPayees;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f281271a, ((e) obj2).f281271a);
    }

    public final int hashCode() {
        return this.f281271a.hashCode();
    }
}
