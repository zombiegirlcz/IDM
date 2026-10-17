package g6f;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140919a;

    public a() {
        this(0);
    }

    @Override // cli.p
    public final List c() {
        return this.f140919a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f140919a, ((a) obj2).f140919a);
    }

    public final int hashCode() {
        return this.f140919a.hashCode();
    }

    public a(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140919a = items;
    }

    public a(int i) {
        this(f0.f322471a);
    }
}
