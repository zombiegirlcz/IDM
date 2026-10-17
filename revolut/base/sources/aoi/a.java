package aoi;

import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f7988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f7989b;

    public abstract void b();

    public abstract void c();

    @Override // aoi.h
    public final long getDuration() {
        if (this.f7988a == 0 || this.f7989b == 0) {
            return -1L;
        }
        return this.f7989b - this.f7988a;
    }

    @Override // aoi.h
    public final void start() {
        b();
        this.f7988a = DateTimeUtils.currentTimeMillis();
    }

    @Override // aoi.h
    public final void stop() {
        this.f7989b = DateTimeUtils.currentTimeMillis();
        c();
    }
}
