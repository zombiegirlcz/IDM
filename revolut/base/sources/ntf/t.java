package ntf;

import aw0.o9;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class t implements cli.n {

    @NotNull
    public static final s Companion = new s();

    public t(isf.c selectionMapper) {
        Intrinsics.checkNotNullParameter(selectionMapper, "selectionMapper");
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        g domainState = (g) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f219022c;
        Set set = domainState.d;
        TransferReasonCategory transferReasonCategory = domainState.f219020a;
        ArrayList arrayListA = isf.c.a(list, set, transferReasonCategory.e);
        boolean zIsEmpty = arrayListA.isEmpty();
        List listC = arrayListA;
        if (zIsEmpty) {
            listC = u.c(new FullScreenStateDelegate.Model("CLEAR_SEARCH_ID", new TextLocalisedClause(R$string.transfer_reasons_common_empty_search_title, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_common_empty_search_subtitle, u.c(domainState.e), null, 12), new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30)), new l6(12, new TextLocalisedClause(R$string.transfer_reasons_common_empty_search_clear_search, null, null, 14), null, h4.ACCENT), null, false, null, null, null, YearClass.CLASS_2016));
        }
        List list2 = listC;
        yp0.b.k(list2, 0, 0, 0, 0, 31);
        boolean z = !set.isEmpty();
        boolean z3 = domainState.f;
        String str = transferReasonCategory.f92437c;
        TextClause textClause = str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null;
        List listK = v.k(new TextLocalisedClause(R$string.transfer_reasons_common_header_description_choose, null, null, 14), new TextLocalisedClause(R$string.transfer_reasons_common_header_description_get_help, null, new Click(30, (Integer) null, (Object) null, "GET_HELP_ID", false), 10));
        m70.a.t(t0.f186434a);
        return new n(list2, z, z3, new h(textClause, new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12)));
    }
}
