package fci;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f133820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a0 f133821b;

    public w(int i, a0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f133820a = i;
        this.f133821b = content;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return this.f133820a == wVar.f133820a && Intrinsics.f(this.f133821b, wVar.f133821b);
    }

    public final int hashCode() {
        return this.f133821b.hashCode() + (Integer.hashCode(this.f133820a) * 31);
    }
}
