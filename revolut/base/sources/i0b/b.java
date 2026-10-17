package i0b;

import aii.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f157343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f157344b;

    public b(e controllerDescriptor, Function1 outputMapper) {
        Intrinsics.checkNotNullParameter(controllerDescriptor, "controllerDescriptor");
        Intrinsics.checkNotNullParameter(outputMapper, "outputMapper");
        this.f157343a = controllerDescriptor;
        this.f157344b = outputMapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f157343a, bVar.f157343a) && Intrinsics.f(this.f157344b, bVar.f157344b);
    }

    public final int hashCode() {
        return this.f157344b.hashCode() + (this.f157343a.hashCode() * 31);
    }
}
