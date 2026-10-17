package com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home;

import cli.y;
import com.revolut.data.model.Data;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nxa.v;
import pwa.m;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar = this.v;
        y yVar = dVar.E;
        Data data = (Data) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (data.getError() != null) {
            dVar.J2();
            dVar.H2(yVar, new v(18));
        } else {
            boolean z = dVar.o.f81842a;
            if (z) {
                if (z) {
                    if (data.getLoading()) {
                        dVar.H2(yVar, new v(20));
                    } else if (data.getContent() != null) {
                        d.I2(dVar, (m) data.getContent(), true);
                    }
                }
            } else if (data.getContent() != null) {
                d.I2(dVar, (m) data.getContent(), false);
            } else if (data.getLoading()) {
                dVar.H2(yVar, new v(19));
            }
        }
        return Unit.f186387a;
    }
}
