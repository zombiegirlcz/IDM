package vvf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f292534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f292535b;

    public h(aim.e items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f292534a = items;
        this.f292535b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f292534a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f292534a, hVar.f292534a) && this.f292535b == hVar.f292535b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f292535b) + (this.f292534a.hashCode() * 31);
    }
}
