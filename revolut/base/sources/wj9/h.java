package wj9;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f298027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298029c;

    public h(g header, List items, boolean z) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f298027a = header;
        this.f298028b = items;
        this.f298029c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f298028b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f298027a, hVar.f298027a) && Intrinsics.f(this.f298028b, hVar.f298028b) && this.f298029c == hVar.f298029c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298029c) + p.a.d(this.f298027a.hashCode() * 31, 31, this.f298028b);
    }
}
