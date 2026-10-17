package ohb;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.q2;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.email_payroll.domain.model.Contact;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        ohb.a domainState = (ohb.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        aim.e eVarB = u.b();
        int i = 0;
        for (Object obj2 : domainState.f225333a) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            Contact contact = (Contact) obj2;
            CellDetailsNoteDelegate.Companion companion = CellDetailsNoteDelegate.INSTANCE;
            CellDetailsNoteDelegate.Model model = new CellDetailsNoteDelegate.Model(a0.d.n("LIST_ID_EMPLOYER_DETAILS_", i), new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_employer_details_title, null, null, 14), null, null, null, false, null, null, null, null, null, 0, 131060);
            aim.e eVarB2 = u.b();
            String str = contact.f83030b;
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                eVarB2.add(new CellDetailsStandaloneNoteDelegate.Model(j6.a.l(i, "LIST_ID_EMPLOYER_DETAILS_", "_name"), null, new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, 0, 0, 2042));
            }
            eVarB2.add(new CellDetailsStandaloneNoteDelegate.Model(j6.a.l(i, "LIST_ID_EMPLOYER_DETAILS_", "_email"), null, new TextClause(contact.f83029a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, false, null, 0, 0, 2042));
            Unit unit = Unit.f186387a;
            aim.e eVarA = u.a(eVarB2);
            companion.getClass();
            ArrayList arrayListA = CellDetailsNoteDelegate.Companion.a(model, eVarA);
            yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
            eVarB.addAll(arrayListA);
            i = i2;
        }
        CellDetailsNoteDelegate.Companion companion2 = CellDetailsNoteDelegate.INSTANCE;
        CellDetailsNoteDelegate.Model model2 = new CellDetailsNoteDelegate.Model("LIST_ID_ASSISTANT", new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_assistant_title, null, null, 14), null, new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_assistant_email, null, null, 14), null, false, new ResourceImage(R$drawable.uikit_icn_24_pencil_spark, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, q2.f54617a, null, null, 0, 130420);
        List listC = u.c(new CellDetailsStandaloneNoteDelegate.Model("LIST_ID_ASSISTANT_description", null, new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_assistant_description, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground_70), false, null, false, null, 254), 10), null, null, false, null, 0, 0, 2042));
        companion2.getClass();
        ArrayList arrayListA2 = CellDetailsNoteDelegate.Companion.a(model2, listC);
        yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
        eVarB.addAll(arrayListA2);
        return new d(u.a(eVarB), new c7(new TextLocalisedClause(R$string.salary_switch_assistant_request_summary_disclaimer, null, null, 14), false, null, 6));
    }
}
