package lx1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200516a;

    public e(List contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        this.f200516a = contacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f200516a, ((e) obj2).f200516a);
    }

    public final int hashCode() {
        return this.f200516a.hashCode();
    }
}
