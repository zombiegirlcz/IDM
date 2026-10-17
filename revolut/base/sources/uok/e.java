package uok;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281665a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f281665a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f281665a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f281665a, ((e) obj2).f281665a);
    }

    public final int hashCode() {
        return this.f281665a.hashCode();
    }
}
