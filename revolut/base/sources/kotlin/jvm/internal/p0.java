package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes13.dex */
public class p0 {
    public KFunction a(p pVar) {
        return pVar;
    }

    public KClass b(Class cls) {
        return new k(cls);
    }

    public KDeclarationContainer c(Class cls) {
        return new d0(cls);
    }

    public KType d(KType kType) {
        x0 x0Var = (x0) kType;
        return new x0(kType.getF186441a(), kType.getF186442b(), x0Var.getF186443c(), x0Var.getD() | 2);
    }

    public wim.f e(w wVar) {
        return wVar;
    }

    public wim.h f(y yVar) {
        return yVar;
    }

    public wim.j g(a0 a0Var) {
        return a0Var;
    }

    public KType h(KType kType, KType kType2) {
        return new x0(kType.getF186441a(), kType.getF186442b(), kType2, ((x0) kType).getD());
    }

    public wim.o i(e0 e0Var) {
        return e0Var;
    }

    public wim.p j(g0 g0Var) {
        return g0Var;
    }

    public wim.q k(i0 i0Var) {
        return i0Var;
    }

    public String l(o oVar) {
        String string = oVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String m(u uVar) {
        return l(uVar);
    }

    public void n(wim.r rVar, List list) {
        ((w0) rVar).a(list);
    }

    public KType o(wim.c cVar, List list, boolean z) {
        return new x0(cVar, list, z);
    }

    public wim.r p(KClass kClass, wim.t tVar) {
        return new w0(kClass, tVar);
    }
}
