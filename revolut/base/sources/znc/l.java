package znc;

import cli.o;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ymk.y;
import zhm.f0;
import zk1.p;
import zmj.p0;
import zul.l0;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323699a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f323700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f323701c;

    public l(azb.h itemsMapper, azb.f headerMapper, azb.e footerMapper) {
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(footerMapper, "footerMapper");
        this.f323700b = itemsMapper;
        this.f323701c = footerMapper;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        Data data;
        List list;
        switch (this.f323699a) {
            case 0:
                d domainState = (d) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                Data data2 = domainState.f323690a;
                if (data2 != null) {
                    try {
                        Object content = data2.getContent();
                        data = new Data(content != null ? (glc.j) ((glc.b) this.f323701c).invoke((glc.i) content) : null, data2.getError(), data2.getLoading());
                    } catch (Throwable th10) {
                        data = new Data(null, th10, data2.getLoading());
                    }
                    break;
                } else {
                    data = null;
                }
                g gVar = data != null ? (g) iii.c.f(data, new zmb.c(17), new p(29), new p0(1)) : null;
                k kVar = (k) this.f323700b;
                if (data == null || (list = (List) iii.c.f(data, new zmb.c(kVar, 18), new j(0), new y(kVar, 20))) == null) {
                    list = f0.f322471a;
                }
                return new h(gVar, list);
            default:
                zyb.d domainState2 = (zyb.d) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (cii.b) iii.c.f(domainState2.f326401a, new l0(this, 17), new zs4.d(this, 19), new zx6.p(this));
        }
    }

    public l(i buildHeader, k buildPage, glc.b roboTransactionDetailsMapper) {
        Intrinsics.checkNotNullParameter(buildHeader, "buildHeader");
        Intrinsics.checkNotNullParameter(buildPage, "buildPage");
        Intrinsics.checkNotNullParameter(roboTransactionDetailsMapper, "roboTransactionDetailsMapper");
        this.f323700b = buildPage;
        this.f323701c = roboTransactionDetailsMapper;
    }
}
