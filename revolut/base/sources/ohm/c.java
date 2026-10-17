package ohm;

import java.io.Serializable;
import java.util.function.Function;
import mhm.e;
import nhm.m;
import nhm.p;
import nhm.q;
import nhm.r;

/* JADX INFO: loaded from: classes14.dex */
public interface c extends e, Serializable {
    default Object F5(Object obj2) {
        return isEmpty() ? obj2 : get();
    }

    default Object H8(r rVar) throws Throwable {
        if (isEmpty()) {
            throw ((Throwable) rVar.get());
        }
        return get();
    }

    Object get();

    @Override // mhm.e
    boolean isEmpty();

    default c map(Function function) {
        return isEmpty() ? a.f225407a : new b(function.apply(get()));
    }

    @Override // java.lang.Iterable
    default p iterator() {
        return isEmpty() ? q.f215610a : new m(get());
    }
}
