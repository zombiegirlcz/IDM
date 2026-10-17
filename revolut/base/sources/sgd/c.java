package sgd;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f262642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f262643b;

    public c(String nameInput, boolean z) {
        Intrinsics.checkNotNullParameter(nameInput, "nameInput");
        this.f262642a = nameInput;
        this.f262643b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f262642a, cVar.f262642a) && this.f262643b == cVar.f262643b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262643b) + (this.f262642a.hashCode() * 31);
    }
}
