package ni1;

import cli.n;
import cli.o;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.data.model.Data;
import ip0.i10;
import ip0.k10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nhg.f0;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1.l f215634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f215635b;

    public l(sh1.l strings, xi1.a searchScreenItemsProvider) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(searchScreenItemsProvider, "searchScreenItemsProvider");
        this.f215634a = strings;
        this.f215635b = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D086", null, null, null, 30);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        List listC;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f215624b;
        sh1.l lVar = this.f215634a;
        if (data != null) {
            listC = (List) iii.c.f(data, new f0(this, 6), new n8i.e(this, 25), new mgh.i(this, 18));
        } else {
            listC = u.c(new k10("EMPTY_ITEM_ID", this.f215635b, new i10(lVar.f263377b.f263373c)));
        }
        List list = listC;
        yp0.b.k(list, 0, 0, 0, 0, 31);
        return new h(lVar.f263377b.f263372b, list);
    }
}
