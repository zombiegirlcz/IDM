package go2;

import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.DropdownFormField$Choice;
import go.g;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import s7a.c0;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends x7a.d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.bank_account_switching.impl.ui.form.domain.b f145077a;

    public c(com.revolut.feature.bank_account_switching.impl.ui.form.domain.b field) {
        Intrinsics.checkNotNullParameter(field, "field");
        this.f145077a = field;
    }

    @Override // x7a.d
    public final c0 c(Set ids, Object obj2) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        String str = (String) d0.c0(ids);
        Object obj3 = null;
        String strE0 = str != null ? kotlin.text.d0.e0(str, "ID_DROPDOWN_ITEM_") : null;
        Iterator it8 = this.f145077a.f63932g.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((DropdownFormField$Choice) next).f63908a, strE0)) {
                obj3 = next;
                break;
            }
        }
        DropdownFormField$Choice dropdownFormField$Choice = (DropdownFormField$Choice) obj3;
        return dropdownFormField$Choice != null ? new e(dropdownFormField$Choice) : d.f145078a;
    }

    @Override // x7a.d
    public final List d(Data data, Set selectedModelIds, List list, String query, Object obj2) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(selectedModelIds, "selectedModelIds");
        Intrinsics.checkNotNullParameter(query, "query");
        return (List) iii.c.f(data, new gn.a(7), new gcc.c(28), new a(query, this, selectedModelIds, 0));
    }

    @Override // x7a.d
    public final Flow e(String query, boolean z, Object obj2) {
        Intrinsics.checkNotNullParameter(query, "query");
        return new g(zi0.c.P(this.f145077a.f63932g, false, null, 3), 2);
    }
}
