package u6h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f277594a;

    public c(d infoType) {
        Intrinsics.checkNotNullParameter(infoType, "infoType");
        this.f277594a = infoType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f277594a == ((c) obj2).f277594a;
    }

    public final int hashCode() {
        return this.f277594a.hashCode();
    }
}
