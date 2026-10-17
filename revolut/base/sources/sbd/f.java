package sbd;

import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qbd.v;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f261576w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261576w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f261576w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f261576w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        h hVar = this.f261576w;
        switch (i) {
            case 0:
                d dVar = (d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = hVar.f261582c;
                String str = dVar.f261573a;
                String str2 = dVar.f261574b;
                v vVar = (v) j6.a.k(v.class, cVar, str);
                if (vVar != null) {
                    return rbd.b.b(vVar, str2);
                }
                Set setKeys = cVar.keys();
                ArrayList arrayList = new ArrayList(w.t(setKeys, 10));
                Iterator it8 = setKeys.iterator();
                while (it8.hasNext()) {
                    arrayList.add((v) j6.a.k(v.class, cVar, (String) it8.next()));
                }
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next = it9.next();
                        v vVar2 = (v) next;
                        if (Intrinsics.f(vVar2 != null ? vVar2.f244210c : null, dVar.f261573a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                v vVar3 = (v) next;
                if (vVar3 != null) {
                    return rbd.b.b(vVar3, str2);
                }
                return null;
            default:
                String str3 = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar2 = hVar.f261582c;
                Set setKeys2 = cVar2.keys();
                ArrayList arrayList2 = new ArrayList();
                Iterator it10 = setKeys2.iterator();
                while (it10.hasNext()) {
                    v vVar4 = (v) j6.a.k(v.class, cVar2, (String) it10.next());
                    if (vVar4 != null) {
                        arrayList2.add(vVar4);
                    }
                }
                ArrayList arrayListA = rbd.b.a(str3, arrayList2);
                if (arrayListA.isEmpty()) {
                    return null;
                }
                return arrayListA;
        }
    }
}
