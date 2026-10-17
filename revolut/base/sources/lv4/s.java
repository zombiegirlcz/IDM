package lv4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f200309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f200310b;

    public s(r rVar, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f200309a = rVar;
        this.f200310b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f200310b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f200309a, sVar.f200309a) && Intrinsics.f(this.f200310b, sVar.f200310b);
    }

    public final int hashCode() {
        r rVar = this.f200309a;
        return this.f200310b.hashCode() + ((rVar == null ? 0 : rVar.hashCode()) * 31);
    }
}
