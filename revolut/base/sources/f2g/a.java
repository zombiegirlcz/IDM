package f2g;

import aw0.d0;
import aw0.y4;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    @NotNull
    public static final C0770a Companion = new C0770a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f131782a = new d0(LDSFile.EF_DG13_TAG, 140);

    /* JADX INFO: renamed from: f2g.a$a, reason: collision with other inner class name */
    public static final class C0770a {
        private C0770a() {
        }
    }

    public static hg a(ArrayList arrayList) {
        hg hgVar = new hg("TOP_ATTRACTIONS_ITEM_SCROLLER_ID", arrayList, 3, new y4(f131782a), null, new gg.c(0), true, false, null, null, 0, 0, 0, 0, 32656);
        int i = R$attr.uikit_dp0;
        yp0.b.r(hgVar, 0, 0, i, i, 3);
        return hgVar;
    }
}
