package e54;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f122737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f122738b;

    public a(Integer num, long j2) {
        this.f122737a = j2;
        this.f122738b = num;
    }

    public final boolean a(long j2) {
        Integer num = this.f122738b;
        return (num == null || (j2 - this.f122737a) % ((long) num.intValue()) == 0) ? false : true;
    }

    public final long b(long j2) {
        Integer num = this.f122738b;
        if (num == null) {
            throw new IllegalStateException("Check failed.");
        }
        long j3 = this.f122737a;
        return (((j2 - j3) / ((long) num.intValue())) * ((long) num.intValue())) + j3 + ((long) (((double) ((j2 - j3) % ((long) num.intValue()))) / ((double) num.intValue()) < 0.5d ? 0 : num.intValue()));
    }
}
