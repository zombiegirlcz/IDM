package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f262728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f262729c;

    public /* synthetic */ c(Object obj2, int i, int i2) {
        this.f262727a = i2;
        this.f262729c = obj2;
        this.f262728b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f262727a) {
            case 0:
                b bVar = new b(this.f262728b);
                ((Observable) this.f262729c).subscribe(bVar);
                return bVar;
            default:
                tfm.b bVar2 = new tfm.b(this.f262728b);
                ((efm.r) this.f262729c).subscribe(bVar2);
                return bVar2;
        }
    }
}
