package lm3;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f196868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f196869b;

    public c(boolean z, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f196868a = z;
        this.f196869b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f196869b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f196868a == cVar.f196868a && Intrinsics.f(this.f196869b, cVar.f196869b);
    }

    public final int hashCode() {
        return this.f196869b.hashCode() + (Boolean.hashCode(this.f196868a) * 31);
    }
}
