package yr4;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.nb0;
import ip0.pb0;
import ip0.s7;
import ip0.v7;
import ip0.w40;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    @NotNull
    private static final C1763a Companion = new C1763a();

    /* JADX INFO: renamed from: yr4.a$a, reason: collision with other inner class name */
    public static final class C1763a {
        private C1763a() {
        }
    }

    public static aim.e a() {
        aim.e eVarB = u.b();
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        int i2 = 0;
        while (i2 < 2) {
            i2++;
            arrayList.add(new w40(a0.d.n("id_instalment_details_progress_loading_item_", i2)));
        }
        eVarB.addAll(b("progress", arrayList));
        eVarB.addAll(b("transaction", u.c(nb0.b(pb0.Companion, "id_instalment_details_transaction_loading_item", false, 0, false, 30))));
        ArrayList arrayList2 = new ArrayList(4);
        while (i < 4) {
            i++;
            arrayList2.add(new s7(a0.d.n("id_instalment_details_details_loading_item_", i), 0, 0, 0, 0, false, null, 126));
        }
        eVarB.addAll(b("details", arrayList2));
        return u.a(eVarB);
    }

    public static aim.e b(String str, List list) {
        aim.e eVarB = u.b();
        v7.C(p.a.p("id_instalment_details_", str, "_loading_header"), R$attr.uikit_dp16, R$attr.uikit_dp8, 24, eVarB);
        eVarB.addAll(list);
        aim.e eVarA = u.a(eVarB);
        yp0.b.k(eVarA, 0, 0, 0, 0, 31);
        return eVarA;
    }
}
