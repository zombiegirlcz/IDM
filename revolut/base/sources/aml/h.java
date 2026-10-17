package aml;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f6480b;

    public h(aim.e items, aw0.g gVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f6479a = items;
        this.f6480b = gVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f6479a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f6479a, hVar.f6479a) && this.f6480b.equals(hVar.f6480b);
    }

    public final int hashCode() {
        return this.f6480b.hashCode() + (this.f6479a.hashCode() * 31);
    }
}
