package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f194298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f194300c;
    public long d;
    public Long e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v1 f194301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m2 f194302h;
    public l2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w1 f194303j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f194304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte f194305m;

    public final k0 a() {
        String str;
        String str2;
        v1 v1Var;
        if (this.f194305m == 7 && (str = this.f194298a) != null && (str2 = this.f194299b) != null && (v1Var = this.f194301g) != null) {
            return new k0(str, str2, this.f194300c, this.d, this.e, this.f, v1Var, this.f194302h, this.i, this.f194303j, this.k, this.f194304l);
        }
        StringBuilder sb6 = new StringBuilder();
        if (this.f194298a == null) {
            sb6.append(" generator");
        }
        if (this.f194299b == null) {
            sb6.append(" identifier");
        }
        if ((this.f194305m & 1) == 0) {
            sb6.append(" startedAt");
        }
        if ((this.f194305m & 2) == 0) {
            sb6.append(" crashed");
        }
        if (this.f194301g == null) {
            sb6.append(" app");
        }
        if ((this.f194305m & 4) == 0) {
            sb6.append(" generatorType");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }
}
