package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wf implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167002b;

    public wf(boolean z, boolean z3) {
        this.f167001a = z;
        this.f167002b = z3;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167002b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wf)) {
            return false;
        }
        wf wfVar = (wf) obj2;
        return this.f167001a == wfVar.f167001a && this.f167002b == wfVar.f167002b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167002b) + (Boolean.hashCode(this.f167001a) * 31);
    }
}
