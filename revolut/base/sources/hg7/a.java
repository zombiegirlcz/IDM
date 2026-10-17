package hg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.media.models.UrlMedia;
import com.revolut.core.ui_kit_resources.R$attr;
import go.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf7.l1;
import jf7.s0;
import jf7.t0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import uf7.u;
import xf7.b;
import zhm.f0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0873a Companion = new C0873a();

    /* JADX INFO: renamed from: hg7.a$a, reason: collision with other inner class name */
    public static final class C0873a {
        private C0873a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [zhm.f0] */
    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        Object arrayList;
        t0 block = (t0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        List list = block.f173713b;
        boolean z = block.f173712a;
        if (list.isEmpty()) {
            arrayList = f0.f322471a;
        } else {
            List list2 = list;
            ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (true) {
                int i = 0;
                u uVar = null;
                if (it8.hasNext()) {
                    s0 s0Var = (s0) it8.next();
                    boolean z3 = z && s0Var.d != null;
                    String strQ = j6.a.q("SUGGESTIONS_ITEM_", s0Var.f173707a);
                    ec ecVar = new ec(new UrlMedia(s0Var.f173709c));
                    TextClause textClause = new TextClause(s0Var.f173707a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                    String str = s0Var.f173708b;
                    TextClause textClause2 = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
                    if (z3) {
                        String str2 = s0Var.d;
                        if (str2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        uVar = new u(str2);
                    }
                    arrayList2.add(new ProductSelectionDelegate.Model(strQ, ecVar, textClause, textClause2, null, uVar, null, z3, z3, false, 592));
                } else if (z) {
                    arrayList = new ArrayList(w.t(arrayList2, 10));
                    for (Object obj2 : arrayList2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        ProductSelectionDelegate.Model model = (ProductSelectionDelegate.Model) obj2;
                        yp0.b.l(model, i == 0 ? R$attr.uikit_dp8 : R$attr.uikit_dp4, i == arrayList2.size() - 1 ? R$attr.uikit_dp8 : R$attr.uikit_dp4, 0, 0, null, false, 60);
                        arrayList.add(model);
                        i = i2;
                    }
                } else {
                    yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                    arrayList = arrayList2;
                }
            }
        }
        return new g(arrayList, 2);
    }
}
