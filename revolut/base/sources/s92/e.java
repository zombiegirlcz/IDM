package s92;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f92.b f261090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f261092c;

    public e(f92.b type, String reference, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f261090a = type;
        this.f261091b = reference;
        this.f261092c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f261090a == eVar.f261090a && Intrinsics.f(this.f261091b, eVar.f261091b) && this.f261092c == eVar.f261092c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261092c) + p.a.c(this.f261090a.hashCode() * 31, 31, this.f261091b);
    }
}
