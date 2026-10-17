package ig7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.t4;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import go.g;
import java.util.List;
import jf7.l1;
import jf7.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import uf7.r;
import xf7.b;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0919a Companion = new C0919a();

    /* JADX INFO: renamed from: ig7.a$a, reason: collision with other inner class name */
    public static final class C0919a {
        private C0919a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        Clause textClause;
        w0 block = (w0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        String str = block.d;
        boolean z = str != null;
        String str2 = block.f173716a;
        Float fValueOf = Float.valueOf(16.0f);
        if (z) {
            List listK = v.k(new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_24_info_outline, Integer.valueOf(R$attr.uikit_colorGreyTone50), fValueOf, fValueOf, 16));
            m70.a.t(t0.f186434a);
            textClause = new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
        } else {
            textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        t4 t4Var = new t4(new TextClause(block.f173717b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        String str3 = block.f173718c;
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("TEXT_VALUE_LIST_ID", textClause, t4Var, str3 != null ? new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, z, str != null ? new r(str) : null, null, 0, 0, 0, 0, 1984);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(model), 2);
    }
}
