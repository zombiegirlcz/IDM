package bzk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f20048a;

    public a(h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f20048a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f20048a == ((a) obj2).f20048a;
    }

    public final int hashCode() {
        return this.f20048a.hashCode();
    }
}
