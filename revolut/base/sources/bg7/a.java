package bg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import go.g;
import ip0.mn0;
import java.util.List;
import jf7.l1;
import jf7.r;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rim.d;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0096a Companion = new C0096a();

    /* JADX INFO: renamed from: bg7.a$a, reason: collision with other inner class name */
    public static final class C0096a {
        private C0096a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        r block = (r) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        int i = R$attr.uikit_colorLightBlue;
        mn0 mn0Var = new mn0(i, i);
        TextClause textClause = new TextClause(block.f173703a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(block.f173705c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        String str = block.d;
        VaultsProgressDelegate.Model model = new VaultsProgressDelegate.Model("CASHBACK_LIST_ID", textClause, null, null, textClause2, str != null ? new TextClause(str, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124) : null, null, null, false, d.b(block.f173704b * ((double) 100)), mn0Var, false, null, null, 8367964);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(u.c(model), 2);
    }
}
