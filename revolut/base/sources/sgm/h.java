package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class h implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f262869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262870c;

    public /* synthetic */ h(Object obj2, Object obj3, int i) {
        this.f262868a = i;
        this.f262870c = obj2;
        this.f262869b = obj3;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f262868a) {
            case 0:
                Object obj2 = this.f262869b;
                g gVar = new g();
                gVar.f262838b = obj2;
                ((Observable) this.f262870c).subscribe(gVar);
                return new f(gVar, 0);
            default:
                Object obj3 = this.f262869b;
                tfm.e eVar = new tfm.e();
                eVar.f270418b = obj3;
                ((efm.r) this.f262870c).subscribe(eVar);
                return new f(eVar, 2);
        }
    }
}
