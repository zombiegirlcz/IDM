package uek;

import be7.s;
import do3.q;
import iuf.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f279478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f279479x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, g gVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f279478w = mVar;
        this.f279479x = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l(this.f279478w, this.f279479x, continuation, 0);
            case 1:
                return new l(this.f279478w, this.f279479x, continuation, 1);
            default:
                return new l(this.f279478w, this.f279479x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        m mVar = this.f279478w;
        Continuation continuation = null;
        g gVar = this.f279479x;
        int i2 = 1;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    lek.b bVar = mVar.f279480p;
                    this.v = 1;
                    lek.m mVar2 = (lek.m) bVar;
                    mVar2.getClass();
                    ArrayList<e> arrayList = gVar.f279472b;
                    int iB = q0.b(w.t(arrayList, 10));
                    if (iB < 16) {
                        iB = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                    for (e eVar : arrayList) {
                        linkedHashMap.put(eVar.f279466a.f102617a, new Integer((int) eVar.f279467b));
                    }
                    bek.g gVar2 = mVar2.f194586a;
                    gVar2.getClass();
                    s sVar = new s(linkedHashMap, gVar2, null, 2);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, sVar, this);
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
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    if (mVar.o.f102625a) {
                        lek.b bVar2 = mVar.f279480p;
                        this.v = 1;
                        if (((lek.m) bVar2).h(gVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        l lVar = new l(mVar, gVar, continuation, 0);
                        this.v = 2;
                        if (q.t(mVar, lVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i5 != 1 && i5 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                m mVar3 = this.f279478w;
                if (i6 == 0) {
                    o.b(obj2);
                    lic.a aVar3 = new lic.a(mVar3, 18);
                    y yVar = new y(mVar3, 27);
                    l lVar2 = new l(mVar3, gVar, continuation, i2);
                    this.v = 1;
                    obj2 = n14.k.Q(mVar3, null, aVar3, yVar, lVar2, this, 1);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                nii.e eVar2 = (nii.e) obj2;
                if (!(eVar2 instanceof nii.c)) {
                    if (!(eVar2 instanceof nii.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    mVar3.B2();
                }
                return Unit.f186387a;
        }
    }
}
