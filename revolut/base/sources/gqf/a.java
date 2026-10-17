package gqf;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.payments.core.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements p {

    @NotNull
    public static final C0841a Companion = new C0841a();

    /* JADX INFO: renamed from: gqf.a$a, reason: collision with other inner class name */
    public static final class C0841a {
        private C0841a() {
        }
    }

    public static SelectableDelegate.Model b(RowDelegate.Model model, boolean z) {
        return new SelectableDelegate.Model(model.f53228a, model, z ? qd0.SELECTED : qd0.UNSELECTED, null, vd0.RADIO, false, null, null, null, false, 32744);
    }

    @Override // jki.p
    public final m a(i iVar) {
        String str;
        c domainState = (c) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        krf.c cVar = domainState.d;
        SelectableDelegate.Model modelB = null;
        krf.e eVar = cVar instanceof krf.e ? (krf.e) cVar : null;
        ArrayList<krf.e> arrayList = domainState.f145712a;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (krf.e eVar2 : arrayList) {
            arrayList2.add(b(new RowDelegate.Model(eVar2.f188861a, null, new TextClause(eVar2.f188862b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, eVar2, null, 0, 0, 0, 0, 532676602), Intrinsics.f(eVar2.f188861a, eVar != null ? eVar.f188861a : null)));
        }
        if (domainState.f145713b) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_core_reason_for_transfer_reason_custom_name, null, null, 14);
            boolean z = cVar instanceof krf.d;
            krf.d dVar = z ? (krf.d) cVar : null;
            if (dVar == null || (str = dVar.f188860a) == null) {
                str = "";
            }
            modelB = b(new RowDelegate.Model("CUSTOM_REASON_ID", null, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new krf.d(str), null, 0, 0, 0, 0, 532676602), z);
        }
        return new g(i2b.a.p(arrayList2, modelB));
    }
}
