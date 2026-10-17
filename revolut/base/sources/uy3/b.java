package uy3;

import ht3.l0;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f284056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f284057b;

    public b(l0 intro, l0 disclaimer) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f284056a = intro;
        this.f284057b = disclaimer;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f284056a, bVar.f284056a) && Intrinsics.f(this.f284057b, bVar.f284057b);
    }

    public final int hashCode() {
        return this.f284057b.hashCode() + (this.f284056a.hashCode() * 31);
    }
}
