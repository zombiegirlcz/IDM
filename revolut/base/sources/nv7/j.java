package nv7;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f219549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f219550b;

    public j(List items, i header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f219549a = items;
        this.f219550b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f219549a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f219549a, jVar.f219549a) && Intrinsics.f(this.f219550b, jVar.f219550b);
    }

    public final int hashCode() {
        return this.f219550b.hashCode() + (this.f219549a.hashCode() * 31);
    }
}
