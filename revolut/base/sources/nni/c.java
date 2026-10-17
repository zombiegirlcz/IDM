package nni;

import cli.j;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217684a;

    public c(List methods) {
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f217684a = methods;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f217684a, ((c) obj2).f217684a);
    }

    public final int hashCode() {
        return this.f217684a.hashCode();
    }
}
