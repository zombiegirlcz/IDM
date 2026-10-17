package qeg;

import cli.q;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f245153a;

    public g(boolean z) {
        this.f245153a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && this.f245153a == ((g) obj2).f245153a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f245153a);
    }
}
