package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class e implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f262787b;

    public /* synthetic */ e() {
        this.f262786a = 2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f262786a) {
            case 0:
                d dVar = new d();
                Observable.wrap((Observable) this.f262787b).materialize().subscribe(dVar);
                return dVar;
            case 1:
                return new i((Observable) this.f262787b, new j(), 0);
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f262787b;
                return linkedHashMap == null ? Collections.emptyIterator() : linkedHashMap.values().iterator();
        }
    }

    public /* synthetic */ e(Observable observable, int i) {
        this.f262786a = i;
        this.f262787b = observable;
    }
}
