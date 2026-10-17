package e8;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x implements c8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f123537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f123538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f123539c;
    public final Class d;
    public final Class e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c8.g f123540g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f123541h;
    public final c8.k i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f123542j;

    public x(Object obj2, c8.g gVar, int i, int i2, Map map, Class cls, Class cls2, c8.k kVar) {
        y8.f.c(obj2, "Argument must not be null");
        this.f123537a = obj2;
        this.f123540g = gVar;
        this.f123538b = i;
        this.f123539c = i2;
        y8.f.c(map, "Argument must not be null");
        this.f123541h = map;
        y8.f.c(cls, "Resource class must not be null");
        this.d = cls;
        y8.f.c(cls2, "Transcode class must not be null");
        this.e = cls2;
        y8.f.c(kVar, "Argument must not be null");
        this.i = kVar;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof x) {
            x xVar = (x) obj2;
            if (this.f123537a.equals(xVar.f123537a) && this.f123540g.equals(xVar.f123540g) && this.f123539c == xVar.f123539c && this.f123538b == xVar.f123538b && this.f123541h.equals(xVar.f123541h) && this.d.equals(xVar.d) && this.e.equals(xVar.e) && this.i.equals(xVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        if (this.f123542j == 0) {
            int iHashCode = this.f123537a.hashCode();
            this.f123542j = iHashCode;
            int iHashCode2 = ((((this.f123540g.hashCode() + (iHashCode * 31)) * 31) + this.f123538b) * 31) + this.f123539c;
            this.f123542j = iHashCode2;
            int iHashCode3 = this.f123541h.hashCode() + (iHashCode2 * 31);
            this.f123542j = iHashCode3;
            int iHashCode4 = this.d.hashCode() + (iHashCode3 * 31);
            this.f123542j = iHashCode4;
            int iHashCode5 = this.e.hashCode() + (iHashCode4 * 31);
            this.f123542j = iHashCode5;
            this.f123542j = this.i.f22068a.hashCode() + (iHashCode5 * 31);
        }
        return this.f123542j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f123537a + ", width=" + this.f123538b + ", height=" + this.f123539c + ", resourceClass=" + this.d + ", transcodeClass=" + this.e + ", signature=" + this.f123540g + ", hashCode=" + this.f123542j + ", transformations=" + this.f123541h + ", options=" + this.i + CoreConstants.CURLY_RIGHT;
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
