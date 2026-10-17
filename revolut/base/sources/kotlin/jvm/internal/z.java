package kotlin.jvm.internal;

import kotlin.reflect.full.IllegalCallableAccessException;

/* JADX INFO: loaded from: classes13.dex */
public class z extends y {
    public z(Class cls, String str, String str2, int i) {
        super(h.NO_RECEIVER, cls, str, str2, i);
    }

    public void f(Object obj2, Object obj3) throws IllegalCallableAccessException {
        ((zim.u) getSetter()).call(obj2, obj3);
    }

    public Object get(Object obj2) {
        return getGetter().call(obj2);
    }
}
