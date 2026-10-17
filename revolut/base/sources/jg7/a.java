package jg7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.i;
import com.revolut.core.ui_kit.delegates.j;
import com.revolut.core.ui_kit.delegates.m;
import com.revolut.core.ui_kit.delegates.q;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import go.g;
import java.util.List;
import jf7.a1;
import jf7.d1;
import jf7.l1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import uf7.u;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements xf7.b {

    @NotNull
    public static final C0988a Companion = new C0988a();

    /* JADX INFO: renamed from: jg7.a$a, reason: collision with other inner class name */
    public static final class C0988a {
        private C0988a() {
        }
    }

    @Override // xf7.b
    public final Flow a(l1 l1Var) {
        ActionWidgetDelegate.Model.a iVar;
        d1 block = (d1) l1Var;
        Intrinsics.checkNotNullParameter(block, "block");
        TextClause textClause = new TextClause(block.f173662a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TextClause textClause2 = new TextClause(block.f173663b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        m mVar = new m(new UrlImage(block.f173664c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), (LayeredImage) null, (ProgressStyle) null, 6);
        q qVar = q.REGULAR;
        a1 a1Var = block.d;
        int i = b.f173934a[a1Var.f173656a.ordinal()];
        if (i == 1) {
            iVar = new i(14, new TextClause(a1Var.f173657b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, false);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iVar = new j(new TextClause(a1Var.f173657b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 14);
        }
        ActionWidgetDelegate.Model model = new ActionWidgetDelegate.Model("TO_DO_LIST_ID", textClause, textClause2, mVar, null, iVar, qVar, new u(a1Var.f173658c), null, false, 7952);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new g(zhm.u.c(model), 2);
    }
}
