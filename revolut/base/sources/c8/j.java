package c8;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final dfm.c e = new dfm.c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f22065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f22066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22067c;
    public volatile byte[] d;

    public j(String str, Object obj2, i iVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f22067c = str;
        this.f22065a = obj2;
        this.f22066b = iVar;
    }

    public static j a(Object obj2, String str) {
        return new j(str, obj2, e);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof j) {
            return this.f22067c.equals(((j) obj2).f22067c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22067c.hashCode();
    }

    public final String toString() {
        return v0.a.i(new StringBuilder("Option{key='"), this.f22067c, "'}");
    }
}
