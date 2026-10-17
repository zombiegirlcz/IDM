package gbb;

import bn2.p;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements phm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f142251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qfe.c f142252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f142253c;

    public /* synthetic */ b(CoroutineScope coroutineScope, qfe.c cVar, p pVar) {
        this.f142251a = coroutineScope;
        this.f142252b = cVar;
        this.f142253c = pVar;
    }

    @Override // phm.a
    public final Object get() {
        return new hbb.b(this.f142251a, ((tn0.a) tn0.c.d.c()).f272276a, this.f142252b, this.f142253c);
    }
}
