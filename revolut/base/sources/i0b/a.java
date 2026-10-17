package i0b;

import aii.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f157341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f157342b;

    public a(e controllerDescriptor, Function1 outputMapper) {
        Intrinsics.checkNotNullParameter(controllerDescriptor, "controllerDescriptor");
        Intrinsics.checkNotNullParameter(outputMapper, "outputMapper");
        this.f157341a = controllerDescriptor;
        this.f157342b = outputMapper;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f157341a, aVar.f157341a) && Intrinsics.f(this.f157342b, aVar.f157342b);
    }

    public final int hashCode() {
        return this.f157342b.hashCode() + (this.f157341a.hashCode() * 31);
    }
}
