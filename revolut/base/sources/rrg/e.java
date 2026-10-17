package rrg;

import au0.c2;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.List;
import jki.i;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = domainState.f256833a;
        int i = domainState.f256834b;
        List list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        int i2 = 0;
        for (Object obj2 : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            arrayList.add(new c2((Image) obj2, a0.d.n("IMAGE_LIST_ID", i2), false, true));
            i2 = i3;
        }
        return new c(i, arrayList, list.size() > 1 ? u.c(new TextNavBarMenuItem("IMAGE_COUNT_ID", new TextClause((i + 1) + " / " + list.size(), (Style) null, Integer.valueOf(R$attr.uikit_colorForeground), false, (o9) null, (List) null, 122), null, null, 12)) : f0.f322471a);
    }
}
