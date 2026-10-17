package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer;

import com.revolut.feature.external_accounts.api.MandateApi$Toggles$VrpSetupBottomSheet;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.easy_bank_transfer.CrossBorderEasyBankTransferFlowContract$Step;
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
    public final /* synthetic */ String f72848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ se6.b f72850y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, String str2, se6.b bVar, String str3, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f72848w = str;
        this.f72849x = str2;
        this.f72850y = bVar;
        this.z = str3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f72848w, this.f72849x, this.f72850y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        se6.b bVar = this.f72850y;
        String str = this.f72848w;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            com.revolut.feature.credit.application.plugins.impl.ui.form.a aVar2 = new com.revolut.feature.credit.application.plugins.impl.ui.form.a(eVar, str, bVar, null, 16);
            this.u = 1;
            obj2 = eVar.p2(this, aVar2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        String str2 = this.z;
        String str3 = this.f72849x;
        if (zBooleanValue) {
            h.w2(eVar.f72858y, new CrossBorderEasyBankTransferFlowContract$Step.CreateMandate(str, str3, str2, bVar.f262124c), ((jte.d) eVar.f72857x).c(MandateApi$Toggles$VrpSetupBottomSheet.f72205c) ? ModalDestination.Style.BOTTOM_DIALOG.f98301a : ModalDestination.Style.POPUP.f98311a);
        } else {
            eVar.n2(new c(eVar, str, str3, bVar.f262124c, str2, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
