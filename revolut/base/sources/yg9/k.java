package yg9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormV2;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$SubformScreenAction;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreenContract$ToolbarAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BillFormV2 f313582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bill f313583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f313584c;
    public final Clause d;
    public final Clause e;
    public final SubformScreenContract$SubformScreenAction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SubformScreenContract$ToolbarAction f313585g;

    public k(BillFormV2 form, Bill bill, List userInputs, Clause clause, Clause clause2, SubformScreenContract$SubformScreenAction mainAction, SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction) {
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(mainAction, "mainAction");
        this.f313582a = form;
        this.f313583b = bill;
        this.f313584c = userInputs;
        this.d = clause;
        this.e = clause2;
        this.f = mainAction;
        this.f313585g = subformScreenContract$ToolbarAction;
    }

    public static k a(k kVar, Bill bill, ArrayList arrayList, Clause clause, Clause clause2, int i) {
        BillFormV2 form = kVar.f313582a;
        if ((i & 2) != 0) {
            bill = kVar.f313583b;
        }
        Bill bill2 = bill;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = kVar.f313584c;
        }
        List userInputs = list;
        if ((i & 8) != 0) {
            clause = kVar.d;
        }
        Clause clause3 = clause;
        if ((i & 16) != 0) {
            clause2 = kVar.e;
        }
        SubformScreenContract$SubformScreenAction mainAction = kVar.f;
        SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction = kVar.f313585g;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(form, "form");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(mainAction, "mainAction");
        return new k(form, bill2, userInputs, clause3, clause2, mainAction, subformScreenContract$ToolbarAction);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f313582a, kVar.f313582a) && Intrinsics.f(this.f313583b, kVar.f313583b) && Intrinsics.f(this.f313584c, kVar.f313584c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f313585g, kVar.f313585g);
    }

    public final int hashCode() {
        int iHashCode = this.f313582a.hashCode() * 31;
        Bill bill = this.f313583b;
        int iD = p.a.d((iHashCode + (bill == null ? 0 : bill.hashCode())) * 31, 31, this.f313584c);
        Clause clause = this.d;
        int iHashCode2 = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        int iHashCode3 = (this.f.hashCode() + ((iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31)) * 31;
        SubformScreenContract$ToolbarAction subformScreenContract$ToolbarAction = this.f313585g;
        return iHashCode3 + (subformScreenContract$ToolbarAction != null ? subformScreenContract$ToolbarAction.hashCode() : 0);
    }
}
