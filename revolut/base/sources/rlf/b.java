package rlf;

import aw0.k7;
import aw0.o9;
import cmf.g;
import cmf.h;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.transactions.impl.R$string;
import com.youTransactor.uCube.rpc.Constants;
import gim.i;
import hd.r;
import java.util.List;
import java.util.Map;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oim.o;
import tof.a3;
import tof.o3;
import tof.p3;
import zhm.r0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements o {
    public /* synthetic */ g u;
    public /* synthetic */ a3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ zk5.c f255039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Data f255040x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r f255041y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, Continuation continuation) {
        super(5, continuation);
        this.f255041y = rVar;
    }

    @Override // oim.o
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b bVar = new b(this.f255041y, (Continuation) obj6);
        bVar.u = (g) obj2;
        bVar.v = (a3) obj3;
        bVar.f255039w = (zk5.c) obj4;
        bVar.f255040x = (Data) obj5;
        return bVar.invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVarB;
        String str;
        g gVar = this.u;
        a3 transaction = this.v;
        zk5.c cVar = this.f255039w;
        Data data = this.f255040x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!(gVar instanceof h)) {
            if (Intrinsics.f(gVar, g.b.f25230a)) {
                return gVar;
            }
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(cVar);
        r61.c transactionDataContainerAppDomain = ue8.c.O(cVar);
        p3 p3Var = transaction.W;
        Clause textLocalisedClause = null;
        zk5.a aVar2 = (zk5.a) cVar.f322909b.get(p3Var != null ? p3Var.f272985g : null);
        Map mapG = (Map) data.getContent();
        if (mapG == null) {
            mapG = r0.g();
        }
        Map cryptoActionRequiredDeposits = mapG;
        r rVar = this.f255041y;
        rhf.d dVar = (rhf.d) rVar.f;
        a aVar3 = (a) rVar.e;
        boolean z = dVar == rhf.d.CRYPTO;
        boolean z3 = (aVar2 == null || dVar == rhf.d.PAYMENTS_CHAT) ? false : true;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Custom custom = new Custom(Integer.valueOf(R$attr.uikit_colorForeground), k.m0(transaction), null, false, null, Constants.TAG_FC_SPEED_MODE);
        if (k.A0(transaction) && z) {
            o3 o3Var = transaction.J;
            dj0.d dVar2 = o3Var != null ? o3Var.f272965a : null;
            if (dVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVarB = dVar2.a().l();
        } else {
            dVarB = k.b(transaction);
        }
        MoneyClause moneyClauseB = u5l.a.b(dVarB, null, k7.ALWAYS, custom, 3);
        if (aVar2 != null && (str = aVar2.f322906b) != null) {
            textLocalisedClause = new TextLocalisedClause(R$string.transaction_cryptoreceive_subtitle, u.c(new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 124)), null, 12);
        }
        if (textLocalisedClause == null) {
            textLocalisedClause = ((h) gVar).f25232b;
        }
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(transactionDataContainerAppDomain, "transactionDataContainerAppDomain");
        Image imageA = thf.d.a(aVar3.f255038a, transaction, r0.g(), null, transactionDataContainerAppDomain, null, null, null, null, null, null, null, 2036);
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(cryptoActionRequiredDeposits, "cryptoActionRequiredDeposits");
        return h.a((h) gVar, moneyClauseB, textLocalisedClause, null, imageA, thf.d.c(aVar3.f255038a, transaction, null, cryptoActionRequiredDeposits, null, null, 26), z3, false, null, null, null, 1988);
    }
}
