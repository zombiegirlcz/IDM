package ook;

import gim.i;
import hd.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f227149w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(r rVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f227149w = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f227149w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f227149w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ArrayList arrayList = null;
        r rVar = this.f227149w;
        switch (i) {
            case 0:
                c cVar = (c) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list = (List) p.a.j(mok.b.class, KTypeProjection.INSTANCE, List.class, (ue0.c) rVar.f151366c, cVar.b());
                if (list != null) {
                    Intrinsics.checkNotNullParameter(list, "<this>");
                    List list2 = list;
                    arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(ue8.c.T((mok.b) it8.next()));
                    }
                }
                return arrayList;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mok.c cVar2 = (mok.c) j6.a.k(mok.c.class, (ue0.c) rVar.f151366c, j6.a.q("waitlist_layout_storage_", str));
                if (cVar2 != null) {
                    return nok.b.c(cVar2);
                }
                return null;
        }
    }
}
