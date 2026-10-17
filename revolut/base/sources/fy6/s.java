package fy6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f138947b;

    public s(List items, r footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f138946a = items;
        this.f138947b = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f138946a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f138946a, sVar.f138946a) && Intrinsics.f(this.f138947b, sVar.f138947b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138947b.f138945a) + (this.f138946a.hashCode() * 31);
    }
}
