package com.revolut.feature.wealth.ui.impl.trades;

import com.revolut.feature.wealth.ui.impl.trades.HoldingTradeDetailsControllerContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation;
import dfl.e;
import dfl.f0;
import dfl.i0;
import dfl.m;
import dfl.s;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nel.n;
import oki.h;
import pnf.f;
import pnh.j;
import pnh.z;
import vkm.j2;
import xul.d;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ String u;
    public final /* synthetic */ b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f96050w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, b bVar, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = str;
        this.v = bVar;
        this.f96050w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.u, this.v, this.f96050w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        hel.b bVar;
        b bVar2 = this.v;
        com.revolut.kompot.navigable.vc.modal.a aVar = bVar2.E;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        String str = this.u;
        int iHashCode = str.hashCode();
        int i = 0;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Object obj3 = this.f96050w;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (iHashCode) {
            case -2014305083:
                if (str.equals("CORPORATE_TRANSACTION_TYPE_ID")) {
                    kp3.b bVar3 = obj3 instanceof kp3.b ? (kp3.b) obj3 : null;
                    if (bVar3 != null) {
                        return bVar2.C1(u0.b(h8b.a.a(bVar2.f96058y, bVar3, false)));
                    }
                    return null;
                }
                return Unit.f186387a;
            case -1276366530:
                if (str.equals("EXCHANGED_ROW_ID")) {
                    d dVar = obj3 instanceof d ? (d) obj3 : null;
                    if (dVar != null) {
                        h.v2(aVar, new HoldingTradeDetailsControllerContract$Step.ExchangeBreakdownDialog(dVar.f309112a, dVar.f309113b, dVar.f309114c), bottom_dialog);
                        return Unit.f186387a;
                    }
                    return null;
                }
                return Unit.f186387a;
            case -1100228502:
                if (str.equals("TRADE_CONFIRMATION_ID")) {
                    i0 i0Var = bVar2.C;
                    if (!(i0Var instanceof s) && !(i0Var instanceof f0) && !(i0Var instanceof m)) {
                        if (i0Var instanceof e) {
                            return bVar2.l2(new f(bVar2, (e) i0Var, objArr2 == true ? 1 : 0, 1), new yi5.b(26));
                        }
                        throw new IllegalStateException("Unexpected trade");
                    }
                    String strF = i0Var.f();
                    if (strF != null) {
                        return bVar2.l2(new z(bVar2, strF, objArr == true ? 1 : 0, i), new yi5.b(26));
                    }
                    return null;
                }
                return Unit.f186387a;
            case 78236354:
                if (str.equals("CASH_SETTLEMENT_DATE_ID")) {
                    TradingLegalEntityInformation tradingLegalEntityInformation = (TradingLegalEntityInformation) ((j) ((j2) bVar2.D.f22677a).getValue()).e.getContent();
                    if (tradingLegalEntityInformation != null && (bVar = tradingLegalEntityInformation.f105106a) != null) {
                        h.v2(aVar, new HoldingTradeDetailsControllerContract$Step.SettlementDateDialog(bVar), bottom_dialog);
                        return Unit.f186387a;
                    }
                    return null;
                }
                return Unit.f186387a;
            case 1363514530:
                if (str.equals("TAX_VALUE_ROW_ID")) {
                    h.v2(aVar, new HoldingTradeDetailsControllerContract$Step.TaxInfoDialog(obj3 instanceof n ? (n) obj3 : null), bottom_dialog);
                    return Unit.f186387a;
                }
                return Unit.f186387a;
            default:
                return Unit.f186387a;
        }
    }
}
