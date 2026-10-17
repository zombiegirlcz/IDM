package ecm;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f124880a = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f124881b = new v();

    public static v b() {
        ((l2) t.f124875a).getClass();
        v vVar = (v) l2.f124838b.get();
        v vVar2 = f124881b;
        if (vVar == null) {
            vVar = vVar2;
        }
        return vVar == null ? vVar2 : vVar;
    }

    public final v a() {
        ((l2) t.f124875a).getClass();
        ThreadLocal threadLocal = l2.f124838b;
        v vVar = (v) threadLocal.get();
        v vVar2 = f124881b;
        if (vVar == null) {
            vVar = vVar2;
        }
        threadLocal.set(this);
        return vVar == null ? vVar2 : vVar;
    }

    public final void c(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("toAttach");
        }
        l2 l2Var = (l2) t.f124875a;
        ThreadLocal threadLocal = l2.f124838b;
        l2Var.getClass();
        v vVar2 = (v) threadLocal.get();
        v vVar3 = f124881b;
        if (vVar2 == null) {
            vVar2 = vVar3;
        }
        if (vVar2 != this) {
            l2.f124837a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (vVar != vVar3) {
            threadLocal.set(vVar);
        } else {
            threadLocal.set(null);
        }
    }
}
