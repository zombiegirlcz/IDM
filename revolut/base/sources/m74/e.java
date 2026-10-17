package m74;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f203313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203314b;

    public e(List items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203313a = header;
        this.f203314b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f203314b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f203313a.equals(eVar.f203313a) && this.f203314b.equals(eVar.f203314b);
    }

    public final int hashCode() {
        return this.f203314b.hashCode() + (this.f203313a.hashCode() * 31);
    }
}
