package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ji0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0 f164845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164846c;

    public ji0(boolean z, gi0 headerPayload, boolean z3) {
        Intrinsics.checkNotNullParameter(headerPayload, "headerPayload");
        this.f164844a = z;
        this.f164845b = headerPayload;
        this.f164846c = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ji0)) {
            return false;
        }
        ji0 ji0Var = (ji0) obj2;
        return this.f164844a == ji0Var.f164844a && Intrinsics.f(this.f164845b, ji0Var.f164845b) && this.f164846c == ji0Var.f164846c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164846c) + ((this.f164845b.hashCode() + (Boolean.hashCode(this.f164844a) * 31)) * 31);
    }
}
