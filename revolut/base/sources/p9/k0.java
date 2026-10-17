package p9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class k0 implements l0, Serializable {
    public static final k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k0 f234224g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9.g f234225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d9.g f234226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9.g f234227c;
    public final d9.g d;
    public final d9.g e;

    static {
        d9.g gVar = d9.g.PUBLIC_ONLY;
        d9.g gVar2 = d9.g.ANY;
        f = new k0(gVar, gVar, gVar2, gVar2, gVar);
        f234224g = new k0(gVar, gVar, gVar, gVar, gVar);
    }

    public k0(d9.g gVar, d9.g gVar2, d9.g gVar3, d9.g gVar4, d9.g gVar5) {
        this.f234225a = gVar;
        this.f234226b = gVar2;
        this.f234227c = gVar3;
        this.d = gVar4;
        this.e = gVar5;
    }

    public final String toString() {
        return "[Visibility: getter=" + this.f234225a + ",isGetter=" + this.f234226b + ",setter=" + this.f234227c + ",creator=" + this.d + ",field=" + this.e + "]";
    }
}
