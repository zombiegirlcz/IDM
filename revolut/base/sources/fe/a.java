package fe;

import ag.h;
import ag.j;
import android.util.Log;
import ce.r;
import java.util.concurrent.atomic.AtomicReference;
import le.l1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f134424c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f134425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f134426b = new AtomicReference(null);

    public a(r rVar) {
        this.f134425a = rVar;
        rVar.a(new j(this, 21));
    }

    public final c a(String str) {
        a aVar = (a) this.f134426b.get();
        return aVar == null ? f134424c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f134426b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f134426b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j2, l1 l1Var) {
        j6.a.q("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
        }
        this.f134425a.a(new h(str, j2, l1Var));
    }
}
