package com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer;

import bw6.k;
import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.external_accounts.impl.ui.link.flow.easy_bank_transfer.EasyBankTransferFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f72982w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72983x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f72984y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, String str2, boolean z, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f72982w = str;
        this.f72983x = str2;
        this.f72984y = z;
        this.z = z3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f72982w, this.f72983x, this.f72984y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objP2;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        Continuation continuation = null;
        String str = this.f72982w;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            k kVar = new k(eVar, str, this.z, continuation, 1);
            this.u = 1;
            objP2 = eVar.p2(this, kVar);
            if (objP2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objP2 = obj2;
        }
        boolean zBooleanValue = ((Boolean) objP2).booleanValue();
        boolean z = this.f72984y;
        String str2 = this.f72983x;
        if (zBooleanValue) {
            if (((jte.d) eVar.u).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c)) {
                h.w2(eVar.v, new EasyBankTransferFlowContract$Step.CreateMandate(str, str2, z), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                h.u2(eVar, eVar.v, new EasyBankTransferFlowContract$Step.CreateMandate(str, str2, z), null, 6);
            }
        } else {
            eVar.n2(new c(eVar, str, str2, z, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
