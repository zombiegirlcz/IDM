package ce;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface c {
    default Object a(Class cls) {
        return d(t.a(cls));
    }

    r b(t tVar);

    default cf.b c(Class cls) {
        return e(t.a(cls));
    }

    default Object d(t tVar) {
        cf.b bVarE = e(tVar);
        if (bVarE == null) {
            return null;
        }
        return bVarE.get();
    }

    cf.b e(t tVar);

    cf.b f(t tVar);

    default Set g(t tVar) {
        return (Set) f(tVar).get();
    }
}
