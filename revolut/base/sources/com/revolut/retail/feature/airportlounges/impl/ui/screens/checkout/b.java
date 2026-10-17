package com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout;

import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.checkout.AirportLoungePassCheckoutScreenContract$ErrorDialogPayload;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.l1;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        n1 n1Var = (n1) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (n1Var instanceof l1) {
            Parcelable parcelableA = ((l1) n1Var).f216190a.a();
            boolean z = parcelableA instanceof AirportLoungePassCheckoutScreenContract$ErrorDialogPayload.InsufficientBalance;
            c cVar = this.v;
            if (z) {
                cVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, ((AirportLoungePassCheckoutScreenContract$ErrorDialogPayload.InsufficientBalance) parcelableA).f99045a, null, null, 30)));
            } else if (Intrinsics.f(parcelableA, AirportLoungePassCheckoutScreenContract$ErrorDialogPayload.GenericError.f99044a)) {
                cVar.J2();
            }
        }
        return Unit.f186387a;
    }
}
