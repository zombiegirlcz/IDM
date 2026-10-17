package f8h;

import gim.i;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import t7h.s;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.v, continuation, 0);
            default:
                return new b(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ue0.c) dVar.f132779b.get()).clear();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Set<String> setKeys = dVar.f132778a.keys();
                n7h.a aVar3 = n7h.b.Companion;
                ArrayList arrayList = new ArrayList();
                for (String key : setKeys) {
                    aVar3.getClass();
                    Intrinsics.checkNotNullParameter(key, "key");
                    s sVar = null;
                    if (a0.H(key, "MARGIN_BORROWING_STATUS_", false)) {
                        String strE0 = d0.e0(key, "MARGIN_BORROWING_STATUS_");
                        String strW0 = d0.w0('_', strE0, "");
                        String strB0 = d0.B0('_', strE0, "");
                        if (strB0.length() != 0 && strW0.length() != 0) {
                            sVar = new s(strB0, strW0);
                        }
                    }
                    if (sVar != null) {
                        arrayList.add(sVar);
                    }
                }
                return arrayList;
        }
    }
}
