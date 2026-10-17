package sdi;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.api.R$string;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import ip0.i10;
import ip0.k10;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import pyb.s;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends gim.i implements Function3 {
    public /* synthetic */ Data u;
    public /* synthetic */ Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f261924w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f261925x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i, Continuation continuation, q qVar) {
        super(3, continuation);
        this.f261924w = qVar;
        this.f261925x = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        q qVar = this.f261924w;
        p pVar = new p(this.f261925x, (Continuation) obj4, qVar);
        pVar.u = (Data) obj2;
        pVar.v = (Data) obj3;
        return pVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data transactions = this.u;
        Data extraData = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        fub.k kVar = this.f261924w.f261929g;
        RevPointsFlowDestination seeAllDestination = new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(null, new RevPointsFlowDestination.StartType.OpenTransactionList.UiOverrides(null, null, 9), 1));
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        Intrinsics.checkNotNullParameter(seeAllDestination, "seeAllDestination");
        Intrinsics.checkNotNullParameter("TX_WIDGET_LIST_ID_SEE_ALL", "seeAllListId");
        k10 k10Var = new k10("EMPTY_LIST_ITEM_ID", com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D097", null, null, null, 30), new i10(new TextLocalisedClause(R$string.rev_points_transactions_empty, null, null, 14)));
        return (List) iii.c.f(t1.t(transactions, extraData), new pth.l(k10Var, 16), new pyb.g(1), new pyb.m(k10Var, this.f261925x, (s) kVar, seeAllDestination));
    }
}
