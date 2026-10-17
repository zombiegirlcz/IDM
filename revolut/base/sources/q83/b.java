package q83;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o63.e f242966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f242967b;

    public b(o63.e variant, Data user) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f242966a = variant;
        this.f242967b = user;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f242966a == bVar.f242966a && Intrinsics.f(this.f242967b, bVar.f242967b);
    }

    public final int hashCode() {
        return this.f242967b.hashCode() + (this.f242966a.hashCode() * 31);
    }
}
