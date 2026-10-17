package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary;

import aw0.h;
import aw0.n6;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.retail.feature.beneficiary.impl.R$string;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreenContract$ButtonAction;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import t4j.f;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DuplicateBeneficiaryDialogScreenContract$InputData f99735a;

    public b(DuplicateBeneficiaryDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f99735a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        f5j.a aVar = this.f99735a.f99734a;
        Map map = aVar.u;
        if (map == null || !map.containsKey("IBAN")) {
            Map map2 = aVar.u;
            if (map2 == null || !map2.containsKey("ACCOUNT_NUMBER")) {
                textLocalisedClause = null;
                return new f(new cii.a(new lw0.a(new TextLocalisedClause(R$string.beneficiary_creation_duplicate_beneficiary, null, null, 14), textLocalisedClause, null, null, false, 28), new h(false, new n6(new TextLocalisedClause(R$string.beneficiary_creation_duplicate_view_beneficiary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new DuplicateBeneficiaryDialogScreenContract$ButtonAction.ViewBeneficiary(aVar), 508), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, DuplicateBeneficiaryDialogScreenContract$ButtonAction.Cancel.f99732a, 508), null, null, null, 121)));
            }
            textLocalisedClause2 = new TextLocalisedClause(R$string.beneficiary_creation_duplicate_account_number, null, null, 14);
        } else {
            textLocalisedClause2 = new TextLocalisedClause(R$string.beneficiary_creation_duplicate_iban, null, null, 14);
        }
        textLocalisedClause = textLocalisedClause2;
        return new f(new cii.a(new lw0.a(new TextLocalisedClause(R$string.beneficiary_creation_duplicate_beneficiary, null, null, 14), textLocalisedClause, null, null, false, 28), new h(false, new n6(new TextLocalisedClause(R$string.beneficiary_creation_duplicate_view_beneficiary, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, new DuplicateBeneficiaryDialogScreenContract$ButtonAction.ViewBeneficiary(aVar), 508), new n6(new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_cancel, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, DuplicateBeneficiaryDialogScreenContract$ButtonAction.Cancel.f99732a, 508), null, null, null, 121)));
    }
}
