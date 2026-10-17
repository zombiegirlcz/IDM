package sdg;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f261882a;

    public h(boolean z) {
        this.f261882a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f261882a == ((h) obj2).f261882a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f261882a);
    }
}
