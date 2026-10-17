package zim;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes13.dex */
public class i2 extends kotlin.jvm.internal.p0 {
    public static l0 q(kotlin.jvm.internal.h hVar) {
        KDeclarationContainer owner = hVar.getOwner();
        return owner instanceof l0 ? (l0) owner : g.f322635b;
    }

    @Override // kotlin.jvm.internal.p0
    public final KFunction a(kotlin.jvm.internal.p pVar) {
        return new n0(q(pVar), pVar.getName(), pVar.getSignature(), pVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public final KClass b(Class cls) {
        return d.a(cls);
    }

    @Override // kotlin.jvm.internal.p0
    public final KDeclarationContainer c(Class jClass) {
        e eVar = d.f322618a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        return (KDeclarationContainer) d.f322619b.y(jClass);
    }

    @Override // kotlin.jvm.internal.p0
    public final KType d(KType kType) {
        return gj7.b.f(kType);
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.f e(kotlin.jvm.internal.w wVar) {
        return new p0(q(wVar), wVar.getName(), wVar.getSignature(), wVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.h f(kotlin.jvm.internal.y yVar) {
        return new r0(q(yVar), yVar.getName(), yVar.getSignature(), yVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.j g(kotlin.jvm.internal.a0 a0Var) {
        return new t0(q(a0Var), a0Var.getName(), a0Var.getSignature());
    }

    @Override // kotlin.jvm.internal.p0
    public final KType h(KType kType, KType kType2) {
        return gj7.b.h(kType, kType2);
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.o i(kotlin.jvm.internal.e0 e0Var) {
        return new g1(q(e0Var), e0Var.getName(), e0Var.getSignature(), e0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.p j(kotlin.jvm.internal.g0 g0Var) {
        return new j1(q(g0Var), g0Var.getName(), g0Var.getSignature(), g0Var.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.q k(kotlin.jvm.internal.i0 i0Var) {
        return new m1(q(i0Var), i0Var.getName(), i0Var.getSignature());
    }

    @Override // kotlin.jvm.internal.p0
    public final String l(kotlin.jvm.internal.o oVar) {
        n0 n0VarB;
        n0 n0VarA = yim.d.a(oVar);
        return (n0VarA == null || (n0VarB = o2.b(n0VarA)) == null) ? super.l(oVar) : l2.d(n0VarB);
    }

    @Override // kotlin.jvm.internal.p0
    public final String m(kotlin.jvm.internal.u uVar) {
        return l(uVar);
    }

    @Override // kotlin.jvm.internal.p0
    public final void n(wim.r rVar, List list) {
    }

    @Override // kotlin.jvm.internal.p0
    public final KType o(wim.c cVar, List arguments, boolean z) {
        if (!(cVar instanceof kotlin.jvm.internal.j)) {
            return xim.b.a(cVar, arguments, z, Collections.EMPTY_LIST);
        }
        Class jClass = ((kotlin.jvm.internal.j) cVar).getF186423a();
        e eVar = d.f322618a;
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (arguments.isEmpty()) {
            return z ? (KType) d.d.y(jClass) : (KType) d.f322620c.y(jClass);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d.e.y(jClass);
        Pair pair = new Pair(arguments, Boolean.valueOf(z));
        Object obj2 = concurrentHashMap.get(pair);
        if (obj2 == null) {
            c2 c2VarA = xim.b.a(d.a(jClass), arguments, z, zhm.f0.f322471a);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(pair, c2VarA);
            obj2 = objPutIfAbsent == null ? c2VarA : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return (KType) obj2;
    }

    @Override // kotlin.jvm.internal.p0
    public final wim.r p(KClass kClass, wim.t tVar) {
        List<wim.r> typeParameters;
        if (kClass != null) {
            typeParameters = kClass.getTypeParameters();
        } else {
            if (!(kClass instanceof KCallable)) {
                throw new IllegalArgumentException(m72.b.r("Type parameter container must be a class or a callable: ", kClass));
            }
            typeParameters = ((KCallable) kClass).getTypeParameters();
        }
        for (wim.r rVar : typeParameters) {
            if (rVar.getName().equals("PluginConfigT")) {
                return rVar;
            }
        }
        throw new IllegalArgumentException(m72.b.r("Type parameter PluginConfigT is not found in container: ", kClass));
    }
}
