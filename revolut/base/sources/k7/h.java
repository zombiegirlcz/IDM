package k7;

import androidx.collection.LruCache;
import d7.j;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f181769b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LruCache f181770a = new LruCache(20);

    public final j a(String str) {
        if (str == null) {
            return null;
        }
        return (j) this.f181770a.get(str);
    }
}
