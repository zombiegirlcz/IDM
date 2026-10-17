package nhm;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public interface s extends t, mhm.b, Serializable {
    @Override // nhm.t
    default boolean J0() {
        return true;
    }

    @Override // mhm.b, java.util.function.Function
    default Object apply(Object obj2) {
        b bVar = ((l) this).f215602a;
        bVar.getClass();
        return bVar.b(0, Objects.hashCode(obj2), obj2).H8(new r(obj2));
    }

    @Override // nhm.t
    default int length() {
        return ((l) this).f215602a.size();
    }

    @Override // nhm.t
    default boolean z() {
        return true;
    }
}
