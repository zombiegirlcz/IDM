package rfe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pie.a f253765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f253766b;

    public f(pie.a key, j subSpaces) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(subSpaces, "subSpaces");
        this.f253765a = key;
        this.f253766b = subSpaces;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f253765a == fVar.f253765a && Intrinsics.f(this.f253766b, fVar.f253766b);
    }

    public final int hashCode() {
        return this.f253766b.hashCode() + (this.f253765a.hashCode() * 31);
    }

    public /* synthetic */ f(pie.a aVar) {
        this(aVar, g.f253767a);
    }
}
