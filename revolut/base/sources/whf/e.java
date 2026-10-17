package whf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f297637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f297638b;

    public e(d type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f297637a = type;
        this.f297638b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f297637a == eVar.f297637a && this.f297638b == eVar.f297638b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f297638b) + (this.f297637a.hashCode() * 31);
    }
}
