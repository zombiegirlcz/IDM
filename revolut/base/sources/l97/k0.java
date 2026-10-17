package l97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o97.y f193079b;

    public k0(String listId, o97.y payload) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f193078a = listId;
        this.f193079b = payload;
    }

    @Override // l97.l0
    public final o97.y a() {
        return this.f193079b;
    }

    @Override // l97.l0
    public final String b() {
        return this.f193078a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f193078a, k0Var.f193078a) && Intrinsics.f(this.f193079b, k0Var.f193079b);
    }

    public final int hashCode() {
        return this.f193079b.hashCode() + (this.f193078a.hashCode() * 31);
    }
}
