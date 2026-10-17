package ohb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f225337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c7 f225338b;

    public d(aim.e items, c7 footerContent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        this.f225337a = items;
        this.f225338b = footerContent;
    }

    @Override // cli.p
    public final List c() {
        return this.f225337a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f225337a, dVar.f225337a) && this.f225338b.equals(dVar.f225338b);
    }

    public final int hashCode() {
        return this.f225338b.hashCode() + (this.f225337a.hashCode() * 31);
    }
}
