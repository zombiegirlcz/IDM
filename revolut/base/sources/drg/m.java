package drg;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.vaults.R$string;
import ip0.pb0;
import ip0.zj;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import zhm.a0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements p {
    public static List b() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_STATE_LIST_ITEM_ID", new TextLocalisedClause(R$string.vaults_common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.vaults_document_reacceptance_error_state_description, null, null, 14), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.vaults_common_error_state_retry_button_title, null, null, 14), false, null, null, false, 0, 0, 31680);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, 5, 1);
        ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
        vim.f it8 = intRange.iterator();
        while (it8.f289625c) {
            arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it8.nextInt())));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        a0.x(arrayList2, arrayList);
        return arrayList;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (g) iii.c.f(domainState.f117122a, new dmj.a(this, 28), new dmb.m(this, 21), new dbg.b(this, domainState, 8));
    }
}
