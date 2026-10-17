package cjk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance.api.models.InsuranceDocumentsAvailability;
import com.revolut.retail.feature.pricing_plans.ui.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    /* JADX INFO: renamed from: cjk.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0155b {

        /* JADX INFO: renamed from: cjk.b$b$a */
        public static final class a extends AbstractC0155b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f24698a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: cjk.b$b$b, reason: collision with other inner class name */
        public static final class C0156b extends AbstractC0155b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0156b f24699a = new C0156b();

            private C0156b() {
            }
        }

        /* JADX INFO: renamed from: cjk.b$b$c */
        public static final class c extends AbstractC0155b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f24700a = new c();

            private c() {
            }
        }

        private AbstractC0155b() {
        }
    }

    public static TextLocalisedClause a(String planId, InsuranceDocumentsAvailability availability, boolean z, boolean z3) {
        boolean z4;
        int i;
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(availability, "availability");
        if (availability instanceof InsuranceDocumentsAvailability.ReviewRequired) {
            z4 = true;
        } else {
            if (!Intrinsics.f(availability, InsuranceDocumentsAvailability.Unavailable.f74931a)) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = false;
        }
        TextLocalisedClause textLocalisedClause = z ? new TextLocalisedClause(R$string.family_plans_terms_duo_plan, null, new Click(28, (Integer) null, (Object) AbstractC0155b.a.f24698a, "terms_shared_plans_id", false), 10) : new TextLocalisedClause(R$string.family_plans_terms_member, null, new Click(28, (Integer) null, (Object) AbstractC0155b.C0156b.f24699a, "terms_extra_member_id", false), 10);
        int i2 = R$string.family_plans_terms_paid_plans;
        AbstractC0155b.c cVar = AbstractC0155b.c.f24700a;
        Clause[] elements = {textLocalisedClause, new TextLocalisedClause(i2, null, new Click(28, (Integer) null, (Object) cVar, "terms_paid_plans_id", false), 10), z4 ? new TextLocalisedClause(R$string.family_plans_terms_insurance_documents, null, new Click(28, (Integer) null, (Object) new c(planId), "terms_insurance_documents_id", false), 10) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        ArrayList arrayList = (ArrayList) listL;
        int size = arrayList.size();
        if (size == 1) {
            i = R$string.plan_footnote_agreement_single_link;
        } else if (size == 2) {
            i = R$string.plan_footnote_agreement_double_link;
        } else if (size == 3) {
            i = R$string.plan_footnote_agreement_triple_link;
        } else {
            if (size != 4) {
                throw new IllegalStateException(j6.a.l(arrayList.size(), "Number of arguments equal to ", " to build a footer is not supported"));
            }
            i = R$string.plan_footnote_agreement_quadruple_link;
        }
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(i, listL, null, 12);
        return z3 ? new TextLocalisedClause(R$string.family_plans_terms_with_cancellation_fees_list_variation, v.k(new TextLocalisedClause(R$string.family_plans_terms_early_cancellation_fees, null, new Click(28, (Integer) null, (Object) cVar, "terms_early_cancellation_fees_id", false), 10), textLocalisedClause2), null, 12) : new TextLocalisedClause(R$string.family_plans_terms_single_list_variation, u.c(textLocalisedClause2), null, 12);
    }
}
