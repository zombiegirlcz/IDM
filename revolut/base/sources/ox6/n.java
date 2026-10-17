package ox6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f230634a;

    public n(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f230634a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f230634a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f230634a, ((n) obj2).f230634a);
    }

    public final int hashCode() {
        return this.f230634a.hashCode();
    }
}
