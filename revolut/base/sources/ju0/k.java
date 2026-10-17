package ju0;

import kotlin.time.b;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f178566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178567b;

    public k(long j2, boolean z) {
        this.f178566a = j2;
        this.f178567b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return kotlin.time.b.d(this.f178566a, kVar.f178566a) && this.f178567b == kVar.f178567b;
    }

    public final int hashCode() {
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Boolean.hashCode(this.f178567b) + (Long.hashCode(this.f178566a) * 31);
    }
}
