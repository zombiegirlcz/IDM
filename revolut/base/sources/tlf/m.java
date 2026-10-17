package tlf;

import aw0.o9;
import cmf.g;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transactions.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import tof.e3;
import tof.i5;
import tof.z6;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements oim.n {
    public /* synthetic */ cmf.g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Map f272081w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kbb.c f272082x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kbb.c cVar, Continuation continuation) {
        super(4, continuation);
        this.f272082x = cVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        m mVar = new m(this.f272082x, (Continuation) obj5);
        mVar.u = (cmf.g) obj2;
        mVar.v = (a3) obj3;
        mVar.f272081w = (Map) obj4;
        return mVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        k kVar;
        cmf.g gVar = this.u;
        a3 transaction = this.v;
        Map pockets = this.f272081w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(gVar instanceof cmf.h)) {
            if (Intrinsics.f(gVar, g.b.f25230a)) {
                return gVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        l lVar = (l) this.f272082x.d;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        i5 i5Var = transaction.Z;
        boolean z = (i5Var == null || i5Var.f272801a.equals("transaction.description.transfer.via.transfer.link")) ? false : true;
        z6 z6VarL0 = k71.k.l0(transaction);
        String strC = z6VarL0 != null ? z6VarL0.c() : null;
        if (strC != null) {
            kVar = new k(new TextClause(strC, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), true);
        } else if (z) {
            e3 e3Var = transaction.I.d;
            kVar = new k(new TextClause(thf.m.a(lVar.f272080a, transaction, pockets, null, null, null, null, null, Constants.TAG_FC_SPEED_MODE), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), ((e3Var != null ? e3Var.f272728c : null) == null || (e3Var.d == null && e3Var.e == null)) ? false : true);
        } else {
            kVar = new k(new TextLocalisedClause(R$string.transaction_description_internal_sent_via, u.c(new TextLocalisedClause(R$string.transaction_description_internal_payment_link, null, null, 14)), null, 12), false);
        }
        return cmf.h.a((cmf.h) gVar, null, kVar.f272078a, null, null, null, kVar.f272079b, false, null, null, null, YearClass.CLASS_2013);
    }
}
