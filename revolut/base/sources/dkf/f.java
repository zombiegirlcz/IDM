package dkf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaTxDetail;
import com.revolut.feature.transactions.impl.R$string;
import gim.i;
import java.util.List;
import k71.k;
import klf.j1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ms0.e4;
import oim.n;
import tof.a3;
import tof.t3;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends i implements n {
    public /* synthetic */ a3 u;
    public /* synthetic */ t3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ j1 f115510w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ g f115511x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(4, continuation);
        this.f115511x = gVar;
    }

    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        f fVar = new f(this.f115511x, (Continuation) obj5);
        fVar.u = (a3) obj2;
        fVar.v = (t3) obj3;
        fVar.f115510w = (j1) obj4;
        return fVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        a3 transaction = this.u;
        t3 t3Var = this.v;
        j1 youthWalletOwner = this.f115510w;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = this.f115511x.f115515p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        aim.e eVarB = u.b();
        a aVar2 = bVar.f115505a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        boolean zP = k.P(transaction);
        ibd.i iVar = transaction.C;
        if (zP && !youthWalletOwner.c()) {
            u1 u1Var = v1.Companion;
            t1 t1Var = t1.MANAGE_SPARE_CHANGE;
            u1Var.getClass();
            eVarB.add(new ActionsView.Item(u1.a(t1Var), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_manage, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
        }
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        if (((t3Var != null ? t3Var.f273064h0 : null) != null || k.X(transaction)) && iVar != null && !youthWalletOwner.c()) {
            u1 u1Var2 = v1.Companion;
            t1 t1Var2 = t1.MANAGE_RECURRING_REV_POINTS_PURCHASE;
            u1Var2.getClass();
            eVarB.add(new ActionsView.Item(u1.a(t1Var2), mx0.d.SEMIACCENT, false, null, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_manage, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_gear, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
        }
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        if (((t3Var != null ? t3Var.f273064h0 : null) != null || k.X(transaction)) && iVar == null && !youthWalletOwner.c()) {
            u1 u1Var3 = v1.Companion;
            t1 t1Var3 = t1.BUY_AGAIN_ONE_OFF_REV_POINTS_PURCHASE;
            u1Var3.getClass();
            boolean z = false;
            e4 e4Var = null;
            eVarB.add(new ActionsView.Item(u1.a(t1Var3), mx0.d.SEMIACCENT, z, e4Var, null, new TextLocalisedClause(R$string.transactionUI_transaction_details_actions_buy_again, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
        }
        gte.a aVar3 = aVar2.f115504a;
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(youthWalletOwner, "youthWalletOwner");
        if (k.P(transaction) && !youthWalletOwner.c()) {
            jte.d dVar = (jte.d) aVar3;
            if (dVar.c(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe.f84114c) && dVar.c(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaTxDetail.f84116c)) {
                u1 u1Var4 = v1.Companion;
                t1 t1Var4 = t1.SPARE_CHANGE_REFUND;
                u1Var4.getClass();
                boolean z3 = false;
                e4 e4Var2 = null;
                eVarB.add(new ActionsView.Item(u1.a(t1Var4), mx0.d.SEMIACCENT, z3, e4Var2, null, new TextLocalisedClause(R$string.transactionUI_transaction_refund, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_revert_left, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, null, false, null, null, null, null, 32668));
            }
        }
        return u.a(eVarB);
    }
}
