package ro8;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f255942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f255943b;

    public h(List items, g headerConfig) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerConfig, "headerConfig");
        this.f255942a = items;
        this.f255943b = headerConfig;
    }

    @Override // cli.p
    public final List c() {
        return this.f255942a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f255942a, hVar.f255942a) && Intrinsics.f(this.f255943b, hVar.f255943b);
    }

    public final int hashCode() {
        return this.f255943b.hashCode() + (this.f255942a.hashCode() * 31);
    }
}
