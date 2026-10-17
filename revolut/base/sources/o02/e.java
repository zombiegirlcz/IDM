package o02;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f221100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f221101b;

    public e(d name, c kind) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.f221100a = name;
        this.f221101b = kind;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f221100a == eVar.f221100a && Intrinsics.f(this.f221101b, eVar.f221101b);
    }

    public final int hashCode() {
        return this.f221101b.hashCode() + (this.f221100a.hashCode() * 31);
    }
}
