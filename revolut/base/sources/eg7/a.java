package eg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import go.g;
import ip0.mn0;
import java.util.List;
import jf7.e0;
import jf7.l1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import rim.d;
import xf7.b;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements b {

    @NotNull
    public static final C0730a Companion = new C0730a();

    /* JADX INFO: renamed from: eg7.a$a, reason: collision with other inner class name */
    public static final class C0730a {
        private C0730a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        e0 block = (e0) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        String strQ = j6.a.q("CELL_DETAILS_PROGRESS_ITEM_ID_", block.f173667a);
        TextClause textClause = new TextClause(block.f173667a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124);
        TextClause textClause2 = new TextClause(block.f173668b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        int iB = d.b(block.f173669c * ((double) 100));
        int i = R$attr.uikit_colorLightBlue;
        return new g(u.c(new VaultsProgressDelegate.Model(strQ, textClause, null, null, textClause2, null, null, null, true, iB, new mn0(i, i), false, null, null, 8366044)), 2);
    }
}
