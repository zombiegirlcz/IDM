package aw0;

/* JADX INFO: loaded from: classes19.dex */
public final class g0 extends h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10317a;

    public g0(int i) {
        this.f10317a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g0) && this.f10317a == ((g0) obj2).f10317a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10317a);
    }
}
