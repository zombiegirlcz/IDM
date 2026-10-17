package eoi;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f127938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f127939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f127940c;
    public long d;
    public int e;
    public int f;

    public static final class a {
        private a() {
        }
    }

    public final void a(long j2, long j3, long j5) {
        this.f++;
        this.d = (j2 / 1000) + this.d;
        this.f127940c = (j3 / 1000) + this.f127940c;
        this.f127939b = (j5 / 1000) + this.f127939b;
        if (j3 > j5) {
            this.e++;
            if (j5 > 0) {
                this.f127938a = ((j3 - 1) / j5) + this.f127938a;
            }
        }
    }

    public final f b() {
        int i = this.f;
        if (i == 0) {
            return null;
        }
        long j2 = this.d;
        if (j2 == 0) {
            return null;
        }
        long j3 = this.f127940c;
        if (j3 == 0) {
            return null;
        }
        long j5 = this.f127939b;
        long j16 = j3 - j5;
        return new f((int) ((((long) this.e) * 100) / ((long) i)), (int) kotlin.ranges.f.i(100 - ((j5 * 100) / j2), 0L, 100L), (j16 >= 0 ? j16 : 0L) / 1000, this.f127938a, (int) kotlin.ranges.f.i(100 - ((this.f127939b * 100) / this.f127940c), 0L, 100L));
    }
}
