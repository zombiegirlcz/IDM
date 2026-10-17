package wg9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f297248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bill f297249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f297250c;
    public final TextLocalisedClause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FormServerError f297251g;

    public k(ArrayList formFields, Bill bill, List userInputs, TextLocalisedClause title, Clause clause, Clause clause2, FormServerError formServerError) {
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f297248a = formFields;
        this.f297249b = bill;
        this.f297250c = userInputs;
        this.d = title;
        this.e = clause;
        this.f = clause2;
        this.f297251g = formServerError;
    }

    public static k a(k kVar, Bill bill, ArrayList arrayList, Clause clause, Clause clause2, FormServerError formServerError, int i) {
        ArrayList formFields = kVar.f297248a;
        if ((i & 2) != 0) {
            bill = kVar.f297249b;
        }
        Bill bill2 = bill;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = kVar.f297250c;
        }
        List userInputs = list;
        TextLocalisedClause title = kVar.d;
        if ((i & 16) != 0) {
            clause = kVar.e;
        }
        Clause clause3 = clause;
        if ((i & 32) != 0) {
            clause2 = kVar.f;
        }
        Clause clause4 = clause2;
        if ((i & 64) != 0) {
            formServerError = kVar.f297251g;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(formFields, "formFields");
        Intrinsics.checkNotNullParameter(userInputs, "userInputs");
        Intrinsics.checkNotNullParameter(title, "title");
        return new k(formFields, bill2, userInputs, title, clause3, clause4, formServerError);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f297248a.equals(kVar.f297248a) && Intrinsics.f(this.f297249b, kVar.f297249b) && Intrinsics.f(this.f297250c, kVar.f297250c) && this.d.equals(kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f297251g, kVar.f297251g);
    }

    public final int hashCode() {
        int iHashCode = this.f297248a.hashCode() * 31;
        Bill bill = this.f297249b;
        int iA = t61.a.a(p.a.d((iHashCode + (bill == null ? 0 : bill.hashCode())) * 31, 31, this.f297250c), 31, this.d);
        Clause clause = this.e;
        int iHashCode2 = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        FormServerError formServerError = this.f297251g;
        return iHashCode3 + (formServerError != null ? formServerError.hashCode() : 0);
    }
}
