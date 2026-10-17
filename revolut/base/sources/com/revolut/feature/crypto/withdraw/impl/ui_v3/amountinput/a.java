package com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput;

import cli.y;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingPreCheckInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.amountinput.CryptoSendAmountInputScreenContract$ModalStep;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.kompot.common.ModalDestination;
import eq5.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ufm.n;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CryptoAddress f71257w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f71258x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wk5.a f71259y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(j jVar, CryptoAddress cryptoAddress, dj0.d dVar, wk5.a aVar, Continuation continuation) {
        super(1, continuation);
        this.v = jVar;
        this.f71257w = cryptoAddress;
        this.f71258x = dVar;
        this.f71259y = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f71257w, this.f71258x, this.f71259y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        xi0.b bVar;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails;
        j jVar = this.v;
        y yVar = jVar.F;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        CryptoAddress cryptoAddress = this.f71257w;
        if (i == 0) {
            o.b(obj2);
            n nVarB = jVar.f71277p.b(new CryptoAddressHostingPreCheckInput(cryptoAddress.f71059a, this.f71258x, this.f71259y));
            this.u = 1;
            obj2 = nim.a.b(nVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        CryptoAddressCounterparty cryptoAddressCounterparty = (CryptoAddressCounterparty) obj2;
        jVar.H2(yVar, new eq4.g(cryptoAddressCounterparty, 1));
        Intrinsics.h(cryptoAddressCounterparty);
        if (oo5.b.a(cryptoAddressCounterparty)) {
            CryptoAddressCounterparty cryptoAddressCounterparty2 = cryptoAddress.f71068p;
            if ((cryptoAddressCounterparty2 != null ? cryptoAddressCounterparty2.d : null) != wk5.h.SELF_HOSTED || (cryptoAddressRecipientDetails = cryptoAddress.f71065l) == null || cryptoAddressRecipientDetails.f70985b == wk5.i.USER) {
                oki.h.v2(jVar.G, new CryptoSendAmountInputScreenContract$ModalStep.MeshValidation(cryptoAddressCounterparty.f70977a), ModalDestination.Style.POPUP.f98311a);
            } else {
                oki.h.v2(jVar.G, CryptoSendAmountInputScreenContract$ModalStep.ThousandEuroLimitExceeded.f71256a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else {
            FundingSource fundingSource = ((r) ((j2) yVar.f22677a).getValue()).i;
            if (fundingSource != null && (bVar = fundingSource.f92241b) != null) {
                jVar.n2(new eif.j(jVar, bVar, null, 21), new whi.b(6));
            }
        }
        return Unit.f186387a;
    }
}
