package gca;

import aw0.j8;
import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f142382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f142383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f142384c;

    public h(List items, j8 navBarModel, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f142382a = items;
        this.f142383b = navBarModel;
        this.f142384c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f142382a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f142382a, hVar.f142382a) && Intrinsics.f(this.f142383b, hVar.f142383b) && this.f142384c == hVar.f142384c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f142384c) + ((this.f142383b.hashCode() + (this.f142382a.hashCode() * 31)) * 31);
    }
}
