package xmc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f307148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f307149c;

    public q(List items, p header, m button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f307147a = items;
        this.f307148b = header;
        this.f307149c = button;
    }

    @Override // jki.n
    public final List c() {
        return this.f307147a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f307147a, qVar.f307147a) && Intrinsics.f(this.f307148b, qVar.f307148b) && Intrinsics.f(this.f307149c, qVar.f307149c);
    }

    public final int hashCode() {
        return this.f307149c.hashCode() + ((this.f307148b.hashCode() + (this.f307147a.hashCode() * 31)) * 31);
    }
}
