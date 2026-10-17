package dbd;

import androidx.room.util.DBUtil;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f112729w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f112729w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f112729w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f112729w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f112729w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xad.a aVar2 = gVar.d;
                abd.d dVar = (abd.d) DBUtil.performBlocking(aVar2.f303870a, true, false, new x52.a(aVar2, str, 21));
                if (dVar != null) {
                    return zad.a.a(dVar);
                }
                return null;
            default:
                d dVar2 = (d) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                xad.a aVar4 = gVar.d;
                dVar2.getClass();
                List list = (List) DBUtil.performBlocking(aVar4.f303870a, true, false, new x8h.d(aVar4, 20));
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList.add(zad.a.a((abd.d) it8.next()));
                }
                return arrayList;
        }
    }
}
