package o8d;

import ip0.nb0;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    public h(e8d.b needMoreHelpSectionItemsProvider) {
        Intrinsics.checkNotNullParameter(needMoreHelpSectionItemsProvider, "needMoreHelpSectionItemsProvider");
    }

    public static List a() {
        List listC = u.c(nb0.b(pb0.Companion, "LOADING_BUTTONS_LIST_ID", false, 0, false, 30));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }
}
