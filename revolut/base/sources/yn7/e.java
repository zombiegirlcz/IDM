package yn7;

import cli.j;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f315265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f315266b;

    public e(boolean z, boolean z3) {
        this.f315265a = z;
        this.f315266b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f315265a == eVar.f315265a && this.f315266b == eVar.f315266b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f315266b) + (Boolean.hashCode(this.f315265a) * 31);
    }
}
