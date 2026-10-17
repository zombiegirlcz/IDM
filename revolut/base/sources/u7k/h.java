package u7k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f277959b;

    public h(List items, f header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f277958a = items;
        this.f277959b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f277958a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f277958a, hVar.f277958a) && Intrinsics.f(this.f277959b, hVar.f277959b);
    }

    public final int hashCode() {
        return this.f277959b.hashCode() + (this.f277958a.hashCode() * 31);
    }
}
