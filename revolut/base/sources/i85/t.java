package i85;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class t implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f159466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f159467c;

    public t(List items, s header, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f159465a = items;
        this.f159466b = header;
        this.f159467c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f159465a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f159465a, tVar.f159465a) && this.f159466b.equals(tVar.f159466b) && this.f159467c == tVar.f159467c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f159467c) + ((this.f159466b.hashCode() + (this.f159465a.hashCode() * 31)) * 31);
    }
}
