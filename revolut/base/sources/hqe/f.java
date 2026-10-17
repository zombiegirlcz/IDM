package hqe;

import com.revolut.core.ui_kit.delegates.AccountCellItemDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.teen.accounts.impl.R$string;
import com.revolut.feature.teen_profile.api.models.TeenProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import rp0.t;
import rp0.y;
import vkm.q;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fo3.c f154671w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ TeenProfile f154672x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f154673y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, fo3.c cVar, TeenProfile teenProfile, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = hVar;
        this.f154671w = cVar;
        this.f154672x = teenProfile;
        this.f154673y = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, this.f154671w, this.f154672x, this.f154673y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        h hVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(zi0.c.w(hVar.f154676p.d(this.f154671w.f136801a, w4l.h.f294642c)), null, new hkb.e(28), 1);
            this.u = 1;
            obj2 = q.x(bVarG, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        List<io3.d> list = (List) ((Pair) obj2).f186386b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (io3.d dVar : list) {
            arrayList.add(AccountCellItemDelegate.Model.e(hVar.f154677q.a(new io3.g(dVar, null, null, 30), false), null, new e(dVar, this.f154673y), null, 3145727));
        }
        j60.a aVar2 = hVar.o;
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        aVar2.x(new y(arrayList, new t(new TextLocalisedClause(R$string.home_currency_account_title_choose_account_teen, u.c(this.f154672x.f90335b), null, 12), null, null, 30), rp0.l.WINDOW, null, null, null, 1016));
        return Unit.f186387a;
    }
}
