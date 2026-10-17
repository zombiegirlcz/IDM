package vch;

import com.revolut.data.model.Data;
import com.revolut.feature.user.api.UserApi$Toggles$MultipleCountryProfiles;
import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import com.revolut.feature.wealth.impl.ui.screens.withdraw.WithdrawScreenContract$Input;
import com.revolut.feature.wealth.models.addmoney.TransferSubjectId;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$ExtraConfiguration;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import com.revolut.retail.trading.core.domain.PocketInfo;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.z0;

/* JADX INFO: loaded from: classes9.dex */
public final class w0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ x0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(x0 x0Var, Continuation continuation) {
        super(1, continuation);
        this.v = x0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objX;
        PocketInfo pocketInfo;
        x0 x0Var = this.v;
        WithdrawScreenContract$Input withdrawScreenContract$Input = x0Var.f287743q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            jhi.b bVarG = mo3.a.g(x0Var.G.a(withdrawScreenContract$Input.f95652a), null, new v78.d(21), 1);
            this.u = 1;
            objX = vkm.q.x(bVarG, this);
            if (objX == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            objX = obj2;
        }
        Set set = (Set) objX;
        x0Var.x2(new h0(4));
        k1j.d dVar = k1j.d.RETAIL;
        io3.l lVar = io3.l.CURRENT;
        Data data = ((k) x0Var.t2()).f287709b.f287750a;
        String f104477a = (data == null || (pocketInfo = (PocketInfo) data.getContent()) == null) ? null : pocketInfo.getF104477a();
        Data data2 = ((k) x0Var.t2()).f;
        if (data2 != null) {
        }
        jte.d dVar2 = (jte.d) x0Var.D.f253096h;
        BalanceSelector$InputData balanceSelector$InputData = new BalanceSelector$InputData(set, dVar, lVar, null, null, null, null, f104477a, z0.h((dVar2.c(FeatureWealthApi$Toggles.InvestMoveMoneyGlobal.f95160c) && dVar2.c(UserApi$Toggles$MultipleCountryProfiles.f94594c)) ? BalanceSelector$ExtraConfiguration.CountryProfilesEnabled.f99372a : null), 88);
        prl.e eVar = x0Var.C;
        TransferSubjectId transferSubjectId = withdrawScreenContract$Input.f95652a;
        rbh.t transferOperation = rbh.t.WITHDRAW_MONEY;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(transferSubjectId, "transferSubjectId");
        Intrinsics.checkNotNullParameter(transferOperation, "transferOperation");
        x0Var.f2(x0Var.e1(new g1j.a(balanceSelector$InputData, new rbh.z(transferSubjectId, transferOperation, (gr6.a) eVar.f239325b, (rbh.b) eVar.f239326c, (tnb.g0) eVar.d, (gte.a) eVar.e))), ModalDestination.Style.POPUP.f98311a, new g0(x0Var, 4));
        return Unit.f186387a;
    }
}
