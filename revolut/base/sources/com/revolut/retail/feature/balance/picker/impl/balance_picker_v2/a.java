package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import cli.y;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.transfer.core.models.CountryProfile;
import com.revolut.feature.wealth.ui.api.navigation.holdings.CashHoldingMarginLoanInfoDialogDescriptor;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreenContract$ModalStep;
import com.revolut.shared.feature.wealth.models.holding.AllowedCashOperationsReason;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import gim.i;
import hx7.e;
import j1j.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n1j.m;
import n1j.r;
import oki.h;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends i implements Function1 {
    public d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f99504w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f99505x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RowDelegate.Model model, c cVar, Continuation continuation) {
        super(1, continuation);
        this.f99504w = model;
        this.f99505x = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f99504w, this.f99505x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3;
        String str;
        c cVar = this.f99505x;
        com.revolut.kompot.navigable.vc.modal.a aVar = cVar.F;
        y yVar = cVar.G;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            Object obj4 = this.f99504w.u;
            if (obj4 instanceof ra7.a) {
                CountryProfile countryProfile = ((m) ((j2) yVar.f22677a).getValue()).f211392g;
                if (countryProfile != null && (str = countryProfile.f92231a) != null) {
                    h.v2(aVar, new BalancePickerScreenContract$ModalStep.HiddenAccounts(str), ModalDestination.Style.FULLSCREEN_FADE.f98307a);
                }
            } else if (obj4 instanceof BalancePickerScreenContract$DisabledBalanceParcel) {
                p1j.d dVar = cVar.C;
                BalanceWrapper wrapper = ((BalancePickerScreenContract$DisabledBalanceParcel) obj4).f99496a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                CashHoldingMarginLoanInfoDialogDescriptor cashHoldingMarginLoanInfoDialogDescriptor = null;
                if (wrapper instanceof BalanceWrapper.TradingAccountBalanceWrapper) {
                    BalanceWrapper.TradingAccountBalanceWrapper wrapper2 = (BalanceWrapper.TradingAccountBalanceWrapper) wrapper;
                    Intrinsics.checkNotNullParameter(wrapper2, "wrapper");
                    CashHoldingAvailability cashHoldingAvailability = wrapper2.i;
                    AllowedCashOperationsReason allowedCashOperationsReason = cashHoldingAvailability.f105110c;
                    if (allowedCashOperationsReason instanceof AllowedCashOperationsReason.HasMarginLoan) {
                        cashHoldingMarginLoanInfoDialogDescriptor = new CashHoldingMarginLoanInfoDialogDescriptor(cashHoldingAvailability.f105108a.f183149b.f115083b, ((AllowedCashOperationsReason.HasMarginLoan) allowedCashOperationsReason).f105107a);
                    } else if (allowedCashOperationsReason != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!(wrapper instanceof BalanceWrapper.CollateralBalanceWrapper) && !(wrapper instanceof BalanceWrapper.CreditCardBalanceWrapper) && !(wrapper instanceof BalanceWrapper.DeFiBalanceWrapper) && !(wrapper instanceof BalanceWrapper.JuniorPocketBalanceWrapper) && !(wrapper instanceof BalanceWrapper.JuniorSavingsBalanceWrapper) && !(wrapper instanceof BalanceWrapper.JuniorVaultBalanceWrapper) && !(wrapper instanceof BalanceWrapper.NonExistingCurrencyBalanceWrapper) && !(wrapper instanceof BalanceWrapper.PocketBalanceWrapper) && !(wrapper instanceof BalanceWrapper.ProVaultBalanceWrapper) && !(wrapper instanceof BalanceWrapper.RevPointsAccountBalanceWrapper) && !(wrapper instanceof BalanceWrapper.RevPointsPocketBalanceWrapper) && !(wrapper instanceof BalanceWrapper.SavingsBalanceWrapper) && !(wrapper instanceof BalanceWrapper.TeenPocketBalanceWrapper) && !(wrapper instanceof BalanceWrapper.TeenVaultBalanceWrapper) && !(wrapper instanceof BalanceWrapper.VaultBalanceWrapper)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (cashHoldingMarginLoanInfoDialogDescriptor != null) {
                    h.v2(aVar, new BalancePickerScreenContract$ModalStep.DisabledBalanceExplanationStep(cashHoldingMarginLoanInfoDialogDescriptor), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                } else {
                    e.h(new IllegalStateException(p.a.p("DisabledBalanceParcel clicked for ", wrapper.f99404a, " but no explanation.")));
                }
            } else if (obj4 instanceof d) {
                p1j.b bVar = cVar.f99511t;
                d dVar2 = (d) obj4;
                k1j.a aVar3 = dVar2.d;
                this.u = dVar2;
                this.v = 1;
                Object objB = bVar.b(aVar3, this);
                if (objB == aVar2) {
                    return aVar2;
                }
                obj3 = obj4;
                obj2 = objB;
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj3 = this.u;
        o.b(obj2);
        if (((Boolean) obj2).booleanValue()) {
            cVar.H2(yVar, new n1.y(new r((d) obj3, true), 5));
        } else {
            cVar.C2(new g1j.b((d) obj3));
        }
        return Unit.f186387a;
    }
}
