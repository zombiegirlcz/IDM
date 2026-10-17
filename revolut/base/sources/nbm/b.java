package nbm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f214095a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f214096b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f214097c = 0;
    public int d = 0;

    public final void a(long j2, e eVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.d++;
        this.f214095a = timeUnit.toMillis(j2) + this.f214095a;
        int i = a.f214094a[eVar.ordinal()];
        if (i == 1) {
            this.f214096b++;
            return;
        }
        if (i == 2) {
            this.f214096b++;
            this.f214097c++;
        } else {
            if (i != 3) {
                return;
            }
            this.f214097c++;
        }
    }
}
