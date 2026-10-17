package tk5;

import cli.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271880a;

    public e(boolean z) {
        this.f271880a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f271880a == ((e) obj2).f271880a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271880a);
    }
}
