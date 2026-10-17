package mhb;

import android.os.Parcelable;
import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.retail.salary_account.impl.R$string;
import ip0.lr;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import mhb.a;
import mx0.c7;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzl.c f205479a;

    public j(zzl.c regexMatcher) {
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        this.f205479a = regexMatcher;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        boolean z;
        int i;
        a.C1165a c1165a;
        boolean z3;
        List list;
        boolean z4;
        a domainState = (a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list2 = domainState.f205470a;
        aim.e eVarB = u.b();
        boolean z6 = list2.size() > 1;
        List list3 = list2;
        Iterator it8 = list3.iterator();
        int i2 = 0;
        while (true) {
            boolean zHasNext = it8.hasNext();
            zzl.c cVar = this.f205479a;
            if (!zHasNext) {
                List list4 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    z = true;
                } else {
                    Iterator it9 = list3.iterator();
                    while (it9.hasNext()) {
                        if (!cVar.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", ((a.C1165a) it9.next()).f205471a)) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                }
                if (list4.size() < 3 && z) {
                    eVarB.add(new TextDelegate.Model(0, 0, 1020, new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_contact_add_another, null, new Click(30, (Integer) null, (Object) null, "LIST_ID_ADD_CONTACT", false), 10), "LIST_ID_ADD_CONTACT"));
                }
                aim.e eVarA = u.a(eVarB);
                c7 c7Var = new c7(new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_disclaimer, null, null, 14), false, null, 6);
                Iterable iterableK1 = d0.k1(domainState.f205470a);
                if ((iterableK1 instanceof Collection) && ((Collection) iterableK1).isEmpty()) {
                    z3 = true;
                    break;
                }
                Iterator it10 = iterableK1.iterator();
                do {
                    kotlin.jvm.internal.d dVar = (kotlin.jvm.internal.d) it10;
                    if (!((Iterator) dVar.f186416c).hasNext()) {
                        z3 = true;
                        break;
                    }
                    IndexedValue indexedValue = (IndexedValue) dVar.next();
                    i = indexedValue.f186391a;
                    c1165a = (a.C1165a) indexedValue.f186392b;
                } while (i == 0 ? cVar.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", c1165a.f205471a) : (c1165a.f205471a.length() == 0 && c1165a.f205472b.length() == 0) || cVar.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", c1165a.f205471a));
                z3 = false;
                return new d(eVarA, c7Var, z3);
            }
            Object next = it8.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            a.C1165a c1165a2 = (a.C1165a) next;
            if (z6) {
                list = list2;
                z4 = z6;
                eVarB.add(new ListSubheaderDelegate.Model(a0.d.n("LIST_ID_CONTACT_FORM_", i3), (Image) null, (Clause) new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_contact_title, u.c(Integer.valueOf(i3)), null, 12), (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530));
            } else {
                list = list2;
                z4 = z6;
            }
            String str = c1165a2.f205471a;
            Companion.getClass();
            InputTextDelegate.Model model = new InputTextDelegate.Model("FIELD_TYPE_EMAIL_" + i2, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_contact_email_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, str.length() > 0 && !cVar.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", str), false, false, false, new lr(33), 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2228232, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model);
            InputTextDelegate.Model model2 = new InputTextDelegate.Model(a0.d.n("FIELD_TYPE_NAME_", i2), new TextClause(c1165a2.f205472b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextLocalisedClause(R$string.salary_switch_assistant_payroll_manager_input_contact_name_placeholder, null, null, 14), null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, new lr(8193), 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -2097160, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
            eVarB.add(model2);
            i2 = i3;
            list2 = list;
            z6 = z4;
        }
    }
}
