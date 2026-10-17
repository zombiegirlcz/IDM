package r40;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.chat.domain.model.ChatListFilter;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.data.model.Data;
import com.revolut.feature.feedback.api.domain.Feedback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class s0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x0 f251366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(x0 x0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251366w = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                s0 s0Var = new s0(this.f251366w, continuation, 0);
                s0Var.v = obj2;
                return s0Var;
            case 1:
                s0 s0Var2 = new s0(this.f251366w, continuation, 1);
                s0Var2.v = obj2;
                return s0Var2;
            default:
                s0 s0Var3 = new s0(this.f251366w, continuation, 2);
                s0Var3.v = obj2;
                return s0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((s0) create((Feedback) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((s0) create((vf0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((s0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        u40.c cVar;
        Object next;
        ArrayList arrayListE0;
        int i = this.u;
        int i2 = 0;
        x0 x0Var = this.f251366w;
        switch (i) {
            case 0:
                Feedback feedback = (Feedback) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0Var.x2(new r0(feedback, 0));
                break;
            case 1:
                x0 x0Var2 = this.f251366w;
                ChatListContract$InputData chatListContract$InputData = x0Var2.f251376p;
                vf0.h hVar = (vf0.h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                boolean zBooleanValue = ((Boolean) hVar.f288433a).booleanValue();
                List list = (List) hVar.f288434b;
                List list2 = (List) hVar.f288435c;
                List list3 = (List) hVar.d;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (((u40.d) obj3).c()) {
                        arrayList.add(obj3);
                    } else {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj4 : list2) {
                    if (((u40.d) obj4).c()) {
                        arrayList3.add(obj4);
                    } else {
                        arrayList4.add(obj4);
                    }
                }
                ArrayList arrayListE02 = zhm.d0.E0(arrayList, zhm.d0.E0(list3, arrayList3));
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : arrayListE02) {
                    if (hashSet.add(((u40.d) obj5).a())) {
                        arrayList5.add(obj5);
                    }
                }
                t40.a aVar3 = x0Var2.f251378r;
                ChatListFilter chatListFilter = chatListContract$InputData.d;
                aVar3.getClass();
                x0Var2.x2(new hg0.e(zhm.d0.P0(t40.a.a(arrayList5, chatListFilter), new u0()), zBooleanValue, 3));
                x0Var2.D2(zhm.d0.E0(arrayList4, arrayList2));
                f fVar = ((a) x0Var2.t2()).f251321c;
                String str = chatListContract$InputData.f51141b;
                boolean z = fVar instanceof e;
                if (z && str != null) {
                    Data dataT = t1.t(((a) x0Var2.t2()).f251319a.f251336a, ((a) x0Var2.t2()).f251319a.f251337b);
                    Continuation continuation = null;
                    try {
                        Object content = dataT.getContent();
                        if (content != null) {
                            Pair pair = (Pair) content;
                            arrayListE0 = zhm.d0.E0((List) pair.f186386b, (List) pair.f186385a);
                        } else {
                            arrayListE0 = null;
                        }
                        data = new Data(arrayListE0, dataT.getError(), dataT.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, dataT.getLoading());
                    }
                    List list4 = (List) data.getContent();
                    if (list4 != null) {
                        Iterator it8 = list4.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (!(next instanceof u40.c) || !Intrinsics.f(((u40.c) next).a(), str)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        cVar = (u40.c) next;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        x0Var2.x2(new qc0.w(str, 29));
                        x0Var2.l2(new qd8.e((Object) x0Var2, (Object) str, false, continuation, 23), new yi5.b(26));
                        x0Var2.z2(str);
                    }
                } else if (z) {
                    x0Var2.x2(new r2d.d(23));
                }
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Instant instant = (Instant) pair2.f186385a;
                boolean zBooleanValue2 = ((Boolean) pair2.f186386b).booleanValue();
                u uVar = (u) x0Var.D.getValue();
                AtomicReference atomicReference = uVar.f251372g;
                if (zBooleanValue2 || uVar.f == s.IDLE) {
                    if (atomicReference.get() == null) {
                        uVar.e.a(uVar);
                    }
                    efm.r rVarDoOnSubscribe = ((efm.r) uVar.d.invoke(instant)).doOnSubscribe(new r25.c(26, new r(uVar, i2)));
                    Intrinsics.checkNotNullExpressionValue(rVarDoOnSubscribe, "doOnSubscribe(...)");
                    efm.r rVarN = mo3.a.n(rVarDoOnSubscribe);
                    r rVar = new r(uVar, 1);
                    efm.r rVarOnErrorResumeNext = rVarN.onErrorResumeNext(new onh.b(new qp5.x(new BreadcrumbException(), 10)));
                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                    ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new n1i.b(12, rVar), new n1i.b(12, t.f251367a));
                    Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
                    lfm.d.c(atomicReference, cVarSubscribe);
                }
                break;
        }
        return Unit.f186387a;
    }
}
