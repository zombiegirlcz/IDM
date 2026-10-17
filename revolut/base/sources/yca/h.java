package yca;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f312581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g8a.t f312582b;

    public h() {
        this((g8a.t) null, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f312581a, hVar.f312581a) && this.f312582b == hVar.f312582b;
    }

    public final int hashCode() {
        return this.f312582b.hashCode() + (this.f312581a.hashCode() * 31);
    }

    public h(l keyInput, g8a.t type) {
        Intrinsics.checkNotNullParameter(keyInput, "keyInput");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f312581a = keyInput;
        this.f312582b = type;
    }

    public /* synthetic */ h(g8a.t tVar, int i) {
        this(new l(0), (i & 2) != 0 ? g8a.t.SEND : tVar);
    }
}
