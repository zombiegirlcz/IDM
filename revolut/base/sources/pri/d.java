package pri;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import zkm.o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class d implements f, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f239035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ifm.b f239036b;

    public d() {
        p0 p0Var = p0.f264001a;
        this.f239035a = rd0.e.a(o.f323119a);
        this.f239036b = new ifm.b();
    }

    @Override // pri.f
    public void I() {
        this.f239036b.d();
        e0.n(this.f239035a.getF74819h());
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF74819h() {
        return this.f239035a.getF74819h();
    }
}
