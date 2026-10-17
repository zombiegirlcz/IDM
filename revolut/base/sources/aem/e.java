package aem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ int u = 0;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f3712w;

    public /* synthetic */ e(int i, Continuation continuation) {
        super(i, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) throws IOException {
        switch (this.u) {
            case 0:
                e eVar = new e(3, (Continuation) obj4);
                eVar.v = (fem.d) obj2;
                eVar.f3712w = (nem.c) obj3;
                eVar.invokeSuspend(Unit.f186387a);
                return null;
            default:
                e eVar2 = new e((i) this.f3712w, (Continuation) obj4);
                eVar2.v = (sem.f) obj2;
                return eVar2.invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        Set setI1;
        switch (this.u) {
            case 0:
                fem.d dVar = (fem.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (dVar.f.d(g.f3719a) == null) {
                    return null;
                }
                throw new ClassCastException();
            default:
                sem.f fVar = (sem.f) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                String string = ((fem.d) fVar.f262233a).f134657a.toString();
                h hVar = new h();
                i iVar = (i) this.f3712w;
                fem.d dVar2 = (fem.d) fVar.f262233a;
                kem.s sVar = dVar2.f134659c;
                kem.s sVar2 = hVar.f3725a;
                a1m.e.f(sVar2, sVar);
                kem.t tVarJ = sVar2.j();
                Map map = (Map) sVar2.f224673a;
                iVar.f3733a.invoke(hVar);
                for (Map.Entry entry : tVarJ.entries()) {
                    String name = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    List listB = sVar2.b(name);
                    if (listB == null) {
                        sVar2.c(list, name);
                    } else if (!listB.equals(list)) {
                        List list2 = kem.u.f183239a;
                        if (!name.equals("Cookie")) {
                            Intrinsics.checkNotNullParameter(name, "name");
                            map.remove(name);
                            sVar2.c(list, name);
                            List values = listB;
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(values, "values");
                            List list3 = (List) map.get(name);
                            if (list3 == null || (setI1 = zhm.d0.i1(list3)) == null) {
                                setI1 = zhm.h0.f322473a;
                            }
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : values) {
                                if (!setI1.contains((String) obj3)) {
                                    arrayList.add(obj3);
                                }
                            }
                            sVar2.c(arrayList, name);
                        }
                    }
                }
                kem.q0 url2 = hVar.f3726b.b();
                kem.n0 n0Var = url2.f183230h;
                b bVar = i.f3731b;
                kem.k0 k0Var = dVar2.f134657a;
                if (k0Var.d == null) {
                    k0Var.d = n0Var;
                }
                if (k0Var.f183205a.length() <= 0) {
                    Intrinsics.checkNotNullParameter(url2, "url");
                    kem.k0 k0Var2 = new kem.k0();
                    Intrinsics.checkNotNullParameter(k0Var2, "<this>");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    k0Var2.d = n0Var;
                    k0Var2.f(url2.f183226a);
                    int i = url2.f183227b;
                    Integer numValueOf = i != 0 ? Integer.valueOf(i) : null;
                    k0Var2.g(numValueOf != null ? numValueOf.intValue() : url2.i.f183218b);
                    a1m.e.J(k0Var2, (String) url2.f183231j.getValue());
                    k0Var2.e = (String) url2.f183233m.getValue();
                    k0Var2.f = (String) url2.f183234n.getValue();
                    kem.h0 value = new kem.h0();
                    value.e(a1m.e.E((String) url2.k.getValue()));
                    Intrinsics.checkNotNullParameter(value, "value");
                    k0Var2.i = value;
                    k0Var2.f183210j = new kem.r0(value);
                    String str = (String) url2.o.getValue();
                    Intrinsics.checkNotNullParameter(str, "<set-?>");
                    k0Var2.f183208g = str;
                    k0Var2.f183206b = url2.e;
                    k0Var2.d = k0Var.d;
                    int i2 = k0Var.f183207c;
                    if (i2 != 0) {
                        k0Var2.g(i2);
                    }
                    List listA = k0Var2.f183209h;
                    List list4 = k0Var.f183209h;
                    if (!list4.isEmpty()) {
                        if (listA.isEmpty() || ((CharSequence) zhm.d0.b0(list4)).length() == 0) {
                            listA = list4;
                        } else {
                            aim.e eVar = new aim.e((listA.size() + list4.size()) - 1);
                            int size = listA.size() - 1;
                            for (int i3 = 0; i3 < size; i3++) {
                                eVar.add(listA.get(i3));
                            }
                            eVar.addAll(list4);
                            listA = zhm.u.a(eVar);
                        }
                    }
                    k0Var2.e(listA);
                    if (k0Var.f183208g.length() > 0) {
                        String str2 = k0Var.f183208g;
                        Intrinsics.checkNotNullParameter(str2, "<set-?>");
                        k0Var2.f183208g = str2;
                    }
                    kem.h0 h0Var = new kem.h0();
                    a1m.e.f(h0Var, k0Var2.i);
                    kem.g0 value2 = k0Var.i;
                    Intrinsics.checkNotNullParameter(value2, "value");
                    k0Var2.i = value2;
                    k0Var2.f183210j = new kem.r0(value2);
                    for (Map.Entry entry2 : h0Var.entries()) {
                        String str3 = (String) entry2.getKey();
                        List list5 = (List) entry2.getValue();
                        if (!k0Var2.i.contains(str3)) {
                            k0Var2.i.c(list5, str3);
                        }
                    }
                    a1m.e.M(k0Var, k0Var2);
                }
                oem.e eVar2 = hVar.f3727c;
                for (oem.a key : zhm.d0.d1(eVar2.c().keySet())) {
                    oem.e eVar3 = dVar2.f;
                    eVar3.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    if (!eVar3.c().containsKey(key)) {
                        dVar2.f.e(key, eVar2.b(key));
                    }
                }
                dVar2.f134659c.clear();
                dVar2.f134659c.e(sVar2.j());
                k.f3738a.trace("Applied DefaultRequest to " + string + ". New url: " + dVar2.f134657a);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, Continuation continuation) {
        super(3, continuation);
        this.f3712w = iVar;
    }
}
