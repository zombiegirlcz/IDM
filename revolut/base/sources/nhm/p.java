package nhm;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: loaded from: classes14.dex */
public interface p extends Iterator, t {
    static m of(Object obj2) {
        return new m(obj2);
    }

    default p J8(String str) {
        return !hasNext() ? q.f215610a : new n(this, str);
    }

    @Override // nhm.t
    default boolean R0() {
        return true;
    }

    @Override // mhm.e
    default boolean isEmpty() {
        return !hasNext();
    }

    @Override // java.lang.Iterable
    default Iterator iterator() {
        return this;
    }

    @Override // nhm.t
    default int length() {
        Integer numValueOf = 0;
        p it8 = iterator();
        while (it8.hasNext()) {
            it8.next();
            numValueOf = Integer.valueOf(numValueOf.intValue() + 1);
        }
        return numValueOf.intValue();
    }

    default p map(Function function) {
        return !hasNext() ? q.f215610a : new o(this, function);
    }

    @Override // nhm.t
    default boolean z() {
        return false;
    }

    @Override // mhm.e, java.lang.Iterable
    default p iterator() {
        return this;
    }
}
