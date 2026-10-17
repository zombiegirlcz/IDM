package i8;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class k implements c8.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f159379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f159380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159381c;
    public String d;
    public URL e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f159382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f159383h;

    public k(URL url2) {
        o oVar = l.f159384a;
        y8.f.c(url2, "Argument must not be null");
        this.f159380b = url2;
        this.f159381c = null;
        y8.f.c(oVar, "Argument must not be null");
        this.f159379a = oVar;
    }

    public final String a() {
        String str = this.f159381c;
        if (str != null) {
            return str;
        }
        URL url2 = this.f159380b;
        y8.f.c(url2, "Argument must not be null");
        return url2.toString();
    }

    public final String b() {
        if (TextUtils.isEmpty(this.d)) {
            String string = this.f159381c;
            if (TextUtils.isEmpty(string)) {
                URL url2 = this.f159380b;
                y8.f.c(url2, "Argument must not be null");
                string = url2.toString();
            }
            this.d = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.d;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof k) {
            k kVar = (k) obj2;
            if (a().equals(kVar.a()) && this.f159379a.equals(kVar.f159379a)) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        if (this.f159383h == 0) {
            int iHashCode = a().hashCode();
            this.f159383h = iHashCode;
            this.f159383h = this.f159379a.hashCode() + (iHashCode * 31);
        }
        return this.f159383h;
    }

    public final String toString() {
        return a();
    }

    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.f159382g == null) {
            this.f159382g = a().getBytes(c8.g.f);
        }
        messageDigest.update(this.f159382g);
    }

    public k(String str) {
        this(str, l.f159384a);
    }

    public k(String str, l lVar) {
        this.f159380b = null;
        if (!TextUtils.isEmpty(str)) {
            this.f159381c = str;
            y8.f.c(lVar, "Argument must not be null");
            this.f159379a = lVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
