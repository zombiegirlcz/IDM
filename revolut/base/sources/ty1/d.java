package ty1;

import java.util.concurrent.Callable;
import uw1.f;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f275459b;

    public /* synthetic */ d(e eVar, int i) {
        this.f275458a = i;
        this.f275459b = eVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f275458a) {
            case 0:
                b bVar = (b) this.f275459b.f275460a;
                bVar.getClass();
                return Boolean.valueOf(bVar.b(f.UPI));
            default:
                b bVar2 = (b) this.f275459b.f275460a;
                bVar2.getClass();
                return Boolean.valueOf(bVar2.b(f.UPI));
        }
    }
}
