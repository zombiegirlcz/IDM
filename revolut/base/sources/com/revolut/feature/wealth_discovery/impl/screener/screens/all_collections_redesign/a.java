package com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign;

import com.revolut.data.model.Data;
import gim.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import l1.e;
import lph.d;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        d dVar = this.v;
        LinkedHashSet linkedHashSet = dVar.f199130r;
        boolean z = false;
        if (linkedHashSet != null) {
            List list = (List) data.getContent();
            Iterable iterableI2 = list != null ? d.I2(list) : null;
            if (iterableI2 == null) {
                iterableI2 = h0.f322473a;
            }
            Iterable iterable = iterableI2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it8 = iterable.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        break;
                    }
                    if (!linkedHashSet.contains((String) it8.next())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        if (z) {
            dVar.f199130r = null;
        }
        dVar.H2(dVar.f199131s, new e(dVar, data, z, 4));
        return Unit.f186387a;
    }
}
