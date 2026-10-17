package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f194249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f194251c;
    public final int d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f194252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f194253h;
    public final List i;

    public e0(int i, String str, int i2, int i3, long j2, long j3, long j5, String str2, List list) {
        this.f194249a = i;
        this.f194250b = str;
        this.f194251c = i2;
        this.d = i3;
        this.e = j2;
        this.f = j3;
        this.f194252g = j5;
        this.f194253h = str2;
        this.i = list;
    }

    public final boolean equals(Object obj2) {
        String str;
        List list;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof q1) {
            e0 e0Var = (e0) ((q1) obj2);
            List list2 = e0Var.i;
            String str2 = e0Var.f194253h;
            if (this.f194249a == e0Var.f194249a && this.f194250b.equals(e0Var.f194250b) && this.f194251c == e0Var.f194251c && this.d == e0Var.d && this.e == e0Var.e && this.f == e0Var.f && this.f194252g == e0Var.f194252g && ((str = this.f194253h) != null ? str.equals(str2) : str2 == null) && ((list = this.i) != null ? list.equals(list2) : list2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f194249a ^ 1000003) * 1000003) ^ this.f194250b.hashCode()) * 1000003) ^ this.f194251c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        int i = (iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.f;
        int i2 = (i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j5 = this.f194252g;
        int i3 = (i2 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str = this.f194253h;
        int iHashCode2 = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("ApplicationExitInfo{pid=");
        sb6.append(this.f194249a);
        sb6.append(", processName=");
        sb6.append(this.f194250b);
        sb6.append(", reasonCode=");
        sb6.append(this.f194251c);
        sb6.append(", importance=");
        sb6.append(this.d);
        sb6.append(", pss=");
        sb6.append(this.e);
        sb6.append(", rss=");
        sb6.append(this.f);
        sb6.append(", timestamp=");
        sb6.append(this.f194252g);
        sb6.append(", traceFile=");
        sb6.append(this.f194253h);
        sb6.append(", buildIdMappingForArch=");
        return t61.a.q("}", this.i, sb6);
    }
}
