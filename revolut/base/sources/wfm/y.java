package wfm;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f297208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f297209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f297210c;
    public volatile boolean d;

    public y(Runnable runnable, Long l2, int i) {
        this.f297208a = runnable;
        this.f297209b = l2.longValue();
        this.f297210c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        y yVar = (y) obj2;
        long j2 = this.f297209b;
        long j3 = yVar.f297209b;
        int i = j2 < j3 ? -1 : j2 > j3 ? 1 : 0;
        if (i != 0) {
            return i;
        }
        int i2 = yVar.f297210c;
        int i3 = this.f297210c;
        if (i3 < i2) {
            return -1;
        }
        return i3 > i2 ? 1 : 0;
    }
}
