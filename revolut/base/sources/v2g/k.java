package v2g;

import aw0.o9;
import aw0.v1;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import uk2.w;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f285742a;

    public k(l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f285742a = dateProvider;
    }

    public static List a() {
        FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("ERROR_ITEM_ID", new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R.string.common_action_retry, null, null, 14), false, null, null, false, 0, 0, 32708);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return u.c(model);
    }

    public static u8 b(hxf.a aVar) {
        String str = aVar.f156582a;
        TextClause textClause = new TextClause(aVar.f156583b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        hxf.b bVar = aVar.i;
        String str2 = bVar != null ? bVar.d : null;
        Object[] elements = {str2 != null ? new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, str2 != null ? new DotDividerClause((Integer) null) : null, new TimeClause(oc.c.F(aVar.e), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        u8 u8Var = new u8(str, textClause, new CompositeClause(kotlin.collections.d.L(elements), null, null, null, 14), null, new UrlImage(aVar.f156584c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286), null, null, null, v1.DARK, null, false, false, false, aVar, 65000);
        yp0.b.l(u8Var, 0, 0, 0, 0, null, false, 63);
        return u8Var;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f285734a, new i(this, 0), new v25.g(this, 12), new w(this, 18)));
    }
}
