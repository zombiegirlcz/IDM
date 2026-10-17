package v30;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f285783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f285784c;

    public i0(String entityId, String messageId, String entryPoint) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f285782a = entityId;
        this.f285783b = messageId;
        this.f285784c = entryPoint;
    }

    @Override // v30.q0
    public final String a() {
        return this.f285782a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f285782a, i0Var.f285782a) && Intrinsics.f(this.f285783b, i0Var.f285783b) && Intrinsics.f(this.f285784c, i0Var.f285784c);
    }

    public final int hashCode() {
        return this.f285784c.hashCode() + p.a.c(this.f285782a.hashCode() * 31, 31, this.f285783b);
    }
}
