package com.revolut.retail.feature.crypto_deposits.impl.ui.overview;

import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import mii.m;
import mii.q;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoDepositAddress f100086w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, CryptoDepositAddress cryptoDepositAddress, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
        this.f100086w = cryptoDepositAddress;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.v, this.f100086w, continuation);
        aVar.u = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar = (q) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (qVar instanceof m) {
            h.v2(this.v.G, new CryptoDepositsOverviewControllerContract$ModalStep.ViewAddress(this.f100086w), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
