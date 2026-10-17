package com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit;
import com.revolut.feature.external_accounts.api.model.LinkAuthorizationUrlDataModel$Error$InstitutionOffLine;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.link_account.CrossBorderLinkAccountFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
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
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f72888w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f72889x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f72890y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, String str2, String str3, Continuation continuation) {
        super(1, continuation);
        this.v = dVar;
        this.f72888w = str;
        this.f72889x = str2;
        this.f72890y = str3;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f72888w, this.f72889x, this.f72890y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        d dVar = this.v;
        CrossBorderLinkAccountFlowContract$InputData crossBorderLinkAccountFlowContract$InputData = dVar.o;
        yki.a aVar = dVar.f72900y;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            n nVarB = dVar.f72894q.b(this.f72888w, this.f72889x, crossBorderLinkAccountFlowContract$InputData.f72860b, null, null);
            this.u = 1;
            objB = nim.a.b(nVarB, this);
            if (objB == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            objB = obj2;
        }
        LinkAuthorizationUrlDataModel linkAuthorizationUrlDataModel = (LinkAuthorizationUrlDataModel) objB;
        boolean z = linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel.AuthorizationUrlModel;
        String str = this.f72890y;
        if (z) {
            String str2 = ((LinkAuthorizationUrlDataModel.AuthorizationUrlModel) linkAuthorizationUrlDataModel).f72216a;
            do6.b bVar = dVar.f72896s;
            NaviCommand naviCommand = crossBorderLinkAccountFlowContract$InputData.e;
            if (naviCommand == null) {
                bVar.a();
            } else {
                bVar.c(naviCommand);
            }
            l.b1(dVar, dVar.X1(new y0(null, new g0(new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_title, u.c(str), null, 12), new TextLocalisedClause(R$string.external_institutions_out_of_process_linking_description, u.c(str), null, 12), null, null, null, null, null, null, false, null, false, null, 16380), false, 5)), null, new gii.b(dVar, str2, null, 10), 3);
        } else {
            boolean z3 = linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionAlreadyLink;
            ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
            if (z3) {
                h.w2(aVar, new CrossBorderLinkAccountFlowContract$Step.InstitutionAlreadyLinkErrorDialog(str), bottom_dialog);
            } else if (linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) {
                h.w2(aVar, new CrossBorderLinkAccountFlowContract$Step.InstitutionLinkLimitErrorDialog(((LinkAuthorizationUrlDataModel$Error$InstitutionLinkLimit) linkAuthorizationUrlDataModel).f72218a), bottom_dialog);
            } else {
                if (!(linkAuthorizationUrlDataModel instanceof LinkAuthorizationUrlDataModel$Error$InstitutionOffLine)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.w2(aVar, CrossBorderLinkAccountFlowContract$Step.InstitutionOffLineErrorDialog.f72882a, bottom_dialog);
            }
        }
        return Unit.f186387a;
    }
}
