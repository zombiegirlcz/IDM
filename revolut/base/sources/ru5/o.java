package ru5;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ z u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = zVar;
        this.v = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        List list;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVar = this.u;
        Data data2 = ((j) zVar.t2()).f257417b;
        String str = this.v;
        try {
            Object content = data2.getContent();
            if (content != null) {
                list = (List) content;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (zVar.f257442t.a((pt5.w) obj3, str)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() != list.size()) {
                    list = arrayList;
                }
            } else {
                list = null;
            }
            data = new Data(list, data2.getError(), data2.getLoading());
        } catch (Throwable th10) {
            data = new Data(null, th10, data2.getLoading());
        }
        zVar.x2(new rtl.s(data, 7));
        return Unit.f186387a;
    }
}
