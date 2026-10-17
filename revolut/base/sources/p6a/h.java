package p6a;

import cli.q;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f233241a;

    public h(boolean z) {
        this.f233241a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f233241a == ((h) obj2).f233241a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f233241a);
    }
}
