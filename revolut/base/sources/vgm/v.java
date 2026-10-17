package vgm;

/* JADX INFO: loaded from: classes14.dex */
public final class v implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f289258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f289259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f289260c;
    public volatile boolean d;

    public v(Runnable runnable, Long l2, int i) {
        this.f289258a = runnable;
        this.f289259b = l2.longValue();
        this.f289260c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj2) {
        v vVar = (v) obj2;
        int iCompare = Long.compare(this.f289259b, vVar.f289259b);
        return iCompare == 0 ? Integer.compare(this.f289260c, vVar.f289260c) : iCompare;
    }
}
