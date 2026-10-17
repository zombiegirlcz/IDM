package rk9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f254784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.h f254785c;

    public r(List items, q header, aw0.h hVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f254783a = items;
        this.f254784b = header;
        this.f254785c = hVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f254783a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f254783a, rVar.f254783a) && Intrinsics.f(this.f254784b, rVar.f254784b) && Intrinsics.f(this.f254785c, rVar.f254785c);
    }

    public final int hashCode() {
        int iHashCode = (this.f254784b.hashCode() + (this.f254783a.hashCode() * 31)) * 31;
        aw0.h hVar = this.f254785c;
        return iHashCode + (hVar == null ? 0 : hVar.hashCode());
    }
}
