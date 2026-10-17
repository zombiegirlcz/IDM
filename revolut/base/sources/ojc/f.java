package ojc;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.rewards.impl.R$string;
import ip0.qd0;
import ip0.vd0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f225757a;

    public f(d paymentRowMapper) {
        Intrinsics.checkNotNullParameter(paymentRowMapper, "paymentRowMapper");
        this.f225757a = paymentRowMapper;
    }

    public final List a(String str, TextLocalisedClause textLocalisedClause, ArrayList arrayList, Set set, p pVar) {
        if (arrayList.isEmpty()) {
            return f0.f322471a;
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            p pVar2 = (p) it8.next();
            ibd.e eVar = pVar2.f249314a;
            boolean zContains = set.contains(eVar.f160150a);
            boolean z = Intrinsics.f(pVar != null ? pVar.f249314a.f160150a : null, eVar.f160150a) && !zContains;
            RowDelegate.Model modelA = this.f225757a.a(pVar2, true);
            if (zContains) {
                modelA = RowDelegate.Model.x(modelA, null, null, null, new TextLocalisedClause(R$string.rent_and_bills_select_payment_cell_subtitle_linked, null, null, 14), null, 0, null, false, RowDelegate.Model.b.a.f53266a, null, 0, 0, 0, 0, null, -10273, 15);
            }
            RowDelegate.Model model = modelA;
            arrayList2.add(new SelectableDelegate.Model(eVar.f160150a, model, z ? qd0.SELECTED : qd0.UNSELECTED, zContains ? new SelectableDelegate.b.a(false) : SelectableDelegate.b.C0424b.f53319a, vd0.RADIO, false, null, pVar2, null, false, 32480));
        }
        return yp0.b.g(arrayList2, new ListSubheaderDelegate.Model(str, (Image) null, (Clause) textLocalisedClause, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, 0, 0, 0, 0, 65530), null, 0, 0, 126);
    }
}
