package q22;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.ka;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmNewContactNavigation$Tab;
import java.io.Serializable;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmNewContactNavigation$InputData f241497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final utk.f f241498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f241499c;

    public o(ApmNewContactNavigation$InputData inputData, utk.f validator) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(validator, "validator");
        this.f241497a = inputData;
        this.f241498b = validator;
        this.f241499c = yhm.j.b(new pyc.a(this, 9));
    }

    public static InputTextDelegate.Model a(String str) {
        InputTextDelegate.Model model = new InputTextDelegate.Model("ID_ITEM_NAME", !d0.W(str) ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, new TextLocalisedClause(R$string.apm_new_contact_field_name_required_hint, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    public static RowDelegate.Model b(boolean z) {
        RowDelegate.Model model = new RowDelegate.Model("ID_ITEM_SAVE_PHONEBOOK", null, new TextLocalisedClause(R$string.apm_new_contact_field_save_phonebook_hint, null, null, 14), null, 0, null, null, null, 0, new vf(z, true), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869882);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return model;
    }

    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        String str;
        String str2;
        FixedTabsDelegate.Model model;
        List listL;
        boolean z;
        String str3;
        int i;
        ?? r4;
        String str4;
        TextClause textClause;
        boolean zA;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ApmNewContactNavigation$Tab apmNewContactNavigation$Tab = domainState.f241483a;
        String str5 = domainState.f;
        String str6 = domainState.e;
        boolean z3 = domainState.f241487h;
        wi0.b bVar = domainState.f241484b;
        String str7 = domainState.f241486g;
        if (apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.PHONE) {
            FixedTabsDelegate.Model modelD = d(apmNewContactNavigation$Tab);
            String str8 = domainState.d;
            fj0.a aVar = fj0.b.Companion;
            String str9 = domainState.f241485c;
            aVar.getClass();
            Serializable serializableB = fj0.a.b(str9);
            yhm.o.b(serializableB);
            ka kaVar = new ka("ID_ITEM_PHONE", str8, new Pair(serializableB, bVar), null, null, new TextLocalisedClause(R$string.apm_new_contact_field_phone_number_hint, null, null, 14), false, true, 7864);
            int i2 = R$attr.uikit_dp0;
            yp0.b.l(kaVar, 0, 0, i2, i2, null, false, 51);
            qv0.i[] elements = {modelD, kaVar, a(str7), b(z3)};
            Intrinsics.checkNotNullParameter(elements, "elements");
            listL = kotlin.collections.d.L(elements);
            str = str6;
            str2 = str7;
        } else if (apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.EMAIL) {
            FixedTabsDelegate.Model modelD2 = d(apmNewContactNavigation$Tab);
            if (d0.W(str6)) {
                z = z3;
                str3 = str5;
                i = 14;
                r4 = 0;
                str4 = "elements";
                textClause = null;
            } else {
                z = z3;
                r4 = 0;
                str4 = "elements";
                str3 = str5;
                i = 14;
                textClause = new TextClause(str6, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            str = str6;
            InputTextDelegate.Model model2 = new InputTextDelegate.Model("ID_ITEM_EMAIL", textClause, new TextLocalisedClause(R$string.apm_new_contact_field_email_hint, r4, r4, i), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536870920, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            Object[] objArr = {modelD2, model2, a(str7), b(z)};
            Intrinsics.checkNotNullParameter(objArr, str4);
            listL = kotlin.collections.d.L(objArr);
            str2 = str7;
            str5 = str3;
        } else {
            str = str6;
            TextClause textClause2 = null;
            if (!(apmNewContactNavigation$Tab instanceof ApmNewContactNavigation$Tab.TAX)) {
                throw new NoWhenBranchMatchedException();
            }
            FixedTabsDelegate.Model modelD3 = d(apmNewContactNavigation$Tab);
            ApmNewContactNavigation$Tab.TAX tax = (ApmNewContactNavigation$Tab.TAX) apmNewContactNavigation$Tab;
            if (d0.W(str5)) {
                str2 = str7;
                model = modelD3;
                str5 = str5;
            } else {
                str2 = str7;
                model = modelD3;
                str5 = str5;
                textClause2 = new TextClause(str5, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
            InputTextDelegate.Model model3 = new InputTextDelegate.Model("ID_ITEM_TAX", textClause2, tax.f62255c, null, false, null, false, tax.d, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, true, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -536871048, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model3, 0, 0, 0, 0, null, false, 63);
            Object[] elements2 = {model, model3, a(str2)};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            listL = kotlin.collections.d.L(elements2);
        }
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        boolean zW = d0.W(str2);
        ApmNewContactNavigation$Tab apmNewContactNavigation$Tab2 = domainState.f241483a;
        boolean z4 = apmNewContactNavigation$Tab2 instanceof ApmNewContactNavigation$Tab.PHONE;
        utk.f fVar = this.f241498b;
        if (z4) {
            zA = ((z80.b) fVar.f283122b).k(domainState.d, bVar.f297794a);
        } else if (apmNewContactNavigation$Tab2 instanceof ApmNewContactNavigation$Tab.EMAIL) {
            zA = ((zzl.c) ((zzl.b) fVar.f283123c)).a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str);
        } else {
            if (!(apmNewContactNavigation$Tab2 instanceof ApmNewContactNavigation$Tab.TAX)) {
                throw new NoWhenBranchMatchedException();
            }
            zA = ((c12.f) fVar.f283121a).A(str5);
        }
        return new b(listL, !zW && zA);
    }

    public final FixedTabsDelegate.Model d(ApmNewContactNavigation$Tab apmNewContactNavigation$Tab) {
        Lazy lazy = this.f241499c;
        if (((List) lazy.getValue()).isEmpty()) {
            return null;
        }
        List list = (List) lazy.getValue();
        String str = apmNewContactNavigation$Tab.f62251a;
        int i = R$attr.uikit_dp0;
        int i2 = R$attr.uikit_dp24;
        FixedTabsDelegate.Model model = new FixedTabsDelegate.Model("ID_ITEM_TABS", list, str, null, null, i2, i2, i, i, 24);
        yp0.b.r(model, 0, 0, 0, 0, 15);
        return model;
    }
}
