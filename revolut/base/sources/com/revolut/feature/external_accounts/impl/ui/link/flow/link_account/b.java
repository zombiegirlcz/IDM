package com.revolut.feature.external_accounts.impl.ui.link.flow.link_account;

import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionOffLine;
import com.revolut.feature.external_accounts.impl.ui.link.flow.link_account.LinkAccountFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import ufm.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ExternalInstitution f73012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f73013x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, ExternalInstitution externalInstitution, String str, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f73012w = externalInstitution;
        this.f73013x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f73012w, this.f73013x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        d dVar = this.v;
        yki.a aVar = dVar.f73021w;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        ExternalInstitution externalInstitution = this.f73012w;
        if (i == 0) {
            o.b(obj2);
            n nVarB = dVar.f73017q.b(externalInstitution.f66107a, this.f73013x, dVar.f73020t.f72991b, null, null);
            this.u = 1;
            obj2 = nim.a.b(nVarB, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        LinkAuthorizationUrlDataModel linkAuthorizationUrlDataModel = (LinkAuthorizationUrlDataModel) obj2;
        if (linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel.AuthorizationUrlModel) {
            dVar.J2(((LinkAuthorizationUrlDataModel.AuthorizationUrlModel) linkAuthorizationUrlDataModel).f72216a, externalInstitution.f66108b);
        } else {
            boolean z = linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z) {
                h.w2(aVar, new LinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog(externalInstitution.f66108b), bottom_dialog);
            } else if (linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) {
                h.w2(aVar, new LinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog(((LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) linkAuthorizationUrlDataModel).f72218a), bottom_dialog);
            } else {
                if (!(linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionOffLine)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(aVar, LinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f73006a, bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
