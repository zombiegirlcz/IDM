package le;

import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f194239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f194240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f194241c;
    public int d;
    public long e;
    public long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f194242g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f194243h;
    public List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public byte f194244j;

    public final e0 a() {
        String str;
        if (this.f194244j == 63 && (str = this.f194240b) != null) {
            return new e0(this.f194239a, str, this.f194241c, this.d, this.e, this.f, this.f194242g, this.f194243h, this.i);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((this.f194244j & 1) == 0) {
            sb6.append(" pid");
        }
        if (this.f194240b == null) {
            sb6.append(" processName");
        }
        if ((this.f194244j & 2) == 0) {
            sb6.append(" reasonCode");
        }
        if ((this.f194244j & 4) == 0) {
            sb6.append(" importance");
        }
        if ((this.f194244j & 8) == 0) {
            sb6.append(" pss");
        }
        if ((this.f194244j & 16) == 0) {
            sb6.append(" rss");
        }
        if ((this.f194244j & 32) == 0) {
            sb6.append(" timestamp");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    public final void b(List list) {
        this.i = list;
    }

    public final void c(int i) {
        this.d = i;
        this.f194244j = (byte) (this.f194244j | 4);
    }

    public final void d(int i) {
        this.f194239a = i;
        this.f194244j = (byte) (this.f194244j | 1);
    }

    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f194240b = str;
    }

    public final void f(long j2) {
        this.e = j2;
        this.f194244j = (byte) (this.f194244j | 8);
    }

    public final void g(int i) {
        this.f194241c = i;
        this.f194244j = (byte) (this.f194244j | 2);
    }

    public final void h(long j2) {
        this.f = j2;
        this.f194244j = (byte) (this.f194244j | 16);
    }

    public final void i(long j2) {
        this.f194242g = j2;
        this.f194244j = (byte) (this.f194244j | 32);
    }

    public final void j(String str) {
        this.f194243h = str;
    }
}
