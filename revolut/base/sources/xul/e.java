package xul;

import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f309115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f309116b;

    public e(z zVar, boolean z) {
        this.f309115a = zVar;
        this.f309116b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f309115a == eVar.f309115a && this.f309116b == eVar.f309116b;
    }

    public final int hashCode() {
        z zVar = this.f309115a;
        return Boolean.hashCode(this.f309116b) + ((zVar == null ? 0 : zVar.hashCode()) * 31);
    }
}
