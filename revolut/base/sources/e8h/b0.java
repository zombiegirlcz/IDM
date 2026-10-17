package e8h;

import a8h.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes9.dex */
public final class b0 extends gim.i implements Function3 {
    public /* synthetic */ List u;
    public final /* synthetic */ c0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, Continuation continuation) {
        super(3, continuation);
        this.v = c0Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        b0 b0Var = new b0(this.v, (Continuation) obj4);
        b0Var.u = (List) obj3;
        return b0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List<c0h.a> list = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        for (c0h.a aVar2 : list) {
            ue0.c cVar = this.v.f123675b;
            String strA = c0.a(y0.b(aVar2.f20269a));
            Intrinsics.checkNotNullParameter(aVar2, "<this>");
            String strName = aVar2.f20269a.name();
            String str = aVar2.f20270b;
            ArrayList<c0h.c> arrayList = aVar2.f20271c;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
            for (c0h.c cVar2 : arrayList) {
                arrayList2.add(new b.C0008b(cVar2.f20272a, cVar2.e, cVar2.d, cVar2.f, cVar2.f20273b, cVar2.f20274c.name()));
            }
            cVar.G(new b.a(strName, str, arrayList2), strA, wim.z.d(kotlin.jvm.internal.o0.b(b.a.class)));
        }
        return Unit.f186387a;
    }
}
