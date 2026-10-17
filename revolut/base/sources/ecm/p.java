package ecm;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes13.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f124852b = new p(new o(1), o.f124848b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f124853a = new ConcurrentHashMap();

    public p(o... oVarArr) {
        for (o oVar : oVarArr) {
            this.f124853a.put(oVar.a(), oVar);
        }
    }
}
