package com.revolut.feature.freelancer.impl.ui.dialog.single_choice;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.dialog.single_choice.FreelancerSingleChoiceScreenContract$MenuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerSingleChoiceScreenContract$InputData f73779a;

    public b(FreelancerSingleChoiceScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f73779a = inputData;
    }

    @Override // cli.n
    public final o c(j jVar) {
        lw0.j jVar2;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        FreelancerSingleChoiceScreenContract$InputData freelancerSingleChoiceScreenContract$InputData = this.f73779a;
        Clause clause = freelancerSingleChoiceScreenContract$InputData.f73773a;
        FreelancerSingleChoiceScreenContract$MenuItem freelancerSingleChoiceScreenContract$MenuItem = freelancerSingleChoiceScreenContract$InputData.f73774b;
        if (Intrinsics.f(freelancerSingleChoiceScreenContract$MenuItem, FreelancerSingleChoiceScreenContract$MenuItem.AddNew.f73776a)) {
            jVar2 = new lw0.j("ITEM_ID_MENU_ADD_NEW", new fw0.b(new TextLocalisedClause(R$string.freelancer_common_action_new, null, null, 14)));
        } else {
            if (freelancerSingleChoiceScreenContract$MenuItem != null) {
                throw new NoWhenBranchMatchedException();
            }
            jVar2 = null;
        }
        lw0.a aVar = new lw0.a(clause, null, null, jVar2, false, 22);
        List<FreelancerSingleChoiceScreenContract$SingleChoiceItem> list = freelancerSingleChoiceScreenContract$InputData.f73775c;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (FreelancerSingleChoiceScreenContract$SingleChoiceItem freelancerSingleChoiceScreenContract$SingleChoiceItem : list) {
            String str = freelancerSingleChoiceScreenContract$SingleChoiceItem.f73777a;
            arrayList.add(new SingleChoiceDelegate.Model(str, freelancerSingleChoiceScreenContract$SingleChoiceItem.f73778b, Intrinsics.f(str, freelancerSingleChoiceScreenContract$InputData.d), null, null, 2040));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, aVar);
    }
}
