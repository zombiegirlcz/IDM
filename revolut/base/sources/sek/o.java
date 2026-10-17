package sek;

import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import com.revolut.shared.feature.workflow.engine.api.models.MobileScreenParams;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f262216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f262217x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r rVar, List list, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f262216w = rVar;
        this.f262217x = list;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f262216w, this.f262217x, continuation, 0);
            default:
                return new o(this.f262216w, this.f262217x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    r rVar = this.f262216w;
                    lek.b bVar = rVar.f262219p;
                    String f102583a = ((aek.b) rVar.o.f102622a).getF102583a();
                    this.v = 1;
                    lek.m mVar = (lek.m) bVar;
                    qek.b bVar2 = mVar.e;
                    List nominees = this.f262217x;
                    Intrinsics.checkNotNullParameter(nominees, "nominees");
                    List<PodNominee> list = nominees;
                    ArrayList arrayList = new ArrayList(w.t(list, 10));
                    for (PodNominee podNominee : list) {
                        String str = podNominee.f102617a;
                        if (a0.H(str, "pending-", false)) {
                            str = null;
                        }
                        String str2 = str;
                        String str3 = podNominee.f102618b;
                        String str4 = podNominee.f102619c;
                        String string = podNominee.e.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        arrayList.add(new MobileScreenParams.PodBeneficiaries.PodBeneficiary(str2, str3, str4, string, podNominee.f, podNominee.f102620g, podNominee.f102621h));
                    }
                    Object objJ = mVar.d.j(f102583a, new MobileScreenParams.PodBeneficiaries(arrayList), this);
                    if (objJ != fim.a.COROUTINE_SUSPENDED) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    r rVar2 = this.f262216w;
                    o oVar = new o(rVar2, this.f262217x, null, 0);
                    this.v = 1;
                    if (do3.q.t(rVar2, oVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
