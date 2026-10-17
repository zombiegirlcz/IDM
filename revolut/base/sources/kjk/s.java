package kjk;

import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import hha.w0;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f184465w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f184466x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i, long j2, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f184466x = obj2;
        this.v = j2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s((t) this.f184465w, (w0) this.f184466x, this.v, continuation, 0);
            case 1:
                return new s((lrk.r) this.f184465w, (tqk.a) this.f184466x, this.v, continuation, 1);
            case 2:
                int i = 2;
                s sVar = new s(i, this.v, (m6i.j) this.f184466x, continuation);
                sVar.f184465w = obj2;
                return sVar;
            case 3:
                return new s((nx1.h) this.f184465w, (String) this.f184466x, this.v, continuation, 3);
            case 4:
                return new s((nxb.e) this.f184465w, (String) this.f184466x, this.v, continuation, 4);
            case 5:
                return new s((px1.c) this.f184465w, (String) this.f184466x, this.v, continuation, 5);
            case 6:
                int i2 = 6;
                s sVar2 = new s(i2, this.v, (ti9.g) this.f184466x, continuation);
                sVar2.f184465w = obj2;
                return sVar2;
            default:
                return new s((xvj.e) this.f184465w, (String) this.f184466x, this.v, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((s) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((s) create((dj0.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        Object next;
        int i = this.u;
        Class cls = Long.TYPE;
        Object obj4 = this.f184466x;
        long j2 = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                xe0.e eVar = ((t) this.f184465w).f184467a;
                t.Companion.getClass();
                eVar.G(new Long(j2), q.a((w0) obj4), wim.z.d(o0.b(cls)));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((lrk.r) this.f184465w).f199549a.G(new Long(j2), p.a.p("until_date_", ((tqk.a) obj4).name(), "_FREE_TRADES_INCENTIVE_WIDGET_ID"), cls);
                return Unit.f186387a;
            case 2:
                List list = (List) this.f184465w;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = list;
                Iterator it8 = list2.iterator();
                while (true) {
                    obj3 = null;
                    if (it8.hasNext()) {
                        next = it8.next();
                        BalanceWrapper balanceWrapper = (BalanceWrapper) next;
                        if (balanceWrapper.getF() == null) {
                            Long l2 = balanceWrapper.f99405b;
                            if ((l2 != null ? l2.longValue() : 0L) >= j2) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                BalanceWrapper balanceWrapper2 = (BalanceWrapper) next;
                if (balanceWrapper2 == null) {
                    Iterator it9 = list2.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            Object next2 = it9.next();
                            dj0.d f = ((BalanceWrapper) next2).getF();
                            if ((f != null ? f.f115082a : 0L) >= j2) {
                                obj3 = next2;
                            }
                        }
                    }
                    balanceWrapper2 = (BalanceWrapper) obj3;
                }
                return balanceWrapper2 == null ? (BalanceWrapper) zhm.d0.d0(list) : balanceWrapper2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, ((nx1.h) this.f184465w).f220063a, (String) obj4, new Long(j2));
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ue0.c cVar = ((nxb.e) this.f184465w).f220549b;
                String str = (String) obj4;
                nxb.a aVar6 = (nxb.a) cVar.T2(str, nxb.a.class);
                nxb.a aVar7 = aVar6 != null ? new nxb.a(aVar6.getCount() + 1, j2) : new nxb.a(1, j2);
                cVar.G(aVar7, str, nxb.a.class);
                return aVar7;
            case 5:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, ((px1.c) this.f184465w).f240555a, (String) obj4, new Long(j2));
                return Unit.f186387a;
            case 6:
                dj0.d dVar = (dj0.d) this.f184465w;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(((ej9.e0) ((ti9.g) obj4).f271456a).f126805l.b(new dj9.d0(j2, dVar.f115082a), w4l.i.f294643c), ej9.x.f);
            default:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.google.android.gms.internal.mlkit_vision_face.a.B(cls, ((xvj.e) this.f184465w).d, (String) obj4, new Long(j2));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(Object obj2, Object obj3, long j2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f184465w = obj2;
        this.f184466x = obj3;
        this.v = j2;
    }
}
