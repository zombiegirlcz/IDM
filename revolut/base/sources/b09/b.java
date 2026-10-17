package b09;

import kotlin.jvm.internal.Intrinsics;
import u09.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f11625a;

    public b(z result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f11625a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f11625a, ((b) obj2).f11625a);
    }

    public final int hashCode() {
        return this.f11625a.hashCode();
    }
}
