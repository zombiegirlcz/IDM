package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details;

import boh.f;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.details.IncomeSortersDetailsContract$InputData;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorter;
import d27.g0;
import do3.n;
import do3.q;
import dqd.j;
import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ IncomeSortersDetailsContract$InputData.Mode f87752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f87753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ io3.d f87754y;
    public final /* synthetic */ n z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, IncomeSortersDetailsContract$InputData.Mode mode, List list, io3.d dVar2, n nVar, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f87752w = mode;
        this.f87753x = list;
        this.f87754y = dVar2;
        this.z = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f87752w, this.f87753x, this.f87754y, this.z, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((aqd.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        aqd.b bVar = (aqd.b) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a3 a3Var = bVar.f8326b;
        od0.i iVar = bVar.f8325a;
        j jVar = this.v.f87758b;
        xi0.b targetCurrency = a3Var.k.f115083b;
        IncomeSorter incomeSorter = (IncomeSorter) iVar.f224257a;
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return nim.a.v(f.e(u0.m(new dfj.f(jVar.f116947c, 4), ((tpd.f) jVar.f116945a).b(incomeSorter != null ? q.i(incomeSorter.f99164h) : null)), new g0(jVar, targetCurrency, incomeSorter)), new aqd.f(this.v, a3Var, iVar, this.f87752w, this.f87753x, bVar, this.f87754y, this.z, 0));
    }
}
