package nif;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r1 f216013c;

    public q1(String id10, String state, r1 sender) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.f216011a = id10;
        this.f216012b = state;
        this.f216013c = sender;
    }

    public final String a() {
        return this.f216011a;
    }

    public final r1 b() {
        return this.f216013c;
    }

    public final String c() {
        return this.f216012b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj2;
        return Intrinsics.f(this.f216011a, q1Var.f216011a) && Intrinsics.f(this.f216012b, q1Var.f216012b) && Intrinsics.f(this.f216013c, q1Var.f216013c);
    }

    public final int hashCode() {
        return this.f216013c.hashCode() + p.a.c(this.f216011a.hashCode() * 31, 31, this.f216012b);
    }
}
