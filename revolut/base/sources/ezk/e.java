package ezk;

import e8h.j;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import nel.n;
import nii.l1;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function1 {
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b f130980w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f130981x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar, List list, Continuation continuation) {
        super(1, continuation);
        this.f130980w = bVar;
        this.f130981x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f130981x, this.f130980w, continuation);
            default:
                return new e(this.f130980w, this.f130981x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((e) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        List list = this.f130981x;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(w.t(list2, 10));
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((n) it8.next()).f214596b);
                    }
                    usc.a aVar = this.f130980w.f104169q;
                    this.v = 1;
                    j jVar = (j) aVar.f282889b;
                    jVar.getClass();
                    e8e.w wVar = new e8e.w(jVar, arrayList, null, 2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, wVar, this);
                    Object obj4 = fim.a.COROUTINE_SUSPENDED;
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj4) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar = this.f130980w;
                if (i3 == 0) {
                    o.b(obj2);
                    bVar.getClass();
                    an1.d dVar = new an1.d(bVar, 19);
                    e eVar = new e(list, bVar, (Continuation) null);
                    this.v = 1;
                    obj2 = k.V(bVar, null, null, dVar, eVar, this, 3);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.h hVar = (nii.h) obj2;
                if ((hVar instanceof nii.g) && (((nii.g) hVar).f216153b instanceof l1)) {
                    bVar.getClass();
                } else {
                    bVar.B2();
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f130981x = list;
        this.f130980w = bVar;
    }
}
