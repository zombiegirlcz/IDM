package vdg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287926a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f287926a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f287926a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f287926a, ((e) obj2).f287926a);
    }

    public final int hashCode() {
        return this.f287926a.hashCode();
    }
}
