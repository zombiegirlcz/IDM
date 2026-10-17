package kkf;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class u5 extends gim.i implements oim.o {
    public /* synthetic */ List u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f184968w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f184969x;

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj5).booleanValue();
        u5 u5Var = new u5(5, (Continuation) obj6);
        u5Var.u = (List) obj2;
        u5Var.v = (Data) obj3;
        u5Var.f184968w = (Data) obj4;
        u5Var.f184969x = zBooleanValue;
        return u5Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = this.u;
        Data data = this.v;
        Data data2 = this.f184968w;
        boolean z = this.f184969x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return (data.getContent() == ba6.h0.VISIBLE || data2.getContent() != null || z) ? zhm.f0.f322471a : list;
    }
}
