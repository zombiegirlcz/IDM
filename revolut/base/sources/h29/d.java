package h29;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h19.c f148743a;

    public d(h19.c type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f148743a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f148743a == ((d) obj2).f148743a;
    }

    public final int hashCode() {
        return this.f148743a.hashCode();
    }
}
