package sd0;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g implements td0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f261792c = new g();
    public static final yf.c d;
    public static final com.bumptech.glide.g e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lyd.e f261793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm.e f261794b;

    static {
        ConcurrentHashMap concurrentHashMap = j.f261796a;
        d = new yf.c(concurrentHashMap);
        e = new com.bumptech.glide.g(concurrentHashMap);
    }

    private g() {
        ConcurrentHashMap concurrentHashMap = j.f261796a;
        this.f261793a = new lyd.e(concurrentHashMap);
        this.f261794b = new qm.e(concurrentHashMap);
    }

    @Override // td0.b
    public final Set a() {
        return this.f261793a.a();
    }

    @Override // td0.b
    public final Set b() {
        return this.f261793a.b();
    }

    @Override // td0.b
    public final Set c(td0.a listedFilter) {
        Intrinsics.checkNotNullParameter(listedFilter, "listedFilter");
        return this.f261793a.c(listedFilter);
    }

    @Override // td0.b
    public final Set d() {
        return this.f261793a.d();
    }
}
