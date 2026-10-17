package pcd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f234860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f234861c;

    public g0(long j2, String str, xi0.b bVar) {
        this.f234859a = str;
        this.f234860b = bVar;
        this.f234861c = j2;
    }

    public final xi0.b a() {
        return this.f234860b;
    }

    public abstract String b();

    public abstract String getPocketId();
}
