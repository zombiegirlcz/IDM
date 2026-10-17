package h8e;

import do3.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import pcd.x;
import pcd.y;
import s6e.z;
import yhm.o;
import ypg.p;
import zhm.d0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i iVar = this.v;
        if (i == 0) {
            o.b(obj2);
            iVar.X1(q7e.b.b());
            List list = ((e) iVar.t2()).f150020a;
            ArrayList<x> arrayList = new ArrayList();
            for (Object obj4 : list) {
                x xVar = (x) obj4;
                n user = ((e) iVar.t2()).f150022c;
                Intrinsics.checkNotNullParameter(xVar, "<this>");
                Intrinsics.checkNotNullParameter(user, "user");
                if (!Intrinsics.f(xVar.f234903a, user.f116408a)) {
                    arrayList.add(obj4);
                }
            }
            int iB = q0.b(w.t(arrayList, 10));
            if (iB < 16) {
                iB = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
            for (x xVar2 : arrayList) {
                boolean zContains = ((e) iVar.t2()).f150021b.contains(xVar2.f234903a);
                Set setH1 = d0.h1(xVar2.f234906g);
                if (zContains) {
                    setH1.add(y.WITHDRAW);
                } else {
                    setH1.remove(y.WITHDRAW);
                }
                linkedHashMap.put(xVar2.f234903a, setH1);
            }
            g6e.d dVar = iVar.f150026r;
            String str = iVar.f150024p.f89081a.f88953a.f234881a;
            this.u = 1;
            z zVar = (z) dVar;
            efm.b bVarH = ((p) zVar.f260323b).q(str, linkedHashMap).h(sjg.a.b(zVar.f260329m));
            Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
            Object objA = nim.a.a(bVarH, this);
            if (objA != fim.a.COROUTINE_SUSPENDED) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        iVar.s1();
        iVar.u2();
        return Unit.f186387a;
    }
}
