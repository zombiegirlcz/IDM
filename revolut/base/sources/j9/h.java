package j9;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class h extends ConcurrentHashMap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f172262b = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f172263a;

    public h() {
        super(180, 0.8f, 4);
        this.f172263a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(String str) {
        String str2 = (String) get(str);
        if (str2 != null) {
            return str2;
        }
        if (size() >= 180) {
            synchronized (this.f172263a) {
                try {
                    if (size() >= 180) {
                        clear();
                    }
                } finally {
                }
            }
        }
        String strIntern = str.intern();
        put(strIntern, strIntern);
        return strIntern;
    }
}
