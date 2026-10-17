package xlj;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import wp4.j0;
import xlb.l;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whf.n f307028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f307029b;

    public i(whf.n transactionItemsMapper) {
        Intrinsics.checkNotNullParameter(transactionItemsMapper, "transactionItemsMapper");
        this.f307028a = transactionItemsMapper;
        this.f307029b = w.y0(new xkf.c(17));
    }

    public static final ArrayList a(String str) {
        List listC = u.c(new gu(str.concat("_1"), 0, 0, 30));
        List listC2 = u.c(nb0.b(pb0.Companion, str.concat("_2"), false, 0, false, 30));
        yp0.b.k(listC2, R$attr.uikit_dp0, R$attr.uikit_dp24, 0, 0, 28);
        return d0.E0(listC2, listC);
    }

    @Override // cli.n
    public final o c(j jVar) {
        d domainState = (d) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new f((List) iii.c.f(domainState.f307022a, new h(this, 0), new l(2), new j0(this, 28)));
    }
}
