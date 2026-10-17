package ew2;

import android.graphics.Bitmap;
import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 extends gim.i implements oim.n {
    public /* synthetic */ boolean u;
    public /* synthetic */ al4.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Data f130042w;

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        s0 s0Var = new s0(4, (Continuation) obj5);
        s0Var.u = zBooleanValue;
        s0Var.v = (al4.a) obj3;
        s0Var.f130042w = (Data) obj4;
        return s0Var.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        al4.a aVar = this.v;
        Data data = this.f130042w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        return new j0(z, aVar, (Bitmap) data.getContent());
    }
}
