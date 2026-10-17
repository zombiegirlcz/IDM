package r7;

import java.util.HashSet;

/* JADX INFO: loaded from: classes16.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f251931a = new HashSet();

    public final void a() {
        d7.a aVar = d7.d.f111646a;
    }

    public final void b() {
        d7.a aVar = d7.d.f111646a;
    }

    public final void c(String str) {
        d(str, null);
    }

    public final void d(String str, Throwable th10) {
        HashSet hashSet = f251931a;
        if (hashSet.contains(str)) {
            return;
        }
        hashSet.add(str);
    }
}
