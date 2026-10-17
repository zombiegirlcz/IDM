package yc0;

import aw0.o9;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backend_flow.domain.models.InfoListItemSubitem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements r {

    @NotNull
    private static final s Companion = new s();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f312433a;

    public u(e iconMapper, p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(iconMapper, "iconMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f312433a = iconMapper;
    }

    public static CompositeClause b(InfoListItemSubitem.Link link) {
        ImageClause imageClause = new ImageClause(R$drawable.uikit_icn_16_link_external, Integer.valueOf(R$attr.uikit_colorAccent), (Float) null, (Float) null, 28);
        String str = link.f63506a;
        if (str == null) {
            str = link.d;
        }
        List listK = zhm.v.k(imageClause, new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new Click(12, Integer.valueOf(R$attr.uikit_colorAccent), (Object) link, "CLICK_ID", false), null, 8);
    }

    public static List c(ArrayList arrayList, xl2.m mVar) {
        if (t.f312432a[mVar.ordinal()] == 1) {
            yp0.b.k(arrayList, R$attr.uikit_dp0, 0, 0, 0, 30);
            return arrayList;
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0287  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(java.util.List r61, xl2.m r62, com.revolut.feature.backend_flow.domain.models.InfoListItem.LinkStyle r63) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yc0.u.a(java.util.List, xl2.m, com.revolut.feature.backend_flow.domain.models.InfoListItem$LinkStyle):java.util.ArrayList");
    }
}
