package com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionOffLine;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.new_zealand.akahu.AkahuFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import enb.f;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.g0;
import nii.y0;
import oki.h;
import ufm.n;
import yhm.o;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        c cVar = this.v;
        yki.i iVar = cVar.f73073r;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            n nVarB = cVar.o.b("akahu", null, null, null, null);
            this.u = 1;
            objB = nim.a.b(nVarB, this);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB = obj2;
        }
        LinkAuthorizationUrlDataModel linkAuthorizationUrlDataModel = (LinkAuthorizationUrlDataModel) objB;
        if (linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel.AuthorizationUrlModel) {
            l.b1(cVar, cVar.X1(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_linking_akahu_in_progress_title, null, null, 14), new TextLocalisedClause(R$string.external_institutions_linking_akahu_in_progress_description, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new f(cVar, ((LinkAuthorizationUrlDataModel.AuthorizationUrlModel) linkAuthorizationUrlDataModel).f72216a, null, 2), 3);
        } else {
            boolean z = linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                h.w2(iVar, new AkahuFlowContract$Step.InstitutionAlreadyLinkErrorDialog("akahu"), bottom_dialog);
            } else if (linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) {
                h.w2(iVar, new AkahuFlowContract$Step.InstitutionLinkLimitErrorDialog(((LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) linkAuthorizationUrlDataModel).f72218a), bottom_dialog);
            } else {
                if (!(linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionOffLine)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(iVar, AkahuFlowContract$Step.InstitutionOffLineErrorDialog.f73070a, bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
