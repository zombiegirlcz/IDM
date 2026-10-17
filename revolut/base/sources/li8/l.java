package li8;

import com.revolut.data.model.Data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jck.y;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import l7j.t;
import md6.s;
import yhm.r;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c f195435w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f195435w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l lVar = new l(this.f195435w, continuation, 0);
                lVar.v = obj2;
                return lVar;
            case 1:
                l lVar2 = new l(this.f195435w, continuation, 1);
                lVar2.v = obj2;
                return lVar2;
            default:
                l lVar3 = new l(this.f195435w, continuation, 2);
                lVar3.v = obj2;
                return lVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((l) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((l) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.personal_details.c cVar = this.f195435w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                r rVar = (r) pair.f186385a;
                List juniorProfiles = (List) pair.f186386b;
                String firstName = (String) rVar.f314201a;
                String firstLastName = (String) rVar.f314202b;
                String secondLastName = (String) rVar.f314203c;
                cVar.f77062q.getClass();
                Intrinsics.checkNotNullParameter(firstName, "firstName");
                Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
                Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
                Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
                String strD = s.d(firstName, firstLastName, secondLastName);
                boolean z = false;
                if (!d0.W(strD)) {
                    List list = juniorProfiles;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                if (a0.z(tz4.d.m((com.revolut.feature.junior_profile.api.models.a) it8.next()), strD, true)) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                cVar.H2(cVar.u, new y(z, 26));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.u, new t(data, 19));
                break;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cVar.H2(cVar.u, new n((Data) pair2.f186385a, cVar, (Data) pair2.f186386b));
                break;
        }
        return Unit.f186387a;
    }
}
