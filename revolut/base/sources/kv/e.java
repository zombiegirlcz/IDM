package kv;

/* JADX INFO: loaded from: classes16.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f189889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f189890b;

    public e(float f, long j2) {
        this.f189889a = f;
        this.f189890b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Float.compare(this.f189889a, eVar.f189889a) == 0 && this.f189890b == eVar.f189890b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f189890b) + (Float.hashCode(this.f189889a) * 31);
    }
}
