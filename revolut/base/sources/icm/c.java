package icm;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final mmm.m d;
    public static final mmm.m e;
    public static final mmm.m f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mmm.m f160309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final mmm.m f160310h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mmm.m f160311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mmm.m f160312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160313c;

    static {
        mmm.m.Companion.getClass();
        d = mmm.l.c(":status");
        e = mmm.l.c(":method");
        f = mmm.l.c(":path");
        f160309g = mmm.l.c(":scheme");
        f160310h = mmm.l.c(":authority");
        mmm.l.c(":host");
        mmm.l.c(":version");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(String str, String str2) {
        this(mmm.l.c(str), mmm.l.c(str2));
        mmm.m.Companion.getClass();
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof c) {
            c cVar = (c) obj2;
            if (this.f160311a.equals(cVar.f160311a) && this.f160312b.equals(cVar.f160312b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f160312b.hashCode() + ((this.f160311a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(this.f160311a.v(), ": ", this.f160312b.v());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(mmm.m mVar, String str) {
        this(mVar, mmm.l.c(str));
        mmm.m.Companion.getClass();
    }

    public c(mmm.m mVar, mmm.m mVar2) {
        this.f160311a = mVar;
        this.f160312b = mVar2;
        this.f160313c = mVar2.d() + mVar.d() + 32;
    }
}
