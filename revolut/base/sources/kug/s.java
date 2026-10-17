package kug;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f189805a;

    public s(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f189805a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f189805a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f189805a, ((s) obj2).f189805a);
    }

    public final int hashCode() {
        return this.f189805a.hashCode();
    }
}
