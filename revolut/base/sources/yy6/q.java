package yy6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f317855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f317856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f317857c;

    public q(p header, o footer, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317855a = header;
        this.f317856b = footer;
        this.f317857c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f317857c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f317855a, qVar.f317855a) && Intrinsics.f(this.f317856b, qVar.f317856b) && Intrinsics.f(this.f317857c, qVar.f317857c);
    }

    public final int hashCode() {
        return this.f317857c.hashCode() + ((this.f317856b.hashCode() + (this.f317855a.hashCode() * 31)) * 31);
    }
}
