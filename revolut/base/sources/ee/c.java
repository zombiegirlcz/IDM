package ee;

import ie.r;
import pd.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f125046a;

    public c(r rVar) {
        this.f125046a = rVar;
    }

    public static c a() {
        c cVar = (c) g.c().b(c.class);
        if (cVar != null) {
            return cVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }
}
