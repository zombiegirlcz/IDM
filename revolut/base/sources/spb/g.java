package spb;

import ard.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pcd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f264931w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f264932x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
        this.f264931w = str;
        this.f264932x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f264931w, this.f264932x, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vf0.h hVar = (vf0.h) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        List list = (List) hVar.f288433a;
        xi0.b bVar = (xi0.b) hVar.f288434b;
        uib.a aVar2 = (uib.a) hVar.f288435c;
        Set set = (Set) hVar.d;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (!set.contains(((s) obj3).f234881a)) {
                arrayList.add(obj3);
            }
        }
        return nim.a.v(((ypg.p) this.v.f264934b).n(arrayList, bVar, npg.l.AMOUNT_BALANCE), new t(this.f264931w, aVar2, bVar, this.f264932x, 26));
    }
}
