package ajm;

import java.lang.reflect.InvocationHandler;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;

/* JADX INFO: loaded from: classes14.dex */
public final class f implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f5611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f5612c;
    public final Lazy d;
    public final List e;

    public f(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f5610a = cls;
        this.f5611b = map;
        this.f5612c = lazy;
        this.d = lazy2;
        this.e = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r7, java.lang.reflect.Method r8, java.lang.Object[] r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ajm.f.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
