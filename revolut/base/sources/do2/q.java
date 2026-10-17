package do2;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.BankAccountSwitchingFormScreenContract$InputData;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormFieldValue;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormState;
import d27.g0;
import dmj.e0;
import fo2.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.a0;
import zhm.f0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends oki.h implements i {

    @NotNull
    public static final l Companion = new l();
    public final BankAccountSwitchingFormScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fo2.j f116390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f116391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final fo2.g f116392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f116393s;

    public q(cli.n stateMapper, BankAccountSwitchingFormScreenContract$InputData inputData, fo2.j formInteractor, l80.e dateProvider, fo2.g formFieldValidator) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(formInteractor, "formInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(formFieldValidator, "formFieldValidator");
        this.o = inputData;
        this.f116390p = formInteractor;
        this.f116391q = dateProvider;
        this.f116392r = formFieldValidator;
        Data data = new Data(null, null, true, 3, null);
        Map mapG = r0.g();
        m70.a.c(t0.f186434a);
        this.f116393s = mra.d.b(this, new g(data, new FormState(mapG, ""), f0.f322471a), stateMapper, null, false, 12);
    }

    public static TextLocalisedClause L2(wn2.c cVar) {
        String str = cVar.f298708a;
        List list = cVar.f298709b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new TextClause((String) it8.next(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
        return new TextLocalisedClause(str, (List) arrayList, (Clause) null, false, 28);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.q(this.f116393s.B(new e0(this, 3))), null, null, new d8j.c(this, continuation, 29), 3);
        l2(new n(this, continuation, 0), new yi5.b(26));
    }

    public final List I2() {
        y yVar = this.f116393s;
        fo2.a aVar = (fo2.a) ((g) ((j2) yVar.f22677a).getValue()).f116374a.getContent();
        if (aVar == null) {
            return f0.f322471a;
        }
        for (fo2.l lVar : aVar.f136780a) {
            if (Intrinsics.f(lVar.f136789a, ((g) ((j2) yVar.f22677a).getValue()).f116375b.f63924b)) {
                ArrayList arrayList = lVar.f136791c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    a0.x(((fo2.k) it8.next()).f136788b, arrayList2);
                }
                return arrayList2;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final fo2.b J2(String str) {
        Object next;
        Iterator it8 = I2().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((fo2.b) next).c(), str)) {
                break;
            }
        }
        return (fo2.b) next;
    }

    public final void K2(String listId, String newValue, String str) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        String strE0 = d0.e0(listId, "ID_FORM_FIELD_");
        Object objJ2 = J2(strE0);
        s sVar = objJ2 instanceof s ? (s) objJ2 : null;
        if (str == null) {
            if ((sVar != null ? sVar.a() : null) != null) {
                return;
            }
        }
        if (str == null) {
            str = newValue;
        }
        H2(this.f116393s, new g0(this, 20, strE0, new FormFieldValue.TextField(newValue, str)));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f116393s;
    }
}
