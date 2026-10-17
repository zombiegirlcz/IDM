package t48;

import com.revolut.feature.terms.api.model.Terms;
import com.revolut.feature.terms.api.model.TermsScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f267935w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f267935w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f267935w, continuation, 0);
            case 1:
                return new s(this.f267935w, continuation, 1);
            default:
                return new s(this.f267935w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((s) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        y yVar = this.f267935w;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    r rVar = y.Companion;
                    List list = ((i) yVar.t2()).f267920c;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        Terms terms = (Terms) obj3;
                        TermsScope[] termsScopeArr = y.D;
                        int length = termsScopeArr.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length) {
                            }
                            if (Intrinsics.f(termsScopeArr[i6], terms.f)) {
                                arrayList.add(obj3);
                            } else {
                                i6++;
                            }
                            break;
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(pre.c.b(yVar.f267945q, ((Terms) it8.next()).f90355a));
                    }
                    pfm.f fVarO = efm.b.o(arrayList2);
                    Intrinsics.checkNotNullExpressionValue(fVarO, "merge(...)");
                    this.v = 1;
                    if (nim.a.a(fVarO, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                r rVar2 = y.Companion;
                yVar.v2(new j(((i) yVar.t2()).f267919b));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    s sVar = new s(yVar, continuation, i2);
                    this.v = 1;
                    if (ue8.c.f0(yVar, sVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s sVar2 = new s(yVar, continuation, i3);
                this.v = 1;
                r rVar3 = y.Companion;
                Object objB = pu7.a.B(yVar.k, "accept_terms", sVar2, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
