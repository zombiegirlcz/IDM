package zug;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f325458b;

    public e(List items, d header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f325457a = items;
        this.f325458b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f325457a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f325457a, eVar.f325457a) && Intrinsics.f(this.f325458b, eVar.f325458b);
    }

    public final int hashCode() {
        return this.f325458b.hashCode() + (this.f325457a.hashCode() * 31);
    }
}
