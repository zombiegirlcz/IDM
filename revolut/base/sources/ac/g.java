package ac;

import android.content.Context;
import gc.j;
import gc.l;

/* JADX INFO: loaded from: classes.dex */
public final class g implements bc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final phm.a f3011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f3012c;

    public /* synthetic */ g(bc.b bVar, phm.a aVar, int i) {
        this.f3010a = i;
        this.f3011b = bVar;
        this.f3012c = aVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f3010a) {
            case 0:
                return new f((Context) ((e) this.f3011b).f3006b, (gpk.c) ((e) this.f3012c).get());
            default:
                return new j(new ah.a(6), new af.f(6), gc.a.f, (l) this.f3011b.get(), this.f3012c);
        }
    }
}
