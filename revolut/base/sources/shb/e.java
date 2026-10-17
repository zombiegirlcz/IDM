package shb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f263452a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f263452a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f263452a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f263452a, ((e) obj2).f263452a);
    }

    public final int hashCode() {
        return this.f263452a.hashCode();
    }

    public e() {
        this(f0.f322471a);
    }
}
