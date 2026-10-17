package com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.add_edit_asset.AddEditAssetContract$InputData$Mode;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import vzi.g;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AddEditAssetContract$InputData$Mode f87918w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AddEditAssetContract$InputData$Mode addEditAssetContract$InputData$Mode, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f87918w = addEditAssetContract$InputData$Mode;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f87918w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objI;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            d dVar = this.v;
            grd.a aVar2 = (grd.a) ((j2) dVar.f87925x.f22677a).getValue();
            boolean zI2 = dVar.I2();
            boolean z = aVar2.k != aVar2.f145988l;
            AddEditAssetContract$InputData$Mode.Edit edit = (AddEditAssetContract$InputData$Mode.Edit) this.f87918w;
            g gVar = new g(edit.f87909a, aVar2.c(), (zI2 && edit.e) ? Boolean.TRUE : (zI2 && z) ? Boolean.valueOf(aVar2.k) : null);
            tsj.g gVar2 = dVar.f87921r;
            String str = edit.f87910b.f99216a;
            this.u = 1;
            objI = gVar2.i(str, gVar, this);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objI = ((m) obj2).f314193a;
        }
        return new m(objI);
    }
}
