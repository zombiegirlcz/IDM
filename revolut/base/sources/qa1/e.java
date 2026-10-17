package qa1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f243933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f243934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f243935c;

    public e(int i, f state, a firmwareType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(firmwareType, "firmwareType");
        this.f243933a = i;
        this.f243934b = state;
        this.f243935c = firmwareType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f243933a == eVar.f243933a && this.f243934b == eVar.f243934b && this.f243935c == eVar.f243935c;
    }

    public final int hashCode() {
        return this.f243935c.hashCode() + ((this.f243934b.hashCode() + (Integer.hashCode(this.f243933a) * 31)) * 31);
    }
}
